package org.meqantt;

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
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.CONNECT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.CONNECT + "'", type0.equals(org.meqantt.message.Message.Type.CONNECT));
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.CONNACK;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.CONNACK + "'", type0.equals(org.meqantt.message.Message.Type.CONNACK));
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        org.meqantt.message.QoS qoS5 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.PUBREC;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.PUBREC + "'", type0.equals(org.meqantt.message.Message.Type.PUBREC));
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.PUBREL;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type0.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        char char0 = org.meqantt.message.Message.nextId();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\001' + "'", char0 == '\001');
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.SUBSCRIBE;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type0.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelOpen(channelHandlerContext1, childChannelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleDownstream(channelHandlerContext1, channelEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.PINGREQ;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.PINGREQ + "'", type0.equals(org.meqantt.message.Message.Type.PINGREQ));
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.PUBLISH;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.PUBLISH + "'", type0.equals(org.meqantt.message.Message.Type.PUBLISH));
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.DISCONNECT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.DISCONNECT + "'", type0.equals(org.meqantt.message.Message.Type.DISCONNECT));
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.meqantt.message.ConnAckMessage connAckMessage0 = new org.meqantt.message.ConnAckMessage();
        org.meqantt.message.QoS qoS1 = null;
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage0.setQos(qoS1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.connectRequested(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        org.meqantt.message.QoS qoS5 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setWill("MQIsdp", "hi!", qoS5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't set willTopic, will or willQoS value independently");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelUnbound(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.PUBACK;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.PUBACK + "'", type0.equals(org.meqantt.message.Message.Type.PUBACK));
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = publishMessage1.getDataAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PingReqMessage pingReqMessage1 = new org.meqantt.message.PingReqMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        org.meqantt.message.QoS qoS2 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelConnected(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        org.meqantt.message.QoS qoS4 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.UnsubAckMessage unsubAckMessage1 = new org.meqantt.message.UnsubAckMessage(header0);
        org.meqantt.message.QoS qoS2 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage1.setQos(qoS2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.QoS qoS1 = null;
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        org.meqantt.message.QoS qoS7 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setWill("MQIsdp", "", qoS7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't set willTopic, will or willQoS value independently");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.UNSUBSCRIBE;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type0.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.meqantt.message.PingRespMessage pingRespMessage0 = new org.meqantt.message.PingRespMessage();
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelClosed(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("", byteArray7);
        java.lang.String str9 = publishMessage8.getDataAsString();
        publishMessage8.setMessageId(1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\000\001\001d" + "'", str9, "\000d\000\001\001d");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 10);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.io.InputStream inputStream0 = null;
        org.meqantt.message.MessageInputStream messageInputStream1 = new org.meqantt.message.MessageInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            messageInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.closeRequested(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelOpen(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.PUBCOMP;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.PUBCOMP + "'", type0.equals(org.meqantt.message.Message.Type.PUBCOMP));
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelInterestChanged(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.UNSUBACK;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.UNSUBACK + "'", type0.equals(org.meqantt.message.Message.Type.UNSUBACK));
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeComplete(channelHandlerContext3, writeCompletionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        int int5 = connectMessage3.getKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.SUBACK;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.SUBACK + "'", type0.equals(org.meqantt.message.Message.Type.SUBACK));
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.meqantt.message.ConnAckMessage connAckMessage0 = new org.meqantt.message.ConnAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
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
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.UnsubAckMessage unsubAckMessage1 = new org.meqantt.message.UnsubAckMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.unbindRequested(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.DisconnectMessage disconnectMessage1 = new org.meqantt.message.DisconnectMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.meqantt.message.DisconnectMessage disconnectMessage0 = new org.meqantt.message.DisconnectMessage();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelDisconnected(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.MessageEvent messageEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeRequested(channelHandlerContext1, messageEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelClosed(channelHandlerContext1, childChannelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.io.InputStream inputStream0 = null;
        org.meqantt.message.MessageInputStream messageInputStream1 = new org.meqantt.message.MessageInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.Message message2 = messageInputStream1.readMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        org.meqantt.message.QoS qoS4 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        subscribeMessage5.addTopic("", qoS9);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.UnsubAckMessage unsubAckMessage1 = new org.meqantt.message.UnsubAckMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelDisconnected(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.bindRequested(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.DisconnectMessage disconnectMessage1 = new org.meqantt.message.DisconnectMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelConnected(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int int0 = org.meqantt.message.ConnAckMessage.MESSAGE_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.QoS qoS4 = null;
        subscribeMessage0.addTopic("", qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList6);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 10);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean6 = connectMessage5.hasWill();
        java.lang.String str7 = connectMessage5.getWill();
        org.meqantt.message.Message.Header header10 = null;
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header10);
        boolean boolean12 = connectMessage11.isWillRetained();
        boolean boolean13 = connectMessage11.isWillRetained();
        java.lang.String str14 = connectMessage11.getUsername();
        org.meqantt.message.QoS qoS18 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        subscribeMessage19.addTopic("", qoS23);
        connectMessage11.setWill("hi!", "", qoS23, false);
        connectMessage5.setWill("MQIsdp", "hi!", qoS23, false);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 10);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getUsername();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        connectMessage5.setWill("", "\000d\000\001\001d", qoS15, true);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(0);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleDownstream(channelHandlerContext3, channelEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean7 = connectMessage6.hasWill();
        java.lang.String str8 = connectMessage6.getWill();
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header11);
        boolean boolean13 = connectMessage12.isWillRetained();
        boolean boolean14 = connectMessage12.isWillRetained();
        java.lang.String str15 = connectMessage12.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage12.setWill("hi!", "", qoS24, false);
        connectMessage6.setWill("MQIsdp", "hi!", qoS24, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.meqantt.message.DisconnectMessage disconnectMessage0 = new org.meqantt.message.DisconnectMessage();
        org.meqantt.message.QoS qoS2 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage("", qoS2);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        subscribeMessage3.addTopic("", qoS7);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage0.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.UnsubAckMessage unsubAckMessage1 = new org.meqantt.message.UnsubAckMessage(header0);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage2.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getProtocolId();
        org.meqantt.message.QoS qoS10 = connectMessage8.getQos();
        subAckMessage2.addQoS(qoS10);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage1.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelClosed(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelOpen(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleUpstream(channelHandlerContext1, channelEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(0);
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
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
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
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.bindRequested(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.unbindRequested(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.connect("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.meqantt.message.Message.Type type0 = org.meqantt.message.Message.Type.PINGRESP;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.meqantt.message.Message.Type.PINGRESP + "'", type0.equals(org.meqantt.message.Message.Type.PINGRESP));
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList2 = subscribeMessage1.getTopics();
        org.meqantt.message.QoS qoS3 = subscribeMessage1.getQos();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getProtocolId();
        org.meqantt.message.QoS qoS10 = connectMessage8.getQos();
        subscribeMessage1.addTopic("", qoS10);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + qoS3 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS3.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        byte[] byteArray4 = pingRespMessage3.toBytes();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0]");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage5.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getProtocolId();
        org.meqantt.message.QoS qoS13 = connectMessage11.getQos();
        subAckMessage5.addQoS(qoS13);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.meqantt.message.ConnAckMessage connAckMessage0 = new org.meqantt.message.ConnAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.DisconnectMessage disconnectMessage1 = new org.meqantt.message.DisconnectMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 10);
        org.meqantt.message.QoS qoS3 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage("", qoS3);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        subscribeMessage4.addTopic("", qoS8);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.exceptionCaught(channelHandlerContext1, exceptionEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.meqantt.message.ConnAckMessage connAckMessage0 = new org.meqantt.message.ConnAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelOpen(channelHandlerContext3, childChannelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.disconnectRequested(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.MessageEvent messageEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeRequested(channelHandlerContext3, messageEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.MessageEvent messageEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.messageReceived(channelHandlerContext1, messageEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.channelDisconnected(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
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
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
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
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage18.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage("", byteArray8);
        java.lang.String str10 = publishMessage9.getDataAsString();
        byte[] byteArray11 = publishMessage9.getData();
        org.meqantt.message.PublishMessage publishMessage12 = new org.meqantt.message.PublishMessage("MQIsdp", byteArray11);
        java.lang.Class<?> wildcardClass13 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000d\000\001\001d" + "'", str10, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.meqantt.util.FormatUtil formatUtil0 = new org.meqantt.util.FormatUtil();
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.meqantt.message.DisconnectMessage disconnectMessage0 = new org.meqantt.message.DisconnectMessage();
        org.meqantt.message.SubAckMessage subAckMessage1 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage1.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage1.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subAckMessage1.addQoS(qoS9);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage0.setQos(qoS9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getUsername();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        connectMessage7.setWill("", "\000d\000\001\001d", qoS17, true);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage3.setQos(qoS17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getUsername();
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
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
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
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.childChannelClosed(channelHandlerContext1, childChannelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.channelClosed(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isCleanSession();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelBound(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.channelOpen(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '4');
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getUsername();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        connectMessage5.setWill("", "\000d\000\001\001d", qoS15, true);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.channelBound(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        int int1 = subAckMessage0.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(qoSList2);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type2 = subscribeMessage1.getType();
        org.meqantt.message.QoS qoS5 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        subscribeMessage6.addTopic("", qoS10);
        subscribeMessage1.addTopic("MQIsdp", qoS10);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type2.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.QoS qoS6 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        subscribeMessage7.addTopic("", qoS11);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 3);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(0);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.channelUnbound(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelInterestChanged(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS3 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 1);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type3 = subscribeMessage2.getType();
        org.meqantt.message.QoS qoS6 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        subscribeMessage7.addTopic("", qoS11);
        subscribeMessage2.addTopic("MQIsdp", qoS11);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.exceptionCaught(channelHandlerContext1, exceptionEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        java.lang.String str2 = publishMessage1.getTopic();
        int int3 = publishMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = publishMessage1.getDataAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.DisconnectMessage disconnectMessage1 = new org.meqantt.message.DisconnectMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(1);
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
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.closeRequested(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getUsername();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        connectMessage5.setWill("", "\000d\000\001\001d", qoS15, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(0);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str16 = connectMessage15.getUsername();
        org.meqantt.message.QoS qoS20 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("", qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList24 = subscribeMessage23.getTopics();
        org.meqantt.message.QoS qoS25 = subscribeMessage23.getQos();
        subscribeMessage21.addTopic("", qoS25);
        connectMessage15.setWill("", "\000d\000\001\001d", qoS25, true);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("hi!", qoS25);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.disconnectRequested(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.meqantt.netty.MqttMessageEncoder mqttMessageEncoder0 = new org.meqantt.netty.MqttMessageEncoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageEncoder0.handleDownstream(channelHandlerContext1, channelEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.channelConnected(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.handleUpstream(channelHandlerContext1, channelEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleUpstream(channelHandlerContext3, channelEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeComplete(channelHandlerContext1, writeCompletionEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.childChannelOpen(channelHandlerContext1, childChannelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS5 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage4 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList4 = subscribeMessage0.getTopicQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(qoSList4);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        int int4 = connectMessage1.getKeepAlive();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getProtocolId();
        org.meqantt.message.QoS qoS14 = connectMessage12.getQos();
        subscribeMessage5.addTopic("", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        connectMessage1.setCredentials("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getProtocolId();
        org.meqantt.message.QoS qoS11 = connectMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION));
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getProtocolId();
        org.meqantt.message.QoS qoS11 = connectMessage9.getQos();
        subscribeMessage2.addTopic("", qoS11);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        boolean boolean2 = pingReqMessage0.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MQIsdp" + "'", str5, "MQIsdp");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasUsername();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getProtocolId();
        org.meqantt.message.QoS qoS14 = connectMessage12.getQos();
        subscribeMessage5.addTopic("", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList3 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean8 = connectMessage7.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("hi!");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("hi!");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000\000", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage(0);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS14 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        subscribeMessage15.addTopic("", qoS19);
        connectMessage9.setWill("", "\000d\000\001\001d", qoS19, true);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("hi!", qoS19);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("hi!");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 00000000 ? 0?01: 01100100 d 100?02: 00000000 ? 0?03: 00000001 ? 1?04: 00000001 ? 1?05: 01100100 d 100?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '4');
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean7 = connectMessage6.hasWill();
        java.lang.String str8 = connectMessage6.getWill();
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header11);
        boolean boolean13 = connectMessage12.isWillRetained();
        boolean boolean14 = connectMessage12.isWillRetained();
        java.lang.String str15 = connectMessage12.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage12.setWill("hi!", "", qoS24, false);
        connectMessage6.setWill("MQIsdp", "hi!", qoS24, false);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Type type3 = pingReqMessage2.getType();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.meqantt.message.ConnAckMessage connAckMessage0 = new org.meqantt.message.ConnAckMessage();
        org.meqantt.message.Message.Header header1 = null;
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        boolean boolean4 = connectMessage2.isWillRetained();
        java.lang.String str5 = connectMessage2.getUsername();
        org.meqantt.message.QoS qoS9 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        subscribeMessage10.addTopic("", qoS14);
        connectMessage2.setWill("hi!", "", qoS14, false);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage0.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("", "hi!");
        boolean boolean3 = publishMessage2.isDup();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = pubAckMessage1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
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
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type19 = subscribeMessage18.getType();
        org.meqantt.message.QoS qoS22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        subscribeMessage23.addTopic("", qoS27);
        subscribeMessage18.addTopic("MQIsdp", qoS27);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type19.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage8 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS9 = pubRelMessage8.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setQos(qoS9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList3 = unsubscribeMessage1.getTopics();
        org.meqantt.message.PubRelMessage pubRelMessage5 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS6 = pubRelMessage5.getQos();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("MQIsdp", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: MQIsdp");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
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
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.meqantt.message.DisconnectMessage disconnectMessage0 = new org.meqantt.message.DisconnectMessage();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.channelInterestChanged(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.QoS qoS5 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        subscribeMessage6.addTopic("", qoS10);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage4 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS7 = pubRelMessage6.getQos();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage4.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        java.lang.String str6 = connectMessage3.getWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 0);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean6 = connectMessage5.hasWill();
        java.lang.String str7 = connectMessage5.getWill();
        org.meqantt.message.Message.Header header10 = null;
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header10);
        boolean boolean12 = connectMessage11.isWillRetained();
        boolean boolean13 = connectMessage11.isWillRetained();
        java.lang.String str14 = connectMessage11.getUsername();
        org.meqantt.message.QoS qoS18 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        subscribeMessage19.addTopic("", qoS23);
        connectMessage11.setWill("hi!", "", qoS23, false);
        connectMessage5.setWill("MQIsdp", "hi!", qoS23, false);
        org.meqantt.message.SubAckMessage subAckMessage31 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList32 = subAckMessage31.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList33 = subAckMessage31.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList34 = subAckMessage31.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList37 = subscribeMessage36.getTopics();
        org.meqantt.message.QoS qoS38 = subscribeMessage36.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS38);
        subAckMessage31.addQoS(qoS38);
        connectMessage5.setWill("hi!", "MQIsdp", qoS38, true);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList32);
        org.junit.Assert.assertNull(qoSList33);
        org.junit.Assert.assertNull(qoSList34);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.exceptionCaught(channelHandlerContext3, exceptionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean8 = connectMessage7.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage7.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(2);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        java.lang.Class<?> wildcardClass8 = disconnectMessage7.getClass();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelClosed(channelHandlerContext3, childChannelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage2.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getProtocolId();
        org.meqantt.message.QoS qoS10 = connectMessage8.getQos();
        subAckMessage2.addQoS(qoS10);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.UnsubAckMessage unsubAckMessage1 = new org.meqantt.message.UnsubAckMessage(header0);
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
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage1.setQos(qoS17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage4 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        boolean boolean8 = connectMessage7.isWillRetained();
        boolean boolean9 = connectMessage7.isWillRetained();
        java.lang.String str10 = connectMessage7.getUsername();
        org.meqantt.message.QoS qoS14 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        subscribeMessage15.addTopic("", qoS19);
        connectMessage7.setWill("hi!", "", qoS19, false);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        byte[] byteArray4 = publishMessage1.getData();
        byte[] byteArray5 = publishMessage1.getData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = publishMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        subscribeMessage2.addTopic("", qoS6);
        java.util.List<java.lang.String> strList8 = subscribeMessage2.getTopics();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.UnsubAckMessage unsubAckMessage1 = new org.meqantt.message.UnsubAckMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        boolean boolean10 = connectMessage1.hasUsername();
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
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.QoS qoS5 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        subscribeMessage6.addTopic("", qoS10);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 0);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage3.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage3.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getProtocolId();
        org.meqantt.message.QoS qoS11 = connectMessage9.getQos();
        subAckMessage3.addQoS(qoS11);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage2.write(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        java.lang.String str3 = connectMessage1.getWill();
        org.meqantt.message.QoS qoS4 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
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
            subscribeMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
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
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
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
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage18.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.meqantt.netty.MqttMessageDecoder mqttMessageDecoder0 = new org.meqantt.netty.MqttMessageDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageDecoder0.writeComplete(channelHandlerContext1, writeCompletionEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
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
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelBound(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) 1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean7 = connectMessage6.hasWill();
        java.lang.String str8 = connectMessage6.getWill();
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header11);
        boolean boolean13 = connectMessage12.isWillRetained();
        boolean boolean14 = connectMessage12.isWillRetained();
        java.lang.String str15 = connectMessage12.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage12.setWill("hi!", "", qoS24, false);
        connectMessage6.setWill("MQIsdp", "hi!", qoS24, false);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 0);
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
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        org.meqantt.message.PubRelMessage pubRelMessage3 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS4 = pubRelMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Type type5 = pubAckMessage4.getType();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage9.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        subAckMessage9.addQoS(qoS16);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage9.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str17 = connectMessage16.getProtocolId();
        org.meqantt.message.QoS qoS18 = connectMessage16.getQos();
        subscribeMessage10.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS18);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage9.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MQIsdp" + "'", str17, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a valid QoS number: 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getUsername();
        org.meqantt.message.QoS qoS13 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.QoS qoS18 = subscribeMessage16.getQos();
        subscribeMessage14.addTopic("", qoS18);
        connectMessage8.setWill("", "\000d\000\001\001d", qoS18, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
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
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str25 = connectMessage24.getProtocolId();
        org.meqantt.message.QoS qoS26 = connectMessage24.getQos();
        subscribeMessage18.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS26);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS26);
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
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "MQIsdp" + "'", str25, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelUnbound(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 0);
        java.lang.String str4 = connectMessage3.getProtocolId();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS9);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '4');
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getProtocolId();
        org.meqantt.message.QoS qoS11 = connectMessage9.getQos();
        subscribeMessage2.addTopic("", qoS11);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean7 = connectMessage6.hasWill();
        java.lang.String str8 = connectMessage6.getWill();
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header11);
        boolean boolean13 = connectMessage12.isWillRetained();
        boolean boolean14 = connectMessage12.isWillRetained();
        java.lang.String str15 = connectMessage12.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage12.setWill("hi!", "", qoS24, false);
        connectMessage6.setWill("MQIsdp", "hi!", qoS24, false);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) -1);
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
            pubCompMessage1.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
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
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getUsername();
        org.meqantt.message.QoS qoS11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        subscribeMessage12.addTopic("", qoS16);
        connectMessage6.setWill("", "\000d\000\001\001d", qoS16, true);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) subscribeMessage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage5.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getProtocolId();
        org.meqantt.message.QoS qoS13 = connectMessage11.getQos();
        subAckMessage5.addQoS(qoS13);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 0);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage2.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getProtocolId();
        org.meqantt.message.QoS qoS10 = connectMessage8.getQos();
        subAckMessage2.addQoS(qoS10);
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
        org.meqantt.message.SubAckMessage subAckMessage41 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList42 = subAckMessage41.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList43 = subAckMessage41.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList44 = subAckMessage41.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList47 = subscribeMessage46.getTopics();
        org.meqantt.message.QoS qoS48 = subscribeMessage46.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("", qoS48);
        subAckMessage41.addQoS(qoS48);
        connectMessage15.setWill("hi!", "MQIsdp", qoS48, true);
        subAckMessage2.addQoS(qoS48);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList42);
        org.junit.Assert.assertNull(qoSList43);
        org.junit.Assert.assertNull(qoSList44);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000\003hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS3 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage("", qoS3);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        subscribeMessage4.addTopic("", qoS8);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Type type3 = pingReqMessage2.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        subAckMessage4.addQoS(qoS8);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(2);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean14 = connectMessage13.hasWill();
        java.lang.String str15 = connectMessage13.getWill();
        org.meqantt.message.Message.Header header18 = null;
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage(header18);
        boolean boolean20 = connectMessage19.isWillRetained();
        boolean boolean21 = connectMessage19.isWillRetained();
        java.lang.String str22 = connectMessage19.getUsername();
        org.meqantt.message.QoS qoS26 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("", qoS26);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList30 = subscribeMessage29.getTopics();
        org.meqantt.message.QoS qoS31 = subscribeMessage29.getQos();
        subscribeMessage27.addTopic("", qoS31);
        connectMessage19.setWill("hi!", "", qoS31, false);
        connectMessage13.setWill("MQIsdp", "hi!", qoS31, false);
        org.meqantt.message.SubAckMessage subAckMessage39 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList40 = subAckMessage39.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList41 = subAckMessage39.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList42 = subAckMessage39.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList45 = subscribeMessage44.getTopics();
        org.meqantt.message.QoS qoS46 = subscribeMessage44.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage("", qoS46);
        subAckMessage39.addQoS(qoS46);
        connectMessage13.setWill("hi!", "MQIsdp", qoS46, true);
        subAckMessage0.addQoS(qoS46);
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList55 = subscribeMessage54.getTopics();
        org.meqantt.message.QoS qoS56 = subscribeMessage54.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage57 = new org.meqantt.message.SubscribeMessage("", qoS56);
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS56);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList40);
        org.junit.Assert.assertNull(qoSList41);
        org.junit.Assert.assertNull(qoSList42);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + qoS46 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS46.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + qoS56 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS56.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The status of ConnAskMessage can't be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
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
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.MessageEvent messageEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.messageReceived(channelHandlerContext1, messageEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type4 = header3.getType();
        org.meqantt.message.Message.Type type5 = header3.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.ConnAckMessage connAckMessage9 = new org.meqantt.message.ConnAckMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connAckMessage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getProtocolId();
        boolean boolean7 = connectMessage5.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus2);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus2);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connAckMessage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubAckMessage subAckMessage1 = new org.meqantt.message.SubAckMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        byte[] byteArray2 = org.meqantt.util.FormatUtil.toMQttString("\000d\000\001\001d");
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage("hi!", byteArray2);
        java.lang.String str4 = org.meqantt.util.FormatUtil.toString(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000d\000\001\001d" + "'", str4, "\000d\000\001\001d");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.write(outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.connectRequested(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        pubCompMessage2.setMessageId(10);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        boolean boolean2 = pingReqMessage0.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", 2);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.Message.Header header8 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type9 = header8.getType();
        org.meqantt.message.Message.Type type10 = header8.getType();
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header8);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header8);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage(header8);
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header8);
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean22 = connectMessage21.hasWill();
        java.lang.String str23 = connectMessage21.getWill();
        org.meqantt.message.Message.Header header26 = null;
        org.meqantt.message.ConnectMessage connectMessage27 = new org.meqantt.message.ConnectMessage(header26);
        boolean boolean28 = connectMessage27.isWillRetained();
        boolean boolean29 = connectMessage27.isWillRetained();
        java.lang.String str30 = connectMessage27.getUsername();
        org.meqantt.message.QoS qoS34 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("", qoS34);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList38 = subscribeMessage37.getTopics();
        org.meqantt.message.QoS qoS39 = subscribeMessage37.getQos();
        subscribeMessage35.addTopic("", qoS39);
        connectMessage27.setWill("hi!", "", qoS39, false);
        connectMessage21.setWill("MQIsdp", "hi!", qoS39, false);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS39);
        connectMessage14.setWill("hi!", "\000\000", qoS39, true);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setQos(qoS39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getProtocolId();
        org.meqantt.message.QoS qoS14 = connectMessage12.getQos();
        subscribeMessage5.addTopic("", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        org.meqantt.message.QoS qoS6 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        connectMessage2.setCredentials("hi!", "");
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type8 = subscribeMessage7.getType();
        org.meqantt.message.QoS qoS11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        subscribeMessage12.addTopic("", qoS16);
        subscribeMessage7.addTopic("MQIsdp", qoS16);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type8.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 1);
        org.meqantt.message.PubRelMessage pubRelMessage3 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS4 = pubRelMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) 'a');
        org.meqantt.message.QoS qoS4 = connectMessage3.getWillQoS();
        org.meqantt.message.QoS qoS5 = connectMessage3.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("\000\000", qoS11);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoS4);
        org.junit.Assert.assertNull(qoS5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        byte[] byteArray5 = connectMessage3.toBytes();
        org.meqantt.message.QoS qoS6 = connectMessage3.getWillQoS();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getUsername();
        int int12 = connectMessage10.getKeepAlive();
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean19 = connectMessage18.hasWill();
        java.lang.String str20 = connectMessage18.getWill();
        org.meqantt.message.Message.Header header23 = null;
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage(header23);
        boolean boolean25 = connectMessage24.isWillRetained();
        boolean boolean26 = connectMessage24.isWillRetained();
        java.lang.String str27 = connectMessage24.getUsername();
        org.meqantt.message.QoS qoS31 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("", qoS31);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList35 = subscribeMessage34.getTopics();
        org.meqantt.message.QoS qoS36 = subscribeMessage34.getQos();
        subscribeMessage32.addTopic("", qoS36);
        connectMessage24.setWill("hi!", "", qoS36, false);
        connectMessage18.setWill("MQIsdp", "hi!", qoS36, false);
        connectMessage10.setWill("\000\000", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS36, false);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertNull(qoS6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        byte[] byteArray5 = connectMessage3.toBytes();
        java.lang.String str6 = org.meqantt.util.FormatUtil.toString(byteArray5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        int int4 = connectMessage3.getKeepAlive();
        boolean boolean5 = connectMessage3.hasUsername();
        java.lang.String str6 = connectMessage3.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        subscribeMessage2.addTopic("", qoS6);
        java.util.List<java.lang.String> strList8 = subscribeMessage2.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        int int1 = subAckMessage0.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS5 = pubRelMessage4.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        boolean boolean4 = connectMessage2.hasUsername();
        java.lang.String str5 = connectMessage2.getWill();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getProtocolId();
        org.meqantt.message.QoS qoS11 = connectMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type4 = header3.getType();
        org.meqantt.message.Message.Type type5 = header3.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header3);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) disconnectMessage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage5.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getProtocolId();
        org.meqantt.message.QoS qoS13 = connectMessage11.getQos();
        subAckMessage5.addQoS(qoS13);
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean19 = connectMessage18.hasWill();
        java.lang.String str20 = connectMessage18.getWill();
        org.meqantt.message.Message.Header header23 = null;
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage(header23);
        boolean boolean25 = connectMessage24.isWillRetained();
        boolean boolean26 = connectMessage24.isWillRetained();
        java.lang.String str27 = connectMessage24.getUsername();
        org.meqantt.message.QoS qoS31 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("", qoS31);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList35 = subscribeMessage34.getTopics();
        org.meqantt.message.QoS qoS36 = subscribeMessage34.getQos();
        subscribeMessage32.addTopic("", qoS36);
        connectMessage24.setWill("hi!", "", qoS36, false);
        connectMessage18.setWill("MQIsdp", "hi!", qoS36, false);
        org.meqantt.message.SubAckMessage subAckMessage44 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList45 = subAckMessage44.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList46 = subAckMessage44.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList47 = subAckMessage44.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList50 = subscribeMessage49.getTopics();
        org.meqantt.message.QoS qoS51 = subscribeMessage49.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage("", qoS51);
        subAckMessage44.addQoS(qoS51);
        connectMessage18.setWill("hi!", "MQIsdp", qoS51, true);
        subAckMessage5.addQoS(qoS51);
        subAckMessage4.addQoS(qoS51);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList45);
        org.junit.Assert.assertNull(qoSList46);
        org.junit.Assert.assertNull(qoSList47);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + qoS51 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS51.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        org.meqantt.message.Message.Header header6 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header6);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header6);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header6);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage10.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage10.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str17 = connectMessage16.getProtocolId();
        org.meqantt.message.QoS qoS18 = connectMessage16.getQos();
        subAckMessage10.addQoS(qoS18);
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
        org.meqantt.message.SubAckMessage subAckMessage49 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList50 = subAckMessage49.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList51 = subAckMessage49.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList52 = subAckMessage49.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList55 = subscribeMessage54.getTopics();
        org.meqantt.message.QoS qoS56 = subscribeMessage54.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage57 = new org.meqantt.message.SubscribeMessage("", qoS56);
        subAckMessage49.addQoS(qoS56);
        connectMessage23.setWill("hi!", "MQIsdp", qoS56, true);
        subAckMessage10.addQoS(qoS56);
        subAckMessage9.addQoS(qoS56);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MQIsdp" + "'", str17, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList50);
        org.junit.Assert.assertNull(qoSList51);
        org.junit.Assert.assertNull(qoSList52);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + qoS56 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS56.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
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
        boolean boolean28 = connectMessage3.hasWill();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        boolean boolean7 = connectMessage1.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = connectMessage1.isRetained();
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
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.isCleanSession();
        org.meqantt.message.PubRelMessage pubRelMessage7 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS8 = pubRelMessage7.getQos();
        connectMessage1.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp", qoS8, true);
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS11 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Type type3 = pingReqMessage2.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.QoS qoS4 = null;
        subscribeMessage0.addTopic("", qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        subscribeMessage0.setMessageId((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList6);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 3);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        boolean boolean5 = pubAckMessage4.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
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
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.UNACCEPTABLE_PROTOCOL_VERSION));
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isWillRetained();
        int int4 = connectMessage1.getKeepAlive();
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
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
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
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        java.lang.String str6 = connectMessage1.getClientId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS14 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        subscribeMessage15.addTopic("", qoS19);
        connectMessage9.setWill("", "\000d\000\001\001d", qoS19, true);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("hi!", qoS19);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        org.meqantt.message.QoS qoS2 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.Message.Type type7 = connectMessage1.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        boolean boolean5 = pubAckMessage4.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getUsername();
        org.meqantt.message.QoS qoS22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        subscribeMessage23.addTopic("", qoS27);
        connectMessage17.setWill("", "\000d\000\001\001d", qoS27, true);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("hi!", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("", qoS27);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
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
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setQos(qoS17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
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
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.meqantt.message.DisconnectMessage disconnectMessage0 = new org.meqantt.message.DisconnectMessage();
        org.meqantt.message.SubAckMessage subAckMessage1 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        subAckMessage1.addQoS(qoS5);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage0.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 0);
        pubRecMessage1.setMessageId((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        byte[] byteArray2 = pubCompMessage1.toBytes();
        boolean boolean3 = pubCompMessage1.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[112, 2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        byte[] byteArray9 = connectMessage7.toBytes();
        org.meqantt.message.QoS qoS10 = connectMessage7.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
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
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        subAckMessage0.addQoS(qoS7);
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
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        boolean boolean5 = connectMessage3.hasUsername();
        java.lang.String str6 = connectMessage3.getWillTopic();
        java.lang.String str7 = connectMessage3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
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
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message message2 = null;
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage(message2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("\000\000", qoS8);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
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
        boolean boolean28 = connectMessage3.hasWill();
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
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 3 + "'", byte27 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getProtocolId();
        org.meqantt.message.QoS qoS16 = connectMessage14.getQos();
        subscribeMessage8.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS16);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
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
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        int int23 = subscribeMessage21.getMessageId();
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        org.meqantt.message.QoS qoS28 = subscribeMessage26.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("", qoS28);
        subscribeMessage21.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS28);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.DisconnectMessage disconnectMessage1 = new org.meqantt.message.DisconnectMessage(header0);
        org.meqantt.message.PubRelMessage pubRelMessage3 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS4 = pubRelMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage3 = new org.meqantt.message.PingReqMessage(header1);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage3.write(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("", qoS7);
        subAckMessage0.addQoS(qoS7);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.write(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
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
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        int int20 = subscribeMessage18.getMessageId();
        org.meqantt.message.SubAckMessage subAckMessage21 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList22 = subAckMessage21.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList23 = subAckMessage21.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage27 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str28 = connectMessage27.getProtocolId();
        org.meqantt.message.QoS qoS29 = connectMessage27.getQos();
        subAckMessage21.addQoS(qoS29);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage18.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(qoSList22);
        org.junit.Assert.assertNull(qoSList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MQIsdp" + "'", str28, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) (byte) 100);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 3);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getUsername();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        connectMessage5.setWill("", "\000d\000\001\001d", qoS15, true);
        java.lang.String str19 = connectMessage5.getPassword();
        boolean boolean20 = connectMessage5.isWillRetained();
        org.meqantt.message.QoS qoS21 = connectMessage5.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        org.meqantt.message.QoS qoS4 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        subscribeMessage5.addTopic("", qoS9);
        subscribeMessage0.addTopic("MQIsdp", qoS9);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type3 = subscribeMessage2.getType();
        org.meqantt.message.QoS qoS6 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        subscribeMessage7.addTopic("", qoS11);
        subscribeMessage2.addTopic("MQIsdp", qoS11);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage4.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage4.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getProtocolId();
        org.meqantt.message.QoS qoS12 = connectMessage10.getQos();
        subAckMessage4.addQoS(qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("hi!", qoS12);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MQIsdp" + "'", str11, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.QoS qoS6 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        subscribeMessage7.addTopic("", qoS11);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type5 = subscribeMessage4.getType();
        org.meqantt.message.QoS qoS8 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        subscribeMessage9.addTopic("", qoS13);
        subscribeMessage4.addTopic("MQIsdp", qoS13);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type5.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        int int10 = pubRelMessage9.getMessageId();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.setMessageId(100);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((-1));
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        java.lang.String str5 = connectMessage3.getPassword();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
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
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
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
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        java.util.List<java.lang.String> strList2 = subscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList3 = subscribeMessage1.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subscribeMessage1.getTopicQoSs();
        org.meqantt.message.Message.Header header5 = null;
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header5);
        boolean boolean7 = connectMessage6.isWillRetained();
        boolean boolean8 = connectMessage6.isWillRetained();
        java.lang.String str9 = connectMessage6.getUsername();
        org.meqantt.message.QoS qoS13 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.QoS qoS18 = subscribeMessage16.getQos();
        subscribeMessage14.addTopic("", qoS18);
        connectMessage6.setWill("hi!", "", qoS18, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage1.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(qoSList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '\001');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        int int4 = connectMessage1.getKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage8.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getProtocolId();
        org.meqantt.message.QoS qoS16 = connectMessage14.getQos();
        subAckMessage8.addQoS(qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("hi!", qoS16);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage6.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pubCompMessage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        int int5 = unsubAckMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Type type3 = pingReqMessage2.getType();
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
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        subAckMessage0.addQoS(qoS4);
        org.meqantt.message.Message.Header header7 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header7);
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        java.util.List<java.lang.String> strList10 = subscribeMessage8.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subscribeMessage8.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean17 = connectMessage16.hasWill();
        java.lang.String str18 = connectMessage16.getWill();
        org.meqantt.message.Message.Header header21 = null;
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage(header21);
        boolean boolean23 = connectMessage22.isWillRetained();
        boolean boolean24 = connectMessage22.isWillRetained();
        java.lang.String str25 = connectMessage22.getUsername();
        org.meqantt.message.QoS qoS29 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList33 = subscribeMessage32.getTopics();
        org.meqantt.message.QoS qoS34 = subscribeMessage32.getQos();
        subscribeMessage30.addTopic("", qoS34);
        connectMessage22.setWill("hi!", "", qoS34, false);
        connectMessage16.setWill("MQIsdp", "hi!", qoS34, false);
        subscribeMessage8.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS34);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(qoSList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        org.meqantt.message.Message.Header header4 = null;
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header4);
        int int6 = connectMessage5.getKeepAlive();
        connectMessage5.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS10 = connectMessage5.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getWillTopic();
        boolean boolean4 = connectMessage1.isCleanSession();
        boolean boolean5 = connectMessage1.isWillRetained();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS6 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage7.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        subAckMessage7.addQoS(qoS14);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
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
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        unsubscribeMessage1.addTopic("");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
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
            connectMessage1.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage4 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PingReqMessage pingReqMessage1 = new org.meqantt.message.PingReqMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage11.setWill("", "\000d\000\001\001d", qoS21, true);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("hi!", qoS21);
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        int int27 = subscribeMessage25.getMessageId();
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("", qoS32);
        subscribeMessage25.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS32);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setQos(qoS32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage3 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.MessageEvent messageEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.messageReceived(channelHandlerContext3, messageEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getProtocolId();
        org.meqantt.message.QoS qoS13 = connectMessage11.getQos();
        subscribeMessage5.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS13);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PingRespMessage pingRespMessage1 = new org.meqantt.message.PingRespMessage(header0);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        java.lang.Class<?> wildcardClass10 = header1.getClass();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage7.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        subAckMessage7.addQoS(qoS14);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage6.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
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
            subAckMessage0.setRetained(false);
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
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS9);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(header0);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean6 = connectMessage5.hasWill();
        java.lang.String str7 = connectMessage5.getWill();
        org.meqantt.message.Message.Header header10 = null;
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header10);
        boolean boolean12 = connectMessage11.isWillRetained();
        boolean boolean13 = connectMessage11.isWillRetained();
        java.lang.String str14 = connectMessage11.getUsername();
        org.meqantt.message.QoS qoS18 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        subscribeMessage19.addTopic("", qoS23);
        connectMessage11.setWill("hi!", "", qoS23, false);
        connectMessage5.setWill("MQIsdp", "hi!", qoS23, false);
        org.meqantt.message.SubAckMessage subAckMessage31 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList32 = subAckMessage31.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList33 = subAckMessage31.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList34 = subAckMessage31.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList37 = subscribeMessage36.getTopics();
        org.meqantt.message.QoS qoS38 = subscribeMessage36.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS38);
        subAckMessage31.addQoS(qoS38);
        connectMessage5.setWill("hi!", "MQIsdp", qoS38, true);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList32);
        org.junit.Assert.assertNull(qoSList33);
        org.junit.Assert.assertNull(qoSList34);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelConnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
        boolean boolean3 = pingRespMessage2.isDup();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage5.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        subAckMessage5.addQoS(qoS12);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelClosed(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleUpstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
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
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '\001');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        byte byte10 = connectMessage1.getProtocolVersion();
        java.lang.String str11 = connectMessage1.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 3 + "'", byte10 == (byte) 3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        byte[] byteArray4 = publishMessage1.getData();
        byte[] byteArray5 = publishMessage1.getData();
        byte[] byteArray6 = publishMessage1.getData();
        // The following exception was thrown during execution in test generation
        try {
            publishMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNull(byteArray6);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.closeRequested(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.connectRequested(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.MessageEvent messageEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.messageReceived(channelHandlerContext5, messageEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Header header4 = null;
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header4);
        int int6 = connectMessage5.getKeepAlive();
        boolean boolean7 = connectMessage5.isCleanSession();
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS12 = pubRelMessage11.getQos();
        connectMessage5.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp", qoS12, true);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage3.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        org.meqantt.message.QoS qoS5 = unsubscribeMessage1.getQos();
        unsubscribeMessage1.addTopic("MQIsdp");
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
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setCredentials("");
        java.lang.String str8 = connectMessage1.getClientId();
        org.meqantt.message.QoS qoS9 = connectMessage1.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setCredentials("", "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: It is not valid to supply a password without supplying a username.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(qoS9);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getUsername();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        connectMessage5.setWill("", "\000d\000\001\001d", qoS15, true);
        java.lang.String str19 = connectMessage5.getPassword();
        boolean boolean20 = connectMessage5.isCleanSession();
        boolean boolean21 = connectMessage5.isWillRetained();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS8);
        org.meqantt.message.QoS qoS11 = subscribeMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage3.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getUsername();
        org.meqantt.message.QoS qoS13 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.QoS qoS18 = subscribeMessage16.getQos();
        subscribeMessage14.addTopic("", qoS18);
        connectMessage8.setWill("", "\000d\000\001\001d", qoS18, true);
        java.lang.String str22 = connectMessage8.getPassword();
        boolean boolean23 = connectMessage8.isWillRetained();
        org.meqantt.message.QoS qoS24 = connectMessage8.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        int int3 = pubAckMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 0);
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage11.setWill("", "\000d\000\001\001d", qoS21, true);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("hi!", qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("", qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.ConnectMessage connectMessage36 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str37 = connectMessage36.getProtocolId();
        org.meqantt.message.QoS qoS38 = connectMessage36.getQos();
        subscribeMessage30.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS38);
        subscribeMessage28.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS38);
        org.meqantt.message.ConnectMessage connectMessage45 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str46 = connectMessage45.getProtocolId();
        org.meqantt.message.QoS qoS47 = connectMessage45.getQos();
        subscribeMessage28.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS47);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MQIsdp" + "'", str37, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "MQIsdp" + "'", str46, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\001\003\003\001", 2);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ????");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }
}

