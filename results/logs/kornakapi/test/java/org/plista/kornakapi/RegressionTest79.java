package org.plista.kornakapi;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest79 {

    public static boolean debug = false;

    @Test
    public void test39501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39501");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        int int2 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        int int4 = itembasedRecommenderConfig0.getSimilarItemsPerItem();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer5 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setSimilarItemsPerItem((int) (short) 0);
        itembasedRecommenderConfig0.setSimilarityClass("MutablePreference{userID=0, itemID=10, value=10.0}");
        int int10 = itembasedRecommenderConfig0.getSimilarItemsPerItem();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer11 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file12 = null;
        org.plista.kornakapi.core.storage.Storage storage13 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer11.train(file12, storage13, recommender14, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test39502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39502");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = null; // flaky: configuration2.getStorageConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig4 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double5 = factorizationbasedRecommenderConfig4.getAlpha();
        double double6 = factorizationbasedRecommenderConfig4.getLambda();
        boolean boolean7 = factorizationbasedRecommenderConfig4.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig4.setNumberOfIterations((int) (byte) 100);
// flaky:         configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig4);
        factorizationbasedRecommenderConfig4.setLambda((double) 1);
        boolean boolean13 = factorizationbasedRecommenderConfig4.isUsesImplicitFeedback();
        int int14 = factorizationbasedRecommenderConfig4.getNumberOfIterations();
        int int15 = factorizationbasedRecommenderConfig4.getRetrainAfterPreferenceChanges();
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test39503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39503");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        long long3 = mutablePreference0.getUserID();
        long long4 = mutablePreference0.getUserID();
        mutablePreference0.set(97L, (long) 1, (float) 97L);
        long long9 = mutablePreference0.getUserID();
        mutablePreference0.set((long) '4', 52L, 0.0f);
        mutablePreference0.setValue((float) 97L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test39504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39504");
        org.plista.kornakapi.web.servlets.BigBangServletContextListener bigBangServletContextListener0 = new org.plista.kornakapi.web.servlets.BigBangServletContextListener();
        javax.servlet.ServletContextEvent servletContextEvent1 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent1);
        javax.servlet.ServletContextEvent servletContextEvent3 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent3);
        javax.servlet.ServletContextEvent servletContextEvent5 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent5);
        javax.servlet.ServletContextEvent servletContextEvent7 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent7);
        javax.servlet.ServletContextEvent servletContextEvent9 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent9);
        javax.servlet.ServletContextEvent servletContextEvent11 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent11);
        javax.servlet.ServletContextEvent servletContextEvent13 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent13);
        javax.servlet.ServletContextEvent servletContextEvent15 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent15);
        javax.servlet.ServletContextEvent servletContextEvent17 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent17);
        javax.servlet.ServletContextEvent servletContextEvent19 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent19);
        javax.servlet.ServletContextEvent servletContextEvent21 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent21);
        javax.servlet.ServletContextEvent servletContextEvent23 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent23);
        javax.servlet.ServletContextEvent servletContextEvent25 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent25);
        javax.servlet.ServletContextEvent servletContextEvent27 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent27);
        javax.servlet.ServletContextEvent servletContextEvent29 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent29);
        javax.servlet.ServletContextEvent servletContextEvent31 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent31);
        javax.servlet.ServletContextEvent servletContextEvent33 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent33);
        javax.servlet.ServletContextEvent servletContextEvent35 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent35);
        javax.servlet.ServletContextEvent servletContextEvent37 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent37);
        javax.servlet.ServletContextEvent servletContextEvent39 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent39);
        javax.servlet.ServletContextEvent servletContextEvent41 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent41);
        javax.servlet.ServletContextEvent servletContextEvent43 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent43);
        javax.servlet.ServletContextEvent servletContextEvent45 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent45);
        javax.servlet.ServletContextEvent servletContextEvent47 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent47);
        javax.servlet.ServletContextEvent servletContextEvent49 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent49);
        javax.servlet.ServletContextEvent servletContextEvent51 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent51);
        javax.servlet.ServletContextEvent servletContextEvent53 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent53);
        javax.servlet.ServletContextEvent servletContextEvent55 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent55);
        javax.servlet.ServletContextEvent servletContextEvent57 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent57);
        javax.servlet.ServletContextEvent servletContextEvent59 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent59);
        javax.servlet.ServletContextEvent servletContextEvent61 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent61);
        javax.servlet.ServletContextEvent servletContextEvent63 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent63);
        javax.servlet.ServletContextEvent servletContextEvent65 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent65);
        javax.servlet.ServletContextEvent servletContextEvent67 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent67);
        javax.servlet.ServletContextEvent servletContextEvent69 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent69);
        javax.servlet.ServletContextEvent servletContextEvent71 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent71);
        javax.servlet.ServletContextEvent servletContextEvent73 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent73);
        javax.servlet.ServletContextEvent servletContextEvent75 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent75);
        javax.servlet.ServletContextEvent servletContextEvent77 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent77);
        javax.servlet.ServletContextEvent servletContextEvent79 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent79);
        javax.servlet.ServletContextEvent servletContextEvent81 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent81);
        javax.servlet.ServletContextEvent servletContextEvent83 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent83);
        javax.servlet.ServletContextEvent servletContextEvent85 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent85);
        javax.servlet.ServletContextEvent servletContextEvent87 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent87);
        javax.servlet.ServletContextEvent servletContextEvent89 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent89);
        javax.servlet.ServletContextEvent servletContextEvent91 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent91);
        javax.servlet.ServletContextEvent servletContextEvent93 = null;
// flaky:         bigBangServletContextListener0.contextDestroyed(servletContextEvent93);
    }

    @Test
    public void test39505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39505");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int8 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        boolean boolean9 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        int int10 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        double double11 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("org.plista.kornakapi.web.InvalidParameterException: label");
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (short) 10);
        java.lang.String str16 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        boolean boolean17 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: label" + "'", str16, "org.plista.kornakapi.web.InvalidParameterException: label");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test39506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39506");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage6 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration7 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler8 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler9 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler10 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener11 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.storage.Storage storage12 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration13 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig14 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double15 = factorizationbasedRecommenderConfig14.getAlpha();
        double double16 = factorizationbasedRecommenderConfig14.getLambda();
        int int17 = factorizationbasedRecommenderConfig14.getNumberOfFeatures();
        java.lang.String str18 = factorizationbasedRecommenderConfig14.getRetrainCronExpression();
        int int19 = factorizationbasedRecommenderConfig14.getNumberOfFeatures();
        factorizationbasedRecommenderConfig14.setNumberOfIterations((int) (short) 0);
        boolean boolean22 = factorizationbasedRecommenderConfig14.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig14.setAlpha((double) 52);
        boolean boolean25 = factorizationbasedRecommenderConfig14.isUsesImplicitFeedback();
        boolean boolean26 = factorizationbasedRecommenderConfig14.isUsesImplicitFeedback();
        int int27 = factorizationbasedRecommenderConfig14.getNumberOfFeatures();
// flaky:         configuration13.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig14);
// flaky:         configuration13.setModelDirectory("org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=32, itemID=10, value=10.0}");
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList31 = null; // flaky: configuration13.getFactorizationbasedRecommenders();
        org.plista.kornakapi.core.config.Configuration configuration32 = new org.plista.kornakapi.core.config.Configuration();
        configuration32.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str35 = configuration32.getModelDirectory();
        configuration32.setNumProcessorsForTraining((int) (byte) 100);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration38 = configuration32.getStorageConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig39 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double40 = factorizationbasedRecommenderConfig39.getAlpha();
        double double41 = factorizationbasedRecommenderConfig39.getLambda();
        int int42 = factorizationbasedRecommenderConfig39.getNumberOfFeatures();
        factorizationbasedRecommenderConfig39.setUsesImplicitFeedback(true);
        double double45 = factorizationbasedRecommenderConfig39.getAlpha();
        java.lang.String str46 = factorizationbasedRecommenderConfig39.getRetrainCronExpression();
        int int47 = factorizationbasedRecommenderConfig39.getRetrainAfterPreferenceChanges();
        int int48 = factorizationbasedRecommenderConfig39.getNumberOfIterations();
        factorizationbasedRecommenderConfig39.setNumberOfFeatures((int) '#');
        int int51 = factorizationbasedRecommenderConfig39.getNumberOfFeatures();
        configuration32.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig39);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration53 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str54 = storageConfiguration53.getJdbcDriverClass();
        storageConfiguration53.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str57 = storageConfiguration53.getJdbcUrl();
        java.lang.String str58 = storageConfiguration53.getJdbcDriverClass();
        java.lang.String str59 = storageConfiguration53.getJdbcDriverClass();
        java.lang.String str60 = storageConfiguration53.getPassword();
        java.lang.String str61 = storageConfiguration53.getJdbcDriverClass();
        java.lang.String str62 = storageConfiguration53.getJdbcDriverClass();
        java.lang.String str63 = storageConfiguration53.getJdbcUrl();
        configuration32.setStorageConfiguration(storageConfiguration53);
        java.lang.String str65 = storageConfiguration53.getJdbcDriverClass();
        java.lang.String str66 = storageConfiguration53.getPassword();
        storageConfiguration53.setJdbcUrl("MutablePreference{userID=1, itemID=35, value=10.0}");
// flaky:         configuration13.setStorageConfiguration(storageConfiguration53);
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNull(storage6);
// flaky:         org.junit.Assert.assertNotNull(configuration7);
        org.junit.Assert.assertNull(trainingScheduler8);
        org.junit.Assert.assertNull(trainingScheduler9);
        org.junit.Assert.assertNull(trainingScheduler10);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener11);
        org.junit.Assert.assertNull(storage12);
// flaky:         org.junit.Assert.assertNotNull(configuration13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
// flaky:         org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(storageConfiguration38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test39507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39507");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        double double9 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str10 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setLambda((double) 10000);
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("itemID");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test39508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39508");
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
        javax.servlet.ServletConfig servletConfig19 = batchDeleteCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet20 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet20.init();
        setPreferenceServlet20.init();
        setPreferenceServlet20.destroy();
        javax.servlet.ServletConfig servletConfig24 = setPreferenceServlet20.getServletConfig();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet25 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str26 = trainServlet25.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet27 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet27.destroy();
        javax.servlet.ServletConfig servletConfig29 = deleteCandidateServlet27.getServletConfig();
        deleteCandidateServlet27.destroy();
        trainServlet25.init((javax.servlet.ServletConfig) deleteCandidateServlet27);
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet32 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet32.init();
        java.lang.String str34 = batchAddCandidatesServlet32.getServletInfo();
        javax.servlet.ServletConfig servletConfig35 = batchAddCandidatesServlet32.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet36 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str37 = batchDeleteCandidatesServlet36.getServletInfo();
        java.lang.String str38 = batchDeleteCandidatesServlet36.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet39 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet40 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet41 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet40.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet41);
        setPreferenceServlet39.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet41);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet44 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet39.init((javax.servlet.ServletConfig) recommendServlet44);
        batchDeleteCandidatesServlet36.init((javax.servlet.ServletConfig) setPreferenceServlet39);
        batchAddCandidatesServlet32.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet36);
        batchDeleteCandidatesServlet36.init();
        java.lang.String str49 = batchDeleteCandidatesServlet36.getServletInfo();
        java.lang.String str50 = batchDeleteCandidatesServlet36.getServletInfo();
        trainServlet25.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet36);
        setPreferenceServlet20.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet36);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet20);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet54 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str55 = batchDeleteCandidatesServlet54.getServletInfo();
        java.lang.String str56 = batchDeleteCandidatesServlet54.getServletInfo();
        batchDeleteCandidatesServlet54.destroy();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet58 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str59 = batchDeleteCandidatesServlet58.getServletInfo();
        batchDeleteCandidatesServlet54.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet58);
        batchDeleteCandidatesServlet58.destroy();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet58);
        java.lang.String str63 = batchDeleteCandidatesServlet58.getServletInfo();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(servletConfig15);
        org.junit.Assert.assertNotNull(servletConfig17);
        org.junit.Assert.assertNotNull(servletConfig19);
        org.junit.Assert.assertNull(servletConfig24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(servletConfig29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(servletConfig35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test39509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39509");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = null; // flaky: configuration1.getItembasedRecommenders();
        java.lang.String str3 = null; // flaky: configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration4 = null; // flaky: configuration1.getStorageConfiguration();
// flaky:         configuration1.setNumProcessorsForTraining((int) '#');
// flaky:         configuration1.setModelDirectory("value");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig9 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig9.setSimilarityClass("");
        java.lang.String str12 = itembasedRecommenderConfig9.getName();
// flaky:         configuration1.addItembasedRecommender(itembasedRecommenderConfig9);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer14 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig9);
        java.io.File file15 = null;
        org.plista.kornakapi.core.storage.Storage storage16 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer14.train(file15, storage16, recommender17, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=32, itemID=10, value=10.0}" + "'", str3, "org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=32, itemID=10, value=10.0}");
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test39510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39510");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        int int1 = configuration0.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration2 = configuration0.getStorageConfiguration();
        configuration0.setNumProcessorsForTraining((int) '4');
        org.plista.kornakapi.core.config.Configuration configuration5 = new org.plista.kornakapi.core.config.Configuration();
        configuration5.setNumProcessorsForTraining((int) (short) 100);
        configuration5.setModelDirectory("userID");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig10 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str11 = itembasedRecommenderConfig10.getRetrainCronExpression();
        int int12 = itembasedRecommenderConfig10.getRetrainAfterPreferenceChanges();
        java.lang.String str13 = itembasedRecommenderConfig10.getSimilarityClass();
        itembasedRecommenderConfig10.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig10.setRetrainCronExpression("value");
        int int18 = itembasedRecommenderConfig10.getRetrainAfterPreferenceChanges();
        configuration5.addItembasedRecommender(itembasedRecommenderConfig10);
        configuration0.addItembasedRecommender(itembasedRecommenderConfig10);
        int int21 = itembasedRecommenderConfig10.getRetrainAfterPreferenceChanges();
        int int22 = itembasedRecommenderConfig10.getSimilarItemsPerItem();
        itembasedRecommenderConfig10.setSimilarityClass("MutablePreference{userID=0, itemID=0, value=0.0}");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer25 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig10);
        itembasedRecommenderConfig10.setSimilarityClass("MutablePreference{userID=10, itemID=32, value=-1.0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(storageConfiguration2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test39511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39511");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double7 = fixedCandidatesIDRescorer1.rescore((long) (byte) 100, (double) 'a');
        double double10 = fixedCandidatesIDRescorer1.rescore((long) 35, 0.0d);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer11 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double14 = fixedCandidatesIDRescorer1.rescore((long) 100, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test39512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39512");
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
        factorizationbasedRecommenderConfig0.setAlpha((double) ' ');
        factorizationbasedRecommenderConfig0.setLambda(10.0d);
        factorizationbasedRecommenderConfig0.setLambda((double) 52.0f);
        int int19 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        double double20 = factorizationbasedRecommenderConfig0.getAlpha();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test39513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39513");
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener0 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener0.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener2 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener2);
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener5 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener5.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener7 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener5.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener7);
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler12 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener15 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler12, "label", (int) ' ');
        delegatingPreferenceChangeListener7.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener15);
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener7);
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener18 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener18.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener20 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener20.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener18.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener20);
        delegatingPreferenceChangeListener20.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener20.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener25 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener25.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener27 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener27.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener27.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener25.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener27);
        delegatingPreferenceChangeListener27.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener20.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener27);
        delegatingPreferenceChangeListener20.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener20.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener35 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener35.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener37 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener37.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener35.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener37);
        delegatingPreferenceChangeListener37.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener37.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener42 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener42.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener44 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener44.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener44.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener42.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener44);
        delegatingPreferenceChangeListener44.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener37.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener44);
        delegatingPreferenceChangeListener20.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener37);
        delegatingPreferenceChangeListener7.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener20);
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler52 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener55 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler52, "MutablePreference{userID=52, itemID=32, value=-1.0}", (int) (short) 10);
        delegatingPreferenceChangeListener7.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener55);
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
    }

    @Test
    public void test39514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39514");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        java.lang.String str3 = itembasedRecommenderConfig0.getName();
        java.lang.String str4 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setName("");
        java.lang.String str7 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setSimilarItemsPerItem((int) '4');
        java.lang.String str10 = itembasedRecommenderConfig0.getSimilarityClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test39515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39515");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration5 = null; // flaky: configuration4.getStorageConfiguration();
        int int6 = 0; // flaky: configuration4.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig7 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double8 = factorizationbasedRecommenderConfig7.getAlpha();
        double double9 = factorizationbasedRecommenderConfig7.getLambda();
        int int10 = factorizationbasedRecommenderConfig7.getNumberOfFeatures();
        factorizationbasedRecommenderConfig7.setUsesImplicitFeedback(true);
        double double13 = factorizationbasedRecommenderConfig7.getAlpha();
        java.lang.String str14 = factorizationbasedRecommenderConfig7.getRetrainCronExpression();
        int int15 = factorizationbasedRecommenderConfig7.getRetrainAfterPreferenceChanges();
        boolean boolean16 = factorizationbasedRecommenderConfig7.isUsesImplicitFeedback();
        int int17 = factorizationbasedRecommenderConfig7.getNumberOfFeatures();
        double double18 = factorizationbasedRecommenderConfig7.getLambda();
        factorizationbasedRecommenderConfig7.setAlpha(52.0d);
        java.lang.String str21 = factorizationbasedRecommenderConfig7.getName();
// flaky:         configuration4.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig7);
        factorizationbasedRecommenderConfig7.setNumberOfFeatures((int) (byte) -1);
        double double25 = factorizationbasedRecommenderConfig7.getAlpha();
        factorizationbasedRecommenderConfig7.setUsesImplicitFeedback(false);
        boolean boolean28 = factorizationbasedRecommenderConfig7.isUsesImplicitFeedback();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test39516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39516");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str4 = storageConfiguration0.getPassword();
        java.lang.String str5 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("hi!");
        storageConfiguration0.setJdbcDriverClass("file");
        storageConfiguration0.setUsername("value");
        storageConfiguration0.setUsername("MutablePreference{userID=10, itemID=52, value=35.0}");
        java.lang.String str14 = storageConfiguration0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test39517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39517");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        int int1 = configuration0.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig3 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig3.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig3);
        itembasedRecommenderConfig3.setRetrainCronExpression("");
        itembasedRecommenderConfig3.setSimilarItemsPerItem(10);
        java.lang.String str11 = itembasedRecommenderConfig3.getName();
        java.lang.String str12 = itembasedRecommenderConfig3.getName();
        int int13 = itembasedRecommenderConfig3.getSimilarItemsPerItem();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig3);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList15 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig16 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig16.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer19 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig16);
        itembasedRecommenderConfig16.setRetrainCronExpression("");
        itembasedRecommenderConfig16.setName("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        itembasedRecommenderConfig16.setSimilarItemsPerItem((int) (byte) 100);
        java.lang.String str26 = itembasedRecommenderConfig16.getRetrainCronExpression();
        int int27 = itembasedRecommenderConfig16.getSimilarItemsPerItem();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig16);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList29 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList30 = configuration0.getFactorizationbasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList31 = configuration0.getFactorizationbasedRecommenders();
        configuration0.setModelDirectory("MutablePreference{userID=0, itemID=0, value=0.0}");
        org.plista.kornakapi.core.config.Configuration configuration34 = new org.plista.kornakapi.core.config.Configuration();
        configuration34.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig37 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double38 = factorizationbasedRecommenderConfig37.getAlpha();
        double double39 = factorizationbasedRecommenderConfig37.getLambda();
        configuration34.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig37);
        java.lang.String str41 = configuration34.getModelDirectory();
        int int42 = configuration34.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList43 = configuration34.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration44 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str45 = storageConfiguration44.getJdbcDriverClass();
        storageConfiguration44.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str48 = storageConfiguration44.getJdbcUrl();
        java.lang.String str49 = storageConfiguration44.getJdbcUrl();
        storageConfiguration44.setJdbcUrl("label");
        configuration34.setStorageConfiguration(storageConfiguration44);
        java.lang.String str53 = storageConfiguration44.getUsername();
        java.lang.String str54 = storageConfiguration44.getUsername();
        java.lang.String str55 = storageConfiguration44.getPassword();
        configuration0.setStorageConfiguration(storageConfiguration44);
        configuration0.setModelDirectory("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: howMany");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList29);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList30);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList31);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str53, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str54, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test39518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39518");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = null; // flaky: configuration1.getItembasedRecommenders();
        java.lang.String str3 = null; // flaky: configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration4 = null; // flaky: configuration1.getStorageConfiguration();
// flaky:         configuration1.setNumProcessorsForTraining((int) '#');
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration7 = null; // flaky: configuration1.getStorageConfiguration();
// flaky:         storageConfiguration7.setJdbcUrl("howMany");
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "value" + "'", str3, "value");
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration4);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration7);
    }

    @Test
    public void test39519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39519");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig6 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double7 = factorizationbasedRecommenderConfig6.getAlpha();
        double double8 = factorizationbasedRecommenderConfig6.getLambda();
        int int9 = factorizationbasedRecommenderConfig6.getNumberOfFeatures();
        factorizationbasedRecommenderConfig6.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig6.setNumberOfFeatures((int) (short) 100);
        boolean boolean14 = factorizationbasedRecommenderConfig6.isUsesImplicitFeedback();
// flaky:         configuration5.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig6);
        org.plista.kornakapi.web.Components components16 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration17 = null; // flaky: components16.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler18 = null; // flaky: components16.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler19 = null; // flaky: components16.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration20 = null; // flaky: components16.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration21 = null; // flaky: components16.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig22 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig22.setSimilarityClass("");
        java.lang.String str25 = itembasedRecommenderConfig22.getName();
        java.lang.String str26 = itembasedRecommenderConfig22.getSimilarityClass();
        itembasedRecommenderConfig22.setName("");
        java.lang.String str29 = itembasedRecommenderConfig22.getSimilarityClass();
// flaky:         configuration21.addItembasedRecommender(itembasedRecommenderConfig22);
        itembasedRecommenderConfig22.setSimilarItemsPerItem((int) (byte) 1);
// flaky:         configuration5.addItembasedRecommender(itembasedRecommenderConfig22);
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig34 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str35 = itembasedRecommenderConfig34.getRetrainCronExpression();
        int int36 = itembasedRecommenderConfig34.getRetrainAfterPreferenceChanges();
        int int37 = itembasedRecommenderConfig34.getRetrainAfterPreferenceChanges();
// flaky:         configuration5.addItembasedRecommender(itembasedRecommenderConfig34);
        int int39 = 0; // flaky: configuration5.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList40 = null; // flaky: configuration5.getFactorizationbasedRecommenders();
        java.lang.String str41 = null; // flaky: configuration5.getModelDirectory();
// flaky:         configuration5.setModelDirectory("MutablePreference{userID=1, itemID=-1, value=35.0}");
        int int44 = 0; // flaky: configuration5.getNumProcessorsForTraining();
        org.plista.kornakapi.web.Components components45 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration46 = null; // flaky: components45.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration47 = null; // flaky: components45.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage48 = null; // flaky: components45.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener49 = null; // flaky: components45.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration50 = null; // flaky: components45.getConfiguration();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener51 = null; // flaky: components45.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration52 = null; // flaky: components45.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig53 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double54 = factorizationbasedRecommenderConfig53.getAlpha();
        double double55 = factorizationbasedRecommenderConfig53.getLambda();
        int int56 = factorizationbasedRecommenderConfig53.getNumberOfFeatures();
        factorizationbasedRecommenderConfig53.setUsesImplicitFeedback(false);
        double double59 = factorizationbasedRecommenderConfig53.getAlpha();
        factorizationbasedRecommenderConfig53.setRetrainAfterPreferenceChanges(100);
        boolean boolean62 = factorizationbasedRecommenderConfig53.isUsesImplicitFeedback();
        double double63 = factorizationbasedRecommenderConfig53.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer64 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig53);
        double double65 = factorizationbasedRecommenderConfig53.getAlpha();
        factorizationbasedRecommenderConfig53.setRetrainAfterPreferenceChanges((int) ' ');
// flaky:         configuration52.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig53);
// flaky:         configuration5.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig53);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList70 = null; // flaky: configuration5.getItembasedRecommenders();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertNotNull(components16);
// flaky:         org.junit.Assert.assertNotNull(configuration17);
        org.junit.Assert.assertNull(trainingScheduler18);
        org.junit.Assert.assertNull(trainingScheduler19);
// flaky:         org.junit.Assert.assertNotNull(configuration20);
// flaky:         org.junit.Assert.assertNotNull(configuration21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
// flaky:         org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "value" + "'", str41, "value");
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
// flaky:         org.junit.Assert.assertNotNull(components45);
// flaky:         org.junit.Assert.assertNotNull(configuration46);
// flaky:         org.junit.Assert.assertNotNull(configuration47);
        org.junit.Assert.assertNull(storage48);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener49);
// flaky:         org.junit.Assert.assertNotNull(configuration50);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener51);
// flaky:         org.junit.Assert.assertNotNull(configuration52);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList70);
    }

    @Test
    public void test39520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39520");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener2 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener3 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
        int int6 = 0; // flaky: configuration5.getNumProcessorsForTraining();
        int int7 = 0; // flaky: configuration5.getNumProcessorsForTraining();
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener2);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener3);
        org.junit.Assert.assertNull(trainingScheduler4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test39521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39521");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration5 = null; // flaky: configuration4.getStorageConfiguration();
        int int6 = 0; // flaky: configuration4.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig7 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double8 = factorizationbasedRecommenderConfig7.getAlpha();
        double double9 = factorizationbasedRecommenderConfig7.getLambda();
        int int10 = factorizationbasedRecommenderConfig7.getNumberOfFeatures();
        factorizationbasedRecommenderConfig7.setUsesImplicitFeedback(true);
        double double13 = factorizationbasedRecommenderConfig7.getAlpha();
        java.lang.String str14 = factorizationbasedRecommenderConfig7.getRetrainCronExpression();
        int int15 = factorizationbasedRecommenderConfig7.getRetrainAfterPreferenceChanges();
        boolean boolean16 = factorizationbasedRecommenderConfig7.isUsesImplicitFeedback();
        int int17 = factorizationbasedRecommenderConfig7.getNumberOfFeatures();
        double double18 = factorizationbasedRecommenderConfig7.getLambda();
        factorizationbasedRecommenderConfig7.setAlpha(52.0d);
        java.lang.String str21 = factorizationbasedRecommenderConfig7.getName();
// flaky:         configuration4.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig7);
        factorizationbasedRecommenderConfig7.setNumberOfFeatures((int) (byte) -1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer25 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig7);
        java.io.File file26 = null;
        org.plista.kornakapi.core.storage.Storage storage27 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender28 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer25.train(file26, storage27, recommender28, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test39522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39522");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        boolean boolean8 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        java.lang.String str11 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setName("MutablePreference{userID=1, itemID=10000, value=97.0}");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test39523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39523");
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
        setPreferenceServlet3.destroy();
        setPreferenceServlet3.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = setPreferenceServlet3.getInitParameter("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=100, itemID=0, value=0.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39524");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList6 = null; // flaky: configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration7 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str8 = storageConfiguration7.getJdbcDriverClass();
        storageConfiguration7.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str11 = storageConfiguration7.getJdbcUrl();
        java.lang.String str12 = storageConfiguration7.getJdbcDriverClass();
        java.lang.String str13 = storageConfiguration7.getJdbcDriverClass();
        java.lang.String str14 = storageConfiguration7.getPassword();
// flaky:         configuration5.setStorageConfiguration(storageConfiguration7);
        java.lang.String str16 = null; // flaky: configuration5.getModelDirectory();
// flaky:         configuration5.setModelDirectory("org.plista.kornakapi.web.MissingParameterException: itemID");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig19 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str20 = itembasedRecommenderConfig19.getSimilarityClass();
        int int21 = itembasedRecommenderConfig19.getSimilarItemsPerItem();
        int int22 = itembasedRecommenderConfig19.getRetrainAfterPreferenceChanges();
// flaky:         configuration5.addItembasedRecommender(itembasedRecommenderConfig19);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList24 = null; // flaky: configuration5.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList25 = null; // flaky: configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig26 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double27 = factorizationbasedRecommenderConfig26.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer28 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig26);
        factorizationbasedRecommenderConfig26.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig26.setNumberOfIterations((int) '#');
        double double33 = factorizationbasedRecommenderConfig26.getLambda();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer34 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig26);
        factorizationbasedRecommenderConfig26.setUsesImplicitFeedback(true);
        java.lang.String str37 = factorizationbasedRecommenderConfig26.getName();
        factorizationbasedRecommenderConfig26.setRetrainCronExpression("");
// flaky:         configuration5.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig26);
// flaky:         configuration5.setNumProcessorsForTraining((int) (byte) -1);
        java.lang.String str43 = null; // flaky: configuration5.getModelDirectory();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MutablePreference{userID=1, itemID=-1, value=35.0}" + "'", str16, "MutablePreference{userID=1, itemID=-1, value=35.0}");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList24);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(str37);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str43, "org.plista.kornakapi.web.MissingParameterException: itemID");
    }

    @Test
    public void test39525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39525");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = null;
        batchDeleteCandidatesServlet0.init(servletConfig3);
        batchDeleteCandidatesServlet0.destroy();
        java.lang.String str6 = batchDeleteCandidatesServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = batchDeleteCandidatesServlet0.getServletConfig();
        batchDeleteCandidatesServlet0.destroy();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet9 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet9.init();
        setPreferenceServlet9.init();
        setPreferenceServlet9.destroy();
        javax.servlet.ServletConfig servletConfig13 = setPreferenceServlet9.getServletConfig();
        java.lang.String str14 = setPreferenceServlet9.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet15 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet16 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str17 = batchDeleteCandidatesServlet16.getServletInfo();
        java.lang.String str18 = batchDeleteCandidatesServlet16.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet19 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet20 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet21 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet20.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet21);
        setPreferenceServlet19.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet21);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet24 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet19.init((javax.servlet.ServletConfig) recommendServlet24);
        batchDeleteCandidatesServlet16.init((javax.servlet.ServletConfig) setPreferenceServlet19);
        batchDeleteCandidatesServlet16.destroy();
        batchDeleteCandidatesServlet15.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet16);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet29 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet30 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet31 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet30.init((javax.servlet.ServletConfig) batchSetPreferencesServlet31);
        batchDeleteCandidatesServlet29.init((javax.servlet.ServletConfig) batchSetPreferencesServlet31);
        javax.servlet.ServletConfig servletConfig34 = batchSetPreferencesServlet31.getServletConfig();
        batchSetPreferencesServlet31.init();
        batchDeleteCandidatesServlet16.init((javax.servlet.ServletConfig) batchSetPreferencesServlet31);
        javax.servlet.ServletConfig servletConfig37 = batchDeleteCandidatesServlet16.getServletConfig();
        setPreferenceServlet9.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet16);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet16);
        java.lang.String str40 = batchDeleteCandidatesServlet16.getServletInfo();
        org.plista.kornakapi.web.MissingParameterException missingParameterException45 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException47 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException45.addSuppressed((java.lang.Throwable) missingParameterException47);
        java.lang.Throwable[] throwableArray49 = missingParameterException47.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException50 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException47);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException51 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) invalidParameterException50);
        java.lang.Throwable[] throwableArray52 = invalidParameterException51.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException55 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException57 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException55.addSuppressed((java.lang.Throwable) missingParameterException57);
        java.lang.Throwable[] throwableArray59 = missingParameterException57.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException60 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException57);
        invalidParameterException51.addSuppressed((java.lang.Throwable) invalidParameterException60);
        java.lang.Throwable[] throwableArray62 = invalidParameterException51.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException64 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException67 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException68 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException67);
        missingParameterException64.addSuppressed((java.lang.Throwable) invalidParameterException68);
        java.lang.Throwable[] throwableArray70 = invalidParameterException68.getSuppressed();
        invalidParameterException51.addSuppressed((java.lang.Throwable) invalidParameterException68);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet16.log("org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=97, itemID=52, value=-1.0}", (java.lang.Throwable) invalidParameterException51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(servletConfig34);
        org.junit.Assert.assertNotNull(servletConfig37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray70);
    }

    @Test
    public void test39526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39526");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener2 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener3 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage6 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration7 = null; // flaky: components0.getConfiguration();
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener2);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNull(storage6);
// flaky:         org.junit.Assert.assertNotNull(configuration7);
    }

    @Test
    public void test39527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39527");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        boolean boolean6 = factorizationbasedRecommenderConfig3.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer7 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig3);
        double double8 = factorizationbasedRecommenderConfig3.getAlpha();
// flaky:         configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        double double10 = factorizationbasedRecommenderConfig3.getAlpha();
        factorizationbasedRecommenderConfig3.setAlpha((double) (byte) 10);
        factorizationbasedRecommenderConfig3.setNumberOfFeatures(100);
        factorizationbasedRecommenderConfig3.setName("org.plista.kornakapi.web.MissingParameterException: recommender");
        double double17 = factorizationbasedRecommenderConfig3.getLambda();
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test39528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39528");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = setPreferenceServlet0.getServletConfig();
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        java.lang.String str6 = setPreferenceServlet0.getServletInfo();
        setPreferenceServlet0.init();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet8 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet9 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet9.init();
        batchDeleteCandidatesServlet8.init((javax.servlet.ServletConfig) addCandidateServlet9);
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet12 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet13 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet14 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet13.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet14);
        setPreferenceServlet12.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet14);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet17 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet12.init((javax.servlet.ServletConfig) recommendServlet17);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet19 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str20 = batchDeleteCandidatesServlet19.getServletInfo();
        java.lang.String str21 = batchDeleteCandidatesServlet19.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet22 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet23 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet24 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet23.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet24);
        setPreferenceServlet22.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet24);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet27 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet22.init((javax.servlet.ServletConfig) recommendServlet27);
        batchDeleteCandidatesServlet19.init((javax.servlet.ServletConfig) setPreferenceServlet22);
        setPreferenceServlet12.init((javax.servlet.ServletConfig) setPreferenceServlet22);
        javax.servlet.ServletConfig servletConfig31 = setPreferenceServlet12.getServletConfig();
        setPreferenceServlet12.init();
        addCandidateServlet9.init((javax.servlet.ServletConfig) setPreferenceServlet12);
        setPreferenceServlet12.destroy();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet35 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet36 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet37 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet36.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet37);
        setPreferenceServlet35.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet37);
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet40 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet40.init();
        java.lang.String str42 = batchAddCandidatesServlet40.getServletInfo();
        javax.servlet.ServletConfig servletConfig43 = batchAddCandidatesServlet40.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet44 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str45 = batchDeleteCandidatesServlet44.getServletInfo();
        java.lang.String str46 = batchDeleteCandidatesServlet44.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet47 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet48 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet49 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet48.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet49);
        setPreferenceServlet47.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet49);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet52 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet47.init((javax.servlet.ServletConfig) recommendServlet52);
        batchDeleteCandidatesServlet44.init((javax.servlet.ServletConfig) setPreferenceServlet47);
        batchAddCandidatesServlet40.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet44);
        batchDeleteCandidatesServlet44.init();
        java.lang.String str57 = batchDeleteCandidatesServlet44.getServletInfo();
        java.lang.String str58 = batchDeleteCandidatesServlet44.getServletInfo();
        batchDeleteCandidatesServlet44.init();
        batchDeleteCandidatesServlet37.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet44);
        java.lang.String str61 = batchDeleteCandidatesServlet44.getServletInfo();
        setPreferenceServlet12.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet44);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet12);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(servletConfig31);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(servletConfig43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test39529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39529");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration5 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str6 = storageConfiguration5.getJdbcDriverClass();
        java.lang.String str7 = storageConfiguration5.getUsername();
        storageConfiguration5.setPassword("label");
        java.lang.String str10 = storageConfiguration5.getUsername();
        storageConfiguration5.setPassword("");
// flaky:         configuration4.setStorageConfiguration(storageConfiguration5);
        storageConfiguration5.setJdbcUrl("MutablePreference{userID=0, itemID=100, value=-1.0}");
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test39530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39530");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.lang.String str2 = configuration0.getModelDirectory();
        configuration0.setNumProcessorsForTraining((int) '#');
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig5 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double6 = factorizationbasedRecommenderConfig5.getAlpha();
        double double7 = factorizationbasedRecommenderConfig5.getLambda();
        int int8 = factorizationbasedRecommenderConfig5.getNumberOfFeatures();
        java.lang.String str9 = factorizationbasedRecommenderConfig5.getRetrainCronExpression();
        int int10 = factorizationbasedRecommenderConfig5.getNumberOfFeatures();
        factorizationbasedRecommenderConfig5.setNumberOfIterations((int) (short) 0);
        factorizationbasedRecommenderConfig5.setRetrainAfterPreferenceChanges((int) (byte) 100);
        double double15 = factorizationbasedRecommenderConfig5.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig5);
        double double17 = factorizationbasedRecommenderConfig5.getLambda();
        double double18 = factorizationbasedRecommenderConfig5.getAlpha();
        factorizationbasedRecommenderConfig5.setNumberOfFeatures((int) (byte) 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test39531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39531");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        long long1 = mutablePreference0.getItemID();
        java.lang.String str2 = mutablePreference0.toString();
        long long3 = mutablePreference0.getItemID();
        java.lang.String str4 = mutablePreference0.toString();
        float float5 = mutablePreference0.getValue();
        mutablePreference0.setValue((float) '#');
        long long8 = mutablePreference0.getItemID();
        long long9 = mutablePreference0.getUserID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str2, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str4, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test39532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39532");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        long long3 = mutablePreference0.getItemID();
        mutablePreference0.setValue((float) 1);
        long long6 = mutablePreference0.getUserID();
        mutablePreference0.setValue((float) (short) 0);
        long long9 = mutablePreference0.getUserID();
        mutablePreference0.set((long) (short) 0, (long) (byte) 0, (float) 0L);
        java.lang.String str14 = mutablePreference0.toString();
        mutablePreference0.set((long) (short) 100, (long) '#', (float) 97L);
        float float19 = mutablePreference0.getValue();
        long long20 = mutablePreference0.getUserID();
        long long21 = mutablePreference0.getUserID();
        float float22 = mutablePreference0.getValue();
        long long23 = mutablePreference0.getUserID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str14, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 97.0f + "'", float19 == 97.0f);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 97.0f + "'", float22 == 97.0f);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test39533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39533");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.storage.Storage storage2 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration3 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage6 = null; // flaky: components0.storage();
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNull(storage2);
// flaky:         org.junit.Assert.assertNotNull(configuration3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNull(storage6);
    }

    @Test
    public void test39534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39534");
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
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet10 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet11 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet12 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet11.init((javax.servlet.ServletConfig) batchSetPreferencesServlet12);
        javax.servlet.ServletConfig servletConfig14 = batchSetPreferencesServlet11.getServletConfig();
        addCandidateServlet10.init((javax.servlet.ServletConfig) batchSetPreferencesServlet11);
        javax.servlet.ServletConfig servletConfig16 = batchSetPreferencesServlet11.getServletConfig();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet11);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet18 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet19 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet20 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet19.init((javax.servlet.ServletConfig) batchSetPreferencesServlet20);
        batchDeleteCandidatesServlet18.init((javax.servlet.ServletConfig) batchSetPreferencesServlet20);
        batchDeleteCandidatesServlet18.destroy();
        javax.servlet.ServletConfig servletConfig24 = batchDeleteCandidatesServlet18.getServletConfig();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet18);
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet26 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet27 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet28 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet27.init((javax.servlet.ServletConfig) batchSetPreferencesServlet28);
        javax.servlet.ServletConfig servletConfig30 = batchSetPreferencesServlet27.getServletConfig();
        addCandidateServlet26.init((javax.servlet.ServletConfig) batchSetPreferencesServlet27);
        batchSetPreferencesServlet27.destroy();
        java.lang.String str33 = batchSetPreferencesServlet27.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet34 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet34.init();
        setPreferenceServlet34.init();
        setPreferenceServlet34.destroy();
        javax.servlet.ServletConfig servletConfig38 = setPreferenceServlet34.getServletConfig();
        java.lang.String str39 = setPreferenceServlet34.getServletInfo();
        batchSetPreferencesServlet27.init((javax.servlet.ServletConfig) setPreferenceServlet34);
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet41 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet42 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet43 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet42.init((javax.servlet.ServletConfig) batchSetPreferencesServlet43);
        javax.servlet.ServletConfig servletConfig45 = batchSetPreferencesServlet42.getServletConfig();
        addCandidateServlet41.init((javax.servlet.ServletConfig) batchSetPreferencesServlet42);
        batchSetPreferencesServlet42.init();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet48 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        java.lang.String str49 = recommendServlet48.getServletInfo();
        javax.servlet.ServletConfig servletConfig50 = recommendServlet48.getServletConfig();
        java.lang.String str51 = recommendServlet48.getServletInfo();
        batchSetPreferencesServlet42.init((javax.servlet.ServletConfig) recommendServlet48);
        javax.servlet.ServletConfig servletConfig53 = null;
        recommendServlet48.init(servletConfig53);
        batchSetPreferencesServlet27.init((javax.servlet.ServletConfig) recommendServlet48);
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet27);
        batchSetPreferencesServlet1.destroy();
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(servletConfig14);
        org.junit.Assert.assertNotNull(servletConfig16);
        org.junit.Assert.assertNotNull(servletConfig24);
        org.junit.Assert.assertNotNull(servletConfig30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(servletConfig38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(servletConfig45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(servletConfig50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test39535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39535");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler2 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList5 = null; // flaky: configuration4.getItembasedRecommenders();
// flaky:         configuration4.setNumProcessorsForTraining((int) (short) 1);
        org.plista.kornakapi.core.config.Configuration configuration8 = new org.plista.kornakapi.core.config.Configuration();
        configuration8.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig11 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double12 = factorizationbasedRecommenderConfig11.getAlpha();
        double double13 = factorizationbasedRecommenderConfig11.getLambda();
        configuration8.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig11);
        java.lang.String str15 = configuration8.getModelDirectory();
        int int16 = configuration8.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList17 = configuration8.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration18 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str19 = storageConfiguration18.getJdbcDriverClass();
        storageConfiguration18.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str22 = storageConfiguration18.getJdbcUrl();
        java.lang.String str23 = storageConfiguration18.getJdbcUrl();
        storageConfiguration18.setJdbcUrl("label");
        configuration8.setStorageConfiguration(storageConfiguration18);
        java.lang.String str27 = storageConfiguration18.getPassword();
        storageConfiguration18.setJdbcDriverClass("org.plista.kornakapi.web.InvalidParameterException: ");
// flaky:         configuration4.setStorageConfiguration(storageConfiguration18);
        java.lang.String str31 = null; // flaky: configuration4.getModelDirectory();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig32 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double33 = factorizationbasedRecommenderConfig32.getAlpha();
        double double34 = factorizationbasedRecommenderConfig32.getLambda();
        int int35 = factorizationbasedRecommenderConfig32.getNumberOfFeatures();
        factorizationbasedRecommenderConfig32.setUsesImplicitFeedback(true);
        double double38 = factorizationbasedRecommenderConfig32.getAlpha();
        java.lang.String str39 = factorizationbasedRecommenderConfig32.getRetrainCronExpression();
        java.lang.String str40 = factorizationbasedRecommenderConfig32.getRetrainCronExpression();
        factorizationbasedRecommenderConfig32.setNumberOfIterations((int) (short) 1);
        java.lang.String str43 = factorizationbasedRecommenderConfig32.getRetrainCronExpression();
        factorizationbasedRecommenderConfig32.setUsesImplicitFeedback(false);
        int int46 = factorizationbasedRecommenderConfig32.getNumberOfFeatures();
// flaky:         configuration4.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig32);
        org.plista.kornakapi.web.Components components48 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage49 = null; // flaky: components48.storage();
        org.plista.kornakapi.core.config.Configuration configuration50 = null; // flaky: components48.getConfiguration();
// flaky:         configuration50.setModelDirectory("itemID");
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList53 = null; // flaky: configuration50.getFactorizationbasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList54 = null; // flaky: configuration50.getFactorizationbasedRecommenders();
        org.plista.kornakapi.web.Components components55 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration56 = null; // flaky: components55.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler57 = null; // flaky: components55.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler58 = null; // flaky: components55.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration59 = null; // flaky: components55.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration60 = null; // flaky: components55.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig61 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig61.setSimilarityClass("");
        java.lang.String str64 = itembasedRecommenderConfig61.getName();
        java.lang.String str65 = itembasedRecommenderConfig61.getSimilarityClass();
        itembasedRecommenderConfig61.setName("");
        java.lang.String str68 = itembasedRecommenderConfig61.getSimilarityClass();
// flaky:         configuration60.addItembasedRecommender(itembasedRecommenderConfig61);
        org.plista.kornakapi.web.Components components70 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration71 = null; // flaky: components70.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler72 = null; // flaky: components70.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler73 = null; // flaky: components70.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration74 = null; // flaky: components70.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration75 = null; // flaky: components70.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig76 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig76.setSimilarityClass("");
        java.lang.String str79 = itembasedRecommenderConfig76.getName();
        java.lang.String str80 = itembasedRecommenderConfig76.getSimilarityClass();
        itembasedRecommenderConfig76.setName("");
        java.lang.String str83 = itembasedRecommenderConfig76.getSimilarityClass();
// flaky:         configuration75.addItembasedRecommender(itembasedRecommenderConfig76);
        itembasedRecommenderConfig76.setSimilarItemsPerItem((int) (byte) 1);
// flaky:         configuration60.addItembasedRecommender(itembasedRecommenderConfig76);
        itembasedRecommenderConfig76.setSimilarItemsPerItem(1);
// flaky:         configuration50.addItembasedRecommender(itembasedRecommenderConfig76);
        itembasedRecommenderConfig76.setName("org.plista.kornakapi.web.InvalidParameterException: file");
        java.lang.String str93 = itembasedRecommenderConfig76.getSimilarityClass();
// flaky:         configuration4.addItembasedRecommender(itembasedRecommenderConfig76);
        itembasedRecommenderConfig76.setSimilarityClass("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=52, itemID=97, value=-1.0}");
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(trainingScheduler2);
        org.junit.Assert.assertNull(trainingScheduler3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str31, "org.plista.kornakapi.web.MissingParameterException: itemID");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
// flaky:         org.junit.Assert.assertNotNull(components48);
        org.junit.Assert.assertNull(storage49);
// flaky:         org.junit.Assert.assertNotNull(configuration50);
// flaky:         org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList53);
// flaky:         org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList54);
// flaky:         org.junit.Assert.assertNotNull(components55);
// flaky:         org.junit.Assert.assertNotNull(configuration56);
        org.junit.Assert.assertNull(trainingScheduler57);
        org.junit.Assert.assertNull(trainingScheduler58);
// flaky:         org.junit.Assert.assertNotNull(configuration59);
// flaky:         org.junit.Assert.assertNotNull(configuration60);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
// flaky:         org.junit.Assert.assertNotNull(components70);
// flaky:         org.junit.Assert.assertNotNull(configuration71);
        org.junit.Assert.assertNull(trainingScheduler72);
        org.junit.Assert.assertNull(trainingScheduler73);
// flaky:         org.junit.Assert.assertNotNull(configuration74);
// flaky:         org.junit.Assert.assertNotNull(configuration75);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test39536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39536");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        double double7 = fixedCandidatesIDRescorer1.rescore((long) (byte) 0, (double) (byte) 1);
        double double10 = fixedCandidatesIDRescorer1.rescore((long) (byte) 10, (double) 100);
        double double13 = fixedCandidatesIDRescorer1.rescore(97L, (double) 10.0f);
        double double16 = fixedCandidatesIDRescorer1.rescore((long) (short) -1, (double) 1.0f);
        double double19 = fixedCandidatesIDRescorer1.rescore((long) (short) 100, (double) 0.0f);
        double double22 = fixedCandidatesIDRescorer1.rescore((long) ' ', (double) ' ');
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer23 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = filteringLongPairRescorer23.isFiltered(longPair24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 32.0d + "'", double22 == 32.0d);
    }

    @Test
    public void test39537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39537");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage5 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration6 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage7 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler8 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration9 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration10 = null; // flaky: components0.getConfiguration();
        int int11 = 0; // flaky: configuration10.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig12 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double13 = factorizationbasedRecommenderConfig12.getAlpha();
        double double14 = factorizationbasedRecommenderConfig12.getLambda();
        int int15 = factorizationbasedRecommenderConfig12.getNumberOfFeatures();
        factorizationbasedRecommenderConfig12.setLambda((double) 1);
        double double18 = factorizationbasedRecommenderConfig12.getAlpha();
        double double19 = factorizationbasedRecommenderConfig12.getLambda();
        int int20 = factorizationbasedRecommenderConfig12.getNumberOfFeatures();
        factorizationbasedRecommenderConfig12.setRetrainAfterPreferenceChanges((int) (short) 100);
        factorizationbasedRecommenderConfig12.setLambda((double) 97L);
// flaky:         configuration10.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig12);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig26 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double27 = factorizationbasedRecommenderConfig26.getAlpha();
        double double28 = factorizationbasedRecommenderConfig26.getLambda();
        double double29 = factorizationbasedRecommenderConfig26.getAlpha();
// flaky:         configuration10.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig26);
        int int31 = 0; // flaky: configuration10.getNumProcessorsForTraining();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNull(trainingScheduler4);
        org.junit.Assert.assertNull(storage5);
// flaky:         org.junit.Assert.assertNotNull(configuration6);
        org.junit.Assert.assertNull(storage7);
        org.junit.Assert.assertNull(trainingScheduler8);
// flaky:         org.junit.Assert.assertNotNull(configuration9);
// flaky:         org.junit.Assert.assertNotNull(configuration10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test39538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39538");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray3 = missingParameterException2.getSuppressed();
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
        org.plista.kornakapi.web.MissingParameterException missingParameterException28 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException31 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException32 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException31);
        missingParameterException28.addSuppressed((java.lang.Throwable) invalidParameterException32);
        invalidParameterException19.addSuppressed((java.lang.Throwable) missingParameterException28);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException35 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) invalidParameterException19);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException36 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=0, itemID=10000, value=0.0}", (java.lang.Throwable) invalidParameterException19);
        missingParameterException2.addSuppressed((java.lang.Throwable) invalidParameterException36);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException38 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=52, itemID=97, value=1.0}", (java.lang.Throwable) invalidParameterException36);
        java.lang.Throwable[] throwableArray39 = invalidParameterException36.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test39539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39539");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        batchSetPreferencesServlet1.destroy();
        java.lang.String str7 = batchSetPreferencesServlet1.getServletInfo();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet8 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str9 = trainServlet8.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet10 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet10.destroy();
        javax.servlet.ServletConfig servletConfig12 = deleteCandidateServlet10.getServletConfig();
        deleteCandidateServlet10.destroy();
        trainServlet8.init((javax.servlet.ServletConfig) deleteCandidateServlet10);
        javax.servlet.ServletConfig servletConfig15 = deleteCandidateServlet10.getServletConfig();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) deleteCandidateServlet10);
        batchSetPreferencesServlet1.destroy();
        javax.servlet.ServletConfig servletConfig18 = batchSetPreferencesServlet1.getServletConfig();
        javax.servlet.ServletConfig servletConfig19 = batchSetPreferencesServlet1.getServletConfig();
        javax.servlet.ServletConfig servletConfig20 = batchSetPreferencesServlet1.getServletConfig();
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNotNull(servletConfig18);
        org.junit.Assert.assertNotNull(servletConfig19);
        org.junit.Assert.assertNotNull(servletConfig20);
    }

    @Test
    public void test39540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39540");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer6 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double9 = fixedCandidatesIDRescorer1.rescore(0L, (double) 100);
        double double12 = fixedCandidatesIDRescorer1.rescore(35L, (double) (byte) 1);
        double double15 = fixedCandidatesIDRescorer1.rescore((long) 0, (double) (byte) 0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer16 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double19 = fixedCandidatesIDRescorer1.rescore(10000L, (double) 10.0f);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer20 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer21 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer22 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test39541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39541");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        mutableCandidate0.set("itemIDs", (long) 0);
        mutableCandidate0.set("itemID", (long) 10000);
        java.lang.String str8 = mutableCandidate0.getLabel();
        mutableCandidate0.set("org.plista.kornakapi.web.MissingParameterException: itemID", (long) '#');
        long long12 = mutableCandidate0.getItemID();
        mutableCandidate0.set("batchSize", 1L);
        mutableCandidate0.set("userID", (long) (short) -1);
        mutableCandidate0.set("recommender", (-1L));
        java.lang.String str22 = mutableCandidate0.getLabel();
        long long23 = mutableCandidate0.getItemID();
        java.lang.String str24 = mutableCandidate0.getLabel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "itemID" + "'", str8, "itemID");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "recommender" + "'", str22, "recommender");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "recommender" + "'", str24, "recommender");
    }

    @Test
    public void test39542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39542");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage5 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration6 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler7 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration8 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler9 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler10 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage11 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.storage.Storage storage12 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener13 = null; // flaky: components0.preferenceChangeListener();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNull(trainingScheduler4);
        org.junit.Assert.assertNull(storage5);
// flaky:         org.junit.Assert.assertNotNull(configuration6);
        org.junit.Assert.assertNull(trainingScheduler7);
// flaky:         org.junit.Assert.assertNotNull(configuration8);
        org.junit.Assert.assertNull(trainingScheduler9);
        org.junit.Assert.assertNull(trainingScheduler10);
        org.junit.Assert.assertNull(storage11);
        org.junit.Assert.assertNull(storage12);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener13);
    }

    @Test
    public void test39543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39543");
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
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet14 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet15 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet16 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet15.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet16);
        setPreferenceServlet14.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet16);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet19 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet14.init((javax.servlet.ServletConfig) recommendServlet19);
        java.lang.String str21 = setPreferenceServlet14.getServletInfo();
        javax.servlet.ServletConfig servletConfig22 = setPreferenceServlet14.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet23 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet24 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet25 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet24.init((javax.servlet.ServletConfig) batchSetPreferencesServlet25);
        batchDeleteCandidatesServlet23.init((javax.servlet.ServletConfig) batchSetPreferencesServlet25);
        setPreferenceServlet14.init((javax.servlet.ServletConfig) batchSetPreferencesServlet25);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet25);
        batchDeleteCandidatesServlet0.init();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet31 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet31.init();
        setPreferenceServlet31.init();
        setPreferenceServlet31.destroy();
        javax.servlet.ServletConfig servletConfig35 = setPreferenceServlet31.getServletConfig();
        java.lang.String str36 = setPreferenceServlet31.getServletInfo();
        setPreferenceServlet31.init();
        javax.servlet.ServletConfig servletConfig38 = setPreferenceServlet31.getServletConfig();
        setPreferenceServlet31.init();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet31);
        setPreferenceServlet31.destroy();
        javax.servlet.ServletConfig servletConfig42 = setPreferenceServlet31.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = setPreferenceServlet31.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(servletConfig22);
        org.junit.Assert.assertNull(servletConfig35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(servletConfig38);
        org.junit.Assert.assertNull(servletConfig42);
    }

    @Test
    public void test39544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39544");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration0.getStorageConfiguration();
        int int4 = configuration0.getNumProcessorsForTraining();
        configuration0.setNumProcessorsForTraining((int) (short) 10);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration7 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str8 = storageConfiguration7.getJdbcDriverClass();
        storageConfiguration7.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str11 = storageConfiguration7.getJdbcUrl();
        java.lang.String str12 = storageConfiguration7.getJdbcDriverClass();
        java.lang.String str13 = storageConfiguration7.getJdbcDriverClass();
        java.lang.String str14 = storageConfiguration7.getPassword();
        java.lang.String str15 = storageConfiguration7.getJdbcDriverClass();
        java.lang.String str16 = storageConfiguration7.getPassword();
        configuration0.setStorageConfiguration(storageConfiguration7);
        java.lang.String str18 = configuration0.getModelDirectory();
        configuration0.setModelDirectory("userID");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig21 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig21.setSimilarityClass("");
        java.lang.String str24 = itembasedRecommenderConfig21.getName();
        java.lang.String str25 = itembasedRecommenderConfig21.getSimilarityClass();
        java.lang.String str26 = itembasedRecommenderConfig21.getSimilarityClass();
        int int27 = itembasedRecommenderConfig21.getSimilarItemsPerItem();
        itembasedRecommenderConfig21.setSimilarItemsPerItem((int) (byte) 10);
        configuration0.addItembasedRecommender(itembasedRecommenderConfig21);
        int int31 = configuration0.getNumProcessorsForTraining();
        org.plista.kornakapi.web.Components components32 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration33 = null; // flaky: components32.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration34 = null; // flaky: components32.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage35 = null; // flaky: components32.storage();
        org.plista.kornakapi.core.config.Configuration configuration36 = null; // flaky: components32.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration37 = null; // flaky: configuration36.getStorageConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration38 = null; // flaky: configuration36.getStorageConfiguration();
// flaky:         storageConfiguration38.setPassword("");
// flaky:         storageConfiguration38.setPassword("howMany");
        java.lang.String str43 = null; // flaky: storageConfiguration38.getPassword();
        configuration0.setStorageConfiguration(storageConfiguration38);
// flaky:         storageConfiguration38.setUsername("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: ");
        java.lang.String str47 = null; // flaky: storageConfiguration38.getJdbcDriverClass();
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(storageConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
// flaky:         org.junit.Assert.assertNotNull(components32);
// flaky:         org.junit.Assert.assertNotNull(configuration33);
// flaky:         org.junit.Assert.assertNotNull(configuration34);
        org.junit.Assert.assertNull(storage35);
// flaky:         org.junit.Assert.assertNotNull(configuration36);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration37);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration38);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "howMany" + "'", str43, "howMany");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: " + "'", str47, "org.plista.kornakapi.web.InvalidParameterException: ");
    }

    @Test
    public void test39545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39545");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str3 = configuration0.getModelDirectory();
        configuration0.setNumProcessorsForTraining((int) (byte) 100);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration6 = configuration0.getStorageConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig7 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double8 = factorizationbasedRecommenderConfig7.getAlpha();
        int int9 = factorizationbasedRecommenderConfig7.getNumberOfFeatures();
        factorizationbasedRecommenderConfig7.setUsesImplicitFeedback(true);
        double double12 = factorizationbasedRecommenderConfig7.getLambda();
        factorizationbasedRecommenderConfig7.setNumberOfIterations((int) (byte) 100);
        double double15 = factorizationbasedRecommenderConfig7.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig7);
        factorizationbasedRecommenderConfig7.setNumberOfIterations((int) ' ');
        int int19 = factorizationbasedRecommenderConfig7.getNumberOfFeatures();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer20 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig7);
        java.io.File file21 = null;
        org.plista.kornakapi.core.storage.Storage storage22 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender23 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer20.train(file21, storage22, recommender23, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(storageConfiguration6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test39546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39546");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        int int1 = configuration0.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig3 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig3.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig3);
        itembasedRecommenderConfig3.setRetrainCronExpression("");
        itembasedRecommenderConfig3.setSimilarItemsPerItem(10);
        java.lang.String str11 = itembasedRecommenderConfig3.getName();
        java.lang.String str12 = itembasedRecommenderConfig3.getName();
        int int13 = itembasedRecommenderConfig3.getSimilarItemsPerItem();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig3);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList15 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig16 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig16.setSimilarityClass("");
        java.lang.String str19 = itembasedRecommenderConfig16.getSimilarityClass();
        itembasedRecommenderConfig16.setRetrainCronExpression("userID");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer22 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig16);
        itembasedRecommenderConfig16.setSimilarItemsPerItem((int) (short) 0);
        configuration0.addItembasedRecommender(itembasedRecommenderConfig16);
        itembasedRecommenderConfig16.setSimilarityClass("MutablePreference{userID=0, itemID=0, value=52.0}");
        java.lang.String str28 = itembasedRecommenderConfig16.getRetrainCronExpression();
        itembasedRecommenderConfig16.setSimilarityClass("org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=10, itemID=10000, value=100.0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "userID" + "'", str28, "userID");
    }

    @Test
    public void test39547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39547");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        boolean boolean6 = factorizationbasedRecommenderConfig3.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer7 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig3);
        double double8 = factorizationbasedRecommenderConfig3.getAlpha();
// flaky:         configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig10 = null;
// flaky:         configuration2.addItembasedRecommender(itembasedRecommenderConfig10);
        org.plista.kornakapi.web.Components components12 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration13 = null; // flaky: components12.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler14 = null; // flaky: components12.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler15 = null; // flaky: components12.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration16 = null; // flaky: components12.getConfiguration();
// flaky:         configuration16.setModelDirectory("userID");
// flaky:         configuration16.setModelDirectory("itemID");
        int int21 = 0; // flaky: configuration16.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration22 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str23 = storageConfiguration22.getJdbcDriverClass();
        storageConfiguration22.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str26 = storageConfiguration22.getJdbcUrl();
        java.lang.String str27 = storageConfiguration22.getJdbcDriverClass();
        storageConfiguration22.setUsername("recommender");
        storageConfiguration22.setPassword("MutablePreference{userID=-1, itemID=10, value=10.0}");
        java.lang.String str32 = storageConfiguration22.getPassword();
        storageConfiguration22.setJdbcUrl("org.plista.kornakapi.web.InvalidParameterException: howMany");
// flaky:         configuration16.setStorageConfiguration(storageConfiguration22);
        java.lang.String str36 = storageConfiguration22.getJdbcDriverClass();
// flaky:         configuration2.setStorageConfiguration(storageConfiguration22);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration38 = null; // flaky: configuration2.getStorageConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration39 = new org.plista.kornakapi.core.config.Configuration();
        int int40 = configuration39.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration41 = configuration39.getStorageConfiguration();
        configuration39.setNumProcessorsForTraining(0);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList44 = configuration39.getFactorizationbasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration45 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str46 = storageConfiguration45.getJdbcDriverClass();
        storageConfiguration45.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str49 = storageConfiguration45.getPassword();
        java.lang.String str50 = storageConfiguration45.getJdbcDriverClass();
        storageConfiguration45.setUsername("hi!");
        storageConfiguration45.setJdbcDriverClass("file");
        configuration39.setStorageConfiguration(storageConfiguration45);
        java.lang.String str56 = storageConfiguration45.getJdbcUrl();
        storageConfiguration45.setJdbcDriverClass("MutablePreference{userID=100, itemID=0, value=1.0}");
// flaky:         configuration2.setStorageConfiguration(storageConfiguration45);
        java.lang.String str60 = storageConfiguration45.getJdbcDriverClass();
        java.lang.String str61 = storageConfiguration45.getJdbcUrl();
        java.lang.String str62 = storageConfiguration45.getPassword();
        java.lang.String str63 = storageConfiguration45.getJdbcUrl();
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(components12);
// flaky:         org.junit.Assert.assertNotNull(configuration13);
        org.junit.Assert.assertNull(trainingScheduler14);
        org.junit.Assert.assertNull(trainingScheduler15);
// flaky:         org.junit.Assert.assertNotNull(configuration16);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=10.0}" + "'", str32, "MutablePreference{userID=-1, itemID=10, value=10.0}");
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(storageConfiguration41);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "MutablePreference{userID=100, itemID=0, value=1.0}" + "'", str60, "MutablePreference{userID=100, itemID=0, value=1.0}");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test39548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39548");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler5 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler6 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage7 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler8 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener9 = null; // flaky: components0.preferenceChangeListener();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertNull(trainingScheduler5);
        org.junit.Assert.assertNull(trainingScheduler6);
        org.junit.Assert.assertNull(storage7);
        org.junit.Assert.assertNull(trainingScheduler8);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener9);
    }

    @Test
    public void test39549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39549");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        mutablePreference0.setValue((float) 1L);
        mutablePreference0.setValue((float) '4');
        java.lang.String str5 = mutablePreference0.toString();
        long long6 = mutablePreference0.getItemID();
        mutablePreference0.set((long) 'a', (long) 'a', (float) 52);
        java.lang.String str11 = mutablePreference0.toString();
        long long12 = mutablePreference0.getUserID();
        mutablePreference0.set(100L, 52L, 1.0f);
        mutablePreference0.setValue(97.0f);
        java.lang.String str19 = mutablePreference0.toString();
        long long20 = mutablePreference0.getItemID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MutablePreference{userID=0, itemID=0, value=52.0}" + "'", str5, "MutablePreference{userID=0, itemID=0, value=52.0}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MutablePreference{userID=97, itemID=97, value=52.0}" + "'", str11, "MutablePreference{userID=97, itemID=97, value=52.0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MutablePreference{userID=100, itemID=52, value=97.0}" + "'", str19, "MutablePreference{userID=100, itemID=52, value=97.0}");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
    }

    @Test
    public void test39550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39550");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
// flaky:         configuration2.setModelDirectory("itemID");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig5 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
// flaky:         configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig5);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig7 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double8 = factorizationbasedRecommenderConfig7.getAlpha();
        double double9 = factorizationbasedRecommenderConfig7.getLambda();
        int int10 = factorizationbasedRecommenderConfig7.getNumberOfFeatures();
        factorizationbasedRecommenderConfig7.setUsesImplicitFeedback(true);
        double double13 = factorizationbasedRecommenderConfig7.getAlpha();
        java.lang.String str14 = factorizationbasedRecommenderConfig7.getRetrainCronExpression();
        int int15 = factorizationbasedRecommenderConfig7.getRetrainAfterPreferenceChanges();
        int int16 = factorizationbasedRecommenderConfig7.getNumberOfIterations();
        factorizationbasedRecommenderConfig7.setNumberOfFeatures((int) '#');
        double double19 = factorizationbasedRecommenderConfig7.getLambda();
        boolean boolean20 = factorizationbasedRecommenderConfig7.isUsesImplicitFeedback();
        boolean boolean21 = factorizationbasedRecommenderConfig7.isUsesImplicitFeedback();
        int int22 = factorizationbasedRecommenderConfig7.getNumberOfIterations();
        java.lang.String str23 = factorizationbasedRecommenderConfig7.getName();
        int int24 = factorizationbasedRecommenderConfig7.getRetrainAfterPreferenceChanges();
// flaky:         configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig7);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer26 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig7);
        factorizationbasedRecommenderConfig7.setRetrainAfterPreferenceChanges(32);
        factorizationbasedRecommenderConfig7.setRetrainAfterPreferenceChanges(97);
        factorizationbasedRecommenderConfig7.setNumberOfFeatures(32);
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test39551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39551");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        mutablePreference0.setValue((float) 1L);
        java.lang.String str3 = mutablePreference0.toString();
        java.lang.String str4 = mutablePreference0.toString();
        long long5 = mutablePreference0.getUserID();
        long long6 = mutablePreference0.getItemID();
        long long7 = mutablePreference0.getItemID();
        long long8 = mutablePreference0.getItemID();
        long long9 = mutablePreference0.getUserID();
        java.lang.String str10 = mutablePreference0.toString();
        java.lang.String str11 = mutablePreference0.toString();
        mutablePreference0.set(52L, (long) (byte) -1, (float) (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str4, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str10, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str11, "MutablePreference{userID=0, itemID=0, value=1.0}");
    }

    @Test
    public void test39552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39552");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str4 = storageConfiguration0.getJdbcUrl();
        java.lang.String str5 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setJdbcDriverClass("batchSize");
        storageConfiguration0.setPassword("howMany");
        storageConfiguration0.setJdbcDriverClass("userID");
        java.lang.String str12 = storageConfiguration0.getPassword();
        java.lang.String str13 = storageConfiguration0.getUsername();
        storageConfiguration0.setPassword("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=0, itemID=0, value=32.0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "howMany" + "'", str12, "howMany");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str13, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
    }

    @Test
    public void test39553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39553");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener1 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.storage.Storage storage2 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage4 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
// flaky:         configuration5.setNumProcessorsForTraining((-1));
        java.lang.String str8 = null; // flaky: configuration5.getModelDirectory();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener1);
        org.junit.Assert.assertNull(storage2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNull(storage4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "itemID" + "'", str8, "itemID");
    }

    @Test
    public void test39554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39554");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        factorizationbasedRecommenderConfig0.setAlpha((double) (-1));
        factorizationbasedRecommenderConfig0.setAlpha((double) 10);
        int int11 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        double double12 = factorizationbasedRecommenderConfig0.getLambda();
        java.lang.String str13 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test39555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39555");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        java.lang.String str2 = storageConfiguration0.getUsername();
        storageConfiguration0.setPassword("label");
        java.lang.String str5 = storageConfiguration0.getUsername();
        java.lang.String str6 = storageConfiguration0.getUsername();
        java.lang.String str7 = storageConfiguration0.getJdbcUrl();
        storageConfiguration0.setJdbcDriverClass("MutablePreference{userID=1, itemID=-1, value=0.0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test39556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39556");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) (byte) 1);
        boolean boolean8 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setAlpha((double) (short) 10);
        double double11 = factorizationbasedRecommenderConfig0.getAlpha();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures(1);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures(35);
        int int16 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test39557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39557");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer6 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair7 = null;
        double double9 = filteringLongPairRescorer6.rescore(longPair7, (double) '4');
        org.apache.mahout.common.LongPair longPair10 = null;
        double double12 = filteringLongPairRescorer6.rescore(longPair10, (double) (-1L));
        org.apache.mahout.common.LongPair longPair13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringLongPairRescorer6.isFiltered(longPair13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test39558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39558");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener4 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler5 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration6 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration7 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage8 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration9 = null; // flaky: components0.getConfiguration();
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener4);
        org.junit.Assert.assertNull(trainingScheduler5);
// flaky:         org.junit.Assert.assertNotNull(configuration6);
// flaky:         org.junit.Assert.assertNotNull(configuration7);
        org.junit.Assert.assertNull(storage8);
// flaky:         org.junit.Assert.assertNotNull(configuration9);
    }

    @Test
    public void test39559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39559");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = null; // flaky: configuration1.getItembasedRecommenders();
        java.lang.String str3 = null; // flaky: configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig4 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double5 = factorizationbasedRecommenderConfig4.getAlpha();
        double double6 = factorizationbasedRecommenderConfig4.getLambda();
        int int7 = factorizationbasedRecommenderConfig4.getNumberOfFeatures();
        factorizationbasedRecommenderConfig4.setNumberOfIterations(0);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig4);
// flaky:         configuration1.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig4);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList12 = null; // flaky: configuration1.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration13 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str14 = storageConfiguration13.getJdbcDriverClass();
        storageConfiguration13.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str17 = storageConfiguration13.getJdbcUrl();
        java.lang.String str18 = storageConfiguration13.getJdbcDriverClass();
        java.lang.String str19 = storageConfiguration13.getJdbcDriverClass();
        java.lang.String str20 = storageConfiguration13.getPassword();
        java.lang.String str21 = storageConfiguration13.getJdbcDriverClass();
// flaky:         configuration1.setStorageConfiguration(storageConfiguration13);
// flaky:         configuration1.setModelDirectory("value");
        org.plista.kornakapi.web.Components components25 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration26 = null; // flaky: components25.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration27 = null; // flaky: components25.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage28 = null; // flaky: components25.storage();
        org.plista.kornakapi.core.storage.Storage storage29 = null; // flaky: components25.storage();
        org.plista.kornakapi.core.config.Configuration configuration30 = null; // flaky: components25.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig31 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double32 = factorizationbasedRecommenderConfig31.getAlpha();
        double double33 = factorizationbasedRecommenderConfig31.getLambda();
        int int34 = factorizationbasedRecommenderConfig31.getNumberOfFeatures();
        factorizationbasedRecommenderConfig31.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig31.setNumberOfFeatures((int) (short) 100);
        boolean boolean39 = factorizationbasedRecommenderConfig31.isUsesImplicitFeedback();
// flaky:         configuration30.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig31);
        org.plista.kornakapi.web.Components components41 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration42 = null; // flaky: components41.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler43 = null; // flaky: components41.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler44 = null; // flaky: components41.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration45 = null; // flaky: components41.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration46 = null; // flaky: components41.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig47 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig47.setSimilarityClass("");
        java.lang.String str50 = itembasedRecommenderConfig47.getName();
        java.lang.String str51 = itembasedRecommenderConfig47.getSimilarityClass();
        itembasedRecommenderConfig47.setName("");
        java.lang.String str54 = itembasedRecommenderConfig47.getSimilarityClass();
// flaky:         configuration46.addItembasedRecommender(itembasedRecommenderConfig47);
        itembasedRecommenderConfig47.setSimilarItemsPerItem((int) (byte) 1);
// flaky:         configuration30.addItembasedRecommender(itembasedRecommenderConfig47);
        java.lang.String str59 = null; // flaky: configuration30.getModelDirectory();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig60 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str61 = itembasedRecommenderConfig60.getRetrainCronExpression();
        int int62 = itembasedRecommenderConfig60.getRetrainAfterPreferenceChanges();
        java.lang.String str63 = itembasedRecommenderConfig60.getSimilarityClass();
        itembasedRecommenderConfig60.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig60.setSimilarityClass("");
        int int68 = itembasedRecommenderConfig60.getSimilarItemsPerItem();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer69 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig60);
// flaky:         configuration30.addItembasedRecommender(itembasedRecommenderConfig60);
// flaky:         configuration1.addItembasedRecommender(itembasedRecommenderConfig60);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList72 = null; // flaky: configuration1.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList73 = null; // flaky: configuration1.getFactorizationbasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration74 = null; // flaky: configuration1.getStorageConfiguration();
        java.lang.String str75 = null; // flaky: storageConfiguration74.getJdbcDriverClass();
// flaky:         storageConfiguration74.setUsername("MutablePreference{userID=10000, itemID=35, value=0.0}");
        java.lang.String str78 = null; // flaky: storageConfiguration74.getUsername();
        java.lang.String str79 = null; // flaky: storageConfiguration74.getUsername();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "itemID" + "'", str3, "itemID");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertNotNull(components25);
// flaky:         org.junit.Assert.assertNotNull(configuration26);
// flaky:         org.junit.Assert.assertNotNull(configuration27);
        org.junit.Assert.assertNull(storage28);
        org.junit.Assert.assertNull(storage29);
// flaky:         org.junit.Assert.assertNotNull(configuration30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertNotNull(components41);
// flaky:         org.junit.Assert.assertNotNull(configuration42);
        org.junit.Assert.assertNull(trainingScheduler43);
        org.junit.Assert.assertNull(trainingScheduler44);
// flaky:         org.junit.Assert.assertNotNull(configuration45);
// flaky:         org.junit.Assert.assertNotNull(configuration46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "value" + "'", str59, "value");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList72);
// flaky:         org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList73);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration74);
        org.junit.Assert.assertNull(str75);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "MutablePreference{userID=10000, itemID=35, value=0.0}" + "'", str78, "MutablePreference{userID=10000, itemID=35, value=0.0}");
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "MutablePreference{userID=10000, itemID=35, value=0.0}" + "'", str79, "MutablePreference{userID=10000, itemID=35, value=0.0}");
    }

    @Test
    public void test39560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39560");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        int int2 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        java.lang.String str3 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig0.setSimilarItemsPerItem((int) '#');
        int int8 = itembasedRecommenderConfig0.getSimilarItemsPerItem();
        int int9 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        itembasedRecommenderConfig0.setRetrainAfterPreferenceChanges(0);
        java.lang.Class<?> wildcardClass12 = itembasedRecommenderConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test39561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39561");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(1);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) '#');
        factorizationbasedRecommenderConfig0.setAlpha((double) ' ');
        double double14 = factorizationbasedRecommenderConfig0.getAlpha();
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        double double17 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setLambda(0.0d);
        int int20 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer21 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test39562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39562");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        java.lang.String str3 = mutablePreference0.toString();
        mutablePreference0.set((long) (byte) 100, (long) (byte) 0, (float) (short) 0);
        java.lang.String str8 = mutablePreference0.toString();
        float float9 = mutablePreference0.getValue();
        long long10 = mutablePreference0.getUserID();
        mutablePreference0.set(0L, 35L, (float) 52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MutablePreference{userID=100, itemID=0, value=0.0}" + "'", str8, "MutablePreference{userID=100, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test39563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39563");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler2 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage5 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.storage.Storage storage6 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler7 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration8 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener9 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration10 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration11 = null; // flaky: components0.getConfiguration();
        int int12 = 0; // flaky: configuration11.getNumProcessorsForTraining();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(trainingScheduler2);
        org.junit.Assert.assertNull(trainingScheduler3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertNull(storage5);
        org.junit.Assert.assertNull(storage6);
        org.junit.Assert.assertNull(trainingScheduler7);
// flaky:         org.junit.Assert.assertNotNull(configuration8);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener9);
// flaky:         org.junit.Assert.assertNotNull(configuration10);
// flaky:         org.junit.Assert.assertNotNull(configuration11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test39564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39564");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        mutablePreference0.setValue((float) 1L);
        java.lang.String str3 = mutablePreference0.toString();
        java.lang.String str4 = mutablePreference0.toString();
        java.lang.String str5 = mutablePreference0.toString();
        long long6 = mutablePreference0.getUserID();
        java.lang.String str7 = mutablePreference0.toString();
        mutablePreference0.set(0L, (long) (byte) 0, 100.0f);
        long long12 = mutablePreference0.getUserID();
        mutablePreference0.setValue((float) (-1L));
        long long15 = mutablePreference0.getUserID();
        long long16 = mutablePreference0.getItemID();
        long long17 = mutablePreference0.getUserID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str4, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str5, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str7, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test39565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39565");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
// flaky:         configuration2.setModelDirectory("itemID");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig5 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
// flaky:         configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig5);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration7 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str8 = storageConfiguration7.getUsername();
// flaky:         configuration2.setStorageConfiguration(storageConfiguration7);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList10 = null; // flaky: configuration2.getItembasedRecommenders();
        int int11 = 0; // flaky: configuration2.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig12 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig12.setSimilarityClass("");
        java.lang.String str15 = itembasedRecommenderConfig12.getSimilarityClass();
        itembasedRecommenderConfig12.setName("");
        java.lang.String str18 = itembasedRecommenderConfig12.getName();
        int int19 = itembasedRecommenderConfig12.getSimilarItemsPerItem();
        itembasedRecommenderConfig12.setRetrainCronExpression("howMany");
        int int22 = itembasedRecommenderConfig12.getSimilarItemsPerItem();
        int int23 = itembasedRecommenderConfig12.getSimilarItemsPerItem();
        int int24 = itembasedRecommenderConfig12.getSimilarItemsPerItem();
// flaky:         configuration2.addItembasedRecommender(itembasedRecommenderConfig12);
        java.lang.String str26 = null; // flaky: configuration2.getModelDirectory();
        int int27 = 0; // flaky: configuration2.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList28 = null; // flaky: configuration2.getFactorizationbasedRecommenders();
        org.plista.kornakapi.web.Components components29 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration30 = null; // flaky: components29.getConfiguration();
// flaky:         configuration30.setNumProcessorsForTraining(52);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList33 = null; // flaky: configuration30.getItembasedRecommenders();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig34 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double35 = factorizationbasedRecommenderConfig34.getAlpha();
        double double36 = factorizationbasedRecommenderConfig34.getLambda();
        int int37 = factorizationbasedRecommenderConfig34.getNumberOfFeatures();
        factorizationbasedRecommenderConfig34.setUsesImplicitFeedback(false);
        double double40 = factorizationbasedRecommenderConfig34.getAlpha();
        factorizationbasedRecommenderConfig34.setRetrainAfterPreferenceChanges(100);
        int int43 = factorizationbasedRecommenderConfig34.getRetrainAfterPreferenceChanges();
// flaky:         configuration30.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig34);
// flaky:         configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig34);
        double double46 = factorizationbasedRecommenderConfig34.getLambda();
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "itemID" + "'", str26, "itemID");
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
// flaky:         org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList28);
// flaky:         org.junit.Assert.assertNotNull(components29);
// flaky:         org.junit.Assert.assertNotNull(configuration30);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test39566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39566");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        java.lang.String str2 = storageConfiguration0.getPassword();
        storageConfiguration0.setJdbcDriverClass("org.plista.kornakapi.web.InvalidParameterException: batchSize");
        storageConfiguration0.setJdbcDriverClass("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39567");
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
        javax.servlet.ServletConfig servletConfig14 = batchDeleteCandidatesServlet0.getServletConfig();
        batchDeleteCandidatesServlet0.destroy();
        batchDeleteCandidatesServlet0.destroy();
        java.lang.String str17 = batchDeleteCandidatesServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet18 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet18.destroy();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet20 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet21 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet22 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet21.init((javax.servlet.ServletConfig) batchSetPreferencesServlet22);
        batchDeleteCandidatesServlet20.init((javax.servlet.ServletConfig) batchSetPreferencesServlet22);
        javax.servlet.ServletConfig servletConfig25 = batchSetPreferencesServlet22.getServletConfig();
        addCandidateServlet18.init(servletConfig25);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet27 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet28 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str29 = batchDeleteCandidatesServlet28.getServletInfo();
        java.lang.String str30 = batchDeleteCandidatesServlet28.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet31 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet32 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet33 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet32.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet33);
        setPreferenceServlet31.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet33);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet36 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet31.init((javax.servlet.ServletConfig) recommendServlet36);
        batchDeleteCandidatesServlet28.init((javax.servlet.ServletConfig) setPreferenceServlet31);
        batchDeleteCandidatesServlet28.destroy();
        batchDeleteCandidatesServlet27.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet28);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet41 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet42 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet43 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet42.init((javax.servlet.ServletConfig) batchSetPreferencesServlet43);
        batchDeleteCandidatesServlet41.init((javax.servlet.ServletConfig) batchSetPreferencesServlet43);
        javax.servlet.ServletConfig servletConfig46 = batchSetPreferencesServlet43.getServletConfig();
        batchSetPreferencesServlet43.init();
        batchDeleteCandidatesServlet28.init((javax.servlet.ServletConfig) batchSetPreferencesServlet43);
        addCandidateServlet18.init((javax.servlet.ServletConfig) batchSetPreferencesServlet43);
        addCandidateServlet18.destroy();
        addCandidateServlet18.destroy();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) addCandidateServlet18);
        javax.servlet.ServletConfig servletConfig53 = batchDeleteCandidatesServlet0.getServletConfig();
        org.plista.kornakapi.web.MissingParameterException missingParameterException60 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException61 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException60);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException62 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException60);
        org.plista.kornakapi.web.MissingParameterException missingParameterException67 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException68 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException67);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException69 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException67);
        java.lang.Throwable[] throwableArray70 = missingParameterException67.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException71 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException67);
        invalidParameterException62.addSuppressed((java.lang.Throwable) invalidParameterException71);
        org.plista.kornakapi.web.MissingParameterException missingParameterException76 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException77 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException76);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException78 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException76);
        java.lang.Throwable[] throwableArray79 = invalidParameterException78.getSuppressed();
        invalidParameterException71.addSuppressed((java.lang.Throwable) invalidParameterException78);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException81 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException78);
        org.plista.kornakapi.web.MissingParameterException missingParameterException85 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray86 = missingParameterException85.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException87 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException85);
        java.lang.Throwable[] throwableArray88 = invalidParameterException87.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException89 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: file", (java.lang.Throwable) invalidParameterException87);
        invalidParameterException78.addSuppressed((java.lang.Throwable) invalidParameterException87);
        java.lang.Throwable[] throwableArray91 = invalidParameterException87.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException92 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: recommender", (java.lang.Throwable) invalidParameterException87);
        org.plista.kornakapi.web.MissingParameterException missingParameterException94 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=100, itemID=-1, value=1.0}");
        invalidParameterException92.addSuppressed((java.lang.Throwable) missingParameterException94);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet0.log("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=100, itemID=-1, value=100.0}", (java.lang.Throwable) invalidParameterException92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(servletConfig25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(servletConfig46);
        org.junit.Assert.assertNotNull(servletConfig53);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray91);
    }

    @Test
    public void test39568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39568");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.destroy();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet3 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet2.init((javax.servlet.ServletConfig) batchSetPreferencesServlet3);
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        java.lang.String str6 = batchSetPreferencesServlet2.getServletInfo();
        java.lang.String str7 = batchSetPreferencesServlet2.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet8 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str9 = batchDeleteCandidatesServlet8.getServletInfo();
        batchDeleteCandidatesServlet8.init();
        batchDeleteCandidatesServlet8.destroy();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet12 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet12.destroy();
        javax.servlet.ServletConfig servletConfig14 = deleteCandidateServlet12.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet15 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str16 = batchDeleteCandidatesServlet15.getServletInfo();
        java.lang.String str17 = batchDeleteCandidatesServlet15.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet18 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet19 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet20 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet19.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet20);
        setPreferenceServlet18.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet20);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet23 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet18.init((javax.servlet.ServletConfig) recommendServlet23);
        batchDeleteCandidatesServlet15.init((javax.servlet.ServletConfig) setPreferenceServlet18);
        setPreferenceServlet18.destroy();
        deleteCandidateServlet12.init((javax.servlet.ServletConfig) setPreferenceServlet18);
        batchDeleteCandidatesServlet8.init((javax.servlet.ServletConfig) setPreferenceServlet18);
        setPreferenceServlet18.destroy();
        batchSetPreferencesServlet2.init((javax.servlet.ServletConfig) setPreferenceServlet18);
        java.lang.String str31 = setPreferenceServlet18.getServletInfo();
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet32 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet32.destroy();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet34 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet35 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet36 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet35.init((javax.servlet.ServletConfig) batchSetPreferencesServlet36);
        batchDeleteCandidatesServlet34.init((javax.servlet.ServletConfig) batchSetPreferencesServlet36);
        javax.servlet.ServletConfig servletConfig39 = batchSetPreferencesServlet36.getServletConfig();
        addCandidateServlet32.init(servletConfig39);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet41 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet42 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str43 = batchDeleteCandidatesServlet42.getServletInfo();
        java.lang.String str44 = batchDeleteCandidatesServlet42.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet45 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet46 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet47 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet46.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet47);
        setPreferenceServlet45.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet47);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet50 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet45.init((javax.servlet.ServletConfig) recommendServlet50);
        batchDeleteCandidatesServlet42.init((javax.servlet.ServletConfig) setPreferenceServlet45);
        batchDeleteCandidatesServlet42.destroy();
        batchDeleteCandidatesServlet41.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet42);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet55 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet56 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet57 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet56.init((javax.servlet.ServletConfig) batchSetPreferencesServlet57);
        batchDeleteCandidatesServlet55.init((javax.servlet.ServletConfig) batchSetPreferencesServlet57);
        javax.servlet.ServletConfig servletConfig60 = batchSetPreferencesServlet57.getServletConfig();
        batchSetPreferencesServlet57.init();
        batchDeleteCandidatesServlet42.init((javax.servlet.ServletConfig) batchSetPreferencesServlet57);
        addCandidateServlet32.init((javax.servlet.ServletConfig) batchSetPreferencesServlet57);
        addCandidateServlet32.destroy();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet65 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str66 = trainServlet65.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet67 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet67.destroy();
        javax.servlet.ServletConfig servletConfig69 = deleteCandidateServlet67.getServletConfig();
        deleteCandidateServlet67.destroy();
        trainServlet65.init((javax.servlet.ServletConfig) deleteCandidateServlet67);
        javax.servlet.ServletConfig servletConfig72 = deleteCandidateServlet67.getServletConfig();
        javax.servlet.ServletConfig servletConfig73 = deleteCandidateServlet67.getServletConfig();
        deleteCandidateServlet67.init();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet75 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet75.destroy();
        javax.servlet.ServletConfig servletConfig77 = deleteCandidateServlet75.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet78 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str79 = batchDeleteCandidatesServlet78.getServletInfo();
        java.lang.String str80 = batchDeleteCandidatesServlet78.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet81 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet82 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet83 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet82.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet83);
        setPreferenceServlet81.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet83);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet86 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet81.init((javax.servlet.ServletConfig) recommendServlet86);
        batchDeleteCandidatesServlet78.init((javax.servlet.ServletConfig) setPreferenceServlet81);
        setPreferenceServlet81.destroy();
        deleteCandidateServlet75.init((javax.servlet.ServletConfig) setPreferenceServlet81);
        deleteCandidateServlet67.init((javax.servlet.ServletConfig) deleteCandidateServlet75);
        addCandidateServlet32.init((javax.servlet.ServletConfig) deleteCandidateServlet75);
        setPreferenceServlet18.init((javax.servlet.ServletConfig) deleteCandidateServlet75);
        setPreferenceServlet18.init();
        javax.servlet.ServletConfig servletConfig95 = setPreferenceServlet18.getServletConfig();
        java.lang.String str96 = setPreferenceServlet18.getServletInfo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(servletConfig39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(servletConfig60);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNull(servletConfig69);
        org.junit.Assert.assertNull(servletConfig72);
        org.junit.Assert.assertNull(servletConfig73);
        org.junit.Assert.assertNull(servletConfig77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(servletConfig95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test39569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39569");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        java.lang.String str3 = mutablePreference0.toString();
        mutablePreference0.setValue(0.0f);
        java.lang.String str6 = mutablePreference0.toString();
        mutablePreference0.set((long) '4', 0L, (-1.0f));
        mutablePreference0.set((long) (byte) 10, 35L, (float) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str6, "MutablePreference{userID=0, itemID=0, value=0.0}");
    }

    @Test
    public void test39570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39570");
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
        int int13 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str14 = factorizationbasedRecommenderConfig0.getName();
        int int15 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        java.lang.String str16 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        factorizationbasedRecommenderConfig0.setName("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: recommender");
        factorizationbasedRecommenderConfig0.setLambda((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test39571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39571");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException4 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException2.addSuppressed((java.lang.Throwable) missingParameterException4);
        java.lang.Throwable[] throwableArray6 = missingParameterException2.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=-1, itemID=10, value=10.0}", (java.lang.Throwable) missingParameterException2);
        java.lang.String str8 = invalidParameterException7.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=-1, itemID=10, value=10.0}" + "'", str8, "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=-1, itemID=10, value=10.0}");
    }

    @Test
    public void test39572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39572");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        mutableCandidate0.set("itemIDs", (long) 0);
        java.lang.String str5 = mutableCandidate0.getLabel();
        long long6 = mutableCandidate0.getItemID();
        java.lang.String str7 = mutableCandidate0.getLabel();
        long long8 = mutableCandidate0.getItemID();
        java.lang.String str9 = mutableCandidate0.getLabel();
        long long10 = mutableCandidate0.getItemID();
        long long11 = mutableCandidate0.getItemID();
        long long12 = mutableCandidate0.getItemID();
        java.lang.String str13 = mutableCandidate0.getLabel();
        java.lang.String str14 = mutableCandidate0.getLabel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "itemIDs" + "'", str5, "itemIDs");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "itemIDs" + "'", str7, "itemIDs");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "itemIDs" + "'", str9, "itemIDs");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "itemIDs" + "'", str13, "itemIDs");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "itemIDs" + "'", str14, "itemIDs");
    }

    @Test
    public void test39573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39573");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet6 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet6.init();
        java.lang.String str8 = batchAddCandidatesServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = batchAddCandidatesServlet6.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet10 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet11 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str12 = batchDeleteCandidatesServlet11.getServletInfo();
        java.lang.String str13 = batchDeleteCandidatesServlet11.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet14 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet15 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet16 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet15.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet16);
        setPreferenceServlet14.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet16);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet19 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet14.init((javax.servlet.ServletConfig) recommendServlet19);
        batchDeleteCandidatesServlet11.init((javax.servlet.ServletConfig) setPreferenceServlet14);
        batchDeleteCandidatesServlet11.destroy();
        batchDeleteCandidatesServlet10.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet11);
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet24 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet25 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet26 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet25.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet26);
        setPreferenceServlet24.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet26);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet29 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet24.init((javax.servlet.ServletConfig) recommendServlet29);
        java.lang.String str31 = setPreferenceServlet24.getServletInfo();
        javax.servlet.ServletConfig servletConfig32 = setPreferenceServlet24.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet33 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet34 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet35 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet34.init((javax.servlet.ServletConfig) batchSetPreferencesServlet35);
        batchDeleteCandidatesServlet33.init((javax.servlet.ServletConfig) batchSetPreferencesServlet35);
        setPreferenceServlet24.init((javax.servlet.ServletConfig) batchSetPreferencesServlet35);
        batchDeleteCandidatesServlet10.init((javax.servlet.ServletConfig) batchSetPreferencesServlet35);
        batchAddCandidatesServlet6.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet10);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchAddCandidatesServlet6);
        java.lang.String str42 = setPreferenceServlet0.getServletInfo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(servletConfig32);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test39574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39574");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener1 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.storage.Storage storage2 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener4 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener5 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.storage.Storage storage6 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.storage.Storage storage7 = null; // flaky: components0.storage();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener1);
        org.junit.Assert.assertNull(storage2);
        org.junit.Assert.assertNull(trainingScheduler3);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener4);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener5);
        org.junit.Assert.assertNull(storage6);
        org.junit.Assert.assertNull(storage7);
    }

    @Test
    public void test39575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39575");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=-1, itemID=10, value=10.0}");
        java.lang.Throwable[] throwableArray2 = missingParameterException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test39576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39576");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener2 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener3 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
// flaky:         configuration5.setNumProcessorsForTraining(0);
// flaky:         configuration5.setModelDirectory("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=100.0}");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration10 = null; // flaky: configuration5.getStorageConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration11 = new org.plista.kornakapi.core.config.Configuration();
        configuration11.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str14 = configuration11.getModelDirectory();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration15 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str16 = storageConfiguration15.getJdbcDriverClass();
        storageConfiguration15.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str19 = storageConfiguration15.getJdbcUrl();
        java.lang.String str20 = storageConfiguration15.getJdbcDriverClass();
        java.lang.String str21 = storageConfiguration15.getJdbcDriverClass();
        java.lang.String str22 = storageConfiguration15.getPassword();
        java.lang.String str23 = storageConfiguration15.getJdbcDriverClass();
        java.lang.String str24 = storageConfiguration15.getPassword();
        storageConfiguration15.setUsername("MutablePreference{userID=100, itemID=0, value=0.0}");
        storageConfiguration15.setPassword("itemID");
        java.lang.String str29 = storageConfiguration15.getUsername();
        configuration11.setStorageConfiguration(storageConfiguration15);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration31 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str32 = storageConfiguration31.getJdbcDriverClass();
        storageConfiguration31.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str35 = storageConfiguration31.getJdbcUrl();
        java.lang.String str36 = storageConfiguration31.getJdbcDriverClass();
        java.lang.String str37 = storageConfiguration31.getJdbcDriverClass();
        storageConfiguration31.setPassword("org.plista.kornakapi.web.MissingParameterException: itemID");
        storageConfiguration31.setUsername("");
        configuration11.setStorageConfiguration(storageConfiguration31);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration43 = configuration11.getStorageConfiguration();
// flaky:         configuration5.setStorageConfiguration(storageConfiguration43);
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener2);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener3);
        org.junit.Assert.assertNull(trainingScheduler4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MutablePreference{userID=100, itemID=0, value=0.0}" + "'", str29, "MutablePreference{userID=100, itemID=0, value=0.0}");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(storageConfiguration43);
    }

    @Test
    public void test39577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39577");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str4 = storageConfiguration0.getJdbcUrl();
        java.lang.String str5 = storageConfiguration0.getJdbcDriverClass();
        java.lang.String str6 = storageConfiguration0.getJdbcDriverClass();
        java.lang.String str7 = storageConfiguration0.getPassword();
        java.lang.String str8 = storageConfiguration0.getUsername();
        java.lang.String str9 = storageConfiguration0.getJdbcDriverClass();
        java.lang.String str10 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setJdbcUrl("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: howMany");
        storageConfiguration0.setJdbcDriverClass("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=-1.0}");
        java.lang.String str15 = storageConfiguration0.getPassword();
        java.lang.String str16 = storageConfiguration0.getJdbcDriverClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str8, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=-1.0}" + "'", str16, "org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=-1.0}");
    }

    @Test
    public void test39578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39578");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage5 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration6 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage7 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration8 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration9 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList10 = null; // flaky: configuration9.getItembasedRecommenders();
// flaky:         configuration9.setNumProcessorsForTraining((int) ' ');
// flaky:         configuration9.setModelDirectory("label");
        int int15 = 0; // flaky: configuration9.getNumProcessorsForTraining();
// flaky:         configuration9.setNumProcessorsForTraining((int) (short) 1);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList18 = null; // flaky: configuration9.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration19 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str20 = storageConfiguration19.getJdbcDriverClass();
        storageConfiguration19.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str23 = storageConfiguration19.getJdbcUrl();
        java.lang.String str24 = storageConfiguration19.getJdbcDriverClass();
        java.lang.String str25 = storageConfiguration19.getJdbcDriverClass();
        java.lang.String str26 = storageConfiguration19.getPassword();
        java.lang.String str27 = storageConfiguration19.getJdbcDriverClass();
        java.lang.String str28 = storageConfiguration19.getPassword();
        storageConfiguration19.setUsername("MutablePreference{userID=100, itemID=0, value=0.0}");
        storageConfiguration19.setPassword("itemID");
        java.lang.String str33 = storageConfiguration19.getUsername();
        storageConfiguration19.setJdbcDriverClass("hi!");
        storageConfiguration19.setJdbcUrl("");
        java.lang.String str38 = storageConfiguration19.getJdbcUrl();
// flaky:         configuration9.setStorageConfiguration(storageConfiguration19);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig40 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double41 = factorizationbasedRecommenderConfig40.getAlpha();
        double double42 = factorizationbasedRecommenderConfig40.getLambda();
        int int43 = factorizationbasedRecommenderConfig40.getNumberOfFeatures();
        factorizationbasedRecommenderConfig40.setUsesImplicitFeedback(true);
        double double46 = factorizationbasedRecommenderConfig40.getAlpha();
        java.lang.String str47 = factorizationbasedRecommenderConfig40.getRetrainCronExpression();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer48 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig40);
        double double49 = factorizationbasedRecommenderConfig40.getLambda();
        factorizationbasedRecommenderConfig40.setNumberOfFeatures((int) 'a');
        factorizationbasedRecommenderConfig40.setLambda((double) 97);
        factorizationbasedRecommenderConfig40.setRetrainAfterPreferenceChanges(97);
        double double56 = factorizationbasedRecommenderConfig40.getLambda();
        boolean boolean57 = factorizationbasedRecommenderConfig40.isUsesImplicitFeedback();
// flaky:         configuration9.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig40);
        factorizationbasedRecommenderConfig40.setName("MutablePreference{userID=97, itemID=10, value=100.0}");
        factorizationbasedRecommenderConfig40.setRetrainAfterPreferenceChanges((int) ' ');
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNull(trainingScheduler4);
        org.junit.Assert.assertNull(storage5);
// flaky:         org.junit.Assert.assertNotNull(configuration6);
        org.junit.Assert.assertNull(storage7);
// flaky:         org.junit.Assert.assertNotNull(configuration8);
// flaky:         org.junit.Assert.assertNotNull(configuration9);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList10);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MutablePreference{userID=100, itemID=0, value=0.0}" + "'", str33, "MutablePreference{userID=100, itemID=0, value=0.0}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test39579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39579");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((-1));
        double double8 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(100);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test39580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39580");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str1 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = batchDeleteCandidatesServlet0.getServletConfig();
        java.lang.String str4 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.destroy();
        batchDeleteCandidatesServlet0.destroy();
        java.lang.String str7 = batchDeleteCandidatesServlet0.getServletInfo();
        java.lang.String str8 = batchDeleteCandidatesServlet0.getServletInfo();
        batchDeleteCandidatesServlet0.init();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test39581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39581");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.lang.String str9 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        int int11 = itembasedRecommenderConfig0.getSimilarItemsPerItem();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer12 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file13 = null;
        org.plista.kornakapi.core.storage.Storage storage14 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer12.train(file13, storage14, recommender15, 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test39582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39582");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage5 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration6 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage7 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration8 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration9 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList10 = null; // flaky: configuration9.getItembasedRecommenders();
// flaky:         configuration9.setNumProcessorsForTraining((int) ' ');
// flaky:         configuration9.setModelDirectory("label");
        int int15 = 0; // flaky: configuration9.getNumProcessorsForTraining();
// flaky:         configuration9.setNumProcessorsForTraining((int) (short) 1);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList18 = null; // flaky: configuration9.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration19 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str20 = storageConfiguration19.getJdbcDriverClass();
        storageConfiguration19.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str23 = storageConfiguration19.getJdbcUrl();
        java.lang.String str24 = storageConfiguration19.getJdbcDriverClass();
        java.lang.String str25 = storageConfiguration19.getJdbcDriverClass();
        java.lang.String str26 = storageConfiguration19.getPassword();
        java.lang.String str27 = storageConfiguration19.getJdbcDriverClass();
        java.lang.String str28 = storageConfiguration19.getPassword();
        storageConfiguration19.setUsername("MutablePreference{userID=100, itemID=0, value=0.0}");
        storageConfiguration19.setPassword("itemID");
        java.lang.String str33 = storageConfiguration19.getUsername();
        storageConfiguration19.setJdbcDriverClass("hi!");
        storageConfiguration19.setJdbcUrl("");
        java.lang.String str38 = storageConfiguration19.getJdbcUrl();
// flaky:         configuration9.setStorageConfiguration(storageConfiguration19);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration40 = null; // flaky: configuration9.getStorageConfiguration();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNull(trainingScheduler4);
        org.junit.Assert.assertNull(storage5);
// flaky:         org.junit.Assert.assertNotNull(configuration6);
        org.junit.Assert.assertNull(storage7);
// flaky:         org.junit.Assert.assertNotNull(configuration8);
// flaky:         org.junit.Assert.assertNotNull(configuration9);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList10);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MutablePreference{userID=100, itemID=0, value=0.0}" + "'", str33, "MutablePreference{userID=100, itemID=0, value=0.0}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration40);
    }

    @Test
    public void test39583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39583");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        mutableCandidate0.set("itemIDs", (long) 0);
        mutableCandidate0.set("itemID", (long) 10000);
        mutableCandidate0.set("itemID", (long) (short) -1);
        long long11 = mutableCandidate0.getItemID();
        long long12 = mutableCandidate0.getItemID();
        java.lang.String str13 = mutableCandidate0.getLabel();
        mutableCandidate0.set("label", (-1L));
        java.lang.String str17 = mutableCandidate0.getLabel();
        long long18 = mutableCandidate0.getItemID();
        long long19 = mutableCandidate0.getItemID();
        java.lang.String str20 = mutableCandidate0.getLabel();
        long long21 = mutableCandidate0.getItemID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "itemID" + "'", str13, "itemID");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "label" + "'", str17, "label");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "label" + "'", str20, "label");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test39584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39584");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        java.lang.String str7 = configuration0.getModelDirectory();
        int int8 = configuration0.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList9 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig10 = null;
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig10);
        configuration0.setNumProcessorsForTraining(0);
        configuration0.setModelDirectory("");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration16 = configuration0.getStorageConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration17 = new org.plista.kornakapi.core.config.Configuration();
        int int18 = configuration17.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration19 = configuration17.getStorageConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig20 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double21 = factorizationbasedRecommenderConfig20.getAlpha();
        double double22 = factorizationbasedRecommenderConfig20.getLambda();
        int int23 = factorizationbasedRecommenderConfig20.getNumberOfFeatures();
        factorizationbasedRecommenderConfig20.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig20.setLambda((double) '4');
        factorizationbasedRecommenderConfig20.setLambda((double) 100L);
        configuration17.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig20);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration31 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str32 = storageConfiguration31.getJdbcDriverClass();
        storageConfiguration31.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str35 = storageConfiguration31.getJdbcUrl();
        java.lang.String str36 = storageConfiguration31.getJdbcDriverClass();
        java.lang.String str37 = storageConfiguration31.getJdbcDriverClass();
        java.lang.String str38 = storageConfiguration31.getPassword();
        java.lang.String str39 = storageConfiguration31.getUsername();
        storageConfiguration31.setUsername("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
        configuration17.setStorageConfiguration(storageConfiguration31);
        java.lang.String str43 = storageConfiguration31.getJdbcUrl();
        configuration0.setStorageConfiguration(storageConfiguration31);
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig45 = null;
        configuration0.addItembasedRecommender(itembasedRecommenderConfig45);
        configuration0.setNumProcessorsForTraining((int) (short) 0);
        org.plista.kornakapi.web.Components components49 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration50 = null; // flaky: components49.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration51 = null; // flaky: components49.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage52 = null; // flaky: components49.storage();
        org.plista.kornakapi.core.storage.Storage storage53 = null; // flaky: components49.storage();
        org.plista.kornakapi.core.config.Configuration configuration54 = null; // flaky: components49.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig55 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double56 = factorizationbasedRecommenderConfig55.getAlpha();
        double double57 = factorizationbasedRecommenderConfig55.getLambda();
        int int58 = factorizationbasedRecommenderConfig55.getNumberOfFeatures();
        factorizationbasedRecommenderConfig55.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig55.setNumberOfFeatures((int) (short) 100);
        boolean boolean63 = factorizationbasedRecommenderConfig55.isUsesImplicitFeedback();
// flaky:         configuration54.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig55);
        org.plista.kornakapi.web.Components components65 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration66 = null; // flaky: components65.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration67 = null; // flaky: components65.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler68 = null; // flaky: components65.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration69 = null; // flaky: components65.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList70 = null; // flaky: configuration69.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration71 = null; // flaky: configuration69.getStorageConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration72 = null; // flaky: configuration69.getStorageConfiguration();
        java.lang.String str73 = null; // flaky: storageConfiguration72.getPassword();
// flaky:         configuration54.setStorageConfiguration(storageConfiguration72);
// flaky:         storageConfiguration72.setJdbcDriverClass("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        configuration0.setStorageConfiguration(storageConfiguration72);
        configuration0.setNumProcessorsForTraining((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList9);
        org.junit.Assert.assertNull(storageConfiguration16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(storageConfiguration19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str39, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertNull(str43);
// flaky:         org.junit.Assert.assertNotNull(components49);
// flaky:         org.junit.Assert.assertNotNull(configuration50);
// flaky:         org.junit.Assert.assertNotNull(configuration51);
        org.junit.Assert.assertNull(storage52);
        org.junit.Assert.assertNull(storage53);
// flaky:         org.junit.Assert.assertNotNull(configuration54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
// flaky:         org.junit.Assert.assertNotNull(components65);
// flaky:         org.junit.Assert.assertNotNull(configuration66);
// flaky:         org.junit.Assert.assertNotNull(configuration67);
        org.junit.Assert.assertNull(trainingScheduler68);
// flaky:         org.junit.Assert.assertNotNull(configuration69);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList70);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration71);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration72);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "itemID" + "'", str73, "itemID");
    }

    @Test
    public void test39585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39585");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        java.lang.String str5 = setPreferenceServlet0.getServletInfo();
        java.lang.String str6 = setPreferenceServlet0.getServletInfo();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        setPreferenceServlet0.init();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet10 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str11 = batchDeleteCandidatesServlet10.getServletInfo();
        batchDeleteCandidatesServlet10.init();
        javax.servlet.ServletConfig servletConfig13 = null;
        batchDeleteCandidatesServlet10.init(servletConfig13);
        javax.servlet.ServletConfig servletConfig15 = batchDeleteCandidatesServlet10.getServletConfig();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet16 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str17 = trainServlet16.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet18 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet18.destroy();
        javax.servlet.ServletConfig servletConfig20 = deleteCandidateServlet18.getServletConfig();
        deleteCandidateServlet18.destroy();
        trainServlet16.init((javax.servlet.ServletConfig) deleteCandidateServlet18);
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet23 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet23.init();
        java.lang.String str25 = batchAddCandidatesServlet23.getServletInfo();
        javax.servlet.ServletConfig servletConfig26 = batchAddCandidatesServlet23.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet27 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str28 = batchDeleteCandidatesServlet27.getServletInfo();
        java.lang.String str29 = batchDeleteCandidatesServlet27.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet30 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet31 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet32 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet31.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet32);
        setPreferenceServlet30.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet32);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet35 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet30.init((javax.servlet.ServletConfig) recommendServlet35);
        batchDeleteCandidatesServlet27.init((javax.servlet.ServletConfig) setPreferenceServlet30);
        batchAddCandidatesServlet23.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet27);
        batchDeleteCandidatesServlet27.init();
        java.lang.String str40 = batchDeleteCandidatesServlet27.getServletInfo();
        java.lang.String str41 = batchDeleteCandidatesServlet27.getServletInfo();
        trainServlet16.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet27);
        batchDeleteCandidatesServlet10.init((javax.servlet.ServletConfig) trainServlet16);
        trainServlet16.init();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) trainServlet16);
        javax.servlet.ServletConfig servletConfig46 = setPreferenceServlet0.getServletConfig();
        setPreferenceServlet0.destroy();
        setPreferenceServlet0.destroy();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet49 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet49.init();
        setPreferenceServlet49.init();
        setPreferenceServlet49.destroy();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet53 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet54 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet55 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet54.init((javax.servlet.ServletConfig) batchSetPreferencesServlet55);
        batchDeleteCandidatesServlet53.init((javax.servlet.ServletConfig) batchSetPreferencesServlet55);
        batchDeleteCandidatesServlet53.destroy();
        javax.servlet.ServletConfig servletConfig59 = batchDeleteCandidatesServlet53.getServletConfig();
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet60 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet61 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet62 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet61.init((javax.servlet.ServletConfig) batchSetPreferencesServlet62);
        javax.servlet.ServletConfig servletConfig64 = batchSetPreferencesServlet61.getServletConfig();
        addCandidateServlet60.init((javax.servlet.ServletConfig) batchSetPreferencesServlet61);
        batchSetPreferencesServlet61.destroy();
        java.lang.String str67 = batchSetPreferencesServlet61.getServletInfo();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet68 = new org.plista.kornakapi.web.servlets.TrainServlet();
        java.lang.String str69 = trainServlet68.getServletInfo();
        org.plista.kornakapi.web.servlets.DeleteCandidateServlet deleteCandidateServlet70 = new org.plista.kornakapi.web.servlets.DeleteCandidateServlet();
        deleteCandidateServlet70.destroy();
        javax.servlet.ServletConfig servletConfig72 = deleteCandidateServlet70.getServletConfig();
        deleteCandidateServlet70.destroy();
        trainServlet68.init((javax.servlet.ServletConfig) deleteCandidateServlet70);
        javax.servlet.ServletConfig servletConfig75 = deleteCandidateServlet70.getServletConfig();
        batchSetPreferencesServlet61.init((javax.servlet.ServletConfig) deleteCandidateServlet70);
        deleteCandidateServlet70.init();
        batchDeleteCandidatesServlet53.init((javax.servlet.ServletConfig) deleteCandidateServlet70);
        setPreferenceServlet49.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet53);
        setPreferenceServlet49.destroy();
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet81 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet81.destroy();
        java.lang.String str83 = addCandidateServlet81.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet84 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        addCandidateServlet81.init((javax.servlet.ServletConfig) setPreferenceServlet84);
        setPreferenceServlet49.init((javax.servlet.ServletConfig) addCandidateServlet81);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet49);
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext88 = setPreferenceServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(servletConfig20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(servletConfig26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(servletConfig46);
        org.junit.Assert.assertNotNull(servletConfig59);
        org.junit.Assert.assertNotNull(servletConfig64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(servletConfig72);
        org.junit.Assert.assertNull(servletConfig75);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test39586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39586");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        addCandidateServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str6 = addCandidateServlet0.getServletInfo();
        addCandidateServlet0.init();
        org.plista.kornakapi.web.MissingParameterException missingParameterException12 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=-1, itemID=10, value=10.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: itemIDs", (java.lang.Throwable) missingParameterException12);
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException20 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException19);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException21 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) invalidParameterException20);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException22 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemIDs", (java.lang.Throwable) invalidParameterException20);
        org.plista.kornakapi.web.MissingParameterException missingParameterException27 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException28 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException27);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException29 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException27);
        org.plista.kornakapi.web.MissingParameterException missingParameterException31 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException33 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException31.addSuppressed((java.lang.Throwable) missingParameterException33);
        invalidParameterException29.addSuppressed((java.lang.Throwable) missingParameterException33);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException36 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException29);
        org.plista.kornakapi.web.MissingParameterException missingParameterException40 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException41 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException40);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException42 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException40);
        invalidParameterException36.addSuppressed((java.lang.Throwable) missingParameterException40);
        org.plista.kornakapi.web.MissingParameterException missingParameterException48 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException49 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException48);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException50 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException48);
        java.lang.Throwable[] throwableArray51 = missingParameterException48.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException52 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException48);
        missingParameterException40.addSuppressed((java.lang.Throwable) missingParameterException48);
        invalidParameterException22.addSuppressed((java.lang.Throwable) missingParameterException40);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException55 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: file", (java.lang.Throwable) invalidParameterException22);
        java.lang.Throwable[] throwableArray56 = invalidParameterException22.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException58 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException60 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException58.addSuppressed((java.lang.Throwable) missingParameterException60);
        java.lang.Throwable[] throwableArray62 = missingParameterException60.getSuppressed();
        java.lang.Throwable[] throwableArray63 = missingParameterException60.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException66 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray67 = missingParameterException66.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException68 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException66);
        org.plista.kornakapi.web.MissingParameterException missingParameterException71 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        java.lang.Throwable[] throwableArray72 = missingParameterException71.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException73 = new org.plista.kornakapi.web.InvalidParameterException("itemIDs", (java.lang.Throwable) missingParameterException71);
        org.plista.kornakapi.web.MissingParameterException missingParameterException78 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException79 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException78);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException80 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=100, itemID=0, value=0.0}", (java.lang.Throwable) invalidParameterException79);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException81 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: howMany", (java.lang.Throwable) invalidParameterException79);
        invalidParameterException73.addSuppressed((java.lang.Throwable) invalidParameterException81);
        missingParameterException66.addSuppressed((java.lang.Throwable) invalidParameterException73);
        java.lang.Throwable[] throwableArray84 = missingParameterException66.getSuppressed();
        missingParameterException60.addSuppressed((java.lang.Throwable) missingParameterException66);
        invalidParameterException22.addSuppressed((java.lang.Throwable) missingParameterException66);
        java.lang.Throwable[] throwableArray87 = invalidParameterException22.getSuppressed();
        missingParameterException12.addSuppressed((java.lang.Throwable) invalidParameterException22);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException89 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: label", (java.lang.Throwable) missingParameterException12);
        // The following exception was thrown during execution in test generation
        try {
            addCandidateServlet0.log("MutablePreference{userID=-1, itemID=10, value=100.0}", (java.lang.Throwable) invalidParameterException89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray87);
    }

    @Test
    public void test39587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39587");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        int int1 = configuration0.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration2 = configuration0.getStorageConfiguration();
        configuration0.setNumProcessorsForTraining((int) '4');
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig5 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig5.setSimilarityClass("");
        java.lang.String str8 = itembasedRecommenderConfig5.getName();
        java.lang.String str9 = itembasedRecommenderConfig5.getSimilarityClass();
        itembasedRecommenderConfig5.setName("");
        java.lang.String str12 = itembasedRecommenderConfig5.getSimilarityClass();
        itembasedRecommenderConfig5.setRetrainCronExpression("batchSize");
        configuration0.addItembasedRecommender(itembasedRecommenderConfig5);
        int int16 = configuration0.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration17 = null;
        configuration0.setStorageConfiguration(storageConfiguration17);
        org.plista.kornakapi.core.config.Configuration configuration19 = new org.plista.kornakapi.core.config.Configuration();
        configuration19.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str22 = configuration19.getModelDirectory();
        configuration19.setNumProcessorsForTraining((int) (byte) 100);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration25 = configuration19.getStorageConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig26 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double27 = factorizationbasedRecommenderConfig26.getAlpha();
        int int28 = factorizationbasedRecommenderConfig26.getNumberOfFeatures();
        factorizationbasedRecommenderConfig26.setUsesImplicitFeedback(true);
        double double31 = factorizationbasedRecommenderConfig26.getLambda();
        factorizationbasedRecommenderConfig26.setNumberOfIterations((int) (byte) 100);
        double double34 = factorizationbasedRecommenderConfig26.getLambda();
        configuration19.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig26);
        boolean boolean36 = factorizationbasedRecommenderConfig26.isUsesImplicitFeedback();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig26);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList38 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.storage.Storage storage39 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap40 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap41 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler42 = null;
        org.plista.kornakapi.web.Components components43 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration44 = null; // flaky: components43.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration45 = null; // flaky: components43.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler46 = null; // flaky: components43.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler47 = null; // flaky: components43.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler48 = null; // flaky: components43.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration49 = null; // flaky: components43.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration50 = null; // flaky: components43.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler51 = null; // flaky: components43.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener52 = null; // flaky: components43.preferenceChangeListener();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage39, strMap40, strMap41, trainingScheduler42, preferenceChangeListener52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(storageConfiguration2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(storageConfiguration25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList38);
// flaky:         org.junit.Assert.assertNotNull(components43);
// flaky:         org.junit.Assert.assertNotNull(configuration44);
// flaky:         org.junit.Assert.assertNotNull(configuration45);
        org.junit.Assert.assertNull(trainingScheduler46);
        org.junit.Assert.assertNull(trainingScheduler47);
        org.junit.Assert.assertNull(trainingScheduler48);
// flaky:         org.junit.Assert.assertNotNull(configuration49);
// flaky:         org.junit.Assert.assertNotNull(configuration50);
        org.junit.Assert.assertNull(trainingScheduler51);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener52);
    }

    @Test
    public void test39588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39588");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener4 = null; // flaky: components0.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration6 = null; // flaky: components0.getConfiguration();
        int int7 = 0; // flaky: configuration6.getNumProcessorsForTraining();
        int int8 = 0; // flaky: configuration6.getNumProcessorsForTraining();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
// flaky:         org.junit.Assert.assertNotNull(configuration6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test39589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39589");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        long long2 = mutableCandidate0.getItemID();
        long long3 = mutableCandidate0.getItemID();
        mutableCandidate0.set("", 35L);
        long long7 = mutableCandidate0.getItemID();
        java.lang.String str8 = mutableCandidate0.getLabel();
        java.lang.String str9 = mutableCandidate0.getLabel();
        java.lang.String str10 = mutableCandidate0.getLabel();
        long long11 = mutableCandidate0.getItemID();
        java.lang.String str12 = mutableCandidate0.getLabel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test39590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39590");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int8 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        boolean boolean9 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setLambda((double) 1);
        int int12 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(10000);
        java.lang.String str15 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer16 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file17 = null;
        org.plista.kornakapi.core.storage.Storage storage18 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender19 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer16.train(file17, storage18, recommender19, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test39591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39591");
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet2 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet2);
        javax.servlet.ServletConfig servletConfig5 = batchSetPreferencesServlet2.getServletConfig();
        java.lang.String str6 = batchSetPreferencesServlet2.getServletInfo();
        java.lang.String str7 = batchSetPreferencesServlet2.getServletInfo();
        batchSetPreferencesServlet2.destroy();
        javax.servlet.ServletConfig servletConfig9 = null;
        batchSetPreferencesServlet2.init(servletConfig9);
        batchSetPreferencesServlet2.init();
        batchSetPreferencesServlet2.init();
        batchSetPreferencesServlet2.destroy();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet2.log("MutablePreference{userID=100, itemID=-1, value=0.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test39592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39592");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        int int7 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        double double8 = factorizationbasedRecommenderConfig0.getAlpha();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        boolean boolean11 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setAlpha((double) 35L);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer14 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        factorizationbasedRecommenderConfig0.setName("org.plista.kornakapi.web.MissingParameterException: itemID");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test39593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39593");
        org.plista.kornakapi.web.MissingParameterException missingParameterException8 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException8);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException10 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException8);
        org.plista.kornakapi.web.MissingParameterException missingParameterException12 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException14 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException12.addSuppressed((java.lang.Throwable) missingParameterException14);
        invalidParameterException10.addSuppressed((java.lang.Throwable) missingParameterException14);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException17 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException18 = new org.plista.kornakapi.web.InvalidParameterException("value", (java.lang.Throwable) invalidParameterException17);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException19 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: itemIDs", (java.lang.Throwable) invalidParameterException18);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException20 = new org.plista.kornakapi.web.InvalidParameterException("", (java.lang.Throwable) invalidParameterException19);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException21 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=32, itemID=1, value=1.0}", (java.lang.Throwable) invalidParameterException19);
        java.lang.String str22 = invalidParameterException21.toString();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=32, itemID=1, value=1.0}" + "'", str22, "org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=32, itemID=1, value=1.0}");
    }

    @Test
    public void test39594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39594");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList5 = null; // flaky: configuration4.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration6 = null; // flaky: configuration4.getStorageConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig7 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str8 = itembasedRecommenderConfig7.getRetrainCronExpression();
        int int9 = itembasedRecommenderConfig7.getRetrainAfterPreferenceChanges();
        java.lang.String str10 = itembasedRecommenderConfig7.getSimilarityClass();
        itembasedRecommenderConfig7.setSimilarityClass("MutablePreference{userID=100, itemID=0, value=0.0}");
        itembasedRecommenderConfig7.setSimilarityClass("MutablePreference{userID=0, itemID=0, value=0.0}");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer15 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
// flaky:         configuration4.addItembasedRecommender(itembasedRecommenderConfig7);
        itembasedRecommenderConfig7.setName("itemID");
        itembasedRecommenderConfig7.setSimilarItemsPerItem(97);
        itembasedRecommenderConfig7.setRetrainCronExpression("MutablePreference{userID=97, itemID=1, value=97.0}");
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList5);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test39595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39595");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler2 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration5 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList6 = null; // flaky: configuration5.getFactorizationbasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList7 = null; // flaky: configuration5.getFactorizationbasedRecommenders();
        java.lang.String str8 = null; // flaky: configuration5.getModelDirectory();
// flaky:         configuration5.setModelDirectory("MutablePreference{userID=0, itemID=0, value=1.0}");
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList11 = null; // flaky: configuration5.getItembasedRecommenders();
        org.plista.kornakapi.core.config.Configuration configuration12 = new org.plista.kornakapi.core.config.Configuration();
        int int13 = configuration12.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration14 = configuration12.getStorageConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig15 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double16 = factorizationbasedRecommenderConfig15.getAlpha();
        double double17 = factorizationbasedRecommenderConfig15.getLambda();
        int int18 = factorizationbasedRecommenderConfig15.getNumberOfFeatures();
        factorizationbasedRecommenderConfig15.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig15.setLambda((double) '4');
        factorizationbasedRecommenderConfig15.setLambda((double) 100L);
        configuration12.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig15);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration26 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str27 = storageConfiguration26.getJdbcDriverClass();
        storageConfiguration26.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str30 = storageConfiguration26.getJdbcUrl();
        java.lang.String str31 = storageConfiguration26.getJdbcDriverClass();
        java.lang.String str32 = storageConfiguration26.getJdbcDriverClass();
        java.lang.String str33 = storageConfiguration26.getPassword();
        java.lang.String str34 = storageConfiguration26.getUsername();
        storageConfiguration26.setUsername("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
        configuration12.setStorageConfiguration(storageConfiguration26);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList38 = configuration12.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration39 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str40 = storageConfiguration39.getJdbcDriverClass();
        storageConfiguration39.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str43 = storageConfiguration39.getJdbcUrl();
        java.lang.String str44 = storageConfiguration39.getJdbcDriverClass();
        storageConfiguration39.setJdbcUrl("hi!");
        java.lang.String str47 = storageConfiguration39.getPassword();
        java.lang.String str48 = storageConfiguration39.getJdbcDriverClass();
        java.lang.String str49 = storageConfiguration39.getUsername();
        java.lang.String str50 = storageConfiguration39.getPassword();
        storageConfiguration39.setUsername("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: recommender");
        configuration12.setStorageConfiguration(storageConfiguration39);
        java.lang.String str54 = configuration12.getModelDirectory();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration55 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str56 = storageConfiguration55.getJdbcDriverClass();
        storageConfiguration55.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str59 = storageConfiguration55.getJdbcUrl();
        java.lang.String str60 = storageConfiguration55.getJdbcDriverClass();
        storageConfiguration55.setUsername("recommender");
        storageConfiguration55.setPassword("MutablePreference{userID=-1, itemID=10, value=10.0}");
        java.lang.String str65 = storageConfiguration55.getJdbcDriverClass();
        java.lang.String str66 = storageConfiguration55.getUsername();
        configuration12.setStorageConfiguration(storageConfiguration55);
// flaky:         configuration5.setStorageConfiguration(storageConfiguration55);
        java.lang.String str69 = storageConfiguration55.getUsername();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(trainingScheduler2);
        org.junit.Assert.assertNull(trainingScheduler3);
// flaky:         org.junit.Assert.assertNotNull(configuration4);
// flaky:         org.junit.Assert.assertNotNull(configuration5);
// flaky:         org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList6);
// flaky:         org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "label" + "'", str8, "label");
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(storageConfiguration14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str34, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str49, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "recommender" + "'", str66, "recommender");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "recommender" + "'", str69, "recommender");
    }

    @Test
    public void test39596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39596");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        long long3 = mutablePreference0.getItemID();
        mutablePreference0.setValue((float) (-1));
        mutablePreference0.setValue((float) 100L);
        mutablePreference0.set((long) (short) 10, (long) (byte) -1, 0.0f);
        mutablePreference0.setValue((float) 0);
        java.lang.String str14 = mutablePreference0.toString();
        mutablePreference0.set((long) 52, (long) (byte) 0, (float) 1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MutablePreference{userID=10, itemID=-1, value=0.0}" + "'", str14, "MutablePreference{userID=10, itemID=-1, value=0.0}");
    }

    @Test
    public void test39597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39597");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        java.lang.String str2 = mutableCandidate0.getLabel();
        mutableCandidate0.set("file", (long) (short) 1);
        long long6 = mutableCandidate0.getItemID();
        long long7 = mutableCandidate0.getItemID();
        long long8 = mutableCandidate0.getItemID();
        mutableCandidate0.set("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: itemIDs", 1L);
        mutableCandidate0.set("MutablePreference{userID=0, itemID=0, value=100.0}", (long) '4');
        long long15 = mutableCandidate0.getItemID();
        java.lang.String str16 = mutableCandidate0.getLabel();
        mutableCandidate0.set("MutablePreference{userID=97, itemID=97, value=32.0}", (long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MutablePreference{userID=0, itemID=0, value=100.0}" + "'", str16, "MutablePreference{userID=0, itemID=0, value=100.0}");
    }

    @Test
    public void test39598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39598");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = null; // flaky: configuration1.getItembasedRecommenders();
        java.lang.String str3 = null; // flaky: configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig4 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double5 = factorizationbasedRecommenderConfig4.getAlpha();
        double double6 = factorizationbasedRecommenderConfig4.getLambda();
        int int7 = factorizationbasedRecommenderConfig4.getNumberOfFeatures();
        factorizationbasedRecommenderConfig4.setNumberOfIterations(0);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig4);
// flaky:         configuration1.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig4);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList12 = null; // flaky: configuration1.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration13 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str14 = storageConfiguration13.getJdbcDriverClass();
        storageConfiguration13.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str17 = storageConfiguration13.getJdbcUrl();
        java.lang.String str18 = storageConfiguration13.getJdbcDriverClass();
        java.lang.String str19 = storageConfiguration13.getJdbcDriverClass();
        java.lang.String str20 = storageConfiguration13.getPassword();
        java.lang.String str21 = storageConfiguration13.getJdbcDriverClass();
// flaky:         configuration1.setStorageConfiguration(storageConfiguration13);
// flaky:         configuration1.setModelDirectory("value");
        org.plista.kornakapi.web.Components components25 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration26 = null; // flaky: components25.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration27 = null; // flaky: components25.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage28 = null; // flaky: components25.storage();
        org.plista.kornakapi.core.storage.Storage storage29 = null; // flaky: components25.storage();
        org.plista.kornakapi.core.config.Configuration configuration30 = null; // flaky: components25.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig31 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double32 = factorizationbasedRecommenderConfig31.getAlpha();
        double double33 = factorizationbasedRecommenderConfig31.getLambda();
        int int34 = factorizationbasedRecommenderConfig31.getNumberOfFeatures();
        factorizationbasedRecommenderConfig31.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig31.setNumberOfFeatures((int) (short) 100);
        boolean boolean39 = factorizationbasedRecommenderConfig31.isUsesImplicitFeedback();
// flaky:         configuration30.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig31);
        org.plista.kornakapi.web.Components components41 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration42 = components41.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler43 = components41.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler44 = components41.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration45 = components41.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration46 = components41.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig47 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig47.setSimilarityClass("");
        java.lang.String str50 = itembasedRecommenderConfig47.getName();
        java.lang.String str51 = itembasedRecommenderConfig47.getSimilarityClass();
        itembasedRecommenderConfig47.setName("");
        java.lang.String str54 = itembasedRecommenderConfig47.getSimilarityClass();
        configuration46.addItembasedRecommender(itembasedRecommenderConfig47);
        itembasedRecommenderConfig47.setSimilarItemsPerItem((int) (byte) 1);
// flaky:         configuration30.addItembasedRecommender(itembasedRecommenderConfig47);
        java.lang.String str59 = null; // flaky: configuration30.getModelDirectory();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig60 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str61 = itembasedRecommenderConfig60.getRetrainCronExpression();
        int int62 = itembasedRecommenderConfig60.getRetrainAfterPreferenceChanges();
        java.lang.String str63 = itembasedRecommenderConfig60.getSimilarityClass();
        itembasedRecommenderConfig60.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig60.setSimilarityClass("");
        int int68 = itembasedRecommenderConfig60.getSimilarItemsPerItem();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer69 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig60);
// flaky:         configuration30.addItembasedRecommender(itembasedRecommenderConfig60);
// flaky:         configuration1.addItembasedRecommender(itembasedRecommenderConfig60);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration72 = null; // flaky: configuration1.getStorageConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList73 = null; // flaky: configuration1.getItembasedRecommenders();
// flaky:         configuration1.setModelDirectory("MutablePreference{userID=0, itemID=0, value=32.0}");
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertNotNull(components25);
// flaky:         org.junit.Assert.assertNotNull(configuration26);
// flaky:         org.junit.Assert.assertNotNull(configuration27);
        org.junit.Assert.assertNull(storage28);
        org.junit.Assert.assertNull(storage29);
// flaky:         org.junit.Assert.assertNotNull(configuration30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(components41);
        org.junit.Assert.assertNotNull(configuration42);
        org.junit.Assert.assertNull(trainingScheduler43);
        org.junit.Assert.assertNull(trainingScheduler44);
        org.junit.Assert.assertNotNull(configuration45);
        org.junit.Assert.assertNotNull(configuration46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "value" + "'", str59, "value");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration72);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList73);
    }

    @Test
    public void test39599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39599");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        java.lang.String str3 = null; // flaky: configuration2.getModelDirectory();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration4 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str5 = storageConfiguration4.getJdbcDriverClass();
        storageConfiguration4.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str8 = storageConfiguration4.getJdbcUrl();
        java.lang.String str9 = storageConfiguration4.getJdbcDriverClass();
        storageConfiguration4.setJdbcDriverClass("batchSize");
        java.lang.String str12 = storageConfiguration4.getPassword();
        java.lang.String str13 = storageConfiguration4.getJdbcUrl();
// flaky:         configuration2.setStorageConfiguration(storageConfiguration4);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration15 = null; // flaky: configuration2.getStorageConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration16 = null; // flaky: configuration2.getStorageConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig17 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double18 = factorizationbasedRecommenderConfig17.getAlpha();
        double double19 = factorizationbasedRecommenderConfig17.getLambda();
        int int20 = factorizationbasedRecommenderConfig17.getNumberOfFeatures();
        factorizationbasedRecommenderConfig17.setUsesImplicitFeedback(true);
        double double23 = factorizationbasedRecommenderConfig17.getAlpha();
        java.lang.String str24 = factorizationbasedRecommenderConfig17.getRetrainCronExpression();
        int int25 = factorizationbasedRecommenderConfig17.getRetrainAfterPreferenceChanges();
// flaky:         configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig17);
        factorizationbasedRecommenderConfig17.setLambda((double) (short) -1);
        boolean boolean29 = factorizationbasedRecommenderConfig17.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig17.setName("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: file");
// flaky:         org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=32.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=32.0}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration15);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test39600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39600");
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener0 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener0.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener2 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener2);
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener7 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener9 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener7.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener2.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
        org.plista.kornakapi.web.Components components15 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration16 = null; // flaky: components15.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration17 = null; // flaky: components15.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler18 = null; // flaky: components15.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler19 = null; // flaky: components15.scheduler();
        org.plista.kornakapi.core.storage.Storage storage20 = null; // flaky: components15.storage();
        org.plista.kornakapi.core.config.Configuration configuration21 = null; // flaky: components15.getConfiguration();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener22 = null; // flaky: components15.preferenceChangeListener();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener23 = null; // flaky: components15.preferenceChangeListener();
        delegatingPreferenceChangeListener9.addDelegate(preferenceChangeListener23);
// flaky:         delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
// flaky:         delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
// flaky:         delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener28 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener28.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener30 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener30.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener30.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener28.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener30);
        delegatingPreferenceChangeListener28.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener35 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener35.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener37 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener37.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener35.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener37);
        delegatingPreferenceChangeListener28.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener35);
        delegatingPreferenceChangeListener9.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener35);
// flaky:         org.junit.Assert.assertNotNull(components15);
// flaky:         org.junit.Assert.assertNotNull(configuration16);
// flaky:         org.junit.Assert.assertNotNull(configuration17);
        org.junit.Assert.assertNull(trainingScheduler18);
        org.junit.Assert.assertNull(trainingScheduler19);
        org.junit.Assert.assertNull(storage20);
// flaky:         org.junit.Assert.assertNotNull(configuration21);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener22);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener23);
    }

    @Test
    public void test39601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39601");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        factorizationbasedRecommenderConfig0.setName("");
        factorizationbasedRecommenderConfig0.setLambda((double) 10000);
        java.lang.String str12 = factorizationbasedRecommenderConfig0.getName();
        factorizationbasedRecommenderConfig0.setName("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: itemIDs");
        boolean boolean15 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        int int16 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test39602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39602");
        org.plista.kornakapi.web.Components components0 = null; // flaky: org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = null; // flaky: components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage4 = null; // flaky: components0.storage();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler5 = null; // flaky: components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration6 = null; // flaky: components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList7 = null; // flaky: configuration6.getItembasedRecommenders();
// flaky:         org.junit.Assert.assertNotNull(components0);
// flaky:         org.junit.Assert.assertNotNull(configuration1);
// flaky:         org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNull(trainingScheduler5);
// flaky:         org.junit.Assert.assertNotNull(configuration6);
// flaky:         org.junit.Assert.assertNotNull(itembasedRecommenderConfigList7);
    }

    @Test
    public void test39603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39603");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        int int6 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        int int7 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setAlpha((double) '4');
        boolean boolean10 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        java.lang.String str11 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        java.lang.String str12 = factorizationbasedRecommenderConfig0.getName();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures(10000);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) '#');
        double double17 = factorizationbasedRecommenderConfig0.getAlpha();
        boolean boolean18 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setLambda(35.0d);
        factorizationbasedRecommenderConfig0.setAlpha((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test39604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39604");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        configuration0.setModelDirectory("userID");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig5 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str6 = itembasedRecommenderConfig5.getRetrainCronExpression();
        int int7 = itembasedRecommenderConfig5.getRetrainAfterPreferenceChanges();
        java.lang.String str8 = itembasedRecommenderConfig5.getSimilarityClass();
        itembasedRecommenderConfig5.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig5.setRetrainCronExpression("value");
        int int13 = itembasedRecommenderConfig5.getRetrainAfterPreferenceChanges();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig5);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList15 = configuration0.getFactorizationbasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig16 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig16.setSimilarityClass("");
        java.lang.String str19 = itembasedRecommenderConfig16.getName();
        java.lang.String str20 = itembasedRecommenderConfig16.getSimilarityClass();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig16);
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig22 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str23 = itembasedRecommenderConfig22.getRetrainCronExpression();
        int int24 = itembasedRecommenderConfig22.getRetrainAfterPreferenceChanges();
        java.lang.String str25 = itembasedRecommenderConfig22.getSimilarityClass();
        itembasedRecommenderConfig22.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig22.setRetrainCronExpression("value");
        int int30 = itembasedRecommenderConfig22.getRetrainAfterPreferenceChanges();
        int int31 = itembasedRecommenderConfig22.getRetrainAfterPreferenceChanges();
        itembasedRecommenderConfig22.setSimilarItemsPerItem((int) (short) 1);
        java.lang.String str34 = itembasedRecommenderConfig22.getRetrainCronExpression();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig22);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList36 = configuration0.getFactorizationbasedRecommenders();
        configuration0.setModelDirectory("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: itemID");
        int int39 = configuration0.getNumProcessorsForTraining();
        configuration0.setNumProcessorsForTraining((int) '4');
        org.plista.kornakapi.core.storage.Storage storage42 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap43 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap44 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler45 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler46 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener49 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler46, "", 10);
        inMemoryPreferenceChangeListener49.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage42, strMap43, strMap44, trainingScheduler45, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener49);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "value" + "'", str34, "value");
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test39605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39605");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage2 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration3 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration4 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage5 = components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener6 = components0.preferenceChangeListener();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNull(storage2);
        org.junit.Assert.assertNotNull(configuration3);
        org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertNull(storage5);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener6);
    }

    @Test
    public void test39606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39606");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        java.lang.String str2 = mutableCandidate0.getLabel();
        java.lang.String str3 = mutableCandidate0.getLabel();
        long long4 = mutableCandidate0.getItemID();
        long long5 = mutableCandidate0.getItemID();
        mutableCandidate0.set("MutablePreference{userID=-1, itemID=-1, value=0.0}", 97L);
        mutableCandidate0.set("MutablePreference{userID=1, itemID=-1, value=10.0}", 10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test39607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39607");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        long long1 = mutablePreference0.getItemID();
        mutablePreference0.set((long) 100, 35L, (-1.0f));
        mutablePreference0.setValue((-1.0f));
        mutablePreference0.set((long) 32, (long) (short) 1, (float) 32);
        mutablePreference0.setValue(35.0f);
        java.lang.String str14 = mutablePreference0.toString();
        long long15 = mutablePreference0.getUserID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MutablePreference{userID=32, itemID=1, value=35.0}" + "'", str14, "MutablePreference{userID=32, itemID=1, value=35.0}");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test39608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39608");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = components0.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener5 = components0.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration6 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage7 = components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener8 = components0.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration9 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler10 = components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler11 = components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler12 = components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration13 = components0.getConfiguration();
        java.lang.String str14 = configuration13.getModelDirectory();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNull(trainingScheduler4);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener5);
        org.junit.Assert.assertNotNull(configuration6);
        org.junit.Assert.assertNull(storage7);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener8);
        org.junit.Assert.assertNotNull(configuration9);
        org.junit.Assert.assertNull(trainingScheduler10);
        org.junit.Assert.assertNull(trainingScheduler11);
        org.junit.Assert.assertNull(trainingScheduler12);
        org.junit.Assert.assertNotNull(configuration13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MutablePreference{userID=0, itemID=0, value=32.0}" + "'", str14, "MutablePreference{userID=0, itemID=0, value=32.0}");
    }

    @Test
    public void test39609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39609");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str4 = storageConfiguration0.getJdbcUrl();
        java.lang.String str5 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setJdbcDriverClass("batchSize");
        java.lang.String str8 = storageConfiguration0.getPassword();
        storageConfiguration0.setUsername("batchSize");
        storageConfiguration0.setJdbcUrl("MutablePreference{userID=1, itemID=0, value=1.0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test39610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39610");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException1.addSuppressed((java.lang.Throwable) missingParameterException3);
        java.lang.Throwable[] throwableArray5 = missingParameterException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39611");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        long long3 = mutablePreference0.getUserID();
        long long4 = mutablePreference0.getUserID();
        long long5 = mutablePreference0.getUserID();
        float float6 = mutablePreference0.getValue();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test39612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39612");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList6 = configuration5.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList7 = configuration5.getItembasedRecommenders();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(trainingScheduler4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList6);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList7);
    }

    @Test
    public void test39613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39613");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException4 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException5 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException3);
        org.plista.kornakapi.web.MissingParameterException missingParameterException10 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException11 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException12 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException10);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException13 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: itemIDs", (java.lang.Throwable) invalidParameterException12);
        java.lang.Throwable[] throwableArray14 = invalidParameterException12.getSuppressed();
        invalidParameterException5.addSuppressed((java.lang.Throwable) invalidParameterException12);
        org.plista.kornakapi.web.MissingParameterException missingParameterException19 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.MissingParameterException: itemIDs");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException20 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=-1, itemID=10, value=10.0}", (java.lang.Throwable) missingParameterException19);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException21 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=0, itemID=0, value=35.0}", (java.lang.Throwable) missingParameterException19);
        invalidParameterException5.addSuppressed((java.lang.Throwable) invalidParameterException21);
        org.plista.kornakapi.web.MissingParameterException missingParameterException28 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException29 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException28);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException30 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException28);
        java.lang.Throwable[] throwableArray31 = missingParameterException28.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException32 = new org.plista.kornakapi.web.InvalidParameterException("recommender", (java.lang.Throwable) missingParameterException28);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException33 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: itemIDs", (java.lang.Throwable) invalidParameterException32);
        org.plista.kornakapi.web.MissingParameterException missingParameterException36 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=100, itemID=-1, value=100.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException37 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=10000, itemID=52, value=0.0}", (java.lang.Throwable) missingParameterException36);
        java.lang.Throwable[] throwableArray38 = invalidParameterException37.getSuppressed();
        invalidParameterException33.addSuppressed((java.lang.Throwable) invalidParameterException37);
        invalidParameterException5.addSuppressed((java.lang.Throwable) invalidParameterException33);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test39614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39614");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        int int6 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setLambda((double) 0);
        factorizationbasedRecommenderConfig0.setName("userID");
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("org.plista.kornakapi.web.MissingParameterException: itemID");
        factorizationbasedRecommenderConfig0.setAlpha((double) 0L);
        factorizationbasedRecommenderConfig0.setAlpha((double) (-1));
        int int17 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test39615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39615");
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
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (byte) -1);
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (byte) 1);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (short) 1);
        factorizationbasedRecommenderConfig0.setLambda((double) 1L);
        factorizationbasedRecommenderConfig0.setAlpha((double) (short) 0);
        factorizationbasedRecommenderConfig0.setName("org.plista.kornakapi.web.InvalidParameterException: itemID");
        int int24 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        double double25 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean26 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test39616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39616");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        long long3 = mutablePreference0.getItemID();
        mutablePreference0.setValue((float) (-1));
        long long6 = mutablePreference0.getUserID();
        long long7 = mutablePreference0.getItemID();
        long long8 = mutablePreference0.getItemID();
        mutablePreference0.set(10L, (long) '4', (float) 35L);
        long long13 = mutablePreference0.getUserID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test39617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39617");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler2 = components0.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener3 = components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler6 = components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration7 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList8 = configuration7.getItembasedRecommenders();
        java.lang.String str9 = configuration7.getModelDirectory();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(trainingScheduler2);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener3);
        org.junit.Assert.assertNull(trainingScheduler4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNull(trainingScheduler6);
        org.junit.Assert.assertNotNull(configuration7);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MutablePreference{userID=0, itemID=0, value=32.0}" + "'", str9, "MutablePreference{userID=0, itemID=0, value=32.0}");
    }

    @Test
    public void test39618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39618");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler2 = components0.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener3 = components0.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration4 = components0.getConfiguration();
        org.plista.kornakapi.web.Components components5 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration6 = components5.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration7 = components5.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage8 = components5.storage();
        org.plista.kornakapi.core.storage.Storage storage9 = components5.storage();
        org.plista.kornakapi.core.config.Configuration configuration10 = components5.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList11 = configuration10.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig12 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig12.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer15 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig12);
        itembasedRecommenderConfig12.setRetrainCronExpression("");
        itembasedRecommenderConfig12.setSimilarItemsPerItem(10);
        itembasedRecommenderConfig12.setRetrainCronExpression("");
        configuration10.addItembasedRecommender(itembasedRecommenderConfig12);
        int int23 = itembasedRecommenderConfig12.getRetrainAfterPreferenceChanges();
        configuration4.addItembasedRecommender(itembasedRecommenderConfig12);
        org.plista.kornakapi.web.Components components25 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration26 = components25.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration27 = components25.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage28 = components25.storage();
        org.plista.kornakapi.core.storage.Storage storage29 = components25.storage();
        org.plista.kornakapi.core.config.Configuration configuration30 = components25.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList31 = configuration30.getItembasedRecommenders();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig32 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double33 = factorizationbasedRecommenderConfig32.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer34 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig32);
        factorizationbasedRecommenderConfig32.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig32.setNumberOfIterations((int) '#');
        double double39 = factorizationbasedRecommenderConfig32.getLambda();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer40 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig32);
        factorizationbasedRecommenderConfig32.setUsesImplicitFeedback(false);
        configuration30.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig32);
        configuration4.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig32);
        int int45 = configuration4.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration46 = configuration4.getStorageConfiguration();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(trainingScheduler2);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener3);
        org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertNotNull(components5);
        org.junit.Assert.assertNotNull(configuration6);
        org.junit.Assert.assertNotNull(configuration7);
        org.junit.Assert.assertNull(storage8);
        org.junit.Assert.assertNull(storage9);
        org.junit.Assert.assertNotNull(configuration10);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(components25);
        org.junit.Assert.assertNotNull(configuration26);
        org.junit.Assert.assertNotNull(configuration27);
        org.junit.Assert.assertNull(storage28);
        org.junit.Assert.assertNull(storage29);
        org.junit.Assert.assertNotNull(configuration30);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration46);
    }

    @Test
    public void test39619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39619");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = setPreferenceServlet0.getServletConfig();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            setPreferenceServlet0.log("MutablePreference{userID=0, itemID=10, value=32.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test39620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39620");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        mutableCandidate0.set("itemIDs", (long) 0);
        mutableCandidate0.set("itemID", (long) 10000);
        java.lang.String str8 = mutableCandidate0.getLabel();
        mutableCandidate0.set("org.plista.kornakapi.web.MissingParameterException: itemID", (long) '#');
        java.lang.String str12 = mutableCandidate0.getLabel();
        mutableCandidate0.set("MutablePreference{userID=-1, itemID=10, value=10.0}", 10L);
        java.lang.String str16 = mutableCandidate0.getLabel();
        long long17 = mutableCandidate0.getItemID();
        java.lang.String str18 = mutableCandidate0.getLabel();
        java.lang.String str19 = mutableCandidate0.getLabel();
        java.lang.String str20 = mutableCandidate0.getLabel();
        long long21 = mutableCandidate0.getItemID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "itemID" + "'", str8, "itemID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str12, "org.plista.kornakapi.web.MissingParameterException: itemID");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=10.0}" + "'", str16, "MutablePreference{userID=-1, itemID=10, value=10.0}");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=10.0}" + "'", str18, "MutablePreference{userID=-1, itemID=10, value=10.0}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=10.0}" + "'", str19, "MutablePreference{userID=-1, itemID=10, value=10.0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=10.0}" + "'", str20, "MutablePreference{userID=-1, itemID=10, value=10.0}");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test39621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39621");
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener0 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener0.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener2 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener2);
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener7 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener9 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener7.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener2.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener16 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener16.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener18 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener18.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener18.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener16.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener18);
        delegatingPreferenceChangeListener2.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener18);
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler24 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener27 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler24, "org.plista.kornakapi.web.InvalidParameterException: file", (int) (byte) 10);
        delegatingPreferenceChangeListener2.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener27);
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener29 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener29.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener31 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener31.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener29.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener31);
        delegatingPreferenceChangeListener31.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener31.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener36 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener36.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener38 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener38.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener38.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener36.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener38);
        delegatingPreferenceChangeListener38.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener31.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener38);
        delegatingPreferenceChangeListener31.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener31.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener46 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener46.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener48 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener48.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener46.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener48);
        delegatingPreferenceChangeListener48.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener48.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener53 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener53.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener55 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener55.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener55.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener53.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener55);
        delegatingPreferenceChangeListener55.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener48.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener55);
        delegatingPreferenceChangeListener31.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener48);
        delegatingPreferenceChangeListener2.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener31);
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler63 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener66 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler63, "howMany", (int) (byte) 100);
        inMemoryPreferenceChangeListener66.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener31.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener66);
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler69 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener72 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler69, "org.plista.kornakapi.web.InvalidParameterException: file", (int) (byte) 10);
        inMemoryPreferenceChangeListener72.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener31.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener72);
    }

    @Test
    public void test39622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39622");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        mutableCandidate0.set("itemIDs", (long) 0);
        java.lang.String str5 = mutableCandidate0.getLabel();
        java.lang.String str6 = mutableCandidate0.getLabel();
        mutableCandidate0.set("", (long) '#');
        mutableCandidate0.set("org.plista.kornakapi.web.InvalidParameterException: file", (long) (short) -1);
        java.lang.String str13 = mutableCandidate0.getLabel();
        long long14 = mutableCandidate0.getItemID();
        mutableCandidate0.set("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=0, itemID=0, value=100.0}", (-1L));
        java.lang.String str18 = mutableCandidate0.getLabel();
        long long19 = mutableCandidate0.getItemID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "itemIDs" + "'", str5, "itemIDs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "itemIDs" + "'", str6, "itemIDs");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: file" + "'", str13, "org.plista.kornakapi.web.InvalidParameterException: file");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=0, itemID=0, value=100.0}" + "'", str18, "org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=0, itemID=0, value=100.0}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test39623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39623");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 10);
        factorizationbasedRecommenderConfig0.setName("");
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getName();
        int int8 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        double double9 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setLambda((double) 97.0f);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer12 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        java.io.File file13 = null;
        org.plista.kornakapi.core.storage.Storage storage14 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender15 = null;
        // The following exception was thrown during execution in test generation
        try {
            factorizationbasedInMemoryTrainer12.train(file13, storage14, recommender15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test39624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39624");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet0.init();
        setPreferenceServlet0.init();
        setPreferenceServlet0.destroy();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet4 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet4.init();
        java.lang.String str6 = batchAddCandidatesServlet4.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = batchAddCandidatesServlet4.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet8 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str9 = batchDeleteCandidatesServlet8.getServletInfo();
        java.lang.String str10 = batchDeleteCandidatesServlet8.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet11 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet12 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet13 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet12.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet13);
        setPreferenceServlet11.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet13);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet16 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet11.init((javax.servlet.ServletConfig) recommendServlet16);
        batchDeleteCandidatesServlet8.init((javax.servlet.ServletConfig) setPreferenceServlet11);
        batchAddCandidatesServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet8);
        batchDeleteCandidatesServlet8.init();
        java.lang.String str21 = batchDeleteCandidatesServlet8.getServletInfo();
        java.lang.String str22 = batchDeleteCandidatesServlet8.getServletInfo();
        batchDeleteCandidatesServlet8.destroy();
        batchDeleteCandidatesServlet8.init();
        javax.servlet.ServletConfig servletConfig25 = batchDeleteCandidatesServlet8.getServletConfig();
        batchDeleteCandidatesServlet8.destroy();
        batchDeleteCandidatesServlet8.destroy();
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet28 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet29 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet30 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet29.init((javax.servlet.ServletConfig) batchSetPreferencesServlet30);
        javax.servlet.ServletConfig servletConfig32 = batchSetPreferencesServlet29.getServletConfig();
        addCandidateServlet28.init((javax.servlet.ServletConfig) batchSetPreferencesServlet29);
        java.lang.String str34 = addCandidateServlet28.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet35 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet36 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet37 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet36.init((javax.servlet.ServletConfig) batchSetPreferencesServlet37);
        batchDeleteCandidatesServlet35.init((javax.servlet.ServletConfig) batchSetPreferencesServlet37);
        javax.servlet.ServletConfig servletConfig40 = batchSetPreferencesServlet37.getServletConfig();
        java.lang.String str41 = batchSetPreferencesServlet37.getServletInfo();
        java.lang.String str42 = batchSetPreferencesServlet37.getServletInfo();
        java.lang.String str43 = batchSetPreferencesServlet37.getServletInfo();
        addCandidateServlet28.init((javax.servlet.ServletConfig) batchSetPreferencesServlet37);
        batchDeleteCandidatesServlet8.init((javax.servlet.ServletConfig) addCandidateServlet28);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) addCandidateServlet28);
        addCandidateServlet28.init();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(servletConfig25);
        org.junit.Assert.assertNotNull(servletConfig32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(servletConfig40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test39625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39625");
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler0 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener3 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler0, "MutablePreference{userID=100, itemID=0, value=10.0}", (int) '4');
    }

    @Test
    public void test39626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39626");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        int int6 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        int int7 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setAlpha((double) '4');
        boolean boolean10 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (short) -1);
        factorizationbasedRecommenderConfig0.setLambda((double) 10000.0f);
        factorizationbasedRecommenderConfig0.setAlpha((double) 10000L);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures(10000);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (short) 0);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges(100);
        double double23 = factorizationbasedRecommenderConfig0.getLambda();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10000.0d + "'", double23 == 10000.0d);
    }

    @Test
    public void test39627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39627");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) (short) 100);
        int int8 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setName("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        int int11 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        int int12 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        int int13 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        int int14 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges(32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test39628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39628");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        boolean boolean8 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 0);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures(100);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer13 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test39629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39629");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str1 = itembasedRecommenderConfig0.getRetrainCronExpression();
        int int2 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        java.lang.String str3 = itembasedRecommenderConfig0.getSimilarityClass();
        java.lang.String str4 = itembasedRecommenderConfig0.getSimilarityClass();
        itembasedRecommenderConfig0.setSimilarItemsPerItem((int) (short) 0);
        int int7 = itembasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        itembasedRecommenderConfig0.setSimilarityClass("org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=100, itemID=0, value=1.0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test39630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39630");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=-1, itemID=10, value=1.0}");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
        org.plista.kornakapi.web.MissingParameterException missingParameterException7 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=-1, itemID=10, value=10.0}");
        missingParameterException5.addSuppressed((java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=0, itemID=100, value=1.0}", (java.lang.Throwable) missingParameterException7);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException10 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=32.0}", (java.lang.Throwable) missingParameterException7);
        missingParameterException1.addSuppressed((java.lang.Throwable) missingParameterException7);
        java.lang.Throwable[] throwableArray12 = missingParameterException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test39631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39631");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler2 = components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener6 = components0.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration7 = components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration8 = configuration7.getStorageConfiguration();
        configuration7.setModelDirectory("MutablePreference{userID=97, itemID=1, value=97.0}");
        org.plista.kornakapi.web.Components components11 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration12 = components11.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration13 = components11.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage14 = components11.storage();
        org.plista.kornakapi.core.storage.Storage storage15 = components11.storage();
        org.plista.kornakapi.core.config.Configuration configuration16 = components11.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList17 = configuration16.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration18 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str19 = storageConfiguration18.getJdbcDriverClass();
        storageConfiguration18.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str22 = storageConfiguration18.getJdbcUrl();
        java.lang.String str23 = storageConfiguration18.getJdbcDriverClass();
        java.lang.String str24 = storageConfiguration18.getJdbcDriverClass();
        java.lang.String str25 = storageConfiguration18.getPassword();
        configuration16.setStorageConfiguration(storageConfiguration18);
        java.lang.String str27 = storageConfiguration18.getJdbcUrl();
        storageConfiguration18.setPassword("org.plista.kornakapi.web.MissingParameterException: itemIDs");
        storageConfiguration18.setJdbcUrl("MutablePreference{userID=100, itemID=0, value=0.0}");
        java.lang.String str32 = storageConfiguration18.getPassword();
        configuration7.setStorageConfiguration(storageConfiguration18);
        configuration7.setNumProcessorsForTraining((-1));
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(trainingScheduler2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertNotNull(configuration5);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener6);
        org.junit.Assert.assertNotNull(configuration7);
// flaky:         org.junit.Assert.assertNotNull(storageConfiguration8);
        org.junit.Assert.assertNotNull(components11);
        org.junit.Assert.assertNotNull(configuration12);
        org.junit.Assert.assertNotNull(configuration13);
        org.junit.Assert.assertNull(storage14);
        org.junit.Assert.assertNull(storage15);
        org.junit.Assert.assertNotNull(configuration16);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemIDs" + "'", str32, "org.plista.kornakapi.web.MissingParameterException: itemIDs");
    }

    @Test
    public void test39632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39632");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double6 = factorizationbasedRecommenderConfig0.getAlpha();
        java.lang.String str7 = factorizationbasedRecommenderConfig0.getRetrainCronExpression();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) (short) -1);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        factorizationbasedRecommenderConfig0.setAlpha((double) 52);
        factorizationbasedRecommenderConfig0.setAlpha((double) 97L);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures(35);
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) 10);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures(35);
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("MutablePreference{userID=1, itemID=-1, value=0.0}");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test39633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39633");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double5 = fixedCandidatesIDRescorer1.rescore((long) (short) 1, (double) (byte) 100);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer6 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double9 = fixedCandidatesIDRescorer1.rescore(0L, (double) 52L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer10 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double13 = fixedCandidatesIDRescorer1.rescore((long) (byte) 0, (double) 100.0f);
        double double16 = fixedCandidatesIDRescorer1.rescore((long) 1, (double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test39634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39634");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration2 = configuration0.getStorageConfiguration();
        configuration0.setNumProcessorsForTraining((int) (short) 0);
        java.lang.String str5 = configuration0.getModelDirectory();
        org.plista.kornakapi.core.config.Configuration configuration6 = new org.plista.kornakapi.core.config.Configuration();
        configuration6.setNumProcessorsForTraining((int) (short) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig9 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double10 = factorizationbasedRecommenderConfig9.getAlpha();
        double double11 = factorizationbasedRecommenderConfig9.getLambda();
        configuration6.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig9);
        java.lang.String str13 = configuration6.getModelDirectory();
        int int14 = configuration6.getNumProcessorsForTraining();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList15 = configuration6.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration16 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str17 = storageConfiguration16.getJdbcDriverClass();
        storageConfiguration16.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str20 = storageConfiguration16.getJdbcUrl();
        java.lang.String str21 = storageConfiguration16.getJdbcUrl();
        storageConfiguration16.setJdbcUrl("label");
        configuration6.setStorageConfiguration(storageConfiguration16);
        java.lang.String str25 = storageConfiguration16.getPassword();
        storageConfiguration16.setJdbcDriverClass("org.plista.kornakapi.web.InvalidParameterException: ");
        configuration0.setStorageConfiguration(storageConfiguration16);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig29 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double30 = factorizationbasedRecommenderConfig29.getAlpha();
        double double31 = factorizationbasedRecommenderConfig29.getLambda();
        int int32 = factorizationbasedRecommenderConfig29.getNumberOfFeatures();
        java.lang.String str33 = factorizationbasedRecommenderConfig29.getRetrainCronExpression();
        int int34 = factorizationbasedRecommenderConfig29.getNumberOfFeatures();
        factorizationbasedRecommenderConfig29.setNumberOfIterations((int) (short) 0);
        boolean boolean37 = factorizationbasedRecommenderConfig29.isUsesImplicitFeedback();
        java.lang.String str38 = factorizationbasedRecommenderConfig29.getRetrainCronExpression();
        double double39 = factorizationbasedRecommenderConfig29.getLambda();
        factorizationbasedRecommenderConfig29.setLambda((double) (byte) -1);
        factorizationbasedRecommenderConfig29.setNumberOfIterations((int) (byte) 100);
        factorizationbasedRecommenderConfig29.setLambda((double) 100L);
        int int46 = factorizationbasedRecommenderConfig29.getRetrainAfterPreferenceChanges();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig29);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList48 = configuration0.getFactorizationbasedRecommenders();
        configuration0.setNumProcessorsForTraining(100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig51 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double52 = factorizationbasedRecommenderConfig51.getAlpha();
        double double53 = factorizationbasedRecommenderConfig51.getLambda();
        int int54 = factorizationbasedRecommenderConfig51.getNumberOfFeatures();
        factorizationbasedRecommenderConfig51.setUsesImplicitFeedback(true);
        double double57 = factorizationbasedRecommenderConfig51.getAlpha();
        java.lang.String str58 = factorizationbasedRecommenderConfig51.getRetrainCronExpression();
        int int59 = factorizationbasedRecommenderConfig51.getRetrainAfterPreferenceChanges();
        int int60 = factorizationbasedRecommenderConfig51.getNumberOfIterations();
        factorizationbasedRecommenderConfig51.setNumberOfFeatures((int) '#');
        double double63 = factorizationbasedRecommenderConfig51.getLambda();
        factorizationbasedRecommenderConfig51.setNumberOfIterations((-1));
        factorizationbasedRecommenderConfig51.setLambda((double) 10L);
        double double68 = factorizationbasedRecommenderConfig51.getLambda();
        factorizationbasedRecommenderConfig51.setNumberOfIterations(100);
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig51);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration72 = configuration0.getStorageConfiguration();
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNull(storageConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(storageConfiguration72);
    }

    @Test
    public void test39635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39635");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler2 = components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = components0.getConfiguration();
        configuration4.setModelDirectory("userID");
        configuration4.setModelDirectory("itemID");
        int int9 = configuration4.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration10 = configuration4.getStorageConfiguration();
        configuration4.setModelDirectory("");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration13 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str14 = storageConfiguration13.getJdbcDriverClass();
        storageConfiguration13.setPassword("value");
        java.lang.String str17 = storageConfiguration13.getJdbcUrl();
        configuration4.setStorageConfiguration(storageConfiguration13);
        java.lang.String str19 = storageConfiguration13.getUsername();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(trainingScheduler2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(storageConfiguration10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test39636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39636");
        org.plista.kornakapi.web.MissingParameterException missingParameterException2 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=35, itemID=35, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException3 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=100, itemID=0, value=0.0}", (java.lang.Throwable) missingParameterException2);
        java.lang.Throwable[] throwableArray4 = invalidParameterException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test39637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39637");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        mutablePreference0.set((long) (short) -1, (long) (byte) 10, (float) (short) 10);
        mutablePreference0.set((long) 10000, (long) (short) -1, 0.0f);
        mutablePreference0.setValue((float) (byte) 0);
        float float13 = mutablePreference0.getValue();
        mutablePreference0.setValue(10.0f);
        java.lang.String str16 = mutablePreference0.toString();
        java.lang.String str17 = mutablePreference0.toString();
        float float18 = mutablePreference0.getValue();
        float float19 = mutablePreference0.getValue();
        java.lang.String str20 = mutablePreference0.toString();
        float float21 = mutablePreference0.getValue();
        long long22 = mutablePreference0.getItemID();
        float float23 = mutablePreference0.getValue();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MutablePreference{userID=10000, itemID=-1, value=10.0}" + "'", str16, "MutablePreference{userID=10000, itemID=-1, value=10.0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MutablePreference{userID=10000, itemID=-1, value=10.0}" + "'", str17, "MutablePreference{userID=10000, itemID=-1, value=10.0}");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MutablePreference{userID=10000, itemID=-1, value=10.0}" + "'", str20, "MutablePreference{userID=10000, itemID=-1, value=10.0}");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
    }

    @Test
    public void test39638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39638");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        java.lang.String str3 = mutablePreference0.toString();
        mutablePreference0.set((long) (byte) 100, (long) (byte) 0, (float) (short) 0);
        float float8 = mutablePreference0.getValue();
        long long9 = mutablePreference0.getItemID();
        mutablePreference0.setValue((float) (short) 100);
        mutablePreference0.setValue(0.0f);
        java.lang.String str14 = mutablePreference0.toString();
        long long15 = mutablePreference0.getUserID();
        java.lang.String str16 = mutablePreference0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MutablePreference{userID=100, itemID=0, value=0.0}" + "'", str14, "MutablePreference{userID=100, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MutablePreference{userID=100, itemID=0, value=0.0}" + "'", str16, "MutablePreference{userID=100, itemID=0, value=0.0}");
    }

    @Test
    public void test39639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39639");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str3 = configuration0.getModelDirectory();
        configuration0.setNumProcessorsForTraining((int) (byte) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig6 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double7 = factorizationbasedRecommenderConfig6.getAlpha();
        double double8 = factorizationbasedRecommenderConfig6.getLambda();
        boolean boolean9 = factorizationbasedRecommenderConfig6.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig6.setUsesImplicitFeedback(true);
        double double12 = factorizationbasedRecommenderConfig6.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig6);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig14 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double15 = factorizationbasedRecommenderConfig14.getAlpha();
        double double16 = factorizationbasedRecommenderConfig14.getLambda();
        boolean boolean17 = factorizationbasedRecommenderConfig14.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer18 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig14);
        int int19 = factorizationbasedRecommenderConfig14.getNumberOfFeatures();
        factorizationbasedRecommenderConfig14.setNumberOfFeatures((-1));
        double double22 = factorizationbasedRecommenderConfig14.getLambda();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig14);
        int int24 = factorizationbasedRecommenderConfig14.getNumberOfIterations();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test39640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39640");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) (short) 100);
        factorizationbasedRecommenderConfig0.setNumberOfIterations(10);
        boolean boolean10 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        double double11 = factorizationbasedRecommenderConfig0.getAlpha();
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("MutablePreference{userID=100, itemID=0, value=0.0}");
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (byte) -1);
        factorizationbasedRecommenderConfig0.setName("MutablePreference{userID=97, itemID=97, value=52.0}");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test39641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39641");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer3 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer4 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair5 = null;
        double double7 = filteringLongPairRescorer4.rescore(longPair5, 10000.0d);
        org.apache.mahout.common.LongPair longPair8 = null;
        double double10 = filteringLongPairRescorer4.rescore(longPair8, (double) (byte) 1);
        org.apache.mahout.common.LongPair longPair11 = null;
        double double13 = filteringLongPairRescorer4.rescore(longPair11, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10000.0d + "'", double7 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test39642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39642");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        java.lang.String str3 = factorizationbasedRecommenderConfig0.getName();
        java.lang.String str4 = factorizationbasedRecommenderConfig0.getName();
        factorizationbasedRecommenderConfig0.setAlpha((double) (-1L));
        int int7 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test39643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39643");
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
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig11 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str12 = itembasedRecommenderConfig11.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer13 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig11);
        itembasedRecommenderConfig11.setSimilarityClass("recommender");
        java.lang.String str16 = itembasedRecommenderConfig11.getSimilarityClass();
        configuration1.addItembasedRecommender(itembasedRecommenderConfig11);
        int int18 = itembasedRecommenderConfig11.getSimilarItemsPerItem();
        java.lang.String str19 = itembasedRecommenderConfig11.getSimilarityClass();
        itembasedRecommenderConfig11.setSimilarItemsPerItem((int) (byte) 100);
        java.lang.String str22 = itembasedRecommenderConfig11.getRetrainCronExpression();
        itembasedRecommenderConfig11.setRetrainCronExpression("itemIDs");
        itembasedRecommenderConfig11.setSimilarityClass("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer27 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig11);
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "recommender" + "'", str16, "recommender");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "recommender" + "'", str19, "recommender");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test39644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39644");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig3 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double4 = factorizationbasedRecommenderConfig3.getAlpha();
        double double5 = factorizationbasedRecommenderConfig3.getLambda();
        boolean boolean6 = factorizationbasedRecommenderConfig3.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer7 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig3);
        double double8 = factorizationbasedRecommenderConfig3.getAlpha();
        configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig3);
        double double10 = factorizationbasedRecommenderConfig3.getAlpha();
        factorizationbasedRecommenderConfig3.setUsesImplicitFeedback(true);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer13 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig3);
        int int14 = factorizationbasedRecommenderConfig3.getRetrainAfterPreferenceChanges();
        java.lang.String str15 = factorizationbasedRecommenderConfig3.getName();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer16 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig3);
        factorizationbasedRecommenderConfig3.setLambda((double) 0.0f);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer19 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig3);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer20 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig3);
        factorizationbasedRecommenderConfig3.setNumberOfFeatures((int) (byte) 0);
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test39645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39645");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener5 = components0.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration6 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration7 = components0.getConfiguration();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener8 = components0.preferenceChangeListener();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener9 = components0.preferenceChangeListener();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener5);
        org.junit.Assert.assertNotNull(configuration6);
        org.junit.Assert.assertNotNull(configuration7);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener8);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener9);
    }

    @Test
    public void test39646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39646");
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener0 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener0.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener2 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener2);
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener7 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener9 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener7.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
        delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener2.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener9);
        org.plista.kornakapi.web.Components components15 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration16 = components15.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration17 = components15.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler18 = components15.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler19 = components15.scheduler();
        org.plista.kornakapi.core.storage.Storage storage20 = components15.storage();
        org.plista.kornakapi.core.config.Configuration configuration21 = components15.getConfiguration();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener22 = components15.preferenceChangeListener();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener23 = components15.preferenceChangeListener();
        delegatingPreferenceChangeListener9.addDelegate(preferenceChangeListener23);
// flaky:         delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
// flaky:         delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener27 = null;
        delegatingPreferenceChangeListener9.addDelegate(preferenceChangeListener27);
        // The following exception was thrown during execution in test generation
        try {
            delegatingPreferenceChangeListener9.notifyOfPreferenceChange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(components15);
        org.junit.Assert.assertNotNull(configuration16);
        org.junit.Assert.assertNotNull(configuration17);
        org.junit.Assert.assertNull(trainingScheduler18);
        org.junit.Assert.assertNull(trainingScheduler19);
        org.junit.Assert.assertNull(storage20);
        org.junit.Assert.assertNotNull(configuration21);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener22);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener23);
    }

    @Test
    public void test39647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39647");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) (short) 10);
        factorizationbasedRecommenderConfig0.setLambda((double) (byte) 10);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        double double9 = factorizationbasedRecommenderConfig0.getLambda();
        double double10 = factorizationbasedRecommenderConfig0.getAlpha();
        double double11 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        boolean boolean14 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test39648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39648");
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
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration11 = configuration0.getStorageConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig12 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str13 = itembasedRecommenderConfig12.getSimilarityClass();
        int int14 = itembasedRecommenderConfig12.getSimilarItemsPerItem();
        itembasedRecommenderConfig12.setSimilarItemsPerItem(1);
        configuration0.addItembasedRecommender(itembasedRecommenderConfig12);
        configuration0.setNumProcessorsForTraining((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList9);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList10);
        org.junit.Assert.assertNull(storageConfiguration11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test39649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39649");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = components0.getConfiguration();
        int int5 = configuration4.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration6 = configuration4.getStorageConfiguration();
        org.plista.kornakapi.web.Components components7 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration8 = components7.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration9 = components7.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler10 = components7.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration11 = components7.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList12 = configuration11.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration13 = configuration11.getStorageConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration14 = configuration11.getStorageConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration15 = configuration11.getStorageConfiguration();
        int int16 = configuration11.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig17 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double18 = factorizationbasedRecommenderConfig17.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer19 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig17);
        factorizationbasedRecommenderConfig17.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig17.setNumberOfIterations((int) '#');
        double double24 = factorizationbasedRecommenderConfig17.getLambda();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer25 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig17);
        factorizationbasedRecommenderConfig17.setUsesImplicitFeedback(false);
        configuration11.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig17);
        int int29 = factorizationbasedRecommenderConfig17.getNumberOfFeatures();
        factorizationbasedRecommenderConfig17.setUsesImplicitFeedback(true);
        configuration4.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig17);
        factorizationbasedRecommenderConfig17.setUsesImplicitFeedback(true);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer35 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig17);
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(storageConfiguration6);
        org.junit.Assert.assertNotNull(components7);
        org.junit.Assert.assertNotNull(configuration8);
        org.junit.Assert.assertNotNull(configuration9);
        org.junit.Assert.assertNull(trainingScheduler10);
        org.junit.Assert.assertNotNull(configuration11);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList12);
        org.junit.Assert.assertNotNull(storageConfiguration13);
        org.junit.Assert.assertNotNull(storageConfiguration14);
        org.junit.Assert.assertNotNull(storageConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test39650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39650");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore(10L, (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer9 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double12 = fixedCandidatesIDRescorer1.rescore((long) (short) 10, (double) 10);
        double double15 = fixedCandidatesIDRescorer1.rescore((long) 1, (double) (-1));
        double double18 = fixedCandidatesIDRescorer1.rescore((long) 0, (double) 32);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer19 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer20 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double23 = fixedCandidatesIDRescorer1.rescore((long) (short) 10, (double) (byte) -1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer24 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double27 = fixedCandidatesIDRescorer1.rescore(35L, (double) 10000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10000.0d + "'", double27 == 10000.0d);
    }

    @Test
    public void test39651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39651");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str3 = configuration0.getModelDirectory();
        configuration0.setNumProcessorsForTraining((int) (byte) 100);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration6 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str7 = storageConfiguration6.getJdbcDriverClass();
        storageConfiguration6.setPassword("itemIDs");
        configuration0.setStorageConfiguration(storageConfiguration6);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration11 = configuration0.getStorageConfiguration();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList12 = configuration0.getFactorizationbasedRecommenders();
        configuration0.setNumProcessorsForTraining(100);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration15 = configuration0.getStorageConfiguration();
        java.lang.String str16 = storageConfiguration15.getJdbcUrl();
        storageConfiguration15.setUsername("org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=0, itemID=10000, value=-1.0}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(storageConfiguration11);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList12);
        org.junit.Assert.assertNotNull(storageConfiguration15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test39652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39652");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration1.getItembasedRecommenders();
        java.lang.String str3 = configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig4 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double5 = factorizationbasedRecommenderConfig4.getAlpha();
        double double6 = factorizationbasedRecommenderConfig4.getLambda();
        int int7 = factorizationbasedRecommenderConfig4.getNumberOfFeatures();
        factorizationbasedRecommenderConfig4.setNumberOfIterations(0);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig4);
        configuration1.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig4);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration12 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str13 = storageConfiguration12.getJdbcDriverClass();
        storageConfiguration12.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str16 = storageConfiguration12.getJdbcUrl();
        java.lang.String str17 = storageConfiguration12.getJdbcDriverClass();
        java.lang.String str18 = storageConfiguration12.getJdbcDriverClass();
        storageConfiguration12.setPassword("org.plista.kornakapi.web.MissingParameterException: itemID");
        java.lang.String str21 = storageConfiguration12.getJdbcDriverClass();
        storageConfiguration12.setPassword("hi!");
        java.lang.String str24 = storageConfiguration12.getPassword();
        java.lang.String str25 = storageConfiguration12.getUsername();
        configuration1.setStorageConfiguration(storageConfiguration12);
        configuration1.setModelDirectory("org.plista.kornakapi.web.InvalidParameterException: howMany");
        org.plista.kornakapi.web.Components components29 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration30 = components29.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration31 = components29.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler32 = components29.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration33 = components29.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList34 = configuration33.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration35 = configuration33.getStorageConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration36 = configuration33.getStorageConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration37 = configuration33.getStorageConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration38 = new org.plista.kornakapi.core.config.Configuration();
        configuration38.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str41 = configuration38.getModelDirectory();
        configuration38.setNumProcessorsForTraining((int) (byte) 100);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration44 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str45 = storageConfiguration44.getJdbcDriverClass();
        storageConfiguration44.setPassword("itemIDs");
        configuration38.setStorageConfiguration(storageConfiguration44);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration49 = configuration38.getStorageConfiguration();
        storageConfiguration49.setJdbcUrl("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        storageConfiguration49.setUsername("MutablePreference{userID=-1, itemID=10, value=10.0}");
        configuration33.setStorageConfiguration(storageConfiguration49);
        java.lang.String str55 = storageConfiguration49.getUsername();
        java.lang.String str56 = storageConfiguration49.getUsername();
        configuration1.setStorageConfiguration(storageConfiguration49);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig58 = null;
        configuration1.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig58);
        configuration1.setModelDirectory("MutablePreference{userID=-1, itemID=1, value=97.0}");
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str25, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertNotNull(components29);
        org.junit.Assert.assertNotNull(configuration30);
        org.junit.Assert.assertNotNull(configuration31);
        org.junit.Assert.assertNull(trainingScheduler32);
        org.junit.Assert.assertNotNull(configuration33);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList34);
        org.junit.Assert.assertNotNull(storageConfiguration35);
        org.junit.Assert.assertNotNull(storageConfiguration36);
        org.junit.Assert.assertNotNull(storageConfiguration37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(storageConfiguration49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=10.0}" + "'", str55, "MutablePreference{userID=-1, itemID=10, value=10.0}");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=10.0}" + "'", str56, "MutablePreference{userID=-1, itemID=10, value=10.0}");
    }

    @Test
    public void test39653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39653");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList3 = configuration2.getItembasedRecommenders();
        configuration2.setNumProcessorsForTraining(10000);
        org.plista.kornakapi.web.Components components6 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration7 = components6.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration8 = components6.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage9 = components6.storage();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener10 = components6.preferenceChangeListener();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler11 = components6.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener12 = components6.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration13 = components6.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig14 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig14.setSimilarityClass("");
        java.lang.String str17 = itembasedRecommenderConfig14.getName();
        java.lang.String str18 = itembasedRecommenderConfig14.getSimilarityClass();
        java.lang.String str19 = itembasedRecommenderConfig14.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer20 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig14);
        configuration13.addItembasedRecommender(itembasedRecommenderConfig14);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig22 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double23 = factorizationbasedRecommenderConfig22.getAlpha();
        double double24 = factorizationbasedRecommenderConfig22.getLambda();
        boolean boolean25 = factorizationbasedRecommenderConfig22.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer26 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig22);
        int int27 = factorizationbasedRecommenderConfig22.getNumberOfFeatures();
        factorizationbasedRecommenderConfig22.setAlpha(100.0d);
        factorizationbasedRecommenderConfig22.setNumberOfIterations((int) (byte) 10);
        factorizationbasedRecommenderConfig22.setNumberOfIterations((int) (byte) 0);
        configuration13.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig22);
        int int35 = factorizationbasedRecommenderConfig22.getRetrainAfterPreferenceChanges();
        factorizationbasedRecommenderConfig22.setAlpha((double) 1);
        configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig22);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList39 = configuration2.getFactorizationbasedRecommenders();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList3);
        org.junit.Assert.assertNotNull(components6);
        org.junit.Assert.assertNotNull(configuration7);
        org.junit.Assert.assertNotNull(configuration8);
        org.junit.Assert.assertNull(storage9);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener10);
        org.junit.Assert.assertNull(trainingScheduler11);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener12);
        org.junit.Assert.assertNotNull(configuration13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList39);
    }

    @Test
    public void test39654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39654");
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet0 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        java.lang.String str1 = batchAddCandidatesServlet0.getServletInfo();
        batchAddCandidatesServlet0.init();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet3 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet4 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet3.init((javax.servlet.ServletConfig) batchSetPreferencesServlet4);
        javax.servlet.ServletConfig servletConfig6 = batchSetPreferencesServlet4.getServletConfig();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet7 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet7.init();
        setPreferenceServlet7.init();
        setPreferenceServlet7.destroy();
        setPreferenceServlet7.destroy();
        batchSetPreferencesServlet4.init((javax.servlet.ServletConfig) setPreferenceServlet7);
        javax.servlet.ServletConfig servletConfig13 = batchSetPreferencesServlet4.getServletConfig();
        java.lang.String str14 = batchSetPreferencesServlet4.getServletInfo();
        batchAddCandidatesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNotNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test39655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39655");
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet0 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        addCandidateServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = addCandidateServlet0.getServletConfig();
        addCandidateServlet0.init();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet4 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet6 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet5.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet6);
        setPreferenceServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet6);
        javax.servlet.ServletConfig servletConfig9 = setPreferenceServlet4.getServletConfig();
        java.lang.String str10 = setPreferenceServlet4.getServletInfo();
        addCandidateServlet0.init((javax.servlet.ServletConfig) setPreferenceServlet4);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNotNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test39656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39656");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        mutablePreference0.set((long) (byte) 1, (long) (byte) 100, (float) (byte) 0);
        long long7 = mutablePreference0.getItemID();
        mutablePreference0.setValue(97.0f);
        mutablePreference0.set((long) (byte) 1, 0L, (float) (short) 0);
        java.lang.String str14 = mutablePreference0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MutablePreference{userID=1, itemID=0, value=0.0}" + "'", str14, "MutablePreference{userID=1, itemID=0, value=0.0}");
    }

    @Test
    public void test39657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39657");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration2.getStorageConfiguration();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList4 = configuration2.getFactorizationbasedRecommenders();
        configuration2.setNumProcessorsForTraining((int) (short) 0);
        configuration2.setModelDirectory("MutablePreference{userID=0, itemID=100, value=97.0}");
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNotNull(storageConfiguration3);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList4);
    }

    @Test
    public void test39658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39658");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = batchSetPreferencesServlet1.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet5 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet6 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet5.init((javax.servlet.ServletConfig) batchSetPreferencesServlet6);
        javax.servlet.ServletConfig servletConfig8 = batchSetPreferencesServlet6.getServletConfig();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet9 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet9.init();
        setPreferenceServlet9.init();
        setPreferenceServlet9.destroy();
        setPreferenceServlet9.destroy();
        batchSetPreferencesServlet6.init((javax.servlet.ServletConfig) setPreferenceServlet9);
        javax.servlet.ServletConfig servletConfig15 = batchSetPreferencesServlet6.getServletConfig();
        batchSetPreferencesServlet1.init(servletConfig15);
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet17 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        setPreferenceServlet17.init();
        setPreferenceServlet17.init();
        setPreferenceServlet17.destroy();
        javax.servlet.ServletConfig servletConfig21 = setPreferenceServlet17.getServletConfig();
        java.lang.String str22 = setPreferenceServlet17.getServletInfo();
        java.lang.String str23 = setPreferenceServlet17.getServletInfo();
        java.lang.String str24 = setPreferenceServlet17.getServletInfo();
        java.lang.String str25 = setPreferenceServlet17.getServletInfo();
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet26 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet27 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet28 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet27.init((javax.servlet.ServletConfig) batchSetPreferencesServlet28);
        javax.servlet.ServletConfig servletConfig30 = batchSetPreferencesServlet27.getServletConfig();
        addCandidateServlet26.init((javax.servlet.ServletConfig) batchSetPreferencesServlet27);
        javax.servlet.ServletConfig servletConfig32 = addCandidateServlet26.getServletConfig();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet33 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet34 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet35 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet34.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet35);
        setPreferenceServlet33.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet35);
        javax.servlet.ServletConfig servletConfig38 = setPreferenceServlet33.getServletConfig();
        addCandidateServlet26.init((javax.servlet.ServletConfig) setPreferenceServlet33);
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet40 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet40.init();
        java.lang.String str42 = batchAddCandidatesServlet40.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet43 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str44 = batchDeleteCandidatesServlet43.getServletInfo();
        batchDeleteCandidatesServlet43.destroy();
        javax.servlet.ServletConfig servletConfig46 = batchDeleteCandidatesServlet43.getServletConfig();
        batchAddCandidatesServlet40.init(servletConfig46);
        batchAddCandidatesServlet40.init();
        addCandidateServlet26.init((javax.servlet.ServletConfig) batchAddCandidatesServlet40);
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet50 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet50.init();
        java.lang.String str52 = batchAddCandidatesServlet50.getServletInfo();
        javax.servlet.ServletConfig servletConfig53 = batchAddCandidatesServlet50.getServletConfig();
        batchAddCandidatesServlet50.init();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet55 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str56 = batchDeleteCandidatesServlet55.getServletInfo();
        batchDeleteCandidatesServlet55.init();
        javax.servlet.ServletConfig servletConfig58 = null;
        batchDeleteCandidatesServlet55.init(servletConfig58);
        javax.servlet.ServletConfig servletConfig60 = batchDeleteCandidatesServlet55.getServletConfig();
        batchDeleteCandidatesServlet55.init();
        javax.servlet.ServletConfig servletConfig62 = batchDeleteCandidatesServlet55.getServletConfig();
        java.lang.String str63 = batchDeleteCandidatesServlet55.getServletInfo();
        batchAddCandidatesServlet50.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet55);
        batchDeleteCandidatesServlet55.init();
        batchDeleteCandidatesServlet55.init();
        batchAddCandidatesServlet40.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet55);
        setPreferenceServlet17.init((javax.servlet.ServletConfig) batchAddCandidatesServlet40);
        batchSetPreferencesServlet1.init((javax.servlet.ServletConfig) batchAddCandidatesServlet40);
        batchSetPreferencesServlet1.destroy();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNotNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(servletConfig30);
        org.junit.Assert.assertNotNull(servletConfig32);
        org.junit.Assert.assertNotNull(servletConfig38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(servletConfig46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(servletConfig53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(servletConfig60);
        org.junit.Assert.assertNull(servletConfig62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test39659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39659");
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet0 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet1 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet1);
        java.lang.String str3 = batchSetPreferencesServlet1.getServletInfo();
        batchSetPreferencesServlet1.init();
        batchSetPreferencesServlet1.destroy();
        // The following exception was thrown during execution in test generation
        try {
            batchSetPreferencesServlet1.log("MutablePreference{userID=0, itemID=10, value=10.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39660");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str3 = configuration0.getModelDirectory();
        configuration0.setNumProcessorsForTraining((int) (byte) 100);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration6 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str7 = storageConfiguration6.getJdbcDriverClass();
        storageConfiguration6.setPassword("itemIDs");
        configuration0.setStorageConfiguration(storageConfiguration6);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration11 = configuration0.getStorageConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig12 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str13 = itembasedRecommenderConfig12.getRetrainCronExpression();
        itembasedRecommenderConfig12.setSimilarityClass("");
        java.lang.String str16 = itembasedRecommenderConfig12.getSimilarityClass();
        itembasedRecommenderConfig12.setRetrainCronExpression("MutablePreference{userID=100, itemID=0, value=0.0}");
        configuration0.addItembasedRecommender(itembasedRecommenderConfig12);
        java.lang.String str20 = itembasedRecommenderConfig12.getName();
        int int21 = itembasedRecommenderConfig12.getSimilarItemsPerItem();
        java.lang.String str22 = itembasedRecommenderConfig12.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer23 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(storageConfiguration11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test39661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39661");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((long) '#', (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer6 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair7 = null;
        double double9 = filteringLongPairRescorer6.rescore(longPair7, (double) '4');
        org.apache.mahout.common.LongPair longPair10 = null;
        double double12 = filteringLongPairRescorer6.rescore(longPair10, (-1.0d));
        org.apache.mahout.common.LongPair longPair13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringLongPairRescorer6.isFiltered(longPair13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test39662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39662");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        int int3 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setName("");
        factorizationbasedRecommenderConfig0.setName("");
        int int8 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test39663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39663");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        int int1 = configuration0.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig2 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double3 = factorizationbasedRecommenderConfig2.getAlpha();
        double double4 = factorizationbasedRecommenderConfig2.getLambda();
        int int5 = factorizationbasedRecommenderConfig2.getNumberOfFeatures();
        java.lang.String str6 = factorizationbasedRecommenderConfig2.getRetrainCronExpression();
        int int7 = factorizationbasedRecommenderConfig2.getNumberOfFeatures();
        java.lang.String str8 = factorizationbasedRecommenderConfig2.getName();
        int int9 = factorizationbasedRecommenderConfig2.getNumberOfIterations();
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig2);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList11 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.web.Components components12 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration13 = components12.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration14 = components12.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler15 = components12.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler16 = components12.scheduler();
        org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener preferenceChangeListener17 = components12.preferenceChangeListener();
        org.plista.kornakapi.core.config.Configuration configuration18 = components12.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig19 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str20 = itembasedRecommenderConfig19.getRetrainCronExpression();
        int int21 = itembasedRecommenderConfig19.getRetrainAfterPreferenceChanges();
        java.lang.String str22 = itembasedRecommenderConfig19.getSimilarityClass();
        itembasedRecommenderConfig19.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig19.setSimilarityClass("");
        itembasedRecommenderConfig19.setSimilarItemsPerItem((int) '#');
        java.lang.String str29 = itembasedRecommenderConfig19.getName();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer30 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig19);
        configuration18.addItembasedRecommender(itembasedRecommenderConfig19);
        itembasedRecommenderConfig19.setRetrainCronExpression("org.plista.kornakapi.web.InvalidParameterException: itemIDs");
        configuration0.addItembasedRecommender(itembasedRecommenderConfig19);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration35 = configuration0.getStorageConfiguration();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList36 = configuration0.getFactorizationbasedRecommenders();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig37 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double38 = factorizationbasedRecommenderConfig37.getAlpha();
        double double39 = factorizationbasedRecommenderConfig37.getLambda();
        int int40 = factorizationbasedRecommenderConfig37.getNumberOfFeatures();
        java.lang.String str41 = factorizationbasedRecommenderConfig37.getRetrainCronExpression();
        int int42 = factorizationbasedRecommenderConfig37.getNumberOfFeatures();
        factorizationbasedRecommenderConfig37.setNumberOfIterations((int) (short) 0);
        factorizationbasedRecommenderConfig37.setRetrainAfterPreferenceChanges((int) (byte) 100);
        double double47 = factorizationbasedRecommenderConfig37.getLambda();
        factorizationbasedRecommenderConfig37.setAlpha((double) (short) 10);
        int int50 = factorizationbasedRecommenderConfig37.getNumberOfFeatures();
        java.lang.String str51 = factorizationbasedRecommenderConfig37.getName();
        int int52 = factorizationbasedRecommenderConfig37.getNumberOfIterations();
        java.lang.String str53 = factorizationbasedRecommenderConfig37.getRetrainCronExpression();
        factorizationbasedRecommenderConfig37.setNumberOfFeatures(32);
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList11);
        org.junit.Assert.assertNotNull(components12);
        org.junit.Assert.assertNotNull(configuration13);
        org.junit.Assert.assertNotNull(configuration14);
        org.junit.Assert.assertNull(trainingScheduler15);
        org.junit.Assert.assertNull(trainingScheduler16);
// flaky:         org.junit.Assert.assertNotNull(preferenceChangeListener17);
        org.junit.Assert.assertNotNull(configuration18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(storageConfiguration35);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test39664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39664");
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
        double double12 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (byte) -1);
        int int15 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        factorizationbasedRecommenderConfig0.setLambda((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test39665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39665");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = components0.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler4 = components0.scheduler();
        org.plista.kornakapi.core.storage.Storage storage5 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration6 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage7 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration8 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration9 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList10 = configuration9.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList11 = configuration9.getFactorizationbasedRecommenders();
        org.plista.kornakapi.web.Components components12 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration13 = components12.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler14 = components12.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler15 = components12.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration16 = components12.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig17 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str18 = itembasedRecommenderConfig17.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer19 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig17);
        java.lang.String str20 = itembasedRecommenderConfig17.getSimilarityClass();
        itembasedRecommenderConfig17.setRetrainAfterPreferenceChanges((int) (short) 100);
        configuration16.addItembasedRecommender(itembasedRecommenderConfig17);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration24 = configuration16.getStorageConfiguration();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration25 = configuration16.getStorageConfiguration();
        storageConfiguration25.setUsername("org.plista.kornakapi.web.InvalidParameterException: file");
        configuration9.setStorageConfiguration(storageConfiguration25);
        org.plista.kornakapi.web.Components components29 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration30 = components29.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration31 = components29.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler32 = components29.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration33 = components29.getConfiguration();
        configuration33.setNumProcessorsForTraining(0);
        org.plista.kornakapi.core.config.Configuration configuration36 = new org.plista.kornakapi.core.config.Configuration();
        configuration36.setNumProcessorsForTraining((int) (short) 100);
        java.lang.String str39 = configuration36.getModelDirectory();
        configuration36.setNumProcessorsForTraining((int) (byte) 100);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig42 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double43 = factorizationbasedRecommenderConfig42.getAlpha();
        double double44 = factorizationbasedRecommenderConfig42.getLambda();
        boolean boolean45 = factorizationbasedRecommenderConfig42.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig42.setUsesImplicitFeedback(true);
        double double48 = factorizationbasedRecommenderConfig42.getLambda();
        configuration36.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig42);
        factorizationbasedRecommenderConfig42.setRetrainCronExpression("value");
        factorizationbasedRecommenderConfig42.setRetrainCronExpression("org.plista.kornakapi.web.InvalidParameterException: ");
        configuration33.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig42);
        int int55 = factorizationbasedRecommenderConfig42.getRetrainAfterPreferenceChanges();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer56 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig42);
        configuration9.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig42);
        factorizationbasedRecommenderConfig42.setLambda((double) 97);
        factorizationbasedRecommenderConfig42.setName("MutablePreference{userID=10000, itemID=52, value=0.0}");
        factorizationbasedRecommenderConfig42.setNumberOfIterations(35);
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNull(trainingScheduler4);
        org.junit.Assert.assertNull(storage5);
        org.junit.Assert.assertNotNull(configuration6);
        org.junit.Assert.assertNull(storage7);
        org.junit.Assert.assertNotNull(configuration8);
        org.junit.Assert.assertNotNull(configuration9);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList10);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList11);
        org.junit.Assert.assertNotNull(components12);
        org.junit.Assert.assertNotNull(configuration13);
        org.junit.Assert.assertNull(trainingScheduler14);
        org.junit.Assert.assertNull(trainingScheduler15);
        org.junit.Assert.assertNotNull(configuration16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(storageConfiguration24);
        org.junit.Assert.assertNotNull(storageConfiguration25);
        org.junit.Assert.assertNotNull(components29);
        org.junit.Assert.assertNotNull(configuration30);
        org.junit.Assert.assertNotNull(configuration31);
        org.junit.Assert.assertNull(trainingScheduler32);
        org.junit.Assert.assertNotNull(configuration33);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test39666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39666");
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
        org.plista.kornakapi.web.MissingParameterException missingParameterException22 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=52, itemID=97, value=1.0}");
        invalidParameterException13.addSuppressed((java.lang.Throwable) missingParameterException22);
    }

    @Test
    public void test39667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39667");
        org.plista.kornakapi.web.MissingParameterException missingParameterException1 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=10000, itemID=52, value=0.0}");
        org.plista.kornakapi.web.MissingParameterException missingParameterException3 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException6 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException7 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException6);
        missingParameterException3.addSuppressed((java.lang.Throwable) invalidParameterException7);
        missingParameterException1.addSuppressed((java.lang.Throwable) invalidParameterException7);
    }

    @Test
    public void test39668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39668");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer2 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double5 = fixedCandidatesIDRescorer1.rescore((long) (short) 1, (double) (byte) 100);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer6 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double9 = fixedCandidatesIDRescorer1.rescore((long) 97, (double) 32);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer10 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer11 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double14 = fixedCandidatesIDRescorer1.rescore((long) (byte) 0, (double) ' ');
        double double17 = fixedCandidatesIDRescorer1.rescore(32L, (double) 97L);
        double double20 = fixedCandidatesIDRescorer1.rescore((long) 10000, (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test39669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39669");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        configuration2.setModelDirectory("itemID");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig5 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig5);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration7 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str8 = storageConfiguration7.getUsername();
        configuration2.setStorageConfiguration(storageConfiguration7);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList10 = configuration2.getItembasedRecommenders();
        int int11 = configuration2.getNumProcessorsForTraining();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig12 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str13 = itembasedRecommenderConfig12.getSimilarityClass();
        int int14 = itembasedRecommenderConfig12.getSimilarItemsPerItem();
        int int15 = itembasedRecommenderConfig12.getRetrainAfterPreferenceChanges();
        int int16 = itembasedRecommenderConfig12.getRetrainAfterPreferenceChanges();
        configuration2.addItembasedRecommender(itembasedRecommenderConfig12);
        itembasedRecommenderConfig12.setSimilarityClass("org.plista.kornakapi.web.MissingParameterException: label");
        itembasedRecommenderConfig12.setName("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=10, itemID=1, value=52.0}");
        java.lang.String str22 = itembasedRecommenderConfig12.getSimilarityClass();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: label" + "'", str22, "org.plista.kornakapi.web.MissingParameterException: label");
    }

    @Test
    public void test39670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39670");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) (short) 10);
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(false);
        boolean boolean7 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures(0);
        factorizationbasedRecommenderConfig0.setAlpha(0.0d);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer12 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        factorizationbasedRecommenderConfig0.setLambda((double) (-1.0f));
        factorizationbasedRecommenderConfig0.setAlpha((double) (-1));
        factorizationbasedRecommenderConfig0.setLambda((double) 32L);
        factorizationbasedRecommenderConfig0.setAlpha((double) 97);
        int int21 = factorizationbasedRecommenderConfig0.getNumberOfIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test39671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39671");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.storage.Storage storage1 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList3 = configuration2.getItembasedRecommenders();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig4 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double5 = factorizationbasedRecommenderConfig4.getAlpha();
        double double6 = factorizationbasedRecommenderConfig4.getLambda();
        int int7 = factorizationbasedRecommenderConfig4.getNumberOfFeatures();
        java.lang.String str8 = factorizationbasedRecommenderConfig4.getRetrainCronExpression();
        int int9 = factorizationbasedRecommenderConfig4.getNumberOfFeatures();
        java.lang.String str10 = factorizationbasedRecommenderConfig4.getName();
        factorizationbasedRecommenderConfig4.setRetrainCronExpression("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.InvalidParameterException: itemIDs");
        double double13 = factorizationbasedRecommenderConfig4.getAlpha();
        factorizationbasedRecommenderConfig4.setNumberOfIterations(97);
        factorizationbasedRecommenderConfig4.setName("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=-1.0}");
        configuration2.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig4);
        factorizationbasedRecommenderConfig4.setLambda((double) (-1L));
        java.lang.String str21 = factorizationbasedRecommenderConfig4.getName();
        factorizationbasedRecommenderConfig4.setUsesImplicitFeedback(false);
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNull(storage1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=-1.0}" + "'", str21, "org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=-1.0}");
    }

    @Test
    public void test39672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39672");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        java.lang.String str3 = mutablePreference0.toString();
        mutablePreference0.set((long) (byte) 100, (long) (byte) 0, (float) (short) 0);
        float float8 = mutablePreference0.getValue();
        long long9 = mutablePreference0.getUserID();
        long long10 = mutablePreference0.getItemID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test39673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39673");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        java.lang.String str2 = mutableCandidate0.getLabel();
        mutableCandidate0.set("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (long) (short) 1);
        long long6 = mutableCandidate0.getItemID();
        mutableCandidate0.set("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (long) (byte) -1);
        mutableCandidate0.set("MutablePreference{userID=10, itemID=100, value=10000.0}", 0L);
        java.lang.String str13 = mutableCandidate0.getLabel();
        mutableCandidate0.set("org.plista.kornakapi.web.InvalidParameterException: batchSize", (long) (byte) 100);
        java.lang.String str17 = mutableCandidate0.getLabel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MutablePreference{userID=10, itemID=100, value=10000.0}" + "'", str13, "MutablePreference{userID=10, itemID=100, value=10000.0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.plista.kornakapi.web.InvalidParameterException: batchSize" + "'", str17, "org.plista.kornakapi.web.InvalidParameterException: batchSize");
    }

    @Test
    public void test39674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39674");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig0 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig0.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer3 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        itembasedRecommenderConfig0.setRetrainCronExpression("");
        itembasedRecommenderConfig0.setSimilarItemsPerItem(10);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.lang.String str9 = itembasedRecommenderConfig0.getSimilarityClass();
        java.lang.String str10 = itembasedRecommenderConfig0.getSimilarityClass();
        java.lang.String str11 = itembasedRecommenderConfig0.getSimilarityClass();
        java.lang.String str12 = itembasedRecommenderConfig0.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer13 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig0);
        java.io.File file14 = null;
        org.plista.kornakapi.core.storage.Storage storage15 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer13.train(file14, storage15, recommender16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test39675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39675");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        configuration0.setNumProcessorsForTraining((int) (short) 100);
        configuration0.setModelDirectory("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig5 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig5.setName("recommender");
        int int8 = itembasedRecommenderConfig5.getSimilarItemsPerItem();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig5);
        int int10 = itembasedRecommenderConfig5.getSimilarItemsPerItem();
        int int11 = itembasedRecommenderConfig5.getSimilarItemsPerItem();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer12 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig5);
        int int13 = itembasedRecommenderConfig5.getSimilarItemsPerItem();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test39676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39676");
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
        configuration5.setNumProcessorsForTraining((int) (short) -1);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig19 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double20 = factorizationbasedRecommenderConfig19.getAlpha();
        double double21 = factorizationbasedRecommenderConfig19.getLambda();
        int int22 = factorizationbasedRecommenderConfig19.getNumberOfFeatures();
        factorizationbasedRecommenderConfig19.setUsesImplicitFeedback(false);
        int int25 = factorizationbasedRecommenderConfig19.getNumberOfFeatures();
        factorizationbasedRecommenderConfig19.setLambda((double) 0);
        factorizationbasedRecommenderConfig19.setName("userID");
        int int30 = factorizationbasedRecommenderConfig19.getNumberOfFeatures();
        int int31 = factorizationbasedRecommenderConfig19.getNumberOfIterations();
        factorizationbasedRecommenderConfig19.setNumberOfFeatures((int) (short) 1);
        java.lang.String str34 = factorizationbasedRecommenderConfig19.getRetrainCronExpression();
        configuration5.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig19);
        org.plista.kornakapi.core.config.Configuration configuration36 = new org.plista.kornakapi.core.config.Configuration();
        configuration36.setNumProcessorsForTraining((int) (short) 100);
        configuration36.setModelDirectory("userID");
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig41 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str42 = itembasedRecommenderConfig41.getRetrainCronExpression();
        int int43 = itembasedRecommenderConfig41.getRetrainAfterPreferenceChanges();
        java.lang.String str44 = itembasedRecommenderConfig41.getSimilarityClass();
        itembasedRecommenderConfig41.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig41.setRetrainCronExpression("value");
        int int49 = itembasedRecommenderConfig41.getRetrainAfterPreferenceChanges();
        configuration36.addItembasedRecommender(itembasedRecommenderConfig41);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList51 = configuration36.getFactorizationbasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration52 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str53 = storageConfiguration52.getJdbcDriverClass();
        storageConfiguration52.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str56 = storageConfiguration52.getPassword();
        java.lang.String str57 = storageConfiguration52.getJdbcDriverClass();
        storageConfiguration52.setPassword("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        storageConfiguration52.setUsername("");
        configuration36.setStorageConfiguration(storageConfiguration52);
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig63 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double64 = factorizationbasedRecommenderConfig63.getAlpha();
        double double65 = factorizationbasedRecommenderConfig63.getLambda();
        int int66 = factorizationbasedRecommenderConfig63.getNumberOfFeatures();
        factorizationbasedRecommenderConfig63.setUsesImplicitFeedback(true);
        double double69 = factorizationbasedRecommenderConfig63.getAlpha();
        java.lang.String str70 = factorizationbasedRecommenderConfig63.getRetrainCronExpression();
        int int71 = factorizationbasedRecommenderConfig63.getRetrainAfterPreferenceChanges();
        boolean boolean72 = factorizationbasedRecommenderConfig63.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig63.setLambda((double) 1);
        int int75 = factorizationbasedRecommenderConfig63.getNumberOfFeatures();
        factorizationbasedRecommenderConfig63.setAlpha((double) (-1L));
        boolean boolean78 = factorizationbasedRecommenderConfig63.isUsesImplicitFeedback();
        configuration36.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig63);
        configuration5.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig63);
        configuration5.setModelDirectory("");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration83 = configuration5.getStorageConfiguration();
        java.lang.String str84 = storageConfiguration83.getJdbcDriverClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "itemID" + "'", str16, "itemID");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(storageConfiguration83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test39677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39677");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        mutablePreference0.setValue((float) 1L);
        java.lang.String str3 = mutablePreference0.toString();
        java.lang.String str4 = mutablePreference0.toString();
        long long5 = mutablePreference0.getUserID();
        mutablePreference0.setValue((float) 1);
        float float8 = mutablePreference0.getValue();
        mutablePreference0.set((long) (short) 1, 35L, (float) (-1));
        float float13 = mutablePreference0.getValue();
        float float14 = mutablePreference0.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MutablePreference{userID=0, itemID=0, value=1.0}" + "'", str4, "MutablePreference{userID=0, itemID=0, value=1.0}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test39678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39678");
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
        storageConfiguration7.setJdbcUrl("MutablePreference{userID=0, itemID=0, value=-1.0}");
        java.lang.String str18 = storageConfiguration7.getPassword();
        java.lang.String str19 = storageConfiguration7.getJdbcUrl();
        storageConfiguration7.setPassword("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=100.0}");
        storageConfiguration7.setJdbcDriverClass("MutablePreference{userID=0, itemID=0, value=-1.0}");
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MutablePreference{userID=0, itemID=0, value=-1.0}" + "'", str19, "MutablePreference{userID=0, itemID=0, value=-1.0}");
    }

    @Test
    public void test39679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39679");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration1.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str4 = storageConfiguration3.getJdbcDriverClass();
        java.lang.String str5 = storageConfiguration3.getUsername();
        storageConfiguration3.setPassword("label");
        configuration1.setStorageConfiguration(storageConfiguration3);
        configuration1.setNumProcessorsForTraining(10);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList11 = configuration1.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig12 = null;
        configuration1.addItembasedRecommender(itembasedRecommenderConfig12);
        java.lang.String str14 = configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig15 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double16 = factorizationbasedRecommenderConfig15.getAlpha();
        double double17 = factorizationbasedRecommenderConfig15.getLambda();
        int int18 = factorizationbasedRecommenderConfig15.getNumberOfFeatures();
        factorizationbasedRecommenderConfig15.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig15.setNumberOfFeatures((int) (short) 100);
        int int23 = factorizationbasedRecommenderConfig15.getNumberOfIterations();
        factorizationbasedRecommenderConfig15.setNumberOfIterations(1);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer26 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig15);
        configuration1.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig15);
        configuration1.setNumProcessorsForTraining((int) (byte) 100);
        configuration1.setModelDirectory("MutablePreference{userID=32, itemID=32, value=97.0}");
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test39680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39680");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        java.lang.String str1 = recommendServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig2 = recommendServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = recommendServlet0.getServletConfig();
        org.plista.kornakapi.web.servlets.TrainServlet trainServlet4 = new org.plista.kornakapi.web.servlets.TrainServlet();
        trainServlet4.destroy();
        trainServlet4.destroy();
        recommendServlet0.init((javax.servlet.ServletConfig) trainServlet4);
        trainServlet4.init();
        trainServlet4.destroy();
        javax.servlet.ServletConfig servletConfig10 = trainServlet4.getServletConfig();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet11 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str12 = batchDeleteCandidatesServlet11.getServletInfo();
        batchDeleteCandidatesServlet11.init();
        java.lang.String str14 = batchDeleteCandidatesServlet11.getServletInfo();
        org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet batchAddCandidatesServlet15 = new org.plista.kornakapi.web.servlets.BatchAddCandidatesServlet();
        batchAddCandidatesServlet15.init();
        batchDeleteCandidatesServlet11.init((javax.servlet.ServletConfig) batchAddCandidatesServlet15);
        batchDeleteCandidatesServlet11.destroy();
        batchDeleteCandidatesServlet11.init();
        java.lang.String str20 = batchDeleteCandidatesServlet11.getServletInfo();
        batchDeleteCandidatesServlet11.destroy();
        org.plista.kornakapi.web.servlets.AddCandidateServlet addCandidateServlet22 = new org.plista.kornakapi.web.servlets.AddCandidateServlet();
        batchDeleteCandidatesServlet11.init((javax.servlet.ServletConfig) addCandidateServlet22);
        trainServlet4.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = batchDeleteCandidatesServlet11.getInitParameter("MutablePreference{userID=35, itemID=97, value=-1.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test39681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39681");
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet0 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet1 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet1);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet3 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str4 = batchDeleteCandidatesServlet3.getServletInfo();
        batchDeleteCandidatesServlet3.init();
        javax.servlet.ServletConfig servletConfig6 = null;
        batchDeleteCandidatesServlet3.init(servletConfig6);
        recommendServlet0.init(servletConfig6);
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet9 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet batchSetPreferencesServlet10 = new org.plista.kornakapi.web.servlets.BatchSetPreferencesServlet();
        batchSetPreferencesServlet9.init((javax.servlet.ServletConfig) batchSetPreferencesServlet10);
        javax.servlet.ServletConfig servletConfig12 = batchSetPreferencesServlet9.getServletConfig();
        batchSetPreferencesServlet9.destroy();
        javax.servlet.ServletConfig servletConfig14 = batchSetPreferencesServlet9.getServletConfig();
        batchSetPreferencesServlet9.init();
        recommendServlet0.init((javax.servlet.ServletConfig) batchSetPreferencesServlet9);
        javax.servlet.ServletConfig servletConfig17 = batchSetPreferencesServlet9.getServletConfig();
        batchSetPreferencesServlet9.init();
        java.lang.String str19 = batchSetPreferencesServlet9.getServletInfo();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(servletConfig12);
        org.junit.Assert.assertNotNull(servletConfig14);
        org.junit.Assert.assertNotNull(servletConfig17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test39682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39682");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration0.getStorageConfiguration();
        int int4 = configuration0.getNumProcessorsForTraining();
        configuration0.setNumProcessorsForTraining((int) (short) 10);
        java.lang.String str7 = configuration0.getModelDirectory();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList8 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig9 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double10 = factorizationbasedRecommenderConfig9.getAlpha();
        double double11 = factorizationbasedRecommenderConfig9.getLambda();
        int int12 = factorizationbasedRecommenderConfig9.getNumberOfFeatures();
        factorizationbasedRecommenderConfig9.setUsesImplicitFeedback(false);
        int int15 = factorizationbasedRecommenderConfig9.getNumberOfFeatures();
        factorizationbasedRecommenderConfig9.setLambda((double) 0);
        factorizationbasedRecommenderConfig9.setName("userID");
        factorizationbasedRecommenderConfig9.setRetrainCronExpression("org.plista.kornakapi.web.MissingParameterException: itemID");
        factorizationbasedRecommenderConfig9.setAlpha((double) 0L);
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig9);
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList25 = configuration0.getFactorizationbasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList26 = configuration0.getItembasedRecommenders();
        java.lang.String str27 = configuration0.getModelDirectory();
        configuration0.setModelDirectory("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        configuration0.setNumProcessorsForTraining((int) '4');
        org.plista.kornakapi.core.storage.Storage storage32 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.KornakapiRecommender> strMap33 = null;
        java.util.Map<java.lang.String, org.plista.kornakapi.core.training.Trainer> strMap34 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler35 = null;
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler36 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener39 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler36, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (int) (byte) 10);
        inMemoryPreferenceChangeListener39.notifyOfPreferenceChange();
        // The following exception was thrown during execution in test generation
        try {
            org.plista.kornakapi.web.Components.init(configuration0, storage32, strMap33, strMap34, trainingScheduler35, (org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(storageConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList25);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test39683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39683");
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration0 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str1 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str4 = storageConfiguration0.getJdbcUrl();
        java.lang.String str5 = storageConfiguration0.getJdbcDriverClass();
        storageConfiguration0.setJdbcDriverClass("batchSize");
        storageConfiguration0.setPassword("howMany");
        storageConfiguration0.setJdbcUrl("hi!");
        java.lang.String str12 = storageConfiguration0.getPassword();
        java.lang.String str13 = storageConfiguration0.getUsername();
        java.lang.String str14 = storageConfiguration0.getUsername();
        storageConfiguration0.setJdbcDriverClass("batchSize");
        storageConfiguration0.setPassword("MutablePreference{userID=1, itemID=52, value=52.0}");
        storageConfiguration0.setJdbcUrl("label");
        java.lang.String str21 = storageConfiguration0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "howMany" + "'", str12, "howMany");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str13, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName" + "'", str14, "org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "label" + "'", str21, "label");
    }

    @Test
    public void test39684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39684");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        boolean boolean8 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (byte) 0);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) ' ');
        factorizationbasedRecommenderConfig0.setNumberOfIterations(52);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer15 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test39685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39685");
        org.plista.kornakapi.web.MissingParameterException missingParameterException5 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException6 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException5);
        java.lang.Throwable[] throwableArray7 = missingParameterException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = missingParameterException5.getSuppressed();
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException9 = new org.plista.kornakapi.web.InvalidParameterException("userID", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException10 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=0, itemID=-1, value=32.0}", (java.lang.Throwable) missingParameterException5);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException11 = new org.plista.kornakapi.web.InvalidParameterException("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=-1, itemID=10, value=10.0}", (java.lang.Throwable) invalidParameterException10);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test39686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39686");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration1.getItembasedRecommenders();
        java.lang.String str3 = configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig4 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double5 = factorizationbasedRecommenderConfig4.getAlpha();
        double double6 = factorizationbasedRecommenderConfig4.getLambda();
        int int7 = factorizationbasedRecommenderConfig4.getNumberOfFeatures();
        factorizationbasedRecommenderConfig4.setNumberOfIterations(0);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig4);
        configuration1.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig4);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList12 = configuration1.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration13 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str14 = storageConfiguration13.getJdbcDriverClass();
        storageConfiguration13.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str17 = storageConfiguration13.getJdbcUrl();
        java.lang.String str18 = storageConfiguration13.getJdbcDriverClass();
        java.lang.String str19 = storageConfiguration13.getJdbcDriverClass();
        java.lang.String str20 = storageConfiguration13.getPassword();
        java.lang.String str21 = storageConfiguration13.getJdbcDriverClass();
        configuration1.setStorageConfiguration(storageConfiguration13);
        configuration1.setModelDirectory("value");
        org.plista.kornakapi.web.Components components25 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration26 = components25.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration27 = components25.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage28 = components25.storage();
        org.plista.kornakapi.core.storage.Storage storage29 = components25.storage();
        org.plista.kornakapi.core.config.Configuration configuration30 = components25.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig31 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double32 = factorizationbasedRecommenderConfig31.getAlpha();
        double double33 = factorizationbasedRecommenderConfig31.getLambda();
        int int34 = factorizationbasedRecommenderConfig31.getNumberOfFeatures();
        factorizationbasedRecommenderConfig31.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig31.setNumberOfFeatures((int) (short) 100);
        boolean boolean39 = factorizationbasedRecommenderConfig31.isUsesImplicitFeedback();
        configuration30.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig31);
        org.plista.kornakapi.web.Components components41 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration42 = components41.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler43 = components41.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler44 = components41.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration45 = components41.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration46 = components41.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig47 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig47.setSimilarityClass("");
        java.lang.String str50 = itembasedRecommenderConfig47.getName();
        java.lang.String str51 = itembasedRecommenderConfig47.getSimilarityClass();
        itembasedRecommenderConfig47.setName("");
        java.lang.String str54 = itembasedRecommenderConfig47.getSimilarityClass();
        configuration46.addItembasedRecommender(itembasedRecommenderConfig47);
        itembasedRecommenderConfig47.setSimilarItemsPerItem((int) (byte) 1);
        configuration30.addItembasedRecommender(itembasedRecommenderConfig47);
        java.lang.String str59 = configuration30.getModelDirectory();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig60 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str61 = itembasedRecommenderConfig60.getRetrainCronExpression();
        int int62 = itembasedRecommenderConfig60.getRetrainAfterPreferenceChanges();
        java.lang.String str63 = itembasedRecommenderConfig60.getSimilarityClass();
        itembasedRecommenderConfig60.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig60.setSimilarityClass("");
        int int68 = itembasedRecommenderConfig60.getSimilarItemsPerItem();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer69 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig60);
        configuration30.addItembasedRecommender(itembasedRecommenderConfig60);
        configuration1.addItembasedRecommender(itembasedRecommenderConfig60);
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration72 = configuration1.getStorageConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList73 = configuration1.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig> factorizationbasedRecommenderConfigList74 = configuration1.getFactorizationbasedRecommenders();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=32, itemID=32, value=97.0}" + "'", str3, "MutablePreference{userID=32, itemID=32, value=97.0}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(components25);
        org.junit.Assert.assertNotNull(configuration26);
        org.junit.Assert.assertNotNull(configuration27);
        org.junit.Assert.assertNull(storage28);
        org.junit.Assert.assertNull(storage29);
        org.junit.Assert.assertNotNull(configuration30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(components41);
        org.junit.Assert.assertNotNull(configuration42);
        org.junit.Assert.assertNull(trainingScheduler43);
        org.junit.Assert.assertNull(trainingScheduler44);
        org.junit.Assert.assertNotNull(configuration45);
        org.junit.Assert.assertNotNull(configuration46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "value" + "'", str59, "value");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(storageConfiguration72);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList73);
        org.junit.Assert.assertNotNull(factorizationbasedRecommenderConfigList74);
    }

    @Test
    public void test39687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39687");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        java.lang.String str1 = mutablePreference0.toString();
        long long2 = mutablePreference0.getItemID();
        java.lang.String str3 = mutablePreference0.toString();
        mutablePreference0.set((long) (byte) 100, (long) (byte) 0, (float) (short) 0);
        mutablePreference0.setValue((float) 35);
        long long10 = mutablePreference0.getItemID();
        mutablePreference0.setValue((float) (byte) 1);
        mutablePreference0.setValue((float) 100L);
        long long15 = mutablePreference0.getUserID();
        long long16 = mutablePreference0.getItemID();
        mutablePreference0.set((long) (short) 100, (long) (byte) 100, (float) 10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str1, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str3, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test39688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39688");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double8 = fixedCandidatesIDRescorer1.rescore(10L, (double) 10L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer9 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double12 = fixedCandidatesIDRescorer1.rescore((long) (short) 10, (double) 10);
        double double15 = fixedCandidatesIDRescorer1.rescore((long) 1, (double) (-1));
        double double18 = fixedCandidatesIDRescorer1.rescore((long) (byte) 10, 52.0d);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer19 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        double double22 = fixedCandidatesIDRescorer1.rescore(35L, (double) 97L);
        double double25 = fixedCandidatesIDRescorer1.rescore((long) (-1), (double) (-1));
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer26 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test39689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39689");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.lang.String str2 = configuration0.getModelDirectory();
        configuration0.setNumProcessorsForTraining((int) '#');
        java.lang.String str5 = configuration0.getModelDirectory();
        int int6 = configuration0.getNumProcessorsForTraining();
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test39690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39690");
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
        java.lang.Throwable[] throwableArray26 = missingParameterException17.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException31 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException32 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException31);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException33 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException31);
        org.plista.kornakapi.web.MissingParameterException missingParameterException35 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException37 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException35.addSuppressed((java.lang.Throwable) missingParameterException37);
        invalidParameterException33.addSuppressed((java.lang.Throwable) missingParameterException37);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException40 = new org.plista.kornakapi.web.InvalidParameterException("file", (java.lang.Throwable) invalidParameterException33);
        org.plista.kornakapi.web.MissingParameterException missingParameterException44 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException45 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException44);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException46 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException44);
        invalidParameterException40.addSuppressed((java.lang.Throwable) missingParameterException44);
        org.plista.kornakapi.web.MissingParameterException missingParameterException50 = new org.plista.kornakapi.web.MissingParameterException("MutablePreference{userID=100, itemID=0, value=0.0}");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException51 = new org.plista.kornakapi.web.InvalidParameterException("label", (java.lang.Throwable) missingParameterException50);
        missingParameterException44.addSuppressed((java.lang.Throwable) invalidParameterException51);
        java.lang.Throwable[] throwableArray53 = missingParameterException44.getSuppressed();
        java.lang.Throwable[] throwableArray54 = missingParameterException44.getSuppressed();
        missingParameterException17.addSuppressed((java.lang.Throwable) missingParameterException44);
        java.lang.Throwable[] throwableArray56 = missingParameterException44.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException59 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: recommender");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException60 = new org.plista.kornakapi.web.InvalidParameterException("", (java.lang.Throwable) missingParameterException59);
        missingParameterException44.addSuppressed((java.lang.Throwable) invalidParameterException60);
        java.lang.Throwable[] throwableArray62 = missingParameterException44.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test39691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39691");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage3 = components0.storage();
        org.plista.kornakapi.core.storage.Storage storage4 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration5 = components0.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage6 = components0.storage();
        org.plista.kornakapi.core.config.Configuration configuration7 = components0.getConfiguration();
        java.lang.String str8 = configuration7.getModelDirectory();
        java.lang.String str9 = configuration7.getModelDirectory();
        configuration7.setModelDirectory("MutablePreference{userID=-1, itemID=10, value=-1.0}");
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(storage3);
        org.junit.Assert.assertNull(storage4);
        org.junit.Assert.assertNotNull(configuration5);
        org.junit.Assert.assertNull(storage6);
        org.junit.Assert.assertNotNull(configuration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "value" + "'", str8, "value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "value" + "'", str9, "value");
    }

    @Test
    public void test39692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39692");
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
        java.lang.String str11 = configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig12 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str13 = itembasedRecommenderConfig12.getRetrainCronExpression();
        int int14 = itembasedRecommenderConfig12.getRetrainAfterPreferenceChanges();
        java.lang.String str15 = itembasedRecommenderConfig12.getSimilarityClass();
        itembasedRecommenderConfig12.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig12.setRetrainCronExpression("value");
        int int20 = itembasedRecommenderConfig12.getRetrainAfterPreferenceChanges();
        int int21 = itembasedRecommenderConfig12.getRetrainAfterPreferenceChanges();
        itembasedRecommenderConfig12.setSimilarItemsPerItem((int) (short) 1);
        java.lang.String str24 = itembasedRecommenderConfig12.getRetrainCronExpression();
        configuration1.addItembasedRecommender(itembasedRecommenderConfig12);
        itembasedRecommenderConfig12.setSimilarityClass("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        itembasedRecommenderConfig12.setName("MutablePreference{userID=10, itemID=100, value=10000.0}");
        itembasedRecommenderConfig12.setSimilarityClass("org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=-1, itemID=10, value=10.0}");
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=-1.0}" + "'", str11, "MutablePreference{userID=-1, itemID=10, value=-1.0}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "value" + "'", str24, "value");
    }

    @Test
    public void test39693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39693");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        double double5 = factorizationbasedRecommenderConfig0.getAlpha();
        boolean boolean6 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (short) 10);
        java.lang.String str11 = factorizationbasedRecommenderConfig0.getName();
        java.lang.String str12 = factorizationbasedRecommenderConfig0.getName();
        boolean boolean13 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test39694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39694");
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener0 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener0.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener2 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener2.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener2);
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener5 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener5.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener7 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener5.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener7);
        delegatingPreferenceChangeListener7.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler12 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener15 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler12, "label", (int) ' ');
        delegatingPreferenceChangeListener7.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener15);
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener7);
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener18 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener18.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener20 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener20.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener18.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener20);
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener23 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener23.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener25 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener25.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener25.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener23.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener25);
        delegatingPreferenceChangeListener25.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler30 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener33 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler30, "label", (int) ' ');
        delegatingPreferenceChangeListener25.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener33);
        delegatingPreferenceChangeListener18.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener25);
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener36 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener36.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener38 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener38.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener36.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener38);
        delegatingPreferenceChangeListener38.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener38.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener43 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener43.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener45 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener45.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener45.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener43.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener45);
        delegatingPreferenceChangeListener45.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener38.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener45);
        delegatingPreferenceChangeListener38.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener38.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener53 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener53.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener55 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener55.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener53.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener55);
        delegatingPreferenceChangeListener55.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener55.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener60 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener60.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener delegatingPreferenceChangeListener62 = new org.plista.kornakapi.core.training.preferencechanges.DelegatingPreferenceChangeListener();
        delegatingPreferenceChangeListener62.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener62.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener60.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener62);
        delegatingPreferenceChangeListener62.notifyOfPreferenceChange();
        delegatingPreferenceChangeListener55.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener62);
        delegatingPreferenceChangeListener38.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener55);
        delegatingPreferenceChangeListener25.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener38);
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) delegatingPreferenceChangeListener25);
        delegatingPreferenceChangeListener0.notifyOfPreferenceChange();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler72 = null;
        org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener inMemoryPreferenceChangeListener75 = new org.plista.kornakapi.core.training.preferencechanges.InMemoryPreferenceChangeListener(trainingScheduler72, "org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.MissingParameterException: MutablePreference{userID=-1, itemID=0, value=97.0}", (int) (short) 1);
        delegatingPreferenceChangeListener0.addDelegate((org.plista.kornakapi.core.training.preferencechanges.PreferenceChangeListener) inMemoryPreferenceChangeListener75);
    }

    @Test
    public void test39695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39695");
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet0 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet1 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet2 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet1.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        setPreferenceServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet2);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet5 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet0.init((javax.servlet.ServletConfig) recommendServlet5);
        java.lang.String str7 = setPreferenceServlet0.getServletInfo();
        java.lang.String str8 = setPreferenceServlet0.getServletInfo();
        java.lang.String str9 = setPreferenceServlet0.getServletInfo();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test39696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39696");
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
        double double17 = filteringLongPairRescorer5.rescore(longPair15, (double) 32);
        org.apache.mahout.common.LongPair longPair18 = null;
        double double20 = filteringLongPairRescorer5.rescore(longPair18, (double) 0.0f);
        org.apache.mahout.common.LongPair longPair21 = null;
        double double23 = filteringLongPairRescorer5.rescore(longPair21, (double) 10000);
        org.apache.mahout.common.LongPair longPair24 = null;
        double double26 = filteringLongPairRescorer5.rescore(longPair24, (double) 0);
        org.apache.mahout.common.LongPair longPair27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = filteringLongPairRescorer5.isFiltered(longPair27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10000.0d + "'", double23 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test39697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39697");
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
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet14 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet15 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str16 = batchDeleteCandidatesServlet15.getServletInfo();
        java.lang.String str17 = batchDeleteCandidatesServlet15.getServletInfo();
        org.plista.kornakapi.web.servlets.SetPreferenceServlet setPreferenceServlet18 = new org.plista.kornakapi.web.servlets.SetPreferenceServlet();
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet19 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet20 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        recommendServlet19.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet20);
        setPreferenceServlet18.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet20);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet23 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        setPreferenceServlet18.init((javax.servlet.ServletConfig) recommendServlet23);
        batchDeleteCandidatesServlet15.init((javax.servlet.ServletConfig) setPreferenceServlet18);
        batchDeleteCandidatesServlet15.destroy();
        batchDeleteCandidatesServlet14.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet15);
        org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet batchDeleteCandidatesServlet28 = new org.plista.kornakapi.web.servlets.BatchDeleteCandidatesServlet();
        java.lang.String str29 = batchDeleteCandidatesServlet28.getServletInfo();
        batchDeleteCandidatesServlet28.destroy();
        javax.servlet.ServletConfig servletConfig31 = batchDeleteCandidatesServlet28.getServletConfig();
        batchDeleteCandidatesServlet14.init(servletConfig31);
        org.plista.kornakapi.web.servlets.RecommendServlet recommendServlet33 = new org.plista.kornakapi.web.servlets.RecommendServlet();
        java.lang.String str34 = recommendServlet33.getServletInfo();
        batchDeleteCandidatesServlet14.init((javax.servlet.ServletConfig) recommendServlet33);
        batchDeleteCandidatesServlet14.destroy();
        batchDeleteCandidatesServlet0.init((javax.servlet.ServletConfig) batchDeleteCandidatesServlet14);
        batchDeleteCandidatesServlet14.destroy();
        org.plista.kornakapi.web.MissingParameterException missingParameterException45 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException46 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException45);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException47 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException45);
        org.plista.kornakapi.web.MissingParameterException missingParameterException49 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException51 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException49.addSuppressed((java.lang.Throwable) missingParameterException51);
        invalidParameterException47.addSuppressed((java.lang.Throwable) missingParameterException51);
        java.lang.Throwable[] throwableArray54 = missingParameterException51.getSuppressed();
        org.plista.kornakapi.web.MissingParameterException missingParameterException57 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException58 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException57);
        org.plista.kornakapi.web.MissingParameterException missingParameterException62 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException63 = new org.plista.kornakapi.web.InvalidParameterException("howMany", (java.lang.Throwable) missingParameterException62);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException64 = new org.plista.kornakapi.web.InvalidParameterException("hi!", (java.lang.Throwable) missingParameterException62);
        org.plista.kornakapi.web.MissingParameterException missingParameterException66 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        org.plista.kornakapi.web.MissingParameterException missingParameterException68 = new org.plista.kornakapi.web.MissingParameterException("itemID");
        missingParameterException66.addSuppressed((java.lang.Throwable) missingParameterException68);
        invalidParameterException64.addSuppressed((java.lang.Throwable) missingParameterException68);
        java.lang.Throwable[] throwableArray71 = missingParameterException68.getSuppressed();
        invalidParameterException58.addSuppressed((java.lang.Throwable) missingParameterException68);
        missingParameterException51.addSuppressed((java.lang.Throwable) invalidParameterException58);
        org.plista.kornakapi.web.MissingParameterException missingParameterException75 = new org.plista.kornakapi.web.MissingParameterException("org.plista.kornakapi.web.InvalidParameterException: howMany");
        invalidParameterException58.addSuppressed((java.lang.Throwable) missingParameterException75);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException77 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=0, itemID=0, value=-1.0}", (java.lang.Throwable) missingParameterException75);
        org.plista.kornakapi.web.InvalidParameterException invalidParameterException78 = new org.plista.kornakapi.web.InvalidParameterException("MutablePreference{userID=0, itemID=10000, value=0.0}", (java.lang.Throwable) missingParameterException75);
        // The following exception was thrown during execution in test generation
        try {
            batchDeleteCandidatesServlet14.log("org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.web.MissingParameterException: org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName", (java.lang.Throwable) invalidParameterException78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(servletConfig31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray71);
    }

    @Test
    public void test39698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39698");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        int int5 = factorizationbasedRecommenderConfig0.getNumberOfFeatures();
        factorizationbasedRecommenderConfig0.setUsesImplicitFeedback(true);
        factorizationbasedRecommenderConfig0.setNumberOfIterations((int) (short) -1);
        factorizationbasedRecommenderConfig0.setNumberOfIterations(10);
        factorizationbasedRecommenderConfig0.setAlpha((double) 97.0f);
        factorizationbasedRecommenderConfig0.setRetrainAfterPreferenceChanges((int) (short) -1);
        factorizationbasedRecommenderConfig0.setAlpha(52.0d);
        double double18 = factorizationbasedRecommenderConfig0.getAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test39699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39699");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration0.getStorageConfiguration();
        int int4 = configuration0.getNumProcessorsForTraining();
        configuration0.setNumProcessorsForTraining((int) (short) 10);
        java.lang.String str7 = configuration0.getModelDirectory();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList8 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig9 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double10 = factorizationbasedRecommenderConfig9.getAlpha();
        double double11 = factorizationbasedRecommenderConfig9.getLambda();
        int int12 = factorizationbasedRecommenderConfig9.getNumberOfFeatures();
        factorizationbasedRecommenderConfig9.setUsesImplicitFeedback(false);
        int int15 = factorizationbasedRecommenderConfig9.getNumberOfFeatures();
        factorizationbasedRecommenderConfig9.setLambda((double) 0);
        factorizationbasedRecommenderConfig9.setName("userID");
        factorizationbasedRecommenderConfig9.setRetrainCronExpression("org.plista.kornakapi.web.MissingParameterException: itemID");
        factorizationbasedRecommenderConfig9.setAlpha((double) 0L);
        configuration0.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig9);
        factorizationbasedRecommenderConfig9.setRetrainCronExpression("MutablePreference{userID=52, itemID=32, value=0.0}");
        java.lang.String str27 = factorizationbasedRecommenderConfig9.getName();
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(storageConfiguration3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "userID" + "'", str27, "userID");
    }

    @Test
    public void test39700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39700");
        org.plista.kornakapi.core.MutableCandidate mutableCandidate0 = new org.plista.kornakapi.core.MutableCandidate();
        long long1 = mutableCandidate0.getItemID();
        mutableCandidate0.set("itemIDs", (long) 0);
        mutableCandidate0.set("itemID", (long) 10000);
        java.lang.String str8 = mutableCandidate0.getLabel();
        mutableCandidate0.set("org.plista.kornakapi.web.MissingParameterException: itemID", (long) '#');
        java.lang.String str12 = mutableCandidate0.getLabel();
        java.lang.String str13 = mutableCandidate0.getLabel();
        java.lang.String str14 = mutableCandidate0.getLabel();
        long long15 = mutableCandidate0.getItemID();
        java.lang.String str16 = mutableCandidate0.getLabel();
        mutableCandidate0.set("value", (long) '#');
        java.lang.String str20 = mutableCandidate0.getLabel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "itemID" + "'", str8, "itemID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str12, "org.plista.kornakapi.web.MissingParameterException: itemID");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str13, "org.plista.kornakapi.web.MissingParameterException: itemID");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str14, "org.plista.kornakapi.web.MissingParameterException: itemID");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.plista.kornakapi.web.MissingParameterException: itemID" + "'", str16, "org.plista.kornakapi.web.MissingParameterException: itemID");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "value" + "'", str20, "value");
    }

    @Test
    public void test39701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39701");
        org.plista.kornakapi.core.config.Configuration configuration0 = new org.plista.kornakapi.core.config.Configuration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList1 = configuration0.getItembasedRecommenders();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration3 = configuration0.getStorageConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList4 = configuration0.getItembasedRecommenders();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig5 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig5.setSimilarityClass("");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer8 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig5);
        itembasedRecommenderConfig5.setRetrainCronExpression("");
        itembasedRecommenderConfig5.setSimilarItemsPerItem(10);
        java.lang.String str13 = itembasedRecommenderConfig5.getName();
        java.lang.String str14 = itembasedRecommenderConfig5.getSimilarityClass();
        configuration0.addItembasedRecommender(itembasedRecommenderConfig5);
        java.lang.String str16 = itembasedRecommenderConfig5.getSimilarityClass();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer17 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig5);
        java.io.File file18 = null;
        org.plista.kornakapi.core.storage.Storage storage19 = null;
        org.apache.mahout.cf.taste.recommender.Recommender recommender20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multithreadedItembasedInMemoryTrainer17.train(file18, storage19, recommender20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertNull(storageConfiguration3);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test39702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39702");
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
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration11 = configuration0.getStorageConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig12 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str13 = itembasedRecommenderConfig12.getSimilarityClass();
        int int14 = itembasedRecommenderConfig12.getSimilarItemsPerItem();
        itembasedRecommenderConfig12.setSimilarItemsPerItem(1);
        configuration0.addItembasedRecommender(itembasedRecommenderConfig12);
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig18 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig18.setSimilarityClass("");
        java.lang.String str21 = itembasedRecommenderConfig18.getSimilarityClass();
        itembasedRecommenderConfig18.setRetrainCronExpression("userID");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer24 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig18);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer25 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig18);
        configuration0.addItembasedRecommender(itembasedRecommenderConfig18);
        itembasedRecommenderConfig18.setSimilarItemsPerItem((int) (byte) 0);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer29 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig18);
        itembasedRecommenderConfig18.setName("MutablePreference{userID=32, itemID=100, value=52.0}");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList9);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList10);
        org.junit.Assert.assertNull(storageConfiguration11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test39703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39703");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration2 = components0.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler3 = components0.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration4 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList5 = configuration4.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration6 = configuration4.getStorageConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig7 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str8 = itembasedRecommenderConfig7.getRetrainCronExpression();
        int int9 = itembasedRecommenderConfig7.getRetrainAfterPreferenceChanges();
        java.lang.String str10 = itembasedRecommenderConfig7.getSimilarityClass();
        itembasedRecommenderConfig7.setSimilarityClass("MutablePreference{userID=100, itemID=0, value=0.0}");
        itembasedRecommenderConfig7.setSimilarityClass("MutablePreference{userID=0, itemID=0, value=0.0}");
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer15 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        configuration4.addItembasedRecommender(itembasedRecommenderConfig7);
        itembasedRecommenderConfig7.setName("itemID");
        java.lang.String str19 = itembasedRecommenderConfig7.getSimilarityClass();
        int int20 = itembasedRecommenderConfig7.getSimilarItemsPerItem();
        itembasedRecommenderConfig7.setRetrainAfterPreferenceChanges(35);
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer23 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig7);
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(configuration2);
        org.junit.Assert.assertNull(trainingScheduler3);
        org.junit.Assert.assertNotNull(configuration4);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList5);
        org.junit.Assert.assertNotNull(storageConfiguration6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MutablePreference{userID=0, itemID=0, value=0.0}" + "'", str19, "MutablePreference{userID=0, itemID=0, value=0.0}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test39704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39704");
        org.plista.kornakapi.core.MutablePreference mutablePreference0 = new org.plista.kornakapi.core.MutablePreference();
        long long1 = mutablePreference0.getItemID();
        mutablePreference0.setValue((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test39705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39705");
        org.plista.kornakapi.web.Components components0 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration1 = components0.getConfiguration();
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList2 = configuration1.getItembasedRecommenders();
        java.lang.String str3 = configuration1.getModelDirectory();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig4 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double5 = factorizationbasedRecommenderConfig4.getAlpha();
        double double6 = factorizationbasedRecommenderConfig4.getLambda();
        int int7 = factorizationbasedRecommenderConfig4.getNumberOfFeatures();
        factorizationbasedRecommenderConfig4.setNumberOfIterations(0);
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer10 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig4);
        configuration1.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig4);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList12 = configuration1.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration13 = new org.plista.kornakapi.core.config.StorageConfiguration();
        java.lang.String str14 = storageConfiguration13.getJdbcDriverClass();
        storageConfiguration13.setUsername("org.plista.kornakapi.core.training.TrainRecommenderJob.recommenderName");
        java.lang.String str17 = storageConfiguration13.getJdbcUrl();
        java.lang.String str18 = storageConfiguration13.getJdbcDriverClass();
        java.lang.String str19 = storageConfiguration13.getJdbcDriverClass();
        java.lang.String str20 = storageConfiguration13.getPassword();
        java.lang.String str21 = storageConfiguration13.getJdbcDriverClass();
        configuration1.setStorageConfiguration(storageConfiguration13);
        configuration1.setModelDirectory("value");
        org.plista.kornakapi.web.Components components25 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration26 = components25.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration27 = components25.getConfiguration();
        org.plista.kornakapi.core.storage.Storage storage28 = components25.storage();
        org.plista.kornakapi.core.storage.Storage storage29 = components25.storage();
        org.plista.kornakapi.core.config.Configuration configuration30 = components25.getConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig31 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double32 = factorizationbasedRecommenderConfig31.getAlpha();
        double double33 = factorizationbasedRecommenderConfig31.getLambda();
        int int34 = factorizationbasedRecommenderConfig31.getNumberOfFeatures();
        factorizationbasedRecommenderConfig31.setNumberOfIterations(0);
        factorizationbasedRecommenderConfig31.setNumberOfFeatures((int) (short) 100);
        boolean boolean39 = factorizationbasedRecommenderConfig31.isUsesImplicitFeedback();
        configuration30.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig31);
        org.plista.kornakapi.web.Components components41 = org.plista.kornakapi.web.Components.instance();
        org.plista.kornakapi.core.config.Configuration configuration42 = components41.getConfiguration();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler43 = components41.scheduler();
        org.plista.kornakapi.core.training.TrainingScheduler trainingScheduler44 = components41.scheduler();
        org.plista.kornakapi.core.config.Configuration configuration45 = components41.getConfiguration();
        org.plista.kornakapi.core.config.Configuration configuration46 = components41.getConfiguration();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig47 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        itembasedRecommenderConfig47.setSimilarityClass("");
        java.lang.String str50 = itembasedRecommenderConfig47.getName();
        java.lang.String str51 = itembasedRecommenderConfig47.getSimilarityClass();
        itembasedRecommenderConfig47.setName("");
        java.lang.String str54 = itembasedRecommenderConfig47.getSimilarityClass();
        configuration46.addItembasedRecommender(itembasedRecommenderConfig47);
        itembasedRecommenderConfig47.setSimilarItemsPerItem((int) (byte) 1);
        configuration30.addItembasedRecommender(itembasedRecommenderConfig47);
        java.lang.String str59 = configuration30.getModelDirectory();
        org.plista.kornakapi.core.config.ItembasedRecommenderConfig itembasedRecommenderConfig60 = new org.plista.kornakapi.core.config.ItembasedRecommenderConfig();
        java.lang.String str61 = itembasedRecommenderConfig60.getRetrainCronExpression();
        int int62 = itembasedRecommenderConfig60.getRetrainAfterPreferenceChanges();
        java.lang.String str63 = itembasedRecommenderConfig60.getSimilarityClass();
        itembasedRecommenderConfig60.setSimilarItemsPerItem(0);
        itembasedRecommenderConfig60.setSimilarityClass("");
        int int68 = itembasedRecommenderConfig60.getSimilarItemsPerItem();
        org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer multithreadedItembasedInMemoryTrainer69 = new org.plista.kornakapi.core.training.MultithreadedItembasedInMemoryTrainer(itembasedRecommenderConfig60);
        configuration30.addItembasedRecommender(itembasedRecommenderConfig60);
        configuration1.addItembasedRecommender(itembasedRecommenderConfig60);
        java.util.List<org.plista.kornakapi.core.config.ItembasedRecommenderConfig> itembasedRecommenderConfigList72 = configuration1.getItembasedRecommenders();
        org.plista.kornakapi.core.config.StorageConfiguration storageConfiguration73 = configuration1.getStorageConfiguration();
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig74 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double75 = factorizationbasedRecommenderConfig74.getAlpha();
        double double76 = factorizationbasedRecommenderConfig74.getLambda();
        boolean boolean77 = factorizationbasedRecommenderConfig74.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer78 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig74);
        int int79 = factorizationbasedRecommenderConfig74.getNumberOfFeatures();
        factorizationbasedRecommenderConfig74.setAlpha(100.0d);
        factorizationbasedRecommenderConfig74.setNumberOfIterations((int) (byte) 10);
        factorizationbasedRecommenderConfig74.setRetrainCronExpression("file");
        java.lang.String str86 = factorizationbasedRecommenderConfig74.getRetrainCronExpression();
        configuration1.addFactorizationbasedRecommender(factorizationbasedRecommenderConfig74);
        java.lang.String str88 = factorizationbasedRecommenderConfig74.getName();
        factorizationbasedRecommenderConfig74.setName("MutablePreference{userID=0, itemID=0, value=-1.0}");
        boolean boolean91 = factorizationbasedRecommenderConfig74.isUsesImplicitFeedback();
        org.junit.Assert.assertNotNull(components0);
        org.junit.Assert.assertNotNull(configuration1);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MutablePreference{userID=-1, itemID=10, value=-1.0}" + "'", str3, "MutablePreference{userID=-1, itemID=10, value=-1.0}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(components25);
        org.junit.Assert.assertNotNull(configuration26);
        org.junit.Assert.assertNotNull(configuration27);
        org.junit.Assert.assertNull(storage28);
        org.junit.Assert.assertNull(storage29);
        org.junit.Assert.assertNotNull(configuration30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(components41);
        org.junit.Assert.assertNotNull(configuration42);
        org.junit.Assert.assertNull(trainingScheduler43);
        org.junit.Assert.assertNull(trainingScheduler44);
        org.junit.Assert.assertNotNull(configuration45);
        org.junit.Assert.assertNotNull(configuration46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "value" + "'", str59, "value");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(itembasedRecommenderConfigList72);
        org.junit.Assert.assertNotNull(storageConfiguration73);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "file" + "'", str86, "file");
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test39706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39706");
        org.apache.mahout.cf.taste.impl.common.FastIDSet fastIDSet0 = null;
        org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer fixedCandidatesIDRescorer1 = new org.plista.kornakapi.core.recommender.FixedCandidatesIDRescorer(fastIDSet0);
        double double4 = fixedCandidatesIDRescorer1.rescore((-1L), (double) 0L);
        org.plista.kornakapi.core.recommender.FilteringLongPairRescorer filteringLongPairRescorer5 = new org.plista.kornakapi.core.recommender.FilteringLongPairRescorer((org.apache.mahout.cf.taste.recommender.IDRescorer) fixedCandidatesIDRescorer1);
        org.apache.mahout.common.LongPair longPair6 = null;
        double double8 = filteringLongPairRescorer5.rescore(longPair6, (double) 0);
        org.apache.mahout.common.LongPair longPair9 = null;
        double double11 = filteringLongPairRescorer5.rescore(longPair9, (double) 0);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test39707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39707");
        org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig factorizationbasedRecommenderConfig0 = new org.plista.kornakapi.core.config.FactorizationbasedRecommenderConfig();
        double double1 = factorizationbasedRecommenderConfig0.getAlpha();
        double double2 = factorizationbasedRecommenderConfig0.getLambda();
        boolean boolean3 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer4 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        double double5 = factorizationbasedRecommenderConfig0.getAlpha();
        org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer factorizationbasedInMemoryTrainer6 = new org.plista.kornakapi.core.training.FactorizationbasedInMemoryTrainer(factorizationbasedRecommenderConfig0);
        int int7 = factorizationbasedRecommenderConfig0.getRetrainAfterPreferenceChanges();
        factorizationbasedRecommenderConfig0.setNumberOfFeatures((int) (byte) 100);
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("MutablePreference{userID=1, itemID=-1, value=10.0}");
        factorizationbasedRecommenderConfig0.setRetrainCronExpression("org.plista.kornakapi.web.InvalidParameterException: MutablePreference{userID=0, itemID=0, value=1.0}");
        boolean boolean14 = factorizationbasedRecommenderConfig0.isUsesImplicitFeedback();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}
