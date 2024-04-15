package pignlproc;

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
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://.wikipedia.org/wiki/hi%21" + "'", str2, "http://.wikipedia.org/wiki/hi%21");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = pignlproc.markup.AnnotatingMarkupParser.HREF_ATTR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "href" + "'", str0, "href");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.hadoop.mapreduce.Job job0 = null;
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPath(job0, path1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.hadoop.mapreduce.lib.input.FileSplit fileSplit0 = null;
        org.apache.hadoop.mapreduce.TaskAttemptContext taskAttemptContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader2 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(fileSplit0, taskAttemptContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str0 = pignlproc.markup.AnnotatingMarkupParser.WIKILINK_TITLE_ATTR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "title" + "'", str0, "title");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Set<java.lang.String> strSet0 = pignlproc.markup.AnnotatingMarkupParser.PARAGRAPH_TAGS;
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.hadoop.mapreduce.Job job0 = null;
        org.apache.hadoop.fs.Path[] pathArray1 = new org.apache.hadoop.fs.Path[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, pathArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        byte[] byteArray0 = pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader.START_TEXT_MARKER;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[60, 116, 101, 120, 116, 32, 120, 109, 108, 58, 115, 112, 97, 99, 101, 61, 34, 112, 114, 101, 115, 101, 114, 118, 101, 34, 62]");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("", "", "");
        org.apache.hadoop.fs.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = uriUriNTriplesStorer3.relToAbsPathForStoreLocation("", path5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location:  curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.hadoop.fs.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("hi!", path5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: hi! curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser1.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser1.getWikiLinkAnnotations();
        pignlproc.format.WikipediaPageInputFormat wikipediaPageInputFormat4 = new pignlproc.format.WikipediaPageInputFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList5 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) (short) 1, (java.lang.Object) annotatingMarkupParser1, (java.lang.Object) wikipediaPageInputFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str0 = pignlproc.evaluation.SentencesWithLink.ENGLISH_SENTMODEL_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "opennlp/en-sent.bin" + "'", str0, "opennlp/en-sent.bin");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.hadoop.mapreduce.JobContext jobContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.mapreduce.lib.input.FileInputFormat.getMaxSplitSize(jobContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.hadoop.mapreduce.JobContext jobContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path[] pathArray1 = org.apache.hadoop.mapreduce.lib.input.FileInputFormat.getInputPaths(jobContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("title", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job4 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("href", job4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.hadoop.mapreduce.JobContext jobContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.PathFilter pathFilter1 = org.apache.hadoop.mapreduce.lib.input.FileInputFormat.getInputPathFilter(jobContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "http://.wikipedia.org/wiki/hi%21");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("href", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple5 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job4 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("opennlp/en-sent.bin", job4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        pignlproc.format.WikipediaPageInputFormat wikipediaPageInputFormat0 = new pignlproc.format.WikipediaPageInputFormat();
        org.apache.hadoop.mapreduce.JobContext jobContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.hadoop.mapreduce.InputSplit> inputSplitList2 = wikipediaPageInputFormat0.getSplits(jobContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        info.bliki.htmlcleaner.TagNode tagNode2 = null;
        info.bliki.wiki.model.ImageFormat imageFormat3 = null;
        java.lang.Appendable appendable4 = null;
        info.bliki.wiki.model.IWikiModel iWikiModel5 = null;
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser0.imageNodeToText(tagNode2, imageFormat3, appendable4, iWikiModel5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str0 = pignlproc.markup.AnnotatingMarkupParser.WIKILINK_TARGET_ATTR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "href" + "'", str0, "href");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Set<java.lang.String> strSet0 = pignlproc.markup.AnnotatingMarkupParser.HEADING_TAGS;
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        byte[] byteArray0 = pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader.END_TITLE_MARKER;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[60, 47, 116, 105, 116, 108, 101, 62]");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) (byte) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("opennlp/en-sent.bin");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        countingAppendable4.currentPosition = '#';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable8 = countingAppendable4.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = aggregateTextBag1.exec(tuple2);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) (byte) 100, (int) (short) 0, "href", "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        info.bliki.htmlcleaner.TagNode tagNode3 = null;
        info.bliki.wiki.model.ImageFormat imageFormat4 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList8 = annotatingMarkupParser5.getHeaderAnnotations();
        java.lang.String str9 = annotatingMarkupParser5.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser10 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser10.getHeaders();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser10.getHeaders();
        java.lang.Appendable appendable13 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable14 = annotatingMarkupParser10.new CountingAppendable(appendable13);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable15 = annotatingMarkupParser5.new CountingAppendable((java.lang.Appendable) countingAppendable14);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser16 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList17 = annotatingMarkupParser16.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel19 = annotatingMarkupParser16.makeWikiModel("title");
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser0.imageNodeToText(tagNode3, imageFormat4, (java.lang.Appendable) countingAppendable14, (info.bliki.wiki.model.IWikiModel) wikiModel19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(annotationList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(annotationList17);
        org.junit.Assert.assertNotNull(wikiModel19);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.hadoop.mapreduce.Job job1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.StoreFunc.cleanupOnFailureImpl("hi!", job1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str0 = pignlproc.markup.AnnotatingMarkupParser.WIKIOBJECT_ATTR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "wikiobject" + "'", str0, "wikiobject");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable35 = countingAppendable27.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList3);
        pignlproc.evaluation.CheckAbstract checkAbstract6 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = checkAbstract6.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema7);
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi !" + "'", str5, "hi !");
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = null;
        checkAbstract0.setPigLogger(pigLogger4);
        checkAbstract0.progress();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList7 = checkAbstract0.getArgToFuncMapping();
        org.junit.Assert.assertNull(funcSpecList7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        int int5 = annotation4.end;
        java.lang.Class<?> wildcardClass6 = annotation4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("http://.wikipedia.org/wiki/hi%21\n", job6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader3.setLocation("hi !", job9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("hi !", "title", "title");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.cleanupOnFailure("hi !", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        pignlproc.evaluation.SafeTsvText safeTsvText3 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum5 = null;
        safeTsvText3.warn("opennlp/en-sent.bin", enum5);
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer10 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "title", "opennlp/en-sent.bin");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList11 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) schema2, (java.lang.Object) "opennlp/en-sent.bin", (java.lang.Object) uriStringLiteralNTriplesStorer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.pig.impl.logicalLayer.schema.Schema cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(schema2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        pignlproc.format.WikipediaPageInputFormat wikipediaPageInputFormat0 = new pignlproc.format.WikipediaPageInputFormat();
        org.apache.hadoop.mapreduce.InputSplit inputSplit1 = null;
        org.apache.hadoop.mapreduce.TaskAttemptContext taskAttemptContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.Text, org.apache.hadoop.io.Text> textRecordReader3 = wikipediaPageInputFormat0.createRecordReader(inputSplit1, taskAttemptContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter3 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter3);
        org.apache.hadoop.mapreduce.RecordWriter recordWriter5 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter5);
        org.apache.pig.data.Tuple tuple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.data.Tuple tuple1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = safeTsvText0.exec(tuple1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList3);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList6 = mergeAsOpenNLPAnnotatedText0.getArgToFuncMapping();
        org.apache.commons.logging.Log log7 = mergeAsOpenNLPAnnotatedText0.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger8 = mergeAsOpenNLPAnnotatedText0.getPigLogger();
        org.apache.pig.data.Tuple tuple9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = mergeAsOpenNLPAnnotatedText0.exec(tuple9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi !" + "'", str5, "hi !");
        org.junit.Assert.assertNull(funcSpecList6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(pigLogger8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte[] byteArray0 = pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader.START_TITLE_MARKER;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[60, 116, 105, 116, 108, 101, 62]");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.getAbsolutePath("", path1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location:  curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) 'a', false);
        org.apache.pig.data.Tuple tuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = aggregateTextBag2.exec(tuple3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("", true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("title", false);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.String str4 = concatTextBag2.exec(tuple3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.regex.Pattern pattern0 = pignlproc.markup.AnnotatingMarkupParser.INTERWIKI_PATTERN;
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "http://[\\w-]+\\.wikipedia\\.org/wiki/.*");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable12 = countingAppendable10.append((java.lang.CharSequence) "href");
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
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable37 = countingAppendable27.append((java.lang.CharSequence) "hi !", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) '#', false);
        org.apache.pig.data.Tuple tuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = aggregateTextBag2.exec(tuple3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable12 = countingAppendable10.append((java.lang.CharSequence) "opennlp/en-sent.bin");
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
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        parsingWikipediaLoader1.setUDFContextSignature("title");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple10 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        org.apache.hadoop.fs.Path path9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = parsingWikipediaLoader1.relativeToAbsolutePath("http://.wikipedia.org/wiki/hi%21", path9);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://.wikipedia.org/wiki/hi%21 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable6 = countingAppendable4.append((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        org.apache.hadoop.fs.Path path9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = parsingWikipediaLoader1.relativeToAbsolutePath("opennlp / en - sent . bin", path9);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: opennlp / en - sent . bin curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("hi!", "http://.wikipedia.org/wiki/hi%21\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21" + "'", str2, "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("opennlp/en-sent.bin");
        org.apache.pig.data.Tuple tuple2 = null;
        java.lang.String str3 = concatTextBag1.exec(tuple2);
        concatTextBag1.progress();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.InputFormat inputFormat5 = parsingWikipediaLoader1.getInputFormat();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple6 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(inputFormat5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable12 = countingAppendable10.append('4');
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
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple6 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "title", "opennlp/en-sent.bin");
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.putNext(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("title");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"title\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.cleanupOnFailure("title", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "http://.wikipedia.org/wiki/hi%21");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        java.lang.Class<?> wildcardClass3 = uriStringLiteralNTriplesLoader2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21\n", job4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple6 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "http://.wikipedia.org/wiki/hi%21\n", "http://.wikipedia.org/wiki/hi%21");
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.putNext(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.hadoop.mapreduce.JobContext jobContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.mapreduce.lib.input.FileInputFormat.getMinSplitSize(jobContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        java.lang.String str6 = annotatingMarkupParser0.parse("");
        info.bliki.htmlcleaner.TagNode tagNode7 = null;
        info.bliki.wiki.model.ImageFormat imageFormat8 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser9 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser9.getHeaders();
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser9.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList12 = annotatingMarkupParser9.getHeaderAnnotations();
        java.lang.String str13 = annotatingMarkupParser9.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser14 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser14.getHeaders();
        java.util.List<java.lang.String> strList16 = annotatingMarkupParser14.getHeaders();
        java.lang.Appendable appendable17 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable18 = annotatingMarkupParser14.new CountingAppendable(appendable17);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable19 = annotatingMarkupParser9.new CountingAppendable((java.lang.Appendable) countingAppendable18);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser20 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser20.getHeaders();
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser20.getHeaders();
        java.lang.Appendable appendable23 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable24 = annotatingMarkupParser20.new CountingAppendable(appendable23);
        countingAppendable24.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable27 = annotatingMarkupParser9.new CountingAppendable((java.lang.Appendable) countingAppendable24);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser28 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList29 = annotatingMarkupParser28.getHeaderAnnotations();
        java.lang.String str30 = annotatingMarkupParser28.getRedirect();
        pignlproc.markup.Annotation annotation35 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation40 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int41 = annotation40.end;
        int int42 = annotation40.begin;
        pignlproc.markup.Annotation[] annotationArray43 = new pignlproc.markup.Annotation[] { annotation35, annotation40 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList44 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList44, annotationArray43);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser46 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList47 = annotatingMarkupParser46.getHeaders();
        java.util.List<java.lang.String> strList48 = annotatingMarkupParser46.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList49 = annotatingMarkupParser46.getHeaderAnnotations();
        java.lang.String str50 = annotatingMarkupParser46.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser51 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList52 = annotatingMarkupParser51.getHeaders();
        java.util.List<java.lang.String> strList53 = annotatingMarkupParser51.getHeaders();
        java.lang.Appendable appendable54 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable55 = annotatingMarkupParser51.new CountingAppendable(appendable54);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable56 = annotatingMarkupParser46.new CountingAppendable((java.lang.Appendable) countingAppendable55);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser57 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList58 = annotatingMarkupParser57.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel60 = annotatingMarkupParser57.makeWikiModel("title");
        annotatingMarkupParser28.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList44, (java.lang.Appendable) countingAppendable55, (info.bliki.wiki.model.IWikiModel) wikiModel60);
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser0.imageNodeToText(tagNode7, imageFormat8, (java.lang.Appendable) countingAppendable27, (info.bliki.wiki.model.IWikiModel) wikiModel60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(annotationList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(annotationList29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(annotationArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(annotationList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(annotationList58);
        org.junit.Assert.assertNotNull(wikiModel60);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.reflect.Type type1 = safeTsvText0.getReturnType();
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = safeTsvText0.exec(tuple2);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable6 = countingAppendable4.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        uriStringLiteralNTriplesStorer1.setStoreFuncUDFContextSignature("hi !");
        org.apache.hadoop.mapreduce.Job job6 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.cleanupOnFailure("", job6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not create a Path from an empty string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        countingAppendable4.currentPosition = '#';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable8 = countingAppendable4.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("http://.wikipedia.org/wiki/hi%21\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader3 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceStatistics resourceStatistics6 = parsingWikipediaLoader3.getStatistics("hi!", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceSchema resourceSchema9 = parsingWikipediaLoader3.getSchema("hi!", job8);
        uriStringLiteralNTriplesStorer1.checkSchema(resourceSchema9);
        org.apache.pig.data.Tuple tuple11 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics6);
        org.junit.Assert.assertNotNull(resourceSchema9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter3 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("opennlp/en-sent.bin", job6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable35 = countingAppendable27.append((java.lang.CharSequence) "http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("http://.wikipedia.org/wiki/hi%21\n", job6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple8 = uriUriNTriplesLoader3.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("title");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"title\"" + "'", str1, "\"title\"");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        byte[] byteArray0 = pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader.END_TEXT_MARKER;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[60, 47, 116, 101, 120, 116, 62]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getParagraphAnnotations();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple6 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: http :%20/%20http%20:%20/%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "href");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("\"hi!\"", "\"title\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://\"title\".wikipedia.org/wiki/%22hi%21%22" + "'", str2, "http://\"title\".wikipedia.org/wiki/%22hi%21%22");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        parsingWikipediaLoader1.setUDFContextSignature("title");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple10 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.hadoop.mapreduce.Job job1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.StoreFunc.cleanupOnFailureImpl("hi!\n", job1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        java.lang.String[] strArray8 = uriStringLiteralNTriplesLoader2.getPartitionKeys("wikiobject", job7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple9 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable32 = countingAppendable30.append((java.lang.CharSequence) "http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(annotationList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable53 = countingAppendable16.append((java.lang.CharSequence) "http://\"title\".wikipedia.org/wiki/%22hi%21%22");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "http://\"title\".wikipedia.org/wiki/%22hi%21%22");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.cleanupOnFailure("wikiobject", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable12 = countingAppendable10.append((java.lang.CharSequence) "\"title\"");
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
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("hi !", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("\"title\"", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.getAbsolutePath("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", path1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://http://.wikipedia.org/wiki/hi%21?.wikipedia.org/wiki/hi%21 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        java.lang.Class<?> wildcardClass5 = inputFormat4.getClass();
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title");
        org.apache.hadoop.fs.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("", path3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location:  curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"hi!\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("\"hi!\"", job4);
        org.apache.hadoop.fs.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = uriStringLiteralNTriplesLoader2.relativeToAbsolutePath("http://.wikipedia.org/wiki/hi%21", path7);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://.wikipedia.org/wiki/hi%21 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("hi!", "\"hi!\"\n", "http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.setStoreLocation("\"hi!\"", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("opennlp / en - sent . bin", job4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple6 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple9 = uriUriNTriplesLoader3.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("http://.wikipedia.org/wiki/hi%21\n", job6);
        org.apache.hadoop.mapreduce.InputFormat inputFormat8 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job10 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader3.setLocation("\" title \"", job10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
        org.junit.Assert.assertNotNull(inputFormat8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("");
        mergeAsOpenNLPAnnotatedText1.progress();
        mergeAsOpenNLPAnnotatedText1.progress();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("href", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", "opennlp/en-sent.bin");
        org.apache.pig.ResourceSchema resourceSchema4 = null;
        uriUriNTriplesStorer3.checkSchema(resourceSchema4);
        org.apache.hadoop.fs.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = uriUriNTriplesStorer3.relToAbsPathForStoreLocation("\"title\"", path7);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"title\" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("hi !\n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "\"hi!\"\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("\" title \"", "hi!\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://hi!\n.wikipedia.org/wiki/%22_title_%22" + "'", str2, "http://hi!\n.wikipedia.org/wiki/%22_title_%22");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("");
        org.apache.hadoop.fs.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("http://.wikipedia.org/wiki/hi%21", path3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://.wikipedia.org/wiki/hi%21 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getParagraphs();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser0.getWikiLinkAnnotations();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(annotationList4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter3 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter3);
        org.apache.hadoop.fs.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("\" title \"", path6);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \" title \" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("hi!", "\"hi!\"\n", "http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.cleanupOnFailure("title", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) '4');
        java.lang.reflect.Type type2 = aggregateTextBag1.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = aggregateTextBag1.getArgToFuncMapping();
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = aggregateTextBag1.exec(tuple4);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNull(funcSpecList3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesLoader2.setLocation("title", job7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 10, false);
        org.apache.pig.data.Tuple tuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = aggregateTextBag2.exec(tuple3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"title\"\n", "\" title \"", "\"title\"");
        org.apache.hadoop.fs.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = uriUriNTriplesLoader3.relativeToAbsolutePath("", path5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location:  curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable14 = countingAppendable9.append((java.lang.CharSequence) "\" title \"", (int) (byte) 100, 1);
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.fs.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("opennlp/en-sent.bin", path4);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: opennlp/en-sent.bin curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.hadoop.mapreduce.Job job1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.StoreFunc.cleanupOnFailureImpl("\"title\"\n", job1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader4 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader4.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = parsingWikipediaLoader4.getSchema("hi!", job7);
        uriUriNTriplesStorer1.checkSchema(resourceSchema8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.setStoreLocation("hi!\n", job11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(resourceSchema8);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21" + "'", str2, "http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title");
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceSchema resourceSchema11 = uriUriNTriplesLoader3.getSchema("", job10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple12 = uriUriNTriplesLoader3.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(resourceSchema11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum2 = null;
        safeTsvText0.warn("opennlp/en-sent.bin", enum2);
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = safeTsvText0.exec(tuple4);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("hi !", "opennlp/en-sent.bin", "wikiobject");
        pignlproc.markup.Annotation annotation8 = new pignlproc.markup.Annotation(10, 10, "title", "hi !");
        java.lang.String str9 = annotation8.value;
        pignlproc.evaluation.AggregateTextBag aggregateTextBag10 = new pignlproc.evaluation.AggregateTextBag();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList11 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) uriUriNTriplesLoader3, (java.lang.Object) str9, (java.lang.Object) aggregateTextBag10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: pignlproc.storage.UriUriNTriplesLoader cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi !" + "'", str9, "hi !");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "hi !");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("\"title\"", "http://.wikipedia.org/wiki/hi%21\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22" + "'", str2, "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "opennlp / en - sent . bin");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("opennlp/en-sent.bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser3 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        pignlproc.evaluation.ConcatTextBag concatTextBag6 = new pignlproc.evaluation.ConcatTextBag("title", false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = null;
        concatTextBag6.setPigLogger(pigLogger7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList9 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) "opennlp/en-sent.bin", (java.lang.Object) annotatingMarkupParser3, (java.lang.Object) concatTextBag6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable6 = countingAppendable4.append((java.lang.CharSequence) "http://.wikipedia.org/wiki/hi%21\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("http://.wikipedia.org/wiki/hi%21", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521" + "'", str2, "http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("hi!\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi! \"" + "'", str1, "\"hi! \"");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList3);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList6 = mergeAsOpenNLPAnnotatedText0.getArgToFuncMapping();
        org.apache.pig.data.Tuple tuple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = mergeAsOpenNLPAnnotatedText0.exec(tuple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi !" + "'", str5, "hi !");
        org.junit.Assert.assertNull(funcSpecList6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        info.bliki.htmlcleaner.TagNode tagNode5 = null;
        info.bliki.wiki.model.ImageFormat imageFormat6 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser7.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList10 = annotatingMarkupParser7.getHeaderAnnotations();
        java.lang.String str11 = annotatingMarkupParser7.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser12 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser12.getHeaders();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser12.getHeaders();
        java.lang.Appendable appendable15 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable16 = annotatingMarkupParser12.new CountingAppendable(appendable15);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable17 = annotatingMarkupParser7.new CountingAppendable((java.lang.Appendable) countingAppendable16);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser18.getHeaders();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser18.getHeaders();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser18.getHeaders();
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser18.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel24 = annotatingMarkupParser18.makeWikiModel("opennlp / en - sent . bin");
        info.bliki.wiki.model.WikiModel wikiModel26 = annotatingMarkupParser18.makeWikiModel("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser0.imageNodeToText(tagNode5, imageFormat6, (java.lang.Appendable) countingAppendable16, (info.bliki.wiki.model.IWikiModel) wikiModel26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(annotationList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wikiModel24);
        org.junit.Assert.assertNotNull(wikiModel26);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("hi!", "http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21" + "'", str2, "http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel4 = annotatingMarkupParser0.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel6 = annotatingMarkupParser0.makeWikiModel("hi!\n");
        info.bliki.htmlcleaner.TagNode tagNode7 = null;
        info.bliki.wiki.model.ImageFormat imageFormat8 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser9 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser9.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList11 = annotatingMarkupParser9.getWikiLinkAnnotations();
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
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable23 = annotatingMarkupParser9.new CountingAppendable((java.lang.Appendable) countingAppendable22);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser25 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        info.bliki.wiki.model.WikiModel wikiModel27 = annotatingMarkupParser25.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser0.imageNodeToText(tagNode7, imageFormat8, (java.lang.Appendable) countingAppendable22, (info.bliki.wiki.model.IWikiModel) wikiModel27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(wikiModel4);
        org.junit.Assert.assertNotNull(wikiModel6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(annotationList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(annotationList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wikiModel27);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("opennlp/en-sent.bin", "hi!", "\"hi!\"\n");
        org.apache.hadoop.fs.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = uriUriNTriplesStorer3.relToAbsPathForStoreLocation("wikiobject", path5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: wikiobject curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21\n", "wikiobject", "hi!");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("");
        mergeAsOpenNLPAnnotatedText1.progress();
        org.apache.pig.data.Tuple tuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mergeAsOpenNLPAnnotatedText1.exec(tuple3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        org.apache.pig.data.Tuple tuple28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = mergeAsOpenNLPAnnotatedText0.exec(tuple28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("href");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("opennlp/en-sent.bin", job3);
        org.apache.hadoop.fs.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = parsingWikipediaLoader1.relativeToAbsolutePath("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", path6);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job4 = null;
        java.lang.String[] strArray5 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/hi%21\n", job4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple6 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster2);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("title", job4);
        org.apache.pig.Expression expression6 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression6);
        org.apache.hadoop.mapreduce.InputFormat inputFormat8 = uriStringLiteralNTriplesLoader2.getInputFormat();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple9 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat8);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.InputFormat inputFormat6 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.pig.Expression expression7 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression7);
        org.apache.hadoop.fs.Path path10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = uriStringLiteralNTriplesLoader2.relativeToAbsolutePath("\"hi! \"", path10);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"hi! \" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("http://.wikipedia.org/wiki/hi%21");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.hadoop.mapreduce.Job job9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", job9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: http :%20/%20http%20:%20/%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("href", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", "opennlp/en-sent.bin");
        org.apache.hadoop.fs.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = uriUriNTriplesStorer3.relToAbsPathForStoreLocation("http://.wikipedia.org/wiki/hi%21\n", path5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://.wikipedia.org/wiki/hi%21? curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.lang.CharSequence charSequence19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable20 = countingAppendable18.append(charSequence19);
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("hi !");
        org.apache.pig.Expression expression2 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21", "title");
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.putNext(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("href");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("href", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("href", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.InputFormat inputFormat6 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.pig.Expression expression7 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.RecordReader recordReader9 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit10 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader9, pigSplit10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple12 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21", "hi!", "");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.setStoreLocation("hi !", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("hi !");
        org.apache.pig.Expression expression2 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression2);
        org.apache.pig.LoadCaster loadCaster4 = parsingWikipediaLoader1.getLoadCaster();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple5 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.hadoop.mapreduce.Job job0 = null;
        org.apache.hadoop.fs.Path path1 = null;
        org.apache.hadoop.fs.Path[] pathArray2 = new org.apache.hadoop.fs.Path[] { path1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, pathArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"opennlp/en-sent.bin\"" + "'", str1, "\"opennlp/en-sent.bin\"");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation(100, (int) (byte) -1, "", "title");
        java.lang.String str5 = annotation4.value;
        int int6 = annotation4.begin;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser7.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList10 = annotatingMarkupParser7.getHeaderAnnotations();
        java.lang.String str11 = annotatingMarkupParser7.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser12 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser12.getHeaders();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser12.getHeaders();
        java.lang.Appendable appendable15 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable16 = annotatingMarkupParser12.new CountingAppendable(appendable15);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable17 = annotatingMarkupParser7.new CountingAppendable((java.lang.Appendable) countingAppendable16);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser18.getHeaders();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser18.getHeaders();
        java.lang.Appendable appendable21 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable22 = annotatingMarkupParser18.new CountingAppendable(appendable21);
        countingAppendable22.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable25 = annotatingMarkupParser7.new CountingAppendable((java.lang.Appendable) countingAppendable22);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser26 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList27 = annotatingMarkupParser26.getHeaders();
        java.util.List<java.lang.String> strList28 = annotatingMarkupParser26.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList29 = annotatingMarkupParser26.getHeaderAnnotations();
        java.lang.String str30 = annotatingMarkupParser26.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser31 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList32 = annotatingMarkupParser31.getHeaders();
        java.util.List<java.lang.String> strList33 = annotatingMarkupParser31.getHeaders();
        java.lang.Appendable appendable34 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable35 = annotatingMarkupParser31.new CountingAppendable(appendable34);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable36 = annotatingMarkupParser26.new CountingAppendable((java.lang.Appendable) countingAppendable35);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable37 = annotatingMarkupParser7.new CountingAppendable((java.lang.Appendable) countingAppendable35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList38 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) int6, (java.lang.Object) countingAppendable35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: pignlproc.markup.AnnotatingMarkupParser$CountingAppendable cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "title" + "'", str5, "title");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(annotationList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(annotationList29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"hi!\"\n", "title", "hi !\n");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader3.setLocation("\"opennlp/en-sent.bin\"", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.getAbsolutePath("http://.wikipedia.org/wiki/hi%21\n", path1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://.wikipedia.org/wiki/hi%21? curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("", "", "");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) '#', (int) (byte) 1, "", "title");
        int int5 = annotation4.begin;
        java.lang.Class<?> wildcardClass6 = annotation4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = null;
        mergeAsOpenNLPAnnotatedText0.setPigLogger(pigLogger6);
        org.apache.pig.data.Tuple tuple8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = mergeAsOpenNLPAnnotatedText0.exec(tuple8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi !" + "'", str5, "hi !");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("hi !");
        org.apache.pig.LoadCaster loadCaster8 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("\"hi!\"\n", job10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(loadCaster8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("opennlp / en - sent . bin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"opennlp / en - sent . bin\"" + "'", str1, "\"opennlp / en - sent . bin\"");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22", "hi !\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522" + "'", str2, "http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21", "http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.fs.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = uriStringLiteralNTriplesLoader2.relativeToAbsolutePath("\"\"", path4);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"\" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("title", "hi !", "http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.setStoreLocation("", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList1 = sentencesWithLink0.getArgToFuncMapping();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("http://hi!\n.wikipedia.org/wiki/%22_title_%22", enum3);
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag6 = sentencesWithLink0.exec(tuple5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(funcSpecList1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.Boolean boolean4 = checkAbstract0.exec(tuple3);
        checkAbstract0.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = null;
        checkAbstract0.setPigLogger(pigLogger6);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21", "hi !", "http://.wikipedia.org/wiki/hi%21\n");
        uriUriNTriplesStorer3.setStoreFuncUDFContextSignature("\"title\"");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        safeTsvText0.setPigLogger(pigLogger1);
        safeTsvText0.finish();
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader5 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceStatistics resourceStatistics8 = parsingWikipediaLoader5.getStatistics("hi!", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceSchema resourceSchema11 = parsingWikipediaLoader5.getSchema("hi!", job10);
        parsingWikipediaLoader5.setUDFContextSignature("title");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader17 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job19 = null;
        org.apache.pig.ResourceSchema resourceSchema20 = uriUriNTriplesLoader17.getSchema("", job19);
        org.apache.hadoop.mapreduce.Job job22 = null;
        org.apache.pig.ResourceStatistics resourceStatistics23 = uriUriNTriplesLoader17.getStatistics("opennlp/en-sent.bin", job22);
        org.apache.pig.Expression expression24 = null;
        uriUriNTriplesLoader17.setPartitionFilter(expression24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList26 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) safeTsvText0, (java.lang.Object) "title", (java.lang.Object) uriUriNTriplesLoader17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: pignlproc.evaluation.SafeTsvText cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics8);
        org.junit.Assert.assertNotNull(resourceSchema11);
        org.junit.Assert.assertNotNull(resourceSchema20);
        org.junit.Assert.assertNull(resourceStatistics23);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("\"opennlp/en-sent.bin\"", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("", "title", "http://.wikipedia.org/wiki/hi%21\n");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable32 = countingAppendable30.append('#');
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(annotationList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = uriStringLiteralNTriplesLoader2.getSchema("\"title\"\n", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceStatistics resourceStatistics11 = uriStringLiteralNTriplesLoader2.getStatistics("hi !\n", job10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesLoader2.setLocation("http://.wikipedia.org/wiki/hi%21", job13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(resourceSchema8);
        org.junit.Assert.assertNull(resourceStatistics11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", "hi !", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat4 = uriUriNTriplesStorer3.getOutputFormat();
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.putNext(tuple5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "\"title\"\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser1.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList5 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) annotatingMarkupParser1, (java.lang.Object) "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: pignlproc.markup.AnnotatingMarkupParser cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wikiModel3);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.pig.Expression expression5 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression5);
        org.apache.pig.LoadCaster loadCaster7 = parsingWikipediaLoader1.getLoadCaster();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple8 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(loadCaster7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("\"hi!\"", job6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("", job9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not create a Path from an empty string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger5 = null;
        sentencesWithLink0.setPigLogger(pigLogger5);
        org.apache.pig.data.Tuple tuple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag8 = sentencesWithLink0.exec(tuple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigLogger1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.fs.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = uriUriNTriplesStorer1.relToAbsPathForStoreLocation("opennlp / en - sent . bin", path3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: opennlp / en - sent . bin curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "title", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.setStoreLocation("title", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("href");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("\"hi! \"", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("", "", "");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.cleanupOnFailure("", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not create a Path from an empty string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String[] strArray1 = new java.lang.String[] { "opennlp/en-sent.bin" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "");
        java.lang.String str7 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "http://.wikipedia.org/wiki/hi%21");
        java.lang.String str9 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "opennlp/en-sent.bin");
        java.lang.String str11 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "hi!\n");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "opennlp/en-sent.bin" + "'", str5, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "opennlp/en-sent.bin" + "'", str7, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "opennlp/en-sent.bin" + "'", str9, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "opennlp/en-sent.bin" + "'", str11, "opennlp/en-sent.bin");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.cleanupOnFailure("http://.wikipedia.org/wiki/hi%21\n", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader4 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader4.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = parsingWikipediaLoader4.getSchema("hi!", job7);
        uriUriNTriplesStorer1.checkSchema(resourceSchema8);
        org.apache.pig.data.Tuple tuple10 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(resourceSchema8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.hadoop.mapreduce.OutputFormat outputFormat4 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter5 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter5);
        org.apache.hadoop.fs.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("", path8);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location:  curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat4);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        java.lang.String[] strArray5 = uriStringLiteralNTriplesLoader2.getPartitionKeys("href", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = uriStringLiteralNTriplesLoader2.getSchema("hi !", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesLoader2.setLocation("titlehref", job10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(resourceSchema8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("opennlp / en - sent . bin", "hi!\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin" + "'", str2, "http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple19 = uriUriNTriplesLoader3.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(inputFormat9);
        org.junit.Assert.assertNotNull(resourceSchema12);
        org.junit.Assert.assertNull(resourceStatistics15);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        sentencesWithLink0.progress();
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(pigLogger23);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getParagraphs();
        info.bliki.htmlcleaner.TagNode tagNode3 = null;
        info.bliki.wiki.model.ImageFormat imageFormat4 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList8 = annotatingMarkupParser5.getHeaderAnnotations();
        java.lang.String str9 = annotatingMarkupParser5.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser10 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser10.getHeaders();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser10.getHeaders();
        java.lang.Appendable appendable13 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable14 = annotatingMarkupParser10.new CountingAppendable(appendable13);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable15 = annotatingMarkupParser5.new CountingAppendable((java.lang.Appendable) countingAppendable14);
        int int16 = countingAppendable14.currentPosition;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser17 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList18 = annotatingMarkupParser17.getHeaders();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser17.getHeaders();
        java.lang.Appendable appendable20 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable21 = annotatingMarkupParser17.new CountingAppendable(appendable20);
        java.lang.String str23 = annotatingMarkupParser17.parse("");
        java.util.List<pignlproc.markup.Annotation> annotationList24 = annotatingMarkupParser17.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser25 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList26 = annotatingMarkupParser25.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel28 = annotatingMarkupParser25.makeWikiModel("title");
        java.util.List<pignlproc.markup.Annotation> annotationList29 = annotatingMarkupParser25.getHeaderAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList30 = annotatingMarkupParser25.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser31 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList32 = annotatingMarkupParser31.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser33 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList34 = annotatingMarkupParser33.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList35 = annotatingMarkupParser33.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList36 = annotatingMarkupParser33.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser37 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList38 = annotatingMarkupParser37.getHeaders();
        java.util.List<java.lang.String> strList39 = annotatingMarkupParser37.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList40 = annotatingMarkupParser37.getHeaderAnnotations();
        java.lang.String str41 = annotatingMarkupParser37.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser42 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList43 = annotatingMarkupParser42.getHeaders();
        java.util.List<java.lang.String> strList44 = annotatingMarkupParser42.getHeaders();
        java.lang.Appendable appendable45 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable46 = annotatingMarkupParser42.new CountingAppendable(appendable45);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable47 = annotatingMarkupParser37.new CountingAppendable((java.lang.Appendable) countingAppendable46);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser48 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList49 = annotatingMarkupParser48.getHeaderAnnotations();
        java.lang.String str50 = annotatingMarkupParser48.getRedirect();
        pignlproc.markup.Annotation annotation55 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation60 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int61 = annotation60.end;
        int int62 = annotation60.begin;
        pignlproc.markup.Annotation[] annotationArray63 = new pignlproc.markup.Annotation[] { annotation55, annotation60 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList64 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList64, annotationArray63);
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
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser77 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList78 = annotatingMarkupParser77.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel80 = annotatingMarkupParser77.makeWikiModel("title");
        annotatingMarkupParser48.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList64, (java.lang.Appendable) countingAppendable75, (info.bliki.wiki.model.IWikiModel) wikiModel80);
        annotatingMarkupParser31.nodesToText(annotationList36, (java.lang.Appendable) countingAppendable47, (info.bliki.wiki.model.IWikiModel) wikiModel80);
        countingAppendable47.currentPosition = ' ';
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser85 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList86 = annotatingMarkupParser85.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel88 = annotatingMarkupParser85.makeWikiModel("title");
        annotatingMarkupParser17.nodesToText(annotationList30, (java.lang.Appendable) countingAppendable47, (info.bliki.wiki.model.IWikiModel) wikiModel88);
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser0.imageNodeToText(tagNode3, imageFormat4, (java.lang.Appendable) countingAppendable14, (info.bliki.wiki.model.IWikiModel) wikiModel88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(annotationList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(annotationList24);
        org.junit.Assert.assertNotNull(annotationList26);
        org.junit.Assert.assertNotNull(wikiModel28);
        org.junit.Assert.assertNotNull(annotationList29);
        org.junit.Assert.assertNotNull(annotationList30);
        org.junit.Assert.assertNotNull(annotationList32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(annotationList35);
        org.junit.Assert.assertNotNull(annotationList36);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(annotationList40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(annotationList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertNotNull(annotationArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(annotationList69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(annotationList78);
        org.junit.Assert.assertNotNull(wikiModel80);
        org.junit.Assert.assertNotNull(annotationList86);
        org.junit.Assert.assertNotNull(wikiModel88);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        org.apache.pig.data.Tuple tuple55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = safeTsvText0.exec(tuple55);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel4 = annotatingMarkupParser0.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel6 = annotatingMarkupParser0.makeWikiModel("hi!\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser7.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList10 = annotatingMarkupParser7.getHeaderAnnotations();
        java.lang.String str11 = annotatingMarkupParser7.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser12 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser12.getHeaders();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser12.getHeaders();
        java.lang.Appendable appendable15 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable16 = annotatingMarkupParser12.new CountingAppendable(appendable15);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable17 = annotatingMarkupParser7.new CountingAppendable((java.lang.Appendable) countingAppendable16);
        java.util.List<pignlproc.markup.Annotation> annotationList18 = annotatingMarkupParser7.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser19 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList20 = annotatingMarkupParser19.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser21 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser21.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList23 = annotatingMarkupParser21.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList24 = annotatingMarkupParser21.getParagraphAnnotations();
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
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser36 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList37 = annotatingMarkupParser36.getHeaderAnnotations();
        java.lang.String str38 = annotatingMarkupParser36.getRedirect();
        pignlproc.markup.Annotation annotation43 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation48 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int49 = annotation48.end;
        int int50 = annotation48.begin;
        pignlproc.markup.Annotation[] annotationArray51 = new pignlproc.markup.Annotation[] { annotation43, annotation48 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList52 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList52, annotationArray51);
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
        java.util.List<pignlproc.markup.Annotation> annotationList66 = annotatingMarkupParser65.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel68 = annotatingMarkupParser65.makeWikiModel("title");
        annotatingMarkupParser36.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList52, (java.lang.Appendable) countingAppendable63, (info.bliki.wiki.model.IWikiModel) wikiModel68);
        annotatingMarkupParser19.nodesToText(annotationList24, (java.lang.Appendable) countingAppendable35, (info.bliki.wiki.model.IWikiModel) wikiModel68);
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
        java.util.List<java.lang.String> strList82 = annotatingMarkupParser71.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel84 = annotatingMarkupParser71.makeWikiModel("opennlp / en - sent . bin");
        annotatingMarkupParser0.nodesToText(annotationList18, (java.lang.Appendable) countingAppendable35, (info.bliki.wiki.model.IWikiModel) wikiModel84);
        int int86 = countingAppendable35.currentPosition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable90 = countingAppendable35.append((java.lang.CharSequence) "\"hi!\"", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(wikiModel4);
        org.junit.Assert.assertNotNull(wikiModel6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(annotationList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(annotationList18);
        org.junit.Assert.assertNotNull(annotationList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(annotationList23);
        org.junit.Assert.assertNotNull(annotationList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(annotationList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(annotationList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertNotNull(annotationArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(annotationList57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(annotationList66);
        org.junit.Assert.assertNotNull(wikiModel68);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(annotationList74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(wikiModel84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList1 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        sentencesWithLink0.setPigLogger(pigLogger2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = sentencesWithLink0.getReporter();
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag6 = sentencesWithLink0.exec(tuple5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(funcSpecList1);
        org.junit.Assert.assertNull(pigProgressable4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not create a Path from an empty string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "title", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.cleanupOnFailure("\"title\"\n", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "http://.wikipedia.org/wiki/hi%21\n", "http://.wikipedia.org/wiki/hi%21");
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.putNext(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser6 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser6.getHeaderAnnotations();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser6.getParagraphs();
        java.lang.Appendable appendable9 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser6.new CountingAppendable(appendable9);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable11 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable13 = countingAppendable11.append((java.lang.CharSequence) "http://\"title\".wikipedia.org/wiki/%22hi%21%22");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(annotationList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.hadoop.mapreduce.OutputFormat outputFormat4 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter5 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter5);
        org.apache.pig.data.Tuple tuple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat4);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        java.lang.Enum enum3 = null;
        aggregateTextBag1.warn("href", enum3);
        aggregateTextBag1.progress();
        org.apache.pig.data.Tuple tuple6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = aggregateTextBag1.exec(tuple6);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("http://hi!\n.wikipedia.org/wiki/%22_title_%22");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"http://hi!?.wikipedia.org/wiki/%22_title_%22\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) '#', false);
        java.lang.reflect.Type type3 = aggregateTextBag2.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract4 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum6 = null;
        checkAbstract4.warn("http://.wikipedia.org/wiki/hi%21", enum6);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable8 = null;
        checkAbstract4.setReporter(pigProgressable8);
        java.lang.reflect.Type type10 = checkAbstract4.getReturnType();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = checkAbstract4.outputSchema(schema32);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = aggregateTextBag2.outputSchema(schema36);
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer40 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat41 = uriStringLiteralNTriplesStorer40.getOutputFormat();
        uriStringLiteralNTriplesStorer40.setStoreFuncUDFContextSignature("hi !");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter44 = null;
        uriStringLiteralNTriplesStorer40.prepareToWrite(recordWriter44);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList46 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) schema36, (java.lang.Object) "http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522", (java.lang.Object) recordWriter44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.pig.impl.logicalLayer.schema.Schema cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type10);
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
        org.junit.Assert.assertNotNull(outputFormat41);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21\n", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceStatistics resourceStatistics8 = uriStringLiteralNTriplesLoader2.getStatistics("\"title\"\n", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesLoader2.setLocation("hi !", job10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNull(resourceStatistics8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        uriStringLiteralNTriplesStorer1.setStoreFuncUDFContextSignature("hi !");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter5 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter5);
        org.apache.pig.data.Tuple tuple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("hi !", "title", "title");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader5 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster6 = parsingWikipediaLoader5.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceSchema resourceSchema9 = parsingWikipediaLoader5.getSchema("hi!", job8);
        uriUriNTriplesStorer3.checkSchema(resourceSchema9);
        org.apache.hadoop.mapreduce.RecordWriter recordWriter11 = null;
        uriUriNTriplesStorer3.prepareToWrite(recordWriter11);
        org.apache.pig.data.Tuple tuple13 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.putNext(tuple13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster6);
        org.junit.Assert.assertNotNull(resourceSchema9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        java.lang.String str5 = annotation4.label;
        int int6 = annotation4.end;
        java.lang.String str7 = annotation4.value;
        java.lang.String str8 = annotation4.label;
        java.lang.Class<?> wildcardClass9 = annotation4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "title" + "'", str5, "title");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "title" + "'", str8, "title");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.hadoop.mapreduce.Job job1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.StoreFunc.cleanupOnFailureImpl("\"hi! \"", job1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.getAbsolutePath("hi !", path1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: hi ! curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.RecordReader recordReader5 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit6 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader5, pigSplit6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        java.lang.String[] strArray10 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/hi%21", job9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        java.lang.String[] strArray13 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", job12);
        org.apache.hadoop.fs.Path path15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = parsingWikipediaLoader1.relativeToAbsolutePath("http://hi!\n.wikipedia.org/wiki/%22_title_%22", path15);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://hi!?.wikipedia.org/wiki/%22_title_%22 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList1 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        sentencesWithLink0.setPigLogger(pigLogger2);
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag5 = sentencesWithLink0.exec(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(funcSpecList1);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = null;
        mergeAsOpenNLPAnnotatedText0.setPigLogger(pigLogger6);
        mergeAsOpenNLPAnnotatedText0.finish();
        org.apache.pig.data.Tuple tuple9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = mergeAsOpenNLPAnnotatedText0.exec(tuple9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "href" + "'", str5, "href");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum2 = null;
        safeTsvText0.warn("opennlp/en-sent.bin", enum2);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList4 = safeTsvText0.getArgToFuncMapping();
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = safeTsvText0.exec(tuple5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(funcSpecList4);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        sentencesWithLink0.finish();
        java.lang.Enum enum4 = null;
        sentencesWithLink0.warn("titlehref", enum4);
        sentencesWithLink0.progress();
        org.junit.Assert.assertNull(pigLogger1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("\"hi! \"", "\"hi!\"\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22" + "'", str2, "http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("hi!");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        org.apache.pig.data.Tuple tuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceStatistics resourceStatistics3 = uriUriNTriplesLoader0.getStatistics("wikiobject", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader0.setLocation("\"hi!\"\n", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics3);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.Job job4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.setStoreLocation("http://.wikipedia.org/wiki/hi%21", job4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader0 = new pignlproc.storage.UriStringLiteralNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceSchema resourceSchema3 = uriStringLiteralNTriplesLoader0.getSchema("", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceStatistics resourceStatistics6 = uriStringLiteralNTriplesLoader0.getStatistics("opennlp/en-sent.bin", job5);
        org.apache.hadoop.mapreduce.RecordReader recordReader7 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit8 = null;
        uriStringLiteralNTriplesLoader0.prepareToRead(recordReader7, pigSplit8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = uriStringLiteralNTriplesLoader0.getSchema("\"hi!\"\n", job11);
        org.junit.Assert.assertNotNull(resourceSchema3);
        org.junit.Assert.assertNull(resourceStatistics6);
        org.junit.Assert.assertNotNull(resourceSchema12);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        int int31 = countingAppendable28.currentPosition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable35 = countingAppendable28.append((java.lang.CharSequence) "http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", 1, 0);
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(annotationList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        sentencesWithLink0.setReporter(pigProgressable4);
        boolean boolean6 = sentencesWithLink0.isAsynchronous();
        java.lang.Enum enum8 = null;
        sentencesWithLink0.warn("hi !", enum8);
        org.apache.pig.data.Tuple tuple10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag11 = sentencesWithLink0.exec(tuple10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        aggregateTextBag1.progress();
        org.apache.pig.data.Tuple tuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = aggregateTextBag1.exec(tuple3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        org.apache.pig.data.Tuple tuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.getAbsolutePath("\"opennlp / en - sent . bin\"", path1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"opennlp / en - sent . bin\" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceStatistics resourceStatistics9 = uriUriNTriplesLoader3.getStatistics("opennlp/en-sent.bin", job8);
        org.apache.pig.Expression expression10 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple12 = uriUriNTriplesLoader3.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNull(resourceStatistics9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.InputFormat inputFormat6 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.pig.Expression expression7 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.RecordReader recordReader9 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit10 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader9, pigSplit10);
        org.apache.hadoop.mapreduce.RecordReader recordReader12 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit13 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader12, pigSplit13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple15 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = checkAbstract0.getReporter();
        checkAbstract0.progress();
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = checkAbstract0.exec(tuple5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = checkAbstract0.getPigLogger();
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer9 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser10 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser10.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList12 = annotatingMarkupParser10.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel14 = annotatingMarkupParser10.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel16 = annotatingMarkupParser10.makeWikiModel("hi!\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser17 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList18 = annotatingMarkupParser17.getHeaders();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser17.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList20 = annotatingMarkupParser17.getHeaderAnnotations();
        java.lang.String str21 = annotatingMarkupParser17.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser22 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList23 = annotatingMarkupParser22.getHeaders();
        java.util.List<java.lang.String> strList24 = annotatingMarkupParser22.getHeaders();
        java.lang.Appendable appendable25 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable26 = annotatingMarkupParser22.new CountingAppendable(appendable25);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable27 = annotatingMarkupParser17.new CountingAppendable((java.lang.Appendable) countingAppendable26);
        java.util.List<pignlproc.markup.Annotation> annotationList28 = annotatingMarkupParser17.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser29 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList30 = annotatingMarkupParser29.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser31 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList32 = annotatingMarkupParser31.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList33 = annotatingMarkupParser31.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList34 = annotatingMarkupParser31.getParagraphAnnotations();
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
        java.util.List<pignlproc.markup.Annotation> annotationList47 = annotatingMarkupParser46.getHeaderAnnotations();
        java.lang.String str48 = annotatingMarkupParser46.getRedirect();
        pignlproc.markup.Annotation annotation53 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation58 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int59 = annotation58.end;
        int int60 = annotation58.begin;
        pignlproc.markup.Annotation[] annotationArray61 = new pignlproc.markup.Annotation[] { annotation53, annotation58 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList62 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList62, annotationArray61);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser64 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList65 = annotatingMarkupParser64.getHeaders();
        java.util.List<java.lang.String> strList66 = annotatingMarkupParser64.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList67 = annotatingMarkupParser64.getHeaderAnnotations();
        java.lang.String str68 = annotatingMarkupParser64.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser69 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList70 = annotatingMarkupParser69.getHeaders();
        java.util.List<java.lang.String> strList71 = annotatingMarkupParser69.getHeaders();
        java.lang.Appendable appendable72 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable73 = annotatingMarkupParser69.new CountingAppendable(appendable72);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable74 = annotatingMarkupParser64.new CountingAppendable((java.lang.Appendable) countingAppendable73);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser75 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList76 = annotatingMarkupParser75.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel78 = annotatingMarkupParser75.makeWikiModel("title");
        annotatingMarkupParser46.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList62, (java.lang.Appendable) countingAppendable73, (info.bliki.wiki.model.IWikiModel) wikiModel78);
        annotatingMarkupParser29.nodesToText(annotationList34, (java.lang.Appendable) countingAppendable45, (info.bliki.wiki.model.IWikiModel) wikiModel78);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser81 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList82 = annotatingMarkupParser81.getHeaders();
        java.util.List<java.lang.String> strList83 = annotatingMarkupParser81.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList84 = annotatingMarkupParser81.getHeaderAnnotations();
        java.lang.String str85 = annotatingMarkupParser81.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser86 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList87 = annotatingMarkupParser86.getHeaders();
        java.util.List<java.lang.String> strList88 = annotatingMarkupParser86.getHeaders();
        java.lang.Appendable appendable89 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable90 = annotatingMarkupParser86.new CountingAppendable(appendable89);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable91 = annotatingMarkupParser81.new CountingAppendable((java.lang.Appendable) countingAppendable90);
        java.util.List<java.lang.String> strList92 = annotatingMarkupParser81.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel94 = annotatingMarkupParser81.makeWikiModel("opennlp / en - sent . bin");
        annotatingMarkupParser10.nodesToText(annotationList28, (java.lang.Appendable) countingAppendable45, (info.bliki.wiki.model.IWikiModel) wikiModel94);
        java.util.List<opennlp.tools.util.Span> spanList96 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) pigLogger7, (java.lang.Object) "http://.wikipedia.org/wiki/hi%21\n", (java.lang.Object) annotationList28);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNull(pigLogger7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(annotationList12);
        org.junit.Assert.assertNotNull(wikiModel14);
        org.junit.Assert.assertNotNull(wikiModel16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(annotationList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(annotationList28);
        org.junit.Assert.assertNotNull(annotationList30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(annotationList33);
        org.junit.Assert.assertNotNull(annotationList34);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(annotationList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(annotationList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 52 + "'", int60 == 52);
        org.junit.Assert.assertNotNull(annotationArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(annotationList67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(annotationList76);
        org.junit.Assert.assertNotNull(wikiModel78);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(annotationList84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(wikiModel94);
        org.junit.Assert.assertNotNull(spanList96);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.InputFormat inputFormat6 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.pig.Expression expression7 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple9 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceStatistics resourceStatistics8 = parsingWikipediaLoader1.getStatistics("\"hi!\"", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("", job10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not create a Path from an empty string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNull(resourceStatistics8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("\"hi!\"");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("hi !", "\"hi!\"\n", "hi !");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.setStoreLocation("titlehref", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("\"hi!\"\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"hi!\"\" \"" + "'", str1, "\"\"\"hi!\"\" \"");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/hi%21\"" + "'", str1, "\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/hi%21\"");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.InputFormat inputFormat5 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.RecordReader recordReader6 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit7 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader6, pigSplit7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple9 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(inputFormat5);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable20 = countingAppendable15.append('a');
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        org.apache.pig.data.Tuple tuple3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, 1L, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("http://.wikipedia.org/wiki/hi%21\n", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("", "\"hi! \"", "title");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.setStoreLocation("\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/hi%21\"", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        java.lang.String[] strArray7 = parsingWikipediaLoader1.getPartitionKeys("wikiobject", job6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", job9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = sentencesWithLink0.getPigLogger();
        boolean boolean5 = sentencesWithLink0.isAsynchronous();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList6 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.data.Tuple tuple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag8 = sentencesWithLink0.exec(tuple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(funcSpecList3);
        org.junit.Assert.assertNull(pigLogger4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(funcSpecList6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.apache.pig.data.Tuple tuple54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = safeTsvText0.exec(tuple54);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        parsingWikipediaLoader1.setUDFContextSignature("title");
        org.apache.pig.Expression expression10 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/hi%21\"", job13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in scheme name at index 0: \"http://http:/.wikipedia.org/wiki/hi%2521%20.wikipedia.org/wiki/hi%2521%22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable22 = countingAppendable18.append((java.lang.CharSequence) "http://.wikipedia.org/wiki/hi%21", (int) '#', (int) '4');
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        safeTsvText0.setPigLogger(pigLogger1);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText3 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = mergeAsOpenNLPAnnotatedText3.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract5 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema6 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = checkAbstract5.outputSchema(schema6);
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = mergeAsOpenNLPAnnotatedText3.outputSchema(schema6);
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = safeTsvText0.outputSchema(schema8);
        java.lang.Class<?> wildcardClass10 = schema8.getClass();
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "hi !\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader0 = new pignlproc.storage.UriStringLiteralNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceSchema resourceSchema3 = uriStringLiteralNTriplesLoader0.getSchema("", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceStatistics resourceStatistics6 = uriStringLiteralNTriplesLoader0.getStatistics("opennlp/en-sent.bin", job5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple7 = uriStringLiteralNTriplesLoader0.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema3);
        org.junit.Assert.assertNull(resourceStatistics6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceStatistics resourceStatistics3 = uriUriNTriplesLoader0.getStatistics("wikiobject", job2);
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader0.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader0.setLocation("", job6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not create a Path from an empty string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics3);
        org.junit.Assert.assertNotNull(inputFormat4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("opennlp / en - sent . bin");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "http://.wikipedia.org/wiki/hi%21\n", "http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.cleanupOnFailure("href", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = null;
        checkAbstract0.setPigLogger(pigLogger4);
        checkAbstract0.progress();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = checkAbstract0.outputSchema(schema16);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger18 = null;
        checkAbstract0.setPigLogger(pigLogger18);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable20 = checkAbstract0.getReporter();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser22 = new pignlproc.markup.AnnotatingMarkupParser("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList23 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) checkAbstract0, (java.lang.Object) annotatingMarkupParser22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: pignlproc.evaluation.CheckAbstract cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(pigProgressable20);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("href", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", "opennlp/en-sent.bin");
        org.apache.pig.ResourceSchema resourceSchema4 = null;
        uriUriNTriplesStorer3.checkSchema(resourceSchema4);
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("hi !\n");
        org.apache.hadoop.fs.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = uriUriNTriplesStorer1.relToAbsPathForStoreLocation("http://.wikipedia.org/wiki/hi%21\n", path3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://.wikipedia.org/wiki/hi%21? curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("hi !", "opennlp/en-sent.bin", "wikiobject");
        org.apache.hadoop.fs.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = uriUriNTriplesLoader3.relativeToAbsolutePath("", path5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location:  curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("", "\"hi! \"", "title");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.cleanupOnFailure("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: http :%20/%20http%20:%20/%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser3 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser3.getHeaders();
        java.util.List<java.lang.String> strList5 = annotatingMarkupParser3.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList6 = annotatingMarkupParser3.getHeaderAnnotations();
        java.lang.String str7 = annotatingMarkupParser3.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser8 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser8.getHeaders();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser8.getHeaders();
        java.lang.Appendable appendable11 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable12 = annotatingMarkupParser8.new CountingAppendable(appendable11);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable13 = annotatingMarkupParser3.new CountingAppendable((java.lang.Appendable) countingAppendable12);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable14 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable18 = countingAppendable13.append((java.lang.CharSequence) "opennlp / en - sent . bin", (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(annotationList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("hi !\n", job6);
        uriUriNTriplesLoader3.setUDFContextSignature("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.hadoop.mapreduce.Job job11 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader3.setLocation("title", job11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("\"opennlp / en - sent . bin\"");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", job6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: http :%20/%20http%20:%20/%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getParagraphs();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        int int5 = countingAppendable4.currentPosition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable9 = countingAppendable4.append((java.lang.CharSequence) "http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("http://.wikipedia.org/wiki/hi%21");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"http://.wikipedia.org/wiki/hi%21\"" + "'", str1, "\"http://.wikipedia.org/wiki/hi%21\"");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, 0L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag(100, true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        aggregateTextBag1.setPigLogger(pigLogger2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = null;
        aggregateTextBag1.setPigLogger(pigLogger4);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        java.lang.String[] strArray3 = uriUriNTriplesLoader0.getPartitionKeys("title", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        java.lang.String[] strArray6 = uriUriNTriplesLoader0.getPartitionKeys("http://\"title\".wikipedia.org/wiki/%22hi%21%22", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        java.lang.String[] strArray9 = uriUriNTriplesLoader0.getPartitionKeys("http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", job8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple10 = uriUriNTriplesLoader0.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/hi%21\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in scheme name at index 0: \"http://http:/.wikipedia.org/wiki/hi%2521%20.wikipedia.org/wiki/hi%2521%22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        int int52 = countingAppendable16.currentPosition;
        java.lang.CharSequence charSequence53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable56 = countingAppendable16.append(charSequence53, 35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.InputFormat inputFormat6 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.hadoop.fs.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = uriStringLiteralNTriplesLoader2.relativeToAbsolutePath("opennlp / en - sent . bin", path8);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: opennlp / en - sent . bin curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "title", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter4 = null;
        uriStringLiteralNTriplesStorer3.prepareToWrite(recordWriter4);
        org.apache.pig.data.Tuple tuple6 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.putNext(tuple6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple14 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics6);
        org.junit.Assert.assertNotNull(inputFormat7);
        org.junit.Assert.assertNotNull(resourceSchema13);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) 'a', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader4 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader4.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = parsingWikipediaLoader4.getSchema("hi!", job7);
        uriUriNTriplesStorer1.checkSchema(resourceSchema8);
        org.apache.hadoop.fs.Path path11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = uriUriNTriplesStorer1.relToAbsPathForStoreLocation("opennlp / en - sent . bin", path11);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: opennlp / en - sent . bin curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(resourceSchema8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        int int31 = countingAppendable28.currentPosition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable35 = countingAppendable28.append((java.lang.CharSequence) "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22", (int) ' ', (int) (short) 0);
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(annotationList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser6 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser6.getHeaderAnnotations();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser6.getParagraphs();
        java.lang.Appendable appendable9 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser6.new CountingAppendable(appendable9);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable11 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable15 = countingAppendable10.append((java.lang.CharSequence) "\"\"\"hi!\"\" \"", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(annotationList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("wikiobject", true);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.String str4 = concatTextBag2.exec(tuple3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = sentencesWithLink0.getPigLogger();
        boolean boolean5 = sentencesWithLink0.isAsynchronous();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText6 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = mergeAsOpenNLPAnnotatedText6.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract8 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = checkAbstract8.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = mergeAsOpenNLPAnnotatedText6.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema12 = sentencesWithLink0.outputSchema(schema11);
        org.apache.pig.data.Tuple tuple13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag14 = sentencesWithLink0.exec(tuple13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(funcSpecList3);
        org.junit.Assert.assertNull(pigLogger4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pigProgressable7);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) (byte) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("hi !\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi !?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        aggregateTextBag1.progress();
        pignlproc.evaluation.ConcatTextBag concatTextBag4 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract5 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum7 = null;
        checkAbstract5.warn("http://.wikipedia.org/wiki/hi%21", enum7);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        checkAbstract5.setPigLogger(pigLogger9);
        checkAbstract5.progress();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract5.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = concatTextBag4.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = aggregateTextBag1.outputSchema(schema23);
        org.apache.pig.data.Tuple tuple25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = aggregateTextBag1.exec(tuple25);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable16);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        java.lang.reflect.Type type4 = sentencesWithLink0.getReturnType();
        boolean boolean5 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.data.Tuple tuple6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag7 = sentencesWithLink0.exec(tuple6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract0.setReporter(pigProgressable4);
        java.lang.reflect.Type type6 = checkAbstract0.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath7 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText8 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        safeTsvText8.setPigLogger(pigLogger9);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText11 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable12 = mergeAsOpenNLPAnnotatedText11.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract13 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema14 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = checkAbstract13.outputSchema(schema14);
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = mergeAsOpenNLPAnnotatedText11.outputSchema(schema14);
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = safeTsvText8.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = noLoopInPath7.outputSchema(schema16);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag19 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText20 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger21 = null;
        safeTsvText20.setPigLogger(pigLogger21);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText23 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable24 = mergeAsOpenNLPAnnotatedText23.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract25 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = checkAbstract25.outputSchema(schema26);
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = mergeAsOpenNLPAnnotatedText23.outputSchema(schema26);
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = safeTsvText20.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = aggregateTextBag19.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = noLoopInPath7.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = checkAbstract0.outputSchema(schema28);
        checkAbstract0.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger34 = null;
        checkAbstract0.setPigLogger(pigLogger34);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNull(pigProgressable12);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(pigProgressable24);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.Boolean boolean4 = checkAbstract0.exec(tuple3);
        checkAbstract0.progress();
        checkAbstract0.finish();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("\"hi!\"", job6);
        org.apache.hadoop.mapreduce.InputFormat inputFormat8 = parsingWikipediaLoader1.getInputFormat();
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
        org.junit.Assert.assertNotNull(inputFormat8);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        pignlproc.helpers.SpanHelper spanHelper0 = new pignlproc.helpers.SpanHelper();
        java.lang.Class<?> wildcardClass1 = spanHelper0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getParagraphs();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        int int5 = countingAppendable4.currentPosition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable7 = countingAppendable4.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("hi !", "title", "title");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader5 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster6 = parsingWikipediaLoader5.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceSchema resourceSchema9 = parsingWikipediaLoader5.getSchema("hi!", job8);
        uriUriNTriplesStorer3.checkSchema(resourceSchema9);
        org.apache.pig.data.Tuple tuple11 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.putNext(tuple11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster6);
        org.junit.Assert.assertNotNull(resourceSchema9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        java.lang.String[] strArray3 = uriUriNTriplesLoader0.getPartitionKeys("title", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        java.lang.String[] strArray6 = uriUriNTriplesLoader0.getPartitionKeys("http://\"title\".wikipedia.org/wiki/%22hi%21%22", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        java.lang.String[] strArray9 = uriUriNTriplesLoader0.getPartitionKeys("http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", job8);
        org.apache.hadoop.fs.Path path11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = uriUriNTriplesLoader0.relativeToAbsolutePath("title", path11);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: title curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "href");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) '#', false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger3 = null;
        aggregateTextBag2.setPigLogger(pigLogger3);
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = aggregateTextBag2.exec(tuple5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("hi !", "http://.wikipedia.org/wiki/hi%21");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/hi_%21" + "'", str2, "http://http://.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/hi_%21");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum2 = null;
        safeTsvText0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = safeTsvText0.getReporter();
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = safeTsvText0.exec(tuple5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceStatistics resourceStatistics10 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", job9);
        org.apache.hadoop.fs.Path path12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = parsingWikipediaLoader1.relativeToAbsolutePath("\"hi!\"\n", path12);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"hi!\"? curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNull(resourceStatistics10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 1);
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = aggregateTextBag1.exec(tuple2);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract0.setReporter(pigProgressable4);
        java.lang.Enum enum7 = null;
        checkAbstract0.warn("hi !\n", enum7);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = checkAbstract0.getPigLogger();
        org.junit.Assert.assertNull(pigLogger9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList1 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        sentencesWithLink0.setPigLogger(pigLogger2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = sentencesWithLink0.getReporter();
        java.lang.Class<?> wildcardClass5 = sentencesWithLink0.getClass();
        org.junit.Assert.assertNull(funcSpecList1);
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("", "\"hi! \"", "title");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.setStoreLocation("\"title\"", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (-1L), (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = parsingWikipediaLoader1.getSchema("hi!", job4);
        org.apache.pig.LoadCaster loadCaster6 = parsingWikipediaLoader1.getLoadCaster();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple7 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster2);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(loadCaster6);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("hi !");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple8 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        parsingWikipediaLoader1.setUDFContextSignature("title");
        org.apache.pig.Expression expression10 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression10);
        org.apache.hadoop.mapreduce.RecordReader recordReader12 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit13 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader12, pigSplit13);
        org.apache.hadoop.mapreduce.Job job16 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("\"opennlp/en-sent.bin\"", job16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21", "hi!", "");
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("wikiobject", "http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", "http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.RecordReader recordReader6 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit7 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader6, pigSplit7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple9 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("opennlp / en - sent . bin", "http://hi!\n.wikipedia.org/wiki/%22_title_%22");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin" + "'", str2, "http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) '#');
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("hi !\n", job6);
        org.apache.hadoop.fs.Path path9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = uriUriNTriplesLoader3.relativeToAbsolutePath("\"hi! \"", path9);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"hi! \" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.lang.Class<?> wildcardClass3 = sentencesWithLink0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "http://.wikipedia.org/wiki/hi%21\n", "http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat4 = uriStringLiteralNTriplesStorer3.getOutputFormat();
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.putNext(tuple5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        int int19 = countingAppendable18.currentPosition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable23 = countingAppendable18.append((java.lang.CharSequence) "http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", (-1), (int) 'a');
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        sentencesWithLink0.finish();
        java.lang.Enum enum4 = null;
        sentencesWithLink0.warn("titlehref", enum4);
        java.lang.reflect.Type type6 = sentencesWithLink0.getReturnType();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = sentencesWithLink0.getReporter();
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNull(pigProgressable7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String[] strArray1 = new java.lang.String[] { "opennlp/en-sent.bin" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "");
        java.lang.String str7 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "wikiobject");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "opennlp/en-sent.bin" + "'", str5, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "opennlp/en-sent.bin" + "'", str7, "opennlp/en-sent.bin");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22", job3);
        org.junit.Assert.assertNull(resourceStatistics4);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable20 = countingAppendable18.append(' ');
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
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("hi !\n\n", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger5 = null;
        sentencesWithLink0.setPigLogger(pigLogger5);
        org.junit.Assert.assertNull(funcSpecList3);
        org.junit.Assert.assertNull(pigLogger4);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 0, true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("\"title\"\n");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable1 = mergeAsOpenNLPAnnotatedText0.getReporter();
        java.lang.Enum enum3 = null;
        mergeAsOpenNLPAnnotatedText0.warn("title", enum3);
        org.apache.commons.logging.Log log5 = mergeAsOpenNLPAnnotatedText0.getLogger();
        pignlproc.evaluation.SafeTsvText safeTsvText6 = new pignlproc.evaluation.SafeTsvText();
        java.lang.reflect.Type type7 = safeTsvText6.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract8 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = checkAbstract8.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = safeTsvText6.outputSchema(schema10);
        org.apache.pig.impl.logicalLayer.schema.Schema schema12 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema11);
        org.apache.pig.data.Tuple tuple13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = mergeAsOpenNLPAnnotatedText0.exec(tuple13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable1);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("wikiobject");
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser1.getHeaders();
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader0 = new pignlproc.storage.UriStringLiteralNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceSchema resourceSchema3 = uriStringLiteralNTriplesLoader0.getSchema("", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriStringLiteralNTriplesLoader0.getSchema("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21", job5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple7 = uriStringLiteralNTriplesLoader0.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema3);
        org.junit.Assert.assertNotNull(resourceSchema6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        java.util.List<org.apache.pig.FuncSpec> funcSpecList25 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.data.Tuple tuple26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag27 = sentencesWithLink0.exec(tuple26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(funcSpecList25);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.Job job4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.setStoreLocation("\"http://.wikipedia.org/wiki/hi%21\"", job4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 10, false);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText3 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = mergeAsOpenNLPAnnotatedText3.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract5 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema6 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = checkAbstract5.outputSchema(schema6);
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = mergeAsOpenNLPAnnotatedText3.outputSchema(schema6);
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = aggregateTextBag2.outputSchema(schema8);
        java.lang.Class<?> wildcardClass10 = schema9.getClass();
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("opennlp/en-sent.bin", "wikiobject");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://wikiobject.wikipedia.org/wiki/opennlp%2Fen-sent.bin" + "'", str2, "http://wikiobject.wikipedia.org/wiki/opennlp%2Fen-sent.bin");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("hi !", "opennlp/en-sent.bin", "wikiobject");
        org.apache.pig.Expression expression4 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression4);
        org.apache.pig.Expression expression6 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceSchema resourceSchema10 = uriUriNTriplesLoader3.getSchema("http://\"title\".wikipedia.org/wiki/%22hi%21%22", job9);
        org.junit.Assert.assertNotNull(resourceSchema10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("", "opennlp / en - sent . bin", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader3.setLocation("\"opennlp/en-sent.bin\"", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMaxInputSplitSize(job0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceStatistics resourceStatistics3 = uriUriNTriplesLoader0.getStatistics("wikiobject", job2);
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader0.getInputFormat();
        org.apache.pig.LoadCaster loadCaster5 = uriUriNTriplesLoader0.getLoadCaster();
        java.lang.Class<?> wildcardClass6 = uriUriNTriplesLoader0.getClass();
        org.junit.Assert.assertNull(resourceStatistics3);
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader15 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job17 = null;
        org.apache.pig.ResourceStatistics resourceStatistics18 = parsingWikipediaLoader15.getStatistics("hi!", job17);
        org.apache.hadoop.mapreduce.Job job20 = null;
        org.apache.pig.ResourceSchema resourceSchema21 = parsingWikipediaLoader15.getSchema("\"hi!\"", job20);
        org.apache.hadoop.mapreduce.Job job23 = null;
        org.apache.pig.ResourceSchema resourceSchema24 = parsingWikipediaLoader15.getSchema("\"hi!\"\n", job23);
        org.apache.hadoop.mapreduce.Job job26 = null;
        org.apache.pig.ResourceSchema resourceSchema27 = parsingWikipediaLoader15.getSchema("http://.wikipedia.org/wiki/hi%21\n", job26);
        org.apache.pig.Expression expression28 = null;
        parsingWikipediaLoader15.setPartitionFilter(expression28);
        org.apache.hadoop.mapreduce.RecordReader recordReader30 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit31 = null;
        parsingWikipediaLoader15.prepareToRead(recordReader30, pigSplit31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList33 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) resourceSchema13, (java.lang.Object) parsingWikipediaLoader15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.pig.ResourceSchema cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(resourceSchema13);
        org.junit.Assert.assertNull(resourceStatistics18);
        org.junit.Assert.assertNotNull(resourceSchema21);
        org.junit.Assert.assertNotNull(resourceSchema24);
        org.junit.Assert.assertNotNull(resourceSchema27);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("\" title \"");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        java.lang.String str6 = annotatingMarkupParser0.parse("");
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList8 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser9 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList10 = annotatingMarkupParser9.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser11 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser11.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList13 = annotatingMarkupParser11.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList14 = annotatingMarkupParser11.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser15 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList16 = annotatingMarkupParser15.getHeaders();
        java.util.List<java.lang.String> strList17 = annotatingMarkupParser15.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList18 = annotatingMarkupParser15.getHeaderAnnotations();
        java.lang.String str19 = annotatingMarkupParser15.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser20 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser20.getHeaders();
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser20.getHeaders();
        java.lang.Appendable appendable23 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable24 = annotatingMarkupParser20.new CountingAppendable(appendable23);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable25 = annotatingMarkupParser15.new CountingAppendable((java.lang.Appendable) countingAppendable24);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser26 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList27 = annotatingMarkupParser26.getHeaderAnnotations();
        java.lang.String str28 = annotatingMarkupParser26.getRedirect();
        pignlproc.markup.Annotation annotation33 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation38 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int39 = annotation38.end;
        int int40 = annotation38.begin;
        pignlproc.markup.Annotation[] annotationArray41 = new pignlproc.markup.Annotation[] { annotation33, annotation38 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList42 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList42, annotationArray41);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser44 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList45 = annotatingMarkupParser44.getHeaders();
        java.util.List<java.lang.String> strList46 = annotatingMarkupParser44.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList47 = annotatingMarkupParser44.getHeaderAnnotations();
        java.lang.String str48 = annotatingMarkupParser44.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser49 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList50 = annotatingMarkupParser49.getHeaders();
        java.util.List<java.lang.String> strList51 = annotatingMarkupParser49.getHeaders();
        java.lang.Appendable appendable52 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable53 = annotatingMarkupParser49.new CountingAppendable(appendable52);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable54 = annotatingMarkupParser44.new CountingAppendable((java.lang.Appendable) countingAppendable53);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser55 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList56 = annotatingMarkupParser55.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel58 = annotatingMarkupParser55.makeWikiModel("title");
        annotatingMarkupParser26.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList42, (java.lang.Appendable) countingAppendable53, (info.bliki.wiki.model.IWikiModel) wikiModel58);
        annotatingMarkupParser9.nodesToText(annotationList14, (java.lang.Appendable) countingAppendable25, (info.bliki.wiki.model.IWikiModel) wikiModel58);
        int int61 = countingAppendable25.currentPosition;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser62 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList63 = annotatingMarkupParser62.getHeaders();
        java.util.List<java.lang.String> strList64 = annotatingMarkupParser62.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList65 = annotatingMarkupParser62.getHeaderAnnotations();
        java.lang.String str66 = annotatingMarkupParser62.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser67 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList68 = annotatingMarkupParser67.getHeaders();
        java.util.List<java.lang.String> strList69 = annotatingMarkupParser67.getHeaders();
        java.lang.Appendable appendable70 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable71 = annotatingMarkupParser67.new CountingAppendable(appendable70);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable72 = annotatingMarkupParser62.new CountingAppendable((java.lang.Appendable) countingAppendable71);
        info.bliki.wiki.model.WikiModel wikiModel74 = annotatingMarkupParser62.makeWikiModel("\"hi!\"\n");
        annotatingMarkupParser0.nodesToText(annotationList8, (java.lang.Appendable) countingAppendable25, (info.bliki.wiki.model.IWikiModel) wikiModel74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable77 = countingAppendable25.append((java.lang.CharSequence) "\"title\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(annotationList7);
        org.junit.Assert.assertNotNull(annotationList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(annotationList13);
        org.junit.Assert.assertNotNull(annotationList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(annotationList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(annotationList27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(annotationArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(annotationList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(annotationList56);
        org.junit.Assert.assertNotNull(wikiModel58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(annotationList65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(wikiModel74);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("href");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("opennlp/en-sent.bin", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("\"title\"\n", job6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("http://.wikipedia.org/wiki/hi%21\n", job9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("\"hi! \"", job6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        java.lang.String[] strArray10 = uriUriNTriplesLoader3.getPartitionKeys("http://hi!\n.wikipedia.org/wiki/%22_title_%22", job9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple11 = uriUriNTriplesLoader3.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.reflect.Type type13 = noLoopInPath0.getReturnType();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = noLoopInPath0.outputSchema(schema38);
        org.apache.pig.data.Tuple tuple40 = null;
        java.lang.Boolean boolean41 = noLoopInPath0.exec(tuple40);
        org.junit.Assert.assertNull(pigProgressable5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(pigLogger12);
        org.junit.Assert.assertNotNull(type13);
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
        org.junit.Assert.assertEquals("'" + boolean41 + "' != '" + true + "'", boolean41, true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = parsingWikipediaLoader1.getSchema("hi!", job4);
        org.apache.pig.LoadCaster loadCaster6 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("");
        org.junit.Assert.assertNotNull(loadCaster2);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(loadCaster6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        noLoopInPath0.finish();
        org.junit.Assert.assertNull(pigProgressable5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("hi!", "\"hi!\"\n", "http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.cleanupOnFailure("http://.wikipedia.org/wiki/hi%21", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract0.setReporter(pigProgressable4);
        java.lang.reflect.Type type6 = checkAbstract0.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath7 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText8 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        safeTsvText8.setPigLogger(pigLogger9);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText11 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable12 = mergeAsOpenNLPAnnotatedText11.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract13 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema14 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = checkAbstract13.outputSchema(schema14);
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = mergeAsOpenNLPAnnotatedText11.outputSchema(schema14);
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = safeTsvText8.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = noLoopInPath7.outputSchema(schema16);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag19 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText20 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger21 = null;
        safeTsvText20.setPigLogger(pigLogger21);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText23 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable24 = mergeAsOpenNLPAnnotatedText23.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract25 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = checkAbstract25.outputSchema(schema26);
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = mergeAsOpenNLPAnnotatedText23.outputSchema(schema26);
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = safeTsvText20.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = aggregateTextBag19.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = noLoopInPath7.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = checkAbstract0.outputSchema(schema28);
        checkAbstract0.finish();
        org.apache.pig.data.Tuple tuple34 = null;
        java.lang.Boolean boolean35 = checkAbstract0.exec(tuple34);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNull(pigProgressable12);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNull(pigProgressable24);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertEquals("'" + boolean35 + "' != '" + false + "'", boolean35, false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag(0, true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.RecordReader recordReader5 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit6 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader5, pigSplit6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        java.lang.String[] strArray10 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/hi%21", job9);
        org.apache.hadoop.mapreduce.RecordReader recordReader11 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit12 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader11, pigSplit12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple14 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) 'a', false);
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
        pignlproc.evaluation.AggregateTextBag aggregateTextBag15 = new pignlproc.evaluation.AggregateTextBag();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = aggregateTextBag15.outputSchema(schema24);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = noLoopInPath3.outputSchema(schema24);
        pignlproc.evaluation.CheckAbstract checkAbstract28 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum30 = null;
        checkAbstract28.warn("http://.wikipedia.org/wiki/hi%21", enum30);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger32 = null;
        checkAbstract28.setPigLogger(pigLogger32);
        checkAbstract28.progress();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = checkAbstract28.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = noLoopInPath3.outputSchema(schema45);
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = aggregateTextBag2.outputSchema(schema45);
        aggregateTextBag2.progress();
        org.apache.pig.data.Tuple tuple49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = aggregateTextBag2.exec(tuple49);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable8);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(pigProgressable20);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(pigProgressable39);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList3);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList6 = mergeAsOpenNLPAnnotatedText0.getArgToFuncMapping();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText7 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray9 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList10 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList10, spanArray9);
        java.lang.String str12 = mergeAsOpenNLPAnnotatedText7.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList10);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger13 = null;
        mergeAsOpenNLPAnnotatedText7.setPigLogger(pigLogger13);
        boolean boolean15 = mergeAsOpenNLPAnnotatedText7.isAsynchronous();
        pignlproc.evaluation.CheckAbstract checkAbstract16 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum18 = null;
        checkAbstract16.warn("http://.wikipedia.org/wiki/hi%21", enum18);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable20 = null;
        checkAbstract16.setReporter(pigProgressable20);
        java.lang.reflect.Type type22 = checkAbstract16.getReturnType();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = checkAbstract16.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = mergeAsOpenNLPAnnotatedText7.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema44);
        pignlproc.evaluation.CheckAbstract checkAbstract51 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum53 = null;
        checkAbstract51.warn("http://.wikipedia.org/wiki/hi%21", enum53);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger55 = null;
        checkAbstract51.setPigLogger(pigLogger55);
        checkAbstract51.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText58 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger59 = null;
        safeTsvText58.setPigLogger(pigLogger59);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText61 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable62 = mergeAsOpenNLPAnnotatedText61.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract63 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema64 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema65 = checkAbstract63.outputSchema(schema64);
        org.apache.pig.impl.logicalLayer.schema.Schema schema66 = mergeAsOpenNLPAnnotatedText61.outputSchema(schema64);
        org.apache.pig.impl.logicalLayer.schema.Schema schema67 = safeTsvText58.outputSchema(schema66);
        org.apache.pig.impl.logicalLayer.schema.Schema schema68 = checkAbstract51.outputSchema(schema67);
        org.apache.pig.impl.logicalLayer.schema.Schema schema69 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema68);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger70 = null;
        mergeAsOpenNLPAnnotatedText0.setPigLogger(pigLogger70);
        java.lang.Enum enum73 = null;
        mergeAsOpenNLPAnnotatedText0.warn("", enum73);
        org.apache.pig.data.Tuple tuple75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = mergeAsOpenNLPAnnotatedText0.exec(tuple75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi !" + "'", str5, "hi !");
        org.junit.Assert.assertNull(funcSpecList6);
        org.junit.Assert.assertNotNull(spanArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi !" + "'", str12, "hi !");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type22);
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
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(pigProgressable62);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema69);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "\"title\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        org.apache.pig.data.Tuple tuple17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = mergeAsOpenNLPAnnotatedText0.exec(tuple17);
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
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract((int) '4');
        checkAbstract1.finish();
        java.lang.reflect.Type type3 = checkAbstract1.getReturnType();
        java.lang.Class<?> wildcardClass4 = checkAbstract1.getClass();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.RecordReader recordReader2 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit3 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader2, pigSplit3);
        parsingWikipediaLoader1.setUDFContextSignature("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple7 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable23 = countingAppendable21.append((java.lang.CharSequence) "http://\"title\".wikipedia.org/wiki/%22hi%21%22");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("href", "\"opennlp / en - sent . bin\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href" + "'", str2, "http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("hi !");
        org.apache.pig.Expression expression2 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression2);
        org.apache.pig.LoadCaster loadCaster4 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("\"opennlp / en - sent . bin\"", job6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple8 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        pignlproc.evaluation.ConcatTextBag concatTextBag0 = new pignlproc.evaluation.ConcatTextBag();
        org.apache.pig.data.Tuple tuple1 = null;
        java.lang.String str2 = concatTextBag0.exec(tuple1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = concatTextBag0.getReporter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(pigProgressable3);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("", "\"title\"\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://\"title\"\n.wikipedia.org/wiki/" + "'", str2, "http://\"title\"\n.wikipedia.org/wiki/");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21", "hi !", "http://.wikipedia.org/wiki/hi%21\n");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.cleanupOnFailure("hi!\n", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("wikiobject");
        info.bliki.htmlcleaner.TagNode tagNode2 = null;
        info.bliki.wiki.model.ImageFormat imageFormat3 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser4 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList5 = annotatingMarkupParser4.getHeaders();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser4.getHeaders();
        java.lang.Appendable appendable7 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable8 = annotatingMarkupParser4.new CountingAppendable(appendable7);
        java.lang.String str10 = annotatingMarkupParser4.parse("");
        java.util.List<pignlproc.markup.Annotation> annotationList11 = annotatingMarkupParser4.getParagraphAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList12 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser13 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList14 = annotatingMarkupParser13.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser15 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList16 = annotatingMarkupParser15.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList17 = annotatingMarkupParser15.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList18 = annotatingMarkupParser15.getParagraphAnnotations();
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
        java.util.List<pignlproc.markup.Annotation> annotationList31 = annotatingMarkupParser30.getHeaderAnnotations();
        java.lang.String str32 = annotatingMarkupParser30.getRedirect();
        pignlproc.markup.Annotation annotation37 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation42 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int43 = annotation42.end;
        int int44 = annotation42.begin;
        pignlproc.markup.Annotation[] annotationArray45 = new pignlproc.markup.Annotation[] { annotation37, annotation42 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList46 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList46, annotationArray45);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser48 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList49 = annotatingMarkupParser48.getHeaders();
        java.util.List<java.lang.String> strList50 = annotatingMarkupParser48.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList51 = annotatingMarkupParser48.getHeaderAnnotations();
        java.lang.String str52 = annotatingMarkupParser48.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser53 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList54 = annotatingMarkupParser53.getHeaders();
        java.util.List<java.lang.String> strList55 = annotatingMarkupParser53.getHeaders();
        java.lang.Appendable appendable56 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable57 = annotatingMarkupParser53.new CountingAppendable(appendable56);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable58 = annotatingMarkupParser48.new CountingAppendable((java.lang.Appendable) countingAppendable57);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser59 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList60 = annotatingMarkupParser59.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel62 = annotatingMarkupParser59.makeWikiModel("title");
        annotatingMarkupParser30.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList46, (java.lang.Appendable) countingAppendable57, (info.bliki.wiki.model.IWikiModel) wikiModel62);
        annotatingMarkupParser13.nodesToText(annotationList18, (java.lang.Appendable) countingAppendable29, (info.bliki.wiki.model.IWikiModel) wikiModel62);
        int int65 = countingAppendable29.currentPosition;
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
        info.bliki.wiki.model.WikiModel wikiModel78 = annotatingMarkupParser66.makeWikiModel("\"hi!\"\n");
        annotatingMarkupParser4.nodesToText(annotationList12, (java.lang.Appendable) countingAppendable29, (info.bliki.wiki.model.IWikiModel) wikiModel78);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser80 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList81 = annotatingMarkupParser80.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList82 = annotatingMarkupParser80.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList83 = annotatingMarkupParser80.getParagraphAnnotations();
        java.util.List<java.lang.String> strList84 = annotatingMarkupParser80.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList85 = annotatingMarkupParser80.getParagraphAnnotations();
        java.lang.String str86 = annotatingMarkupParser80.getRedirect();
        info.bliki.wiki.model.WikiModel wikiModel88 = annotatingMarkupParser80.makeWikiModel("\"opennlp/en-sent.bin\"");
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser1.imageNodeToText(tagNode2, imageFormat3, (java.lang.Appendable) countingAppendable29, (info.bliki.wiki.model.IWikiModel) wikiModel88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(annotationList11);
        org.junit.Assert.assertNotNull(annotationList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(annotationList17);
        org.junit.Assert.assertNotNull(annotationList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(annotationList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(annotationList31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertNotNull(annotationArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(annotationList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(annotationList60);
        org.junit.Assert.assertNotNull(wikiModel62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(annotationList69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(wikiModel78);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(annotationList82);
        org.junit.Assert.assertNotNull(annotationList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(annotationList85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(wikiModel88);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("", "opennlp / en - sent . bin", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("\"hi!\"\n", job5);
        java.lang.Class<?> wildcardClass7 = resourceSchema6.getClass();
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable37 = countingAppendable27.append((java.lang.CharSequence) "\" title \"", (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable2 = concatTextBag1.getReporter();
        org.junit.Assert.assertNull(pigProgressable2);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.cleanupOnFailure("hi!\n", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "title");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.pig.Expression expression5 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression5);
        org.apache.pig.LoadCaster loadCaster7 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.RecordReader recordReader8 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit9 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader8, pigSplit9);
        org.apache.hadoop.fs.Path path12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = parsingWikipediaLoader1.relativeToAbsolutePath("titlehref", path12);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: titlehref curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(loadCaster7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = uriStringLiteralNTriplesLoader2.getSchema("\"title\"\n", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        java.lang.String[] strArray11 = uriStringLiteralNTriplesLoader2.getPartitionKeys("http://.wikipedia.org/wiki/hi%21", job10);
        org.apache.hadoop.mapreduce.RecordReader recordReader12 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit13 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader12, pigSplit13);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(resourceSchema8);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getParagraphs();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable8 = countingAppendable4.append((java.lang.CharSequence) "opennlp / en - sent . bin", (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.RecordReader recordReader6 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit7 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader6, pigSplit7);
        org.apache.pig.LoadCaster loadCaster9 = uriStringLiteralNTriplesLoader2.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job11 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesLoader2.setLocation("hi!", job11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(loadCaster9);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21\n");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink2 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger3 = null;
        sentencesWithLink2.setPigLogger(pigLogger3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = sentencesWithLink2.getReporter();
        java.lang.reflect.Type type6 = sentencesWithLink2.getReturnType();
        pignlproc.evaluation.SafeTsvText safeTsvText7 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger8 = null;
        safeTsvText7.setPigLogger(pigLogger8);
        safeTsvText7.finish();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink11 = new pignlproc.evaluation.SentencesWithLink();
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
        pignlproc.evaluation.CheckAbstract checkAbstract37 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum39 = null;
        checkAbstract37.warn("http://.wikipedia.org/wiki/hi%21", enum39);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger41 = null;
        checkAbstract37.setPigLogger(pigLogger41);
        checkAbstract37.progress();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = checkAbstract37.outputSchema(schema53);
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = noLoopInPath12.outputSchema(schema54);
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = sentencesWithLink11.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = safeTsvText7.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = sentencesWithLink2.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = concatTextBag1.outputSchema(schema55);
        org.junit.Assert.assertNull(pigProgressable5);
        org.junit.Assert.assertNotNull(type6);
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
        org.junit.Assert.assertNull(pigProgressable48);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.RecordReader recordReader5 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit6 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader5, pigSplit6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        java.lang.String[] strArray10 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/hi%21", job9);
        org.apache.hadoop.mapreduce.InputFormat inputFormat11 = parsingWikipediaLoader1.getInputFormat();
        parsingWikipediaLoader1.setUDFContextSignature("\"\"\"hi!\"\" \"");
        org.apache.hadoop.fs.Path path15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = parsingWikipediaLoader1.relativeToAbsolutePath("\"hi!\"\n\n", path15);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"hi!\"?? curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(inputFormat11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.getAbsolutePath("http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22", path1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://\"hi!\"?.wikipedia.org/wiki/%22hi%21_%22 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        countingAppendable16.currentPosition = ' ';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable55 = countingAppendable16.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("\"hi!\"\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"hi!\"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("", "\"hi! \"", "title");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("\"opennlp / en - sent . bin\"");
        org.apache.hadoop.mapreduce.RecordReader recordReader2 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit3 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader2, pigSplit3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("", "href", "http://.wikipedia.org/wiki/hi%21");
        uriUriNTriplesStorer3.setStoreFuncUDFContextSignature("");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        uriStringLiteralNTriplesStorer1.setStoreFuncUDFContextSignature("\"title\"\n");
        java.lang.Class<?> wildcardClass4 = uriStringLiteralNTriplesStorer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("hi!");
        info.bliki.htmlcleaner.TagNode tagNode2 = null;
        info.bliki.wiki.model.ImageFormat imageFormat3 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser4 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser4.getHeaderAnnotations();
        java.lang.String str6 = annotatingMarkupParser4.getRedirect();
        pignlproc.markup.Annotation annotation11 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation16 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int17 = annotation16.end;
        int int18 = annotation16.begin;
        pignlproc.markup.Annotation[] annotationArray19 = new pignlproc.markup.Annotation[] { annotation11, annotation16 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList20 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList20, annotationArray19);
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
        java.util.List<pignlproc.markup.Annotation> annotationList34 = annotatingMarkupParser33.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel36 = annotatingMarkupParser33.makeWikiModel("title");
        annotatingMarkupParser4.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList20, (java.lang.Appendable) countingAppendable31, (info.bliki.wiki.model.IWikiModel) wikiModel36);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser38 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList39 = annotatingMarkupParser38.getHeaders();
        java.util.List<java.lang.String> strList40 = annotatingMarkupParser38.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList41 = annotatingMarkupParser38.getHeaderAnnotations();
        java.lang.String str42 = annotatingMarkupParser38.getRedirect();
        java.util.List<java.lang.String> strList43 = annotatingMarkupParser38.getParagraphs();
        java.util.List<java.lang.String> strList44 = annotatingMarkupParser38.getParagraphs();
        info.bliki.wiki.model.WikiModel wikiModel46 = annotatingMarkupParser38.makeWikiModel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser1.imageNodeToText(tagNode2, imageFormat3, (java.lang.Appendable) countingAppendable31, (info.bliki.wiki.model.IWikiModel) wikiModel46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(annotationArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(annotationList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(annotationList34);
        org.junit.Assert.assertNotNull(wikiModel36);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(annotationList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(wikiModel46);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) 'a', false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger3 = aggregateTextBag2.getPigLogger();
        org.junit.Assert.assertNull(pigLogger3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "http://.wikipedia.org/wiki/hi%21\n", "http://.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.fs.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = uriStringLiteralNTriplesStorer3.relToAbsPathForStoreLocation("wikiobject", path5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: wikiobject curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.Class<?> wildcardClass57 = schema49.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.apache.pig.data.Tuple tuple11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = safeTsvText0.exec(tuple11);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("hi !\n");
        uriUriNTriplesStorer1.setStoreFuncUDFContextSignature("http://hi!\n.wikipedia.org/wiki/%22_title_%22");
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        uriStringLiteralNTriplesStorer1.setStoreFuncUDFContextSignature("\"opennlp / en - sent . bin\"");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.InputFormat inputFormat9 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = uriUriNTriplesLoader3.getSchema("wikiobject", job11);
        org.apache.hadoop.fs.Path path14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = uriUriNTriplesLoader3.relativeToAbsolutePath("hi!", path14);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: hi! curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(inputFormat9);
        org.junit.Assert.assertNotNull(resourceSchema12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.fs.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", path3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        java.lang.String[] strArray3 = uriUriNTriplesLoader0.getPartitionKeys("title", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader0.getSchema("http://.wikipedia.org/wiki/hi%21", job5);
        org.apache.hadoop.mapreduce.RecordReader recordReader7 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit8 = null;
        uriUriNTriplesLoader0.prepareToRead(recordReader7, pigSplit8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = uriUriNTriplesLoader0.getSchema("opennlp/en-sent.bin", job11);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(resourceSchema12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader0 = new pignlproc.storage.UriStringLiteralNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceSchema resourceSchema3 = uriStringLiteralNTriplesLoader0.getSchema("", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceStatistics resourceStatistics6 = uriStringLiteralNTriplesLoader0.getStatistics("opennlp/en-sent.bin", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceSchema resourceSchema9 = uriStringLiteralNTriplesLoader0.getSchema("\"opennlp / en - sent . bin\"", job8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple10 = uriStringLiteralNTriplesLoader0.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema3);
        org.junit.Assert.assertNull(resourceStatistics6);
        org.junit.Assert.assertNotNull(resourceSchema9);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("opennlp/en-sent.bin", "hi!", "\"hi!\"\n");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.setStoreLocation("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = sentencesWithLink0.getReporter();
        sentencesWithLink0.progress();
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(pigProgressable11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.apache.pig.data.Tuple tuple41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag42 = sentencesWithLink0.exec(tuple41);
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.apache.pig.data.Tuple tuple11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag12 = sentencesWithLink0.exec(tuple11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("", "\"\"\"hi!\"\" \"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://\"\"\"hi!\"\" \".wikipedia.org/wiki/" + "'", str2, "http://\"\"\"hi!\"\" \".wikipedia.org/wiki/");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple5 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) '#', false);
        java.lang.reflect.Type type3 = aggregateTextBag2.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract4 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum6 = null;
        checkAbstract4.warn("http://.wikipedia.org/wiki/hi%21", enum6);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable8 = null;
        checkAbstract4.setReporter(pigProgressable8);
        java.lang.reflect.Type type10 = checkAbstract4.getReturnType();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = checkAbstract4.outputSchema(schema32);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = aggregateTextBag2.outputSchema(schema36);
        boolean boolean38 = aggregateTextBag2.isAsynchronous();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type10);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("hi!");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser2 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser2.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser2.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser2.getParagraphAnnotations();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser2.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser2.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser8 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser8.getHeaderAnnotations();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser8.getParagraphs();
        java.lang.Appendable appendable11 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable12 = annotatingMarkupParser8.new CountingAppendable(appendable11);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable13 = annotatingMarkupParser2.new CountingAppendable((java.lang.Appendable) countingAppendable12);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable14 = annotatingMarkupParser1.new CountingAppendable((java.lang.Appendable) countingAppendable12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable16 = countingAppendable12.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(annotationList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(annotationList7);
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.RecordReader recordReader6 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit7 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader6, pigSplit7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple9 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.InputFormat inputFormat6 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.pig.Expression expression7 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression7);
        org.apache.hadoop.fs.Path path10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = uriStringLiteralNTriplesLoader2.relativeToAbsolutePath("\"hi!\"\n", path10);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"hi!\"? curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        safeTsvText0.setPigLogger(pigLogger1);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText3 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = mergeAsOpenNLPAnnotatedText3.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract5 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema6 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = checkAbstract5.outputSchema(schema6);
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = mergeAsOpenNLPAnnotatedText3.outputSchema(schema6);
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = safeTsvText0.outputSchema(schema8);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger10 = safeTsvText0.getPigLogger();
        org.apache.pig.data.Tuple tuple11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = safeTsvText0.exec(tuple11);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertNotNull(schema7);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNull(pigLogger10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        boolean boolean46 = sentencesWithLink0.isAsynchronous();
        boolean boolean47 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger48 = null;
        sentencesWithLink0.setPigLogger(pigLogger48);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("hi!");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser2 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser2.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser2.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser2.getParagraphAnnotations();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser2.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser2.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser8 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser8.getHeaderAnnotations();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser8.getParagraphs();
        java.lang.Appendable appendable11 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable12 = annotatingMarkupParser8.new CountingAppendable(appendable11);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable13 = annotatingMarkupParser2.new CountingAppendable((java.lang.Appendable) countingAppendable12);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable14 = annotatingMarkupParser1.new CountingAppendable((java.lang.Appendable) countingAppendable12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable18 = countingAppendable12.append((java.lang.CharSequence) "hi !", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(annotationList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(annotationList7);
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("\"hi!\"\n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) (byte) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("\" title \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\" title \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        checkAbstract0.finish();
        org.apache.commons.logging.Log log4 = checkAbstract0.getLogger();
        checkAbstract0.finish();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.apache.hadoop.fs.Path path15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = parsingWikipediaLoader1.relativeToAbsolutePath("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", path15);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://http://hi!?.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "http://\"\"\"hi!\"\" \".wikipedia.org/wiki/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        parsingWikipediaLoader1.setUDFContextSignature("title");
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceStatistics resourceStatistics12 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/hi%21", job11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple13 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
        org.junit.Assert.assertNull(resourceStatistics12);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.apache.pig.data.Tuple tuple23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag24 = sentencesWithLink0.exec(tuple23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("\"title\"");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser0.makeWikiModel("title");
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(wikiModel3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        pignlproc.evaluation.ConcatTextBag concatTextBag0 = new pignlproc.evaluation.ConcatTextBag();
        org.apache.pig.data.Tuple tuple1 = null;
        java.lang.String str2 = concatTextBag0.exec(tuple1);
        java.lang.Enum enum4 = null;
        concatTextBag0.warn("href", enum4);
        pignlproc.evaluation.CheckAbstract checkAbstract6 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = checkAbstract6.outputSchema(schema7);
        checkAbstract6.finish();
        java.lang.Enum enum11 = null;
        checkAbstract6.warn("href", enum11);
        pignlproc.evaluation.CheckAbstract checkAbstract13 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum15 = null;
        checkAbstract13.warn("http://.wikipedia.org/wiki/hi%21", enum15);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = null;
        checkAbstract13.setReporter(pigProgressable17);
        java.lang.reflect.Type type19 = checkAbstract13.getReturnType();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = checkAbstract13.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = checkAbstract6.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = concatTextBag0.outputSchema(schema41);
        java.lang.Class<?> wildcardClass48 = concatTextBag0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(schema8);
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
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("\"hi!\"\n", "");
        org.apache.pig.Expression expression3 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression3);
        uriStringLiteralNTriplesLoader2.setUDFContextSignature("\"hi! \"");
        org.apache.hadoop.mapreduce.Job job8 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesLoader2.setLocation("http://\"title\".wikipedia.org/wiki/%22hi%21%22", job8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum2 = null;
        safeTsvText0.warn("opennlp/en-sent.bin", enum2);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList4 = safeTsvText0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = safeTsvText0.getReporter();
        pignlproc.evaluation.AggregateTextBag aggregateTextBag8 = new pignlproc.evaluation.AggregateTextBag((-1), false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable9 = null;
        aggregateTextBag8.setReporter(pigProgressable9);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText11 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray13 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList14 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList14, spanArray13);
        java.lang.String str16 = mergeAsOpenNLPAnnotatedText11.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList14);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList17 = mergeAsOpenNLPAnnotatedText11.getArgToFuncMapping();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray20 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList21 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList21, spanArray20);
        java.lang.String str23 = mergeAsOpenNLPAnnotatedText18.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList21);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger24 = null;
        mergeAsOpenNLPAnnotatedText18.setPigLogger(pigLogger24);
        boolean boolean26 = mergeAsOpenNLPAnnotatedText18.isAsynchronous();
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum29 = null;
        checkAbstract27.warn("http://.wikipedia.org/wiki/hi%21", enum29);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable31 = null;
        checkAbstract27.setReporter(pigProgressable31);
        java.lang.reflect.Type type33 = checkAbstract27.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath34 = new pignlproc.evaluation.NoLoopInPath();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = noLoopInPath34.outputSchema(schema43);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag46 = new pignlproc.evaluation.AggregateTextBag();
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
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = aggregateTextBag46.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = noLoopInPath34.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = checkAbstract27.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = mergeAsOpenNLPAnnotatedText11.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = aggregateTextBag8.outputSchema(schema55);
        pignlproc.evaluation.CheckAbstract checkAbstract63 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum65 = null;
        checkAbstract63.warn("http://.wikipedia.org/wiki/hi%21", enum65);
        java.lang.Enum enum68 = null;
        checkAbstract63.warn("hi !", enum68);
        pignlproc.evaluation.NoLoopInPath noLoopInPath70 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText71 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger72 = null;
        safeTsvText71.setPigLogger(pigLogger72);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText74 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable75 = mergeAsOpenNLPAnnotatedText74.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract76 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema77 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema78 = checkAbstract76.outputSchema(schema77);
        org.apache.pig.impl.logicalLayer.schema.Schema schema79 = mergeAsOpenNLPAnnotatedText74.outputSchema(schema77);
        org.apache.pig.impl.logicalLayer.schema.Schema schema80 = safeTsvText71.outputSchema(schema79);
        org.apache.pig.impl.logicalLayer.schema.Schema schema81 = noLoopInPath70.outputSchema(schema79);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag82 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText83 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger84 = null;
        safeTsvText83.setPigLogger(pigLogger84);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText86 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable87 = mergeAsOpenNLPAnnotatedText86.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract88 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema89 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema90 = checkAbstract88.outputSchema(schema89);
        org.apache.pig.impl.logicalLayer.schema.Schema schema91 = mergeAsOpenNLPAnnotatedText86.outputSchema(schema89);
        org.apache.pig.impl.logicalLayer.schema.Schema schema92 = safeTsvText83.outputSchema(schema91);
        org.apache.pig.impl.logicalLayer.schema.Schema schema93 = aggregateTextBag82.outputSchema(schema91);
        org.apache.pig.impl.logicalLayer.schema.Schema schema94 = noLoopInPath70.outputSchema(schema91);
        org.apache.pig.impl.logicalLayer.schema.Schema schema95 = checkAbstract63.outputSchema(schema94);
        org.apache.pig.impl.logicalLayer.schema.Schema schema96 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema97 = checkAbstract63.outputSchema(schema96);
        org.apache.pig.impl.logicalLayer.schema.Schema schema98 = aggregateTextBag8.outputSchema(schema96);
        org.apache.pig.impl.logicalLayer.schema.Schema schema99 = safeTsvText0.outputSchema(schema98);
        org.junit.Assert.assertNull(funcSpecList4);
        org.junit.Assert.assertNull(pigProgressable5);
        org.junit.Assert.assertNotNull(spanArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi !" + "'", str16, "hi !");
        org.junit.Assert.assertNull(funcSpecList17);
        org.junit.Assert.assertNotNull(spanArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi !" + "'", str23, "hi !");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNull(pigProgressable39);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(pigProgressable51);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNull(pigProgressable75);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNull(pigProgressable87);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNotNull(schema91);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNotNull(schema93);
        org.junit.Assert.assertNotNull(schema94);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNotNull(schema97);
        org.junit.Assert.assertNotNull(schema98);
        org.junit.Assert.assertNotNull(schema99);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        safeTsvText0.progress();
        org.apache.pig.data.Tuple tuple55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = safeTsvText0.exec(tuple55);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", "hi !", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.cleanupOnFailure("opennlp/en-sent.bin", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.AbstractCollection<java.lang.String> strCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.join(strCollection0, "\"http://.wikipedia.org/wiki/hi%21\"\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = null;
        sentencesWithLink0.setPigLogger(pigLogger4);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = sentencesWithLink0.getPigLogger();
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNull(pigLogger6);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = uriStringLiteralNTriplesLoader2.getSchema("\"title\"\n", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceStatistics resourceStatistics11 = uriStringLiteralNTriplesLoader2.getStatistics("hi !\n", job10);
        org.apache.pig.LoadCaster loadCaster12 = uriStringLiteralNTriplesLoader2.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceSchema resourceSchema15 = uriStringLiteralNTriplesLoader2.getSchema("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", job14);
        org.apache.pig.Expression expression16 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression16);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(resourceSchema8);
        org.junit.Assert.assertNull(resourceStatistics11);
        org.junit.Assert.assertNotNull(loadCaster12);
        org.junit.Assert.assertNotNull(resourceSchema15);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        uriStringLiteralNTriplesStorer1.setStoreFuncUDFContextSignature("http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
        org.apache.hadoop.fs.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("\"title\"", path6);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"title\" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        pignlproc.evaluation.SentencesWithLink sentencesWithLink25 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger26 = null;
        sentencesWithLink25.setPigLogger(pigLogger26);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList28 = sentencesWithLink25.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger29 = sentencesWithLink25.getPigLogger();
        boolean boolean30 = sentencesWithLink25.isAsynchronous();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink31 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger32 = null;
        sentencesWithLink31.setPigLogger(pigLogger32);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable34 = sentencesWithLink31.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable35 = null;
        sentencesWithLink31.setReporter(pigProgressable35);
        sentencesWithLink31.progress();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText38 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray40 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList41 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList41, spanArray40);
        java.lang.String str43 = mergeAsOpenNLPAnnotatedText38.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList41);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText45 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray47 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList48 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList48, spanArray47);
        java.lang.String str50 = mergeAsOpenNLPAnnotatedText45.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList48);
        java.lang.String str51 = mergeAsOpenNLPAnnotatedText38.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList48);
        pignlproc.evaluation.SafeTsvText safeTsvText52 = new pignlproc.evaluation.SafeTsvText();
        java.lang.reflect.Type type53 = safeTsvText52.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract54 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = checkAbstract54.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = safeTsvText52.outputSchema(schema56);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = mergeAsOpenNLPAnnotatedText38.outputSchema(schema56);
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = sentencesWithLink31.outputSchema(schema56);
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = sentencesWithLink25.outputSchema(schema56);
        pignlproc.evaluation.CheckAbstract checkAbstract61 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum63 = null;
        checkAbstract61.warn("http://.wikipedia.org/wiki/hi%21", enum63);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable65 = checkAbstract61.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger66 = checkAbstract61.getPigLogger();
        boolean boolean67 = checkAbstract61.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable68 = null;
        checkAbstract61.setReporter(pigProgressable68);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList70 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) schema24, (java.lang.Object) schema56, (java.lang.Object) checkAbstract61);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.pig.impl.logicalLayer.schema.Schema cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(funcSpecList28);
        org.junit.Assert.assertNull(pigLogger29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(pigProgressable34);
        org.junit.Assert.assertNotNull(spanArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi !" + "'", str43, "hi !");
        org.junit.Assert.assertNotNull(spanArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "href" + "'", str50, "href");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi !" + "'", str51, "hi !");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNull(pigProgressable65);
        org.junit.Assert.assertNull(pigLogger66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("");
        mergeAsOpenNLPAnnotatedText1.progress();
        boolean boolean3 = mergeAsOpenNLPAnnotatedText1.isAsynchronous();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText5 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray7 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList8 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList8, spanArray7);
        java.lang.String str10 = mergeAsOpenNLPAnnotatedText5.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList8);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        mergeAsOpenNLPAnnotatedText5.setPigLogger(pigLogger11);
        boolean boolean13 = mergeAsOpenNLPAnnotatedText5.isAsynchronous();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText15 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray17 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList18 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList18, spanArray17);
        java.lang.String str20 = mergeAsOpenNLPAnnotatedText15.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList18);
        java.lang.String str21 = mergeAsOpenNLPAnnotatedText5.merge("opennlp/en-sent.bin", (java.util.List<opennlp.tools.util.Span>) spanList18);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText23 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable24 = mergeAsOpenNLPAnnotatedText23.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract25 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = checkAbstract25.outputSchema(schema26);
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = mergeAsOpenNLPAnnotatedText23.outputSchema(schema26);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText30 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray32 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList33 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList33, spanArray32);
        java.lang.String str35 = mergeAsOpenNLPAnnotatedText30.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList33);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText37 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray39 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList40 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList40, spanArray39);
        java.lang.String str42 = mergeAsOpenNLPAnnotatedText37.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList40);
        java.lang.String str43 = mergeAsOpenNLPAnnotatedText30.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList40);
        java.lang.String str44 = mergeAsOpenNLPAnnotatedText23.merge("title", (java.util.List<opennlp.tools.util.Span>) spanList40);
        java.lang.String str45 = mergeAsOpenNLPAnnotatedText5.merge("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", (java.util.List<opennlp.tools.util.Span>) spanList40);
        java.lang.String str46 = mergeAsOpenNLPAnnotatedText1.merge("hi!\n", (java.util.List<opennlp.tools.util.Span>) spanList40);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable47 = null;
        mergeAsOpenNLPAnnotatedText1.setReporter(pigProgressable47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(spanArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi !" + "'", str10, "hi !");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(spanArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "href" + "'", str20, "href");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "opennlp / en - sent . bin" + "'", str21, "opennlp / en - sent . bin");
        org.junit.Assert.assertNull(pigProgressable24);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(spanArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi !" + "'", str35, "hi !");
        org.junit.Assert.assertNotNull(spanArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "href" + "'", str42, "href");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi !" + "'", str43, "hi !");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "title" + "'", str44, "title");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21" + "'", str45, "http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi !" + "'", str46, "hi !");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag(0);
        org.apache.commons.logging.Log log2 = aggregateTextBag1.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = null;
        aggregateTextBag1.setReporter(pigProgressable3);
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = aggregateTextBag1.exec(tuple5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        org.apache.pig.data.Tuple tuple2 = null;
        java.lang.String str3 = concatTextBag1.exec(tuple2);
        concatTextBag1.finish();
        java.lang.Class<?> wildcardClass5 = concatTextBag1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"" + "'", str1, "\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader0 = new pignlproc.storage.UriStringLiteralNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceSchema resourceSchema3 = uriStringLiteralNTriplesLoader0.getSchema("", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriStringLiteralNTriplesLoader0.getSchema("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceSchema resourceSchema9 = uriStringLiteralNTriplesLoader0.getSchema("hi !", job8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple10 = uriStringLiteralNTriplesLoader0.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema3);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(resourceSchema9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.apache.hadoop.fs.Path path23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = uriUriNTriplesLoader3.relativeToAbsolutePath("\"\"", path23);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"\" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(inputFormat9);
        org.junit.Assert.assertNotNull(resourceSchema12);
        org.junit.Assert.assertNull(resourceStatistics15);
        org.junit.Assert.assertNotNull(resourceSchema21);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader0 = new pignlproc.storage.UriStringLiteralNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceSchema resourceSchema3 = uriStringLiteralNTriplesLoader0.getSchema("", job2);
        org.apache.pig.Expression expression4 = null;
        uriStringLiteralNTriplesLoader0.setPartitionFilter(expression4);
        org.junit.Assert.assertNotNull(resourceSchema3);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("hi !\n");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("\"hi!\"", job6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceSchema resourceSchema10 = parsingWikipediaLoader1.getSchema("\"hi!\"\n", job9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = parsingWikipediaLoader1.getSchema("http://.wikipedia.org/wiki/hi%21\n", job12);
        parsingWikipediaLoader1.setUDFContextSignature("http://http://.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/hi_%21");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple16 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
        org.junit.Assert.assertNotNull(resourceSchema10);
        org.junit.Assert.assertNotNull(resourceSchema13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("hi!");
        java.lang.Enum enum3 = null;
        noLoopInPath1.warn("\"http://.wikipedia.org/wiki/hi%21\"\n\n", enum3);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"title\"\n", "\" title \"", "\"title\"");
        java.lang.Class<?> wildcardClass4 = uriUriNTriplesLoader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        boolean boolean15 = mergeAsOpenNLPAnnotatedText0.isAsynchronous();
        org.apache.pig.data.Tuple tuple16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = mergeAsOpenNLPAnnotatedText0.exec(tuple16);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("opennlp / en - sent . bin", job4);
        org.apache.pig.LoadCaster loadCaster6 = uriStringLiteralNTriplesLoader2.getLoadCaster();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple7 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(loadCaster6);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("\"title\"\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("http://.wikipedia.org/wiki/hi%21\n");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple8 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("hi !\n");
        uriUriNTriplesStorer1.setStoreFuncUDFContextSignature("http://hi!\n.wikipedia.org/wiki/%22_title_%22");
        java.lang.Class<?> wildcardClass4 = uriUriNTriplesStorer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("hi !", "title", "title");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"" + "'", str1, "\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser0.makeWikiModel("title");
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser8 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser8.getHeaders();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser8.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList11 = annotatingMarkupParser8.getHeaderAnnotations();
        java.lang.String str12 = annotatingMarkupParser8.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser13 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser13.getHeaders();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser13.getHeaders();
        java.lang.Appendable appendable16 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable17 = annotatingMarkupParser13.new CountingAppendable(appendable16);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable18 = annotatingMarkupParser8.new CountingAppendable((java.lang.Appendable) countingAppendable17);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser19 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser19.getHeaders();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser19.getHeaders();
        java.lang.Appendable appendable22 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable23 = annotatingMarkupParser19.new CountingAppendable(appendable22);
        countingAppendable23.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable26 = annotatingMarkupParser8.new CountingAppendable((java.lang.Appendable) countingAppendable23);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable27 = annotatingMarkupParser7.new CountingAppendable((java.lang.Appendable) countingAppendable26);
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
        java.util.List<java.lang.String> strList39 = annotatingMarkupParser28.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel41 = annotatingMarkupParser28.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser42 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList43 = annotatingMarkupParser42.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList44 = annotatingMarkupParser42.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel46 = annotatingMarkupParser42.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel48 = annotatingMarkupParser42.makeWikiModel("hi!\n");
        java.util.List<pignlproc.markup.Annotation> annotationList49 = annotatingMarkupParser42.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser50 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList51 = annotatingMarkupParser50.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList52 = annotatingMarkupParser50.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList53 = annotatingMarkupParser50.getParagraphAnnotations();
        java.util.List<java.lang.String> strList54 = annotatingMarkupParser50.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList55 = annotatingMarkupParser50.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser56 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList57 = annotatingMarkupParser56.getHeaderAnnotations();
        java.util.List<java.lang.String> strList58 = annotatingMarkupParser56.getParagraphs();
        java.lang.Appendable appendable59 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable60 = annotatingMarkupParser56.new CountingAppendable(appendable59);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable61 = annotatingMarkupParser50.new CountingAppendable((java.lang.Appendable) countingAppendable60);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser62 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList63 = annotatingMarkupParser62.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList64 = annotatingMarkupParser62.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel66 = annotatingMarkupParser62.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel68 = annotatingMarkupParser62.makeWikiModel("hi!\n");
        annotatingMarkupParser28.nodesToText(annotationList49, (java.lang.Appendable) countingAppendable61, (info.bliki.wiki.model.IWikiModel) wikiModel68);
        annotatingMarkupParser0.nodesToText(annotationList5, (java.lang.Appendable) countingAppendable26, (info.bliki.wiki.model.IWikiModel) wikiModel68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable74 = countingAppendable26.append((java.lang.CharSequence) "\"http://.wikipedia.org/wiki/hi%21\"\n", (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(wikiModel3);
        org.junit.Assert.assertNotNull(annotationList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(annotationList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(annotationList31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(wikiModel41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(annotationList44);
        org.junit.Assert.assertNotNull(wikiModel46);
        org.junit.Assert.assertNotNull(wikiModel48);
        org.junit.Assert.assertNotNull(annotationList49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(annotationList52);
        org.junit.Assert.assertNotNull(annotationList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(annotationList55);
        org.junit.Assert.assertNotNull(annotationList57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(annotationList64);
        org.junit.Assert.assertNotNull(wikiModel66);
        org.junit.Assert.assertNotNull(wikiModel68);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("http://.wikipedia.org/wiki/hi%21\n", job6);
        org.apache.hadoop.mapreduce.InputFormat inputFormat8 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job10 = null;
        java.lang.String[] strArray11 = uriUriNTriplesLoader3.getPartitionKeys("http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522", job10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        org.apache.pig.ResourceSchema resourceSchema14 = uriUriNTriplesLoader3.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job13);
        org.apache.hadoop.mapreduce.Job job16 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader3.setLocation("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", job16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: http :%20/%20http%20:%20/%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021%20.%20wikipedia%20.%20org%20/%20wiki%20/%20hi%20%25%2021");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
        org.junit.Assert.assertNotNull(inputFormat8);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(resourceSchema14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = mergeAsOpenNLPAnnotatedText0.getPigLogger();
        mergeAsOpenNLPAnnotatedText0.progress();
        org.junit.Assert.assertNull(pigLogger1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable2 = null;
        concatTextBag1.setReporter(pigProgressable2);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList4 = concatTextBag1.getArgToFuncMapping();
        org.junit.Assert.assertNull(funcSpecList4);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList18 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) uriStringLiteralNTriplesStorer1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: pignlproc.storage.UriStringLiteralNTriplesStorer cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
        org.junit.Assert.assertNull(resourceStatistics11);
        org.junit.Assert.assertNotNull(resourceSchema14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http://\"\"\"hi!\"\" \".wikipedia.org/wiki/");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.setStoreLocation("http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setMinInputSplitSize(job0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.apache.hadoop.fs.Path path18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"", path18);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
        org.junit.Assert.assertNull(resourceStatistics11);
        org.junit.Assert.assertNotNull(resourceSchema14);
    }
}

