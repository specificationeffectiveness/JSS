package org.plista.kornakapi;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.ITEM_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "itemID" + "'", str0, "itemID");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.String str0 = org.plista.kornakapi.core.training.TrainRecommenderJob.RECOMMENDER_NAME_PARAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str0, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.USER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "userID" + "'", str0, "userID");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.plista.kornakapi.web.Parameters.DEFAULT_BATCH_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000 + "'", int0 == 10000);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = org.plista.kornakapi.web.Parameters.DEFAULT_HOW_MANY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext1 = batchDeleteCandidatesServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.Class<?> wildcardClass1 = batchDeleteCandidatesServlet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.FILE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file" + "'", str0, "file");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.LABEL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "label" + "'", str0, "label");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.RECOMMENDER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "recommender" + "'", str0, "recommender");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.apache.mahout.cf.taste.model.DataModel dataModel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.recommender.CachingAllUnknownItemsCandidateItemsStrategy cachingAllUnknownItemsCandidateItemsStrategy1 = new org.plista.kornakapi.core.recommender.CachingAllUnknownItemsCandidateItemsStrategy(dataModel0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        javax.servlet.ServletRequest servletRequest1 = null;
        javax.servlet.ServletResponse servletResponse2 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.service(servletRequest1, servletResponse2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fixedCandidatesIDRescorer1.isFiltered((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.io.CSVPreferenceFileIterator cSVPreferenceFileIterator1 = new org.plista.kornakapi.core.io.CSVPreferenceFileIterator(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("userID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = org.plista.kornakapi.core.config.RecommenderConfig.DONT_RETRAIN_ON_PREFERENCE_CHANGES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet0.log("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) missingParameterException3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.BATCH_SIZE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "batchSize" + "'", str0, "batchSize");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringLongPairRescorer5.isFiltered(longPair6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair3 = null;
        double double5 = filteringLongPairRescorer2.rescore(longPair3, (double) '4');
        org.apache.mahout.common.LongPair longPair6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringLongPairRescorer2.isFiltered(longPair6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        org.plista.kornakapi.core.storage.Storage storage1 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap2 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap3 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler5 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener8 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler5, "itemID", (int) '#');
        org.plista.kornakapi.web.Components.init(configuration0, storage1, strMap2, strMap3, trainingScheduler4, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener8);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext2 = batchDeleteCandidatesServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.HOW_MANY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "howMany" + "'", str0, "howMany");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("hi!");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not h (position: START_DOCUMENT seen h... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("recommender", (java.lang.Throwable) missingParameterException3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = batchDeleteCandidatesServlet1.getInitParameter("userID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        org.plista.kornakapi.core.storage.Storage storage1 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap2 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap3 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener5 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener5.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage1, strMap2, strMap3, trainingScheduler4, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer1.train(file2, storage3, recommender4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file4 = null;
        org.plista.kornakapi.core.storage.Storage storage5 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer3.train(file4, storage5, recommender6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer1.train(file2, storage3, recommender4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.io.CSVCandidateFileIterator cSVCandidateFileIterator1 = new org.plista.kornakapi.core.io.CSVCandidateFileIterator(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = batchSetPreferencesServlet1.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = fixedCandidatesIDRescorer1.isFiltered((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fixedCandidatesIDRescorer1.isFiltered((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        java.lang.Class<?> wildcardClass3 = filteringLongPairRescorer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.apache.mahout.cf.taste.impl.recommender.svd.Factorization factorization0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.recommender.FoldingFactorization foldingFactorization1 = new org.plista.kornakapi.core.recommender.FoldingFactorization(factorization0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = batchDeleteCandidatesServlet0.getInitParameter("itemID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.mahout.cf.taste.model.DataModel dataModel0 = null;
        org.apache.mahout.cf.taste.recommender.CandidateItemsStrategy candidateItemsStrategy1 = null;
        org.apache.mahout.cf.taste.impl.recommender.svd.PersistenceStrategy persistenceStrategy2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.recommender.FoldingFactorizationBasedRecommender foldingFactorizationBasedRecommender3 = new org.plista.kornakapi.core.recommender.FoldingFactorizationBasedRecommender(dataModel0, candidateItemsStrategy1, persistenceStrategy2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.lang.Class<?> wildcardClass3 = multithreadedItembasedInMemoryTrainer2.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("itemID");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not i (position: START_DOCUMENT seen i... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        javax.servlet.ServletRequest servletRequest1 = null;
        javax.servlet.ServletResponse servletResponse2 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet0.service(servletRequest1, servletResponse2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException5.addSuppressed((java.lang.Throwable) missingParameterException7);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("userID", (java.lang.Throwable) missingParameterException5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException1.addSuppressed((java.lang.Throwable) missingParameterException3);
        java.lang.String str5 = missingParameterException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str5, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet1.log("file");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.ITEM_IDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "itemIDs" + "'", str0, "itemIDs");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.String str0 = org.plista.kornakapi.web.Parameters.VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "value" + "'", str0, "value");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet2.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.mahout.cf.taste.model.DataModel dataModel0 = null;
        org.apache.mahout.cf.taste.similarity.ItemSimilarity itemSimilarity1 = null;
        org.apache.mahout.cf.taste.recommender.CandidateItemsStrategy candidateItemsStrategy2 = null;
        org.apache.mahout.cf.taste.recommender.MostSimilarItemsCandidateItemsStrategy mostSimilarItemsCandidateItemsStrategy3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.recommender.ItemSimilarityBasedRecommender itemSimilarityBasedRecommender4 = new org.plista.kornakapi.core.recommender.ItemSimilarityBasedRecommender(dataModel0, itemSimilarity1, candidateItemsStrategy2, mostSimilarItemsCandidateItemsStrategy3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file4 = null;
        org.plista.kornakapi.core.storage.Storage storage5 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer3.train(file4, storage5, recommender6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("howMany");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not h (position: START_DOCUMENT seen h... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        long long1 = mutablePreference0.getItemID();
        java.lang.Class<?> wildcardClass2 = mutablePreference0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.plista.kornakapi.core.training.TrainRecommenderJob trainRecommenderJob0 = new org.plista.kornakapi.core.training.TrainRecommenderJob();
        org.quartz.JobExecutionContext jobExecutionContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            trainRecommenderJob0.execute(jobExecutionContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file4 = null;
        org.plista.kornakapi.core.storage.Storage storage5 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer3.train(file4, storage5, recommender6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str6 = factorizationbasedRecommenderConfig0.getName();
        java.lang.Class<?> wildcardClass7 = factorizationbasedRecommenderConfig0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.plista.kornakapi.web.servlets.BigBangServletContextListener bigBangServletContextListener0 = new org.plista.kornakapi.web.servlets.BigBangServletContextListener();
        javax.servlet.ServletContextEvent servletContextEvent1 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent1);
        javax.servlet.ServletContextEvent servletContextEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigBangServletContextListener0.contextInitialized(servletContextEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalStateException: configuration file not set!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer1.train(file2, storage3, recommender4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = deleteCandidateServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("value");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not v (position: START_DOCUMENT seen v... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = addCandidateServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = setPreferenceServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer1.train(file2, storage3, recommender4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer1.train(file2, storage3, recommender4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext1 = batchSetPreferencesServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = batchDeleteCandidatesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = batchDeleteCandidatesServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext1 = addCandidateServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        org.plista.kornakapi.core.storage.Storage storage7 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap8 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap9 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler10 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler11 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener14 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler11, "itemID", (int) '#');
        inMemoryPreferenceChangeListener14.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage7, strMap8, strMap9, trainingScheduler10, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, (double) 10L);
        org.apache.mahout.common.LongPair longPair9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringLongPairRescorer5.isFiltered(longPair9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = batchDeleteCandidatesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer1.train(file2, storage3, recommender4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, 52.0d);
        org.apache.mahout.common.LongPair longPair9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringLongPairRescorer5.isFiltered(longPair9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = batchDeleteCandidatesServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet1.service(servletRequest3, servletResponse4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair3 = null;
        double double5 = filteringLongPairRescorer2.rescore(longPair3, 52.0d);
        org.apache.mahout.common.LongPair longPair6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringLongPairRescorer2.isFiltered(longPair6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException12 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.MissingParameterException missingParameterException15 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException15.addSuppressed((java.lang.Throwable) missingParameterException17);
        invalidParameterException13.addSuppressed((java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.MissingParameterException missingParameterException23 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException24 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException23);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException25 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException23);
        org.plista.kornakapi.web.MissingParameterException missingParameterException27 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException29 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException27.addSuppressed((java.lang.Throwable) missingParameterException29);
        invalidParameterException25.addSuppressed((java.lang.Throwable) missingParameterException29);
        missingParameterException17.addSuppressed((java.lang.Throwable) missingParameterException29);
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet5.log("recommender", (java.lang.Throwable) missingParameterException17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("itemID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        java.lang.Class<?> wildcardClass2 = storageConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "org.plista.kornakapi.web.MissingParameterException: itemID", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException9 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException7.addSuppressed((java.lang.Throwable) missingParameterException9);
        invalidParameterException5.addSuppressed((java.lang.Throwable) missingParameterException9);
        java.lang.String str12 = missingParameterException9.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str12, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext1 = recommendServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = fixedCandidatesIDRescorer1.isFiltered(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file4 = null;
        org.plista.kornakapi.core.storage.Storage storage5 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer3.train(file4, storage5, recommender6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap4 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap5 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler6 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler7 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener10 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler7, "label", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage3, strMap4, strMap5, trainingScheduler6, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = batchSetPreferencesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig3);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer4.train(file5, storage6, recommender7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.service(servletRequest3, servletResponse4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer4.train(file5, storage6, recommender7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        // The following exception was thrown during execution in test generation
        try {
            deleteCandidateServlet0.log("MutablePreference{userID=100, itemID=0, value=0.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = recommendServlet5.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException9 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException7.addSuppressed((java.lang.Throwable) missingParameterException9);
        invalidParameterException5.addSuppressed((java.lang.Throwable) missingParameterException9);
        java.lang.Throwable[] throwableArray12 = missingParameterException9.getSuppressed();
        java.lang.String str13 = missingParameterException9.toString();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str13, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = recommendServlet0.getInitParameter("file");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("MutablePreference{userID=0, itemID=0, value=1.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(0);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file7 = null;
        org.plista.kornakapi.core.storage.Storage storage8 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender9 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer6.train(file7, storage8, recommender9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet0 = new org.plista.kornakapi.web.servlets.TrainServlet();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext1 = trainServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer1.train(file2, storage3, recommender4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = batchDeleteCandidatesServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str2 = missingParameterException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str2, "org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = filteringLongPairRescorer2.isFiltered(longPair3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException5.addSuppressed((java.lang.Throwable) missingParameterException7);
        java.lang.Throwable[] throwableArray9 = missingParameterException7.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet1.log("userID", (java.lang.Throwable) missingParameterException7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fixedCandidatesIDRescorer1.isFiltered((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        javax.servlet.ServletRequest servletRequest1 = null;
        javax.servlet.ServletResponse servletResponse2 = null;
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet0.service(servletRequest1, servletResponse2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = batchSetPreferencesServlet2.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = batchDeleteCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore((long) 1, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fixedCandidatesIDRescorer1.isFiltered((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file3 = null;
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender5 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer2.train(file3, storage4, recommender5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = batchDeleteCandidatesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = batchDeleteCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration1 = addCandidateServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.plista.kornakapi.web.servlets.BigBangServletContextListener bigBangServletContextListener0 = new org.plista.kornakapi.web.servlets.BigBangServletContextListener();
        javax.servlet.ServletContextEvent servletContextEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigBangServletContextListener0.contextInitialized(servletContextEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalStateException: configuration file not set!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration2 = batchAddCandidatesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file4 = null;
        org.plista.kornakapi.core.storage.Storage storage5 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer3.train(file4, storage5, recommender6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = setPreferenceServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer4.train(file5, storage6, recommender7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = batchSetPreferencesServlet1.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.plista.kornakapi.web.servlets.BigBangServletContextListener bigBangServletContextListener0 = new org.plista.kornakapi.web.servlets.BigBangServletContextListener();
        javax.servlet.ServletContextEvent servletContextEvent1 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent1);
        javax.servlet.ServletContextEvent servletContextEvent3 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent3);
        javax.servlet.ServletContextEvent servletContextEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigBangServletContextListener0.contextInitialized(servletContextEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalStateException: configuration file not set!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException12 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException11);
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("batchSize", (java.lang.Throwable) invalidParameterException13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore(10L, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fixedCandidatesIDRescorer1.isFiltered((long) 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("howMany");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer8.train(file9, storage10, recommender11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        int int1 = configuration0.getNumProcessorsForTraining();
        org.plista.kornakapi.core.storage.Storage storage2 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap3 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap4 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler5 = null;
        org.plista.kornakapi.web.Components components6 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage7 = components6.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener8 = components6.preferenceChangeListener();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener9 = components6.preferenceChangeListener();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage2, strMap3, strMap4, trainingScheduler5, preferenceChangeListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(components6);
        org.junit.Assert.assertNull(storage7);
        org.junit.Assert.assertNotNull(preferenceChangeListener8);
        org.junit.Assert.assertNotNull(preferenceChangeListener9);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.String str2 = missingParameterException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str2, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer8.train(file9, storage10, recommender11, 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = filteringLongPairRescorer3.isFiltered(longPair4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer8.train(file9, storage10, recommender11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = setPreferenceServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = setPreferenceServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "batchSize", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException4);
        java.lang.String str6 = invalidParameterException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: itemIDs" + "'", str6, "org.plista.kornakapi.web.InvalidParameterException: itemIDs");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer1.train(file2, storage3, recommender4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = batchSetPreferencesServlet1.getInitParameter("org.plista.kornakapi.web.MissingParameterException: itemID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "userID", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore(10L, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fixedCandidatesIDRescorer1.isFiltered((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, 52.0d);
        org.apache.mahout.common.LongPair longPair9 = null;
        double double11 = filteringLongPairRescorer5.rescore(longPair9, (double) '#');
        org.apache.mahout.common.LongPair longPair12 = null;
        double double14 = filteringLongPairRescorer5.rescore(longPair12, (double) (short) 10);
        org.apache.mahout.common.LongPair longPair15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringLongPairRescorer5.isFiltered(longPair15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("file");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "userID", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration2.getStorageConfiguration();
        java.lang.String str4 = null; // flaky: storageConfiguration3.getJdbcDriverClass();
        java.lang.String str5 = null; // flaky: storageConfiguration3.getJdbcDriverClass();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNotNull(configuration2);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        java.lang.String str1 = recommendServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration2 = recommendServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = setPreferenceServlet0.getInitParameter("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = batchAddCandidatesServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fixedCandidatesIDRescorer1.isFiltered((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.apache.mahout.cf.taste.recommender.IDRescorer iDRescorer0 = null;
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer1 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer(iDRescorer0);
        org.apache.mahout.common.LongPair longPair2 = null;
        double double4 = filteringLongPairRescorer1.rescore(longPair2, (double) '4');
        org.apache.mahout.common.LongPair longPair5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringLongPairRescorer1.isFiltered(longPair5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        java.lang.String str1 = recommendServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest2 = null;
        javax.servlet.ServletResponse servletResponse3 = null;
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.service(servletRequest2, servletResponse3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("label");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not l (position: START_DOCUMENT seen l... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = batchDeleteCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        configuration0.setModelDirectory("userID");
        org.plista.kornakapi.core.storage.Storage storage5 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap6 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap7 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler8 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener9 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener11 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener11.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener11.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener9.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener11);
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage5, strMap6, strMap7, trainingScheduler8, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("userID");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not u (position: START_DOCUMENT seen u... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        java.lang.String str7 = configuration0.getModelDirectory();
        int int8 = configuration0.getNumProcessorsForTraining();
        org.plista.kornakapi.core.storage.Storage storage9 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap10 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap11 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler12 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener13 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener13.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener15 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener15.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener13.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener15);
        delegatingPreferenceChangeListener13.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage9, strMap10, strMap11, trainingScheduler12, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = setPreferenceServlet0.getInitParameter("org.plista.kornakapi.web.MissingParameterException: itemID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = null;
        batchDeleteCandidatesServlet0.init(servletConfig3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = batchDeleteCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringLongPairRescorer5.isFiltered(longPair6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        int int9 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = setPreferenceServlet3.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        java.lang.String str4 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setName("");
        itembasedRecommenderConfig0.setRetrainCronExpression("label");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file10 = null;
        org.plista.kornakapi.core.storage.Storage storage11 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer9.train(file10, storage11, recommender12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fixedCandidatesIDRescorer1.isFiltered((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("recommender");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not r (position: START_DOCUMENT seen r... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException3.addSuppressed((java.lang.Throwable) missingParameterException5);
        java.lang.Throwable[] throwableArray7 = missingParameterException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = missingParameterException5.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("recommender", (java.lang.Throwable) missingParameterException5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file3 = null;
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer2.train(file3, storage4, recommender5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException3 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException2);
        java.lang.String str4 = invalidParameterException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: howMany" + "'", str4, "org.plista.kornakapi.web.InvalidParameterException: howMany");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration1 = batchAddCandidatesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double7 = fixedCandidatesIDRescorer1.rescore((long) (byte) 100, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fixedCandidatesIDRescorer1.isFiltered(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet0 = new org.plista.kornakapi.web.servlets.TrainServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration1 = trainServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = setPreferenceServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.web.InvalidParameterException: howMany");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        java.lang.String str3 = configuration2.getModelDirectory();
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap5 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap6 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler7 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler8 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener11 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler8, "itemIDs", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration2, storage4, strMap5, strMap6, trainingScheduler7, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "userID" + "'", str3, "userID");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        configuration0.setModelDirectory("userID");
        java.lang.Class<?> wildcardClass5 = configuration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, (double) 10L);
        org.apache.mahout.common.LongPair longPair9 = null;
        double double11 = filteringLongPairRescorer5.rescore(longPair9, (double) (short) -1);
        org.apache.mahout.common.LongPair longPair12 = null;
        double double14 = filteringLongPairRescorer5.rescore(longPair12, (double) 100.0f);
        org.apache.mahout.common.LongPair longPair15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringLongPairRescorer5.isFiltered(longPair15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException3);
        java.lang.Throwable[] throwableArray6 = missingParameterException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = missingParameterException3.getSuppressed();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            missingParameterException3.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, 52.0d);
        org.apache.mahout.common.LongPair longPair9 = null;
        double double11 = filteringLongPairRescorer5.rescore(longPair9, (double) '#');
        org.apache.mahout.common.LongPair longPair12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringLongPairRescorer5.isFiltered(longPair12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig6 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double7 = factorizationbasedRecommenderConfig6.getAlpha();
        double double8 = factorizationbasedRecommenderConfig6.getLambda();
        int int9 = factorizationbasedRecommenderConfig6.getNumberOfFeatures();
        factorizationbasedRecommenderConfig6.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig6.setNumberOfFeatures((int) (short) 100);
        boolean boolean14 = factorizationbasedRecommenderConfig6.isUsesImplicitFeedback();
        configuration5.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig6);
        java.lang.String str16 = configuration5.getModelDirectory();
        org.plista.kornakapi.core.storage.Storage storage17 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap18 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap19 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler20 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener21 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener21.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener23 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener23.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener23.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener21.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener23);
        delegatingPreferenceChangeListener23.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler28 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener31 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler28, "label", (int) ' ');
        delegatingPreferenceChangeListener23.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener31);
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration5, storage17, strMap18, strMap19, trainingScheduler20, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "itemID" + "'", str16, "itemID");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : input contained no data");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        mutableCandidate0.set("itemIDs", (long) 0);
        mutableCandidate0.set("itemID", (long) 10000);
        java.lang.String str8 = mutableCandidate0.getLabel();
        java.lang.String str9 = mutableCandidate0.getLabel();
        long long10 = mutableCandidate0.getItemID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "itemID" + "'", str8, "itemID");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "itemID" + "'", str9, "itemID");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = batchSetPreferencesServlet1.getInitParameter("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList6 = configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig7 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig7.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        itembasedRecommenderConfig7.setRetrainCronExpression("");
        itembasedRecommenderConfig7.setSimilarItemsPerItem(10);
        itembasedRecommenderConfig7.setRetrainCronExpression("");
        configuration5.addItembasedRecommender(itembasedRecommenderConfig7);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer18 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        java.io.File file19 = null;
        org.plista.kornakapi.core.storage.Storage storage20 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer18.train(file19, storage20, recommender21, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList6);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            deleteCandidateServlet0.log("batchSize");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        java.lang.String str1 = recommendServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.log("org.plista.kornakapi.web.InvalidParameterException: howMany");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet4.init();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchAddCandidatesServlet4);
        javax.servlet.ServletRequest servletRequest7 = null;
        javax.servlet.ServletResponse servletResponse8 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet4.service(servletRequest7, servletResponse8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = batchAddCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str4 = storageConfiguration0.getJdbcUrl();
        java.lang.String str5 = storageConfiguration0.getJdbcDriverClass();
        java.lang.String str6 = storageConfiguration0.getJdbcDriverClass();
        java.lang.String str7 = storageConfiguration0.getPassword();
        java.lang.String str8 = storageConfiguration0.getJdbcDriverClass();
        java.lang.String str9 = storageConfiguration0.getPassword();
        storageConfiguration0.setUsername("MutablePreference{userID=100, itemID=0, value=0.0}");
        java.lang.Class<?> wildcardClass12 = storageConfiguration0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setName("");
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        double double7 = factorizationbasedRecommenderConfig0.getAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double7 = fixedCandidatesIDRescorer1.rescore((long) (byte) 100, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fixedCandidatesIDRescorer1.isFiltered((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = batchSetPreferencesServlet1.getInitParameter("value");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("MutablePreference{userID=100, itemID=0, value=0.0}");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not M (position: START_DOCUMENT seen M... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fixedCandidatesIDRescorer1.isFiltered((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        javax.servlet.ServletRequest servletRequest2 = null;
        javax.servlet.ServletResponse servletResponse3 = null;
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet0.service(servletRequest2, servletResponse3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fixedCandidatesIDRescorer1.isFiltered((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer8.train(file9, storage10, recommender11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        javax.servlet.ServletConfig servletConfig1 = recommendServlet0.getServletConfig();
        org.plista.kornakapi.web.MissingParameterException missingParameterException6 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException6);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException8 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException6);
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException12 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException10.addSuppressed((java.lang.Throwable) missingParameterException12);
        invalidParameterException8.addSuppressed((java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.MissingParameterException missingParameterException18 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException18);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException20 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException18);
        org.plista.kornakapi.web.MissingParameterException missingParameterException22 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException24 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException22.addSuppressed((java.lang.Throwable) missingParameterException24);
        invalidParameterException20.addSuppressed((java.lang.Throwable) missingParameterException24);
        missingParameterException12.addSuppressed((java.lang.Throwable) missingParameterException24);
        org.plista.kornakapi.web.MissingParameterException missingParameterException32 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException33 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException32);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException34 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException32);
        java.lang.Throwable[] throwableArray35 = missingParameterException32.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException36 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException32);
        missingParameterException12.addSuppressed((java.lang.Throwable) invalidParameterException36);
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.log("recommender", (java.lang.Throwable) invalidParameterException36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, 52.0d);
        org.apache.mahout.common.LongPair longPair9 = null;
        double double11 = filteringLongPairRescorer5.rescore(longPair9, (double) '#');
        org.apache.mahout.common.LongPair longPair12 = null;
        double double14 = filteringLongPairRescorer5.rescore(longPair12, (double) 100.0f);
        org.apache.mahout.common.LongPair longPair15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringLongPairRescorer5.isFiltered(longPair15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) '#');
        double double7 = factorizationbasedRecommenderConfig0.getLambda();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer8.train(file9, storage10, recommender11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        java.lang.String str4 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setName("");
        itembasedRecommenderConfig0.setRetrainCronExpression("label");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file10 = null;
        org.plista.kornakapi.core.storage.Storage storage11 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer9.train(file10, storage11, recommender12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        double double5 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file7 = null;
        org.plista.kornakapi.core.storage.Storage storage8 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender9 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer6.train(file7, storage8, recommender9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore(10L, (double) 10L);
        double double11 = fixedCandidatesIDRescorer1.rescore(100L, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = fixedCandidatesIDRescorer1.isFiltered(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet0.log("userID", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig6 = batchSetPreferencesServlet1.getServletConfig();
        javax.servlet.ServletRequest servletRequest7 = null;
        javax.servlet.ServletResponse servletResponse8 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.service(servletRequest7, servletResponse8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertNotNull(servletConfig6);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException3 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException2);
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException8 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException11.addSuppressed((java.lang.Throwable) missingParameterException13);
        invalidParameterException9.addSuppressed((java.lang.Throwable) missingParameterException13);
        java.lang.Throwable[] throwableArray16 = missingParameterException13.getSuppressed();
        invalidParameterException3.addSuppressed((java.lang.Throwable) missingParameterException13);
        java.lang.String str18 = missingParameterException13.toString();
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str18, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringLongPairRescorer4.isFiltered(longPair5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        batchAddCandidatesServlet0.init();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet0.service(servletRequest4, servletResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer4.train(file5, storage6, recommender7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fixedCandidatesIDRescorer1.isFiltered(10000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = batchDeleteCandidatesServlet0.getInitParameter("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, 52.0d);
        org.apache.mahout.common.LongPair longPair9 = null;
        double double11 = filteringLongPairRescorer5.rescore(longPair9, (double) '#');
        org.apache.mahout.common.LongPair longPair12 = null;
        double double14 = filteringLongPairRescorer5.rescore(longPair12, (double) 100.0f);
        org.apache.mahout.common.LongPair longPair15 = null;
        double double17 = filteringLongPairRescorer5.rescore(longPair15, (double) (short) 1);
        org.apache.mahout.common.LongPair longPair18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringLongPairRescorer5.isFiltered(longPair18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double7 = fixedCandidatesIDRescorer1.rescore((long) (byte) 100, (double) 'a');
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer8 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fixedCandidatesIDRescorer1.isFiltered((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer6 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fixedCandidatesIDRescorer1.isFiltered(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer4.train(file5, storage6, recommender7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig3);
        org.junit.Assert.assertNotNull(servletConfig4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        java.lang.String str7 = configuration0.getModelDirectory();
        int int8 = configuration0.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList9 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap11 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap12 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler13 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener14 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener14.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener16 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener14.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener16);
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage10, strMap11, strMap12, trainingScheduler13, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList9);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("userID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = fixedCandidatesIDRescorer1.isFiltered((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException20 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException21 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException20);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException20);
        org.plista.kornakapi.web.MissingParameterException missingParameterException24 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException26 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException24.addSuppressed((java.lang.Throwable) missingParameterException26);
        invalidParameterException22.addSuppressed((java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.MissingParameterException missingParameterException32 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException33 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException32);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException34 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException32);
        org.plista.kornakapi.web.MissingParameterException missingParameterException36 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException38 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException36.addSuppressed((java.lang.Throwable) missingParameterException38);
        invalidParameterException34.addSuppressed((java.lang.Throwable) missingParameterException38);
        missingParameterException26.addSuppressed((java.lang.Throwable) missingParameterException38);
        org.plista.kornakapi.web.MissingParameterException missingParameterException46 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException47 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException46);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException48 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException46);
        java.lang.Throwable[] throwableArray49 = missingParameterException46.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException50 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException46);
        missingParameterException26.addSuppressed((java.lang.Throwable) invalidParameterException50);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet4.log("MutablePreference{userID=100, itemID=0, value=0.0}", (java.lang.Throwable) invalidParameterException50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "MutablePreference{userID=100, itemID=0, value=0.0}", 1);
        // The following exception was thrown during execution in test generation
        try {
            inMemoryPreferenceChangeListener3.notifyOfPreferenceChange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.web.MissingParameterException: itemID");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.plista.kornakapi.web.servlets.BigBangServletContextListener bigBangServletContextListener0 = new org.plista.kornakapi.web.servlets.BigBangServletContextListener();
        javax.servlet.ServletContextEvent servletContextEvent1 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent1);
        javax.servlet.ServletContextEvent servletContextEvent3 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent3);
        javax.servlet.ServletContextEvent servletContextEvent5 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent5);
        javax.servlet.ServletContextEvent servletContextEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigBangServletContextListener0.contextInitialized(servletContextEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalStateException: configuration file not set!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig6 = batchSetPreferencesServlet1.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = batchSetPreferencesServlet1.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertNotNull(servletConfig6);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 100);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double7 = fixedCandidatesIDRescorer1.rescore((long) (byte) 100, (double) 'a');
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer8 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringLongPairRescorer8.isFiltered(longPair9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.MissingParameterException missingParameterException9 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException9.addSuppressed((java.lang.Throwable) missingParameterException11);
        invalidParameterException7.addSuppressed((java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.MissingParameterException missingParameterException21 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException23 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException21.addSuppressed((java.lang.Throwable) missingParameterException23);
        invalidParameterException19.addSuppressed((java.lang.Throwable) missingParameterException23);
        missingParameterException11.addSuppressed((java.lang.Throwable) missingParameterException23);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException27 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemID", (java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException28 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) invalidParameterException27);
        java.lang.String str29 = invalidParameterException28.toString();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: label" + "'", str29, "org.plista.kornakapi.web.InvalidParameterException: label");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = batchSetPreferencesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig3);
        org.junit.Assert.assertNotNull(servletConfig4);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet4.init();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchAddCandidatesServlet4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = batchDeleteCandidatesServlet0.getInitParameter("MutablePreference{userID=-1, itemID=10, value=10.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("itemIDs");
        java.lang.String str2 = missingParameterException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemIDs" + "'", str2, "org.plista.kornakapi.web.MissingParameterException: itemIDs");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = batchAddCandidatesServlet0.getInitParameter("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        batchDeleteCandidatesServlet4.init();
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet4.log("recommender");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        batchDeleteCandidatesServlet4.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext17 = batchDeleteCandidatesServlet4.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet5.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer8.train(file9, storage10, recommender11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet4.init();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchAddCandidatesServlet4);
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet4.log("batchSize");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException8.addSuppressed((java.lang.Throwable) missingParameterException10);
        invalidParameterException6.addSuppressed((java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException6);
        java.lang.String str14 = invalidParameterException13.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: file" + "'", str14, "org.plista.kornakapi.web.InvalidParameterException: file");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer8.train(file9, storage10, recommender11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        java.lang.String str7 = configuration0.getModelDirectory();
        int int8 = configuration0.getNumProcessorsForTraining();
        java.lang.String str9 = configuration0.getModelDirectory();
        int int10 = configuration0.getNumProcessorsForTraining();
        org.plista.kornakapi.core.storage.Storage storage11 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap12 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap13 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler14 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler15 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener18 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler15, "value", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage11, strMap12, strMap13, trainingScheduler14, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("userID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException6 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException4.addSuppressed((java.lang.Throwable) missingParameterException6);
        java.lang.Throwable[] throwableArray8 = missingParameterException6.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException6);
        missingParameterException1.addSuppressed((java.lang.Throwable) invalidParameterException9);
        org.plista.kornakapi.web.MissingParameterException missingParameterException14 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException14);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException15);
        missingParameterException1.addSuppressed((java.lang.Throwable) invalidParameterException15);
        java.lang.String str18 = invalidParameterException15.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: howMany" + "'", str18, "org.plista.kornakapi.web.InvalidParameterException: howMany");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = batchSetPreferencesServlet1.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = null;
        batchDeleteCandidatesServlet0.init(servletConfig3);
        batchDeleteCandidatesServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = batchDeleteCandidatesServlet0.getInitParameter("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException4);
        java.lang.Throwable[] throwableArray6 = missingParameterException4.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.log("value", (java.lang.Throwable) missingParameterException4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
        java.lang.String str2 = missingParameterException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: itemIDs" + "'", str2, "org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: itemIDs");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet3 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet2.init((javax.servlet.ServletConfig) batchSetPreferencesServlet3);
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = batchSetPreferencesServlet2.getInitParameter("MutablePreference{userID=0, itemID=0, value=0.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList6 = configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig7 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig7.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        itembasedRecommenderConfig7.setRetrainCronExpression("");
        itembasedRecommenderConfig7.setSimilarItemsPerItem(10);
        itembasedRecommenderConfig7.setRetrainCronExpression("");
        configuration5.addItembasedRecommender(itembasedRecommenderConfig7);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer18 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        java.io.File file19 = null;
        org.plista.kornakapi.core.storage.Storage storage20 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer18.train(file19, storage20, recommender21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList6);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double6 = fixedCandidatesIDRescorer1.rescore((long) (short) 0, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fixedCandidatesIDRescorer1.isFiltered(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration2 = batchDeleteCandidatesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringLongPairRescorer5.isFiltered(longPair6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException9 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException7.addSuppressed((java.lang.Throwable) missingParameterException9);
        invalidParameterException5.addSuppressed((java.lang.Throwable) missingParameterException9);
        java.lang.Throwable[] throwableArray12 = missingParameterException9.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException15 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException15);
        org.plista.kornakapi.web.MissingParameterException missingParameterException20 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException21 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException20);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException20);
        org.plista.kornakapi.web.MissingParameterException missingParameterException24 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException26 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException24.addSuppressed((java.lang.Throwable) missingParameterException26);
        invalidParameterException22.addSuppressed((java.lang.Throwable) missingParameterException26);
        java.lang.Throwable[] throwableArray29 = missingParameterException26.getSuppressed();
        invalidParameterException16.addSuppressed((java.lang.Throwable) missingParameterException26);
        missingParameterException9.addSuppressed((java.lang.Throwable) invalidParameterException16);
        java.lang.String str32 = missingParameterException9.toString();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str32, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = setPreferenceServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file11 = null;
        org.plista.kornakapi.core.storage.Storage storage12 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender13 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer10.train(file11, storage12, recommender13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException8 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException11.addSuppressed((java.lang.Throwable) missingParameterException13);
        invalidParameterException9.addSuppressed((java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException20 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException19);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException21 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException19);
        org.plista.kornakapi.web.MissingParameterException missingParameterException23 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException25 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException23.addSuppressed((java.lang.Throwable) missingParameterException25);
        invalidParameterException21.addSuppressed((java.lang.Throwable) missingParameterException25);
        missingParameterException13.addSuppressed((java.lang.Throwable) missingParameterException25);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException29 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemID", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException30 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) invalidParameterException29);
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet0.log("org.plista.kornakapi.web.InvalidParameterException: howMany", (java.lang.Throwable) invalidParameterException30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.web.InvalidParameterException: file");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int8 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) '#');
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (byte) 1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer14 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file15 = null;
        org.plista.kornakapi.core.storage.Storage storage16 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender17 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer14.train(file15, storage16, recommender17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("MutablePreference{userID=-1, itemID=10, value=10.0}");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not M (position: START_DOCUMENT seen M... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = setPreferenceServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig6 = batchSetPreferencesServlet1.getServletConfig();
        batchSetPreferencesServlet1.destroy();
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray11 = missingParameterException10.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("", (java.lang.Throwable) missingParameterException10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertNotNull(servletConfig6);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = setPreferenceServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "file", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet0.destroy();
        javax.servlet.ServletRequest servletRequest2 = null;
        javax.servlet.ServletResponse servletResponse3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteCandidateServlet0.service(servletRequest2, servletResponse3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet0.init();
        java.lang.String str2 = deleteCandidateServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = deleteCandidateServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        batchSetPreferencesServlet1.destroy();
        javax.servlet.ServletRequest servletRequest9 = null;
        javax.servlet.ServletResponse servletResponse10 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.service(servletRequest9, servletResponse10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet0.init();
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemIDs");
        // The following exception was thrown during execution in test generation
        try {
            deleteCandidateServlet0.log("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) missingParameterException4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet3 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str4 = batchDeleteCandidatesServlet3.getServletInfo();
        batchDeleteCandidatesServlet3.destroy();
        javax.servlet.ServletConfig servletConfig6 = batchDeleteCandidatesServlet3.getServletConfig();
        batchAddCandidatesServlet0.init(servletConfig6);
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet0.log("userID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet2.log("hi!", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = deleteCandidateServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            deleteCandidateServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList7 = configuration0.getFactorizationbasedRecommenders();
        org.plista.kornakapi.core.storage.Storage storage8 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap9 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap10 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler11 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener12 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener12.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener14 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener14.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener12.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener14);
        delegatingPreferenceChangeListener12.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener12.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage8, strMap9, strMap10, trainingScheduler11, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList7);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        setPreferenceServlet3.destroy();
        javax.servlet.ServletRequest servletRequest12 = null;
        javax.servlet.ServletResponse servletResponse13 = null;
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet3.service(servletRequest12, servletResponse13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet1.getServletConfig();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.service(servletRequest4, servletResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException2.addSuppressed((java.lang.Throwable) missingParameterException4);
        java.lang.Throwable[] throwableArray6 = missingParameterException4.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException4);
        java.lang.String str8 = invalidParameterException7.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: itemIDs" + "'", str8, "org.plista.kornakapi.web.InvalidParameterException: itemIDs");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file11 = null;
        org.plista.kornakapi.core.storage.Storage storage12 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender13 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer10.train(file11, storage12, recommender13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore((long) (byte) 10, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fixedCandidatesIDRescorer1.isFiltered((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration0.getStorageConfiguration();
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap5 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap6 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler7 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener8 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener8.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener10 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener10.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener8.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener10);
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener13 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener13.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener15 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener15.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener15.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener13.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener15);
        delegatingPreferenceChangeListener15.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler20 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener23 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler20, "label", (int) ' ');
        delegatingPreferenceChangeListener15.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener23);
        delegatingPreferenceChangeListener8.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage4, strMap5, strMap6, trainingScheduler7, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(storageConfiguration3);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("userID");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            missingParameterException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        batchSetPreferencesServlet1.destroy();
        java.lang.String str9 = batchSetPreferencesServlet1.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = batchSetPreferencesServlet1.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet2 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet3 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        setPreferenceServlet2.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet7 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet2.init((javax.servlet.ServletConfig) recommendServlet7);
        recommendServlet7.init();
        addCandidateServlet0.init((javax.servlet.ServletConfig) recommendServlet7);
        java.lang.String str11 = recommendServlet7.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = recommendServlet7.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        org.plista.kornakapi.web.MissingParameterException missingParameterException6 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException6.addSuppressed((java.lang.Throwable) missingParameterException8);
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) missingParameterException8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair5 = null;
        double double7 = filteringLongPairRescorer4.rescore(longPair5, 10000.0d);
        org.apache.mahout.common.LongPair longPair8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringLongPairRescorer4.isFiltered(longPair8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10000.0d + "'", double7 == 10000.0d);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig3 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig3.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig3);
        itembasedRecommenderConfig3.setRetrainCronExpression("");
        itembasedRecommenderConfig3.setSimilarItemsPerItem(10);
        java.lang.String str11 = itembasedRecommenderConfig3.getName();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig3);
        configuration0.setModelDirectory("recommender");
        configuration0.setNumProcessorsForTraining((int) (byte) 1);
        org.plista.kornakapi.core.storage.Storage storage17 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap18 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap19 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler20 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener21 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener21.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener23 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener23.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener23.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener21.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener23);
        delegatingPreferenceChangeListener21.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage17, strMap18, strMap19, trainingScheduler20, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        javax.servlet.ServletConfig servletConfig1 = recommendServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.log("batchSize");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setName("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str8 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file10 = null;
        org.plista.kornakapi.core.storage.Storage storage11 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer9.train(file10, storage11, recommender12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException8);
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException17.addSuppressed((java.lang.Throwable) missingParameterException19);
        invalidParameterException15.addSuppressed((java.lang.Throwable) missingParameterException19);
        java.lang.Throwable[] throwableArray22 = missingParameterException19.getSuppressed();
        invalidParameterException9.addSuppressed((java.lang.Throwable) missingParameterException19);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("", (java.lang.Throwable) missingParameterException19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = null;
        batchDeleteCandidatesServlet0.init(servletConfig3);
        batchDeleteCandidatesServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("MutablePreference{userID=0, itemID=0, value=1.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        int int6 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setLambda((double) 0);
        factorizationbasedRecommenderConfig0.setName("userID");
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("org.plista.kornakapi.web.MissingParameterException: itemID");
        factorizationbasedRecommenderConfig0.setAlpha((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException5);
        java.lang.Throwable[] throwableArray8 = missingParameterException5.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException10 = new org.plista.kornakapi.web.InvalidParameterException("", (java.lang.Throwable) invalidParameterException9);
        java.lang.String str11 = invalidParameterException10.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: " + "'", str11, "org.plista.kornakapi.web.InvalidParameterException: ");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) '#');
        double double7 = factorizationbasedRecommenderConfig0.getLambda();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer8.train(file9, storage10, recommender11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int8 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) '#');
        factorizationbasedRecommenderConfig0.setName("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        recommendServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = recommendServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException3 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException2);
        java.lang.Throwable[] throwableArray4 = missingParameterException2.getSuppressed();
        java.lang.String str5 = missingParameterException2.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str5, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException8.addSuppressed((java.lang.Throwable) missingParameterException10);
        invalidParameterException6.addSuppressed((java.lang.Throwable) missingParameterException10);
        java.lang.Throwable[] throwableArray13 = missingParameterException10.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException16 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException17 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException16);
        org.plista.kornakapi.web.MissingParameterException missingParameterException21 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException21);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException23 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException21);
        org.plista.kornakapi.web.MissingParameterException missingParameterException25 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException27 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException25.addSuppressed((java.lang.Throwable) missingParameterException27);
        invalidParameterException23.addSuppressed((java.lang.Throwable) missingParameterException27);
        java.lang.Throwable[] throwableArray30 = missingParameterException27.getSuppressed();
        invalidParameterException17.addSuppressed((java.lang.Throwable) missingParameterException27);
        missingParameterException10.addSuppressed((java.lang.Throwable) invalidParameterException17);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException33 = new org.plista.kornakapi.web.InvalidParameterException("itemID", (java.lang.Throwable) missingParameterException10);
        java.lang.Throwable[] throwableArray34 = missingParameterException10.getSuppressed();
        java.lang.String str35 = missingParameterException10.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str35, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        java.lang.String str4 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setName("");
        itembasedRecommenderConfig0.setRetrainCronExpression("label");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file11 = null;
        org.plista.kornakapi.core.storage.Storage storage12 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer10.train(file11, storage12, recommender13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = setPreferenceServlet0.getServletConfig();
        org.plista.kornakapi.web.MissingParameterException missingParameterException9 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException10 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException9);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException11 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException9);
        java.lang.Throwable[] throwableArray12 = missingParameterException9.getSuppressed();
        java.lang.Throwable[] throwableArray13 = missingParameterException9.getSuppressed();
        java.lang.Throwable[] throwableArray14 = missingParameterException9.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("userID", (java.lang.Throwable) missingParameterException9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet3 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet2.init((javax.servlet.ServletConfig) batchSetPreferencesServlet3);
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        java.lang.String str6 = batchSetPreferencesServlet2.getServletInfo();
        org.plista.kornakapi.web.MissingParameterException missingParameterException12 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.MissingParameterException missingParameterException16 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException18 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException16.addSuppressed((java.lang.Throwable) missingParameterException18);
        invalidParameterException14.addSuppressed((java.lang.Throwable) missingParameterException18);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException21 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException14);
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet2.log("label", (java.lang.Throwable) invalidParameterException14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        mutablePreference0.set((long) (short) -1, (long) (byte) 10, (float) (short) 10);
        long long7 = mutablePreference0.getUserID();
        mutablePreference0.setValue((float) (byte) 10);
        java.lang.Class<?> wildcardClass10 = mutablePreference0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet0.log("file");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet4.init();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchAddCandidatesServlet4);
        batchDeleteCandidatesServlet0.destroy();
        org.plista.kornakapi.web.MissingParameterException missingParameterException12 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException13);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("userID", (java.lang.Throwable) invalidParameterException13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = null;
        batchDeleteCandidatesServlet0.init(servletConfig3);
        batchDeleteCandidatesServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = batchDeleteCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer4.train(file5, storage6, recommender7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration0.getStorageConfiguration();
        configuration0.setNumProcessorsForTraining((int) (short) 10);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration6 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str7 = storageConfiguration6.getJdbcDriverClass();
        storageConfiguration6.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str10 = storageConfiguration6.getJdbcUrl();
        java.lang.String str11 = storageConfiguration6.getJdbcUrl();
        java.lang.String str12 = storageConfiguration6.getJdbcUrl();
        storageConfiguration6.setUsername("recommender");
        configuration0.setStorageConfiguration(storageConfiguration6);
        java.lang.String str16 = storageConfiguration6.getJdbcDriverClass();
        java.lang.Class<?> wildcardClass17 = storageConfiguration6.getClass();
        org.junit.Assert.assertNull(storageConfiguration3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig5 = batchSetPreferencesServlet2.getServletConfig();
        batchSetPreferencesServlet2.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = batchSetPreferencesServlet2.getInitParameter("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer6 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fixedCandidatesIDRescorer1.isFiltered((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        int int2 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        java.lang.String str3 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig0.setRetrainCronExpression("value");
        int int8 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        itembasedRecommenderConfig0.setSimilarItemsPerItem((int) (short) 1);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer12 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file13 = null;
        org.plista.kornakapi.core.storage.Storage storage14 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer12.train(file13, storage14, recommender15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet0.log("itemID");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig3);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet0 = new org.plista.kornakapi.web.servlets.TrainServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = trainServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        batchDeleteCandidatesServlet4.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration17 = batchDeleteCandidatesServlet4.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer6 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer7 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fixedCandidatesIDRescorer1.isFiltered((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet4.init();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchAddCandidatesServlet4);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet4.log("org.plista.kornakapi.web.MissingParameterException: itemIDs", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        java.lang.String str16 = batchDeleteCandidatesServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext17 = batchDeleteCandidatesServlet4.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.plista.kornakapi.web.servlets.BigBangServletContextListener bigBangServletContextListener0 = new org.plista.kornakapi.web.servlets.BigBangServletContextListener();
        javax.servlet.ServletContextEvent servletContextEvent1 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent1);
        javax.servlet.ServletContextEvent servletContextEvent3 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent3);
        javax.servlet.ServletContextEvent servletContextEvent5 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent5);
        javax.servlet.ServletContextEvent servletContextEvent7 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent7);
        javax.servlet.ServletContextEvent servletContextEvent9 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent9);
        javax.servlet.ServletContextEvent servletContextEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigBangServletContextListener0.contextInitialized(servletContextEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalStateException: configuration file not set!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet0 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str1 = trainServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet2 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet2.destroy();
        javax.servlet.ServletConfig servletConfig4 = deleteCandidateServlet2.getServletConfig();
        deleteCandidateServlet2.destroy();
        trainServlet0.init((javax.servlet.ServletConfig) deleteCandidateServlet2);
        javax.servlet.ServletConfig servletConfig7 = deleteCandidateServlet2.getServletConfig();
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException17.addSuppressed((java.lang.Throwable) missingParameterException19);
        invalidParameterException15.addSuppressed((java.lang.Throwable) missingParameterException19);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException15);
        org.plista.kornakapi.web.MissingParameterException missingParameterException26 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException27 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException28 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException26);
        invalidParameterException22.addSuppressed((java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.MissingParameterException missingParameterException34 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException35 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException34);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException36 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException34);
        java.lang.Throwable[] throwableArray37 = missingParameterException34.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException38 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException34);
        missingParameterException26.addSuppressed((java.lang.Throwable) missingParameterException34);
        // The following exception was thrown during execution in test generation
        try {
            deleteCandidateServlet2.log("itemIDs", (java.lang.Throwable) missingParameterException26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration1 = recommendServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int8 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) '#');
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (byte) 1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer14 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file15 = null;
        org.plista.kornakapi.core.storage.Storage storage16 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender17 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer14.train(file15, storage16, recommender17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore(10L, (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer9 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        java.lang.Class<?> wildcardClass10 = fixedCandidatesIDRescorer1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer4.train(file5, storage6, recommender7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet3 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet2.init((javax.servlet.ServletConfig) batchSetPreferencesServlet3);
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet2.log("file", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        javax.servlet.ServletRequest servletRequest8 = null;
        javax.servlet.ServletResponse servletResponse9 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.service(servletRequest8, servletResponse9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = batchDeleteCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException11 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException12 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException10);
        java.lang.Throwable[] throwableArray13 = missingParameterException10.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("", (java.lang.Throwable) invalidParameterException14);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("org.plista.kornakapi.web.MissingParameterException: itemID", (java.lang.Throwable) invalidParameterException15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = batchSetPreferencesServlet1.getInitParameter("label");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration1 = deleteCandidateServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        recommendServlet5.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = recommendServlet5.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet3 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet2.init((javax.servlet.ServletConfig) batchSetPreferencesServlet3);
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        java.lang.String str6 = batchSetPreferencesServlet2.getServletInfo();
        org.plista.kornakapi.web.MissingParameterException missingParameterException12 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.MissingParameterException missingParameterException16 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException18 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException16.addSuppressed((java.lang.Throwable) missingParameterException18);
        invalidParameterException14.addSuppressed((java.lang.Throwable) missingParameterException18);
        org.plista.kornakapi.web.MissingParameterException missingParameterException24 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException25 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException24);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException26 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException24);
        org.plista.kornakapi.web.MissingParameterException missingParameterException28 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException30 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException28.addSuppressed((java.lang.Throwable) missingParameterException30);
        invalidParameterException26.addSuppressed((java.lang.Throwable) missingParameterException30);
        missingParameterException18.addSuppressed((java.lang.Throwable) missingParameterException30);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException34 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemID", (java.lang.Throwable) missingParameterException18);
        org.plista.kornakapi.web.MissingParameterException missingParameterException40 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException41 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException40);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException42 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException40);
        org.plista.kornakapi.web.MissingParameterException missingParameterException44 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException46 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException44.addSuppressed((java.lang.Throwable) missingParameterException46);
        invalidParameterException42.addSuppressed((java.lang.Throwable) missingParameterException46);
        org.plista.kornakapi.web.MissingParameterException missingParameterException52 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException53 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException52);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException54 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException52);
        org.plista.kornakapi.web.MissingParameterException missingParameterException56 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException58 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException56.addSuppressed((java.lang.Throwable) missingParameterException58);
        invalidParameterException54.addSuppressed((java.lang.Throwable) missingParameterException58);
        missingParameterException46.addSuppressed((java.lang.Throwable) missingParameterException58);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException62 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemID", (java.lang.Throwable) missingParameterException46);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException63 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) invalidParameterException62);
        missingParameterException18.addSuppressed((java.lang.Throwable) invalidParameterException62);
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet2.log("MutablePreference{userID=100, itemID=0, value=0.0}", (java.lang.Throwable) invalidParameterException62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str2 = batchDeleteCandidatesServlet1.getServletInfo();
        java.lang.String str3 = batchDeleteCandidatesServlet1.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet4 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet6 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet5.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet6);
        setPreferenceServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet6);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet9 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet4.init((javax.servlet.ServletConfig) recommendServlet9);
        batchDeleteCandidatesServlet1.init((javax.servlet.ServletConfig) setPreferenceServlet4);
        batchDeleteCandidatesServlet1.destroy();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        javax.servlet.ServletRequest servletRequest14 = null;
        javax.servlet.ServletResponse servletResponse15 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet1.service(servletRequest14, servletResponse15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList7 = configuration0.getFactorizationbasedRecommenders();
        org.plista.kornakapi.core.storage.Storage storage8 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap9 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap10 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler11 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler12 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener15 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler12, "itemIDs", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage8, strMap9, strMap10, trainingScheduler11, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList7);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet0.service(servletRequest4, servletResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig3);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        java.lang.String str1 = recommendServlet0.getServletInfo();
        recommendServlet0.init();
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.service(servletRequest3, servletResponse4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException5);
        java.lang.Throwable[] throwableArray8 = missingParameterException5.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException10 = new org.plista.kornakapi.web.InvalidParameterException("", (java.lang.Throwable) invalidParameterException9);
        org.plista.kornakapi.web.MissingParameterException missingParameterException15 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException15);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException17 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException15);
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException21 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException19.addSuppressed((java.lang.Throwable) missingParameterException21);
        invalidParameterException17.addSuppressed((java.lang.Throwable) missingParameterException21);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException24 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException17);
        org.plista.kornakapi.web.MissingParameterException missingParameterException28 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException29 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException28);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException30 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException28);
        invalidParameterException24.addSuppressed((java.lang.Throwable) missingParameterException28);
        org.plista.kornakapi.web.MissingParameterException missingParameterException34 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException35 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException34);
        missingParameterException28.addSuppressed((java.lang.Throwable) invalidParameterException35);
        java.lang.Throwable[] throwableArray37 = missingParameterException28.getSuppressed();
        invalidParameterException10.addSuppressed((java.lang.Throwable) missingParameterException28);
        java.lang.String str39 = missingParameterException28.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str39, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer4.train(file5, storage6, recommender7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        java.lang.String str7 = setPreferenceServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        mutableCandidate0.set("label", (long) 10);
        java.lang.String str5 = mutableCandidate0.getLabel();
        long long6 = mutableCandidate0.getItemID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "label" + "'", str5, "label");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration0.getStorageConfiguration();
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap5 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap6 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler7 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler8 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener11 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler8, "MutablePreference{userID=0, itemID=0, value=0.0}", 1);
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage4, strMap5, strMap6, trainingScheduler7, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(storageConfiguration3);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setName("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer4.train(file5, storage6, recommender7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException3);
        java.lang.Throwable[] throwableArray6 = missingParameterException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = missingParameterException3.getSuppressed();
        java.lang.String str8 = missingParameterException3.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str8, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        java.lang.String str6 = setPreferenceServlet0.getServletInfo();
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException11 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException10);
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("value", (java.lang.Throwable) missingParameterException10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet1.getServletConfig();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet4 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet4.init();
        setPreferenceServlet4.init();
        setPreferenceServlet4.destroy();
        setPreferenceServlet4.destroy();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) setPreferenceServlet4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = batchSetPreferencesServlet1.getInitParameter("MutablePreference{userID=0, itemID=0, value=0.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = batchDeleteCandidatesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        long long1 = mutablePreference0.getItemID();
        java.lang.String str2 = mutablePreference0.toString();
        mutablePreference0.setValue((float) (short) 10);
        java.lang.Class<?> wildcardClass5 = mutablePreference0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str2, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray8 = missingParameterException7.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.MissingParameterException missingParameterException14 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException14);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException14);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException17 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: itemIDs", (java.lang.Throwable) invalidParameterException16);
        missingParameterException7.addSuppressed((java.lang.Throwable) invalidParameterException16);
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet0.log("batchSize", (java.lang.Throwable) missingParameterException7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet6 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet7 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet8 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet8);
        setPreferenceServlet6.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet8);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet8);
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext12 = batchDeleteCandidatesServlet8.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet0.getServletConfig();
        batchSetPreferencesServlet0.destroy();
        javax.servlet.ServletRequest servletRequest5 = null;
        javax.servlet.ServletResponse servletResponse6 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet0.service(servletRequest5, servletResponse6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig3);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(0);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file7 = null;
        org.plista.kornakapi.core.storage.Storage storage8 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender9 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer6.train(file7, storage8, recommender9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        int int2 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        java.lang.String str3 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig0.setRetrainCronExpression("value");
        int int8 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        itembasedRecommenderConfig0.setSimilarItemsPerItem((int) (short) 1);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer12 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.lang.Class<?> wildcardClass13 = multithreadedItembasedInMemoryTrainer12.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, (double) 0);
        org.apache.mahout.common.LongPair longPair9 = null;
        double double11 = filteringLongPairRescorer5.rescore(longPair9, (double) (-1L));
        org.apache.mahout.common.LongPair longPair12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringLongPairRescorer5.isFiltered(longPair12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) '#');
        double double7 = factorizationbasedRecommenderConfig0.getLambda();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer8.train(file9, storage10, recommender11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException3.addSuppressed((java.lang.Throwable) missingParameterException5);
        java.lang.Throwable[] throwableArray7 = missingParameterException5.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException8 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) invalidParameterException8);
        java.lang.Throwable[] throwableArray10 = invalidParameterException9.getSuppressed();
        java.lang.String str11 = invalidParameterException9.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str11, "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("file");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not f (position: START_DOCUMENT seen f... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        java.lang.String str2 = mutableCandidate0.getLabel();
        mutableCandidate0.set("MutablePreference{userID=-1, itemID=10, value=10.0}", 1L);
        java.lang.Class<?> wildcardClass6 = mutableCandidate0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig5 = batchSetPreferencesServlet2.getServletConfig();
        batchSetPreferencesServlet2.init();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet2.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = storage1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        java.lang.String str6 = setPreferenceServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setLambda((double) 1);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.Class<?> wildcardClass7 = factorizationbasedRecommenderConfig0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        int int2 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        java.lang.String str3 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig0.setRetrainCronExpression("value");
        int int8 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        itembasedRecommenderConfig0.setSimilarItemsPerItem((int) (short) 1);
        int int12 = itembasedRecommenderConfig0.getSimilarItemsPerItem();
        itembasedRecommenderConfig0.setSimilarityClass("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(0);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file7 = null;
        org.plista.kornakapi.core.storage.Storage storage8 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender9 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer6.train(file7, storage8, recommender9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException6);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException8 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemIDs", (java.lang.Throwable) invalidParameterException6);
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException17.addSuppressed((java.lang.Throwable) missingParameterException19);
        invalidParameterException15.addSuppressed((java.lang.Throwable) missingParameterException19);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException15);
        org.plista.kornakapi.web.MissingParameterException missingParameterException26 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException27 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException28 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException26);
        invalidParameterException22.addSuppressed((java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.MissingParameterException missingParameterException34 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException35 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException34);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException36 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException34);
        java.lang.Throwable[] throwableArray37 = missingParameterException34.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException38 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException34);
        missingParameterException26.addSuppressed((java.lang.Throwable) missingParameterException34);
        invalidParameterException8.addSuppressed((java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException41 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: file", (java.lang.Throwable) invalidParameterException8);
        java.lang.String str42 = invalidParameterException8.toString();
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: itemIDs" + "'", str42, "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: itemIDs");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        java.lang.String str1 = deleteCandidateServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration2 = deleteCandidateServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException8.addSuppressed((java.lang.Throwable) missingParameterException10);
        invalidParameterException6.addSuppressed((java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException6);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException17);
        invalidParameterException13.addSuppressed((java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.MissingParameterException missingParameterException23 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException24 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException23);
        missingParameterException17.addSuppressed((java.lang.Throwable) invalidParameterException24);
        java.lang.String str26 = invalidParameterException24.toString();
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: label" + "'", str26, "org.plista.kornakapi.web.InvalidParameterException: label");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration2 = configuration0.getStorageConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap4 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap5 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler6 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener7 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener9 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener7.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener14 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener14.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener16 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener14.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener16);
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener9.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener16);
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage3, strMap4, strMap5, trainingScheduler6, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNull(storageConfiguration2);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration1.getItembasedRecommenders();
        java.lang.String str3 = configuration1.getModelDirectory();
        java.lang.String str4 = configuration1.getModelDirectory();
        org.plista.kornakapi.core.storage.Storage storage5 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap6 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap7 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler8 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler9 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener12 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler9, "MutablePreference{userID=0, itemID=0, value=1.0}", 35);
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration1, storage5, strMap6, strMap7, trainingScheduler8, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=1.0}");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str4, "MutablePreference{userID=0, itemID=0, value=1.0}");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        batchDeleteCandidatesServlet0.destroy();
        batchDeleteCandidatesServlet0.init();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet13 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str14 = trainServlet13.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet15 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet15.destroy();
        javax.servlet.ServletConfig servletConfig17 = deleteCandidateServlet15.getServletConfig();
        deleteCandidateServlet15.destroy();
        trainServlet13.init((javax.servlet.ServletConfig) deleteCandidateServlet15);
        java.lang.String str20 = trainServlet13.getServletInfo();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) trainServlet13);
        javax.servlet.ServletRequest servletRequest22 = null;
        javax.servlet.ServletResponse servletResponse23 = null;
        // The following exception was thrown during execution in test generation
        try {
            trainServlet13.service(servletRequest22, servletResponse23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer4.train(file5, storage6, recommender7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, 52.0d);
        org.apache.mahout.common.LongPair longPair9 = null;
        double double11 = filteringLongPairRescorer5.rescore(longPair9, (double) '#');
        org.apache.mahout.common.LongPair longPair12 = null;
        double double14 = filteringLongPairRescorer5.rescore(longPair12, (double) (short) 10);
        org.apache.mahout.common.LongPair longPair15 = null;
        double double17 = filteringLongPairRescorer5.rescore(longPair15, 100.0d);
        org.apache.mahout.common.LongPair longPair18 = null;
        double double20 = filteringLongPairRescorer5.rescore(longPair18, (double) 52);
        org.apache.mahout.common.LongPair longPair21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = filteringLongPairRescorer5.isFiltered(longPair21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str4 = storageConfiguration0.getPassword();
        java.lang.String str5 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("hi!");
        java.lang.String str8 = storageConfiguration0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet6 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet7 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet8 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet8);
        setPreferenceServlet6.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet8);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = batchDeleteCandidatesServlet8.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet0 = new org.plista.kornakapi.web.servlets.TrainServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = trainServlet0.getInitParameter("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: itemIDs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair5 = null;
        double double7 = filteringLongPairRescorer4.rescore(longPair5, (double) 35L);
        org.apache.mahout.common.LongPair longPair8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringLongPairRescorer4.isFiltered(longPair8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        java.lang.String str1 = setPreferenceServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = setPreferenceServlet0.getInitParameter("batchSize");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet3 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet2.init((javax.servlet.ServletConfig) batchSetPreferencesServlet3);
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = addCandidateServlet0.getInitParameter("MutablePreference{userID=0, itemID=0, value=1.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double6 = fixedCandidatesIDRescorer1.rescore((long) (short) 0, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fixedCandidatesIDRescorer1.isFiltered((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("file");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = setPreferenceServlet0.getInitParameter("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration1 = batchSetPreferencesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        java.lang.String str5 = batchSetPreferencesServlet1.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("batchSize");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet2 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet3 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        setPreferenceServlet2.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet7 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet2.init((javax.servlet.ServletConfig) recommendServlet7);
        recommendServlet7.init();
        addCandidateServlet0.init((javax.servlet.ServletConfig) recommendServlet7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration11 = addCandidateServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str3 = configuration0.getModelDirectory();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList4 = configuration0.getItembasedRecommenders();
        configuration0.setNumProcessorsForTraining(100);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList7 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.storage.Storage storage8 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap9 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap10 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler11 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener12 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener12.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener14 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener14.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener14.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener12.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener14);
        delegatingPreferenceChangeListener14.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener14.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener20 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener20.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener22 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener22.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener20.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener22);
        delegatingPreferenceChangeListener22.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener22.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener22.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener14.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage8, strMap9, strMap10, trainingScheduler11, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList4);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList7);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int8 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) '#');
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (byte) 1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer14 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file15 = null;
        org.plista.kornakapi.core.storage.Storage storage16 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender17 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer14.train(file15, storage16, recommender17, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = fixedCandidatesIDRescorer1.isFiltered((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore((long) 1, (double) 10);
        double double11 = fixedCandidatesIDRescorer1.rescore((long) ' ', (double) 35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = fixedCandidatesIDRescorer1.isFiltered(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        java.lang.String str7 = configuration0.getModelDirectory();
        int int8 = configuration0.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList9 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList10 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration11 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str12 = storageConfiguration11.getJdbcDriverClass();
        storageConfiguration11.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str15 = storageConfiguration11.getJdbcUrl();
        java.lang.String str16 = storageConfiguration11.getJdbcUrl();
        java.lang.String str17 = storageConfiguration11.getJdbcUrl();
        storageConfiguration11.setUsername("recommender");
        java.lang.String str20 = storageConfiguration11.getJdbcDriverClass();
        configuration0.setStorageConfiguration(storageConfiguration11);
        org.plista.kornakapi.core.storage.Storage storage22 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap23 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap24 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler25 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener26 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener26.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener28 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener28.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener26.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener28);
        delegatingPreferenceChangeListener28.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener28.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener33 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener33.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener35 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener35.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener35.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener33.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener35);
        delegatingPreferenceChangeListener35.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener28.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener35);
        delegatingPreferenceChangeListener28.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener42 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener42.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener44 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener44.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener44.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener42.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener44);
        delegatingPreferenceChangeListener28.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener44);
        delegatingPreferenceChangeListener28.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler50 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener53 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler50, "org.plista.kornakapi.web.InvalidParameterException: file", (int) (byte) 10);
        delegatingPreferenceChangeListener28.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener53);
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage22, strMap23, strMap24, trainingScheduler25, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList9);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage6 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration7 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage8 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap9 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap10 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler11 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener12 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener12.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener12.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener12.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration7, storage8, strMap9, strMap10, trainingScheduler11, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNull(storage6);
        org.junit.Assert.assertNotNull(configuration7);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        javax.servlet.ServletRequest servletRequest2 = null;
        javax.servlet.ServletResponse servletResponse3 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet0.service(servletRequest2, servletResponse3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet0 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            deleteCandidateServlet0.log("recommender");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = batchDeleteCandidatesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        java.lang.String str4 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setName("");
        itembasedRecommenderConfig0.setRetrainCronExpression("label");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file11 = null;
        org.plista.kornakapi.core.storage.Storage storage12 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer10.train(file11, storage12, recommender13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        configuration2.setModelDirectory("itemID");
        java.lang.Class<?> wildcardClass5 = configuration2.getClass();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str3 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet4.init();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchAddCandidatesServlet4);
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet4.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = batchAddCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        java.lang.String str1 = setPreferenceServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext2 = setPreferenceServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        java.lang.String str3 = configuration2.getModelDirectory();
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap5 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap6 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler7 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler8 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener11 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler8, "MutablePreference{userID=100, itemID=0, value=0.0}", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration2, storage4, strMap5, strMap6, trainingScheduler7, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "itemID" + "'", str3, "itemID");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet1.getServletConfig();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet4 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet4.init();
        setPreferenceServlet4.init();
        setPreferenceServlet4.destroy();
        setPreferenceServlet4.destroy();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) setPreferenceServlet4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException14 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException14);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException14);
        org.plista.kornakapi.web.MissingParameterException missingParameterException18 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException20 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException18.addSuppressed((java.lang.Throwable) missingParameterException20);
        invalidParameterException16.addSuppressed((java.lang.Throwable) missingParameterException20);
        java.lang.Throwable[] throwableArray23 = missingParameterException20.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException26 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException27 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.MissingParameterException missingParameterException31 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException32 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException31);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException33 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException31);
        org.plista.kornakapi.web.MissingParameterException missingParameterException35 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException37 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException35.addSuppressed((java.lang.Throwable) missingParameterException37);
        invalidParameterException33.addSuppressed((java.lang.Throwable) missingParameterException37);
        java.lang.Throwable[] throwableArray40 = missingParameterException37.getSuppressed();
        invalidParameterException27.addSuppressed((java.lang.Throwable) missingParameterException37);
        missingParameterException20.addSuppressed((java.lang.Throwable) invalidParameterException27);
        org.plista.kornakapi.web.MissingParameterException missingParameterException46 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException47 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException46);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException48 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException47);
        org.plista.kornakapi.web.MissingParameterException missingParameterException50 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=-1, itemID=10, value=10.0}");
        invalidParameterException48.addSuppressed((java.lang.Throwable) missingParameterException50);
        missingParameterException20.addSuppressed((java.lang.Throwable) invalidParameterException48);
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet4.log("", (java.lang.Throwable) invalidParameterException48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException9 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException7.addSuppressed((java.lang.Throwable) missingParameterException9);
        invalidParameterException5.addSuppressed((java.lang.Throwable) missingParameterException9);
        java.lang.Throwable[] throwableArray12 = invalidParameterException5.getSuppressed();
        java.lang.Throwable[] throwableArray13 = invalidParameterException5.getSuppressed();
        java.lang.Class<?> wildcardClass14 = invalidParameterException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        java.lang.String str16 = batchDeleteCandidatesServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet4.log("org.plista.kornakapi.web.InvalidParameterException: label");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getSimilarityClass();
        int int2 = itembasedRecommenderConfig0.getSimilarItemsPerItem();
        int int3 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int4 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer5 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file6 = null;
        org.plista.kornakapi.core.storage.Storage storage7 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer5.train(file6, storage7, recommender8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double7 = fixedCandidatesIDRescorer1.rescore((long) (byte) 100, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fixedCandidatesIDRescorer1.isFiltered((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException8.addSuppressed((java.lang.Throwable) missingParameterException10);
        invalidParameterException6.addSuppressed((java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException6);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException17);
        invalidParameterException13.addSuppressed((java.lang.Throwable) missingParameterException17);
        java.lang.String str21 = missingParameterException17.toString();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str21, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet7 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str8 = batchDeleteCandidatesServlet7.getServletInfo();
        java.lang.String str9 = batchDeleteCandidatesServlet7.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet10 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet11 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet12 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet11.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet12);
        setPreferenceServlet10.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet12);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet15 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet10.init((javax.servlet.ServletConfig) recommendServlet15);
        batchDeleteCandidatesServlet7.init((javax.servlet.ServletConfig) setPreferenceServlet10);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = setPreferenceServlet10.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException8.addSuppressed((java.lang.Throwable) missingParameterException10);
        invalidParameterException6.addSuppressed((java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException6);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException17);
        invalidParameterException13.addSuppressed((java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.MissingParameterException missingParameterException22 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException25 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException26 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException25);
        missingParameterException22.addSuppressed((java.lang.Throwable) invalidParameterException26);
        invalidParameterException13.addSuppressed((java.lang.Throwable) missingParameterException22);
        java.lang.String str29 = invalidParameterException13.toString();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: file" + "'", str29, "org.plista.kornakapi.web.InvalidParameterException: file");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file3 = null;
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender5 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer2.train(file3, storage4, recommender5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray5 = missingParameterException4.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException12 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: itemIDs", (java.lang.Throwable) invalidParameterException13);
        missingParameterException4.addSuppressed((java.lang.Throwable) invalidParameterException13);
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet0.log("MutablePreference{userID=-1, itemID=10, value=10.0}", (java.lang.Throwable) invalidParameterException13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet7 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str8 = batchDeleteCandidatesServlet7.getServletInfo();
        java.lang.String str9 = batchDeleteCandidatesServlet7.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet10 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet11 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet12 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet11.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet12);
        setPreferenceServlet10.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet12);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet15 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet10.init((javax.servlet.ServletConfig) recommendServlet15);
        batchDeleteCandidatesServlet7.init((javax.servlet.ServletConfig) setPreferenceServlet10);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration19 = setPreferenceServlet10.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        configuration0.setModelDirectory("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: itemIDs");
        java.lang.Class<?> wildcardClass4 = configuration0.getClass();
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        batchAddCandidatesServlet0.init();
        java.lang.String str4 = batchAddCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = batchAddCandidatesServlet0.getInitParameter("recommender");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (byte) 100);
        double double10 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setAlpha((double) (short) 10);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer13 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file14 = null;
        org.plista.kornakapi.core.storage.Storage storage15 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender16 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer13.train(file14, storage15, recommender16, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setName("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str8 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file11 = null;
        org.plista.kornakapi.core.storage.Storage storage12 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer10.train(file11, storage12, recommender13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        int int2 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.lang.Class<?> wildcardClass4 = itembasedRecommenderConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException6);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException8 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemIDs", (java.lang.Throwable) invalidParameterException6);
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException17.addSuppressed((java.lang.Throwable) missingParameterException19);
        invalidParameterException15.addSuppressed((java.lang.Throwable) missingParameterException19);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException15);
        org.plista.kornakapi.web.MissingParameterException missingParameterException26 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException27 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException28 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException26);
        invalidParameterException22.addSuppressed((java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.MissingParameterException missingParameterException34 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException35 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException34);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException36 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException34);
        java.lang.Throwable[] throwableArray37 = missingParameterException34.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException38 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException34);
        missingParameterException26.addSuppressed((java.lang.Throwable) missingParameterException34);
        invalidParameterException8.addSuppressed((java.lang.Throwable) missingParameterException26);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException41 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: file", (java.lang.Throwable) invalidParameterException8);
        java.lang.Throwable[] throwableArray42 = invalidParameterException8.getSuppressed();
        java.lang.String str43 = invalidParameterException8.toString();
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: itemIDs" + "'", str43, "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: itemIDs");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fixedCandidatesIDRescorer1.isFiltered((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        javax.servlet.ServletConfig servletConfig5 = setPreferenceServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = setPreferenceServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig5);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray3 = missingParameterException2.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) missingParameterException2);
        java.lang.String str5 = invalidParameterException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str5, "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        java.lang.String str4 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setName("");
        itembasedRecommenderConfig0.setRetrainCronExpression("label");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file11 = null;
        org.plista.kornakapi.core.storage.Storage storage12 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer10.train(file11, storage12, recommender13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray5 = missingParameterException4.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException12 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException11);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: itemIDs", (java.lang.Throwable) invalidParameterException13);
        missingParameterException4.addSuppressed((java.lang.Throwable) invalidParameterException13);
        missingParameterException1.addSuppressed((java.lang.Throwable) missingParameterException4);
        java.lang.String str17 = missingParameterException1.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str17, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "MutablePreference{userID=-1, itemID=10, value=10.0}", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet11 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet12 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet13 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet12.init((javax.servlet.ServletConfig) batchSetPreferencesServlet13);
        javax.servlet.ServletConfig servletConfig15 = batchSetPreferencesServlet12.getServletConfig();
        addCandidateServlet11.init((javax.servlet.ServletConfig) batchSetPreferencesServlet12);
        javax.servlet.ServletConfig servletConfig17 = addCandidateServlet11.getServletConfig();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) addCandidateServlet11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = batchDeleteCandidatesServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(servletConfig15);
        org.junit.Assert.assertNotNull(servletConfig17);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet2 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet3 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        setPreferenceServlet2.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet7 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet2.init((javax.servlet.ServletConfig) recommendServlet7);
        recommendServlet7.init();
        addCandidateServlet0.init((javax.servlet.ServletConfig) recommendServlet7);
        javax.servlet.ServletRequest servletRequest11 = null;
        javax.servlet.ServletResponse servletResponse12 = null;
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet0.service(servletRequest11, servletResponse12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        batchDeleteCandidatesServlet0.destroy();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str13 = batchDeleteCandidatesServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest14 = null;
        javax.servlet.ServletResponse servletResponse15 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.service(servletRequest14, servletResponse15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setName("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str8 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file10 = null;
        org.plista.kornakapi.core.storage.Storage storage11 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer9.train(file10, storage11, recommender12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore((long) (byte) 10, (double) (byte) 10);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer9 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fixedCandidatesIDRescorer1.isFiltered(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet3 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str4 = batchDeleteCandidatesServlet3.getServletInfo();
        batchDeleteCandidatesServlet3.destroy();
        javax.servlet.ServletConfig servletConfig6 = batchDeleteCandidatesServlet3.getServletConfig();
        batchAddCandidatesServlet0.init(servletConfig6);
        batchAddCandidatesServlet0.init();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet9 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet10 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet11 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet10.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet11);
        setPreferenceServlet9.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet11);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet14 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet9.init((javax.servlet.ServletConfig) recommendServlet14);
        recommendServlet14.init();
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) recommendServlet14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = batchAddCandidatesServlet0.getInitParameter("MutablePreference{userID=-1, itemID=10, value=10.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str4 = storageConfiguration0.getJdbcUrl();
        java.lang.String str5 = storageConfiguration0.getJdbcUrl();
        storageConfiguration0.setJdbcDriverClass("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        storageConfiguration0.setJdbcUrl("MutablePreference{userID=0, itemID=0, value=52.0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        double double5 = factorizationbasedRecommenderConfig0.getAlpha();
        boolean boolean6 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double9 = factorizationbasedRecommenderConfig0.getAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = batchSetPreferencesServlet1.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList6 = configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration7 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str8 = storageConfiguration7.getJdbcDriverClass();
        storageConfiguration7.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str11 = storageConfiguration7.getJdbcUrl();
        java.lang.String str12 = storageConfiguration7.getJdbcDriverClass();
        java.lang.String str13 = storageConfiguration7.getJdbcDriverClass();
        java.lang.String str14 = storageConfiguration7.getPassword();
        configuration5.setStorageConfiguration(storageConfiguration7);
        int int16 = configuration5.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration17 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str18 = storageConfiguration17.getJdbcDriverClass();
        storageConfiguration17.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str21 = storageConfiguration17.getJdbcUrl();
        java.lang.String str22 = storageConfiguration17.getJdbcUrl();
        java.lang.String str23 = storageConfiguration17.getJdbcUrl();
        java.lang.String str24 = storageConfiguration17.getUsername();
        configuration5.setStorageConfiguration(storageConfiguration17);
        java.lang.Class<?> wildcardClass26 = storageConfiguration17.getClass();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str24, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.web.MissingParameterException: itemIDs");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getSimilarityClass();
        java.lang.String str2 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setSimilarItemsPerItem((int) (byte) 1);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer5 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file6 = null;
        org.plista.kornakapi.core.storage.Storage storage7 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer5.train(file6, storage7, recommender8, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        int int2 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file4 = null;
        org.plista.kornakapi.core.storage.Storage storage5 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer3.train(file4, storage5, recommender6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = setPreferenceServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        itembasedRecommenderConfig0.setSimilarityClass("");
        itembasedRecommenderConfig0.setName("howMany");
        java.lang.String str6 = itembasedRecommenderConfig0.getSimilarityClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double6 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fixedCandidatesIDRescorer1.isFiltered((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet3 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str4 = batchDeleteCandidatesServlet3.getServletInfo();
        batchDeleteCandidatesServlet3.init();
        javax.servlet.ServletConfig servletConfig6 = null;
        batchDeleteCandidatesServlet3.init(servletConfig6);
        recommendServlet0.init(servletConfig6);
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.log("value");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("MutablePreference{userID=0, itemID=0, value=1.0}");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not M (position: START_DOCUMENT seen M... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int8 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) '#');
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (byte) 1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer14 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file15 = null;
        org.plista.kornakapi.core.storage.Storage storage16 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender17 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer14.train(file15, storage16, recommender17, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList6 = configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig7 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig7.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        itembasedRecommenderConfig7.setRetrainCronExpression("");
        itembasedRecommenderConfig7.setSimilarItemsPerItem(10);
        itembasedRecommenderConfig7.setRetrainCronExpression("");
        configuration5.addItembasedRecommender(itembasedRecommenderConfig7);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer18 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        java.io.File file19 = null;
        org.plista.kornakapi.core.storage.Storage storage20 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer18.train(file19, storage20, recommender21, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList6);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = batchSetPreferencesServlet1.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException9 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException7.addSuppressed((java.lang.Throwable) missingParameterException9);
        invalidParameterException5.addSuppressed((java.lang.Throwable) missingParameterException9);
        org.plista.kornakapi.web.MissingParameterException missingParameterException15 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException15);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException17 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException15);
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException21 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException19.addSuppressed((java.lang.Throwable) missingParameterException21);
        invalidParameterException17.addSuppressed((java.lang.Throwable) missingParameterException21);
        missingParameterException9.addSuppressed((java.lang.Throwable) missingParameterException21);
        org.plista.kornakapi.web.MissingParameterException missingParameterException29 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException30 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException29);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException31 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException29);
        java.lang.Throwable[] throwableArray32 = missingParameterException29.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException33 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException29);
        missingParameterException9.addSuppressed((java.lang.Throwable) invalidParameterException33);
        java.lang.String str35 = invalidParameterException33.toString();
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: recommender" + "'", str35, "org.plista.kornakapi.web.InvalidParameterException: recommender");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("userID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException11.addSuppressed((java.lang.Throwable) missingParameterException13);
        java.lang.Throwable[] throwableArray15 = missingParameterException13.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException13);
        missingParameterException8.addSuppressed((java.lang.Throwable) invalidParameterException16);
        org.plista.kornakapi.web.MissingParameterException missingParameterException21 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException21);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException23 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException22);
        missingParameterException8.addSuppressed((java.lang.Throwable) invalidParameterException22);
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet0.log("MutablePreference{userID=-1, itemID=10, value=10.0}", (java.lang.Throwable) invalidParameterException22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        batchDeleteCandidatesServlet0.destroy();
        batchDeleteCandidatesServlet0.init();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet13 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str14 = trainServlet13.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet15 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet15.destroy();
        javax.servlet.ServletConfig servletConfig17 = deleteCandidateServlet15.getServletConfig();
        deleteCandidateServlet15.destroy();
        trainServlet13.init((javax.servlet.ServletConfig) deleteCandidateServlet15);
        java.lang.String str20 = trainServlet13.getServletInfo();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) trainServlet13);
        // The following exception was thrown during execution in test generation
        try {
            trainServlet13.log("value");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file3 = null;
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender5 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer2.train(file3, storage4, recommender5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer8.train(file9, storage10, recommender11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        java.lang.String str16 = batchDeleteCandidatesServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = batchDeleteCandidatesServlet4.getInitParameter("org.plista.kornakapi.web.InvalidParameterException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges(10000);
        factorizationbasedRecommenderConfig0.setAlpha((double) (short) 10);
        java.lang.String str12 = factorizationbasedRecommenderConfig0.getName();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        batchDeleteCandidatesServlet0.destroy();
        batchDeleteCandidatesServlet0.init();
        java.lang.String str13 = batchDeleteCandidatesServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration14 = batchDeleteCandidatesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        batchAddCandidatesServlet0.init();
        java.lang.String str4 = batchAddCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException11 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException12 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.MissingParameterException missingParameterException14 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException16 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException14.addSuppressed((java.lang.Throwable) missingParameterException16);
        invalidParameterException12.addSuppressed((java.lang.Throwable) missingParameterException16);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException12);
        org.plista.kornakapi.web.MissingParameterException missingParameterException23 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException24 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException23);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException25 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException23);
        invalidParameterException19.addSuppressed((java.lang.Throwable) missingParameterException23);
        org.plista.kornakapi.web.MissingParameterException missingParameterException31 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException32 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException31);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException33 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException31);
        java.lang.Throwable[] throwableArray34 = missingParameterException31.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException35 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException31);
        missingParameterException23.addSuppressed((java.lang.Throwable) missingParameterException31);
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet0.log("org.plista.kornakapi.web.InvalidParameterException: label", (java.lang.Throwable) missingParameterException31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet0 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str1 = trainServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet2 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet2.destroy();
        javax.servlet.ServletConfig servletConfig4 = deleteCandidateServlet2.getServletConfig();
        deleteCandidateServlet2.destroy();
        trainServlet0.init((javax.servlet.ServletConfig) deleteCandidateServlet2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = trainServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        java.lang.String str1 = recommendServlet0.getServletInfo();
        recommendServlet0.init();
        recommendServlet0.init();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet0.service(servletRequest4, servletResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList6 = configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig7 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig7.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        itembasedRecommenderConfig7.setRetrainCronExpression("");
        itembasedRecommenderConfig7.setSimilarItemsPerItem(10);
        itembasedRecommenderConfig7.setRetrainCronExpression("");
        configuration5.addItembasedRecommender(itembasedRecommenderConfig7);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList18 = configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.storage.Storage storage19 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap20 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap21 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler22 = null;
        org.plista.kornakapi.web.Components components23 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration24 = components23.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration25 = components23.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler26 = components23.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration27 = components23.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage28 = components23.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener29 = components23.preferenceChangeListener();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration5, storage19, strMap20, strMap21, trainingScheduler22, preferenceChangeListener29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList6);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList18);
        org.junit.Assert.assertNotNull(components23);
        org.junit.Assert.assertNotNull(configuration24);
        org.junit.Assert.assertNotNull(configuration25);
        org.junit.Assert.assertNull(trainingScheduler26);
        org.junit.Assert.assertNotNull(configuration27);
        org.junit.Assert.assertNull(storage28);
        org.junit.Assert.assertNotNull(preferenceChangeListener29);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        batchSetPreferencesServlet1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("batchSize");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("file");
        java.lang.String str2 = missingParameterException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: file" + "'", str2, "org.plista.kornakapi.web.MissingParameterException: file");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = setPreferenceServlet0.getServletConfig();
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        java.lang.String str8 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 1);
        double double11 = factorizationbasedRecommenderConfig0.getAlpha();
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("itemID");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        java.lang.String str5 = batchSetPreferencesServlet1.getServletInfo();
        org.plista.kornakapi.web.MissingParameterException missingParameterException12 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException12);
        java.lang.Throwable[] throwableArray15 = missingParameterException12.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException17 = new org.plista.kornakapi.web.InvalidParameterException("", (java.lang.Throwable) invalidParameterException16);
        org.plista.kornakapi.web.MissingParameterException missingParameterException22 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException23 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException22);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException24 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException22);
        org.plista.kornakapi.web.MissingParameterException missingParameterException26 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException28 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException26.addSuppressed((java.lang.Throwable) missingParameterException28);
        invalidParameterException24.addSuppressed((java.lang.Throwable) missingParameterException28);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException31 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException24);
        org.plista.kornakapi.web.MissingParameterException missingParameterException35 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException36 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException35);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException37 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException35);
        invalidParameterException31.addSuppressed((java.lang.Throwable) missingParameterException35);
        org.plista.kornakapi.web.MissingParameterException missingParameterException41 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException42 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException41);
        missingParameterException35.addSuppressed((java.lang.Throwable) invalidParameterException42);
        java.lang.Throwable[] throwableArray44 = missingParameterException35.getSuppressed();
        invalidParameterException17.addSuppressed((java.lang.Throwable) missingParameterException35);
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("org.plista.kornakapi.web.InvalidParameterException: file", (java.lang.Throwable) missingParameterException35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.web.InvalidParameterException: label");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("label");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        java.lang.String str4 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setName("");
        itembasedRecommenderConfig0.setRetrainCronExpression("label");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.lang.Class<?> wildcardClass11 = itembasedRecommenderConfig0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray3 = missingParameterException2.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException2);
        org.plista.kornakapi.web.MissingParameterException missingParameterException9 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException10 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException9);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException11 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException12 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemIDs", (java.lang.Throwable) invalidParameterException10);
        org.plista.kornakapi.web.MissingParameterException missingParameterException17 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException17);
        org.plista.kornakapi.web.MissingParameterException missingParameterException21 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException23 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException21.addSuppressed((java.lang.Throwable) missingParameterException23);
        invalidParameterException19.addSuppressed((java.lang.Throwable) missingParameterException23);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException26 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException19);
        org.plista.kornakapi.web.MissingParameterException missingParameterException30 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException31 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException30);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException32 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException30);
        invalidParameterException26.addSuppressed((java.lang.Throwable) missingParameterException30);
        org.plista.kornakapi.web.MissingParameterException missingParameterException38 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException39 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException38);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException40 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException38);
        java.lang.Throwable[] throwableArray41 = missingParameterException38.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException42 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException38);
        missingParameterException30.addSuppressed((java.lang.Throwable) missingParameterException38);
        invalidParameterException12.addSuppressed((java.lang.Throwable) missingParameterException30);
        missingParameterException2.addSuppressed((java.lang.Throwable) missingParameterException30);
        java.lang.String str46 = missingParameterException30.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str46, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = null;
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer1 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file2 = null;
        org.plista.kornakapi.core.storage.Storage storage3 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender4 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer1.train(file2, storage3, recommender4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        int int2 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        int int4 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        java.lang.Class<?> wildcardClass5 = factorizationbasedRecommenderConfig0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore((long) 1, (double) 10);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer9 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fixedCandidatesIDRescorer1.isFiltered((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration2 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str3 = storageConfiguration2.getJdbcDriverClass();
        storageConfiguration2.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str6 = storageConfiguration2.getJdbcUrl();
        java.lang.String str7 = storageConfiguration2.getJdbcDriverClass();
        java.lang.String str8 = storageConfiguration2.getJdbcDriverClass();
        java.lang.String str9 = storageConfiguration2.getPassword();
        configuration1.setStorageConfiguration(storageConfiguration2);
        org.plista.kornakapi.core.storage.Storage storage11 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap12 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap13 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler14 = null;
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener15 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener15.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener17 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener17.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener15.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener17);
        delegatingPreferenceChangeListener17.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener17.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener22 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener22.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener24 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener24.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener24.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener22.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener24);
        delegatingPreferenceChangeListener24.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener17.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener24);
        delegatingPreferenceChangeListener17.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener17.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration1, storage11, strMap12, strMap13, trainingScheduler14, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "org.plista.kornakapi.web.InvalidParameterException: recommender", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("howMany", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = null;
        batchDeleteCandidatesServlet0.init(servletConfig3);
        javax.servlet.ServletConfig servletConfig5 = batchDeleteCandidatesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = batchDeleteCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.plista.kornakapi.web.servlets.BigBangServletContextListener bigBangServletContextListener0 = new org.plista.kornakapi.web.servlets.BigBangServletContextListener();
        javax.servlet.ServletContextEvent servletContextEvent1 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent1);
        javax.servlet.ServletContextEvent servletContextEvent3 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent3);
        javax.servlet.ServletContextEvent servletContextEvent5 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent5);
        javax.servlet.ServletContextEvent servletContextEvent7 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent7);
        javax.servlet.ServletContextEvent servletContextEvent9 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent9);
        javax.servlet.ServletContextEvent servletContextEvent11 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent11);
        javax.servlet.ServletContextEvent servletContextEvent13 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent13);
        javax.servlet.ServletContextEvent servletContextEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigBangServletContextListener0.contextInitialized(servletContextEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalStateException: configuration file not set!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet3 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str4 = batchDeleteCandidatesServlet3.getServletInfo();
        batchDeleteCandidatesServlet3.destroy();
        javax.servlet.ServletConfig servletConfig6 = batchDeleteCandidatesServlet3.getServletConfig();
        batchAddCandidatesServlet0.init(servletConfig6);
        org.plista.kornakapi.web.MissingParameterException missingParameterException14 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException14);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException14);
        java.lang.Throwable[] throwableArray17 = missingParameterException14.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException14);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("", (java.lang.Throwable) invalidParameterException18);
        // The following exception was thrown during execution in test generation
        try {
            batchAddCandidatesServlet0.log("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) invalidParameterException18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = batchAddCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str5 = batchDeleteCandidatesServlet4.getServletInfo();
        java.lang.String str6 = batchDeleteCandidatesServlet4.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet9 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet8.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        setPreferenceServlet7.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet9);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet7.init((javax.servlet.ServletConfig) recommendServlet12);
        batchDeleteCandidatesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext16 = batchDeleteCandidatesServlet4.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        batchSetPreferencesServlet1.destroy();
        java.lang.String str9 = batchSetPreferencesServlet1.getServletInfo();
        batchSetPreferencesServlet1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: itemIDs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        double double7 = fixedCandidatesIDRescorer1.rescore((long) (byte) 0, (double) (byte) 1);
        double double10 = fixedCandidatesIDRescorer1.rescore((long) (byte) 10, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = fixedCandidatesIDRescorer1.isFiltered((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file3 = null;
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer2.train(file3, storage4, recommender5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (byte) 100);
        double double10 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setAlpha((double) (byte) 0);
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("");
        double double15 = factorizationbasedRecommenderConfig0.getLambda();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.plista.kornakapi.web.servlets.BigBangServletContextListener bigBangServletContextListener0 = new org.plista.kornakapi.web.servlets.BigBangServletContextListener();
        javax.servlet.ServletContextEvent servletContextEvent1 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent1);
        javax.servlet.ServletContextEvent servletContextEvent3 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent3);
        javax.servlet.ServletContextEvent servletContextEvent5 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent5);
        javax.servlet.ServletContextEvent servletContextEvent7 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent7);
        javax.servlet.ServletContextEvent servletContextEvent9 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent9);
        javax.servlet.ServletContextEvent servletContextEvent11 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent11);
        javax.servlet.ServletContextEvent servletContextEvent13 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent13);
        javax.servlet.ServletContextEvent servletContextEvent15 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent15);
        javax.servlet.ServletContextEvent servletContextEvent17 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent17);
        javax.servlet.ServletContextEvent servletContextEvent19 = null;
        bigBangServletContextListener0.contextDestroyed(servletContextEvent19);
        javax.servlet.ServletContextEvent servletContextEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigBangServletContextListener0.contextInitialized(servletContextEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalStateException: configuration file not set!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet2 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet3 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        setPreferenceServlet2.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet7 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet2.init((javax.servlet.ServletConfig) recommendServlet7);
        recommendServlet7.init();
        addCandidateServlet0.init((javax.servlet.ServletConfig) recommendServlet7);
        java.lang.String str11 = recommendServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = recommendServlet7.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration13 = recommendServlet7.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = fixedCandidatesIDRescorer1.isFiltered((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = null;
        batchDeleteCandidatesServlet0.init(servletConfig3);
        javax.servlet.ServletConfig servletConfig5 = batchDeleteCandidatesServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("label");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException3 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException2);
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException8 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.MissingParameterException missingParameterException11 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException11.addSuppressed((java.lang.Throwable) missingParameterException13);
        invalidParameterException9.addSuppressed((java.lang.Throwable) missingParameterException13);
        java.lang.Throwable[] throwableArray16 = missingParameterException13.getSuppressed();
        invalidParameterException3.addSuppressed((java.lang.Throwable) missingParameterException13);
        java.lang.String str18 = invalidParameterException3.toString();
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: howMany" + "'", str18, "org.plista.kornakapi.web.InvalidParameterException: howMany");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "org.plista.kornakapi.web.MissingParameterException: itemID", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        int int2 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double5 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (byte) 100);
        double double8 = factorizationbasedRecommenderConfig0.getLambda();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer9 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file10 = null;
        org.plista.kornakapi.core.storage.Storage storage11 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender12 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer9.train(file10, storage11, recommender12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setName("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str8 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setSimilarItemsPerItem(100);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer11 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file12 = null;
        org.plista.kornakapi.core.storage.Storage storage13 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer11.train(file12, storage13, recommender14, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        java.lang.String str8 = itembasedRecommenderConfig0.getName();
        int int9 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        java.lang.String str10 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer11 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file12 = null;
        org.plista.kornakapi.core.storage.Storage storage13 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer11.train(file12, storage13, recommender14, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        javax.servlet.ServletConfig servletConfig3 = batchSetPreferencesServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet0.getServletConfig();
        batchSetPreferencesServlet0.destroy();
        javax.servlet.ServletRequest servletRequest6 = null;
        javax.servlet.ServletResponse servletResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet0.service(servletRequest6, servletResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig3);
        org.junit.Assert.assertNotNull(servletConfig4);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        java.lang.String str8 = itembasedRecommenderConfig0.getName();
        int int9 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        java.lang.String str10 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer11 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file12 = null;
        org.plista.kornakapi.core.storage.Storage storage13 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer11.train(file12, storage13, recommender14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.init();
        org.plista.kornakapi.web.MissingParameterException missingParameterException13 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException13);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException15 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException14);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException16 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemIDs", (java.lang.Throwable) invalidParameterException14);
        org.plista.kornakapi.web.MissingParameterException missingParameterException21 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException21);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException23 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException21);
        org.plista.kornakapi.web.MissingParameterException missingParameterException25 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException27 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException25.addSuppressed((java.lang.Throwable) missingParameterException27);
        invalidParameterException23.addSuppressed((java.lang.Throwable) missingParameterException27);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException30 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException23);
        org.plista.kornakapi.web.MissingParameterException missingParameterException34 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException35 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException34);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException36 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException34);
        invalidParameterException30.addSuppressed((java.lang.Throwable) missingParameterException34);
        org.plista.kornakapi.web.MissingParameterException missingParameterException42 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException43 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException42);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException44 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException42);
        java.lang.Throwable[] throwableArray45 = missingParameterException42.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException46 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException42);
        missingParameterException34.addSuppressed((java.lang.Throwable) missingParameterException42);
        invalidParameterException16.addSuppressed((java.lang.Throwable) missingParameterException34);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException49 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: file", (java.lang.Throwable) invalidParameterException16);
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("MutablePreference{userID=100, itemID=0, value=0.0}", (java.lang.Throwable) invalidParameterException16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int8 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int9 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) '#');
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (byte) 1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer14 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file15 = null;
        org.plista.kornakapi.core.storage.Storage storage16 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender17 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer14.train(file15, storage16, recommender17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair5 = null;
        double double7 = filteringLongPairRescorer4.rescore(longPair5, (double) (short) 100);
        org.apache.mahout.common.LongPair longPair8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringLongPairRescorer4.isFiltered(longPair8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file9 = null;
        org.plista.kornakapi.core.storage.Storage storage10 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer8.train(file9, storage10, recommender11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        setPreferenceServlet3.destroy();
        setPreferenceServlet3.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration13 = setPreferenceServlet3.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file5 = null;
        org.plista.kornakapi.core.storage.Storage storage6 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer4.train(file5, storage6, recommender7, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.core.config.Configuration configuration1 = org.plista.kornakapi.core.config.Configuration.fromXML("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
            org.junit.Assert.fail("Expected exception of type com.thoughtworks.xstream.io.StreamException; message:  : only whitespace content allowed before start tag and not o (position: START_DOCUMENT seen o... @1:1) ");
        } catch (com.thoughtworks.xstream.io.StreamException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemIDs", (java.lang.Throwable) invalidParameterException5);
        org.plista.kornakapi.web.MissingParameterException missingParameterException12 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException14 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.MissingParameterException missingParameterException16 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException18 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException16.addSuppressed((java.lang.Throwable) missingParameterException18);
        invalidParameterException14.addSuppressed((java.lang.Throwable) missingParameterException18);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException21 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException14);
        org.plista.kornakapi.web.MissingParameterException missingParameterException25 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException26 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException25);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException27 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException25);
        invalidParameterException21.addSuppressed((java.lang.Throwable) missingParameterException25);
        org.plista.kornakapi.web.MissingParameterException missingParameterException33 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException34 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException33);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException35 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException33);
        java.lang.Throwable[] throwableArray36 = missingParameterException33.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException37 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException33);
        missingParameterException25.addSuppressed((java.lang.Throwable) missingParameterException33);
        invalidParameterException7.addSuppressed((java.lang.Throwable) missingParameterException25);
        java.lang.String str40 = missingParameterException25.toString();
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str40, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet2 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet3 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        setPreferenceServlet2.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet4);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet7 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet2.init((javax.servlet.ServletConfig) recommendServlet7);
        recommendServlet7.init();
        addCandidateServlet0.init((javax.servlet.ServletConfig) recommendServlet7);
        java.lang.String str11 = recommendServlet7.getServletInfo();
        org.plista.kornakapi.web.MissingParameterException missingParameterException16 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException17 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException16);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException16);
        org.plista.kornakapi.web.MissingParameterException missingParameterException20 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException22 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException20.addSuppressed((java.lang.Throwable) missingParameterException22);
        invalidParameterException18.addSuppressed((java.lang.Throwable) missingParameterException22);
        org.plista.kornakapi.web.MissingParameterException missingParameterException28 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException29 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException28);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException30 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException28);
        org.plista.kornakapi.web.MissingParameterException missingParameterException32 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException34 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException32.addSuppressed((java.lang.Throwable) missingParameterException34);
        invalidParameterException30.addSuppressed((java.lang.Throwable) missingParameterException34);
        missingParameterException22.addSuppressed((java.lang.Throwable) missingParameterException34);
        org.plista.kornakapi.web.MissingParameterException missingParameterException42 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException43 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException42);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException44 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException42);
        java.lang.Throwable[] throwableArray45 = missingParameterException42.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException46 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException42);
        missingParameterException22.addSuppressed((java.lang.Throwable) invalidParameterException46);
        // The following exception was thrown during execution in test generation
        try {
            recommendServlet7.log("itemID", (java.lang.Throwable) missingParameterException22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        batchDeleteCandidatesServlet0.destroy();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet12 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str13 = trainServlet12.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet14 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet14.destroy();
        javax.servlet.ServletConfig servletConfig16 = deleteCandidateServlet14.getServletConfig();
        deleteCandidateServlet14.destroy();
        trainServlet12.init((javax.servlet.ServletConfig) deleteCandidateServlet14);
        javax.servlet.ServletConfig servletConfig19 = deleteCandidateServlet14.getServletConfig();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) deleteCandidateServlet14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = batchDeleteCandidatesServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertNull(servletConfig19);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(10);
        double double7 = factorizationbasedRecommenderConfig0.getAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (byte) 100);
        double double10 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setAlpha((double) (short) 10);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer13 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file14 = null;
        org.plista.kornakapi.core.storage.Storage storage15 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender16 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer13.train(file14, storage15, recommender16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet0.init();
        java.lang.String str2 = batchAddCandidatesServlet0.getServletInfo();
        batchAddCandidatesServlet0.init();
        java.lang.String str4 = batchAddCandidatesServlet0.getServletInfo();
        batchAddCandidatesServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = batchAddCandidatesServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration2 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str3 = storageConfiguration2.getJdbcDriverClass();
        storageConfiguration2.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str6 = storageConfiguration2.getJdbcUrl();
        java.lang.String str7 = storageConfiguration2.getJdbcDriverClass();
        java.lang.String str8 = storageConfiguration2.getJdbcDriverClass();
        java.lang.String str9 = storageConfiguration2.getPassword();
        configuration1.setStorageConfiguration(storageConfiguration2);
        java.lang.String str11 = storageConfiguration2.getPassword();
        storageConfiguration2.setJdbcUrl("batchSize");
        java.lang.String str14 = storageConfiguration2.getPassword();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException4);
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException8.addSuppressed((java.lang.Throwable) missingParameterException10);
        invalidParameterException6.addSuppressed((java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.MissingParameterException missingParameterException16 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException17 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException16);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException16);
        org.plista.kornakapi.web.MissingParameterException missingParameterException20 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException22 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException20.addSuppressed((java.lang.Throwable) missingParameterException22);
        invalidParameterException18.addSuppressed((java.lang.Throwable) missingParameterException22);
        missingParameterException10.addSuppressed((java.lang.Throwable) missingParameterException22);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException26 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemID", (java.lang.Throwable) missingParameterException10);
        java.lang.Throwable throwable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            missingParameterException10.addSuppressed(throwable27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore(1L, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fixedCandidatesIDRescorer1.isFiltered(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair3 = null;
        double double5 = filteringLongPairRescorer2.rescore(longPair3, 52.0d);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer2.rescore(longPair6, (double) 100);
        org.apache.mahout.common.LongPair longPair9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringLongPairRescorer2.isFiltered(longPair9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str2 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet3 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet4 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet5 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        setPreferenceServlet3.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet5);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet8 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet3.init((javax.servlet.ServletConfig) recommendServlet8);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet3);
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet11 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet12 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet13 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet12.init((javax.servlet.ServletConfig) batchSetPreferencesServlet13);
        javax.servlet.ServletConfig servletConfig15 = batchSetPreferencesServlet12.getServletConfig();
        addCandidateServlet11.init((javax.servlet.ServletConfig) batchSetPreferencesServlet12);
        javax.servlet.ServletConfig servletConfig17 = addCandidateServlet11.getServletConfig();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) addCandidateServlet11);
        javax.servlet.ServletRequest servletRequest19 = null;
        javax.servlet.ServletResponse servletResponse20 = null;
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet11.service(servletRequest19, servletResponse20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(servletConfig15);
        org.junit.Assert.assertNotNull(servletConfig17);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer2 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file3 = null;
        org.plista.kornakapi.core.storage.Storage storage4 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender5 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer2.train(file3, storage4, recommender5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig3 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig3.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig3);
        itembasedRecommenderConfig3.setRetrainCronExpression("");
        itembasedRecommenderConfig3.setSimilarItemsPerItem(10);
        java.lang.String str11 = itembasedRecommenderConfig3.getName();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig3);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer13 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig3);
        java.io.File file14 = null;
        org.plista.kornakapi.core.storage.Storage storage15 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer13.train(file14, storage15, recommender16, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) (byte) 1);
        factorizationbasedRecommenderConfig0.setLambda((double) 100);
        factorizationbasedRecommenderConfig0.setNumberOfIterations(1);
        boolean boolean12 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (short) 10);
        factorizationbasedRecommenderConfig0.setNumberOfIterations(35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = setPreferenceServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }
}
