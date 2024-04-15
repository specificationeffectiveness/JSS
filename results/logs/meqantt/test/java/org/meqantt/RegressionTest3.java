package org.meqantt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        boolean boolean10 = connectMessage9.isWillRetained();
        boolean boolean11 = connectMessage9.isWillRetained();
        java.lang.String str12 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage9.setWill("hi!", "", qoS21, false);
        connectMessage3.setWill("MQIsdp", "hi!", qoS21, false);
        java.lang.String str27 = connectMessage3.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MQIsdp" + "'", str27, "MQIsdp");
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '\001');
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("", "\000\003hi!");
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS2 = unsubscribeMessage1.getQos();
        boolean boolean3 = unsubscribeMessage1.isRetained();
        org.meqantt.message.QoS qoS4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 1);
        org.meqantt.message.QoS qoS2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        org.meqantt.message.QoS qoS8 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        subscribeMessage9.addTopic("", qoS13);
        connectMessage3.setWill("", "\000d\000\001\001d", qoS13, true);
        boolean boolean17 = connectMessage3.isCleanSession();
        java.lang.String str18 = connectMessage3.getClientId();
        java.lang.String str19 = connectMessage3.getPassword();
        java.lang.String str20 = connectMessage3.getWill();
        byte[] byteArray21 = connectMessage3.toBytes();
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.write(outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000d\000\001\001d" + "'", str20, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        unsubscribeMessage1.setDup(false);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage6.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        subAckMessage6.addQoS(qoS13);
        org.meqantt.message.QoS qoS16 = subAckMessage6.getQos();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str14 = connectMessage13.getProtocolId();
        org.meqantt.message.QoS qoS15 = connectMessage13.getQos();
        subAckMessage7.addQoS(qoS15);
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean21 = connectMessage20.hasWill();
        java.lang.String str22 = connectMessage20.getWill();
        org.meqantt.message.Message.Header header25 = null;
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage(header25);
        boolean boolean27 = connectMessage26.isWillRetained();
        boolean boolean28 = connectMessage26.isWillRetained();
        java.lang.String str29 = connectMessage26.getUsername();
        org.meqantt.message.QoS qoS33 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList37 = subscribeMessage36.getTopics();
        org.meqantt.message.QoS qoS38 = subscribeMessage36.getQos();
        subscribeMessage34.addTopic("", qoS38);
        connectMessage26.setWill("hi!", "", qoS38, false);
        connectMessage20.setWill("MQIsdp", "hi!", qoS38, false);
        org.meqantt.message.SubAckMessage subAckMessage46 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList47 = subAckMessage46.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList48 = subAckMessage46.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList49 = subAckMessage46.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList52 = subscribeMessage51.getTopics();
        org.meqantt.message.QoS qoS53 = subscribeMessage51.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage("", qoS53);
        subAckMessage46.addQoS(qoS53);
        connectMessage20.setWill("hi!", "MQIsdp", qoS53, true);
        subAckMessage7.addQoS(qoS53);
        subAckMessage6.addQoS(qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage("\000\003hi!", qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS53);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage61.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MQIsdp" + "'", str14, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList47);
        org.junit.Assert.assertNull(qoSList48);
        org.junit.Assert.assertNull(qoSList49);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getUsername();
        org.meqantt.message.QoS qoS13 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.QoS qoS18 = subscribeMessage16.getQos();
        subscribeMessage14.addTopic("", qoS18);
        connectMessage8.setWill("", "\000d\000\001\001d", qoS18, true);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("hi!", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("", qoS18);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage27 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList28 = unsubscribeMessage27.getTopics();
        org.meqantt.message.Message.Type type29 = unsubscribeMessage27.getType();
        java.util.List<java.lang.String> strList30 = unsubscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS31 = unsubscribeMessage27.getQos();
        subscribeMessage24.addTopic("\001\003\003\001", qoS31);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type29.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = pubAckMessage1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage12 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header13 = null;
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header13);
        boolean boolean15 = connectMessage14.isWillRetained();
        boolean boolean16 = connectMessage14.isWillRetained();
        java.lang.String str17 = connectMessage14.getUsername();
        connectMessage14.setCredentials("\000d\000\001\001d", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.meqantt.message.ConnectMessage connectMessage30 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str31 = connectMessage30.getUsername();
        org.meqantt.message.QoS qoS35 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList39 = subscribeMessage38.getTopics();
        org.meqantt.message.QoS qoS40 = subscribeMessage38.getQos();
        subscribeMessage36.addTopic("", qoS40);
        connectMessage30.setWill("", "\000d\000\001\001d", qoS40, true);
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage("hi!", qoS40);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS40);
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage("", qoS40);
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS40);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList50 = subscribeMessage49.getTopics();
        org.meqantt.message.ConnectMessage connectMessage55 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str56 = connectMessage55.getProtocolId();
        org.meqantt.message.QoS qoS57 = connectMessage55.getQos();
        subscribeMessage49.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS57);
        subscribeMessage47.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS57);
        org.meqantt.message.ConnectMessage connectMessage64 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str65 = connectMessage64.getProtocolId();
        org.meqantt.message.QoS qoS66 = connectMessage64.getQos();
        subscribeMessage47.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS66);
        org.meqantt.message.ConnectMessage connectMessage76 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str77 = connectMessage76.getUsername();
        org.meqantt.message.QoS qoS81 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage82 = new org.meqantt.message.SubscribeMessage("", qoS81);
        org.meqantt.message.SubscribeMessage subscribeMessage84 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList85 = subscribeMessage84.getTopics();
        org.meqantt.message.QoS qoS86 = subscribeMessage84.getQos();
        subscribeMessage82.addTopic("", qoS86);
        connectMessage76.setWill("", "\000d\000\001\001d", qoS86, true);
        org.meqantt.message.SubscribeMessage subscribeMessage90 = new org.meqantt.message.SubscribeMessage("hi!", qoS86);
        org.meqantt.message.SubscribeMessage subscribeMessage91 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS86);
        org.meqantt.message.SubscribeMessage subscribeMessage92 = new org.meqantt.message.SubscribeMessage("", qoS86);
        org.meqantt.message.SubscribeMessage subscribeMessage93 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS86);
        subscribeMessage47.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS86);
        connectMessage14.setWill("\000d\000\001\001d", "\001\003\003\001", qoS86, false);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage12.setQos(qoS86);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "MQIsdp" + "'", str56, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS57 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS57.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "MQIsdp" + "'", str65, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS66 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS66.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertTrue("'" + qoS86 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS86.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage11.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "hi!");
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getWillTopic();
        boolean boolean4 = connectMessage1.isCleanSession();
        boolean boolean5 = connectMessage1.isCleanSession();
        int int6 = connectMessage1.getKeepAlive();
        connectMessage1.setCredentials("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.Message.Header header5 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header5);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        java.util.List<java.lang.String> strList8 = subscribeMessage6.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subscribeMessage6.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean15 = connectMessage14.hasWill();
        java.lang.String str16 = connectMessage14.getWill();
        org.meqantt.message.Message.Header header19 = null;
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage(header19);
        boolean boolean21 = connectMessage20.isWillRetained();
        boolean boolean22 = connectMessage20.isWillRetained();
        java.lang.String str23 = connectMessage20.getUsername();
        org.meqantt.message.QoS qoS27 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        subscribeMessage28.addTopic("", qoS32);
        connectMessage20.setWill("hi!", "", qoS32, false);
        connectMessage14.setWill("MQIsdp", "hi!", qoS32, false);
        subscribeMessage6.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS32);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setQos(qoS32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(qoSList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        java.lang.String str8 = connectMessage7.getClientId();
        connectMessage7.setWill("hi!", "");
        boolean boolean12 = connectMessage7.hasWill();
        org.meqantt.message.QoS qoS13 = connectMessage7.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage5.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        connectMessage1.setCredentials("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        connectMessage1.setCredentials("MQIsdp");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getUsername();
        int int9 = connectMessage7.getKeepAlive();
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean16 = connectMessage15.hasWill();
        java.lang.String str17 = connectMessage15.getWill();
        org.meqantt.message.Message.Header header20 = null;
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage(header20);
        boolean boolean22 = connectMessage21.isWillRetained();
        boolean boolean23 = connectMessage21.isWillRetained();
        java.lang.String str24 = connectMessage21.getUsername();
        org.meqantt.message.QoS qoS28 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("", qoS28);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList32 = subscribeMessage31.getTopics();
        org.meqantt.message.QoS qoS33 = subscribeMessage31.getQos();
        subscribeMessage29.addTopic("", qoS33);
        connectMessage21.setWill("hi!", "", qoS33, false);
        connectMessage15.setWill("MQIsdp", "hi!", qoS33, false);
        connectMessage7.setWill("\000\000", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS33, false);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage3.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage7.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str19 = connectMessage18.getProtocolId();
        org.meqantt.message.QoS qoS20 = connectMessage18.getQos();
        subscribeMessage11.addTopic("", qoS20);
        subAckMessage7.addQoS(qoS20);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        java.util.List<java.lang.String> strList11 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS12 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        org.meqantt.message.QoS qoS8 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        subscribeMessage9.addTopic("", qoS13);
        connectMessage1.setWill("hi!", "", qoS13, false);
        boolean boolean17 = connectMessage1.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getUsername();
        org.meqantt.message.QoS qoS11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        subscribeMessage12.addTopic("", qoS16);
        connectMessage6.setWill("", "\000d\000\001\001d", qoS16, true);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("hi!", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str27 = connectMessage26.getUsername();
        int int28 = connectMessage26.getKeepAlive();
        connectMessage26.setCredentials("MQIsdp", "MQIsdp");
        org.meqantt.message.QoS qoS32 = connectMessage26.getWillQoS();
        boolean boolean33 = connectMessage26.hasPassword();
        java.lang.String str34 = connectMessage26.getPassword();
        org.meqantt.message.QoS qoS35 = connectMessage26.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage22.setQos(qoS35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(qoS32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MQIsdp" + "'", str34, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.isCleanSession();
        boolean boolean7 = connectMessage1.isCleanSession();
        java.lang.String str8 = connectMessage1.getWillTopic();
        byte byte9 = connectMessage1.getProtocolVersion();
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str16 = connectMessage15.getUsername();
        org.meqantt.message.QoS qoS20 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("", qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList24 = subscribeMessage23.getTopics();
        org.meqantt.message.QoS qoS25 = subscribeMessage23.getQos();
        subscribeMessage21.addTopic("", qoS25);
        connectMessage15.setWill("", "\000d\000\001\001d", qoS25, true);
        connectMessage1.setWill("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS25, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 3 + "'", byte9 == (byte) 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus6 = connAckMessage5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus6);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        boolean boolean8 = connAckMessage7.isDup();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage14.setWill("", "\000d\000\001\001d", qoS24, true);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) -1);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type4 = header3.getType();
        org.meqantt.message.Message.Type type5 = header3.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header3);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PublishMessage publishMessage13 = new org.meqantt.message.PublishMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) publishMessage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        java.lang.String str10 = connectMessage1.getPassword();
        boolean boolean11 = connectMessage1.isWillRetained();
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        java.lang.String str3 = connectMessage1.getWill();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header4 = null;
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header4);
        boolean boolean6 = connectMessage5.isWillRetained();
        boolean boolean7 = connectMessage5.isWillRetained();
        java.lang.String str8 = connectMessage5.getUsername();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        connectMessage5.setWill("hi!", "", qoS17, false);
        boolean boolean21 = connectMessage5.hasUsername();
        org.meqantt.message.QoS qoS22 = connectMessage5.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getUsername();
        org.meqantt.message.QoS qoS11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        subscribeMessage12.addTopic("", qoS16);
        connectMessage6.setWill("", "\000d\000\001\001d", qoS16, true);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("hi!", qoS16);
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) subscribeMessage20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        connectMessage2.setCredentials("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setCredentials("", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: It is not valid to supply a password without supplying a username.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus8 = connAckMessage7.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(connectionStatus8);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus2);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        java.util.List<org.meqantt.message.QoS> qoSList3 = subscribeMessage2.getTopicQoSs();
        org.meqantt.message.Message.Header header5 = null;
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header5);
        boolean boolean7 = connectMessage6.isWillRetained();
        boolean boolean8 = connectMessage6.isWillRetained();
        connectMessage6.setWill("", "MQIsdp");
        boolean boolean12 = connectMessage6.isWillRetained();
        java.lang.String str13 = connectMessage6.getClientId();
        java.lang.String str14 = connectMessage6.getWill();
        byte byte15 = connectMessage6.getProtocolVersion();
        java.lang.String str16 = connectMessage6.getPassword();
        boolean boolean17 = connectMessage6.hasPassword();
        org.meqantt.message.QoS qoS18 = connectMessage6.getWillQoS();
        subscribeMessage2.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS18);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qoSList3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MQIsdp" + "'", str14, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 3 + "'", byte15 == (byte) 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getUsername();
        boolean boolean7 = connectMessage1.hasPassword();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        org.meqantt.message.QoS qoS4 = connectMessage1.getWillQoS();
        java.lang.String str5 = connectMessage1.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(qoS4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setCredentials("");
        java.lang.String str8 = connectMessage1.getClientId();
        org.meqantt.message.QoS qoS9 = connectMessage1.getWillQoS();
        java.lang.String str10 = connectMessage1.getUsername();
        byte byte11 = connectMessage1.getProtocolVersion();
        boolean boolean12 = connectMessage1.isCleanSession();
        org.meqantt.message.Message.Header header14 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type15 = header14.getType();
        org.meqantt.message.Message.Type type16 = header14.getType();
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage(header14);
        org.meqantt.message.PingReqMessage pingReqMessage18 = new org.meqantt.message.PingReqMessage(header14);
        org.meqantt.message.PingReqMessage pingReqMessage19 = new org.meqantt.message.PingReqMessage(header14);
        org.meqantt.message.DisconnectMessage disconnectMessage20 = new org.meqantt.message.DisconnectMessage(header14);
        org.meqantt.message.SubAckMessage subAckMessage21 = new org.meqantt.message.SubAckMessage(header14);
        org.meqantt.message.UnsubAckMessage unsubAckMessage22 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS23 = unsubAckMessage22.getQos();
        subAckMessage21.addQoS(qoS23);
        org.meqantt.message.ConnectMessage connectMessage29 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean30 = connectMessage29.hasWill();
        java.lang.String str31 = connectMessage29.getWill();
        org.meqantt.message.Message.Header header34 = null;
        org.meqantt.message.ConnectMessage connectMessage35 = new org.meqantt.message.ConnectMessage(header34);
        boolean boolean36 = connectMessage35.isWillRetained();
        boolean boolean37 = connectMessage35.isWillRetained();
        java.lang.String str38 = connectMessage35.getUsername();
        org.meqantt.message.QoS qoS42 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("", qoS42);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList46 = subscribeMessage45.getTopics();
        org.meqantt.message.QoS qoS47 = subscribeMessage45.getQos();
        subscribeMessage43.addTopic("", qoS47);
        connectMessage35.setWill("hi!", "", qoS47, false);
        connectMessage29.setWill("MQIsdp", "hi!", qoS47, false);
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS47);
        subAckMessage21.addQoS(qoS47);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(qoS9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 3 + "'", byte11 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        boolean boolean4 = connectMessage2.hasPassword();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS9 = unsubscribeMessage8.getQos();
        connectMessage2.setWill("", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS9, false);
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str16 = connectMessage15.getUsername();
        org.meqantt.message.QoS qoS20 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("", qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList24 = subscribeMessage23.getTopics();
        org.meqantt.message.QoS qoS25 = subscribeMessage23.getQos();
        subscribeMessage21.addTopic("", qoS25);
        connectMessage15.setWill("", "\000d\000\001\001d", qoS25, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.bindRequested(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage10.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.closeRequested(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getUsername();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        connectMessage7.setWill("", "\000d\000\001\001d", qoS17, true);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("hi!", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        org.meqantt.message.ConnectMessage connectMessage32 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str33 = connectMessage32.getProtocolId();
        org.meqantt.message.QoS qoS34 = connectMessage32.getQos();
        subscribeMessage26.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS34);
        subscribeMessage24.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS34);
        java.util.List<java.lang.String> strList37 = subscribeMessage24.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage24.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MQIsdp" + "'", str33, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        java.lang.Class<?> wildcardClass12 = connAckMessage11.getClass();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header5);
        org.meqantt.message.Message.Header header9 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str10 = header9.toString();
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header9);
        org.meqantt.message.PublishMessage publishMessage12 = new org.meqantt.message.PublishMessage(header9);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage15 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS16 = unsubscribeMessage15.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        publishMessage12.setQos(qoS16);
        subAckMessage7.addQoS(qoS16);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type6.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        org.meqantt.message.Message.Header header1 = null;
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        boolean boolean4 = connectMessage2.isWillRetained();
        java.lang.String str5 = connectMessage2.getUsername();
        connectMessage2.setCredentials("\000d\000\001\001d", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str19 = connectMessage18.getUsername();
        org.meqantt.message.QoS qoS23 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        org.meqantt.message.QoS qoS28 = subscribeMessage26.getQos();
        subscribeMessage24.addTopic("", qoS28);
        connectMessage18.setWill("", "\000d\000\001\001d", qoS28, true);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("hi!", qoS28);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS28);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("", qoS28);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS28);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList38 = subscribeMessage37.getTopics();
        org.meqantt.message.ConnectMessage connectMessage43 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str44 = connectMessage43.getProtocolId();
        org.meqantt.message.QoS qoS45 = connectMessage43.getQos();
        subscribeMessage37.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS45);
        subscribeMessage35.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS45);
        org.meqantt.message.ConnectMessage connectMessage52 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str53 = connectMessage52.getProtocolId();
        org.meqantt.message.QoS qoS54 = connectMessage52.getQos();
        subscribeMessage35.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS54);
        org.meqantt.message.ConnectMessage connectMessage64 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str65 = connectMessage64.getUsername();
        org.meqantt.message.QoS qoS69 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage70 = new org.meqantt.message.SubscribeMessage("", qoS69);
        org.meqantt.message.SubscribeMessage subscribeMessage72 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList73 = subscribeMessage72.getTopics();
        org.meqantt.message.QoS qoS74 = subscribeMessage72.getQos();
        subscribeMessage70.addTopic("", qoS74);
        connectMessage64.setWill("", "\000d\000\001\001d", qoS74, true);
        org.meqantt.message.SubscribeMessage subscribeMessage78 = new org.meqantt.message.SubscribeMessage("hi!", qoS74);
        org.meqantt.message.SubscribeMessage subscribeMessage79 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS74);
        org.meqantt.message.SubscribeMessage subscribeMessage80 = new org.meqantt.message.SubscribeMessage("", qoS74);
        org.meqantt.message.SubscribeMessage subscribeMessage81 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS74);
        subscribeMessage35.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS74);
        connectMessage2.setWill("\000d\000\001\001d", "\001\003\003\001", qoS74, false);
        org.meqantt.message.SubscribeMessage subscribeMessage85 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS74);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage85.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "MQIsdp" + "'", str44, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS45 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS45.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MQIsdp" + "'", str53, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS54 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS54.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + qoS74 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS74.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", "00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n");
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage10 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage11 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type14 = header13.getType();
        org.meqantt.message.Message.Type type15 = header13.getType();
        org.meqantt.message.PubRelMessage pubRelMessage16 = new org.meqantt.message.PubRelMessage(header13);
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage(header13);
        boolean boolean18 = subAckMessage17.isRetained();
        org.meqantt.message.QoS qoS19 = subAckMessage17.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage11.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(1);
        pubRecMessage1.setMessageId(10);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getUsername();
        java.lang.String str9 = connectMessage7.getWill();
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type14 = header13.getType();
        org.meqantt.message.Message.Type type15 = header13.getType();
        org.meqantt.message.PubRelMessage pubRelMessage16 = new org.meqantt.message.PubRelMessage(header13);
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage(header13);
        boolean boolean18 = subAckMessage17.isRetained();
        org.meqantt.message.QoS qoS19 = subAckMessage17.getQos();
        connectMessage7.setWill("\000\003hi!", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS19, false);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        int int5 = pubAckMessage4.getMessageId();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getUsername();
        org.meqantt.message.QoS qoS15 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        subscribeMessage16.addTopic("", qoS20);
        connectMessage10.setWill("", "\000d\000\001\001d", qoS20, true);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("hi!", qoS20);
        java.util.List<java.lang.String> strList25 = subscribeMessage24.getTopics();
        int int26 = subscribeMessage24.getMessageId();
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList30 = subscribeMessage29.getTopics();
        org.meqantt.message.QoS qoS31 = subscribeMessage29.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("", qoS31);
        subscribeMessage24.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS31);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", "00: 01100100 d 100\n01: 00000000 \000 0\n");
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.meqantt.MqttListener mqttListener13 = null;
        mqttMessageHandler0.setListener(mqttListener13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.closeRequested(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getProtocolId();
        java.lang.String str2 = connectMessage0.getClientId();
        int int3 = connectMessage0.getKeepAlive();
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header5);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header5);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage9.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str16 = connectMessage15.getProtocolId();
        org.meqantt.message.QoS qoS17 = connectMessage15.getQos();
        subAckMessage9.addQoS(qoS17);
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean23 = connectMessage22.hasWill();
        java.lang.String str24 = connectMessage22.getWill();
        org.meqantt.message.Message.Header header27 = null;
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage(header27);
        boolean boolean29 = connectMessage28.isWillRetained();
        boolean boolean30 = connectMessage28.isWillRetained();
        java.lang.String str31 = connectMessage28.getUsername();
        org.meqantt.message.QoS qoS35 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList39 = subscribeMessage38.getTopics();
        org.meqantt.message.QoS qoS40 = subscribeMessage38.getQos();
        subscribeMessage36.addTopic("", qoS40);
        connectMessage28.setWill("hi!", "", qoS40, false);
        connectMessage22.setWill("MQIsdp", "hi!", qoS40, false);
        org.meqantt.message.SubAckMessage subAckMessage48 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList49 = subAckMessage48.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList50 = subAckMessage48.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList51 = subAckMessage48.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList54 = subscribeMessage53.getTopics();
        org.meqantt.message.QoS qoS55 = subscribeMessage53.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage("", qoS55);
        subAckMessage48.addQoS(qoS55);
        connectMessage22.setWill("hi!", "MQIsdp", qoS55, true);
        subAckMessage9.addQoS(qoS55);
        subAckMessage8.addQoS(qoS55);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setQos(qoS55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MQIsdp" + "'", str1, "MQIsdp");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MQIsdp" + "'", str16, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList49);
        org.junit.Assert.assertNull(qoSList50);
        org.junit.Assert.assertNull(qoSList51);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus5 = connAckMessage4.getStatus();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertNull(connectionStatus5);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        byte[] byteArray2 = pubCompMessage1.toBytes();
        int int3 = pubCompMessage1.getMessageId();
        org.meqantt.message.Message.Header header4 = null;
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header4);
        java.lang.String str6 = connectMessage5.getClientId();
        connectMessage5.setWill("hi!", "");
        boolean boolean10 = connectMessage5.hasWill();
        org.meqantt.message.QoS qoS11 = connectMessage5.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[112, 2, 0, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        java.util.List<java.lang.String> strList11 = subscribeMessage0.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelDisconnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        subAckMessage0.setMessageId((int) '#');
        org.meqantt.message.QoS qoS7 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        int int9 = subscribeMessage8.getMessageId();
        subscribeMessage8.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header13 = null;
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header13);
        int int15 = connectMessage14.getKeepAlive();
        connectMessage14.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS19 = connectMessage14.getWillQoS();
        subscribeMessage8.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS19);
        org.meqantt.message.SubAckMessage subAckMessage22 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList23 = subAckMessage22.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList24 = subAckMessage22.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str29 = connectMessage28.getProtocolId();
        org.meqantt.message.QoS qoS30 = connectMessage28.getQos();
        subAckMessage22.addQoS(qoS30);
        org.meqantt.message.ConnectMessage connectMessage35 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean36 = connectMessage35.hasWill();
        java.lang.String str37 = connectMessage35.getWill();
        org.meqantt.message.Message.Header header40 = null;
        org.meqantt.message.ConnectMessage connectMessage41 = new org.meqantt.message.ConnectMessage(header40);
        boolean boolean42 = connectMessage41.isWillRetained();
        boolean boolean43 = connectMessage41.isWillRetained();
        java.lang.String str44 = connectMessage41.getUsername();
        org.meqantt.message.QoS qoS48 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("", qoS48);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList52 = subscribeMessage51.getTopics();
        org.meqantt.message.QoS qoS53 = subscribeMessage51.getQos();
        subscribeMessage49.addTopic("", qoS53);
        connectMessage41.setWill("hi!", "", qoS53, false);
        connectMessage35.setWill("MQIsdp", "hi!", qoS53, false);
        org.meqantt.message.SubAckMessage subAckMessage61 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList62 = subAckMessage61.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList63 = subAckMessage61.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList64 = subAckMessage61.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage66 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList67 = subscribeMessage66.getTopics();
        org.meqantt.message.QoS qoS68 = subscribeMessage66.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage69 = new org.meqantt.message.SubscribeMessage("", qoS68);
        subAckMessage61.addQoS(qoS68);
        connectMessage35.setWill("hi!", "MQIsdp", qoS68, true);
        subAckMessage22.addQoS(qoS68);
        org.meqantt.message.SubAckMessage subAckMessage74 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList75 = subAckMessage74.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList76 = subAckMessage74.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage80 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str81 = connectMessage80.getProtocolId();
        org.meqantt.message.QoS qoS82 = connectMessage80.getQos();
        subAckMessage74.addQoS(qoS82);
        subAckMessage22.addQoS(qoS82);
        subscribeMessage8.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS82);
        org.meqantt.message.SubscribeMessage subscribeMessage88 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList89 = subscribeMessage88.getTopics();
        org.meqantt.message.QoS qoS90 = subscribeMessage88.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage91 = new org.meqantt.message.SubscribeMessage("", qoS90);
        org.meqantt.message.SubscribeMessage subscribeMessage92 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS90);
        org.meqantt.message.QoS qoS93 = subscribeMessage92.getQos();
        subscribeMessage8.setQos(qoS93);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList23);
        org.junit.Assert.assertNull(qoSList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MQIsdp" + "'", str29, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList62);
        org.junit.Assert.assertNull(qoSList63);
        org.junit.Assert.assertNull(qoSList64);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + qoS68 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS68.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList75);
        org.junit.Assert.assertNull(qoSList76);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "MQIsdp" + "'", str81, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS82 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS82.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertTrue("'" + qoS90 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS90.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS93 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS93.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage14.setWill("", "\000d\000\001\001d", qoS24, true);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage8.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        int int5 = pubAckMessage4.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.meqantt.MqttListener mqttListener13 = null;
        mqttMessageHandler0.setListener(mqttListener13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelClosed(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS4);
        org.meqantt.message.QoS qoS7 = subscribeMessage6.getQos();
        java.util.List<java.lang.String> strList8 = subscribeMessage6.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str7 = connectMessage6.getWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.Message.Header header4 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header4);
        byte byte6 = connectMessage5.getProtocolVersion();
        boolean boolean7 = connectMessage5.hasUsername();
        java.lang.String str8 = connectMessage5.getWill();
        boolean boolean9 = connectMessage5.isRetained();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        connectMessage5.setWill("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", qoS14, false);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD));
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.Class<?> wildcardClass7 = connectMessage6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.ACCEPTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.ACCEPTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.ACCEPTED));
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        boolean boolean10 = connectMessage9.isWillRetained();
        boolean boolean11 = connectMessage9.isWillRetained();
        java.lang.String str12 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage9.setWill("hi!", "", qoS21, false);
        connectMessage3.setWill("MQIsdp", "hi!", qoS21, false);
        boolean boolean27 = connectMessage3.isCleanSession();
        int int28 = connectMessage3.getKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000\000", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\000d\000\001\001d", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        java.lang.String str3 = publishMessage2.getDataAsString();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n" + "'", str3, "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getUsername();
        boolean boolean2 = connectMessage0.hasWill();
        connectMessage0.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        java.lang.Class<?> wildcardClass6 = connectMessage0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        int int5 = pubRelMessage4.getMessageId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        java.lang.String str4 = connectMessage2.getWillTopic();
        boolean boolean5 = connectMessage2.hasWill();
        connectMessage2.setCredentials("");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 00000000 \000 0\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\001\003\003\001", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ????");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage12 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage12.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 10010000 ? 144?01: 00000011 ? 3?02: 00000000 ? 0?03: 00000000 ? 0?04: 00000000 ? 0?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage9.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        subscribeMessage3.setDup(false);
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str14 = connectMessage13.getUsername();
        org.meqantt.message.QoS qoS18 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        subscribeMessage19.addTopic("", qoS23);
        connectMessage13.setWill("", "\000d\000\001\001d", qoS23, true);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("hi!", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList33 = subscribeMessage32.getTopics();
        org.meqantt.message.ConnectMessage connectMessage38 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str39 = connectMessage38.getProtocolId();
        org.meqantt.message.QoS qoS40 = connectMessage38.getQos();
        subscribeMessage32.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS40);
        subscribeMessage30.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS40);
        org.meqantt.message.ConnectMessage connectMessage47 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str48 = connectMessage47.getProtocolId();
        org.meqantt.message.QoS qoS49 = connectMessage47.getQos();
        subscribeMessage30.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS49);
        org.meqantt.message.ConnectMessage connectMessage59 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str60 = connectMessage59.getUsername();
        org.meqantt.message.QoS qoS64 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage65 = new org.meqantt.message.SubscribeMessage("", qoS64);
        org.meqantt.message.SubscribeMessage subscribeMessage67 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList68 = subscribeMessage67.getTopics();
        org.meqantt.message.QoS qoS69 = subscribeMessage67.getQos();
        subscribeMessage65.addTopic("", qoS69);
        connectMessage59.setWill("", "\000d\000\001\001d", qoS69, true);
        org.meqantt.message.SubscribeMessage subscribeMessage73 = new org.meqantt.message.SubscribeMessage("hi!", qoS69);
        org.meqantt.message.SubscribeMessage subscribeMessage74 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS69);
        org.meqantt.message.SubscribeMessage subscribeMessage75 = new org.meqantt.message.SubscribeMessage("", qoS69);
        org.meqantt.message.SubscribeMessage subscribeMessage76 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS69);
        subscribeMessage30.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS69);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage3.setQos(qoS69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MQIsdp" + "'", str39, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "MQIsdp" + "'", str48, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS49 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS49.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + qoS69 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS69.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        connectMessage1.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS6 = connectMessage1.getWillQoS();
        boolean boolean7 = connectMessage1.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage9 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage9.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        java.lang.String str8 = connectMessage7.getClientId();
        connectMessage7.setWill("hi!", "");
        boolean boolean12 = connectMessage7.hasPassword();
        boolean boolean13 = connectMessage7.isCleanSession();
        boolean boolean14 = connectMessage7.hasWill();
        org.meqantt.message.QoS qoS15 = connectMessage7.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS15);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        byte byte10 = connectMessage1.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 3 + "'", byte10 == (byte) 3);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList4 = subscribeMessage0.getTopicQoSs();
        subscribeMessage0.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList7 = subscribeMessage0.getTopicQoSs();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(qoSList4);
        org.junit.Assert.assertNotNull(qoSList7);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        byte[] byteArray2 = org.meqantt.util.FormatUtil.toMQttString("");
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", byteArray2);
        org.meqantt.message.Message.Type type4 = publishMessage3.getType();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.meqantt.message.Message.Type.PUBLISH + "'", type4.equals(org.meqantt.message.Message.Type.PUBLISH));
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        java.lang.Class<?> wildcardClass7 = header1.getClass();
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.DisconnectMessage disconnectMessage1 = new org.meqantt.message.DisconnectMessage(header0);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS6);
        org.meqantt.message.QoS qoS9 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS15);
        org.meqantt.message.QoS qoS18 = subscribeMessage17.getQos();
        subscribeMessage8.addTopic("", qoS18);
        org.meqantt.message.PublishMessage publishMessage23 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        org.meqantt.message.QoS qoS24 = publishMessage23.getQos();
        subscribeMessage8.addTopic("", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage1.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Type type8 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str5 = connectMessage4.getWillTopic();
        java.lang.String str6 = connectMessage4.getClientId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type11 = subscribeMessage10.getType();
        subscribeMessage10.setDup(false);
        subscribeMessage10.setMessageId((int) (short) 0);
        java.util.List<org.meqantt.message.QoS> qoSList16 = subscribeMessage10.getTopicQoSs();
        subscribeMessage10.setDup(false);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type21 = subscribeMessage20.getType();
        org.meqantt.message.ConnectMessage connectMessage27 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean28 = connectMessage27.hasWill();
        java.lang.String str29 = connectMessage27.getWill();
        org.meqantt.message.Message.Header header32 = null;
        org.meqantt.message.ConnectMessage connectMessage33 = new org.meqantt.message.ConnectMessage(header32);
        boolean boolean34 = connectMessage33.isWillRetained();
        boolean boolean35 = connectMessage33.isWillRetained();
        java.lang.String str36 = connectMessage33.getUsername();
        org.meqantt.message.QoS qoS40 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage("", qoS40);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList44 = subscribeMessage43.getTopics();
        org.meqantt.message.QoS qoS45 = subscribeMessage43.getQos();
        subscribeMessage41.addTopic("", qoS45);
        connectMessage33.setWill("hi!", "", qoS45, false);
        connectMessage27.setWill("MQIsdp", "hi!", qoS45, false);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS45);
        subscribeMessage20.addTopic("\001\003\003\001", qoS45);
        subscribeMessage10.addTopic("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS45);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage9.setQos(qoS45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type11.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(qoSList16);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type21.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + qoS45 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS45.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PublishMessage publishMessage4 = new org.meqantt.message.PublishMessage(header1);
        publishMessage4.setMessageId((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = publishMessage4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        byte[] byteArray2 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str3 = org.meqantt.util.FormatUtil.toString(byteArray2);
        org.meqantt.message.PublishMessage publishMessage4 = new org.meqantt.message.PublishMessage("hi!", byteArray2);
        publishMessage4.setMessageId((int) '\001');
        java.lang.String str7 = publishMessage4.getDataAsString();
        java.lang.String str8 = publishMessage4.getDataAsString();
        byte[] byteArray9 = publishMessage4.getData();
        java.lang.String str10 = publishMessage4.getDataAsString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000" + "'", str7, "\000\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000" + "'", str8, "\000\000");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000" + "'", str10, "\000\000");
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, 1);
        byte byte8 = connectMessage7.getProtocolVersion();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.QoS qoS15 = null;
        subscribeMessage11.addTopic("", qoS15);
        java.util.List<org.meqantt.message.QoS> qoSList17 = subscribeMessage11.getTopicQoSs();
        subscribeMessage11.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList20 = subscribeMessage11.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str26 = connectMessage25.getUsername();
        org.meqantt.message.QoS qoS30 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("", qoS30);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList34 = subscribeMessage33.getTopics();
        org.meqantt.message.QoS qoS35 = subscribeMessage33.getQos();
        subscribeMessage31.addTopic("", qoS35);
        connectMessage25.setWill("", "\000d\000\001\001d", qoS35, true);
        subscribeMessage11.addTopic("\000\000", qoS35);
        connectMessage7.setWill("", "\000\003hi!", qoS35, true);
        org.meqantt.message.Message.Header header44 = null;
        org.meqantt.message.ConnectMessage connectMessage45 = new org.meqantt.message.ConnectMessage(header44);
        boolean boolean46 = connectMessage45.isWillRetained();
        boolean boolean47 = connectMessage45.isWillRetained();
        java.lang.String str48 = connectMessage45.getUsername();
        org.meqantt.message.QoS qoS52 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage("", qoS52);
        org.meqantt.message.SubscribeMessage subscribeMessage55 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList56 = subscribeMessage55.getTopics();
        org.meqantt.message.QoS qoS57 = subscribeMessage55.getQos();
        subscribeMessage53.addTopic("", qoS57);
        connectMessage45.setWill("hi!", "", qoS57, false);
        boolean boolean61 = connectMessage45.hasUsername();
        org.meqantt.message.QoS qoS62 = connectMessage45.getWillQoS();
        connectMessage7.setWill("hi!", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS62, true);
        org.meqantt.message.QoS qoS65 = connectMessage7.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage3.setQos(qoS65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 3 + "'", byte8 == (byte) 3);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList17);
        org.junit.Assert.assertNotNull(qoSList20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + qoS57 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS57.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + qoS62 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS62.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS65 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS65.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) 'a');
        org.meqantt.message.QoS qoS10 = connectMessage9.getWillQoS();
        org.meqantt.message.QoS qoS11 = connectMessage9.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("\000\000", qoS19);
        connectMessage9.setWill("\000\000", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS19, false);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(qoS10);
        org.junit.Assert.assertNull(qoS11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        boolean boolean10 = connectMessage9.isWillRetained();
        boolean boolean11 = connectMessage9.isWillRetained();
        java.lang.String str12 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage9.setWill("hi!", "", qoS21, false);
        connectMessage3.setWill("MQIsdp", "hi!", qoS21, false);
        org.meqantt.message.SubAckMessage subAckMessage29 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList30 = subAckMessage29.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList31 = subAckMessage29.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList32 = subAckMessage29.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList35 = subscribeMessage34.getTopics();
        org.meqantt.message.QoS qoS36 = subscribeMessage34.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("", qoS36);
        subAckMessage29.addQoS(qoS36);
        connectMessage3.setWill("hi!", "MQIsdp", qoS36, true);
        java.lang.String str41 = connectMessage3.getPassword();
        java.lang.String str42 = connectMessage3.getClientId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList30);
        org.junit.Assert.assertNull(qoSList31);
        org.junit.Assert.assertNull(qoSList32);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "MQIsdp" + "'", str42, "MQIsdp");
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage5.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        subAckMessage5.addQoS(qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str22 = connectMessage21.getProtocolId();
        org.meqantt.message.QoS qoS23 = connectMessage21.getQos();
        subscribeMessage15.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS23);
        subAckMessage5.addQoS(qoS23);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        boolean boolean4 = connectMessage2.hasUsername();
        java.lang.String str5 = connectMessage2.getWill();
        boolean boolean6 = connectMessage2.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        nettyClient1.unsubscribe("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        nettyClient1.disconnect();
        nettyClient1.subscribe("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        nettyClient1.ping();
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Type type8 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage10 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage10.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage12 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage12.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00000000 \000 0\n01: 00000110 \006 6\n02: 01001101 M 77\n03: 01010001 Q 81\n04: 01001001 I 73\n05: 01110011 s 115\n06: 01100100 d 100\n07: 01110000 p 112\n", 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 00000000 ? 0?01: 00000110 ? 6?02: 01001101 M 77?03: 01010001 Q 81?04: 01001001 I 73?05: 01110011 s 115?06: 01100100 d 100?07: 01110000 p 112?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("hi!", false, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.meqantt.MqttListener mqttListener13 = null;
        mqttMessageHandler0.setListener(mqttListener13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleDownstream(channelHandlerContext15, channelEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage3 = new org.meqantt.message.UnsubscribeMessage("\000\000");
        byte[] byteArray4 = unsubscribeMessage3.toBytes();
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage("hi!", byteArray4);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", byteArray4);
        java.lang.String str7 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-94, 8, 0, 0, 0, 4, -64, -128, -64, -128]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n" + "'", str7, "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00000000 \000 0\n01: 00000000 \000 0\n", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 00000000 ? 0?01: 00000000 ? 0?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.hasWill();
        connectMessage1.setCredentials("\000\000");
        int int9 = connectMessage1.getKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isCleanSession();
        java.lang.String str4 = connectMessage1.getWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        int int5 = unsubAckMessage2.getMessageId();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage6.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        subAckMessage6.addQoS(qoS13);
        org.meqantt.message.Message.Header header17 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type18 = header17.getType();
        org.meqantt.message.Message.Type type19 = header17.getType();
        org.meqantt.message.SubAckMessage subAckMessage20 = new org.meqantt.message.SubAckMessage(header17);
        org.meqantt.message.PingReqMessage pingReqMessage21 = new org.meqantt.message.PingReqMessage(header17);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage(header17);
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header17);
        org.meqantt.message.PingReqMessage pingReqMessage24 = new org.meqantt.message.PingReqMessage(header17);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage(header17);
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        subscribeMessage25.setDup(false);
        org.meqantt.message.Message.Header header30 = null;
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage(header30);
        int int32 = connectMessage31.getKeepAlive();
        connectMessage31.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS36 = connectMessage31.getWillQoS();
        subscribeMessage25.addTopic("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS36);
        subAckMessage6.addQoS(qoS36);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(type19);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        int int8 = connectMessage7.getKeepAlive();
        connectMessage7.setWill("MQIsdp", "");
        java.lang.String str12 = connectMessage7.getWillTopic();
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getUsername();
        org.meqantt.message.QoS qoS27 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        subscribeMessage28.addTopic("", qoS32);
        connectMessage22.setWill("", "\000d\000\001\001d", qoS32, true);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("hi!", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.ConnectMessage connectMessage47 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str48 = connectMessage47.getProtocolId();
        org.meqantt.message.QoS qoS49 = connectMessage47.getQos();
        subscribeMessage41.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS49);
        subscribeMessage39.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS49);
        org.meqantt.message.ConnectMessage connectMessage56 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str57 = connectMessage56.getProtocolId();
        org.meqantt.message.QoS qoS58 = connectMessage56.getQos();
        subscribeMessage39.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS58);
        connectMessage7.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS58, false);
        boolean boolean62 = connectMessage7.isWillRetained();
        org.meqantt.message.QoS qoS63 = connectMessage7.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage5.setQos(qoS63);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "MQIsdp" + "'", str48, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS49 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS49.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "MQIsdp" + "'", str57, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS58 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS58.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + qoS63 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS63.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS6 = unsubscribeMessage5.getQos();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        int int3 = pubAckMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        org.meqantt.message.QoS qoS8 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        subscribeMessage9.addTopic("", qoS13);
        connectMessage1.setWill("hi!", "", qoS13, false);
        boolean boolean17 = connectMessage1.hasUsername();
        org.meqantt.message.QoS qoS18 = connectMessage1.getWillQoS();
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str25 = connectMessage24.getUsername();
        org.meqantt.message.QoS qoS29 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList33 = subscribeMessage32.getTopics();
        org.meqantt.message.QoS qoS34 = subscribeMessage32.getQos();
        subscribeMessage30.addTopic("", qoS34);
        connectMessage24.setWill("", "\000d\000\001\001d", qoS34, true);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS34);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS34);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        org.meqantt.message.QoS qoS3 = null;
        subscribeMessage1.addTopic("hi!", qoS3);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getUsername();
        int int11 = connectMessage9.getKeepAlive();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean18 = connectMessage17.hasWill();
        java.lang.String str19 = connectMessage17.getWill();
        org.meqantt.message.Message.Header header22 = null;
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header22);
        boolean boolean24 = connectMessage23.isWillRetained();
        boolean boolean25 = connectMessage23.isWillRetained();
        java.lang.String str26 = connectMessage23.getUsername();
        org.meqantt.message.QoS qoS30 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("", qoS30);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList34 = subscribeMessage33.getTopics();
        org.meqantt.message.QoS qoS35 = subscribeMessage33.getQos();
        subscribeMessage31.addTopic("", qoS35);
        connectMessage23.setWill("hi!", "", qoS35, false);
        connectMessage17.setWill("MQIsdp", "hi!", qoS35, false);
        connectMessage9.setWill("\000\000", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS35, false);
        subscribeMessage1.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS35);
        java.util.List<java.lang.String> strList44 = subscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage9.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("");
        java.lang.Class<?> wildcardClass5 = unsubscribeMessage1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage4.getGrantedQoSs();
        org.meqantt.message.QoS qoS6 = null;
        subAckMessage4.addQoS(qoS6);
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage11.setWill("", "\000d\000\001\001d", qoS21, true);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.QoS qoS5 = unsubAckMessage4.getQos();
        unsubAckMessage4.setMessageId((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.Class<?> wildcardClass6 = header1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str5 = connectMessage4.getUsername();
        org.meqantt.message.QoS qoS9 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        subscribeMessage10.addTopic("", qoS14);
        connectMessage4.setWill("", "\000d\000\001\001d", qoS14, true);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("hi!", qoS14);
        org.meqantt.message.Message.Header header20 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage(header20);
        byte byte22 = connectMessage21.getProtocolVersion();
        boolean boolean23 = connectMessage21.hasUsername();
        java.lang.String str24 = connectMessage21.getWill();
        boolean boolean25 = connectMessage21.isRetained();
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList29 = subscribeMessage28.getTopics();
        org.meqantt.message.QoS qoS30 = subscribeMessage28.getQos();
        connectMessage21.setWill("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", qoS30, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage18.setQos(qoS30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 3 + "'", byte22 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        nettyClient1.unsubscribe("hi!");
        nettyClient1.unsubscribe("hi!");
        org.meqantt.MqttListener mqttListener15 = null;
        nettyClient1.setListener(mqttListener15);
        nettyClient1.unsubscribe("\000\003hi!");
        nettyClient1.disconnect();
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.util.List<java.lang.String> strList6 = unsubscribeMessage5.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MQIsdp" + "'", str5, "MQIsdp");
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getUsername();
        org.meqantt.message.QoS qoS17 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        subscribeMessage18.addTopic("", qoS22);
        connectMessage12.setWill("", "\000d\000\001\001d", qoS22, true);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("hi!", qoS22);
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        int int28 = subscribeMessage26.getMessageId();
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList32 = subscribeMessage31.getTopics();
        org.meqantt.message.QoS qoS33 = subscribeMessage31.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("", qoS33);
        subscribeMessage26.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS33);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage10.write(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("");
        connectMessage1.setCredentials("hi!", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 100);
        pubAckMessage1.setMessageId(2);
        org.meqantt.message.QoS qoS4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.QoS qoS4 = null;
        subscribeMessage0.addTopic("", qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        subscribeMessage0.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList9 = subscribeMessage0.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage14.setWill("", "\000d\000\001\001d", qoS24, true);
        subscribeMessage0.addTopic("\000\000", qoS24);
        org.meqantt.message.Message.Type type29 = subscribeMessage0.getType();
        subscribeMessage0.setMessageId((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList6);
        org.junit.Assert.assertNotNull(qoSList9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type29.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getUsername();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        connectMessage7.setWill("", "\000d\000\001\001d", qoS17, true);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("hi!", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        org.meqantt.message.ConnectMessage connectMessage32 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str33 = connectMessage32.getProtocolId();
        org.meqantt.message.QoS qoS34 = connectMessage32.getQos();
        subscribeMessage26.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS34);
        subscribeMessage24.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS34);
        org.meqantt.message.ConnectMessage connectMessage41 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str42 = connectMessage41.getProtocolId();
        org.meqantt.message.QoS qoS43 = connectMessage41.getQos();
        subscribeMessage24.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS43);
        org.meqantt.message.ConnectMessage connectMessage53 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str54 = connectMessage53.getUsername();
        org.meqantt.message.QoS qoS58 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("", qoS58);
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList62 = subscribeMessage61.getTopics();
        org.meqantt.message.QoS qoS63 = subscribeMessage61.getQos();
        subscribeMessage59.addTopic("", qoS63);
        connectMessage53.setWill("", "\000d\000\001\001d", qoS63, true);
        org.meqantt.message.SubscribeMessage subscribeMessage67 = new org.meqantt.message.SubscribeMessage("hi!", qoS63);
        org.meqantt.message.SubscribeMessage subscribeMessage68 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS63);
        org.meqantt.message.SubscribeMessage subscribeMessage69 = new org.meqantt.message.SubscribeMessage("", qoS63);
        org.meqantt.message.SubscribeMessage subscribeMessage70 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS63);
        subscribeMessage24.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS63);
        java.util.List<java.lang.String> strList72 = subscribeMessage24.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage24.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MQIsdp" + "'", str33, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "MQIsdp" + "'", str42, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + qoS63 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS63.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList72);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        int int14 = subscribeMessage13.getMessageId();
        subscribeMessage13.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header18 = null;
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage(header18);
        int int20 = connectMessage19.getKeepAlive();
        connectMessage19.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS24 = connectMessage19.getWillQoS();
        subscribeMessage13.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage10.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setCredentials("");
        java.lang.String str8 = connectMessage1.getClientId();
        org.meqantt.message.QoS qoS9 = connectMessage1.getWillQoS();
        connectMessage1.setCredentials("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        boolean boolean12 = connectMessage1.hasPassword();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(qoS9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type4 = header3.getType();
        org.meqantt.message.Message.Type type5 = header3.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header3);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.DisconnectMessage disconnectMessage11 = new org.meqantt.message.DisconnectMessage(header3);
        org.meqantt.message.PingRespMessage pingRespMessage12 = new org.meqantt.message.PingRespMessage(header3);
        org.meqantt.message.PubRelMessage pubRelMessage13 = new org.meqantt.message.PubRelMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage14 = new org.meqantt.message.PingReqMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pingReqMessage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str17 = connectMessage16.getUsername();
        org.meqantt.message.QoS qoS21 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("", qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList25 = subscribeMessage24.getTopics();
        org.meqantt.message.QoS qoS26 = subscribeMessage24.getQos();
        subscribeMessage22.addTopic("", qoS26);
        connectMessage16.setWill("", "\000d\000\001\001d", qoS26, true);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("hi!", qoS26);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS26);
        subAckMessage10.addQoS(qoS26);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage10.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        boolean boolean10 = connectMessage9.isWillRetained();
        boolean boolean11 = connectMessage9.isWillRetained();
        java.lang.String str12 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage9.setWill("hi!", "", qoS21, false);
        connectMessage3.setWill("MQIsdp", "hi!", qoS21, false);
        boolean boolean27 = connectMessage3.isCleanSession();
        java.lang.String str28 = connectMessage3.getProtocolId();
        connectMessage3.setCredentials("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MQIsdp" + "'", str28, "MQIsdp");
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        unsubscribeMessage1.setDup(false);
        unsubscribeMessage1.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage12 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage13 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getProtocolId();
        org.meqantt.message.QoS qoS19 = connectMessage17.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage13.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MQIsdp" + "'", str18, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        int int3 = subscribeMessage2.getMessageId();
        subscribeMessage2.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header7 = null;
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header7);
        int int9 = connectMessage8.getKeepAlive();
        connectMessage8.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS13 = connectMessage8.getWillQoS();
        subscribeMessage2.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS13);
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList17 = subAckMessage16.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList18 = subAckMessage16.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getProtocolId();
        org.meqantt.message.QoS qoS24 = connectMessage22.getQos();
        subAckMessage16.addQoS(qoS24);
        org.meqantt.message.ConnectMessage connectMessage29 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean30 = connectMessage29.hasWill();
        java.lang.String str31 = connectMessage29.getWill();
        org.meqantt.message.Message.Header header34 = null;
        org.meqantt.message.ConnectMessage connectMessage35 = new org.meqantt.message.ConnectMessage(header34);
        boolean boolean36 = connectMessage35.isWillRetained();
        boolean boolean37 = connectMessage35.isWillRetained();
        java.lang.String str38 = connectMessage35.getUsername();
        org.meqantt.message.QoS qoS42 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("", qoS42);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList46 = subscribeMessage45.getTopics();
        org.meqantt.message.QoS qoS47 = subscribeMessage45.getQos();
        subscribeMessage43.addTopic("", qoS47);
        connectMessage35.setWill("hi!", "", qoS47, false);
        connectMessage29.setWill("MQIsdp", "hi!", qoS47, false);
        org.meqantt.message.SubAckMessage subAckMessage55 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList56 = subAckMessage55.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList57 = subAckMessage55.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList58 = subAckMessage55.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList61 = subscribeMessage60.getTopics();
        org.meqantt.message.QoS qoS62 = subscribeMessage60.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage63 = new org.meqantt.message.SubscribeMessage("", qoS62);
        subAckMessage55.addQoS(qoS62);
        connectMessage29.setWill("hi!", "MQIsdp", qoS62, true);
        subAckMessage16.addQoS(qoS62);
        org.meqantt.message.SubAckMessage subAckMessage68 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList69 = subAckMessage68.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList70 = subAckMessage68.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage74 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str75 = connectMessage74.getProtocolId();
        org.meqantt.message.QoS qoS76 = connectMessage74.getQos();
        subAckMessage68.addQoS(qoS76);
        subAckMessage16.addQoS(qoS76);
        subscribeMessage2.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS76);
        org.meqantt.message.SubscribeMessage subscribeMessage82 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList83 = subscribeMessage82.getTopics();
        org.meqantt.message.QoS qoS84 = subscribeMessage82.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage85 = new org.meqantt.message.SubscribeMessage("", qoS84);
        org.meqantt.message.SubscribeMessage subscribeMessage86 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS84);
        org.meqantt.message.QoS qoS87 = subscribeMessage86.getQos();
        subscribeMessage2.setQos(qoS87);
        java.util.List<java.lang.String> strList89 = subscribeMessage2.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList17);
        org.junit.Assert.assertNull(qoSList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MQIsdp" + "'", str23, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList56);
        org.junit.Assert.assertNull(qoSList57);
        org.junit.Assert.assertNull(qoSList58);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + qoS62 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS62.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList69);
        org.junit.Assert.assertNull(qoSList70);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "MQIsdp" + "'", str75, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS76 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS76.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + qoS84 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS84.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS87 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS87.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        byte[] byteArray1 = org.meqantt.util.FormatUtil.toMQttString("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 63, 72, 101, 97, 100, 101, 114, 32, 91, 116, 121, 112, 101, 61, 80, 85, 66, 82, 69, 76, 44, 32, 114, 101, 116, 97, 105, 110, 61, 102, 97, 108, 115, 101, 44, 32, 113, 111, 115, 61, 69, 88, 65, 67, 84, 76, 89, 95, 79, 78, 67, 69, 44, 32, 100, 117, 112, 61, 102, 97, 108, 115, 101, 93]");
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        java.util.List<java.lang.String> strList2 = subscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList3 = subscribeMessage1.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subscribeMessage1.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean10 = connectMessage9.hasWill();
        java.lang.String str11 = connectMessage9.getWill();
        org.meqantt.message.Message.Header header14 = null;
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage(header14);
        boolean boolean16 = connectMessage15.isWillRetained();
        boolean boolean17 = connectMessage15.isWillRetained();
        java.lang.String str18 = connectMessage15.getUsername();
        org.meqantt.message.QoS qoS22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        subscribeMessage23.addTopic("", qoS27);
        connectMessage15.setWill("hi!", "", qoS27, false);
        connectMessage9.setWill("MQIsdp", "hi!", qoS27, false);
        subscribeMessage1.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS27);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(qoSList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        boolean boolean10 = connectMessage9.isWillRetained();
        boolean boolean11 = connectMessage9.isWillRetained();
        java.lang.String str12 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage9.setWill("hi!", "", qoS21, false);
        connectMessage3.setWill("MQIsdp", "hi!", qoS21, false);
        org.meqantt.message.SubAckMessage subAckMessage29 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList30 = subAckMessage29.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList31 = subAckMessage29.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList32 = subAckMessage29.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList35 = subscribeMessage34.getTopics();
        org.meqantt.message.QoS qoS36 = subscribeMessage34.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("", qoS36);
        subAckMessage29.addQoS(qoS36);
        connectMessage3.setWill("hi!", "MQIsdp", qoS36, true);
        java.lang.String str41 = connectMessage3.getPassword();
        org.meqantt.message.QoS qoS42 = connectMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList30);
        org.junit.Assert.assertNull(qoSList31);
        org.junit.Assert.assertNull(qoSList32);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + qoS42 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS42.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        unsubscribeMessage1.addTopic("");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        java.util.List<org.meqantt.message.QoS> qoSList3 = subscribeMessage2.getTopicQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qoSList3);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '#');
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type4 = header3.getType();
        org.meqantt.message.Message.Type type5 = header3.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header3);
        org.meqantt.message.PubRecMessage pubRecMessage10 = new org.meqantt.message.PubRecMessage(header3);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header3);
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str17 = connectMessage16.getProtocolId();
        byte[] byteArray18 = connectMessage16.toBytes();
        org.meqantt.message.QoS qoS19 = connectMessage16.getWillQoS();
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str26 = connectMessage25.getProtocolId();
        byte[] byteArray27 = connectMessage25.toBytes();
        org.meqantt.message.QoS qoS28 = connectMessage25.getQos();
        connectMessage16.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS28, true);
        subscribeMessage11.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS28);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MQIsdp" + "'", str17, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertNull(qoS19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MQIsdp" + "'", str26, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        java.lang.String str5 = connectMessage3.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MQIsdp" + "'", str5, "MQIsdp");
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage6.getGrantedQoSs();
        subAckMessage6.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str19 = connectMessage18.getProtocolId();
        org.meqantt.message.QoS qoS20 = connectMessage18.getQos();
        subscribeMessage12.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS20);
        subAckMessage6.addQoS(qoS20);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage10 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type11 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage12.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("hi!", 3);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str8 = publishMessage7.getTopic();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage(header0);
        java.lang.Class<?> wildcardClass2 = unsubscribeMessage1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.QoS qoS8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage4.addTopic("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelClosed(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("MQIsdp");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]" + "'", str2, "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.isCleanSession();
        boolean boolean7 = connectMessage1.isCleanSession();
        java.lang.String str8 = connectMessage1.getWillTopic();
        byte byte9 = connectMessage1.getProtocolVersion();
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type14 = header13.getType();
        org.meqantt.message.Message.Type type15 = header13.getType();
        org.meqantt.message.PubRelMessage pubRelMessage16 = new org.meqantt.message.PubRelMessage(header13);
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage(header13);
        boolean boolean18 = subAckMessage17.isRetained();
        org.meqantt.message.QoS qoS19 = subAckMessage17.getQos();
        connectMessage1.setWill("\000\003hi!", "\000d\000\001\001d", qoS19, true);
        boolean boolean22 = connectMessage1.hasUsername();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 3 + "'", byte9 == (byte) 3);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS5 = unsubscribeMessage4.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) subscribeMessage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str19 = connectMessage18.getProtocolId();
        org.meqantt.message.QoS qoS20 = connectMessage18.getQos();
        subscribeMessage11.addTopic("", qoS20);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage23 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList24 = unsubscribeMessage23.getTopics();
        org.meqantt.message.Message.Type type25 = unsubscribeMessage23.getType();
        java.util.List<java.lang.String> strList26 = unsubscribeMessage23.getTopics();
        org.meqantt.message.QoS qoS27 = unsubscribeMessage23.getQos();
        subscribeMessage11.setQos(qoS27);
        subAckMessage10.addQoS(qoS27);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type25.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.hasUsername();
        boolean boolean6 = connectMessage1.hasUsername();
        connectMessage1.setWill("MQIsdp", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage3.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage3.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage3.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        subAckMessage3.addQoS(qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getProtocolId();
        org.meqantt.message.QoS qoS21 = connectMessage19.getQos();
        subscribeMessage13.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS21);
        subAckMessage3.addQoS(qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS29 = subscribeMessage27.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS29);
        org.meqantt.message.QoS qoS32 = subscribeMessage31.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList37 = subscribeMessage36.getTopics();
        org.meqantt.message.QoS qoS38 = subscribeMessage36.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS38);
        org.meqantt.message.QoS qoS41 = subscribeMessage40.getQos();
        subscribeMessage31.addTopic("", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("", qoS41);
        subAckMessage3.addQoS(qoS41);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setQos(qoS41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.hasPassword();
        boolean boolean7 = connectMessage1.isCleanSession();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS12);
        org.meqantt.message.QoS qoS15 = subscribeMessage14.getQos();
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage("\000\000", false, (int) (short) -1);
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str32 = connectMessage31.getUsername();
        org.meqantt.message.QoS qoS36 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList40 = subscribeMessage39.getTopics();
        org.meqantt.message.QoS qoS41 = subscribeMessage39.getQos();
        subscribeMessage37.addTopic("", qoS41);
        connectMessage31.setWill("", "\000d\000\001\001d", qoS41, true);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage("hi!", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage("", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS41);
        connectMessage20.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS41, false);
        subscribeMessage14.addTopic("00: 01100100 d 100\n01: 00000000 \000 0\n", qoS41);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        subAckMessage0.addQoS(qoS7);
        org.meqantt.message.Message.Header header11 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header11);
        org.meqantt.message.PubCompMessage pubCompMessage13 = new org.meqantt.message.PubCompMessage(header11);
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage(header11);
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList16 = subAckMessage15.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList17 = subAckMessage15.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str22 = connectMessage21.getProtocolId();
        org.meqantt.message.QoS qoS23 = connectMessage21.getQos();
        subAckMessage15.addQoS(qoS23);
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean29 = connectMessage28.hasWill();
        java.lang.String str30 = connectMessage28.getWill();
        org.meqantt.message.Message.Header header33 = null;
        org.meqantt.message.ConnectMessage connectMessage34 = new org.meqantt.message.ConnectMessage(header33);
        boolean boolean35 = connectMessage34.isWillRetained();
        boolean boolean36 = connectMessage34.isWillRetained();
        java.lang.String str37 = connectMessage34.getUsername();
        org.meqantt.message.QoS qoS41 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList45 = subscribeMessage44.getTopics();
        org.meqantt.message.QoS qoS46 = subscribeMessage44.getQos();
        subscribeMessage42.addTopic("", qoS46);
        connectMessage34.setWill("hi!", "", qoS46, false);
        connectMessage28.setWill("MQIsdp", "hi!", qoS46, false);
        org.meqantt.message.SubAckMessage subAckMessage54 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList55 = subAckMessage54.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList56 = subAckMessage54.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList57 = subAckMessage54.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList60 = subscribeMessage59.getTopics();
        org.meqantt.message.QoS qoS61 = subscribeMessage59.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage62 = new org.meqantt.message.SubscribeMessage("", qoS61);
        subAckMessage54.addQoS(qoS61);
        connectMessage28.setWill("hi!", "MQIsdp", qoS61, true);
        subAckMessage15.addQoS(qoS61);
        subAckMessage14.addQoS(qoS61);
        subAckMessage0.addQoS(qoS61);
        org.meqantt.message.QoS qoS70 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage71 = new org.meqantt.message.SubscribeMessage("", qoS70);
        int int72 = subscribeMessage71.getMessageId();
        subscribeMessage71.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header76 = null;
        org.meqantt.message.ConnectMessage connectMessage77 = new org.meqantt.message.ConnectMessage(header76);
        int int78 = connectMessage77.getKeepAlive();
        connectMessage77.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS82 = connectMessage77.getWillQoS();
        subscribeMessage71.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS82);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS82);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList16);
        org.junit.Assert.assertNull(qoSList17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + qoS46 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS46.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList55);
        org.junit.Assert.assertNull(qoSList56);
        org.junit.Assert.assertNull(qoSList57);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + qoS61 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS61.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + qoS82 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS82.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage3.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus5 = connAckMessage3.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus4);
        org.junit.Assert.assertNull(connectionStatus5);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.meqantt.MqttListener mqttListener13 = null;
        mqttMessageHandler0.setListener(mqttListener13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getWillTopic();
        java.lang.String str4 = connectMessage1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        org.meqantt.message.DisconnectMessage disconnectMessage0 = new org.meqantt.message.DisconnectMessage();
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        boolean boolean4 = connectMessage3.isWillRetained();
        boolean boolean5 = connectMessage3.isWillRetained();
        java.lang.String str6 = connectMessage3.getUsername();
        connectMessage3.setCredentials("\000d\000\001\001d", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getUsername();
        org.meqantt.message.QoS qoS24 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS29 = subscribeMessage27.getQos();
        subscribeMessage25.addTopic("", qoS29);
        connectMessage19.setWill("", "\000d\000\001\001d", qoS29, true);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("hi!", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList39 = subscribeMessage38.getTopics();
        org.meqantt.message.ConnectMessage connectMessage44 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str45 = connectMessage44.getProtocolId();
        org.meqantt.message.QoS qoS46 = connectMessage44.getQos();
        subscribeMessage38.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS46);
        subscribeMessage36.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS46);
        org.meqantt.message.ConnectMessage connectMessage53 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str54 = connectMessage53.getProtocolId();
        org.meqantt.message.QoS qoS55 = connectMessage53.getQos();
        subscribeMessage36.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS55);
        org.meqantt.message.ConnectMessage connectMessage65 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str66 = connectMessage65.getUsername();
        org.meqantt.message.QoS qoS70 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage71 = new org.meqantt.message.SubscribeMessage("", qoS70);
        org.meqantt.message.SubscribeMessage subscribeMessage73 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList74 = subscribeMessage73.getTopics();
        org.meqantt.message.QoS qoS75 = subscribeMessage73.getQos();
        subscribeMessage71.addTopic("", qoS75);
        connectMessage65.setWill("", "\000d\000\001\001d", qoS75, true);
        org.meqantt.message.SubscribeMessage subscribeMessage79 = new org.meqantt.message.SubscribeMessage("hi!", qoS75);
        org.meqantt.message.SubscribeMessage subscribeMessage80 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS75);
        org.meqantt.message.SubscribeMessage subscribeMessage81 = new org.meqantt.message.SubscribeMessage("", qoS75);
        org.meqantt.message.SubscribeMessage subscribeMessage82 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS75);
        subscribeMessage36.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS75);
        connectMessage3.setWill("\000d\000\001\001d", "\001\003\003\001", qoS75, false);
        org.meqantt.message.SubscribeMessage subscribeMessage86 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS75);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage0.setQos(qoS75);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "MQIsdp" + "'", str45, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS46 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS46.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "MQIsdp" + "'", str54, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + qoS75 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS75.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        org.meqantt.message.Message.Header header2 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage3 = new org.meqantt.message.PingReqMessage(header2);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header2);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header2);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage6.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getProtocolId();
        org.meqantt.message.QoS qoS14 = connectMessage12.getQos();
        subAckMessage6.addQoS(qoS14);
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean20 = connectMessage19.hasWill();
        java.lang.String str21 = connectMessage19.getWill();
        org.meqantt.message.Message.Header header24 = null;
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage(header24);
        boolean boolean26 = connectMessage25.isWillRetained();
        boolean boolean27 = connectMessage25.isWillRetained();
        java.lang.String str28 = connectMessage25.getUsername();
        org.meqantt.message.QoS qoS32 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList36 = subscribeMessage35.getTopics();
        org.meqantt.message.QoS qoS37 = subscribeMessage35.getQos();
        subscribeMessage33.addTopic("", qoS37);
        connectMessage25.setWill("hi!", "", qoS37, false);
        connectMessage19.setWill("MQIsdp", "hi!", qoS37, false);
        org.meqantt.message.SubAckMessage subAckMessage45 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList46 = subAckMessage45.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList47 = subAckMessage45.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList48 = subAckMessage45.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList51 = subscribeMessage50.getTopics();
        org.meqantt.message.QoS qoS52 = subscribeMessage50.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage("", qoS52);
        subAckMessage45.addQoS(qoS52);
        connectMessage19.setWill("hi!", "MQIsdp", qoS52, true);
        subAckMessage6.addQoS(qoS52);
        subAckMessage5.addQoS(qoS52);
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS52);
        org.meqantt.message.ConnectMessage connectMessage63 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str64 = connectMessage63.getUsername();
        org.meqantt.message.QoS qoS68 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage69 = new org.meqantt.message.SubscribeMessage("", qoS68);
        org.meqantt.message.SubscribeMessage subscribeMessage71 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList72 = subscribeMessage71.getTopics();
        org.meqantt.message.QoS qoS73 = subscribeMessage71.getQos();
        subscribeMessage69.addTopic("", qoS73);
        connectMessage63.setWill("", "\000d\000\001\001d", qoS73, true);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage59.setQos(qoS73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + qoS37 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS37.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList46);
        org.junit.Assert.assertNull(qoSList47);
        org.junit.Assert.assertNull(qoSList48);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertTrue("'" + qoS73 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS73.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\000");
        unsubscribeMessage1.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getProtocolId();
        org.meqantt.message.QoS qoS13 = connectMessage11.getQos();
        subscribeMessage4.addTopic("", qoS13);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        boolean boolean4 = connectMessage2.hasUsername();
        java.lang.String str5 = connectMessage2.getWill();
        boolean boolean6 = connectMessage2.isRetained();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        connectMessage2.setWill("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", qoS11, false);
        java.lang.String str14 = connectMessage2.getProtocolId();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MQIsdp" + "'", str14, "MQIsdp");
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        connectMessage1.setCredentials("00: 01100100 d 100\n01: 00000000 \000 0\n", "00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getWillTopic();
        boolean boolean4 = connectMessage1.isCleanSession();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setWill("\000\000", "\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.meqantt.MqttListener mqttListener13 = null;
        mqttMessageHandler0.setListener(mqttListener13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelConnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        java.lang.String str4 = connectMessage3.getPassword();
        boolean boolean5 = connectMessage3.hasPassword();
        byte byte6 = connectMessage3.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage(1);
        pubAckMessage1.setMessageId((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        boolean boolean4 = connectMessage2.hasUsername();
        java.lang.String str5 = connectMessage2.getWill();
        boolean boolean6 = connectMessage2.isRetained();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        connectMessage2.setWill("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", qoS11, false);
        java.lang.Class<?> wildcardClass14 = qoS11.getClass();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.isCleanSession();
        boolean boolean7 = connectMessage1.isCleanSession();
        boolean boolean8 = connectMessage1.hasPassword();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList2 = subscribeMessage1.getTopics();
        org.meqantt.message.QoS qoS3 = subscribeMessage1.getQos();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getProtocolId();
        org.meqantt.message.QoS qoS10 = connectMessage8.getQos();
        subscribeMessage1.addTopic("", qoS10);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage13 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList14 = unsubscribeMessage13.getTopics();
        org.meqantt.message.Message.Type type15 = unsubscribeMessage13.getType();
        java.util.List<java.lang.String> strList16 = unsubscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS17 = unsubscribeMessage13.getQos();
        subscribeMessage1.setQos(qoS17);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setQos(qoS17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + qoS3 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS3.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type15.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) 'a');
        org.meqantt.message.QoS qoS4 = connectMessage3.getWillQoS();
        org.meqantt.message.QoS qoS5 = connectMessage3.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS13);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("\000\000", qoS13);
        connectMessage3.setWill("\000\000", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS13, false);
        java.lang.String str19 = connectMessage3.getWill();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getUsername();
        java.lang.String str25 = connectMessage23.getWill();
        org.meqantt.message.Message.Header header29 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type30 = header29.getType();
        org.meqantt.message.Message.Type type31 = header29.getType();
        org.meqantt.message.PubRelMessage pubRelMessage32 = new org.meqantt.message.PubRelMessage(header29);
        org.meqantt.message.SubAckMessage subAckMessage33 = new org.meqantt.message.SubAckMessage(header29);
        boolean boolean34 = subAckMessage33.isRetained();
        org.meqantt.message.QoS qoS35 = subAckMessage33.getQos();
        connectMessage23.setWill("\000\003hi!", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS35, false);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoS4);
        org.junit.Assert.assertNull(qoS5);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str19, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(type30);
        org.junit.Assert.assertNull(type31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str7 = connectMessage6.getWill();
        connectMessage6.setWill("\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
        connectMessage6.setCredentials("00: 01100100 d 100\n01: 00000000 \000 0\n", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getProtocolId();
        byte[] byteArray16 = connectMessage14.toBytes();
        org.meqantt.message.QoS qoS17 = connectMessage14.getWillQoS();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getProtocolId();
        byte[] byteArray25 = connectMessage23.toBytes();
        org.meqantt.message.QoS qoS26 = connectMessage23.getQos();
        connectMessage14.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS26, true);
        subscribeMessage9.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS26);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage9.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertNull(qoS17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MQIsdp" + "'", str24, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getWillTopic();
        boolean boolean4 = connectMessage1.isCleanSession();
        boolean boolean5 = connectMessage1.hasPassword();
        java.lang.String str6 = connectMessage1.getProtocolId();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        boolean boolean6 = subAckMessage5.isRetained();
        org.meqantt.message.QoS qoS7 = subAckMessage5.getQos();
        org.meqantt.message.PublishMessage publishMessage10 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        org.meqantt.message.QoS qoS11 = publishMessage10.getQos();
        subAckMessage5.addQoS(qoS11);
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage5.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList13);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(1);
        pubRecMessage1.setMessageId(10);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("hi!");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        nettyClient1.connect("MQIsdp", (int) (byte) 0);
        nettyClient1.subscribe("");
        nettyClient1.publish("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        nettyClient1.ping();
        nettyClient1.subscribe("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.meqantt.MqttListener mqttListener13 = null;
        mqttMessageHandler0.setListener(mqttListener13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleUpstream(channelHandlerContext15, channelEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        nettyClient1.connect("MQIsdp", (int) (byte) 0);
        nettyClient1.disconnect();
        nettyClient1.ping();
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("", byteArray7);
        java.lang.String str9 = publishMessage8.getDataAsString();
        byte[] byteArray10 = publishMessage8.getData();
        byte[] byteArray11 = publishMessage8.getData();
        java.lang.String str12 = publishMessage8.getTopic();
        java.lang.String str13 = publishMessage8.getTopic();
        java.lang.String str14 = publishMessage8.getTopic();
        java.lang.String str15 = publishMessage8.getTopic();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\000\001\001d" + "'", str9, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList5 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList6 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '\001');
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage2.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        subAckMessage2.addQoS(qoS9);
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage14 = new org.meqantt.message.PingReqMessage(header13);
        org.meqantt.message.PubCompMessage pubCompMessage15 = new org.meqantt.message.PubCompMessage(header13);
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage(header13);
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList18 = subAckMessage17.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList19 = subAckMessage17.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getProtocolId();
        org.meqantt.message.QoS qoS25 = connectMessage23.getQos();
        subAckMessage17.addQoS(qoS25);
        org.meqantt.message.ConnectMessage connectMessage30 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean31 = connectMessage30.hasWill();
        java.lang.String str32 = connectMessage30.getWill();
        org.meqantt.message.Message.Header header35 = null;
        org.meqantt.message.ConnectMessage connectMessage36 = new org.meqantt.message.ConnectMessage(header35);
        boolean boolean37 = connectMessage36.isWillRetained();
        boolean boolean38 = connectMessage36.isWillRetained();
        java.lang.String str39 = connectMessage36.getUsername();
        org.meqantt.message.QoS qoS43 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage("", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList47 = subscribeMessage46.getTopics();
        org.meqantt.message.QoS qoS48 = subscribeMessage46.getQos();
        subscribeMessage44.addTopic("", qoS48);
        connectMessage36.setWill("hi!", "", qoS48, false);
        connectMessage30.setWill("MQIsdp", "hi!", qoS48, false);
        org.meqantt.message.SubAckMessage subAckMessage56 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList57 = subAckMessage56.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList58 = subAckMessage56.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList59 = subAckMessage56.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList62 = subscribeMessage61.getTopics();
        org.meqantt.message.QoS qoS63 = subscribeMessage61.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage64 = new org.meqantt.message.SubscribeMessage("", qoS63);
        subAckMessage56.addQoS(qoS63);
        connectMessage30.setWill("hi!", "MQIsdp", qoS63, true);
        subAckMessage17.addQoS(qoS63);
        subAckMessage16.addQoS(qoS63);
        subAckMessage2.addQoS(qoS63);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS63);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList18);
        org.junit.Assert.assertNull(qoSList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MQIsdp" + "'", str24, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList57);
        org.junit.Assert.assertNull(qoSList58);
        org.junit.Assert.assertNull(qoSList59);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + qoS63 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS63.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Header header8 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str9 = header8.toString();
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header8);
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header8);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage14 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS15 = unsubscribeMessage14.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        publishMessage11.setQos(qoS15);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage6.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str9, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage9 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage9.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        boolean boolean4 = connectMessage2.hasUsername();
        java.lang.String str5 = connectMessage2.getWill();
        boolean boolean6 = connectMessage2.isRetained();
        connectMessage2.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 01110000 p 112?01: 00000010 ? 2?02: 00000000 ? 0?03: 00001010 ? 10?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        org.meqantt.message.QoS qoS6 = null;
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        byte[] byteArray1 = org.meqantt.util.FormatUtil.toMQttString("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 61, 72, 101, 97, 100, 101, 114, 32, 91, 116, 121, 112, 101, 61, 110, 117, 108, 108, 44, 32, 114, 101, 116, 97, 105, 110, 61, 102, 97, 108, 115, 101, 44, 32, 113, 111, 115, 61, 65, 84, 95, 76, 69, 65, 83, 84, 95, 79, 78, 67, 69, 44, 32, 100, 117, 112, 61, 116, 114, 117, 101, 93]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        java.lang.String str4 = connectMessage1.getProtocolId();
        connectMessage1.setCredentials("hi!", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) 'a');
        org.meqantt.message.QoS qoS9 = connectMessage8.getWillQoS();
        org.meqantt.message.QoS qoS10 = connectMessage8.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.QoS qoS18 = subscribeMessage16.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("\000\000", qoS18);
        connectMessage8.setWill("\000\000", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS18, false);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoS9);
        org.junit.Assert.assertNull(qoS10);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        byte[] byteArray4 = publishMessage1.getData();
        byte[] byteArray5 = publishMessage1.getData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = publishMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage10 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getClientId();
        connectMessage1.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS13 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS2 = unsubscribeMessage1.getQos();
        unsubscribeMessage1.setDup(false);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage5.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getProtocolId();
        org.meqantt.message.QoS qoS13 = connectMessage11.getQos();
        subAckMessage5.addQoS(qoS13);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        org.meqantt.message.QoS qoS6 = connectMessage1.getWillQoS();
        java.lang.String str7 = connectMessage1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type14 = header13.getType();
        org.meqantt.message.Message.Type type15 = header13.getType();
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage(header13);
        org.meqantt.message.PingReqMessage pingReqMessage17 = new org.meqantt.message.PingReqMessage(header13);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage(header13);
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        int int24 = subscribeMessage23.getMessageId();
        subscribeMessage23.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header28 = null;
        org.meqantt.message.ConnectMessage connectMessage29 = new org.meqantt.message.ConnectMessage(header28);
        int int30 = connectMessage29.getKeepAlive();
        connectMessage29.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS34 = connectMessage29.getWillQoS();
        subscribeMessage23.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS34);
        subscribeMessage18.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS34);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage11.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) '#');
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header5);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header5);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage9.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str16 = connectMessage15.getProtocolId();
        org.meqantt.message.QoS qoS17 = connectMessage15.getQos();
        subAckMessage9.addQoS(qoS17);
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean23 = connectMessage22.hasWill();
        java.lang.String str24 = connectMessage22.getWill();
        org.meqantt.message.Message.Header header27 = null;
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage(header27);
        boolean boolean29 = connectMessage28.isWillRetained();
        boolean boolean30 = connectMessage28.isWillRetained();
        java.lang.String str31 = connectMessage28.getUsername();
        org.meqantt.message.QoS qoS35 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList39 = subscribeMessage38.getTopics();
        org.meqantt.message.QoS qoS40 = subscribeMessage38.getQos();
        subscribeMessage36.addTopic("", qoS40);
        connectMessage28.setWill("hi!", "", qoS40, false);
        connectMessage22.setWill("MQIsdp", "hi!", qoS40, false);
        org.meqantt.message.SubAckMessage subAckMessage48 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList49 = subAckMessage48.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList50 = subAckMessage48.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList51 = subAckMessage48.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList54 = subscribeMessage53.getTopics();
        org.meqantt.message.QoS qoS55 = subscribeMessage53.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage("", qoS55);
        subAckMessage48.addQoS(qoS55);
        connectMessage22.setWill("hi!", "MQIsdp", qoS55, true);
        subAckMessage9.addQoS(qoS55);
        subAckMessage8.addQoS(qoS55);
        org.meqantt.message.SubscribeMessage subscribeMessage62 = new org.meqantt.message.SubscribeMessage("\000\003hi!", qoS55);
        org.meqantt.message.SubscribeMessage subscribeMessage63 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS55);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MQIsdp" + "'", str16, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList49);
        org.junit.Assert.assertNull(qoSList50);
        org.junit.Assert.assertNull(qoSList51);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS5);
        org.meqantt.message.QoS qoS8 = subscribeMessage7.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS14);
        org.meqantt.message.QoS qoS17 = subscribeMessage16.getQos();
        subscribeMessage7.addTopic("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean24 = connectMessage23.hasWill();
        java.lang.String str25 = connectMessage23.getWill();
        org.meqantt.message.Message.Header header28 = null;
        org.meqantt.message.ConnectMessage connectMessage29 = new org.meqantt.message.ConnectMessage(header28);
        boolean boolean30 = connectMessage29.isWillRetained();
        boolean boolean31 = connectMessage29.isWillRetained();
        java.lang.String str32 = connectMessage29.getUsername();
        org.meqantt.message.QoS qoS36 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList40 = subscribeMessage39.getTopics();
        org.meqantt.message.QoS qoS41 = subscribeMessage39.getQos();
        subscribeMessage37.addTopic("", qoS41);
        connectMessage29.setWill("hi!", "", qoS41, false);
        connectMessage23.setWill("MQIsdp", "hi!", qoS41, false);
        org.meqantt.message.QoS qoS47 = connectMessage23.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage19.setQos(qoS47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.isCleanSession();
        boolean boolean7 = connectMessage1.isCleanSession();
        java.lang.String str8 = connectMessage1.getWillTopic();
        byte byte9 = connectMessage1.getProtocolVersion();
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type14 = header13.getType();
        org.meqantt.message.Message.Type type15 = header13.getType();
        org.meqantt.message.PubRelMessage pubRelMessage16 = new org.meqantt.message.PubRelMessage(header13);
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage(header13);
        boolean boolean18 = subAckMessage17.isRetained();
        org.meqantt.message.QoS qoS19 = subAckMessage17.getQos();
        connectMessage1.setWill("\000\003hi!", "\000d\000\001\001d", qoS19, true);
        java.lang.String str22 = connectMessage1.getUsername();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 3 + "'", byte9 == (byte) 3);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str6 = publishMessage5.getTopic();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isWillRetained();
        int int4 = connectMessage1.getKeepAlive();
        java.lang.String str5 = connectMessage1.getWill();
        boolean boolean6 = connectMessage1.hasWill();
        byte byte7 = connectMessage1.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 3 + "'", byte7 == (byte) 3);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.hasUsername();
        boolean boolean6 = connectMessage1.hasUsername();
        connectMessage1.setWill("MQIsdp", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        boolean boolean10 = connectMessage1.isCleanSession();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        org.meqantt.message.DisconnectMessage disconnectMessage0 = new org.meqantt.message.DisconnectMessage();
        org.meqantt.message.SubAckMessage subAckMessage1 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage1.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage1.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage1.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        subAckMessage1.addQoS(qoS8);
        org.meqantt.message.QoS qoS11 = subAckMessage1.getQos();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage0.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage12 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Header header15 = null;
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage(header15);
        java.lang.String str17 = connectMessage16.getPassword();
        java.lang.String str18 = connectMessage16.getWillTopic();
        boolean boolean19 = connectMessage16.isCleanSession();
        boolean boolean20 = connectMessage16.hasPassword();
        org.meqantt.message.PubRelMessage pubRelMessage24 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS25 = pubRelMessage24.getQos();
        connectMessage16.setWill("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS25, false);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS25);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage13.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS4);
        org.meqantt.message.QoS qoS7 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS13);
        org.meqantt.message.QoS qoS16 = subscribeMessage15.getQos();
        subscribeMessage6.addTopic("", qoS16);
        org.meqantt.message.Message.Type type18 = subscribeMessage6.getType();
        java.util.List<org.meqantt.message.QoS> qoSList19 = subscribeMessage6.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str25 = connectMessage24.getUsername();
        org.meqantt.message.QoS qoS29 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList33 = subscribeMessage32.getTopics();
        org.meqantt.message.QoS qoS34 = subscribeMessage32.getQos();
        subscribeMessage30.addTopic("", qoS34);
        connectMessage24.setWill("", "\000d\000\001\001d", qoS34, true);
        java.lang.String str38 = connectMessage24.getPassword();
        boolean boolean39 = connectMessage24.isWillRetained();
        org.meqantt.message.QoS qoS40 = connectMessage24.getWillQoS();
        subscribeMessage6.addTopic("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS40);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type18.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(qoSList19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("");
        org.meqantt.message.Message.Header header8 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header8);
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header8);
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header8);
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage12.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList14 = subAckMessage12.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str19 = connectMessage18.getProtocolId();
        org.meqantt.message.QoS qoS20 = connectMessage18.getQos();
        subAckMessage12.addQoS(qoS20);
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean26 = connectMessage25.hasWill();
        java.lang.String str27 = connectMessage25.getWill();
        org.meqantt.message.Message.Header header30 = null;
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage(header30);
        boolean boolean32 = connectMessage31.isWillRetained();
        boolean boolean33 = connectMessage31.isWillRetained();
        java.lang.String str34 = connectMessage31.getUsername();
        org.meqantt.message.QoS qoS38 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.QoS qoS43 = subscribeMessage41.getQos();
        subscribeMessage39.addTopic("", qoS43);
        connectMessage31.setWill("hi!", "", qoS43, false);
        connectMessage25.setWill("MQIsdp", "hi!", qoS43, false);
        org.meqantt.message.SubAckMessage subAckMessage51 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList52 = subAckMessage51.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList53 = subAckMessage51.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList54 = subAckMessage51.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList57 = subscribeMessage56.getTopics();
        org.meqantt.message.QoS qoS58 = subscribeMessage56.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("", qoS58);
        subAckMessage51.addQoS(qoS58);
        connectMessage25.setWill("hi!", "MQIsdp", qoS58, true);
        subAckMessage12.addQoS(qoS58);
        subAckMessage11.addQoS(qoS58);
        org.meqantt.message.SubscribeMessage subscribeMessage65 = new org.meqantt.message.SubscribeMessage("\000\003hi!", qoS58);
        org.meqantt.message.SubscribeMessage subscribeMessage66 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS58);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNull(qoSList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList52);
        org.junit.Assert.assertNull(qoSList53);
        org.junit.Assert.assertNull(qoSList54);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + qoS58 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS58.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage6 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage14.setWill("", "\000d\000\001\001d", qoS24, true);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("hi!", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage6.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.meqantt.MqttListener mqttListener13 = null;
        mqttMessageHandler0.setListener(mqttListener13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelDisconnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        byte[] byteArray3 = org.meqantt.util.FormatUtil.toMQttString("\000d\000\001\001d");
        org.meqantt.message.PublishMessage publishMessage4 = new org.meqantt.message.PublishMessage("hi!", byteArray3);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", byteArray3);
        boolean boolean6 = publishMessage5.isDup();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        boolean boolean8 = pubAckMessage7.isDup();
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage9.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        subAckMessage9.addQoS(qoS16);
        org.meqantt.message.Message.Header header20 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage21 = new org.meqantt.message.PingReqMessage(header20);
        org.meqantt.message.PubCompMessage pubCompMessage22 = new org.meqantt.message.PubCompMessage(header20);
        org.meqantt.message.SubAckMessage subAckMessage23 = new org.meqantt.message.SubAckMessage(header20);
        org.meqantt.message.SubAckMessage subAckMessage24 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList25 = subAckMessage24.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList26 = subAckMessage24.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage30 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str31 = connectMessage30.getProtocolId();
        org.meqantt.message.QoS qoS32 = connectMessage30.getQos();
        subAckMessage24.addQoS(qoS32);
        org.meqantt.message.ConnectMessage connectMessage37 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean38 = connectMessage37.hasWill();
        java.lang.String str39 = connectMessage37.getWill();
        org.meqantt.message.Message.Header header42 = null;
        org.meqantt.message.ConnectMessage connectMessage43 = new org.meqantt.message.ConnectMessage(header42);
        boolean boolean44 = connectMessage43.isWillRetained();
        boolean boolean45 = connectMessage43.isWillRetained();
        java.lang.String str46 = connectMessage43.getUsername();
        org.meqantt.message.QoS qoS50 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("", qoS50);
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList54 = subscribeMessage53.getTopics();
        org.meqantt.message.QoS qoS55 = subscribeMessage53.getQos();
        subscribeMessage51.addTopic("", qoS55);
        connectMessage43.setWill("hi!", "", qoS55, false);
        connectMessage37.setWill("MQIsdp", "hi!", qoS55, false);
        org.meqantt.message.SubAckMessage subAckMessage63 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList64 = subAckMessage63.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList65 = subAckMessage63.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList66 = subAckMessage63.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage68 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList69 = subscribeMessage68.getTopics();
        org.meqantt.message.QoS qoS70 = subscribeMessage68.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage71 = new org.meqantt.message.SubscribeMessage("", qoS70);
        subAckMessage63.addQoS(qoS70);
        connectMessage37.setWill("hi!", "MQIsdp", qoS70, true);
        subAckMessage24.addQoS(qoS70);
        subAckMessage23.addQoS(qoS70);
        subAckMessage9.addQoS(qoS70);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setQos(qoS70);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList25);
        org.junit.Assert.assertNull(qoSList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MQIsdp" + "'", str31, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList64);
        org.junit.Assert.assertNull(qoSList65);
        org.junit.Assert.assertNull(qoSList66);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + qoS70 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS70.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((-1));
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        java.lang.String str4 = connectMessage3.getClientId();
        connectMessage3.setWill("hi!", "");
        boolean boolean8 = connectMessage3.hasPassword();
        boolean boolean9 = connectMessage3.isCleanSession();
        boolean boolean10 = connectMessage3.hasWill();
        org.meqantt.message.QoS qoS11 = connectMessage3.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.QoS qoS5 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage7 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 00000000 ? 0?01: 00001000 ? 8?02: 11000000 A? 192?03: 10000000 ? 128?04: 01100100 d 100?05: 11000000 A? 192?06: 10000000 ? 128?07: 00000001 ? 1?08: 00000001 ? 1?09: 01100100 d 100?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        byte[] byteArray2 = pubCompMessage1.toBytes();
        boolean boolean3 = pubCompMessage1.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[112, 2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelUnbound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        boolean boolean8 = connectMessage7.isWillRetained();
        boolean boolean9 = connectMessage7.isWillRetained();
        connectMessage7.setWill("", "MQIsdp");
        boolean boolean13 = connectMessage7.isWillRetained();
        java.lang.String str14 = connectMessage7.getClientId();
        int int15 = connectMessage7.getKeepAlive();
        org.meqantt.message.Message.Header header19 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage20 = new org.meqantt.message.PingReqMessage(header19);
        org.meqantt.message.PubCompMessage pubCompMessage21 = new org.meqantt.message.PubCompMessage(header19);
        org.meqantt.message.PubAckMessage pubAckMessage22 = new org.meqantt.message.PubAckMessage(header19);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage23 = new org.meqantt.message.UnsubscribeMessage(header19);
        org.meqantt.message.PublishMessage publishMessage24 = new org.meqantt.message.PublishMessage(header19);
        org.meqantt.message.Message.Type type25 = header19.getType();
        org.meqantt.message.PingReqMessage pingReqMessage26 = new org.meqantt.message.PingReqMessage(header19);
        org.meqantt.message.PingReqMessage pingReqMessage27 = new org.meqantt.message.PingReqMessage(header19);
        org.meqantt.message.SubAckMessage subAckMessage28 = new org.meqantt.message.SubAckMessage(header19);
        org.meqantt.message.ConnectMessage connectMessage34 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str35 = connectMessage34.getUsername();
        org.meqantt.message.QoS qoS39 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("", qoS39);
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList43 = subscribeMessage42.getTopics();
        org.meqantt.message.QoS qoS44 = subscribeMessage42.getQos();
        subscribeMessage40.addTopic("", qoS44);
        connectMessage34.setWill("", "\000d\000\001\001d", qoS44, true);
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage("hi!", qoS44);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS44);
        subAckMessage28.addQoS(qoS44);
        connectMessage7.setWill("\000\000", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS44, true);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage5.setQos(qoS44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(type25);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage5.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        subAckMessage5.addQoS(qoS12);
        org.meqantt.message.QoS qoS15 = subAckMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("", qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS20);
        org.meqantt.message.QoS qoS23 = subscribeMessage22.getQos();
        subAckMessage5.addQoS(qoS23);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("hi!");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.publish("\000\000", "\000\003hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage11.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        boolean boolean4 = connectMessage3.isWillRetained();
        boolean boolean5 = connectMessage3.isWillRetained();
        java.lang.String str6 = connectMessage3.getUsername();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        connectMessage3.setWill("hi!", "", qoS15, false);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage13 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.util.List<java.lang.String> strList14 = unsubscribeMessage13.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage13.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        int int5 = connectMessage3.getKeepAlive();
        connectMessage3.setCredentials("MQIsdp", "MQIsdp");
        org.meqantt.message.QoS qoS9 = connectMessage3.getWillQoS();
        boolean boolean10 = connectMessage3.hasPassword();
        java.lang.String str11 = connectMessage3.getPassword();
        org.meqantt.message.QoS qoS12 = connectMessage3.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(qoS9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MQIsdp" + "'", str11, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        byte[] byteArray4 = publishMessage1.getData();
        byte[] byteArray5 = publishMessage1.getData();
        byte[] byteArray6 = publishMessage1.getData();
        java.lang.String str7 = publishMessage1.getTopic();
        int int8 = publishMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = publishMessage1.getDataAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\000");
        unsubscribeMessage1.addTopic("\000\000");
        unsubscribeMessage1.addTopic("");
        org.meqantt.message.Message.Type type6 = unsubscribeMessage1.getType();
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type6.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage8.write(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) -1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS7);
        org.meqantt.message.QoS qoS10 = subscribeMessage9.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS16);
        org.meqantt.message.QoS qoS19 = subscribeMessage18.getQos();
        subscribeMessage9.addTopic("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("", qoS19);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        boolean boolean4 = unsubscribeMessage1.isRetained();
        unsubscribeMessage1.addTopic("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.DisconnectMessage disconnectMessage1 = new org.meqantt.message.DisconnectMessage(header0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header3);
        byte byte5 = connectMessage4.getProtocolVersion();
        boolean boolean6 = connectMessage4.hasUsername();
        java.lang.String str7 = connectMessage4.getWill();
        boolean boolean8 = connectMessage4.isRetained();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        connectMessage4.setWill("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", qoS13, false);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage1.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeRequested(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean10 = connectMessage9.hasWill();
        java.lang.String str11 = connectMessage9.getWill();
        org.meqantt.message.Message.Header header14 = null;
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage(header14);
        boolean boolean16 = connectMessage15.isWillRetained();
        boolean boolean17 = connectMessage15.isWillRetained();
        java.lang.String str18 = connectMessage15.getUsername();
        org.meqantt.message.QoS qoS22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        subscribeMessage23.addTopic("", qoS27);
        connectMessage15.setWill("hi!", "", qoS27, false);
        connectMessage9.setWill("MQIsdp", "hi!", qoS27, false);
        org.meqantt.message.QoS qoS33 = connectMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage5.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 10);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        subAckMessage2.addQoS(qoS6);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage12 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList13 = unsubscribeMessage12.getTopics();
        org.meqantt.message.Message.Type type14 = unsubscribeMessage12.getType();
        java.util.List<java.lang.String> strList15 = unsubscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS16 = unsubscribeMessage12.getQos();
        subscribeMessage0.setQos(qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("\000\000", qoS23);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type14.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage12 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList15 = subAckMessage14.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList16 = subAckMessage14.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str21 = connectMessage20.getProtocolId();
        org.meqantt.message.QoS qoS22 = connectMessage20.getQos();
        subAckMessage14.addQoS(qoS22);
        org.meqantt.message.ConnectMessage connectMessage27 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean28 = connectMessage27.hasWill();
        java.lang.String str29 = connectMessage27.getWill();
        org.meqantt.message.Message.Header header32 = null;
        org.meqantt.message.ConnectMessage connectMessage33 = new org.meqantt.message.ConnectMessage(header32);
        boolean boolean34 = connectMessage33.isWillRetained();
        boolean boolean35 = connectMessage33.isWillRetained();
        java.lang.String str36 = connectMessage33.getUsername();
        org.meqantt.message.QoS qoS40 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage("", qoS40);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList44 = subscribeMessage43.getTopics();
        org.meqantt.message.QoS qoS45 = subscribeMessage43.getQos();
        subscribeMessage41.addTopic("", qoS45);
        connectMessage33.setWill("hi!", "", qoS45, false);
        connectMessage27.setWill("MQIsdp", "hi!", qoS45, false);
        org.meqantt.message.SubAckMessage subAckMessage53 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList54 = subAckMessage53.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList55 = subAckMessage53.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList56 = subAckMessage53.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList59 = subscribeMessage58.getTopics();
        org.meqantt.message.QoS qoS60 = subscribeMessage58.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage("", qoS60);
        subAckMessage53.addQoS(qoS60);
        connectMessage27.setWill("hi!", "MQIsdp", qoS60, true);
        subAckMessage14.addQoS(qoS60);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage13.setQos(qoS60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(qoSList15);
        org.junit.Assert.assertNull(qoSList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MQIsdp" + "'", str21, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + qoS45 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS45.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList54);
        org.junit.Assert.assertNull(qoSList55);
        org.junit.Assert.assertNull(qoSList56);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertTrue("'" + qoS60 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS60.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage10 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type11 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage12.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(1);
        pubRecMessage1.setMessageId(10);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        int int5 = unsubAckMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.meqantt.MqttListener mqttListener11 = null;
        nettyClient1.setListener(mqttListener11);
        nettyClient1.subscribe("\000d\000\001\001d");
        nettyClient1.disconnect();
        nettyClient1.ping();
        nettyClient1.publish("00: 00000000 \000 0\n01: 00000110 \006 6\n02: 01001101 M 77\n03: 01010001 Q 81\n04: 01001001 I 73\n05: 01110011 s 115\n06: 01100100 d 100\n07: 01110000 p 112\n", "\000\003hi!");
        nettyClient1.publish("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 01100100 d 100\n01: 00000000 \000 0\n");
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getClientId();
        boolean boolean10 = connectMessage1.isWillRetained();
        boolean boolean11 = connectMessage1.hasWill();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header11 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header11);
        org.meqantt.message.PubCompMessage pubCompMessage13 = new org.meqantt.message.PubCompMessage(header11);
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage(header11);
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList16 = subAckMessage15.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList17 = subAckMessage15.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str22 = connectMessage21.getProtocolId();
        org.meqantt.message.QoS qoS23 = connectMessage21.getQos();
        subAckMessage15.addQoS(qoS23);
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean29 = connectMessage28.hasWill();
        java.lang.String str30 = connectMessage28.getWill();
        org.meqantt.message.Message.Header header33 = null;
        org.meqantt.message.ConnectMessage connectMessage34 = new org.meqantt.message.ConnectMessage(header33);
        boolean boolean35 = connectMessage34.isWillRetained();
        boolean boolean36 = connectMessage34.isWillRetained();
        java.lang.String str37 = connectMessage34.getUsername();
        org.meqantt.message.QoS qoS41 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList45 = subscribeMessage44.getTopics();
        org.meqantt.message.QoS qoS46 = subscribeMessage44.getQos();
        subscribeMessage42.addTopic("", qoS46);
        connectMessage34.setWill("hi!", "", qoS46, false);
        connectMessage28.setWill("MQIsdp", "hi!", qoS46, false);
        org.meqantt.message.SubAckMessage subAckMessage54 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList55 = subAckMessage54.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList56 = subAckMessage54.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList57 = subAckMessage54.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList60 = subscribeMessage59.getTopics();
        org.meqantt.message.QoS qoS61 = subscribeMessage59.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage62 = new org.meqantt.message.SubscribeMessage("", qoS61);
        subAckMessage54.addQoS(qoS61);
        connectMessage28.setWill("hi!", "MQIsdp", qoS61, true);
        subAckMessage15.addQoS(qoS61);
        subAckMessage14.addQoS(qoS61);
        org.meqantt.message.SubscribeMessage subscribeMessage68 = new org.meqantt.message.SubscribeMessage("\000\003hi!", qoS61);
        org.meqantt.message.SubscribeMessage subscribeMessage69 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS61);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setQos(qoS61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList16);
        org.junit.Assert.assertNull(qoSList17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + qoS46 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS46.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList55);
        org.junit.Assert.assertNull(qoSList56);
        org.junit.Assert.assertNull(qoSList57);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + qoS61 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS61.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        int int11 = subscribeMessage9.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subscribeMessage9.getTopicQoSs();
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage9.write(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(qoSList12);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean8 = connectMessage7.hasWill();
        java.lang.String str9 = connectMessage7.getWill();
        org.meqantt.message.Message.Header header12 = null;
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage(header12);
        boolean boolean14 = connectMessage13.isWillRetained();
        boolean boolean15 = connectMessage13.isWillRetained();
        java.lang.String str16 = connectMessage13.getUsername();
        org.meqantt.message.QoS qoS20 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("", qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList24 = subscribeMessage23.getTopics();
        org.meqantt.message.QoS qoS25 = subscribeMessage23.getQos();
        subscribeMessage21.addTopic("", qoS25);
        connectMessage13.setWill("hi!", "", qoS25, false);
        connectMessage7.setWill("MQIsdp", "hi!", qoS25, false);
        byte byte31 = connectMessage7.getProtocolVersion();
        org.meqantt.message.ConnectMessage connectMessage38 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean39 = connectMessage38.hasWill();
        java.lang.String str40 = connectMessage38.getWill();
        org.meqantt.message.Message.Header header43 = null;
        org.meqantt.message.ConnectMessage connectMessage44 = new org.meqantt.message.ConnectMessage(header43);
        boolean boolean45 = connectMessage44.isWillRetained();
        boolean boolean46 = connectMessage44.isWillRetained();
        java.lang.String str47 = connectMessage44.getUsername();
        org.meqantt.message.QoS qoS51 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage("", qoS51);
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList55 = subscribeMessage54.getTopics();
        org.meqantt.message.QoS qoS56 = subscribeMessage54.getQos();
        subscribeMessage52.addTopic("", qoS56);
        connectMessage44.setWill("hi!", "", qoS56, false);
        connectMessage38.setWill("MQIsdp", "hi!", qoS56, false);
        org.meqantt.message.SubscribeMessage subscribeMessage62 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS56);
        connectMessage7.setWill("", "MQIsdp", qoS56, false);
        org.meqantt.message.SubscribeMessage subscribeMessage65 = new org.meqantt.message.SubscribeMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS56);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setQos(qoS56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 3 + "'", byte31 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + qoS56 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS56.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PubRecMessage pubRecMessage3 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]" + "'", str2, "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subscribeMessage0.getTopicQoSs();
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage((-1));
        org.meqantt.message.QoS qoS6 = pubRecMessage5.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList3);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage11.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        int int5 = unsubscribeMessage4.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage12 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Header header15 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type16 = header15.getType();
        org.meqantt.message.Message.Type type17 = header15.getType();
        org.meqantt.message.SubAckMessage subAckMessage18 = new org.meqantt.message.SubAckMessage(header15);
        org.meqantt.message.PingReqMessage pingReqMessage19 = new org.meqantt.message.PingReqMessage(header15);
        org.meqantt.message.PingReqMessage pingReqMessage20 = new org.meqantt.message.PingReqMessage(header15);
        org.meqantt.message.DisconnectMessage disconnectMessage21 = new org.meqantt.message.DisconnectMessage(header15);
        org.meqantt.message.SubAckMessage subAckMessage22 = new org.meqantt.message.SubAckMessage(header15);
        java.util.List<org.meqantt.message.QoS> qoSList23 = subAckMessage22.getGrantedQoSs();
        org.meqantt.message.SubAckMessage subAckMessage24 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList25 = subAckMessage24.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList26 = subAckMessage24.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList27 = subAckMessage24.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList30 = subscribeMessage29.getTopics();
        org.meqantt.message.QoS qoS31 = subscribeMessage29.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("", qoS31);
        subAckMessage24.addQoS(qoS31);
        subAckMessage22.addQoS(qoS31);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage13.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertNull(type17);
        org.junit.Assert.assertNull(qoSList23);
        org.junit.Assert.assertNull(qoSList25);
        org.junit.Assert.assertNull(qoSList26);
        org.junit.Assert.assertNull(qoSList27);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage12 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage13.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage10.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage10.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList11);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        boolean boolean4 = subAckMessage0.isDup();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(qoSList5);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage4.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList5);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("00: 01100100 d 100\n01: 00000000 \000 0\n");
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage();
        java.lang.String str7 = connectMessage6.getProtocolId();
        java.lang.String str8 = connectMessage6.getClientId();
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage11.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage11.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getProtocolId();
        org.meqantt.message.QoS qoS19 = connectMessage17.getQos();
        subAckMessage11.addQoS(qoS19);
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean25 = connectMessage24.hasWill();
        java.lang.String str26 = connectMessage24.getWill();
        org.meqantt.message.Message.Header header29 = null;
        org.meqantt.message.ConnectMessage connectMessage30 = new org.meqantt.message.ConnectMessage(header29);
        boolean boolean31 = connectMessage30.isWillRetained();
        boolean boolean32 = connectMessage30.isWillRetained();
        java.lang.String str33 = connectMessage30.getUsername();
        org.meqantt.message.QoS qoS37 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("", qoS37);
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList41 = subscribeMessage40.getTopics();
        org.meqantt.message.QoS qoS42 = subscribeMessage40.getQos();
        subscribeMessage38.addTopic("", qoS42);
        connectMessage30.setWill("hi!", "", qoS42, false);
        connectMessage24.setWill("MQIsdp", "hi!", qoS42, false);
        org.meqantt.message.SubAckMessage subAckMessage50 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList51 = subAckMessage50.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList52 = subAckMessage50.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList53 = subAckMessage50.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage55 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList56 = subscribeMessage55.getTopics();
        org.meqantt.message.QoS qoS57 = subscribeMessage55.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage("", qoS57);
        subAckMessage50.addQoS(qoS57);
        connectMessage24.setWill("hi!", "MQIsdp", qoS57, true);
        subAckMessage11.addQoS(qoS57);
        connectMessage6.setWill("\000d\000\001\001d", "hi!", qoS57, true);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setQos(qoS57);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MQIsdp" + "'", str18, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + qoS42 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS42.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList51);
        org.junit.Assert.assertNull(qoSList52);
        org.junit.Assert.assertNull(qoSList53);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + qoS57 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS57.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("", "hi!");
        java.lang.String str3 = publishMessage2.getDataAsString();
        byte[] byteArray4 = publishMessage2.getData();
        java.lang.String str5 = publishMessage2.getTopic();
        java.lang.String str6 = publishMessage2.getTopic();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\003hi!" + "'", str3, "\000\003hi!");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 3, 104, 105, 33]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        byte[] byteArray2 = org.meqantt.util.FormatUtil.toMQttString("");
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", byteArray2);
        java.lang.String str4 = org.meqantt.util.FormatUtil.toString(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        org.meqantt.message.QoS qoS8 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        subscribeMessage9.addTopic("", qoS13);
        connectMessage3.setWill("", "\000d\000\001\001d", qoS13, true);
        java.lang.String str17 = connectMessage3.getPassword();
        byte byte18 = connectMessage3.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 3 + "'", byte18 == (byte) 3);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Type type8 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage10 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.meqantt.MqttListener mqttListener9 = null;
        nettyClient1.setListener(mqttListener9);
        nettyClient1.subscribe("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        nettyClient1.connect("\000\000", (int) (short) 100);
        nettyClient1.unsubscribe("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        nettyClient1.subscribe("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        nettyClient1.unsubscribe("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage9 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage9.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean8 = connectMessage7.hasPassword();
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage7.write(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.Message.Type type7 = header5.getType();
        org.meqantt.message.PubRelMessage pubRelMessage8 = new org.meqantt.message.PubRelMessage(header5);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header5);
        boolean boolean10 = subAckMessage9.isDup();
        org.meqantt.message.Message.Header header12 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type13 = header12.getType();
        org.meqantt.message.Message.Type type14 = header12.getType();
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage(header12);
        org.meqantt.message.PingReqMessage pingReqMessage16 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage(header12);
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage(header12);
        org.meqantt.message.PingReqMessage pingReqMessage19 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage(header12);
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        subscribeMessage20.setDup(false);
        org.meqantt.message.Message.Header header25 = null;
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage(header25);
        int int27 = connectMessage26.getKeepAlive();
        connectMessage26.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS31 = connectMessage26.getWillQoS();
        subscribeMessage20.addTopic("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS31);
        subAckMessage9.addQoS(qoS31);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, 1);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        org.meqantt.message.Message.Header header1 = null;
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getPassword();
        java.lang.String str4 = connectMessage2.getWillTopic();
        boolean boolean5 = connectMessage2.isCleanSession();
        boolean boolean6 = connectMessage2.hasPassword();
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS11 = pubRelMessage10.getQos();
        connectMessage2.setWill("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS11, false);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS11);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage14.write(outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus11 = connAckMessage10.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(connectionStatus11);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        byte[] byteArray3 = connAckMessage1.toBytes();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[32, 2, 0, 2]");
        org.junit.Assert.assertTrue("'" + connectionStatus4 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus4.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.QoS qoS7 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        subscribeMessage8.addTopic("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS12);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]" + "'", str2, "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage10.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\020\032\000\006MQIsdp\003&\000\001\000\000\000\000\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ????MQIsdp?&??????????d????d");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\000");
        unsubscribeMessage1.addTopic("\000\000");
        org.meqantt.message.Message.Header header5 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header5);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        java.util.List<java.lang.String> strList8 = subscribeMessage6.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subscribeMessage6.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean15 = connectMessage14.hasWill();
        java.lang.String str16 = connectMessage14.getWill();
        org.meqantt.message.Message.Header header19 = null;
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage(header19);
        boolean boolean21 = connectMessage20.isWillRetained();
        boolean boolean22 = connectMessage20.isWillRetained();
        java.lang.String str23 = connectMessage20.getUsername();
        org.meqantt.message.QoS qoS27 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        subscribeMessage28.addTopic("", qoS32);
        connectMessage20.setWill("hi!", "", qoS32, false);
        connectMessage14.setWill("MQIsdp", "hi!", qoS32, false);
        subscribeMessage6.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS32);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(qoSList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header1);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            publishMessage11.write(outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.Message.Type type7 = header5.getType();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header5);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.DisconnectMessage disconnectMessage11 = new org.meqantt.message.DisconnectMessage(header5);
        org.meqantt.message.PubRecMessage pubRecMessage12 = new org.meqantt.message.PubRecMessage(header5);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage(header5);
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        int int15 = subscribeMessage13.getMessageId();
        org.meqantt.message.Message.Header header17 = null;
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage(header17);
        boolean boolean19 = connectMessage18.isWillRetained();
        boolean boolean20 = connectMessage18.isWillRetained();
        connectMessage18.setWill("", "MQIsdp");
        boolean boolean24 = connectMessage18.isWillRetained();
        java.lang.String str25 = connectMessage18.getClientId();
        java.lang.String str26 = connectMessage18.getWill();
        byte byte27 = connectMessage18.getProtocolVersion();
        java.lang.String str28 = connectMessage18.getPassword();
        boolean boolean29 = connectMessage18.hasPassword();
        org.meqantt.message.QoS qoS30 = connectMessage18.getWillQoS();
        subscribeMessage13.addTopic("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS30);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setQos(qoS30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MQIsdp" + "'", str26, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 3 + "'", byte27 == (byte) 3);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        boolean boolean5 = connectMessage3.hasUsername();
        java.lang.String str6 = connectMessage3.getClientId();
        boolean boolean7 = connectMessage3.hasPassword();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type4 = header3.getType();
        org.meqantt.message.Message.Type type5 = header3.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header3);
        org.meqantt.message.QoS qoS7 = unsubAckMessage6.getQos();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) unsubAckMessage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.unsubscribe("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header12 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type13 = header12.getType();
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage(header12);
        org.meqantt.message.Message.Header header16 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str17 = header16.toString();
        org.meqantt.message.SubAckMessage subAckMessage18 = new org.meqantt.message.SubAckMessage(header16);
        org.meqantt.message.PublishMessage publishMessage19 = new org.meqantt.message.PublishMessage(header16);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage22 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS23 = unsubscribeMessage22.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("", qoS23);
        publishMessage19.setQos(qoS23);
        subAckMessage14.addQoS(qoS23);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage10.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type13.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str17, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", "\000\000");
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.util.List<java.lang.String> strList11 = unsubscribeMessage10.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.hasUsername();
        boolean boolean6 = connectMessage1.hasUsername();
        connectMessage1.setWill("MQIsdp", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        boolean boolean10 = connectMessage1.hasPassword();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        org.meqantt.message.QoS qoS3 = null;
        subscribeMessage1.addTopic("hi!", qoS3);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getUsername();
        int int11 = connectMessage9.getKeepAlive();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean18 = connectMessage17.hasWill();
        java.lang.String str19 = connectMessage17.getWill();
        org.meqantt.message.Message.Header header22 = null;
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header22);
        boolean boolean24 = connectMessage23.isWillRetained();
        boolean boolean25 = connectMessage23.isWillRetained();
        java.lang.String str26 = connectMessage23.getUsername();
        org.meqantt.message.QoS qoS30 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("", qoS30);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList34 = subscribeMessage33.getTopics();
        org.meqantt.message.QoS qoS35 = subscribeMessage33.getQos();
        subscribeMessage31.addTopic("", qoS35);
        connectMessage23.setWill("hi!", "", qoS35, false);
        connectMessage17.setWill("MQIsdp", "hi!", qoS35, false);
        connectMessage9.setWill("\000\000", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS35, false);
        subscribeMessage1.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS35);
        java.util.List<java.lang.String> strList44 = subscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList45 = subscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = subscribeMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        int int3 = subscribeMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("\000\000", false, (int) (short) -1);
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str22 = connectMessage21.getUsername();
        org.meqantt.message.QoS qoS26 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("", qoS26);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList30 = subscribeMessage29.getTopics();
        org.meqantt.message.QoS qoS31 = subscribeMessage29.getQos();
        subscribeMessage27.addTopic("", qoS31);
        connectMessage21.setWill("", "\000d\000\001\001d", qoS31, true);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("hi!", qoS31);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS31);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("", qoS31);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS31);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS31);
        connectMessage10.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS31, false);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        nettyClient1.connect("", (int) '\001');
        nettyClient1.connect("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", (int) '4');
        nettyClient1.publish("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        nettyClient1.unsubscribe("00: 00000000 \000 0\n01: 00000000 \000 0\n");
        nettyClient1.unsubscribe("\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage10 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getUsername();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        connectMessage7.setWill("", "\000d\000\001\001d", qoS17, true);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("hi!", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        org.meqantt.message.ConnectMessage connectMessage32 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str33 = connectMessage32.getProtocolId();
        org.meqantt.message.QoS qoS34 = connectMessage32.getQos();
        subscribeMessage26.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS34);
        subscribeMessage24.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS34);
        boolean boolean37 = subscribeMessage24.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage24.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MQIsdp" + "'", str33, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        subAckMessage0.addQoS(qoS7);
        org.meqantt.message.QoS qoS10 = subAckMessage0.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Type type8 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage9.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS1 = unsubAckMessage0.getQos();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS1 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS1.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getProtocolId();
        org.meqantt.message.QoS qoS19 = connectMessage17.getQos();
        subscribeMessage10.addTopic("", qoS19);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage22 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList23 = unsubscribeMessage22.getTopics();
        org.meqantt.message.Message.Type type24 = unsubscribeMessage22.getType();
        java.util.List<java.lang.String> strList25 = unsubscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS26 = unsubscribeMessage22.getQos();
        subscribeMessage10.setQos(qoS26);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MQIsdp" + "'", str18, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type24.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        boolean boolean10 = connectMessage1.hasUsername();
        boolean boolean11 = connectMessage1.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: ?D00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.QoS qoS10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 0);
        org.meqantt.message.Message.Header header13 = null;
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header13);
        java.lang.String str15 = connectMessage14.getClientId();
        connectMessage14.setWill("hi!", "");
        org.meqantt.message.QoS qoS19 = connectMessage14.getWillQoS();
        connectMessage10.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "", qoS19, true);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage6.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        nettyClient1.connect("\000d\000\001\001d", (int) (short) 1);
        org.meqantt.MqttListener mqttListener10 = null;
        nettyClient1.setListener(mqttListener10);
        nettyClient1.connect("00: 01100100 d 100\n01: 00000000 \000 0\n", 97);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getClientId();
        connectMessage1.setCredentials("\000d\000\001\001d");
        boolean boolean12 = connectMessage1.hasWill();
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus11 = connAckMessage10.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(connectionStatus11);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage10 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type12 = header1.getType();
        org.meqantt.message.ConnAckMessage connAckMessage13 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage13.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type12);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean10 = connectMessage9.hasWill();
        java.lang.String str11 = connectMessage9.getWill();
        org.meqantt.message.Message.Header header14 = null;
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage(header14);
        boolean boolean16 = connectMessage15.isWillRetained();
        boolean boolean17 = connectMessage15.isWillRetained();
        java.lang.String str18 = connectMessage15.getUsername();
        org.meqantt.message.QoS qoS22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        subscribeMessage23.addTopic("", qoS27);
        connectMessage15.setWill("hi!", "", qoS27, false);
        connectMessage9.setWill("MQIsdp", "hi!", qoS27, false);
        org.meqantt.message.QoS qoS33 = connectMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000\000", (int) '\001');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        connectMessage1.setCredentials("00: 01100100 d 100\n01: 00000000 \000 0\n", "00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage6.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.unbindRequested(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ?D00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setWill("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        boolean boolean9 = connectMessage1.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        java.lang.String str6 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        connectMessage2.setWill("\000\000", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str16 = connectMessage15.getProtocolId();
        org.meqantt.message.QoS qoS17 = connectMessage15.getQos();
        subscribeMessage8.addTopic("", qoS17);
        connectMessage2.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS17, true);
        boolean boolean21 = connectMessage2.hasPassword();
        boolean boolean22 = connectMessage2.hasWill();
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str27 = connectMessage26.getUsername();
        java.lang.String str28 = connectMessage26.getWill();
        org.meqantt.message.Message.Header header32 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type33 = header32.getType();
        org.meqantt.message.Message.Type type34 = header32.getType();
        org.meqantt.message.PubRelMessage pubRelMessage35 = new org.meqantt.message.PubRelMessage(header32);
        org.meqantt.message.SubAckMessage subAckMessage36 = new org.meqantt.message.SubAckMessage(header32);
        boolean boolean37 = subAckMessage36.isRetained();
        org.meqantt.message.QoS qoS38 = subAckMessage36.getQos();
        connectMessage26.setWill("\000\003hi!", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS38, false);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MQIsdp" + "'", str16, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(type33);
        org.junit.Assert.assertNull(type34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.QoS qoS10 = null;
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage9.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage4.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str14 = connectMessage13.getUsername();
        org.meqantt.message.QoS qoS18 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        subscribeMessage19.addTopic("", qoS23);
        connectMessage13.setWill("", "\000d\000\001\001d", qoS23, true);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("hi!", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList33 = subscribeMessage32.getTopics();
        org.meqantt.message.ConnectMessage connectMessage38 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str39 = connectMessage38.getProtocolId();
        org.meqantt.message.QoS qoS40 = connectMessage38.getQos();
        subscribeMessage32.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS40);
        subscribeMessage30.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS40);
        org.meqantt.message.ConnectMessage connectMessage47 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str48 = connectMessage47.getProtocolId();
        org.meqantt.message.QoS qoS49 = connectMessage47.getQos();
        subscribeMessage30.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS49);
        org.meqantt.message.ConnectMessage connectMessage59 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str60 = connectMessage59.getUsername();
        org.meqantt.message.QoS qoS64 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage65 = new org.meqantt.message.SubscribeMessage("", qoS64);
        org.meqantt.message.SubscribeMessage subscribeMessage67 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList68 = subscribeMessage67.getTopics();
        org.meqantt.message.QoS qoS69 = subscribeMessage67.getQos();
        subscribeMessage65.addTopic("", qoS69);
        connectMessage59.setWill("", "\000d\000\001\001d", qoS69, true);
        org.meqantt.message.SubscribeMessage subscribeMessage73 = new org.meqantt.message.SubscribeMessage("hi!", qoS69);
        org.meqantt.message.SubscribeMessage subscribeMessage74 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS69);
        org.meqantt.message.SubscribeMessage subscribeMessage75 = new org.meqantt.message.SubscribeMessage("", qoS69);
        org.meqantt.message.SubscribeMessage subscribeMessage76 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS69);
        subscribeMessage30.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS69);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setQos(qoS69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MQIsdp" + "'", str39, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "MQIsdp" + "'", str48, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS49 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS49.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + qoS69 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS69.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(3);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.isCleanSession();
        boolean boolean7 = connectMessage1.isCleanSession();
        java.lang.String str8 = connectMessage1.getWillTopic();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header2);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage3.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connAckMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus4);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 01110000 p 112?01: 00000010 ? 2?02: 00000000 ? 0?03: 00001010 ? 10?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus5 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus6 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus7 = connAckMessage1.getStatus();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage14.setWill("", "\000d\000\001\001d", qoS24, true);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("hi!", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("", qoS24);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage33 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList34 = unsubscribeMessage33.getTopics();
        org.meqantt.message.Message.Type type35 = unsubscribeMessage33.getType();
        java.util.List<java.lang.String> strList36 = unsubscribeMessage33.getTopics();
        org.meqantt.message.QoS qoS37 = unsubscribeMessage33.getQos();
        subscribeMessage30.addTopic("\001\003\003\001", qoS37);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
        org.junit.Assert.assertNull(connectionStatus5);
        org.junit.Assert.assertNull(connectionStatus6);
        org.junit.Assert.assertNull(connectionStatus7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type35.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + qoS37 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS37.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        int int11 = subscribeMessage9.getMessageId();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getUsername();
        org.meqantt.message.QoS qoS24 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS29 = subscribeMessage27.getQos();
        subscribeMessage25.addTopic("", qoS29);
        connectMessage19.setWill("", "\000d\000\001\001d", qoS29, true);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("hi!", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS29);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage9.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage("MQIsdp", "\000d\000\001\001d");
        java.lang.String str8 = publishMessage7.getDataAsString();
        byte[] byteArray9 = publishMessage7.getData();
        org.meqantt.message.QoS qoS10 = publishMessage7.getQos();
        subAckMessage4.addQoS(qoS10);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d" + "'", str8, "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        connectMessage1.setCredentials("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        boolean boolean9 = connectMessage1.hasUsername();
        connectMessage1.setCredentials("\000\003hi!");
        java.lang.String str12 = connectMessage1.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage6.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getUsername();
        org.meqantt.message.QoS qoS15 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        subscribeMessage16.addTopic("", qoS20);
        connectMessage10.setWill("", "\000d\000\001\001d", qoS20, true);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("hi!", qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("", qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS20);
        subAckMessage0.addQoS(qoS20);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type4 = subscribeMessage3.getType();
        subscribeMessage3.setDup(false);
        subscribeMessage3.setMessageId((int) (short) 0);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage10.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage10.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage10.getGrantedQoSs();
        subAckMessage10.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getProtocolId();
        org.meqantt.message.QoS qoS24 = connectMessage22.getQos();
        subscribeMessage16.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS24);
        subAckMessage10.addQoS(qoS24);
        subscribeMessage3.addTopic("\000\003hi!", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type4.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MQIsdp" + "'", str23, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus8 = connAckMessage7.getStatus();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS13);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus8);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean13 = connectMessage12.hasWill();
        java.lang.String str14 = connectMessage12.getWill();
        java.lang.String str15 = connectMessage12.getWill();
        java.lang.String str16 = connectMessage12.getProtocolId();
        java.lang.String str17 = connectMessage12.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage20 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList21 = subAckMessage20.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList22 = subAckMessage20.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str27 = connectMessage26.getProtocolId();
        org.meqantt.message.QoS qoS28 = connectMessage26.getQos();
        subAckMessage20.addQoS(qoS28);
        connectMessage12.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS28, false);
        connectMessage1.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS28, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MQIsdp" + "'", str16, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MQIsdp" + "'", str17, "MQIsdp");
        org.junit.Assert.assertNull(qoSList21);
        org.junit.Assert.assertNull(qoSList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MQIsdp" + "'", str27, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage5.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS11 = unsubscribeMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage8.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage12.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage12 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage12.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage11.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage(97);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header3);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header3);
        org.meqantt.message.Message.Type type7 = header3.getType();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.Message.Header header9 = null;
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header9);
        boolean boolean11 = connectMessage10.isWillRetained();
        boolean boolean12 = connectMessage10.isWillRetained();
        java.lang.String str13 = connectMessage10.getUsername();
        boolean boolean14 = connectMessage10.isCleanSession();
        java.lang.String str15 = connectMessage10.getWill();
        boolean boolean16 = connectMessage10.hasUsername();
        java.lang.String str17 = connectMessage10.getProtocolId();
        org.meqantt.message.Message.Header header20 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage(header20);
        org.meqantt.message.QoS qoS23 = null;
        subscribeMessage21.addTopic("hi!", qoS23);
        java.util.List<org.meqantt.message.QoS> qoSList25 = subscribeMessage21.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str32 = connectMessage31.getUsername();
        org.meqantt.message.QoS qoS36 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList40 = subscribeMessage39.getTopics();
        org.meqantt.message.QoS qoS41 = subscribeMessage39.getQos();
        subscribeMessage37.addTopic("", qoS41);
        connectMessage31.setWill("", "\000d\000\001\001d", qoS41, true);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage("hi!", qoS41);
        subscribeMessage21.addTopic("\000d\000\001\001d", qoS41);
        connectMessage10.setWill("\000d\000\001\001d", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS41, false);
        subAckMessage8.addQoS(qoS41);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MQIsdp" + "'", str17, "MQIsdp");
        org.junit.Assert.assertNotNull(qoSList25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        boolean boolean8 = pubAckMessage7.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        boolean boolean10 = connectMessage9.isWillRetained();
        boolean boolean11 = connectMessage9.isWillRetained();
        java.lang.String str12 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage9.setWill("hi!", "", qoS21, false);
        connectMessage3.setWill("MQIsdp", "hi!", qoS21, false);
        byte byte27 = connectMessage3.getProtocolVersion();
        org.meqantt.message.ConnectMessage connectMessage34 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean35 = connectMessage34.hasWill();
        java.lang.String str36 = connectMessage34.getWill();
        org.meqantt.message.Message.Header header39 = null;
        org.meqantt.message.ConnectMessage connectMessage40 = new org.meqantt.message.ConnectMessage(header39);
        boolean boolean41 = connectMessage40.isWillRetained();
        boolean boolean42 = connectMessage40.isWillRetained();
        java.lang.String str43 = connectMessage40.getUsername();
        org.meqantt.message.QoS qoS47 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage("", qoS47);
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList51 = subscribeMessage50.getTopics();
        org.meqantt.message.QoS qoS52 = subscribeMessage50.getQos();
        subscribeMessage48.addTopic("", qoS52);
        connectMessage40.setWill("hi!", "", qoS52, false);
        connectMessage34.setWill("MQIsdp", "hi!", qoS52, false);
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS52);
        connectMessage3.setWill("", "MQIsdp", qoS52, false);
        boolean boolean61 = connectMessage3.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 3 + "'", byte27 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str14 = connectMessage13.getProtocolId();
        org.meqantt.message.QoS qoS15 = connectMessage13.getQos();
        subAckMessage7.addQoS(qoS15);
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean21 = connectMessage20.hasWill();
        java.lang.String str22 = connectMessage20.getWill();
        org.meqantt.message.Message.Header header25 = null;
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage(header25);
        boolean boolean27 = connectMessage26.isWillRetained();
        boolean boolean28 = connectMessage26.isWillRetained();
        java.lang.String str29 = connectMessage26.getUsername();
        org.meqantt.message.QoS qoS33 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList37 = subscribeMessage36.getTopics();
        org.meqantt.message.QoS qoS38 = subscribeMessage36.getQos();
        subscribeMessage34.addTopic("", qoS38);
        connectMessage26.setWill("hi!", "", qoS38, false);
        connectMessage20.setWill("MQIsdp", "hi!", qoS38, false);
        org.meqantt.message.SubAckMessage subAckMessage46 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList47 = subAckMessage46.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList48 = subAckMessage46.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList49 = subAckMessage46.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList52 = subscribeMessage51.getTopics();
        org.meqantt.message.QoS qoS53 = subscribeMessage51.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage("", qoS53);
        subAckMessage46.addQoS(qoS53);
        connectMessage20.setWill("hi!", "MQIsdp", qoS53, true);
        subAckMessage7.addQoS(qoS53);
        subAckMessage6.addQoS(qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage("\000\003hi!", qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS53);
        java.util.List<org.meqantt.message.QoS> qoSList62 = subscribeMessage61.getTopicQoSs();
        subscribeMessage61.setDup(false);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MQIsdp" + "'", str14, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList47);
        org.junit.Assert.assertNull(qoSList48);
        org.junit.Assert.assertNull(qoSList49);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList62);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header8 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        org.meqantt.message.Message.Type type10 = header8.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage11 = new org.meqantt.message.UnsubscribeMessage(header8);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage(header8);
        org.meqantt.message.Message.Header header14 = null;
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage(header14);
        java.lang.String str16 = connectMessage15.getClientId();
        connectMessage15.setWill("hi!", "");
        boolean boolean20 = connectMessage15.hasPassword();
        boolean boolean21 = connectMessage15.isCleanSession();
        boolean boolean22 = connectMessage15.hasWill();
        org.meqantt.message.QoS qoS23 = connectMessage15.getWillQoS();
        subscribeMessage12.addTopic("hi!", qoS23);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.QoS qoS6 = null;
        subscribeMessage2.addTopic("", qoS6);
        java.util.List<java.lang.String> strList8 = subscribeMessage2.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) subscribeMessage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        boolean boolean7 = connectMessage1.hasUsername();
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean12 = connectMessage11.hasWill();
        java.lang.String str13 = connectMessage11.getWill();
        org.meqantt.message.Message.Header header16 = null;
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage(header16);
        boolean boolean18 = connectMessage17.isWillRetained();
        boolean boolean19 = connectMessage17.isWillRetained();
        java.lang.String str20 = connectMessage17.getUsername();
        org.meqantt.message.QoS qoS24 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS29 = subscribeMessage27.getQos();
        subscribeMessage25.addTopic("", qoS29);
        connectMessage17.setWill("hi!", "", qoS29, false);
        connectMessage11.setWill("MQIsdp", "hi!", qoS29, false);
        org.meqantt.message.SubAckMessage subAckMessage37 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList38 = subAckMessage37.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList39 = subAckMessage37.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList40 = subAckMessage37.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList43 = subscribeMessage42.getTopics();
        org.meqantt.message.QoS qoS44 = subscribeMessage42.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage("", qoS44);
        subAckMessage37.addQoS(qoS44);
        connectMessage11.setWill("hi!", "MQIsdp", qoS44, true);
        java.lang.String str49 = connectMessage11.getPassword();
        org.meqantt.message.QoS qoS50 = connectMessage11.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList38);
        org.junit.Assert.assertNull(qoSList39);
        org.junit.Assert.assertNull(qoSList40);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + qoS50 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS50.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        int int3 = pubAckMessage1.getMessageId();
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.Message.Type type7 = header5.getType();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header5);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.DisconnectMessage disconnectMessage11 = new org.meqantt.message.DisconnectMessage(header5);
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage(header5);
        org.meqantt.message.UnsubAckMessage unsubAckMessage13 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS14 = unsubAckMessage13.getQos();
        subAckMessage12.addQoS(qoS14);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage12 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage13.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage7 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage8.getGrantedQoSs();
        subAckMessage8.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str21 = connectMessage20.getProtocolId();
        org.meqantt.message.QoS qoS22 = connectMessage20.getQos();
        subscribeMessage14.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS22);
        subAckMessage8.addQoS(qoS22);
        org.meqantt.message.Message.Header header25 = null;
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage(header25);
        int int27 = connectMessage26.getKeepAlive();
        connectMessage26.setWill("MQIsdp", "");
        java.lang.String str31 = connectMessage26.getWillTopic();
        org.meqantt.message.ConnectMessage connectMessage41 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str42 = connectMessage41.getUsername();
        org.meqantt.message.QoS qoS46 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage("", qoS46);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList50 = subscribeMessage49.getTopics();
        org.meqantt.message.QoS qoS51 = subscribeMessage49.getQos();
        subscribeMessage47.addTopic("", qoS51);
        connectMessage41.setWill("", "\000d\000\001\001d", qoS51, true);
        org.meqantt.message.SubscribeMessage subscribeMessage55 = new org.meqantt.message.SubscribeMessage("hi!", qoS51);
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS51);
        org.meqantt.message.SubscribeMessage subscribeMessage57 = new org.meqantt.message.SubscribeMessage("", qoS51);
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS51);
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList61 = subscribeMessage60.getTopics();
        org.meqantt.message.ConnectMessage connectMessage66 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str67 = connectMessage66.getProtocolId();
        org.meqantt.message.QoS qoS68 = connectMessage66.getQos();
        subscribeMessage60.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS68);
        subscribeMessage58.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS68);
        org.meqantt.message.ConnectMessage connectMessage75 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str76 = connectMessage75.getProtocolId();
        org.meqantt.message.QoS qoS77 = connectMessage75.getQos();
        subscribeMessage58.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS77);
        connectMessage26.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS77, false);
        subAckMessage8.addQoS(qoS77);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage7.setQos(qoS77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MQIsdp" + "'", str21, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MQIsdp" + "'", str31, "MQIsdp");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + qoS51 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS51.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "MQIsdp" + "'", str67, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS68 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS68.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "MQIsdp" + "'", str76, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS77 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS77.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.disconnectRequested(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isWillRetained();
        int int4 = connectMessage1.getKeepAlive();
        byte byte5 = connectMessage1.getProtocolVersion();
        byte byte6 = connectMessage1.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 01100100 d 100\n01: 00000000 \000 0\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getUsername();
        org.meqantt.message.QoS qoS17 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        subscribeMessage18.addTopic("", qoS22);
        connectMessage12.setWill("", "\000d\000\001\001d", qoS22, true);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("hi!", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS22);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        boolean boolean7 = connectMessage1.hasUsername();
        java.lang.String str8 = connectMessage1.getProtocolId();
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage(header11);
        org.meqantt.message.QoS qoS14 = null;
        subscribeMessage12.addTopic("hi!", qoS14);
        java.util.List<org.meqantt.message.QoS> qoSList16 = subscribeMessage12.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getUsername();
        org.meqantt.message.QoS qoS27 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        subscribeMessage28.addTopic("", qoS32);
        connectMessage22.setWill("", "\000d\000\001\001d", qoS32, true);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("hi!", qoS32);
        subscribeMessage12.addTopic("\000d\000\001\001d", qoS32);
        connectMessage1.setWill("\000d\000\001\001d", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS32, false);
        boolean boolean40 = connectMessage1.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertNotNull(qoSList16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        boolean boolean8 = connectMessage7.isWillRetained();
        boolean boolean9 = connectMessage7.isWillRetained();
        java.lang.String str10 = connectMessage7.getUsername();
        connectMessage7.setCredentials("\000d\000\001\001d", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getUsername();
        org.meqantt.message.QoS qoS28 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("", qoS28);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList32 = subscribeMessage31.getTopics();
        org.meqantt.message.QoS qoS33 = subscribeMessage31.getQos();
        subscribeMessage29.addTopic("", qoS33);
        connectMessage23.setWill("", "\000d\000\001\001d", qoS33, true);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("hi!", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList43 = subscribeMessage42.getTopics();
        org.meqantt.message.ConnectMessage connectMessage48 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str49 = connectMessage48.getProtocolId();
        org.meqantt.message.QoS qoS50 = connectMessage48.getQos();
        subscribeMessage42.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS50);
        subscribeMessage40.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS50);
        org.meqantt.message.ConnectMessage connectMessage57 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str58 = connectMessage57.getProtocolId();
        org.meqantt.message.QoS qoS59 = connectMessage57.getQos();
        subscribeMessage40.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS59);
        org.meqantt.message.ConnectMessage connectMessage69 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str70 = connectMessage69.getUsername();
        org.meqantt.message.QoS qoS74 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage75 = new org.meqantt.message.SubscribeMessage("", qoS74);
        org.meqantt.message.SubscribeMessage subscribeMessage77 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList78 = subscribeMessage77.getTopics();
        org.meqantt.message.QoS qoS79 = subscribeMessage77.getQos();
        subscribeMessage75.addTopic("", qoS79);
        connectMessage69.setWill("", "\000d\000\001\001d", qoS79, true);
        org.meqantt.message.SubscribeMessage subscribeMessage83 = new org.meqantt.message.SubscribeMessage("hi!", qoS79);
        org.meqantt.message.SubscribeMessage subscribeMessage84 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS79);
        org.meqantt.message.SubscribeMessage subscribeMessage85 = new org.meqantt.message.SubscribeMessage("", qoS79);
        org.meqantt.message.SubscribeMessage subscribeMessage86 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS79);
        subscribeMessage40.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS79);
        connectMessage7.setWill("\000d\000\001\001d", "\001\003\003\001", qoS79, false);
        org.meqantt.message.SubscribeMessage subscribeMessage90 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS79);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS79);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "MQIsdp" + "'", str49, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS50 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS50.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "MQIsdp" + "'", str58, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS59 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS59.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + qoS79 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS79.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Type type3 = pingReqMessage2.getType();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header5 = null;
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header5);
        boolean boolean7 = connectMessage6.isWillRetained();
        boolean boolean8 = connectMessage6.isWillRetained();
        java.lang.String str9 = connectMessage6.getUsername();
        connectMessage6.setCredentials("\000d\000\001\001d", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getUsername();
        org.meqantt.message.QoS qoS27 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        subscribeMessage28.addTopic("", qoS32);
        connectMessage22.setWill("", "\000d\000\001\001d", qoS32, true);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("hi!", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.ConnectMessage connectMessage47 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str48 = connectMessage47.getProtocolId();
        org.meqantt.message.QoS qoS49 = connectMessage47.getQos();
        subscribeMessage41.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS49);
        subscribeMessage39.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS49);
        org.meqantt.message.ConnectMessage connectMessage56 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str57 = connectMessage56.getProtocolId();
        org.meqantt.message.QoS qoS58 = connectMessage56.getQos();
        subscribeMessage39.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS58);
        org.meqantt.message.ConnectMessage connectMessage68 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str69 = connectMessage68.getUsername();
        org.meqantt.message.QoS qoS73 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage74 = new org.meqantt.message.SubscribeMessage("", qoS73);
        org.meqantt.message.SubscribeMessage subscribeMessage76 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList77 = subscribeMessage76.getTopics();
        org.meqantt.message.QoS qoS78 = subscribeMessage76.getQos();
        subscribeMessage74.addTopic("", qoS78);
        connectMessage68.setWill("", "\000d\000\001\001d", qoS78, true);
        org.meqantt.message.SubscribeMessage subscribeMessage82 = new org.meqantt.message.SubscribeMessage("hi!", qoS78);
        org.meqantt.message.SubscribeMessage subscribeMessage83 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS78);
        org.meqantt.message.SubscribeMessage subscribeMessage84 = new org.meqantt.message.SubscribeMessage("", qoS78);
        org.meqantt.message.SubscribeMessage subscribeMessage85 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS78);
        subscribeMessage39.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS78);
        connectMessage6.setWill("\000d\000\001\001d", "\001\003\003\001", qoS78, false);
        org.meqantt.message.SubscribeMessage subscribeMessage89 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS78);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setQos(qoS78);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "MQIsdp" + "'", str48, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS49 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS49.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "MQIsdp" + "'", str57, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS58 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS58.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + qoS78 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS78.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header3);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header3);
        java.lang.String str6 = header3.toString();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header3);
        boolean boolean8 = connectMessage7.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        org.meqantt.message.SubAckMessage subAckMessage1 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage1.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage1.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subAckMessage1.addQoS(qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("hi!", qoS9);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList14 = subAckMessage13.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList15 = subAckMessage13.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getProtocolId();
        org.meqantt.message.QoS qoS21 = connectMessage19.getQos();
        subAckMessage13.addQoS(qoS21);
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean27 = connectMessage26.hasWill();
        java.lang.String str28 = connectMessage26.getWill();
        org.meqantt.message.Message.Header header31 = null;
        org.meqantt.message.ConnectMessage connectMessage32 = new org.meqantt.message.ConnectMessage(header31);
        boolean boolean33 = connectMessage32.isWillRetained();
        boolean boolean34 = connectMessage32.isWillRetained();
        java.lang.String str35 = connectMessage32.getUsername();
        org.meqantt.message.QoS qoS39 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("", qoS39);
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList43 = subscribeMessage42.getTopics();
        org.meqantt.message.QoS qoS44 = subscribeMessage42.getQos();
        subscribeMessage40.addTopic("", qoS44);
        connectMessage32.setWill("hi!", "", qoS44, false);
        connectMessage26.setWill("MQIsdp", "hi!", qoS44, false);
        org.meqantt.message.SubAckMessage subAckMessage52 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList53 = subAckMessage52.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList54 = subAckMessage52.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList55 = subAckMessage52.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage57 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList58 = subscribeMessage57.getTopics();
        org.meqantt.message.QoS qoS59 = subscribeMessage57.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage("", qoS59);
        subAckMessage52.addQoS(qoS59);
        connectMessage26.setWill("hi!", "MQIsdp", qoS59, true);
        subAckMessage13.addQoS(qoS59);
        org.meqantt.message.SubAckMessage subAckMessage65 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList66 = subAckMessage65.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList67 = subAckMessage65.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage71 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str72 = connectMessage71.getProtocolId();
        org.meqantt.message.QoS qoS73 = connectMessage71.getQos();
        subAckMessage65.addQoS(qoS73);
        subAckMessage13.addQoS(qoS73);
        subscribeMessage11.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS73);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage11.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList14);
        org.junit.Assert.assertNull(qoSList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList53);
        org.junit.Assert.assertNull(qoSList54);
        org.junit.Assert.assertNull(qoSList55);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + qoS59 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS59.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList66);
        org.junit.Assert.assertNull(qoSList67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "MQIsdp" + "'", str72, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS73 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS73.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str9 = publishMessage8.getTopic();
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        connectMessage2.setWill("\000\000", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str16 = connectMessage15.getProtocolId();
        org.meqantt.message.QoS qoS17 = connectMessage15.getQos();
        subscribeMessage8.addTopic("", qoS17);
        connectMessage2.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS17, true);
        boolean boolean21 = connectMessage2.hasPassword();
        java.lang.String str22 = connectMessage2.getProtocolId();
        java.lang.Class<?> wildcardClass23 = connectMessage2.getClass();
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MQIsdp" + "'", str16, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header8);
        org.meqantt.message.QoS qoS11 = null;
        subscribeMessage9.addTopic("hi!", qoS11);
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getUsername();
        int int19 = connectMessage17.getKeepAlive();
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean26 = connectMessage25.hasWill();
        java.lang.String str27 = connectMessage25.getWill();
        org.meqantt.message.Message.Header header30 = null;
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage(header30);
        boolean boolean32 = connectMessage31.isWillRetained();
        boolean boolean33 = connectMessage31.isWillRetained();
        java.lang.String str34 = connectMessage31.getUsername();
        org.meqantt.message.QoS qoS38 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.QoS qoS43 = subscribeMessage41.getQos();
        subscribeMessage39.addTopic("", qoS43);
        connectMessage31.setWill("hi!", "", qoS43, false);
        connectMessage25.setWill("MQIsdp", "hi!", qoS43, false);
        connectMessage17.setWill("\000\000", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS43, false);
        subscribeMessage9.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS43);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage7.setQos(qoS43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        java.util.List<java.lang.String> strList11 = subscribeMessage0.getTopics();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getUsername();
        org.meqantt.message.QoS qoS24 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS29 = subscribeMessage27.getQos();
        subscribeMessage25.addTopic("", qoS29);
        connectMessage19.setWill("", "\000d\000\001\001d", qoS29, true);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("hi!", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS29);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage5 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        boolean boolean4 = connectMessage2.hasPassword();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS9 = unsubscribeMessage8.getQos();
        connectMessage2.setWill("", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS9, false);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage9 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header11 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header11);
        org.meqantt.message.PubCompMessage pubCompMessage13 = new org.meqantt.message.PubCompMessage(header11);
        org.meqantt.message.PubAckMessage pubAckMessage14 = new org.meqantt.message.PubAckMessage(header11);
        org.meqantt.message.PublishMessage publishMessage15 = new org.meqantt.message.PublishMessage(header11);
        org.meqantt.message.ConnAckMessage connAckMessage16 = new org.meqantt.message.ConnAckMessage(header11);
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage(header11);
        org.meqantt.message.Message.Header header19 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type20 = header19.getType();
        org.meqantt.message.Message.Type type21 = header19.getType();
        org.meqantt.message.SubAckMessage subAckMessage22 = new org.meqantt.message.SubAckMessage(header19);
        org.meqantt.message.PingReqMessage pingReqMessage23 = new org.meqantt.message.PingReqMessage(header19);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage(header19);
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage(header19);
        org.meqantt.message.PingReqMessage pingReqMessage26 = new org.meqantt.message.PingReqMessage(header19);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage(header19);
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage30 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList31 = unsubscribeMessage30.getTopics();
        org.meqantt.message.Message.Type type32 = unsubscribeMessage30.getType();
        java.util.List<java.lang.String> strList33 = unsubscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS34 = unsubscribeMessage30.getQos();
        subscribeMessage27.setQos(qoS34);
        subAckMessage17.addQoS(qoS34);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage9.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type20);
        org.junit.Assert.assertNull(type21);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type32.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        pubRecMessage6.setMessageId((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage2.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(connectionStatus4);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(connectionStatus4);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(connectionStatus4);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus4 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus4.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        connectMessage5.setCredentials("\000\003hi!", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS11 = unsubscribeMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage5.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean11 = connectMessage10.hasWill();
        java.lang.String str12 = connectMessage10.getWill();
        java.lang.String str13 = connectMessage10.getWill();
        java.lang.String str14 = connectMessage10.getProtocolId();
        java.lang.String str15 = connectMessage10.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage18 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList19 = subAckMessage18.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList20 = subAckMessage18.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str25 = connectMessage24.getProtocolId();
        org.meqantt.message.QoS qoS26 = connectMessage24.getQos();
        subAckMessage18.addQoS(qoS26);
        connectMessage10.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS26, false);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage6.setQos(qoS26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MQIsdp" + "'", str14, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertNull(qoSList19);
        org.junit.Assert.assertNull(qoSList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MQIsdp" + "'", str25, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        org.meqantt.message.QoS qoS2 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage("", qoS2);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        subscribeMessage3.addTopic("", qoS7);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS7);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage9.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header9 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header9);
        byte byte11 = connectMessage10.getProtocolVersion();
        boolean boolean12 = connectMessage10.hasUsername();
        java.lang.String str13 = connectMessage10.getWill();
        boolean boolean14 = connectMessage10.isRetained();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        connectMessage10.setWill("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", qoS19, false);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 3 + "'", byte11 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        connectMessage1.setCredentials("\000d\000\001\001d", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 100);
        pubRecMessage1.setMessageId((int) (byte) 3);
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header5);
        byte byte7 = connectMessage6.getProtocolVersion();
        boolean boolean8 = connectMessage6.hasUsername();
        java.lang.String str9 = connectMessage6.getWill();
        boolean boolean10 = connectMessage6.isRetained();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        connectMessage6.setWill("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", qoS15, false);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 3 + "'", byte7 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        org.meqantt.message.Message.Header header2 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type3 = header2.getType();
        org.meqantt.message.Message.Type type4 = header2.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage5 = new org.meqantt.message.UnsubAckMessage(header2);
        org.meqantt.message.QoS qoS6 = unsubAckMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS6);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header1);
        byte byte10 = connectMessage9.getProtocolVersion();
        connectMessage9.setCredentials("hi!");
        byte byte13 = connectMessage9.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage9.setCredentials("", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: It is not valid to supply a password without supplying a username.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 3 + "'", byte10 == (byte) 3);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 3 + "'", byte13 == (byte) 3);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        org.meqantt.message.QoS qoS8 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        subscribeMessage9.addTopic("", qoS13);
        connectMessage3.setWill("", "\000d\000\001\001d", qoS13, true);
        boolean boolean17 = connectMessage3.isCleanSession();
        java.lang.String str18 = connectMessage3.getClientId();
        java.lang.String str19 = connectMessage3.getPassword();
        java.lang.String str20 = connectMessage3.getWill();
        byte[] byteArray21 = connectMessage3.toBytes();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000d\000\001\001d" + "'", str20, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        boolean boolean10 = connectMessage9.isWillRetained();
        boolean boolean11 = connectMessage9.isWillRetained();
        java.lang.String str12 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage9.setWill("hi!", "", qoS21, false);
        connectMessage3.setWill("MQIsdp", "hi!", qoS21, false);
        boolean boolean27 = connectMessage3.isCleanSession();
        boolean boolean28 = connectMessage3.hasPassword();
        connectMessage3.setWill("hi!", "\000\000");
        org.meqantt.message.QoS qoS32 = connectMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) '\001');
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, 1);
        byte byte6 = connectMessage5.getProtocolVersion();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        org.meqantt.message.QoS qoS13 = null;
        subscribeMessage9.addTopic("", qoS13);
        java.util.List<org.meqantt.message.QoS> qoSList15 = subscribeMessage9.getTopicQoSs();
        subscribeMessage9.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList18 = subscribeMessage9.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getUsername();
        org.meqantt.message.QoS qoS28 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("", qoS28);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList32 = subscribeMessage31.getTopics();
        org.meqantt.message.QoS qoS33 = subscribeMessage31.getQos();
        subscribeMessage29.addTopic("", qoS33);
        connectMessage23.setWill("", "\000d\000\001\001d", qoS33, true);
        subscribeMessage9.addTopic("\000\000", qoS33);
        connectMessage5.setWill("", "\000\003hi!", qoS33, true);
        org.meqantt.message.Message.Header header42 = null;
        org.meqantt.message.ConnectMessage connectMessage43 = new org.meqantt.message.ConnectMessage(header42);
        boolean boolean44 = connectMessage43.isWillRetained();
        boolean boolean45 = connectMessage43.isWillRetained();
        java.lang.String str46 = connectMessage43.getUsername();
        org.meqantt.message.QoS qoS50 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("", qoS50);
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList54 = subscribeMessage53.getTopics();
        org.meqantt.message.QoS qoS55 = subscribeMessage53.getQos();
        subscribeMessage51.addTopic("", qoS55);
        connectMessage43.setWill("hi!", "", qoS55, false);
        boolean boolean59 = connectMessage43.hasUsername();
        org.meqantt.message.QoS qoS60 = connectMessage43.getWillQoS();
        connectMessage5.setWill("hi!", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS60, true);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList15);
        org.junit.Assert.assertNotNull(qoSList18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + qoS60 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS60.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header1);
        java.lang.String str12 = header1.toString();
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str12, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        subAckMessage0.addQoS(qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage0.getGrantedQoSs();
        boolean boolean8 = subAckMessage0.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.meqantt.MqttListener mqttListener9 = null;
        nettyClient1.setListener(mqttListener9);
        nettyClient1.subscribe("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        nettyClient1.connect("\000\000", (int) (short) 100);
        nettyClient1.unsubscribe("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        nettyClient1.ping();
        nettyClient1.ping();
        nettyClient1.unsubscribe("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(0);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        connectMessage3.setCredentials("\000d\000\001\001d");
        connectMessage3.setCredentials("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.message.Message.Header header10 = null;
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header10);
        int int12 = connectMessage11.getKeepAlive();
        connectMessage11.setWill("MQIsdp", "");
        java.lang.String str16 = connectMessage11.getWillTopic();
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str27 = connectMessage26.getUsername();
        org.meqantt.message.QoS qoS31 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("", qoS31);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList35 = subscribeMessage34.getTopics();
        org.meqantt.message.QoS qoS36 = subscribeMessage34.getQos();
        subscribeMessage32.addTopic("", qoS36);
        connectMessage26.setWill("", "\000d\000\001\001d", qoS36, true);
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("hi!", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList46 = subscribeMessage45.getTopics();
        org.meqantt.message.ConnectMessage connectMessage51 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str52 = connectMessage51.getProtocolId();
        org.meqantt.message.QoS qoS53 = connectMessage51.getQos();
        subscribeMessage45.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS53);
        subscribeMessage43.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS53);
        org.meqantt.message.ConnectMessage connectMessage60 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str61 = connectMessage60.getProtocolId();
        org.meqantt.message.QoS qoS62 = connectMessage60.getQos();
        subscribeMessage43.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS62);
        connectMessage11.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS62, false);
        boolean boolean66 = connectMessage11.isWillRetained();
        org.meqantt.message.QoS qoS67 = connectMessage11.getWillQoS();
        connectMessage3.setWill("", "\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS67, true);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MQIsdp" + "'", str16, "MQIsdp");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MQIsdp" + "'", str52, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "MQIsdp" + "'", str61, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS62 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS62.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + qoS67 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS67.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) 0);
        boolean boolean2 = pubCompMessage1.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        byte[] byteArray4 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str5 = org.meqantt.util.FormatUtil.toString(byteArray4);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage("hi!", byteArray4);
        publishMessage6.setMessageId((int) '\001');
        int int9 = publishMessage6.getMessageId();
        byte[] byteArray10 = publishMessage6.getData();
        java.lang.String str11 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray10);
        org.meqantt.message.PublishMessage publishMessage12 = new org.meqantt.message.PublishMessage("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", byteArray10);
        org.meqantt.message.PublishMessage publishMessage13 = new org.meqantt.message.PublishMessage("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", byteArray10);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            publishMessage13.write(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str11, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.disconnect();
        nettyClient1.ping();
        nettyClient1.subscribe("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        nettyClient1.connect("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", (int) (byte) 100);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header4 = null;
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header4);
        int int6 = connectMessage5.getKeepAlive();
        connectMessage5.setWill("MQIsdp", "");
        java.lang.String str10 = connectMessage5.getWillTopic();
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str21 = connectMessage20.getUsername();
        org.meqantt.message.QoS qoS25 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("", qoS25);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList29 = subscribeMessage28.getTopics();
        org.meqantt.message.QoS qoS30 = subscribeMessage28.getQos();
        subscribeMessage26.addTopic("", qoS30);
        connectMessage20.setWill("", "\000d\000\001\001d", qoS30, true);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("hi!", qoS30);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS30);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("", qoS30);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS30);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList40 = subscribeMessage39.getTopics();
        org.meqantt.message.ConnectMessage connectMessage45 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str46 = connectMessage45.getProtocolId();
        org.meqantt.message.QoS qoS47 = connectMessage45.getQos();
        subscribeMessage39.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS47);
        subscribeMessage37.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS47);
        org.meqantt.message.ConnectMessage connectMessage54 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str55 = connectMessage54.getProtocolId();
        org.meqantt.message.QoS qoS56 = connectMessage54.getQos();
        subscribeMessage37.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS56);
        connectMessage5.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS56, false);
        boolean boolean60 = connectMessage5.isWillRetained();
        org.meqantt.message.QoS qoS61 = connectMessage5.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setQos(qoS61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "MQIsdp" + "'", str46, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "MQIsdp" + "'", str55, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS56 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS56.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + qoS61 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS61.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage6.write(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList7);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        java.lang.Class<?> wildcardClass6 = header1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str7 = connectMessage6.getWill();
        connectMessage6.setWill("\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
        boolean boolean11 = connectMessage6.isDup();
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type14 = header13.getType();
        org.meqantt.message.Message.Type type15 = header13.getType();
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage(header13);
        org.meqantt.message.PingReqMessage pingReqMessage17 = new org.meqantt.message.PingReqMessage(header13);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage(header13);
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage(header13);
        org.meqantt.message.PingReqMessage pingReqMessage20 = new org.meqantt.message.PingReqMessage(header13);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage(header13);
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        subscribeMessage21.setDup(false);
        org.meqantt.message.Message.Header header26 = null;
        org.meqantt.message.ConnectMessage connectMessage27 = new org.meqantt.message.ConnectMessage(header26);
        int int28 = connectMessage27.getKeepAlive();
        connectMessage27.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS32 = connectMessage27.getWillQoS();
        subscribeMessage21.addTopic("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS32);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage6.setQos(qoS32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        org.meqantt.MqttListener mqttListener4 = null;
        nettyClient1.setListener(mqttListener4);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.Message.Type type6 = header1.getType();
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Header header9 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type10 = header9.getType();
        org.meqantt.message.Message.Type type11 = header9.getType();
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage(header9);
        org.meqantt.message.PingReqMessage pingReqMessage13 = new org.meqantt.message.PingReqMessage(header9);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage(header9);
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage(header9);
        org.meqantt.message.PingReqMessage pingReqMessage16 = new org.meqantt.message.PingReqMessage(header9);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage(header9);
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        subscribeMessage17.setDup(false);
        org.meqantt.message.Message.Header header22 = null;
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header22);
        int int24 = connectMessage23.getKeepAlive();
        connectMessage23.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS28 = connectMessage23.getWillQoS();
        subscribeMessage17.addTopic("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS28);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setQos(qoS28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        subAckMessage0.addQoS(qoS7);
        org.meqantt.message.QoS qoS10 = subAckMessage0.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS15);
        org.meqantt.message.QoS qoS18 = subscribeMessage17.getQos();
        subAckMessage0.addQoS(qoS18);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.write(outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        boolean boolean1 = connectMessage0.hasWill();
        java.lang.String str2 = connectMessage0.getProtocolId();
        org.meqantt.message.QoS qoS3 = connectMessage0.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MQIsdp" + "'", str2, "MQIsdp");
        org.junit.Assert.assertNull(qoS3);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        int int3 = pubAckMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        int int9 = connectMessage1.getKeepAlive();
        java.lang.String str10 = connectMessage1.getUsername();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage(1);
        pubAckMessage1.setMessageId((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        boolean boolean8 = connectMessage7.isWillRetained();
        boolean boolean9 = connectMessage7.isWillRetained();
        connectMessage7.setWill("", "MQIsdp");
        boolean boolean13 = connectMessage7.isWillRetained();
        java.lang.String str14 = connectMessage7.getClientId();
        int int15 = connectMessage7.getKeepAlive();
        org.meqantt.message.Message.Header header19 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage20 = new org.meqantt.message.PingReqMessage(header19);
        org.meqantt.message.PubCompMessage pubCompMessage21 = new org.meqantt.message.PubCompMessage(header19);
        org.meqantt.message.PubAckMessage pubAckMessage22 = new org.meqantt.message.PubAckMessage(header19);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage23 = new org.meqantt.message.UnsubscribeMessage(header19);
        org.meqantt.message.PublishMessage publishMessage24 = new org.meqantt.message.PublishMessage(header19);
        org.meqantt.message.Message.Type type25 = header19.getType();
        org.meqantt.message.PingReqMessage pingReqMessage26 = new org.meqantt.message.PingReqMessage(header19);
        org.meqantt.message.PingReqMessage pingReqMessage27 = new org.meqantt.message.PingReqMessage(header19);
        org.meqantt.message.SubAckMessage subAckMessage28 = new org.meqantt.message.SubAckMessage(header19);
        org.meqantt.message.ConnectMessage connectMessage34 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str35 = connectMessage34.getUsername();
        org.meqantt.message.QoS qoS39 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("", qoS39);
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList43 = subscribeMessage42.getTopics();
        org.meqantt.message.QoS qoS44 = subscribeMessage42.getQos();
        subscribeMessage40.addTopic("", qoS44);
        connectMessage34.setWill("", "\000d\000\001\001d", qoS44, true);
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage("hi!", qoS44);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS44);
        subAckMessage28.addQoS(qoS44);
        connectMessage7.setWill("\000\000", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS44, true);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(type25);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.meqantt.MqttListener mqttListener7 = null;
        mqttMessageHandler0.setListener(mqttListener7);
        org.meqantt.MqttListener mqttListener9 = null;
        mqttMessageHandler0.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        mqttMessageHandler0.setListener(mqttListener11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.connectRequested(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Header header7 = null;
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header7);
        boolean boolean9 = connectMessage8.isWillRetained();
        boolean boolean10 = connectMessage8.isWillRetained();
        java.lang.String str11 = connectMessage8.getUsername();
        boolean boolean12 = connectMessage8.isCleanSession();
        java.lang.String str13 = connectMessage8.getWill();
        boolean boolean14 = connectMessage8.hasUsername();
        java.lang.String str15 = connectMessage8.getProtocolId();
        org.meqantt.message.Message.Header header18 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage(header18);
        org.meqantt.message.QoS qoS21 = null;
        subscribeMessage19.addTopic("hi!", qoS21);
        java.util.List<org.meqantt.message.QoS> qoSList23 = subscribeMessage19.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage29 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str30 = connectMessage29.getUsername();
        org.meqantt.message.QoS qoS34 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("", qoS34);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList38 = subscribeMessage37.getTopics();
        org.meqantt.message.QoS qoS39 = subscribeMessage37.getQos();
        subscribeMessage35.addTopic("", qoS39);
        connectMessage29.setWill("", "\000d\000\001\001d", qoS39, true);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("hi!", qoS39);
        subscribeMessage19.addTopic("\000d\000\001\001d", qoS39);
        connectMessage8.setWill("\000d\000\001\001d", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS39, false);
        subAckMessage6.addQoS(qoS39);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage6.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertNotNull(qoSList23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }
}
