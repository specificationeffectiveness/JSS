package org.meqantt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("MQIsdp", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 3, (byte) 3, (byte) 1 };
        java.lang.String str5 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray4);
        java.lang.String str6 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 3, 3, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str5, "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str6, "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
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
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
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
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 00110000 0 48?01: 00001000 ? 8?02: 00000000 ? 0?03: 00000000 ? 0?04: 00000000 ? 0?05: 01100100 d 100?06: 00000000 ? 0?07: 00000001 ? 1?08: 00000001 ? 1?09: 01100100 d 100?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        boolean boolean5 = pubAckMessage4.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
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
        boolean boolean18 = connectMessage3.isWillRetained();
        java.lang.String str19 = connectMessage3.getWillTopic();
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
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        java.lang.String str3 = connectMessage1.getWill();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS4 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type7 = subscribeMessage6.getType();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        subscribeMessage6.addTopic("MQIsdp", qoS15);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage5.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type7.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        pubCompMessage2.setMessageId(10);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        java.lang.String str6 = connectMessage3.getWill();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("\000\000", qoS12);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage3.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus4);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage3 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeComplete(channelHandlerContext5, writeCompletionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getUsername();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        connectMessage7.setWill("", "\000d\000\001\001d", qoS17, true);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS17);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        boolean boolean4 = connectMessage2.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        org.meqantt.message.QoS qoS3 = null;
        subscribeMessage1.addTopic("hi!", qoS3);
        org.meqantt.message.PubRelMessage pubRelMessage7 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS8 = pubRelMessage7.getQos();
        subscribeMessage1.addTopic("\000d\000\001\001d", qoS8);
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
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("", qoS26);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage1.setQos(qoS26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus5 = connAckMessage4.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus5);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelOpen(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("hi!");
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
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList5 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList6 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
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
            disconnectMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.QoS qoS10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage9.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.unbindRequested(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.setMessageId(100);
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
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) 1);
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
        byte byte29 = connectMessage5.getProtocolVersion();
        org.meqantt.message.ConnectMessage connectMessage36 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean37 = connectMessage36.hasWill();
        java.lang.String str38 = connectMessage36.getWill();
        org.meqantt.message.Message.Header header41 = null;
        org.meqantt.message.ConnectMessage connectMessage42 = new org.meqantt.message.ConnectMessage(header41);
        boolean boolean43 = connectMessage42.isWillRetained();
        boolean boolean44 = connectMessage42.isWillRetained();
        java.lang.String str45 = connectMessage42.getUsername();
        org.meqantt.message.QoS qoS49 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage("", qoS49);
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList53 = subscribeMessage52.getTopics();
        org.meqantt.message.QoS qoS54 = subscribeMessage52.getQos();
        subscribeMessage50.addTopic("", qoS54);
        connectMessage42.setWill("hi!", "", qoS54, false);
        connectMessage36.setWill("MQIsdp", "hi!", qoS54, false);
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS54);
        connectMessage5.setWill("", "MQIsdp", qoS54, false);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS54);
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
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 3 + "'", byte29 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + qoS54 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS54.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        int int12 = subscribeMessage11.getMessageId();
        subscribeMessage11.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header16 = null;
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage(header16);
        int int18 = connectMessage17.getKeepAlive();
        connectMessage17.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS22 = connectMessage17.getWillQoS();
        subscribeMessage11.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS22);
        subscribeMessage6.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS22);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.QoS qoS4 = null;
        subscribeMessage0.addTopic("", qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        subscribeMessage0.setMessageId((int) 'a');
        java.util.List<org.meqantt.message.QoS> qoSList9 = subscribeMessage0.getTopicQoSs();
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
        org.junit.Assert.assertNotNull(qoSList9);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.MessageEvent messageEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeRequested(channelHandlerContext5, messageEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type9 = subscribeMessage8.getType();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        subscribeMessage8.addTopic("MQIsdp", qoS17);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setQos(qoS17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type9.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
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
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        org.meqantt.message.QoS qoS6 = connectMessage1.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
        org.meqantt.message.QoS qoS7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 0);
        pubRecMessage1.setMessageId((int) (short) 10);
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
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS19);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
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
        org.meqantt.message.QoS qoS27 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
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
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", "\000d\000\001\001d");
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        unsubscribeMessage1.setDup(false);
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Header header5 = null;
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header5);
        int int7 = connectMessage6.getKeepAlive();
        boolean boolean8 = connectMessage6.isCleanSession();
        org.meqantt.message.PubRelMessage pubRelMessage12 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS13 = pubRelMessage12.getQos();
        connectMessage6.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp", qoS13, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS4);
        org.meqantt.message.QoS qoS7 = subscribeMessage6.getQos();
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
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage("", byteArray10);
        java.lang.String str12 = publishMessage11.getDataAsString();
        byte[] byteArray13 = publishMessage11.getData();
        org.meqantt.message.PublishMessage publishMessage14 = new org.meqantt.message.PublishMessage("MQIsdp", byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) publishMessage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000d\000\001\001d" + "'", str12, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 100, 0, 1, 1, 100]");
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        org.meqantt.message.QoS qoS5 = unsubscribeMessage1.getQos();
        java.util.List<java.lang.String> strList6 = unsubscribeMessage1.getTopics();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        byte[] byteArray2 = pubCompMessage1.toBytes();
        int int3 = pubCompMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[112, 2, 0, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        byte[] byteArray5 = connectMessage3.toBytes();
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
        org.meqantt.message.SubAckMessage subAckMessage35 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList36 = subAckMessage35.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList37 = subAckMessage35.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList38 = subAckMessage35.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList41 = subscribeMessage40.getTopics();
        org.meqantt.message.QoS qoS42 = subscribeMessage40.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("", qoS42);
        subAckMessage35.addQoS(qoS42);
        connectMessage9.setWill("hi!", "MQIsdp", qoS42, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList36);
        org.junit.Assert.assertNull(qoSList37);
        org.junit.Assert.assertNull(qoSList38);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + qoS42 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS42.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        unsubscribeMessage1.addTopic("");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("", byteArray7);
        java.lang.String str9 = publishMessage8.getDataAsString();
        byte[] byteArray10 = publishMessage8.getData();
        java.lang.String str11 = org.meqantt.util.FormatUtil.toString(byteArray10);
        java.lang.String str12 = org.meqantt.util.FormatUtil.toString(byteArray10);
        java.lang.String str13 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray10);
        java.lang.String str14 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray10);
        java.lang.String str15 = org.meqantt.util.FormatUtil.toString(byteArray10);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\000\001\001d" + "'", str9, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n" + "'", str13, "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n" + "'", str14, "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleDownstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.Message.Type type7 = header5.getType();
        org.meqantt.message.PubRelMessage pubRelMessage8 = new org.meqantt.message.PubRelMessage(header5);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header5);
        boolean boolean10 = subAckMessage9.isRetained();
        org.meqantt.message.QoS qoS11 = subAckMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type8 = subscribeMessage7.getType();
        org.meqantt.message.QoS qoS11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        subscribeMessage12.addTopic("", qoS16);
        subscribeMessage7.addTopic("MQIsdp", qoS16);
        org.meqantt.message.UnsubAckMessage unsubAckMessage20 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS21 = unsubAckMessage20.getQos();
        subscribeMessage7.addTopic("", qoS21);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type8.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        nettyClient1.connect("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", (int) 'a');
        nettyClient1.publish("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        byte[] byteArray4 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str5 = org.meqantt.util.FormatUtil.toString(byteArray4);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage("hi!", byteArray4);
        publishMessage6.setMessageId((int) '\001');
        java.lang.String str9 = publishMessage6.getDataAsString();
        java.lang.String str10 = publishMessage6.getDataAsString();
        byte[] byteArray11 = publishMessage6.getData();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) publishMessage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000" + "'", str9, "\000\000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000" + "'", str10, "\000\000");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0]");
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = publishMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        subAckMessage6.addQoS(qoS10);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) ' ');
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        int int4 = connectMessage3.getKeepAlive();
        connectMessage3.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS8 = connectMessage3.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS6);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        byte[] byteArray2 = pubCompMessage1.toBytes();
        int int3 = pubCompMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[112, 2, 0, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        int int4 = unsubscribeMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str5 = connectMessage4.getUsername();
        org.meqantt.message.QoS qoS9 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        subscribeMessage10.addTopic("", qoS14);
        connectMessage4.setWill("", "\000d\000\001\001d", qoS14, true);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS14);
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getUsername();
        org.meqantt.message.QoS qoS28 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("", qoS28);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList32 = subscribeMessage31.getTopics();
        org.meqantt.message.QoS qoS33 = subscribeMessage31.getQos();
        subscribeMessage29.addTopic("", qoS33);
        connectMessage23.setWill("", "\000d\000\001\001d", qoS33, true);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS33);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage18.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 3);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", true, 1);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        org.meqantt.message.QoS qoS3 = null;
        subscribeMessage1.addTopic("hi!", qoS3);
        java.util.List<org.meqantt.message.QoS> qoSList5 = subscribeMessage1.getTopicQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage1.getTopicQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qoSList5);
        org.junit.Assert.assertNotNull(qoSList6);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
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
        org.meqantt.message.QoS qoS21 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("", qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList25 = subscribeMessage24.getTopics();
        org.meqantt.message.QoS qoS26 = subscribeMessage24.getQos();
        subscribeMessage22.addTopic("", qoS26);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage18.setQos(qoS26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        subAckMessage0.addQoS(qoS12);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
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
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
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
            pingReqMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
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
        int int11 = connectMessage1.getKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getProtocolId();
        boolean boolean7 = connectMessage5.hasUsername();
        java.lang.String str8 = connectMessage5.getWillTopic();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        int int5 = unsubAckMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        byte[] byteArray4 = publishMessage1.getData();
        byte[] byteArray5 = publishMessage1.getData();
        byte[] byteArray6 = publishMessage1.getData();
        java.lang.String str7 = publishMessage1.getTopic();
        byte[] byteArray8 = publishMessage1.getData();
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
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
            pingReqMessage6.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
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
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream18);
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
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelInterestChanged(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        subAckMessage0.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type7 = subscribeMessage6.getType();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        subscribeMessage6.addTopic("MQIsdp", qoS15);
        org.meqantt.message.UnsubAckMessage unsubAckMessage19 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS20 = unsubAckMessage19.getQos();
        subscribeMessage6.addTopic("", qoS20);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type7.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        org.meqantt.message.QoS qoS3 = null;
        subscribeMessage1.addTopic("hi!", qoS3);
        java.util.List<org.meqantt.message.QoS> qoSList5 = subscribeMessage1.getTopicQoSs();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS6 = subscribeMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qoSList5);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage10.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage10.getGrantedQoSs();
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
        subAckMessage10.addQoS(qoS30);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage9.setQos(qoS30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\001\003\003\001", (int) '\001');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ????");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.util.List<java.lang.String> strList6 = unsubscribeMessage5.getTopics();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.QoS qoS5 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        int int7 = subscribeMessage6.getMessageId();
        subscribeMessage6.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header11);
        int int13 = connectMessage12.getKeepAlive();
        connectMessage12.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS17 = connectMessage12.getWillQoS();
        subscribeMessage6.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS17);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setQos(qoS17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.UnsubAckMessage unsubAckMessage1 = new org.meqantt.message.UnsubAckMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
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
        org.meqantt.message.SubAckMessage subAckMessage52 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList53 = subAckMessage52.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList54 = subAckMessage52.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage58 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str59 = connectMessage58.getProtocolId();
        org.meqantt.message.QoS qoS60 = connectMessage58.getQos();
        subAckMessage52.addQoS(qoS60);
        subAckMessage0.addQoS(qoS60);
        org.meqantt.message.Message.Header header63 = null;
        org.meqantt.message.ConnectMessage connectMessage64 = new org.meqantt.message.ConnectMessage(header63);
        boolean boolean65 = connectMessage64.isWillRetained();
        boolean boolean66 = connectMessage64.isWillRetained();
        java.lang.String str67 = connectMessage64.getUsername();
        org.meqantt.message.QoS qoS71 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage72 = new org.meqantt.message.SubscribeMessage("", qoS71);
        org.meqantt.message.SubscribeMessage subscribeMessage74 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList75 = subscribeMessage74.getTopics();
        org.meqantt.message.QoS qoS76 = subscribeMessage74.getQos();
        subscribeMessage72.addTopic("", qoS76);
        connectMessage64.setWill("hi!", "", qoS76, false);
        boolean boolean80 = connectMessage64.hasUsername();
        org.meqantt.message.QoS qoS81 = connectMessage64.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS81);
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
        org.junit.Assert.assertNull(qoSList53);
        org.junit.Assert.assertNull(qoSList54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "MQIsdp" + "'", str59, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS60 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS60.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertTrue("'" + qoS76 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS76.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + qoS81 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS81.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
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
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isWillRetained();
        int int4 = connectMessage1.getKeepAlive();
        byte byte5 = connectMessage1.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
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
        connectMessage3.setCredentials("\000d\000\001\001d");
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
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelOpen(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList5 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList6 = unsubscribeMessage1.getTopics();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getUsername();
        org.meqantt.message.QoS qoS15 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        subscribeMessage16.addTopic("", qoS20);
        connectMessage10.setWill("", "\000d\000\001\001d", qoS20, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        org.meqantt.message.QoS qoS6 = connectMessage1.getWillQoS();
        connectMessage1.setWill("\000d\000\001\001d", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage10.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage10.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage10.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("", qoS17);
        subAckMessage10.addQoS(qoS17);
        subAckMessage8.addQoS(qoS17);
        java.util.List<org.meqantt.message.QoS> qoSList21 = subAckMessage8.getGrantedQoSs();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList21);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "");
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
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
        boolean boolean38 = connectMessage14.isCleanSession();
        org.meqantt.message.UnsubAckMessage unsubAckMessage41 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS42 = unsubAckMessage41.getQos();
        connectMessage14.setWill("\000\003hi!", "hi!", qoS42, false);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage10.setQos(qoS42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + qoS42 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS42.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.Message.Type type4 = connectMessage1.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
        java.util.List<java.lang.String> strList7 = unsubscribeMessage1.getTopics();
        org.meqantt.message.QoS qoS8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        java.lang.String str4 = connectMessage1.getProtocolId();
        connectMessage1.setCredentials("hi!", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
        java.util.List<java.lang.String> strList7 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.PubAckMessage pubAckMessage6 = new org.meqantt.message.PubAckMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pubAckMessage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str14 = connectMessage13.getProtocolId();
        org.meqantt.message.QoS qoS15 = connectMessage13.getQos();
        subAckMessage7.addQoS(qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("hi!", qoS15);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MQIsdp" + "'", str14, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS4 = unsubAckMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage2.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        boolean boolean10 = subscribeMessage9.isDup();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type14 = header13.getType();
        org.meqantt.message.Message.Type type15 = header13.getType();
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage(header13);
        java.util.List<org.meqantt.message.QoS> qoSList17 = subAckMessage16.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getUsername();
        org.meqantt.message.QoS qoS27 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        subscribeMessage28.addTopic("", qoS32);
        connectMessage22.setWill("", "\000d\000\001\001d", qoS32, true);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS32);
        subAckMessage16.addQoS(qoS32);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage9.setQos(qoS32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNull(qoSList17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.QoS qoS10 = null;
        subscribeMessage6.addTopic("", qoS10);
        java.util.List<org.meqantt.message.QoS> qoSList12 = subscribeMessage6.getTopicQoSs();
        subscribeMessage6.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList15 = subscribeMessage6.getTopicQoSs();
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
        subscribeMessage6.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS33);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList12);
        org.junit.Assert.assertNotNull(qoSList15);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage9.setQos(qoS61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
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
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        unsubscribeMessage1.setDup(false);
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getClientId();
        boolean boolean5 = connectMessage3.isDup();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PingReqMessage pingReqMessage1 = new org.meqantt.message.PingReqMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage8.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getProtocolId();
        org.meqantt.message.QoS qoS16 = connectMessage14.getQos();
        subAckMessage8.addQoS(qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        subAckMessage8.addQoS(qoS20);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '#');
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage2.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getProtocolId();
        org.meqantt.message.QoS qoS10 = connectMessage8.getQos();
        subAckMessage2.addQoS(qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        subAckMessage2.addQoS(qoS14);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.Message.Type type7 = header5.getType();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header5);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage(header5);
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS14 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        int int16 = subscribeMessage15.getMessageId();
        subscribeMessage15.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header20 = null;
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage(header20);
        int int22 = connectMessage21.getKeepAlive();
        connectMessage21.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS26 = connectMessage21.getWillQoS();
        subscribeMessage15.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS26);
        subscribeMessage10.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS26);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setQos(qoS26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        boolean boolean2 = pingReqMessage0.isRetained();
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
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS22);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.QoS qoS1 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.QoS qoS8 = null;
        subscribeMessage4.addTopic("", qoS8);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subscribeMessage4.getTopicQoSs();
        subscribeMessage4.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList13 = subscribeMessage4.getTopicQoSs();
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
        subscribeMessage4.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS31);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertNotNull(qoSList13);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        java.lang.String str4 = connectMessage2.getWillTopic();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage6 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS7 = unsubscribeMessage6.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        boolean boolean6 = subAckMessage5.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
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
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.hasWill();
        connectMessage1.setCredentials("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
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
            pingReqMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) ' ');
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage2.getGrantedQoSs();
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS7 = pubRelMessage6.getQos();
        subAckMessage2.addQoS(qoS7);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str5 = connectMessage4.getUsername();
        org.meqantt.message.QoS qoS9 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        subscribeMessage10.addTopic("", qoS14);
        connectMessage4.setWill("", "\000d\000\001\001d", qoS14, true);
        boolean boolean18 = connectMessage4.isCleanSession();
        java.lang.String str19 = connectMessage4.getClientId();
        java.lang.String str20 = connectMessage4.getPassword();
        java.lang.String str21 = connectMessage4.getWill();
        byte[] byteArray22 = connectMessage4.toBytes();
        org.meqantt.message.PublishMessage publishMessage23 = new org.meqantt.message.PublishMessage("\000\003hi!", byteArray22);
        java.lang.String str24 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray22);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000d\000\001\001d" + "'", str21, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n" + "'", str24, "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
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
        org.meqantt.message.QoS qoS21 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("", qoS21);
        int int23 = subscribeMessage22.getMessageId();
        subscribeMessage22.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header27 = null;
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage(header27);
        int int29 = connectMessage28.getKeepAlive();
        connectMessage28.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS33 = connectMessage28.getWillQoS();
        subscribeMessage22.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS33);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage18.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "MQIsdp" + "'", str42, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str5 = connectMessage4.getUsername();
        org.meqantt.message.QoS qoS9 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        subscribeMessage10.addTopic("", qoS14);
        connectMessage4.setWill("", "\000d\000\001\001d", qoS14, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage4 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage3 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.disconnectRequested(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage8.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getProtocolId();
        org.meqantt.message.QoS qoS16 = connectMessage14.getQos();
        subAckMessage8.addQoS(qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        subAckMessage8.addQoS(qoS20);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.connectRequested(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage4.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getUsername();
        org.meqantt.message.QoS qoS15 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        subscribeMessage16.addTopic("", qoS20);
        connectMessage10.setWill("", "\000d\000\001\001d", qoS20, true);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS20);
        subAckMessage4.addQoS(qoS20);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.Message.Header header9 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type10 = header9.getType();
        org.meqantt.message.Message.Type type11 = header9.getType();
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage(header9);
        org.meqantt.message.PingReqMessage pingReqMessage13 = new org.meqantt.message.PingReqMessage(header9);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage(header9);
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage(header9);
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
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS40);
        connectMessage15.setWill("hi!", "\000\000", qoS40, true);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setQos(qoS40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD));
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        byte[] byteArray2 = pubCompMessage1.toBytes();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[112, 2, 0, 10]");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("");
        connectMessage1.setCredentials("hi!", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MQIsdp" + "'", str23, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
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
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList32 = subscribeMessage31.getTopics();
        org.meqantt.message.ConnectMessage connectMessage37 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str38 = connectMessage37.getProtocolId();
        org.meqantt.message.QoS qoS39 = connectMessage37.getQos();
        subscribeMessage31.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS39);
        subscribeMessage29.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS39);
        org.meqantt.message.ConnectMessage connectMessage46 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str47 = connectMessage46.getProtocolId();
        org.meqantt.message.QoS qoS48 = connectMessage46.getQos();
        subscribeMessage29.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS48);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "MQIsdp" + "'", str38, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MQIsdp" + "'", str47, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeComplete(channelHandlerContext7, writeCompletionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.QoS qoS8 = null;
        subscribeMessage4.addTopic("", qoS8);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subscribeMessage4.getTopicQoSs();
        subscribeMessage4.setDup(false);
        java.util.List<java.lang.String> strList13 = subscribeMessage4.getTopics();
        org.meqantt.message.Message.Header header16 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type17 = header16.getType();
        org.meqantt.message.Message.Type type18 = header16.getType();
        org.meqantt.message.SubAckMessage subAckMessage19 = new org.meqantt.message.SubAckMessage(header16);
        org.meqantt.message.PingReqMessage pingReqMessage20 = new org.meqantt.message.PingReqMessage(header16);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage(header16);
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage(header16);
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
        connectMessage22.setWill("hi!", "\000\000", qoS47, true);
        subscribeMessage4.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS47);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(type17);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage12.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList14 = subAckMessage12.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str19 = connectMessage18.getProtocolId();
        org.meqantt.message.QoS qoS20 = connectMessage18.getQos();
        subAckMessage12.addQoS(qoS20);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("hi!", qoS20);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage9.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNull(qoSList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        nettyClient1.connect("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", (int) (short) 10);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleDownstream(channelHandlerContext7, channelEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000\003hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage6.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        subAckMessage6.addQoS(qoS13);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getClientId();
        connectMessage1.setCredentials("\000d\000\001\001d");
        boolean boolean12 = connectMessage1.hasPassword();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.unbindRequested(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
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
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.QoS qoS3 = null;
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setQos(qoS3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("MQIsdp");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.publish("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
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
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setQos(qoS55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
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
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
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
            pubCompMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) (short) 0);
        pubRelMessage1.setMessageId(100);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pingReqMessage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getProtocolId();
        org.meqantt.message.QoS qoS12 = connectMessage10.getQos();
        subscribeMessage4.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS12);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MQIsdp" + "'", str11, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelUnbound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Type type3 = pingReqMessage2.getType();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 3, (byte) 3, (byte) 1 };
        java.lang.String str6 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray5);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", byteArray5);
        byte[] byteArray8 = publishMessage7.getData();
        java.lang.String str9 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray8);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 3, 3, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str6, "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 3, 3, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str9, "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        boolean boolean4 = connectMessage3.isWillRetained();
        boolean boolean5 = connectMessage3.isWillRetained();
        java.lang.String str6 = connectMessage3.getUsername();
        boolean boolean7 = connectMessage3.isCleanSession();
        connectMessage3.setCredentials("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.closeRequested(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pubCompMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
        java.util.List<java.lang.String> strList7 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.setDup(false);
        unsubscribeMessage1.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
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
            disconnectMessage6.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        byte[] byteArray1 = org.meqantt.util.FormatUtil.toMQttString("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 91, 48, 48, 58, 32, 49, 48, 48, 49, 48, 48, 48, 48, 32, -62, -112, 32, 49, 52, 52, 10, 48, 49, 58, 32, 48, 48, 48, 48, 48, 48, 49, 49, 32, 3, 32, 51, 10, 48, 50, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10, 48, 51, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10, 48, 52, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10]");
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        int int5 = connectMessage3.getKeepAlive();
        connectMessage3.setCredentials("MQIsdp", "MQIsdp");
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
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS9);
        org.meqantt.message.QoS qoS12 = subscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.QoS qoS18 = subscribeMessage16.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS18);
        org.meqantt.message.QoS qoS21 = subscribeMessage20.getQos();
        subscribeMessage11.addTopic("", qoS21);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage9.setCredentials("", "\001\003\003\001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: It is not valid to supply a password without supplying a username.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("", byteArray7);
        java.lang.String str9 = publishMessage8.getDataAsString();
        byte[] byteArray10 = publishMessage8.getData();
        byte[] byteArray11 = publishMessage8.getData();
        java.lang.String str12 = publishMessage8.getTopic();
        byte[] byteArray13 = publishMessage8.getData();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\000\001\001d" + "'", str9, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 100, 0, 1, 1, 100]");
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getUsername();
        org.meqantt.message.QoS qoS11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        subscribeMessage12.addTopic("", qoS16);
        connectMessage6.setWill("", "\000d\000\001\001d", qoS16, true);
        java.lang.String str20 = connectMessage6.getPassword();
        boolean boolean21 = connectMessage6.isWillRetained();
        org.meqantt.message.QoS qoS22 = connectMessage6.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.QoS qoS5 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.hasUsername();
        boolean boolean6 = connectMessage1.hasUsername();
        connectMessage1.setWill("MQIsdp", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        java.lang.Class<?> wildcardClass10 = connectMessage1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelBound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
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
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        org.meqantt.message.Message.Header header3 = null;
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header3);
        boolean boolean5 = connectMessage4.isWillRetained();
        boolean boolean6 = connectMessage4.isWillRetained();
        java.lang.String str7 = connectMessage4.getUsername();
        org.meqantt.message.QoS qoS11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        subscribeMessage12.addTopic("", qoS16);
        connectMessage4.setWill("hi!", "", qoS16, false);
        boolean boolean20 = connectMessage4.hasUsername();
        org.meqantt.message.QoS qoS21 = connectMessage4.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS21);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage5.write(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage9 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS10 = unsubAckMessage9.getQos();
        subAckMessage8.addQoS(qoS10);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        int int3 = pubAckMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        int int6 = unsubscribeMessage5.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
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
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS1 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setQos(qoS1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
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
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS18);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS18);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage26.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getUsername();
        connectMessage0.setCredentials("hi!");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.Message.Type type8 = connectMessage1.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header2);
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        java.util.List<java.lang.String> strList5 = subscribeMessage3.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage3.getTopicQoSs();
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
        subscribeMessage3.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS29);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(qoSList6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        int int5 = connectMessage3.getKeepAlive();
        java.lang.String str6 = connectMessage3.getWillTopic();
        boolean boolean7 = connectMessage3.hasPassword();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getUsername();
        org.meqantt.message.QoS qoS17 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        subscribeMessage18.addTopic("", qoS22);
        connectMessage12.setWill("", "\000d\000\001\001d", qoS22, true);
        boolean boolean26 = connectMessage12.isCleanSession();
        java.lang.String str27 = connectMessage12.getClientId();
        java.lang.String str28 = connectMessage12.getPassword();
        java.lang.String str29 = connectMessage12.getWill();
        byte[] byteArray30 = connectMessage12.toBytes();
        org.meqantt.message.PublishMessage publishMessage31 = new org.meqantt.message.PublishMessage("\000\003hi!", byteArray30);
        org.meqantt.message.QoS qoS32 = publishMessage31.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000d\000\001\001d" + "'", str29, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        connectMessage1.setWill("\000\000", "\000\000");
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.Message.Type type7 = header5.getType();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header5);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage(header5);
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header5);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage(header5);
        boolean boolean14 = subscribeMessage13.isDup();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        int int12 = subscribeMessage11.getMessageId();
        subscribeMessage11.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header16 = null;
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage(header16);
        int int18 = connectMessage17.getKeepAlive();
        connectMessage17.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS22 = connectMessage17.getWillQoS();
        subscribeMessage11.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS22);
        subscribeMessage6.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS22);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelDisconnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS5 = pubRelMessage4.getQos();
        subAckMessage0.addQoS(qoS5);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getProtocolId();
        org.meqantt.message.QoS qoS12 = connectMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MQIsdp" + "'", str11, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
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
            pubCompMessage10.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        int int4 = unsubscribeMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage6.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getProtocolId();
        org.meqantt.message.QoS qoS14 = connectMessage12.getQos();
        subAckMessage6.addQoS(qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("hi!", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) (byte) 3);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.bindRequested(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        int int6 = unsubscribeMessage5.getMessageId();
        unsubscribeMessage5.addTopic("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS8);
        org.meqantt.message.QoS qoS11 = subscribeMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("\000\000", qoS5);
        org.meqantt.message.Message.Header header9 = null;
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header9);
        boolean boolean11 = connectMessage10.isWillRetained();
        boolean boolean12 = connectMessage10.isWillRetained();
        java.lang.String str13 = connectMessage10.getUsername();
        org.meqantt.message.QoS qoS17 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        subscribeMessage18.addTopic("", qoS22);
        connectMessage10.setWill("hi!", "", qoS22, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage8.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList3 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
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
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS21);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
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
        org.meqantt.message.SubAckMessage subAckMessage19 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList20 = subAckMessage19.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList21 = subAckMessage19.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str26 = connectMessage25.getProtocolId();
        org.meqantt.message.QoS qoS27 = connectMessage25.getQos();
        subAckMessage19.addQoS(qoS27);
        org.meqantt.message.ConnectMessage connectMessage32 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean33 = connectMessage32.hasWill();
        java.lang.String str34 = connectMessage32.getWill();
        org.meqantt.message.Message.Header header37 = null;
        org.meqantt.message.ConnectMessage connectMessage38 = new org.meqantt.message.ConnectMessage(header37);
        boolean boolean39 = connectMessage38.isWillRetained();
        boolean boolean40 = connectMessage38.isWillRetained();
        java.lang.String str41 = connectMessage38.getUsername();
        org.meqantt.message.QoS qoS45 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage("", qoS45);
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList49 = subscribeMessage48.getTopics();
        org.meqantt.message.QoS qoS50 = subscribeMessage48.getQos();
        subscribeMessage46.addTopic("", qoS50);
        connectMessage38.setWill("hi!", "", qoS50, false);
        connectMessage32.setWill("MQIsdp", "hi!", qoS50, false);
        org.meqantt.message.SubAckMessage subAckMessage58 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList59 = subAckMessage58.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList60 = subAckMessage58.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList61 = subAckMessage58.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage63 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList64 = subscribeMessage63.getTopics();
        org.meqantt.message.QoS qoS65 = subscribeMessage63.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage66 = new org.meqantt.message.SubscribeMessage("", qoS65);
        subAckMessage58.addQoS(qoS65);
        connectMessage32.setWill("hi!", "MQIsdp", qoS65, true);
        subAckMessage19.addQoS(qoS65);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 3 + "'", byte18 == (byte) 3);
        org.junit.Assert.assertNull(qoSList20);
        org.junit.Assert.assertNull(qoSList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MQIsdp" + "'", str26, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + qoS50 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS50.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList59);
        org.junit.Assert.assertNull(qoSList60);
        org.junit.Assert.assertNull(qoSList61);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + qoS65 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS65.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        org.meqantt.message.QoS qoS5 = connectMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
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
            disconnectMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("", byteArray7);
        java.lang.String str9 = publishMessage8.getDataAsString();
        byte[] byteArray10 = publishMessage8.getData();
        byte[] byteArray11 = publishMessage8.toBytes();
        java.lang.String str12 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray11);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\000\001\001d" + "'", str9, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 8, 0, 0, 0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n" + "'", str12, "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        int int1 = subAckMessage0.getMessageId();
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
        boolean boolean19 = connectMessage3.hasUsername();
        org.meqantt.message.QoS qoS20 = connectMessage3.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
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
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        int int1 = subAckMessage0.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        subAckMessage0.setMessageId((int) (byte) 10);
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
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeRequested(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        int int6 = publishMessage5.getMessageId();
        publishMessage5.setMessageId((int) (short) 100);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.QoS qoS4 = null;
        subscribeMessage0.addTopic("", qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        subscribeMessage0.setDup(false);
        java.util.List<java.lang.String> strList9 = subscribeMessage0.getTopics();
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
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.DisconnectMessage disconnectMessage1 = new org.meqantt.message.DisconnectMessage(header0);
        java.lang.Class<?> wildcardClass2 = disconnectMessage1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getWillTopic();
        boolean boolean4 = connectMessage1.isCleanSession();
        java.lang.Class<?> wildcardClass5 = connectMessage1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
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
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Type type3 = pingReqMessage2.getType();
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
            pingReqMessage2.setQos(qoS55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
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
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("", byteArray7);
        java.lang.String str9 = publishMessage8.getDataAsString();
        java.lang.String str10 = publishMessage8.getTopic();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\000\001\001d" + "'", str9, "\000d\000\001\001d");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage7.getGrantedQoSs();
        subAckMessage7.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getProtocolId();
        org.meqantt.message.QoS qoS21 = connectMessage19.getQos();
        subscribeMessage13.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS21);
        subAckMessage7.addQoS(qoS21);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage6.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        unsubscribeMessage1.setDup(false);
        java.util.List<java.lang.String> strList4 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList5 = unsubscribeMessage1.getTopics();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage6.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getProtocolId();
        org.meqantt.message.QoS qoS19 = connectMessage17.getQos();
        subscribeMessage10.addTopic("", qoS19);
        subAckMessage6.addQoS(qoS19);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MQIsdp" + "'", str18, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus2);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus2);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\000");
        unsubscribeMessage1.addTopic("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\000d\000\001\001d", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        org.meqantt.message.Message.Type type3 = publishMessage2.getType();
        publishMessage2.setMessageId(1);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBLISH + "'", type3.equals(org.meqantt.message.Message.Type.PUBLISH));
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
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
            pingReqMessage0.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        subAckMessage0.addQoS(qoS12);
        org.meqantt.message.Message.Header header14 = null;
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage(header14);
        int int16 = connectMessage15.getKeepAlive();
        boolean boolean17 = connectMessage15.isCleanSession();
        org.meqantt.message.PubRelMessage pubRelMessage21 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS22 = pubRelMessage21.getQos();
        connectMessage15.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp", qoS22, true);
        subAckMessage0.addQoS(qoS22);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelClosed(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        int int1 = subAckMessage0.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
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
        org.meqantt.message.PublishMessage publishMessage24 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        org.meqantt.message.QoS qoS25 = publishMessage24.getQos();
        subscribeMessage9.addTopic("", qoS25);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.write(outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS2 = unsubscribeMessage1.getQos();
        org.meqantt.message.Message.Header header3 = null;
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header3);
        int int5 = connectMessage4.getKeepAlive();
        boolean boolean6 = connectMessage4.isCleanSession();
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS11 = pubRelMessage10.getQos();
        connectMessage4.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp", qoS11, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
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
        boolean boolean18 = connectMessage2.hasUsername();
        org.meqantt.message.QoS qoS19 = connectMessage2.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS19);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage20.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus2);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus2);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.disconnectRequested(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        connectMessage1.setCredentials("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        connectMessage1.setCredentials("MQIsdp");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type4 = header3.getType();
        org.meqantt.message.Message.Type type5 = header3.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getUsername();
        org.meqantt.message.QoS qoS17 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        subscribeMessage18.addTopic("", qoS22);
        connectMessage12.setWill("", "\000d\000\001\001d", qoS22, true);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS22);
        subAckMessage6.addQoS(qoS22);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        int int3 = subscribeMessage2.getMessageId();
        subscribeMessage2.setMessageId((int) (short) 10);
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
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean6 = connectMessage5.hasWill();
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
            connectMessage5.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        subscribeMessage0.setMessageId((int) (short) 0);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage7.getGrantedQoSs();
        subAckMessage7.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getProtocolId();
        org.meqantt.message.QoS qoS21 = connectMessage19.getQos();
        subscribeMessage13.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS21);
        subAckMessage7.addQoS(qoS21);
        subscribeMessage0.addTopic("\000\003hi!", qoS21);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.meqantt.MqttListener mqttListener11 = null;
        nettyClient1.setListener(mqttListener11);
        nettyClient1.unsubscribe("\000\003hi!");
        nettyClient1.connect("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", (int) '\001');
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type4.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
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
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS23);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("\000\000", qoS5);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage10.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isWillRetained();
        int int4 = connectMessage1.getKeepAlive();
        java.lang.String str5 = connectMessage1.getWill();
        java.lang.String str6 = connectMessage1.getUsername();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        java.lang.String str4 = connectMessage3.getPassword();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean9 = connectMessage8.hasWill();
        java.lang.String str10 = connectMessage8.getWill();
        org.meqantt.message.Message.Header header13 = null;
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header13);
        boolean boolean15 = connectMessage14.isWillRetained();
        boolean boolean16 = connectMessage14.isWillRetained();
        java.lang.String str17 = connectMessage14.getUsername();
        org.meqantt.message.QoS qoS21 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("", qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList25 = subscribeMessage24.getTopics();
        org.meqantt.message.QoS qoS26 = subscribeMessage24.getQos();
        subscribeMessage22.addTopic("", qoS26);
        connectMessage14.setWill("hi!", "", qoS26, false);
        connectMessage8.setWill("MQIsdp", "hi!", qoS26, false);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
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
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        java.lang.String str6 = connectMessage3.getWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        int int3 = connectMessage2.getKeepAlive();
        java.lang.String str4 = connectMessage2.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header3);
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header3);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pubRecMessage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        org.meqantt.message.QoS qoS7 = null;
        subscribeMessage3.addTopic("", qoS7);
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
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS27);
        subscribeMessage3.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS27);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setQos(qoS27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str17 = connectMessage16.getProtocolId();
        org.meqantt.message.QoS qoS18 = connectMessage16.getQos();
        subscribeMessage9.addTopic("", qoS18);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MQIsdp" + "'", str17, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        byte[] byteArray1 = org.meqantt.util.FormatUtil.toMQttString("hi!");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 3, 104, 105, 33]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage7 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.isCleanSession();
        boolean boolean7 = connectMessage1.isCleanSession();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        java.lang.String str2 = publishMessage1.getTopic();
        int int3 = publishMessage1.getMessageId();
        byte[] byteArray4 = publishMessage1.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = publishMessage1.getDataAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        int int4 = connectMessage1.getKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleUpstream(channelHandlerContext7, channelEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
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
            mqttMessageHandler0.unbindRequested(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.setMessageId(100);
        unsubscribeMessage1.addTopic("MQIsdp");
        boolean boolean9 = unsubscribeMessage1.isDup();
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage10.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage10.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage10.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str22 = connectMessage21.getProtocolId();
        org.meqantt.message.QoS qoS23 = connectMessage21.getQos();
        subscribeMessage14.addTopic("", qoS23);
        subAckMessage10.addQoS(qoS23);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
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
            subAckMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.QoS qoS9 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        subscribeMessage10.addTopic("", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage8.getGrantedQoSs();
        org.meqantt.message.PubRelMessage pubRelMessage12 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS13 = pubRelMessage12.getQos();
        subAckMessage8.addQoS(qoS13);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getUsername();
        connectMessage0.setCredentials("hi!");
        connectMessage0.setWill("hi!", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        java.lang.String str7 = connectMessage0.getWillTopic();
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
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        byte[] byteArray2 = pubCompMessage1.toBytes();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[112, 2, 0, 10]");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS10 = pubRelMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
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
        org.meqantt.message.SubAckMessage subAckMessage46 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList47 = subAckMessage46.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList48 = subAckMessage46.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage52 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str53 = connectMessage52.getProtocolId();
        org.meqantt.message.QoS qoS54 = connectMessage52.getQos();
        subAckMessage46.addQoS(qoS54);
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList57 = subscribeMessage56.getTopics();
        org.meqantt.message.QoS qoS58 = subscribeMessage56.getQos();
        subAckMessage46.addQoS(qoS58);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage1.setQos(qoS58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(qoSList47);
        org.junit.Assert.assertNull(qoSList48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MQIsdp" + "'", str53, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS54 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS54.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + qoS58 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS58.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 100);
        pubAckMessage1.setMessageId(2);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage4.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage4.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getProtocolId();
        org.meqantt.message.QoS qoS12 = connectMessage10.getQos();
        subAckMessage4.addQoS(qoS12);
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
        org.meqantt.message.SubAckMessage subAckMessage43 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList44 = subAckMessage43.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList45 = subAckMessage43.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList46 = subAckMessage43.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList49 = subscribeMessage48.getTopics();
        org.meqantt.message.QoS qoS50 = subscribeMessage48.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("", qoS50);
        subAckMessage43.addQoS(qoS50);
        connectMessage17.setWill("hi!", "MQIsdp", qoS50, true);
        subAckMessage4.addQoS(qoS50);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MQIsdp" + "'", str11, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList44);
        org.junit.Assert.assertNull(qoSList45);
        org.junit.Assert.assertNull(qoSList46);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + qoS50 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS50.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Type type5 = pubAckMessage4.getType();
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        int int8 = connectMessage7.getKeepAlive();
        java.lang.String str9 = connectMessage7.getPassword();
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header13);
        connectMessage14.setWill("\000\000", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        org.meqantt.message.ConnectMessage connectMessage27 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str28 = connectMessage27.getProtocolId();
        org.meqantt.message.QoS qoS29 = connectMessage27.getQos();
        subscribeMessage20.addTopic("", qoS29);
        connectMessage14.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS29, true);
        connectMessage7.setWill("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS29, true);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MQIsdp" + "'", str28, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.setDup(false);
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
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList2 = subscribeMessage1.getTopics();
        org.meqantt.message.QoS qoS3 = subscribeMessage1.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage("", qoS3);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getUsername();
        int int10 = connectMessage8.getKeepAlive();
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
        connectMessage8.setWill("\000\000", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS34, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage4.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + qoS3 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS3.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type8 = subscribeMessage7.getType();
        org.meqantt.message.QoS qoS11 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        subscribeMessage12.addTopic("", qoS16);
        subscribeMessage7.addTopic("MQIsdp", qoS16);
        org.meqantt.message.UnsubAckMessage unsubAckMessage20 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS21 = unsubAckMessage20.getQos();
        subscribeMessage7.addTopic("", qoS21);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage6.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type8.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type7 = subscribeMessage6.getType();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        subscribeMessage6.addTopic("MQIsdp", qoS15);
        org.meqantt.message.UnsubAckMessage unsubAckMessage19 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS20 = unsubAckMessage19.getQos();
        subscribeMessage6.addTopic("", qoS20);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type7.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelUnbound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS8);
        org.meqantt.message.QoS qoS11 = subscribeMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        org.meqantt.message.QoS qoS3 = null;
        subscribeMessage1.addTopic("hi!", qoS3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = subscribeMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
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
        org.meqantt.message.SubAckMessage subAckMessage52 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList53 = subAckMessage52.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList54 = subAckMessage52.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage58 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str59 = connectMessage58.getProtocolId();
        org.meqantt.message.QoS qoS60 = connectMessage58.getQos();
        subAckMessage52.addQoS(qoS60);
        subAckMessage0.addQoS(qoS60);
        org.meqantt.message.PublishMessage publishMessage65 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        org.meqantt.message.QoS qoS66 = publishMessage65.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS66);
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
        org.junit.Assert.assertNull(qoSList53);
        org.junit.Assert.assertNull(qoSList54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "MQIsdp" + "'", str59, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS60 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS60.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS66 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS66.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getProtocolId();
        org.meqantt.message.QoS qoS7 = connectMessage5.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
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
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleDownstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        byte[] byteArray10 = subAckMessage0.toBytes();
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
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-112, 3, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList17);
        org.junit.Assert.assertNotNull(qoSList20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage6 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS7 = unsubscribeMessage6.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        int int3 = connectMessage2.getKeepAlive();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        byte[] byteArray9 = connectMessage7.toBytes();
        org.meqantt.message.QoS qoS10 = connectMessage7.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
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
            connAckMessage7.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage5.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage5.getGrantedQoSs();
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS10 = pubRelMessage9.getQos();
        subAckMessage5.addQoS(qoS10);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
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
            mqttMessageHandler0.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Header header9 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage(header9);
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        java.util.List<java.lang.String> strList12 = subscribeMessage10.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subscribeMessage10.getTopicQoSs();
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
        subscribeMessage10.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS36);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage7.setQos(qoS36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(qoSList13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\001\003\003\001", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ????");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
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
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage24.write(outputStream38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header8);
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        java.util.List<java.lang.String> strList11 = subscribeMessage9.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subscribeMessage9.getTopicQoSs();
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
        subscribeMessage9.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS35);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage6.setQos(qoS35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(qoSList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\000");
        unsubscribeMessage1.addTopic("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
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
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage11.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean11 = connectMessage10.hasWill();
        java.lang.String str12 = connectMessage10.getWill();
        org.meqantt.message.Message.Header header15 = null;
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage(header15);
        boolean boolean17 = connectMessage16.isWillRetained();
        boolean boolean18 = connectMessage16.isWillRetained();
        java.lang.String str19 = connectMessage16.getUsername();
        org.meqantt.message.QoS qoS23 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        org.meqantt.message.QoS qoS28 = subscribeMessage26.getQos();
        subscribeMessage24.addTopic("", qoS28);
        connectMessage16.setWill("hi!", "", qoS28, false);
        connectMessage10.setWill("MQIsdp", "hi!", qoS28, false);
        boolean boolean34 = connectMessage10.isCleanSession();
        boolean boolean35 = connectMessage10.hasPassword();
        connectMessage10.setWill("hi!", "\000\000");
        org.meqantt.message.QoS qoS39 = connectMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage6.setQos(qoS39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.messageReceived(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("hi!");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\001\003\003\001", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ????");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.meqantt.message.UnsubAckMessage unsubAckMessage0 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS1 = unsubAckMessage0.getQos();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS1 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS1.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        boolean boolean2 = connAckMessage1.isRetained();
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
            connAckMessage1.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type4.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MQIsdp" + "'", str23, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
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
        org.meqantt.message.Message.Header header18 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type19 = header18.getType();
        org.meqantt.message.Message.Type type20 = header18.getType();
        org.meqantt.message.SubAckMessage subAckMessage21 = new org.meqantt.message.SubAckMessage(header18);
        org.meqantt.message.PingReqMessage pingReqMessage22 = new org.meqantt.message.PingReqMessage(header18);
        org.meqantt.message.PingReqMessage pingReqMessage23 = new org.meqantt.message.PingReqMessage(header18);
        org.meqantt.message.DisconnectMessage disconnectMessage24 = new org.meqantt.message.DisconnectMessage(header18);
        org.meqantt.message.SubAckMessage subAckMessage25 = new org.meqantt.message.SubAckMessage(header18);
        org.meqantt.message.UnsubAckMessage unsubAckMessage26 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS27 = unsubAckMessage26.getQos();
        subAckMessage25.addQoS(qoS27);
        org.meqantt.message.ConnectMessage connectMessage33 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean34 = connectMessage33.hasWill();
        java.lang.String str35 = connectMessage33.getWill();
        org.meqantt.message.Message.Header header38 = null;
        org.meqantt.message.ConnectMessage connectMessage39 = new org.meqantt.message.ConnectMessage(header38);
        boolean boolean40 = connectMessage39.isWillRetained();
        boolean boolean41 = connectMessage39.isWillRetained();
        java.lang.String str42 = connectMessage39.getUsername();
        org.meqantt.message.QoS qoS46 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage("", qoS46);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList50 = subscribeMessage49.getTopics();
        org.meqantt.message.QoS qoS51 = subscribeMessage49.getQos();
        subscribeMessage47.addTopic("", qoS51);
        connectMessage39.setWill("hi!", "", qoS51, false);
        connectMessage33.setWill("MQIsdp", "hi!", qoS51, false);
        org.meqantt.message.SubscribeMessage subscribeMessage57 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS51);
        subAckMessage25.addQoS(qoS51);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(type19);
        org.junit.Assert.assertNull(type20);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + qoS51 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS51.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage0.getGrantedQoSs();
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
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertNotNull(qoSList16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
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
            mqttMessageHandler0.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.unsubscribe("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        java.lang.String str4 = connectMessage3.getPassword();
        boolean boolean5 = connectMessage3.hasWill();
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
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage9.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header3);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) unsubAckMessage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.util.List<java.lang.String> strList6 = unsubscribeMessage5.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        boolean boolean2 = connAckMessage1.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage9.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        subscribeMessage0.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList6 = subscribeMessage0.getTopics();
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
            subscribeMessage0.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((-1));
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        java.lang.String str5 = connectMessage3.getWill();
        boolean boolean6 = connectMessage3.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage6.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage6.getGrantedQoSs();
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS11 = pubRelMessage10.getQos();
        subAckMessage6.addQoS(qoS11);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type3.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
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
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
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
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.QoS qoS3 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setQos(qoS3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
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
        connectMessage1.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS15 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("\000\000", qoS10);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.QoS qoS8 = null;
        subscribeMessage4.addTopic("", qoS8);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subscribeMessage4.getTopicQoSs();
        subscribeMessage4.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList13 = subscribeMessage4.getTopicQoSs();
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
        subscribeMessage4.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS31);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertNotNull(qoSList13);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage4 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.QoS qoS9 = null;
        subscribeMessage5.addTopic("", qoS9);
        java.util.List<org.meqantt.message.QoS> qoSList11 = subscribeMessage5.getTopicQoSs();
        subscribeMessage5.setDup(false);
        java.util.List<java.lang.String> strList14 = subscribeMessage5.getTopics();
        org.meqantt.message.Message.Header header17 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type18 = header17.getType();
        org.meqantt.message.Message.Type type19 = header17.getType();
        org.meqantt.message.SubAckMessage subAckMessage20 = new org.meqantt.message.SubAckMessage(header17);
        org.meqantt.message.PingReqMessage pingReqMessage21 = new org.meqantt.message.PingReqMessage(header17);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage(header17);
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header17);
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
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS48);
        connectMessage23.setWill("hi!", "\000\000", qoS48, true);
        subscribeMessage5.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS48);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage4.setQos(qoS48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(type19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        boolean boolean4 = connectMessage2.hasWill();
        byte byte5 = connectMessage2.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str7 = connectMessage6.getWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 100);
        pubAckMessage1.setMessageId(2);
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
        boolean boolean22 = connectMessage6.hasUsername();
        org.meqantt.message.QoS qoS23 = connectMessage6.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS23);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
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
            mqttMessageHandler0.bindRequested(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        boolean boolean7 = connectMessage1.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
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
            mqttMessageHandler0.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
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
            mqttMessageHandler0.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
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
            mqttMessageHandler0.disconnectRequested(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean5 = connectMessage4.hasWill();
        java.lang.String str6 = connectMessage4.getWill();
        org.meqantt.message.Message.Header header9 = null;
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header9);
        boolean boolean11 = connectMessage10.isWillRetained();
        boolean boolean12 = connectMessage10.isWillRetained();
        java.lang.String str13 = connectMessage10.getUsername();
        org.meqantt.message.QoS qoS17 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        subscribeMessage18.addTopic("", qoS22);
        connectMessage10.setWill("hi!", "", qoS22, false);
        connectMessage4.setWill("MQIsdp", "hi!", qoS22, false);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS22);
        org.meqantt.message.ConnectMessage connectMessage32 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean33 = connectMessage32.hasWill();
        java.lang.String str34 = connectMessage32.getWill();
        java.lang.String str35 = connectMessage32.getWill();
        java.lang.String str36 = connectMessage32.getProtocolId();
        java.lang.String str37 = connectMessage32.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage40 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList41 = subAckMessage40.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList42 = subAckMessage40.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage46 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str47 = connectMessage46.getProtocolId();
        org.meqantt.message.QoS qoS48 = connectMessage46.getQos();
        subAckMessage40.addQoS(qoS48);
        connectMessage32.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS48, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage28.setQos(qoS48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "MQIsdp" + "'", str36, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MQIsdp" + "'", str37, "MQIsdp");
        org.junit.Assert.assertNull(qoSList41);
        org.junit.Assert.assertNull(qoSList42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MQIsdp" + "'", str47, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS10);
        org.meqantt.message.QoS qoS13 = subscribeMessage12.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS19);
        org.meqantt.message.QoS qoS22 = subscribeMessage21.getQos();
        subscribeMessage12.addTopic("", qoS22);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
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
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getUsername();
        connectMessage0.setCredentials("hi!");
        connectMessage0.setWill("hi!", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        java.lang.String str7 = connectMessage0.getWillTopic();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", true, (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus7 = connAckMessage6.getStatus();
        org.meqantt.message.Message.Type type8 = connAckMessage6.getType();
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage9.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str16 = connectMessage15.getProtocolId();
        org.meqantt.message.QoS qoS17 = connectMessage15.getQos();
        subAckMessage9.addQoS(qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subAckMessage9.addQoS(qoS21);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(connectionStatus7);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "MQIsdp" + "'", str16, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        subAckMessage0.addQoS(qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage0.getGrantedQoSs();
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
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 00110000 0 48?01: 00001000 ? 8?02: 00000000 ? 0?03: 00000000 ? 0?04: 00000000 ? 0?05: 01100100 d 100?06: 00000000 ? 0?07: 00000001 ? 1?08: 00000001 ? 1?09: 01100100 d 100?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
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
        org.meqantt.message.SubAckMessage subAckMessage32 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList33 = subAckMessage32.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList34 = subAckMessage32.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList35 = subAckMessage32.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList38 = subscribeMessage37.getTopics();
        org.meqantt.message.QoS qoS39 = subscribeMessage37.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("", qoS39);
        subAckMessage32.addQoS(qoS39);
        connectMessage6.setWill("hi!", "MQIsdp", qoS39, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
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
        org.junit.Assert.assertNull(qoSList33);
        org.junit.Assert.assertNull(qoSList34);
        org.junit.Assert.assertNull(qoSList35);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        boolean boolean4 = connectMessage2.hasPassword();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        connectMessage1.setWill("\000\000", "\000\000");
        connectMessage1.setCredentials("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        org.meqantt.message.PubRelMessage pubRelMessage3 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS4 = pubRelMessage3.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
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
            subAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
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
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
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
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage12 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage12.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type6 = subscribeMessage5.getType();
        subscribeMessage5.setDup(false);
        subscribeMessage5.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList11 = subscribeMessage5.getTopics();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getProtocolId();
        org.meqantt.message.QoS qoS21 = connectMessage19.getQos();
        subscribeMessage12.addTopic("", qoS21);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage24 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList25 = unsubscribeMessage24.getTopics();
        org.meqantt.message.Message.Type type26 = unsubscribeMessage24.getType();
        java.util.List<java.lang.String> strList27 = unsubscribeMessage24.getTopics();
        org.meqantt.message.QoS qoS28 = unsubscribeMessage24.getQos();
        subscribeMessage12.setQos(qoS28);
        subscribeMessage5.setQos(qoS28);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setQos(qoS28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type6.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type26.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS5 = pubRelMessage4.getQos();
        subAckMessage0.addQoS(qoS5);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
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
        boolean boolean38 = connectMessage14.isCleanSession();
        org.meqantt.message.UnsubAckMessage unsubAckMessage41 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS42 = unsubAckMessage41.getQos();
        connectMessage14.setWill("\000\003hi!", "hi!", qoS42, false);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage10.setQos(qoS42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + qoS42 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS42.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.setMessageId(100);
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
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.QoS qoS6 = null;
        subscribeMessage2.addTopic("", qoS6);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) subscribeMessage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.meqantt.MqttListener mqttListener5 = null;
        mqttMessageHandler0.setListener(mqttListener5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "\001\003\003\001");
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        boolean boolean10 = pubRelMessage9.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
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
            connAckMessage10.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        int int5 = pubAckMessage4.getMessageId();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type7 = subscribeMessage6.getType();
        subscribeMessage6.setDup(false);
        subscribeMessage6.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList12 = subscribeMessage6.getTopics();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str21 = connectMessage20.getProtocolId();
        org.meqantt.message.QoS qoS22 = connectMessage20.getQos();
        subscribeMessage13.addTopic("", qoS22);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage25 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList26 = unsubscribeMessage25.getTopics();
        org.meqantt.message.Message.Type type27 = unsubscribeMessage25.getType();
        java.util.List<java.lang.String> strList28 = unsubscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS29 = unsubscribeMessage25.getQos();
        subscribeMessage13.setQos(qoS29);
        subscribeMessage6.setQos(qoS29);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type7.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MQIsdp" + "'", str21, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type27.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
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
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeRequested(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage(2);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
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
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage11.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage11.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList14 = subAckMessage11.getGrantedQoSs();
        subAckMessage11.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getProtocolId();
        org.meqantt.message.QoS qoS25 = connectMessage23.getQos();
        subscribeMessage17.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS25);
        subAckMessage11.addQoS(qoS25);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage10.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNull(qoSList14);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MQIsdp" + "'", str24, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage();
        java.lang.String str6 = connectMessage5.getProtocolId();
        java.lang.String str7 = connectMessage5.getClientId();
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
        connectMessage5.setWill("\000d\000\001\001d", "hi!", qoS56, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage4.setQos(qoS56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
        org.junit.Assert.assertNull(str7);
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
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
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
        org.meqantt.message.Message.Header header12 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type13 = header12.getType();
        org.meqantt.message.Message.Type type14 = header12.getType();
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage(header12);
        org.meqantt.message.PingReqMessage pingReqMessage16 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.PingReqMessage pingReqMessage17 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.DisconnectMessage disconnectMessage18 = new org.meqantt.message.DisconnectMessage(header12);
        org.meqantt.message.SubAckMessage subAckMessage19 = new org.meqantt.message.SubAckMessage(header12);
        org.meqantt.message.UnsubAckMessage unsubAckMessage20 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS21 = unsubAckMessage20.getQos();
        subAckMessage19.addQoS(qoS21);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage10.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
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
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.write(outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
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
            mqttMessageHandler0.channelDisconnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
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
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage3 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        int int1 = subAckMessage0.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        subAckMessage0.setMessageId((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(qoSList2);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
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
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage59.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
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
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
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
            unsubAckMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        org.meqantt.message.QoS qoS5 = null;
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
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
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
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
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        connectMessage1.setCredentials("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.write(outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
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
            mqttMessageHandler0.channelInterestChanged(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        int int3 = pubAckMessage2.getMessageId();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage("", qoS8);
        subAckMessage4.addQoS(qoS8);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.hasWill();
        boolean boolean6 = connectMessage1.hasWill();
        java.lang.String str7 = connectMessage1.getWill();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
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
            connAckMessage2.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
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
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 10);
        boolean boolean4 = connectMessage3.hasPassword();
        int int5 = connectMessage3.getKeepAlive();
        java.lang.String str6 = connectMessage3.getPassword();
        org.meqantt.message.QoS qoS9 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't set willTopic, will or willQoS value independently");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) -1);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage2.getGrantedQoSs();
        subAckMessage2.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getProtocolId();
        org.meqantt.message.QoS qoS16 = connectMessage14.getQos();
        subscribeMessage8.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS16);
        subAckMessage2.addQoS(qoS16);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
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
            mqttMessageHandler0.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type9 = subscribeMessage8.getType();
        subscribeMessage8.setDup(false);
        subscribeMessage8.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList14 = subscribeMessage8.getTopics();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getProtocolId();
        org.meqantt.message.QoS qoS24 = connectMessage22.getQos();
        subscribeMessage15.addTopic("", qoS24);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage27 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList28 = unsubscribeMessage27.getTopics();
        org.meqantt.message.Message.Type type29 = unsubscribeMessage27.getType();
        java.util.List<java.lang.String> strList30 = unsubscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS31 = unsubscribeMessage27.getQos();
        subscribeMessage15.setQos(qoS31);
        subscribeMessage8.setQos(qoS31);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type9.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MQIsdp" + "'", str23, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type29.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = unsubAckMessage2.getType();
        int int4 = unsubAckMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean10 = connectMessage9.hasWill();
        java.lang.String str11 = connectMessage9.getWill();
        java.lang.String str12 = connectMessage9.getWill();
        java.lang.String str13 = connectMessage9.getProtocolId();
        java.lang.String str14 = connectMessage9.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList18 = subAckMessage17.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList19 = subAckMessage17.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getProtocolId();
        org.meqantt.message.QoS qoS25 = connectMessage23.getQos();
        subAckMessage17.addQoS(qoS25);
        connectMessage9.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS25, false);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MQIsdp" + "'", str14, "MQIsdp");
        org.junit.Assert.assertNull(qoSList18);
        org.junit.Assert.assertNull(qoSList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MQIsdp" + "'", str24, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        boolean boolean4 = connectMessage1.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage(header0);
        org.meqantt.message.QoS qoS3 = null;
        subscribeMessage1.addTopic("hi!", qoS3);
        java.util.List<org.meqantt.message.QoS> qoSList5 = subscribeMessage1.getTopicQoSs();
        java.util.List<java.lang.String> strList6 = subscribeMessage1.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subscribeMessage1.getTopicQoSs();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage8.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getProtocolId();
        org.meqantt.message.QoS qoS21 = connectMessage19.getQos();
        subscribeMessage12.addTopic("", qoS21);
        subAckMessage8.addQoS(qoS21);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage1.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qoSList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(qoSList7);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        int int9 = connectMessage1.getKeepAlive();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getUsername();
        byte byte2 = connectMessage0.getProtocolVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }
}

