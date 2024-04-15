package org.meqantt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header1);
        byte byte13 = connectMessage12.getProtocolVersion();
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 3 + "'", byte13 == (byte) 3);
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        java.lang.String str7 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage9.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str7, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.hasWill();
        org.meqantt.message.QoS qoS7 = connectMessage1.getWillQoS();
        org.meqantt.message.QoS qoS8 = connectMessage1.getWillQoS();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        java.lang.String str3 = connectMessage1.getPassword();
        org.meqantt.message.Message.Header header7 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header7);
        connectMessage8.setWill("\000\000", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str22 = connectMessage21.getProtocolId();
        org.meqantt.message.QoS qoS23 = connectMessage21.getQos();
        subscribeMessage14.addTopic("", qoS23);
        connectMessage8.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS23, true);
        connectMessage1.setWill("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS23, true);
        byte byte29 = connectMessage1.getProtocolVersion();
        boolean boolean30 = connectMessage1.isCleanSession();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 3 + "'", byte29 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
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
        org.meqantt.message.PubRelMessage pubRelMessage13 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage14 = new org.meqantt.message.PingRespMessage(header1);
        java.lang.String str15 = header1.toString();
        org.meqantt.message.Message.Type type16 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage17 = new org.meqantt.message.DisconnectMessage(header1);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str15, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type16);
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        byte[] byteArray2 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str3 = org.meqantt.util.FormatUtil.toString(byteArray2);
        org.meqantt.message.PublishMessage publishMessage4 = new org.meqantt.message.PublishMessage("hi!", byteArray2);
        publishMessage4.setMessageId((int) '\001');
        java.lang.String str7 = publishMessage4.getDataAsString();
        java.lang.String str8 = publishMessage4.getDataAsString();
        byte[] byteArray9 = publishMessage4.getData();
        java.lang.String str10 = publishMessage4.getTopic();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000" + "'", str7, "\000\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000" + "'", str8, "\000\000");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        connectMessage2.setCredentials("hi!", "");
        connectMessage2.setCredentials("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        boolean boolean9 = connectMessage2.isCleanSession();
        boolean boolean10 = connectMessage2.hasWill();
        org.meqantt.message.Message.Header header14 = null;
        org.meqantt.message.ConnectMessage connectMessage15 = new org.meqantt.message.ConnectMessage(header14);
        java.lang.String str16 = connectMessage15.getPassword();
        java.lang.String str17 = connectMessage15.getWillTopic();
        boolean boolean18 = connectMessage15.isCleanSession();
        boolean boolean19 = connectMessage15.hasPassword();
        org.meqantt.message.PubRelMessage pubRelMessage23 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS24 = pubRelMessage23.getQos();
        connectMessage15.setWill("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS24, false);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00000001 \001 1\n", qoS24);
        connectMessage2.setWill("00: 00000000 \000 0\n01: 00000000 \000 0\n", "", qoS24, false);
        connectMessage2.setWill("\000d\000\001\001d", "\000\006\ufffd\ufffd\003hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage7 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str12 = connectMessage11.getProtocolId();
        java.lang.String str13 = connectMessage11.getPassword();
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type5.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
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
        java.lang.String str12 = header1.toString();
        org.meqantt.message.PubRecMessage pubRecMessage13 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str15 = connectMessage14.getWill();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str12, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage12 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage13 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage15 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage15.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((-1));
        int int2 = pubCompMessage1.getMessageId();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
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
        org.meqantt.MqttListener mqttListener15 = null;
        mqttMessageHandler0.setListener(mqttListener15);
        org.meqantt.MqttListener mqttListener17 = null;
        mqttMessageHandler0.setListener(mqttListener17);
        org.meqantt.MqttListener mqttListener19 = null;
        mqttMessageHandler0.setListener(mqttListener19);
        org.meqantt.MqttListener mqttListener21 = null;
        mqttMessageHandler0.setListener(mqttListener21);
        org.meqantt.MqttListener mqttListener23 = null;
        mqttMessageHandler0.setListener(mqttListener23);
        org.meqantt.MqttListener mqttListener25 = null;
        mqttMessageHandler0.setListener(mqttListener25);
        org.meqantt.MqttListener mqttListener27 = null;
        mqttMessageHandler0.setListener(mqttListener27);
        org.meqantt.MqttListener mqttListener29 = null;
        mqttMessageHandler0.setListener(mqttListener29);
        org.meqantt.MqttListener mqttListener31 = null;
        mqttMessageHandler0.setListener(mqttListener31);
        org.meqantt.MqttListener mqttListener33 = null;
        mqttMessageHandler0.setListener(mqttListener33);
        org.meqantt.MqttListener mqttListener35 = null;
        mqttMessageHandler0.setListener(mqttListener35);
        org.meqantt.MqttListener mqttListener37 = null;
        mqttMessageHandler0.setListener(mqttListener37);
        org.meqantt.MqttListener mqttListener39 = null;
        mqttMessageHandler0.setListener(mqttListener39);
        org.meqantt.MqttListener mqttListener41 = null;
        mqttMessageHandler0.setListener(mqttListener41);
        org.meqantt.MqttListener mqttListener43 = null;
        mqttMessageHandler0.setListener(mqttListener43);
        org.meqantt.MqttListener mqttListener45 = null;
        mqttMessageHandler0.setListener(mqttListener45);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext47 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent48 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.channelUnbound(channelHandlerContext47, channelStateEvent48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
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
        org.meqantt.message.PublishMessage publishMessage13 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PublishMessage publishMessage14 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PublishMessage publishMessage15 = new org.meqantt.message.PublishMessage(header1);
        java.lang.Class<?> wildcardClass16 = publishMessage15.getClass();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getUsername();
        boolean boolean2 = connectMessage0.hasWill();
        connectMessage0.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        java.lang.String str6 = connectMessage0.getPassword();
        java.lang.String str7 = connectMessage0.getProtocolId();
        int int8 = connectMessage0.getKeepAlive();
        int int9 = connectMessage0.getKeepAlive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n" + "'", str6, "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
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
        org.meqantt.message.QoS qoS19 = connectMessage3.getWillQoS();
        java.lang.String str20 = connectMessage3.getProtocolId();
        java.lang.String str21 = connectMessage3.getWillTopic();
        org.meqantt.message.Message.Type type22 = connectMessage3.getType();
        boolean boolean23 = connectMessage3.isCleanSession();
        java.lang.String str24 = connectMessage3.getWill();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage26 = new org.meqantt.message.UnsubscribeMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
        org.meqantt.message.QoS qoS28 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("", qoS28);
        int int30 = subscribeMessage29.getMessageId();
        subscribeMessage29.setMessageId((int) (short) 10);
        java.util.List<java.lang.String> strList33 = subscribeMessage29.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList34 = subscribeMessage29.getTopicQoSs();
        subscribeMessage29.setMessageId(32);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage38 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS39 = unsubscribeMessage38.getQos();
        subscribeMessage29.setQos(qoS39);
        unsubscribeMessage26.setQos(qoS39);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.meqantt.message.Message.Type.CONNECT + "'", type22.equals(org.meqantt.message.Message.Type.CONNECT));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000d\000\001\001d" + "'", str24, "\000d\000\001\001d");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(qoSList34);
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage4 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage8 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage7 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type5.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage11 = new org.meqantt.message.UnsubscribeMessage("hi!");
        unsubscribeMessage11.setDup(false);
        org.meqantt.message.QoS qoS14 = unsubscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 00000100 \004 4\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 11000000 \300 192\n05: 10000000 \200 128\n", qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 00000110 \006 6\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 00000011 \003 3\n05: 01101000 h 104\n06: 01101001 i 105\n07: 00100001 ! 33\n", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getWillTopic();
        boolean boolean4 = connectMessage1.isCleanSession();
        boolean boolean5 = connectMessage1.isCleanSession();
        int int6 = connectMessage1.getKeepAlive();
        java.lang.String str7 = connectMessage1.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage1.getWillQoS();
        boolean boolean9 = connectMessage1.hasPassword();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertNull(qoS8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
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
        org.meqantt.message.PubCompMessage pubCompMessage13 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage14 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage15 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage16 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Type type17 = disconnectMessage16.getType();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type17);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) -1);
        org.meqantt.message.Message.Type type2 = pubAckMessage1.getType();
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
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 00000100 \004 4\n02: 00000001 \001 1\n03: 00000011 \003 3\n04: 00000011 \003 3\n05: 00000001 \001 1\n", qoS38);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBACK + "'", type2.equals(org.meqantt.message.Message.Type.PUBACK));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MQIsdp" + "'", str37, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.QoS qoS8 = connAckMessage7.getQos();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 10);
        boolean boolean13 = connectMessage12.hasPassword();
        org.meqantt.message.Message.Header header17 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage(header17);
        org.meqantt.message.Message.Type type19 = header17.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage20 = new org.meqantt.message.UnsubscribeMessage(header17);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage(header17);
        org.meqantt.message.DisconnectMessage disconnectMessage22 = new org.meqantt.message.DisconnectMessage(header17);
        org.meqantt.message.DisconnectMessage disconnectMessage23 = new org.meqantt.message.DisconnectMessage(header17);
        org.meqantt.message.PubCompMessage pubCompMessage24 = new org.meqantt.message.PubCompMessage(header17);
        org.meqantt.message.ConnAckMessage connAckMessage25 = new org.meqantt.message.ConnAckMessage(header17);
        org.meqantt.message.PublishMessage publishMessage26 = new org.meqantt.message.PublishMessage(header17);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("", qoS32);
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS32);
        org.meqantt.message.QoS qoS35 = subscribeMessage34.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList40 = subscribeMessage39.getTopics();
        org.meqantt.message.QoS qoS41 = subscribeMessage39.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS41);
        org.meqantt.message.QoS qoS44 = subscribeMessage43.getQos();
        subscribeMessage34.addTopic("", qoS44);
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage("", qoS44);
        publishMessage26.setQos(qoS44);
        connectMessage12.setWill("00: 00000000 \000 0\n01: 00000110 \006 6\n02: 01001101 M 77\n03: 01010001 Q 81\n04: 01001001 I 73\n05: 01110011 s 115\n06: 01100100 d 100\n07: 01110000 p 112\n", "\000\000", qoS44, false);
        org.meqantt.message.QoS qoS50 = connectMessage12.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setQos(qoS50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(type19);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS50 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS50.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage7 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage10 = new org.meqantt.message.PingRespMessage(header1);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) -1);
        pubAckMessage1.setMessageId((int) (byte) 1);
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
        connectMessage5.setWill("MQIsdp", "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        java.lang.String str25 = connectMessage5.getPassword();
        boolean boolean26 = connectMessage5.hasWill();
        connectMessage5.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        connectMessage5.setCredentials("\000d\000\001\001d");
        org.meqantt.message.QoS qoS31 = connectMessage5.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        java.lang.String str6 = header1.toString();
        java.lang.String str7 = header1.toString();
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str7, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        java.lang.String str7 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str9 = connectMessage8.getWill();
        connectMessage8.setCredentials("\000\ufffd\ufffd\ufffd 162\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 00000100 \004 4\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n", "00: 00000000 \000 0\n01: 00000011 \003 3\n02: 01101000 h 104\n03: 01101001 i 105\n04: 00100001 ! 33\n");
        java.lang.String str13 = connectMessage8.getPassword();
        java.lang.String str14 = connectMessage8.getWillTopic();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str7, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00: 00000000 \000 0\n01: 00000011 \003 3\n02: 01101000 h 104\n03: 01101001 i 105\n04: 00100001 ! 33\n" + "'", str13, "00: 00000000 \000 0\n01: 00000011 \003 3\n02: 01101000 h 104\n03: 01101001 i 105\n04: 00100001 ! 33\n");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
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
        boolean boolean13 = connectMessage1.isWillRetained();
        java.lang.String str14 = connectMessage1.getWillTopic();
        connectMessage1.setCredentials("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
        java.lang.String str17 = connectMessage1.getPassword();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(qoS9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
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
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage3.getGrantedQoSs();
        org.meqantt.message.QoS qoS5 = subAckMessage3.getQos();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage3.getGrantedQoSs();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.EXACTLY_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.EXACTLY_ONCE));
        org.junit.Assert.assertNull(qoSList6);
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.setMessageId(100);
        unsubscribeMessage1.addTopic("MQIsdp");
        boolean boolean9 = unsubscribeMessage1.isDup();
        unsubscribeMessage1.addTopic("");
        unsubscribeMessage1.setDup(false);
        java.util.List<java.lang.String> strList14 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList15 = unsubscribeMessage1.getTopics();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
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
        org.meqantt.MqttListener mqttListener15 = null;
        mqttMessageHandler0.setListener(mqttListener15);
        org.meqantt.MqttListener mqttListener17 = null;
        mqttMessageHandler0.setListener(mqttListener17);
        org.meqantt.MqttListener mqttListener19 = null;
        mqttMessageHandler0.setListener(mqttListener19);
        org.meqantt.MqttListener mqttListener21 = null;
        mqttMessageHandler0.setListener(mqttListener21);
        org.meqantt.MqttListener mqttListener23 = null;
        mqttMessageHandler0.setListener(mqttListener23);
        org.meqantt.MqttListener mqttListener25 = null;
        mqttMessageHandler0.setListener(mqttListener25);
        org.meqantt.MqttListener mqttListener27 = null;
        mqttMessageHandler0.setListener(mqttListener27);
        org.meqantt.MqttListener mqttListener29 = null;
        mqttMessageHandler0.setListener(mqttListener29);
        org.meqantt.MqttListener mqttListener31 = null;
        mqttMessageHandler0.setListener(mqttListener31);
        org.meqantt.MqttListener mqttListener33 = null;
        mqttMessageHandler0.setListener(mqttListener33);
        org.meqantt.MqttListener mqttListener35 = null;
        mqttMessageHandler0.setListener(mqttListener35);
        org.meqantt.MqttListener mqttListener37 = null;
        mqttMessageHandler0.setListener(mqttListener37);
        org.meqantt.MqttListener mqttListener39 = null;
        mqttMessageHandler0.setListener(mqttListener39);
        org.meqantt.MqttListener mqttListener41 = null;
        mqttMessageHandler0.setListener(mqttListener41);
        org.meqantt.MqttListener mqttListener43 = null;
        mqttMessageHandler0.setListener(mqttListener43);
        org.meqantt.MqttListener mqttListener45 = null;
        mqttMessageHandler0.setListener(mqttListener45);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext47 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent48 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext47, channelStateEvent48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\000\ufffd\ufffdD00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "00: 00000000 \000 0\n01: 00000110 \006 6\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 00000011 \003 3\n05: 01101000 h 104\n06: 01101001 i 105\n07: 00100001 ! 33\n");
        publishMessage2.setDup(false);
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage5 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS6 = unsubAckMessage5.getQos();
        subAckMessage4.addQoS(qoS6);
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage4.getGrantedQoSs();
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList8);
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isWillRetained();
        int int4 = connectMessage1.getKeepAlive();
        java.lang.String str5 = connectMessage1.getWill();
        boolean boolean6 = connectMessage1.hasWill();
        boolean boolean7 = connectMessage1.isWillRetained();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        byte[] byteArray3 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str4 = org.meqantt.util.FormatUtil.toString(byteArray3);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage("hi!", byteArray3);
        publishMessage5.setMessageId((int) '\001');
        java.lang.String str8 = publishMessage5.getDataAsString();
        java.lang.String str9 = publishMessage5.getDataAsString();
        byte[] byteArray10 = publishMessage5.getData();
        byte[] byteArray11 = publishMessage5.toBytes();
        java.lang.String str12 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray11);
        org.meqantt.message.PublishMessage publishMessage13 = new org.meqantt.message.PublishMessage("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00000001 \001 1\n", byteArray11);
        java.lang.String str14 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray11);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000" + "'", str8, "\000\000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\000" + "'", str9, "\000\000");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 7, 0, 3, 104, 105, 33, 0, 0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00: 00110000 0 48\n01: 00000111 \007 7\n02: 00000000 \000 0\n03: 00000011 \003 3\n04: 01101000 h 104\n05: 01101001 i 105\n06: 00100001 ! 33\n07: 00000000 \000 0\n08: 00000000 \000 0\n" + "'", str12, "00: 00110000 0 48\n01: 00000111 \007 7\n02: 00000000 \000 0\n03: 00000011 \003 3\n04: 01101000 h 104\n05: 01101001 i 105\n06: 00100001 ! 33\n07: 00000000 \000 0\n08: 00000000 \000 0\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00: 00110000 0 48\n01: 00000111 \007 7\n02: 00000000 \000 0\n03: 00000011 \003 3\n04: 01101000 h 104\n05: 01101001 i 105\n06: 00100001 ! 33\n07: 00000000 \000 0\n08: 00000000 \000 0\n" + "'", str14, "00: 00110000 0 48\n01: 00000111 \007 7\n02: 00000000 \000 0\n03: 00000011 \003 3\n04: 01101000 h 104\n05: 01101001 i 105\n06: 00100001 ! 33\n07: 00000000 \000 0\n08: 00000000 \000 0\n");
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage9 = new org.meqantt.message.PubRecMessage(header1);
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 0);
        java.lang.String str4 = connectMessage3.getClientId();
        org.meqantt.message.Message.Type type5 = connectMessage3.getType();
        org.meqantt.message.QoS qoS6 = connectMessage3.getWillQoS();
        java.lang.String str7 = connectMessage3.getWillTopic();
        boolean boolean8 = connectMessage3.isCleanSession();
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage11.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage11.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList14 = subAckMessage11.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.QoS qoS18 = subscribeMessage16.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        subAckMessage11.addQoS(qoS18);
        org.meqantt.message.QoS qoS21 = subAckMessage11.getQos();
        connectMessage3.setWill("Header [type=null, retain=true, qos=AT_LEAST_ONCE, dup=false]", "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS21, false);
        boolean boolean24 = connectMessage3.hasUsername();
        int int25 = connectMessage3.getKeepAlive();
        org.meqantt.message.ConnectMessage connectMessage29 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str30 = connectMessage29.getUsername();
        org.meqantt.message.QoS qoS34 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("", qoS34);
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList38 = subscribeMessage37.getTopics();
        org.meqantt.message.QoS qoS39 = subscribeMessage37.getQos();
        subscribeMessage35.addTopic("", qoS39);
        connectMessage29.setWill("", "\000d\000\001\001d", qoS39, true);
        boolean boolean43 = connectMessage29.isCleanSession();
        java.lang.String str44 = connectMessage29.getClientId();
        byte byte45 = connectMessage29.getProtocolVersion();
        int int46 = connectMessage29.getKeepAlive();
        boolean boolean47 = connectMessage29.hasPassword();
        java.lang.String str48 = connectMessage29.getWill();
        org.meqantt.message.QoS qoS49 = connectMessage29.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.CONNECT + "'", type5.equals(org.meqantt.message.Message.Type.CONNECT));
        org.junit.Assert.assertNull(qoS6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNull(qoSList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 3 + "'", byte45 == (byte) 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\000d\000\001\001d" + "'", str48, "\000d\000\001\001d");
        org.junit.Assert.assertTrue("'" + qoS49 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS49.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
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
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList24 = subscribeMessage23.getTopics();
        org.meqantt.message.QoS qoS25 = subscribeMessage23.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("", qoS25);
        subscribeMessage18.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS25);
        boolean boolean28 = subscribeMessage18.isDup();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        connectMessage1.setWill("\000\000", "\000\000");
        int int10 = connectMessage1.getKeepAlive();
        java.lang.String str11 = connectMessage1.getClientId();
        java.lang.String str12 = connectMessage1.getWill();
        boolean boolean13 = connectMessage1.isCleanSession();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000" + "'", str12, "\000\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        java.lang.String str5 = header1.toString();
        java.lang.String str6 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str5, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str6, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        java.lang.String str6 = header1.toString();
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage9 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage10 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage11 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage11.addTopic("00: 00110000 0 48\n01: 00010010 \022 18\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000000 \000 0\n11: 00001000 \b 8\n12: 11000000 \300 192\n13: 10000000 \200 128\n14: 01100100 d 100\n15: 11000000 \300 192\n16: 10000000 \200 128\n17: 00000001 \001 1\n18: 00000001 \001 1\n19: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage11.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage8 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage9 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage11 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage11.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\001\003\003\001", true, (int) '4');
        connectMessage3.setWill("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd");
        boolean boolean7 = connectMessage3.hasUsername();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("00: 00000000 \000 0\n01: 00000100 \004 4\n02: 00000001 \001 1\n03: 00000011 \003 3\n04: 00000011 \003 3\n05: 00000001 \001 1\n");
        unsubscribeMessage1.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Header header9 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type10 = header9.getType();
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header9);
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str14 = header13.toString();
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage(header13);
        org.meqantt.message.PublishMessage publishMessage16 = new org.meqantt.message.PublishMessage(header13);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage19 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS20 = unsubscribeMessage19.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage("", qoS20);
        publishMessage16.setQos(qoS20);
        subAckMessage11.addQoS(qoS20);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type5.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type10.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str14, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.Message.Type type6 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type6.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage6.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        connectMessage1.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS6 = connectMessage1.getWillQoS();
        byte byte7 = connectMessage1.getProtocolVersion();
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
        connectMessage1.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 01100100 d 100\n01: 00000000 \000 0\n", qoS23, false);
        boolean boolean28 = connectMessage1.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setCredentials("", "00: 01100100 d 100\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00000000 \000 0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: It is not valid to supply a password without supplying a username.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 3 + "'", byte7 == (byte) 3);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        java.lang.Class<?> wildcardClass10 = pingReqMessage9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        org.meqantt.message.QoS qoS6 = connectMessage1.getWillQoS();
        connectMessage1.setWill("\000d\000\001\001d", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage5 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header9 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage10 = new org.meqantt.message.PingRespMessage(header9);
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header9);
        org.meqantt.message.UnsubAckMessage unsubAckMessage12 = new org.meqantt.message.UnsubAckMessage(header9);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header9);
        java.util.List<org.meqantt.message.QoS> qoSList14 = subAckMessage13.getGrantedQoSs();
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        subAckMessage15.addQoS(qoS19);
        subAckMessage13.addQoS(qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("\000\006MQIsdp", qoS19);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList14);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.PubRecMessage pubRecMessage2 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage(header1);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PubRecMessage pubRecMessage9 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage12 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage13 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str19 = connectMessage18.getUsername();
        org.meqantt.message.QoS qoS23 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        org.meqantt.message.QoS qoS28 = subscribeMessage26.getQos();
        subscribeMessage24.addTopic("", qoS28);
        connectMessage18.setWill("", "\000d\000\001\001d", qoS28, true);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS28);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage13.setQos(qoS28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        connectMessage8.setWill("", "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdD00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        byte[] byteArray5 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str6 = org.meqantt.util.FormatUtil.toString(byteArray5);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage("hi!", byteArray5);
        publishMessage7.setMessageId((int) '\001');
        java.lang.String str10 = publishMessage7.getDataAsString();
        java.lang.String str11 = publishMessage7.getDataAsString();
        byte[] byteArray12 = publishMessage7.getData();
        java.lang.String str13 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray12);
        org.meqantt.message.PublishMessage publishMessage14 = new org.meqantt.message.PublishMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", byteArray12);
        java.lang.String str15 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray12);
        org.meqantt.message.PublishMessage publishMessage16 = new org.meqantt.message.PublishMessage("\000\023\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\001d", byteArray12);
        org.meqantt.message.PublishMessage publishMessage17 = new org.meqantt.message.PublishMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", byteArray12);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type19 = subscribeMessage18.getType();
        org.meqantt.message.QoS qoS22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        subscribeMessage23.addTopic("", qoS27);
        subscribeMessage18.addTopic("MQIsdp", qoS27);
        subscribeMessage18.setDup(false);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage34 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS35 = unsubscribeMessage34.getQos();
        subscribeMessage18.addTopic("MQIsdp", qoS35);
        subscribeMessage18.setDup(false);
        org.meqantt.message.Message.Header header41 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type42 = header41.getType();
        org.meqantt.message.Message.Type type43 = header41.getType();
        org.meqantt.message.SubAckMessage subAckMessage44 = new org.meqantt.message.SubAckMessage(header41);
        org.meqantt.message.PingReqMessage pingReqMessage45 = new org.meqantt.message.PingReqMessage(header41);
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage(header41);
        org.meqantt.message.PubCompMessage pubCompMessage47 = new org.meqantt.message.PubCompMessage(header41);
        org.meqantt.message.SubAckMessage subAckMessage48 = new org.meqantt.message.SubAckMessage(header41);
        org.meqantt.message.Message.Header header49 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage(header49);
        org.meqantt.message.Message.Header header53 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage54 = new org.meqantt.message.ConnectMessage(header53);
        connectMessage54.setWill("\000\000", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList61 = subscribeMessage60.getTopics();
        org.meqantt.message.QoS qoS62 = subscribeMessage60.getQos();
        org.meqantt.message.ConnectMessage connectMessage67 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str68 = connectMessage67.getProtocolId();
        org.meqantt.message.QoS qoS69 = connectMessage67.getQos();
        subscribeMessage60.addTopic("", qoS69);
        connectMessage54.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS69, true);
        subscribeMessage50.addTopic("", qoS69);
        subAckMessage48.addQoS(qoS69);
        subscribeMessage18.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS69);
        publishMessage17.setQos(qoS69);
        java.lang.String str77 = publishMessage17.getTopic();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000" + "'", str10, "\000\000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000" + "'", str11, "\000\000");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str13, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str15, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type19.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(type42);
        org.junit.Assert.assertNull(type43);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + qoS62 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS62.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "MQIsdp" + "'", str68, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS69 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS69.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n" + "'", str77, "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", true, (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: ??00: 00110000 0 48?01: 00001000 ? 8?02: 00000000 ?? 0?03: 00000000 ?? 0?04: 00000000 ?? 0?05: 01100100 d 100?06: 00000000 ?? 0?07: 00000001 ? 1?08: 00000001 ? 1?09: 01100100 d 100?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        java.lang.String str5 = header1.toString();
        java.lang.String str6 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str5, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str6, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", true, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 10010000 ? 144?01: 00000011 ? 3?02: 00000000 ? 0?03: 00000000 ? 0?04: 00000000 ? 0?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        java.lang.String str7 = header1.toString();
        org.meqantt.message.PubAckMessage pubAckMessage8 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str7, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean13 = connectMessage12.hasWill();
        java.lang.String str14 = connectMessage12.getWill();
        org.meqantt.message.Message.Header header17 = null;
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage(header17);
        boolean boolean19 = connectMessage18.isWillRetained();
        boolean boolean20 = connectMessage18.isWillRetained();
        java.lang.String str21 = connectMessage18.getUsername();
        org.meqantt.message.QoS qoS25 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("", qoS25);
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList29 = subscribeMessage28.getTopics();
        org.meqantt.message.QoS qoS30 = subscribeMessage28.getQos();
        subscribeMessage26.addTopic("", qoS30);
        connectMessage18.setWill("hi!", "", qoS30, false);
        connectMessage12.setWill("MQIsdp", "hi!", qoS30, false);
        byte byte36 = connectMessage12.getProtocolVersion();
        connectMessage12.setWill("hi!", "MQIsdp");
        org.meqantt.message.PublishMessage publishMessage44 = new org.meqantt.message.PublishMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", "\001\003\003\001");
        org.meqantt.message.QoS qoS45 = publishMessage44.getQos();
        connectMessage12.setWill("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "\ufffd\ufffd\001\000\000\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n\000", qoS45, true);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage8.setQos(qoS45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 3 + "'", byte36 == (byte) 3);
        org.junit.Assert.assertTrue("'" + qoS45 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS45.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
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
        java.lang.String str29 = connectMessage3.getClientId();
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.write(outputStream30);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MQIsdp" + "'", str29, "MQIsdp");
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subscribeMessage9.getTopicQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subscribeMessage9.getTopicQoSs();
        boolean boolean12 = subscribeMessage9.isRetained();
        java.util.List<java.lang.String> strList13 = subscribeMessage9.getTopics();
        java.util.List<java.lang.String> strList14 = subscribeMessage9.getTopics();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertNotNull(qoSList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        subAckMessage11.addQoS(qoS15);
        java.util.List<org.meqantt.message.QoS> qoSList18 = subAckMessage11.getGrantedQoSs();
        boolean boolean19 = subAckMessage11.isRetained();
        org.meqantt.message.Message.Header header21 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage22 = new org.meqantt.message.PubAckMessage(header21);
        java.lang.String str23 = header21.toString();
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage(header21);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage(header21);
        org.meqantt.message.ConnectMessage connectMessage35 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str36 = connectMessage35.getUsername();
        org.meqantt.message.QoS qoS40 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage("", qoS40);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList44 = subscribeMessage43.getTopics();
        org.meqantt.message.QoS qoS45 = subscribeMessage43.getQos();
        subscribeMessage41.addTopic("", qoS45);
        connectMessage35.setWill("", "\000d\000\001\001d", qoS45, true);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("hi!", qoS45);
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS45);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("", qoS45);
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS45);
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS45);
        subscribeMessage25.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS45);
        subAckMessage11.addQoS(qoS45);
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage("", qoS45);
        int int57 = subscribeMessage56.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList58 = subscribeMessage56.getTopicQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList59 = subscribeMessage56.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage64 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean65 = connectMessage64.hasWill();
        java.lang.String str66 = connectMessage64.getWill();
        org.meqantt.message.Message.Header header69 = null;
        org.meqantt.message.ConnectMessage connectMessage70 = new org.meqantt.message.ConnectMessage(header69);
        boolean boolean71 = connectMessage70.isWillRetained();
        boolean boolean72 = connectMessage70.isWillRetained();
        java.lang.String str73 = connectMessage70.getUsername();
        org.meqantt.message.QoS qoS77 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage78 = new org.meqantt.message.SubscribeMessage("", qoS77);
        org.meqantt.message.SubscribeMessage subscribeMessage80 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList81 = subscribeMessage80.getTopics();
        org.meqantt.message.QoS qoS82 = subscribeMessage80.getQos();
        subscribeMessage78.addTopic("", qoS82);
        connectMessage70.setWill("hi!", "", qoS82, false);
        connectMessage64.setWill("MQIsdp", "hi!", qoS82, false);
        byte byte88 = connectMessage64.getProtocolVersion();
        connectMessage64.setCredentials("\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        java.lang.String str92 = connectMessage64.getWillTopic();
        org.meqantt.message.QoS qoS93 = connectMessage64.getWillQoS();
        subscribeMessage56.addTopic("00: 01100000 ` 96\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 01100100 d 100\n", qoS93);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str23, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + qoS45 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS45.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(qoSList58);
        org.junit.Assert.assertNotNull(qoSList59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertTrue("'" + qoS82 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS82.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte88 + "' != '" + (byte) 3 + "'", byte88 == (byte) 3);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "MQIsdp" + "'", str92, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS93 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS93.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage7 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage8 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str7 = connectMessage6.getWill();
        connectMessage6.setWill("\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
        boolean boolean11 = connectMessage6.isDup();
        boolean boolean12 = connectMessage6.hasUsername();
        java.lang.String str13 = connectMessage6.getUsername();
        connectMessage6.setWill("\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "\001\03700: 00010000 \020 16\n01: 00001110 \016 14\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000010 \002 2\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage11 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage12 = new org.meqantt.message.PubAckMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getClientId();
        boolean boolean5 = connectMessage3.isDup();
        java.lang.String str6 = connectMessage3.getUsername();
        boolean boolean7 = connectMessage3.isCleanSession();
        byte byte8 = connectMessage3.getProtocolVersion();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 3 + "'", byte8 == (byte) 3);
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
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
        byte byte20 = connectMessage3.getProtocolVersion();
        org.meqantt.message.QoS qoS21 = connectMessage3.getQos();
        boolean boolean22 = connectMessage3.hasPassword();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 3 + "'", byte20 == (byte) 3);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage3 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 0);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, 1);
        java.lang.String str6 = connectMessage5.getClientId();
        boolean boolean7 = connectMessage5.hasUsername();
        java.lang.String str8 = connectMessage5.getPassword();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getUsername();
        org.meqantt.message.QoS qoS19 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("", qoS19);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        subscribeMessage20.addTopic("", qoS24);
        connectMessage14.setWill("", "\000d\000\001\001d", qoS24, true);
        boolean boolean28 = connectMessage14.isCleanSession();
        java.lang.String str29 = connectMessage14.getClientId();
        java.lang.String str30 = connectMessage14.getPassword();
        java.lang.String str31 = connectMessage14.getWill();
        byte[] byteArray32 = connectMessage14.toBytes();
        byte[] byteArray33 = connectMessage14.toBytes();
        org.meqantt.message.QoS qoS34 = connectMessage14.getQos();
        connectMessage5.setWill("\000\004\001\003\003\001", "00: 10100010 \242 162\n01: 00010111 \027 23\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00010011 \023 19\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 00001000 \b 8\n09: 11101111 \357 239\n10: 10111111 \277 191\n11: 10111101 \275 189\n12: 11101111 \357 239\n13: 10111111 \277 191\n14: 10111101 \275 189\n15: 01100100 d 100\n16: 11101111 \357 239\n17: 10111111 \277 191\n18: 10111101 \275 189\n19: 11101111 \357 239\n20: 10111111 \277 191\n21: 10111101 \275 189\n22: 00000001 \001 1\n23: 00000001 \001 1\n24: 01100100 d 100\n", qoS34, true);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000d\000\001\001d" + "'", str31, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
        org.meqantt.message.Message.Header header2 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.Message.Type type3 = header2.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header2);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage("MQIsdp", "\000d\000\001\001d");
        java.lang.String str8 = publishMessage7.getDataAsString();
        byte[] byteArray9 = publishMessage7.getData();
        org.meqantt.message.QoS qoS10 = publishMessage7.getQos();
        subAckMessage4.addQoS(qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS10);
        org.junit.Assert.assertNull(type3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d" + "'", str8, "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", false, (int) (short) 100);
        connectMessage3.setCredentials("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", "00: 00000000 \000 0\n01: 00000110 \006 6\n02: 01001101 M 77\n03: 01010001 Q 81\n04: 01001001 I 73\n05: 01110011 s 115\n06: 01100100 d 100\n07: 01110000 p 112\n");
        java.lang.String str7 = connectMessage3.getUsername();
        connectMessage3.setWill("00: 00110000 0 48\n01: 00010010 \022 18\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000000 \000 0\n11: 00001000 \b 8\n12: 11000000 \300 192\n13: 10000000 \200 128\n14: 01100100 d 100\n15: 11000000 \300 192\n16: 10000000 \200 128\n17: 00000001 \001 1\n18: 00000001 \001 1\n19: 01100100 d 100\n", "\020\ufffd\001\000\006MQIsdp\003\ufffd\000d\000\006MQIsdp\000\000\000\006MQIsdp\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]\000\ufffd\ufffd?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        connectMessage3.setCredentials("\001\003\003\001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str7, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PubRecMessage pubRecMessage9 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type13 = subscribeMessage12.getType();
        subscribeMessage12.setDup(false);
        subscribeMessage12.setMessageId((int) (short) 0);
        java.util.List<org.meqantt.message.QoS> qoSList18 = subscribeMessage12.getTopicQoSs();
        int int19 = subscribeMessage12.getMessageId();
        org.meqantt.message.Message.Header header23 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage24 = new org.meqantt.message.PingReqMessage(header23);
        org.meqantt.message.PubCompMessage pubCompMessage25 = new org.meqantt.message.PubCompMessage(header23);
        org.meqantt.message.SubAckMessage subAckMessage26 = new org.meqantt.message.SubAckMessage(header23);
        org.meqantt.message.SubAckMessage subAckMessage27 = new org.meqantt.message.SubAckMessage(header23);
        org.meqantt.message.PubCompMessage pubCompMessage28 = new org.meqantt.message.PubCompMessage(header23);
        org.meqantt.message.SubAckMessage subAckMessage29 = new org.meqantt.message.SubAckMessage(header23);
        org.meqantt.message.UnsubAckMessage unsubAckMessage30 = new org.meqantt.message.UnsubAckMessage(header23);
        org.meqantt.message.PingRespMessage pingRespMessage31 = new org.meqantt.message.PingRespMessage(header23);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage32 = new org.meqantt.message.UnsubscribeMessage(header23);
        boolean boolean33 = unsubscribeMessage32.isDup();
        java.util.List<java.lang.String> strList34 = unsubscribeMessage32.getTopics();
        unsubscribeMessage32.addTopic("\000d\000\001\001d");
        byte[] byteArray40 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str41 = org.meqantt.util.FormatUtil.toString(byteArray40);
        org.meqantt.message.PublishMessage publishMessage42 = new org.meqantt.message.PublishMessage("hi!", byteArray40);
        org.meqantt.message.Message.Header header44 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage45 = new org.meqantt.message.PingReqMessage(header44);
        org.meqantt.message.PubCompMessage pubCompMessage46 = new org.meqantt.message.PubCompMessage(header44);
        org.meqantt.message.PubAckMessage pubAckMessage47 = new org.meqantt.message.PubAckMessage(header44);
        org.meqantt.message.PublishMessage publishMessage48 = new org.meqantt.message.PublishMessage(header44);
        org.meqantt.message.ConnAckMessage connAckMessage49 = new org.meqantt.message.ConnAckMessage(header44);
        org.meqantt.message.SubAckMessage subAckMessage50 = new org.meqantt.message.SubAckMessage(header44);
        org.meqantt.message.Message.Header header52 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type53 = header52.getType();
        org.meqantt.message.Message.Type type54 = header52.getType();
        org.meqantt.message.SubAckMessage subAckMessage55 = new org.meqantt.message.SubAckMessage(header52);
        org.meqantt.message.PingReqMessage pingReqMessage56 = new org.meqantt.message.PingReqMessage(header52);
        org.meqantt.message.SubscribeMessage subscribeMessage57 = new org.meqantt.message.SubscribeMessage(header52);
        org.meqantt.message.ConnectMessage connectMessage58 = new org.meqantt.message.ConnectMessage(header52);
        org.meqantt.message.PingReqMessage pingReqMessage59 = new org.meqantt.message.PingReqMessage(header52);
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage(header52);
        java.util.List<java.lang.String> strList61 = subscribeMessage60.getTopics();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage63 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList64 = unsubscribeMessage63.getTopics();
        org.meqantt.message.Message.Type type65 = unsubscribeMessage63.getType();
        java.util.List<java.lang.String> strList66 = unsubscribeMessage63.getTopics();
        org.meqantt.message.QoS qoS67 = unsubscribeMessage63.getQos();
        subscribeMessage60.setQos(qoS67);
        subAckMessage50.addQoS(qoS67);
        publishMessage42.setQos(qoS67);
        org.meqantt.message.SubscribeMessage subscribeMessage71 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS67);
        unsubscribeMessage32.setQos(qoS67);
        org.meqantt.message.SubscribeMessage subscribeMessage73 = new org.meqantt.message.SubscribeMessage("\000\004\001\003\003\001", qoS67);
        subscribeMessage12.addTopic("\000\023\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\001d", qoS67);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage11.setQos(qoS67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type13.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(qoSList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(type53);
        org.junit.Assert.assertNull(type54);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + type65 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type65.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + qoS67 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS67.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage9 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage10 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header1);
        boolean boolean13 = pingReqMessage12.isDup();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus6 = connAckMessage5.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus7 = connAckMessage5.getStatus();
        org.junit.Assert.assertNull(connectionStatus6);
        org.junit.Assert.assertNull(connectionStatus7);
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
        java.util.List<java.lang.String> strList5 = unsubscribeMessage1.getTopics();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.write(outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header7 = null;
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header7);
        java.lang.String str9 = connectMessage8.getClientId();
        boolean boolean10 = connectMessage8.isCleanSession();
        java.lang.String str11 = connectMessage8.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList15 = subAckMessage14.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList16 = subAckMessage14.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList17 = subAckMessage14.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str26 = connectMessage25.getProtocolId();
        org.meqantt.message.QoS qoS27 = connectMessage25.getQos();
        subscribeMessage18.addTopic("", qoS27);
        subAckMessage14.addQoS(qoS27);
        org.meqantt.message.SubAckMessage subAckMessage30 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList31 = subAckMessage30.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList32 = subAckMessage30.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage36 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str37 = connectMessage36.getProtocolId();
        org.meqantt.message.QoS qoS38 = connectMessage36.getQos();
        subAckMessage30.addQoS(qoS38);
        byte[] byteArray40 = subAckMessage30.toBytes();
        org.meqantt.message.ConnectMessage connectMessage45 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str46 = connectMessage45.getUsername();
        org.meqantt.message.QoS qoS50 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("", qoS50);
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList54 = subscribeMessage53.getTopics();
        org.meqantt.message.QoS qoS55 = subscribeMessage53.getQos();
        subscribeMessage51.addTopic("", qoS55);
        connectMessage45.setWill("", "\000d\000\001\001d", qoS55, true);
        boolean boolean59 = connectMessage45.isCleanSession();
        java.lang.String str60 = connectMessage45.getClientId();
        java.lang.String str61 = connectMessage45.getPassword();
        java.lang.String str62 = connectMessage45.getWill();
        byte[] byteArray63 = connectMessage45.toBytes();
        org.meqantt.message.PublishMessage publishMessage64 = new org.meqantt.message.PublishMessage("\000\003hi!", byteArray63);
        org.meqantt.message.QoS qoS65 = publishMessage64.getQos();
        subAckMessage30.addQoS(qoS65);
        subAckMessage14.addQoS(qoS65);
        connectMessage8.setWill("Header [type=null, retain=true, qos=AT_LEAST_ONCE, dup=false]", "\000\000", qoS65, false);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage6.setQos(qoS65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MQIsdp" + "'", str11, "MQIsdp");
        org.junit.Assert.assertNull(qoSList15);
        org.junit.Assert.assertNull(qoSList16);
        org.junit.Assert.assertNull(qoSList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MQIsdp" + "'", str26, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList31);
        org.junit.Assert.assertNull(qoSList32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MQIsdp" + "'", str37, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-112, 3, 0, 0, 0]");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\000d\000\001\001d" + "'", str62, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS65 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS65.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00000011 \003 3\n01: 00000000 \000 0\n", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.hasWill();
        connectMessage1.setCredentials("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "");
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header11);
        boolean boolean13 = connectMessage12.isWillRetained();
        boolean boolean14 = connectMessage12.isWillRetained();
        java.lang.String str15 = connectMessage12.getUsername();
        boolean boolean16 = connectMessage12.isCleanSession();
        java.lang.String str17 = connectMessage12.getWill();
        boolean boolean18 = connectMessage12.hasUsername();
        java.lang.String str19 = connectMessage12.getProtocolId();
        org.meqantt.message.Message.Header header22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage(header22);
        org.meqantt.message.QoS qoS25 = null;
        subscribeMessage23.addTopic("hi!", qoS25);
        java.util.List<org.meqantt.message.QoS> qoSList27 = subscribeMessage23.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage33 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str34 = connectMessage33.getUsername();
        org.meqantt.message.QoS qoS38 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.QoS qoS43 = subscribeMessage41.getQos();
        subscribeMessage39.addTopic("", qoS43);
        connectMessage33.setWill("", "\000d\000\001\001d", qoS43, true);
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage("hi!", qoS43);
        subscribeMessage23.addTopic("\000d\000\001\001d", qoS43);
        connectMessage12.setWill("\000d\000\001\001d", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS43, false);
        boolean boolean51 = connectMessage12.isCleanSession();
        int int52 = connectMessage12.getKeepAlive();
        org.meqantt.message.QoS qoS53 = connectMessage12.getWillQoS();
        connectMessage1.setWill("\000\006\ufffd\ufffd\003hi!", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS53, true);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertNotNull(qoSList27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage10 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage(header1);
        boolean boolean12 = pubRelMessage11.isDup();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage();
        java.lang.String str10 = connectMessage9.getProtocolId();
        java.lang.String str11 = connectMessage9.getClientId();
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
        connectMessage9.setWill("\000d\000\001\001d", "hi!", qoS60, true);
        org.meqantt.message.SubscribeMessage subscribeMessage68 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS60);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setQos(qoS60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertNull(str11);
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
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
        java.lang.String str3 = publishMessage2.getDataAsString();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd00: 00010000 \020 16\n01: 00011010 \032 26\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n19: 00001000 \b 8\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n22: 01100100 d 100\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n" + "'", str3, "\001\ufffd00: 00010000 \020 16\n01: 00011010 \032 26\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n19: 00001000 \b 8\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n22: 01100100 d 100\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
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
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean13 = connectMessage12.hasPassword();
        byte byte14 = connectMessage12.getProtocolVersion();
        connectMessage12.setCredentials("");
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 3 + "'", byte14 == (byte) 3);
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage6 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage7 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header9 = null;
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header9);
        connectMessage10.setCredentials("");
        connectMessage10.setCredentials("hi!", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.message.QoS qoS16 = connectMessage10.getWillQoS();
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
        connectMessage10.setWill("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS30, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage8.setQos(qoS30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoS16);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 3 + "'", byte22 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
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
        java.util.List<org.meqantt.message.QoS> qoSList27 = subscribeMessage26.getTopicQoSs();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList27);
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage7 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage11 = new org.meqantt.message.DisconnectMessage(header1);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type5.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
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
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
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
        org.meqantt.message.UnsubAckMessage unsubAckMessage11 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type13 = subscribeMessage12.getType();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        subscribeMessage12.addTopic("MQIsdp", qoS21);
        subscribeMessage12.setMessageId(2);
        org.meqantt.message.Message.Header header27 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str28 = header27.toString();
        org.meqantt.message.SubAckMessage subAckMessage29 = new org.meqantt.message.SubAckMessage(header27);
        org.meqantt.message.PublishMessage publishMessage30 = new org.meqantt.message.PublishMessage(header27);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage33 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS34 = unsubscribeMessage33.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("", qoS34);
        publishMessage30.setQos(qoS34);
        subscribeMessage12.setQos(qoS34);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage11.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type13.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str28, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage5 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PubRecMessage pubRecMessage9 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage9.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        byte[] byteArray2 = org.meqantt.util.FormatUtil.toMQttString("\000\004\001\003\003\001");
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdD00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", byteArray2);
        java.lang.String str4 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 7, -64, -128, 4, 1, 3, 3, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00: 00000000 \000 0\n01: 00000111 \007 7\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 00000100 \004 4\n05: 00000001 \001 1\n06: 00000011 \003 3\n07: 00000011 \003 3\n08: 00000001 \001 1\n" + "'", str4, "00: 00000000 \000 0\n01: 00000111 \007 7\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 00000100 \004 4\n05: 00000001 \001 1\n06: 00000011 \003 3\n07: 00000011 \003 3\n08: 00000001 \001 1\n");
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS15);
        org.meqantt.message.QoS qoS18 = subscribeMessage17.getQos();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("\000\000", false, (int) (short) -1);
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
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage("", qoS44);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS44);
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS44);
        connectMessage23.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS44, false);
        subscribeMessage17.addTopic("00: 01100100 d 100\n01: 00000000 \000 0\n", qoS44);
        org.meqantt.message.QoS qoS56 = subscribeMessage17.getQos();
        subscribeMessage9.addTopic("\000\006\ufffd\ufffd\003hi!", qoS56);
        org.meqantt.message.Message.Header header59 = null;
        org.meqantt.message.ConnectMessage connectMessage60 = new org.meqantt.message.ConnectMessage(header59);
        int int61 = connectMessage60.getKeepAlive();
        connectMessage60.setWill("MQIsdp", "");
        java.lang.String str65 = connectMessage60.getPassword();
        java.lang.String str66 = connectMessage60.getUsername();
        byte byte67 = connectMessage60.getProtocolVersion();
        org.meqantt.message.QoS qoS68 = connectMessage60.getWillQoS();
        subscribeMessage9.addTopic("00: 10100010 \242 162\n01: 00010111 \027 23\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00010011 \023 19\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 00001000 \b 8\n09: 11101111 \357 239\n10: 10111111 \277 191\n11: 10111101 \275 189\n12: 11101111 \357 239\n13: 10111111 \277 191\n14: 10111101 \275 189\n15: 01100100 d 100\n16: 11101111 \357 239\n17: 10111111 \277 191\n18: 10111101 \275 189\n19: 11101111 \357 239\n20: 10111111 \277 191\n21: 10111101 \275 189\n22: 00000001 \001 1\n23: 00000001 \001 1\n24: 01100100 d 100\n", qoS68);
        java.util.List<java.lang.String> strList70 = subscribeMessage9.getTopics();
        subscribeMessage9.setDup(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS56 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS56.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 3 + "'", byte67 == (byte) 3);
        org.junit.Assert.assertTrue("'" + qoS68 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS68.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList70);
    }

    @Test
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        boolean boolean6 = subscribeMessage5.isDup();
        java.util.List<java.lang.String> strList7 = subscribeMessage5.getTopics();
        int int8 = subscribeMessage5.getMessageId();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test17597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17597");
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
        connectMessage3.setCredentials("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        connectMessage3.setCredentials("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        boolean boolean67 = connectMessage3.hasWill();
        java.lang.String str68 = connectMessage3.getWillTopic();
        java.lang.String str69 = connectMessage3.getWillTopic();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test17598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17598");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage5 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17599");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void test17600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17600");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", true, 1);
        boolean boolean4 = connectMessage3.isCleanSession();
        byte byte5 = connectMessage3.getProtocolVersion();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
    }

    @Test
    public void test17601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17601");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.ConnAckMessage connAckMessage11 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage11.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str10, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test17602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17602");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
    }

    @Test
    public void test17603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17603");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage4.setMessageId((int) ' ');
        unsubscribeMessage4.addTopic("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n");
    }

    @Test
    public void test17604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17604");
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
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage14 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage15 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage16 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage16.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17605");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17606");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\000\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\001d", "00: 10100010 \242 162\n01: 00101000 ( 40\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00100100 $ 36\n06: 00110000 0 48\n07: 00110000 0 48\n08: 00111010 : 58\n09: 00100000   32\n10: 00110000 0 48\n11: 00110000 0 48\n12: 00110000 0 48\n13: 00110000 0 48\n14: 00110000 0 48\n15: 00110000 0 48\n16: 00110000 0 48\n17: 00110000 0 48\n18: 00100000   32\n19: 11000000 \300 192\n20: 10000000 \200 128\n21: 00100000   32\n22: 00110000 0 48\n23: 00001010 \n 10\n24: 00110000 0 48\n25: 00110001 1 49\n26: 00111010 : 58\n27: 00100000   32\n28: 00110000 0 48\n29: 00110000 0 48\n30: 00110000 0 48\n31: 00110000 0 48\n32: 00110000 0 48\n33: 00110000 0 48\n34: 00110000 0 48\n35: 00110000 0 48\n36: 00100000   32\n37: 11000000 \300 192\n38: 10000000 \200 128\n39: 00100000   32\n40: 00110000 0 48\n41: 00001010 \n 10\n");
    }

    @Test
    public void test17607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17607");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17608");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        java.lang.String str4 = connectMessage3.getClientId();
        connectMessage3.setWill("hi!", "");
        boolean boolean8 = connectMessage3.isCleanSession();
        boolean boolean9 = connectMessage3.isCleanSession();
        java.lang.String str10 = connectMessage3.getWillTopic();
        byte byte11 = connectMessage3.getProtocolVersion();
        connectMessage3.setCredentials("\000\003hi!", "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        boolean boolean15 = connectMessage3.isCleanSession();
        boolean boolean16 = connectMessage3.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 3 + "'", byte11 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17609");
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type2 = subscribeMessage1.getType();
        org.meqantt.message.QoS qoS5 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        subscribeMessage6.addTopic("", qoS10);
        subscribeMessage1.addTopic("MQIsdp", qoS10);
        subscribeMessage1.setDup(false);
        byte[] byteArray15 = subscribeMessage1.toBytes();
        java.lang.String str16 = org.meqantt.util.FormatUtil.toString(byteArray15);
        java.lang.String str17 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray15);
        java.lang.String str18 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray15);
        org.meqantt.message.PublishMessage publishMessage19 = new org.meqantt.message.PublishMessage("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", byteArray15);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type2.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-128, 11, 0, 0, 0, 6, 77, 81, 73, 115, 100, 112, 0]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "00: 10000000 \200 128\n01: 00001011 \013 11\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000110 \006 6\n06: 01001101 M 77\n07: 01010001 Q 81\n08: 01001001 I 73\n09: 01110011 s 115\n10: 01100100 d 100\n11: 01110000 p 112\n12: 00000000 \000 0\n" + "'", str17, "00: 10000000 \200 128\n01: 00001011 \013 11\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000110 \006 6\n06: 01001101 M 77\n07: 01010001 Q 81\n08: 01001001 I 73\n09: 01110011 s 115\n10: 01100100 d 100\n11: 01110000 p 112\n12: 00000000 \000 0\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00: 10000000 \200 128\n01: 00001011 \013 11\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000110 \006 6\n06: 01001101 M 77\n07: 01010001 Q 81\n08: 01001001 I 73\n09: 01110011 s 115\n10: 01100100 d 100\n11: 01110000 p 112\n12: 00000000 \000 0\n" + "'", str18, "00: 10000000 \200 128\n01: 00001011 \013 11\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000110 \006 6\n06: 01001101 M 77\n07: 01010001 Q 81\n08: 01001001 I 73\n09: 01110011 s 115\n10: 01100100 d 100\n11: 01110000 p 112\n12: 00000000 \000 0\n");
    }

    @Test
    public void test17610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17610");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage7 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage9.getGrantedQoSs();
        org.meqantt.message.Message.Header header14 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type15 = header14.getType();
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage(header14);
        org.meqantt.message.Message.Header header18 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str19 = header18.toString();
        org.meqantt.message.SubAckMessage subAckMessage20 = new org.meqantt.message.SubAckMessage(header18);
        org.meqantt.message.PublishMessage publishMessage21 = new org.meqantt.message.PublishMessage(header18);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage24 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS25 = unsubscribeMessage24.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("", qoS25);
        publishMessage21.setQos(qoS25);
        subAckMessage16.addQoS(qoS25);
        subAckMessage9.addQoS(qoS25);
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        org.meqantt.message.QoS qoS34 = null;
        subscribeMessage30.addTopic("", qoS34);
        java.util.List<org.meqantt.message.QoS> qoSList36 = subscribeMessage30.getTopicQoSs();
        subscribeMessage30.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList39 = subscribeMessage30.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage47 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str48 = connectMessage47.getUsername();
        org.meqantt.message.QoS qoS52 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage("", qoS52);
        org.meqantt.message.SubscribeMessage subscribeMessage55 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList56 = subscribeMessage55.getTopics();
        org.meqantt.message.QoS qoS57 = subscribeMessage55.getQos();
        subscribeMessage53.addTopic("", qoS57);
        connectMessage47.setWill("", "\000d\000\001\001d", qoS57, true);
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage("hi!", qoS57);
        org.meqantt.message.SubscribeMessage subscribeMessage62 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS57);
        org.meqantt.message.SubscribeMessage subscribeMessage63 = new org.meqantt.message.SubscribeMessage("", qoS57);
        subscribeMessage30.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS57);
        subAckMessage9.addQoS(qoS57);
        org.meqantt.message.QoS qoS66 = subAckMessage9.getQos();
        org.meqantt.message.QoS qoS67 = subAckMessage9.getQos();
        org.meqantt.message.Message.Header header69 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type70 = header69.getType();
        org.meqantt.message.Message.Type type71 = header69.getType();
        org.meqantt.message.SubAckMessage subAckMessage72 = new org.meqantt.message.SubAckMessage(header69);
        org.meqantt.message.PingReqMessage pingReqMessage73 = new org.meqantt.message.PingReqMessage(header69);
        org.meqantt.message.PingReqMessage pingReqMessage74 = new org.meqantt.message.PingReqMessage(header69);
        org.meqantt.message.DisconnectMessage disconnectMessage75 = new org.meqantt.message.DisconnectMessage(header69);
        org.meqantt.message.SubAckMessage subAckMessage76 = new org.meqantt.message.SubAckMessage(header69);
        java.util.List<org.meqantt.message.QoS> qoSList77 = subAckMessage76.getGrantedQoSs();
        org.meqantt.message.SubAckMessage subAckMessage78 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList79 = subAckMessage78.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList80 = subAckMessage78.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList81 = subAckMessage78.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage83 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList84 = subscribeMessage83.getTopics();
        org.meqantt.message.QoS qoS85 = subscribeMessage83.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage86 = new org.meqantt.message.SubscribeMessage("", qoS85);
        subAckMessage78.addQoS(qoS85);
        subAckMessage76.addQoS(qoS85);
        subAckMessage9.addQoS(qoS85);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setQos(qoS85);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type15.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str19, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList36);
        org.junit.Assert.assertNotNull(qoSList39);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + qoS57 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS57.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS66 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS66.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS67 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS67.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(type70);
        org.junit.Assert.assertNull(type71);
        org.junit.Assert.assertNull(qoSList77);
        org.junit.Assert.assertNull(qoSList79);
        org.junit.Assert.assertNull(qoSList80);
        org.junit.Assert.assertNull(qoSList81);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertTrue("'" + qoS85 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS85.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17611");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage12 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        unsubscribeMessage12.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList16 = subAckMessage15.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList17 = subAckMessage15.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList18 = subAckMessage15.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        subAckMessage15.addQoS(qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str32 = connectMessage31.getProtocolId();
        org.meqantt.message.QoS qoS33 = connectMessage31.getQos();
        subscribeMessage25.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS33);
        subAckMessage15.addQoS(qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList40 = subscribeMessage39.getTopics();
        org.meqantt.message.QoS qoS41 = subscribeMessage39.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("", qoS41);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS41);
        org.meqantt.message.QoS qoS44 = subscribeMessage43.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList49 = subscribeMessage48.getTopics();
        org.meqantt.message.QoS qoS50 = subscribeMessage48.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("", qoS50);
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS50);
        org.meqantt.message.QoS qoS53 = subscribeMessage52.getQos();
        subscribeMessage43.addTopic("", qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage55 = new org.meqantt.message.SubscribeMessage("", qoS53);
        subAckMessage15.addQoS(qoS53);
        unsubscribeMessage12.setQos(qoS53);
        unsubscribeMessage10.setQos(qoS53);
        java.util.List<java.lang.String> strList59 = unsubscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS60 = unsubscribeMessage10.getQos();
        subscribeMessage8.setQos(qoS60);
        java.util.List<org.meqantt.message.QoS> qoSList62 = subscribeMessage8.getTopicQoSs();
        java.util.List<java.lang.String> strList63 = subscribeMessage8.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList64 = subscribeMessage8.getTopicQoSs();
        org.junit.Assert.assertNull(qoSList16);
        org.junit.Assert.assertNull(qoSList17);
        org.junit.Assert.assertNull(qoSList18);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MQIsdp" + "'", str32, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + qoS50 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS50.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertTrue("'" + qoS60 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS60.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(qoSList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(qoSList64);
    }

    @Test
    public void test17612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17612");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage7 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage8 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage9 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage10 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage11 = new org.meqantt.message.PingRespMessage(header1);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type5.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17613");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17614");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\020\032\000\006MQIsdp\003&\000\001\000\000\000\000\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", "00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n");
    }

    @Test
    public void test17615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17615");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        connectMessage8.setWill("\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "\000\000");
        org.meqantt.message.QoS qoS12 = connectMessage8.getWillQoS();
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17616");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test17617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17617");
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
        java.lang.String str13 = header1.toString();
        java.lang.String str14 = header1.toString();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage16 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage17 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage18 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage19 = new org.meqantt.message.PubRelMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str13, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str14, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17618");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage8 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage9 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage12 = new org.meqantt.message.UnsubAckMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17619");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 10100010 \242 162\n01: 00101000 ( 40\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00100100 $ 36\n06: 00110000 0 48\n07: 00110000 0 48\n08: 00111010 : 58\n09: 00100000   32\n10: 00110000 0 48\n11: 00110000 0 48\n12: 00110000 0 48\n13: 00110000 0 48\n14: 00110000 0 48\n15: 00110000 0 48\n16: 00110000 0 48\n17: 00110000 0 48\n18: 00100000   32\n19: 11000000 \300 192\n20: 10000000 \200 128\n21: 00100000   32\n22: 00110000 0 48\n23: 00001010 \n 10\n24: 00110000 0 48\n25: 00110001 1 49\n26: 00111010 : 58\n27: 00100000   32\n28: 00110000 0 48\n29: 00110000 0 48\n30: 00110000 0 48\n31: 00110000 0 48\n32: 00110000 0 48\n33: 00110000 0 48\n34: 00110000 0 48\n35: 00110000 0 48\n36: 00100000   32\n37: 11000000 \300 192\n38: 10000000 \200 128\n39: 00100000   32\n40: 00110000 0 48\n41: 00001010 \n 10\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 00010000 ? 16?01: 00011010 ? 26?02: 00000000 ? 0?03: 00000110 ? 6?04: 01001101 M 77?05: 01010001 Q 81?06: 01001001 I 73?07: 01110011 s 115?08: 01100100 d 100?09: 01110000 p 112?10: 00000011 ? 3?11: 00100110 & 38?12: 00000000 ? 0?13: 00000001 ? 1?14: 00000000 ? 0?15: 00000000 ? 0?16: 00000000 ? 0?17: 00000000 ? 0?18: 00000000 ? 0?19: 00001000 ? 8?20: 11000000 A? 192?21: 10000000 ? 128?22: 01100100 d 100?23: 11000000 A? 192?24: 10000000 ? 128?25: 00000001 ? 1?26: 00000001 ? 1?27: 01100100 d 100?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17620");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        byte byte10 = connectMessage1.getProtocolVersion();
        boolean boolean11 = connectMessage1.hasPassword();
        java.lang.String str12 = connectMessage1.getUsername();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 3 + "'", byte10 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17621");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        java.lang.String str3 = publishMessage2.getTopic();
        byte[] byteArray4 = publishMessage2.toBytes();
        java.lang.String str5 = publishMessage2.getDataAsString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[48, -123, 1, 0, 61, 72, 101, 97, 100, 101, 114, 32, 91, 116, 121, 112, 101, 61, 110, 117, 108, 108, 44, 32, 114, 101, 116, 97, 105, 110, 61, 102, 97, 108, 115, 101, 44, 32, 113, 111, 115, 61, 65, 84, 95, 77, 79, 83, 84, 95, 79, 78, 67, 69, 44, 32, 100, 117, 112, 61, 102, 97, 108, 115, 101, 93, 0, 68, 48, 48, 58, 32, 48, 48, 48, 48, 48, 48, 48, 49, 32, 1, 32, 49, 10, 48, 49, 58, 32, 48, 48, 48, 48, 48, 48, 49, 49, 32, 3, 32, 51, 10, 48, 50, 58, 32, 48, 48, 48, 48, 48, 48, 49, 49, 32, 3, 32, 51, 10, 48, 51, 58, 32, 48, 48, 48, 48, 48, 48, 48, 49, 32, 1, 32, 49, 10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str5, "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test17622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17622");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage2 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage2.addTopic("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        unsubscribeMessage2.addTopic("");
        int int7 = unsubscribeMessage2.getMessageId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test17623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17623");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage9 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage10 = new org.meqantt.message.PingRespMessage(header1);
    }

    @Test
    public void test17624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17624");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(19);
    }

    @Test
    public void test17625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17625");
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
        org.meqantt.message.UnsubAckMessage unsubAckMessage11 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage12 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage13 = new org.meqantt.message.PubRelMessage(header1);
        java.lang.String str14 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage15 = new org.meqantt.message.PublishMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str14, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17626");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage(header1);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(connectionStatus11);
    }

    @Test
    public void test17627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17627");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 10);
        boolean boolean4 = connectMessage3.hasPassword();
        int int5 = connectMessage3.getKeepAlive();
        java.lang.String str6 = connectMessage3.getPassword();
        java.lang.String str7 = connectMessage3.getWillTopic();
        java.lang.String str8 = connectMessage3.getUsername();
        boolean boolean9 = connectMessage3.isWillRetained();
        connectMessage3.setCredentials("00: 01100000 ` 96\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 01100100 d 100\n", "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.meqantt.message.QoS qoS13 = connectMessage3.getWillQoS();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(qoS13);
    }

    @Test
    public void test17628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17628");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", true, (int) (byte) 3);
        java.lang.String str4 = connectMessage3.getWill();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test17629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17629");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasUsername();
        boolean boolean5 = connectMessage3.hasUsername();
        boolean boolean6 = connectMessage3.hasWill();
        org.meqantt.message.Message.Type type7 = connectMessage3.getType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.meqantt.message.Message.Type.CONNECT + "'", type7.equals(org.meqantt.message.Message.Type.CONNECT));
    }

    @Test
    public void test17630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17630");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        java.lang.String str6 = header1.toString();
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage8 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage9.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17631");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage9 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Header header12 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage13 = new org.meqantt.message.PubAckMessage(header12);
        org.meqantt.message.UnsubAckMessage unsubAckMessage14 = new org.meqantt.message.UnsubAckMessage(header12);
        org.meqantt.message.Message.Type type15 = header12.getType();
        org.meqantt.message.Message.Type type16 = header12.getType();
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage(header12);
        int int18 = subAckMessage17.getMessageId();
        org.meqantt.message.PublishMessage publishMessage21 = new org.meqantt.message.PublishMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        byte[] byteArray22 = publishMessage21.getData();
        byte[] byteArray23 = publishMessage21.getData();
        org.meqantt.message.QoS qoS24 = publishMessage21.getQos();
        subAckMessage17.addQoS(qoS24);
        subAckMessage10.addQoS(qoS24);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 61, 72, 101, 97, 100, 101, 114, 32, 91, 116, 121, 112, 101, 61, 110, 117, 108, 108, 44, 32, 114, 101, 116, 97, 105, 110, 61, 102, 97, 108, 115, 101, 44, 32, 113, 111, 115, 61, 65, 84, 95, 76, 69, 65, 83, 84, 95, 79, 78, 67, 69, 44, 32, 100, 117, 112, 61, 116, 114, 117, 101, 93]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 61, 72, 101, 97, 100, 101, 114, 32, 91, 116, 121, 112, 101, 61, 110, 117, 108, 108, 44, 32, 114, 101, 116, 97, 105, 110, 61, 102, 97, 108, 115, 101, 44, 32, 113, 111, 115, 61, 65, 84, 95, 76, 69, 65, 83, 84, 95, 79, 78, 67, 69, 44, 32, 100, 117, 112, 61, 116, 114, 117, 101, 93]");
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17632");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\000", true, 1);
        boolean boolean4 = connectMessage3.isDup();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test17633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17633");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("00: 00110000 0 48\n01: 00010010 \022 18\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000000 \000 0\n11: 00001000 \b 8\n12: 11000000 \300 192\n13: 10000000 \200 128\n14: 01100100 d 100\n15: 11000000 \300 192\n16: 10000000 \200 128\n17: 00000001 \001 1\n18: 00000001 \001 1\n19: 01100100 d 100\n");
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header3);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header3);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header3);
        java.lang.String str8 = header3.toString();
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header3);
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
        org.meqantt.message.SubAckMessage subAckMessage40 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList41 = subAckMessage40.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList42 = subAckMessage40.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList43 = subAckMessage40.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList46 = subscribeMessage45.getTopics();
        org.meqantt.message.QoS qoS47 = subscribeMessage45.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage("", qoS47);
        subAckMessage40.addQoS(qoS47);
        connectMessage14.setWill("hi!", "MQIsdp", qoS47, true);
        connectMessage14.setCredentials("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "hi!");
        org.meqantt.message.QoS qoS55 = connectMessage14.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage("\001\003\003\001", qoS55);
        subAckMessage9.addQoS(qoS55);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList41);
        org.junit.Assert.assertNull(qoSList42);
        org.junit.Assert.assertNull(qoSList43);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17634");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        boolean boolean4 = connectMessage2.hasUsername();
        java.lang.String str5 = connectMessage2.getWill();
        boolean boolean6 = connectMessage2.isRetained();
        connectMessage2.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        boolean boolean9 = connectMessage2.hasUsername();
        boolean boolean10 = connectMessage2.isWillRetained();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17635");
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
        java.util.List<org.meqantt.message.QoS> qoSList37 = subscribeMessage24.getTopicQoSs();
        org.meqantt.message.Message.Type type38 = subscribeMessage24.getType();
        java.util.List<org.meqantt.message.QoS> qoSList39 = subscribeMessage24.getTopicQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.QoS qoS43 = subscribeMessage41.getQos();
        java.util.List<org.meqantt.message.QoS> qoSList44 = subscribeMessage41.getTopicQoSs();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage46 = new org.meqantt.message.UnsubscribeMessage("hi!");
        unsubscribeMessage46.setDup(false);
        org.meqantt.message.Message.Header header50 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type51 = header50.getType();
        org.meqantt.message.Message.Type type52 = header50.getType();
        org.meqantt.message.SubAckMessage subAckMessage53 = new org.meqantt.message.SubAckMessage(header50);
        org.meqantt.message.PingReqMessage pingReqMessage54 = new org.meqantt.message.PingReqMessage(header50);
        org.meqantt.message.PingReqMessage pingReqMessage55 = new org.meqantt.message.PingReqMessage(header50);
        org.meqantt.message.DisconnectMessage disconnectMessage56 = new org.meqantt.message.DisconnectMessage(header50);
        org.meqantt.message.SubAckMessage subAckMessage57 = new org.meqantt.message.SubAckMessage(header50);
        org.meqantt.message.UnsubAckMessage unsubAckMessage58 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS59 = unsubAckMessage58.getQos();
        subAckMessage57.addQoS(qoS59);
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type62 = subscribeMessage61.getType();
        subscribeMessage61.setDup(false);
        subscribeMessage61.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList67 = subscribeMessage61.getTopics();
        org.meqantt.message.SubscribeMessage subscribeMessage68 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList69 = subscribeMessage68.getTopics();
        org.meqantt.message.QoS qoS70 = subscribeMessage68.getQos();
        org.meqantt.message.ConnectMessage connectMessage75 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str76 = connectMessage75.getProtocolId();
        org.meqantt.message.QoS qoS77 = connectMessage75.getQos();
        subscribeMessage68.addTopic("", qoS77);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage80 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList81 = unsubscribeMessage80.getTopics();
        org.meqantt.message.Message.Type type82 = unsubscribeMessage80.getType();
        java.util.List<java.lang.String> strList83 = unsubscribeMessage80.getTopics();
        org.meqantt.message.QoS qoS84 = unsubscribeMessage80.getQos();
        subscribeMessage68.setQos(qoS84);
        subscribeMessage61.setQos(qoS84);
        subAckMessage57.addQoS(qoS84);
        unsubscribeMessage46.setQos(qoS84);
        subscribeMessage41.setQos(qoS84);
        subscribeMessage24.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS84);
        subscribeMessage24.setDup(false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "MQIsdp" + "'", str33, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList37);
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type38.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(qoSList39);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList44);
        org.junit.Assert.assertNull(type51);
        org.junit.Assert.assertNull(type52);
        org.junit.Assert.assertTrue("'" + qoS59 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS59.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type62.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + qoS70 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS70.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "MQIsdp" + "'", str76, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS77 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS77.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertTrue("'" + type82 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type82.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + qoS84 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS84.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17636");
        byte[] byteArray1 = null;
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_LEAST_ONCE, dup=false]", byteArray1);
        int int3 = publishMessage2.getMessageId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test17637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17637");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        boolean boolean7 = connectMessage1.hasWill();
        org.meqantt.message.QoS qoS8 = connectMessage1.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17638");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("0\b\000\000\000d\000\001\001d", "00: 00100000   32\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00000010 \002 2\n");
    }

    @Test
    public void test17639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17639");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        java.lang.String str7 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str7, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test17640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17640");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage10.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test17641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17641");
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
        org.meqantt.message.SubscribeMessage subscribeMessage87 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS75);
        java.util.List<org.meqantt.message.QoS> qoSList88 = subscribeMessage87.getTopicQoSs();
        java.util.List<java.lang.String> strList89 = subscribeMessage87.getTopics();
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
        org.junit.Assert.assertNotNull(qoSList88);
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test17642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17642");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus5 = connAckMessage4.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(connectionStatus5);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(connectionStatus5);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus8 = connAckMessage7.getStatus();
        boolean boolean9 = connAckMessage7.isDup();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus10 = connAckMessage7.getStatus();
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD));
        org.junit.Assert.assertTrue("'" + connectionStatus5 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD + "'", connectionStatus5.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD));
        org.junit.Assert.assertTrue("'" + connectionStatus8 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD + "'", connectionStatus8.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + connectionStatus10 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD + "'", connectionStatus10.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD));
    }

    @Test
    public void test17643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17643");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage9 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage11 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header12 = null;
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage(header12);
        boolean boolean14 = connectMessage13.isWillRetained();
        boolean boolean15 = connectMessage13.isWillRetained();
        java.lang.String str16 = connectMessage13.getUsername();
        boolean boolean17 = connectMessage13.isCleanSession();
        java.lang.String str18 = connectMessage13.getWill();
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean25 = connectMessage24.hasWill();
        java.lang.String str26 = connectMessage24.getWill();
        java.lang.String str27 = connectMessage24.getWill();
        java.lang.String str28 = connectMessage24.getProtocolId();
        java.lang.String str29 = connectMessage24.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage32 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList33 = subAckMessage32.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList34 = subAckMessage32.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage38 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str39 = connectMessage38.getProtocolId();
        org.meqantt.message.QoS qoS40 = connectMessage38.getQos();
        subAckMessage32.addQoS(qoS40);
        connectMessage24.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS40, false);
        connectMessage13.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS40, true);
        connectMessage13.setWill("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
        org.meqantt.message.QoS qoS49 = connectMessage13.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage11.setQos(qoS49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MQIsdp" + "'", str28, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MQIsdp" + "'", str29, "MQIsdp");
        org.junit.Assert.assertNull(qoSList33);
        org.junit.Assert.assertNull(qoSList34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MQIsdp" + "'", str39, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS49 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS49.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17644");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getProtocolId();
        java.lang.String str2 = connectMessage0.getClientId();
        java.lang.String str3 = connectMessage0.getClientId();
        connectMessage0.setWill("", "\000\000");
        java.lang.String str7 = connectMessage0.getUsername();
        connectMessage0.setCredentials("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "\000\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MQIsdp" + "'", str1, "MQIsdp");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test17645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17645");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type5 = subscribeMessage4.getType();
        subscribeMessage4.setDup(false);
        subscribeMessage4.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList10 = subscribeMessage4.getTopics();
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
        subscribeMessage4.setQos(qoS27);
        subAckMessage3.addQoS(qoS27);
        java.util.List<org.meqantt.message.QoS> qoSList31 = subAckMessage3.getGrantedQoSs();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type5.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type25.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(qoSList31);
    }

    @Test
    public void test17646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17646");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.Message.Type type9 = header1.getType();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test17647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17647");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getProtocolId();
        connectMessage2.setCredentials("hi!", "");
        java.lang.String str7 = connectMessage2.getPassword();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.QoS qoS14 = null;
        subscribeMessage10.addTopic("", qoS14);
        java.util.List<org.meqantt.message.QoS> qoSList16 = subscribeMessage10.getTopicQoSs();
        subscribeMessage10.setDup(false);
        java.util.List<java.lang.String> strList19 = subscribeMessage10.getTopics();
        org.meqantt.message.Message.Header header22 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type23 = header22.getType();
        org.meqantt.message.Message.Type type24 = header22.getType();
        org.meqantt.message.SubAckMessage subAckMessage25 = new org.meqantt.message.SubAckMessage(header22);
        org.meqantt.message.PingReqMessage pingReqMessage26 = new org.meqantt.message.PingReqMessage(header22);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage(header22);
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage(header22);
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
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS53);
        connectMessage28.setWill("hi!", "\000\000", qoS53, true);
        subscribeMessage10.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS53);
        java.util.List<java.lang.String> strList63 = subscribeMessage10.getTopics();
        subscribeMessage10.setMessageId((int) 'a');
        org.meqantt.message.QoS qoS66 = subscribeMessage10.getQos();
        connectMessage2.setWill("00: 00000000 \000 0\n01: 00000011 \003 3\n02: 01101000 h 104\n03: 01101001 i 105\n04: 00100001 ! 33\n", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", qoS66, true);
        java.io.OutputStream outputStream69 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.write(outputStream69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MQIsdp" + "'", str3, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList16);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(type23);
        org.junit.Assert.assertNull(type24);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + qoS66 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS66.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17648");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage(header1);
    }

    @Test
    public void test17649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17649");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test17650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17650");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        boolean boolean10 = connectMessage1.hasUsername();
        connectMessage1.setWill("\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "\000\006\ufffd\ufffd\003hi!");
        boolean boolean14 = connectMessage1.isWillRetained();
        boolean boolean15 = connectMessage1.isWillRetained();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17651");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage6 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17652");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
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
    public void test17653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17653");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasUsername();
        boolean boolean5 = connectMessage3.hasUsername();
        int int6 = connectMessage3.getKeepAlive();
        java.lang.String str7 = connectMessage3.getUsername();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test17654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17654");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17655");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        boolean boolean8 = connectMessage7.isWillRetained();
        boolean boolean9 = connectMessage7.isWillRetained();
        connectMessage7.setWill("", "MQIsdp");
        boolean boolean13 = connectMessage7.isWillRetained();
        boolean boolean14 = connectMessage7.hasPassword();
        java.lang.String str15 = connectMessage7.getClientId();
        connectMessage7.setCredentials("\000d\000\001\001d");
        boolean boolean18 = connectMessage7.hasPassword();
        java.lang.String str19 = connectMessage7.getWill();
        boolean boolean20 = connectMessage7.hasWill();
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean27 = connectMessage26.hasWill();
        java.lang.String str28 = connectMessage26.getWill();
        java.lang.String str29 = connectMessage26.getWill();
        java.lang.String str30 = connectMessage26.getProtocolId();
        java.lang.String str31 = connectMessage26.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage34 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList35 = subAckMessage34.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList36 = subAckMessage34.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage40 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str41 = connectMessage40.getProtocolId();
        org.meqantt.message.QoS qoS42 = connectMessage40.getQos();
        subAckMessage34.addQoS(qoS42);
        connectMessage26.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS42, false);
        boolean boolean46 = connectMessage26.hasPassword();
        org.meqantt.message.QoS qoS47 = connectMessage26.getQos();
        connectMessage7.setWill("\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "\ufffd\003\000\000\000", qoS47, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage5.setQos(qoS47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MQIsdp" + "'", str30, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MQIsdp" + "'", str31, "MQIsdp");
        org.junit.Assert.assertNull(qoSList35);
        org.junit.Assert.assertNull(qoSList36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "MQIsdp" + "'", str41, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS42 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS42.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17656");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17657");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str9 = header1.toString();
        org.meqantt.message.PubRecMessage pubRecMessage10 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS15);
        org.meqantt.message.QoS qoS18 = subscribeMessage17.getQos();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("\000\000", false, (int) (short) -1);
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
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage("", qoS44);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS44);
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS44);
        connectMessage23.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS44, false);
        subscribeMessage17.addTopic("00: 01100100 d 100\n01: 00000000 \000 0\n", qoS44);
        org.meqantt.message.QoS qoS56 = subscribeMessage17.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage10.setQos(qoS56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str9, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS56 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS56.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17658");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        int int9 = connectMessage1.getKeepAlive();
        int int10 = connectMessage1.getKeepAlive();
        connectMessage1.setCredentials("0\b\000\000\000d\000\001\001d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test17659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17659");
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
        boolean boolean41 = connectMessage3.isWillRetained();
        java.lang.String str42 = connectMessage3.getWillTopic();
        boolean boolean43 = connectMessage3.hasPassword();
        org.meqantt.message.Message.Header header47 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type48 = header47.getType();
        org.meqantt.message.Message.Type type49 = header47.getType();
        org.meqantt.message.SubAckMessage subAckMessage50 = new org.meqantt.message.SubAckMessage(header47);
        org.meqantt.message.PingReqMessage pingReqMessage51 = new org.meqantt.message.PingReqMessage(header47);
        org.meqantt.message.PingReqMessage pingReqMessage52 = new org.meqantt.message.PingReqMessage(header47);
        org.meqantt.message.DisconnectMessage disconnectMessage53 = new org.meqantt.message.DisconnectMessage(header47);
        org.meqantt.message.PubRecMessage pubRecMessage54 = new org.meqantt.message.PubRecMessage(header47);
        org.meqantt.message.SubscribeMessage subscribeMessage55 = new org.meqantt.message.SubscribeMessage(header47);
        org.meqantt.message.ConnectMessage connectMessage60 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str61 = connectMessage60.getProtocolId();
        byte[] byteArray62 = connectMessage60.toBytes();
        org.meqantt.message.QoS qoS63 = connectMessage60.getWillQoS();
        org.meqantt.message.ConnectMessage connectMessage69 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str70 = connectMessage69.getProtocolId();
        byte[] byteArray71 = connectMessage69.toBytes();
        org.meqantt.message.QoS qoS72 = connectMessage69.getQos();
        connectMessage60.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS72, true);
        subscribeMessage55.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS72);
        connectMessage3.setWill("\000=Header [type=null, retain=true, qos=AT_LEAST_ONCE, dup=false]", "00: 00110000 0 48\n01: 00010010 \022 18\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000000 \000 0\n11: 00001000 \b 8\n12: 11000000 \300 192\n13: 10000000 \200 128\n14: 01100100 d 100\n15: 11000000 \300 192\n16: 10000000 \200 128\n17: 00000001 \001 1\n18: 00000001 \001 1\n19: 01100100 d 100\n", qoS72, false);
        connectMessage3.setCredentials("\001\03700: 00010000 \020 16\n01: 00001110 \016 14\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000010 \002 2\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n");
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(type48);
        org.junit.Assert.assertNull(type49);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "MQIsdp" + "'", str61, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertNull(qoS63);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "MQIsdp" + "'", str70, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + qoS72 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS72.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17660");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        connectMessage5.setCredentials("\000\003hi!", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        boolean boolean9 = connectMessage5.isDup();
        boolean boolean10 = connectMessage5.isWillRetained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17661");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test17662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17662");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage7 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage7.setMessageId(2);
    }

    @Test
    public void test17663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17663");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubAckMessage pubAckMessage6 = new org.meqantt.message.PubAckMessage(header1);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type5.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17664");
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
        connectMessage3.setWill("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        byte byte32 = connectMessage3.getProtocolVersion();
        boolean boolean33 = connectMessage3.hasWill();
        java.lang.String str34 = connectMessage3.getPassword();
        java.lang.String str35 = connectMessage3.getWillTopic();
        boolean boolean36 = connectMessage3.isWillRetained();
        byte[] byteArray39 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str40 = org.meqantt.util.FormatUtil.toString(byteArray39);
        org.meqantt.message.PublishMessage publishMessage41 = new org.meqantt.message.PublishMessage("hi!", byteArray39);
        publishMessage41.setMessageId((int) '\001');
        publishMessage41.setRetained(true);
        java.lang.String str46 = publishMessage41.getDataAsString();
        org.meqantt.message.QoS qoS47 = publishMessage41.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS47);
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
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 3 + "'", byte32 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd" + "'", str35, "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\000\000" + "'", str46, "\000\000");
        org.junit.Assert.assertTrue("'" + qoS47 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS47.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17665");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.PubRecMessage pubRecMessage9 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str8, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test17666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17666");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        java.lang.String str4 = connectMessage3.getPassword();
        boolean boolean5 = connectMessage3.hasPassword();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage();
        java.lang.String str9 = connectMessage8.getUsername();
        connectMessage8.setCredentials("hi!");
        java.lang.String str12 = connectMessage8.getWill();
        org.meqantt.message.QoS qoS13 = connectMessage8.getQos();
        connectMessage3.setWill("\020\016\000\006MQIsdp\003\002\000\001\000\000", "00: 10100010 \242 162\n01: 00101000 ( 40\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00100100 $ 36\n06: 00110000 0 48\n07: 00110000 0 48\n08: 00111010 : 58\n09: 00100000   32\n10: 00110000 0 48\n11: 00110000 0 48\n12: 00110000 0 48\n13: 00110000 0 48\n14: 00110000 0 48\n15: 00110000 0 48\n16: 00110000 0 48\n17: 00110000 0 48\n18: 00100000   32\n19: 11000000 \300 192\n20: 10000000 \200 128\n21: 00100000   32\n22: 00110000 0 48\n23: 00001010 \n 10\n24: 00110000 0 48\n25: 00110001 1 49\n26: 00111010 : 58\n27: 00100000   32\n28: 00110000 0 48\n29: 00110000 0 48\n30: 00110000 0 48\n31: 00110000 0 48\n32: 00110000 0 48\n33: 00110000 0 48\n34: 00110000 0 48\n35: 00110000 0 48\n36: 00100000   32\n37: 11000000 \300 192\n38: 10000000 \200 128\n39: 00100000   32\n40: 00110000 0 48\n41: 00001010 \n 10\n", qoS13, true);
        byte byte16 = connectMessage3.getProtocolVersion();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 3 + "'", byte16 == (byte) 3);
    }

    @Test
    public void test17667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17667");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        org.meqantt.message.Message.Type type4 = connAckMessage2.getType();
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
        org.meqantt.message.SubAckMessage subAckMessage34 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList35 = subAckMessage34.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList36 = subAckMessage34.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList37 = subAckMessage34.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList40 = subscribeMessage39.getTopics();
        org.meqantt.message.QoS qoS41 = subscribeMessage39.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("", qoS41);
        subAckMessage34.addQoS(qoS41);
        connectMessage8.setWill("hi!", "MQIsdp", qoS41, true);
        connectMessage8.setCredentials("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "hi!");
        org.meqantt.message.SubAckMessage subAckMessage51 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList52 = subAckMessage51.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList53 = subAckMessage51.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList54 = subAckMessage51.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList57 = subscribeMessage56.getTopics();
        org.meqantt.message.QoS qoS58 = subscribeMessage56.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("", qoS58);
        subAckMessage51.addQoS(qoS58);
        connectMessage8.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS58, false);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setQos(qoS58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.meqantt.message.Message.Type.CONNACK + "'", type4.equals(org.meqantt.message.Message.Type.CONNACK));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList35);
        org.junit.Assert.assertNull(qoSList36);
        org.junit.Assert.assertNull(qoSList37);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList52);
        org.junit.Assert.assertNull(qoSList53);
        org.junit.Assert.assertNull(qoSList54);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + qoS58 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS58.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17668");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 00000000 \000 0\n01: 00000100 \004 4\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 11000000 \300 192\n05: 10000000 \200 128\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n");
    }

    @Test
    public void test17669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17669");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean9 = connectMessage8.hasUsername();
        org.meqantt.message.QoS qoS10 = connectMessage8.getQos();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17670");
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage("MQIsdp", "\000d\000\001\001d");
        java.lang.String str4 = publishMessage3.getDataAsString();
        byte[] byteArray5 = publishMessage3.getData();
        byte[] byteArray6 = publishMessage3.getData();
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage("hi!", byteArray6);
        java.lang.String str8 = org.meqantt.util.FormatUtil.toString(byteArray6);
        java.lang.String str9 = org.meqantt.util.FormatUtil.toString(byteArray6);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d" + "'", str4, "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000d\000\001\001d" + "'", str8, "\000d\000\001\001d");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\000\001\001d" + "'", str9, "\000d\000\001\001d");
    }

    @Test
    public void test17671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17671");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage6 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test17672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17672");
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
        org.meqantt.message.Message.Type type12 = header1.getType();
        org.meqantt.message.PublishMessage publishMessage13 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.QoS qoS14 = publishMessage13.getQos();
        java.lang.String str15 = publishMessage13.getTopic();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17673");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        java.lang.String str6 = header1.toString();
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage9 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage10 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Header header12 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type13 = header12.getType();
        org.meqantt.message.Message.Type type14 = header12.getType();
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage(header12);
        org.meqantt.message.PingReqMessage pingReqMessage16 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage(header12);
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage(header12);
        java.lang.String str19 = header12.toString();
        org.meqantt.message.PingReqMessage pingReqMessage20 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.SubAckMessage subAckMessage21 = new org.meqantt.message.SubAckMessage(header12);
        org.meqantt.message.Message.Header header22 = null;
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header22);
        boolean boolean24 = connectMessage23.isWillRetained();
        boolean boolean25 = connectMessage23.isWillRetained();
        connectMessage23.setWill("", "MQIsdp");
        boolean boolean29 = connectMessage23.isWillRetained();
        java.lang.String str30 = connectMessage23.getClientId();
        java.lang.String str31 = connectMessage23.getWill();
        byte byte32 = connectMessage23.getProtocolVersion();
        java.lang.String str33 = connectMessage23.getPassword();
        boolean boolean34 = connectMessage23.hasPassword();
        org.meqantt.message.QoS qoS35 = connectMessage23.getWillQoS();
        subAckMessage21.addQoS(qoS35);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage10.setQos(qoS35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str19, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MQIsdp" + "'", str31, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 3 + "'", byte32 == (byte) 3);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17674");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
    }

    @Test
    public void test17675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17675");
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
        org.meqantt.message.PubRelMessage pubRelMessage13 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage14 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage15 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage16 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PublishMessage publishMessage17 = new org.meqantt.message.PublishMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17676");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        subAckMessage9.addQoS(qoS13);
        java.util.List<org.meqantt.message.QoS> qoSList16 = subAckMessage9.getGrantedQoSs();
        boolean boolean17 = subAckMessage9.isRetained();
        org.meqantt.message.Message.Header header19 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage20 = new org.meqantt.message.PubAckMessage(header19);
        java.lang.String str21 = header19.toString();
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage(header19);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage(header19);
        org.meqantt.message.ConnectMessage connectMessage33 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str34 = connectMessage33.getUsername();
        org.meqantt.message.QoS qoS38 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.QoS qoS43 = subscribeMessage41.getQos();
        subscribeMessage39.addTopic("", qoS43);
        connectMessage33.setWill("", "\000d\000\001\001d", qoS43, true);
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage("hi!", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS43);
        subscribeMessage23.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS43);
        subAckMessage9.addQoS(qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage("", qoS43);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setQos(qoS43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str21, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17677");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "\000\003hi!");
        java.lang.String str3 = publishMessage2.getTopic();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n" + "'", str3, "00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
    }

    @Test
    public void test17678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17678");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(19);
    }

    @Test
    public void test17679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17679");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        int int8 = subAckMessage7.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(qoSList9);
    }

    @Test
    public void test17680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17680");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getClientId();
        connectMessage1.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        java.lang.String str13 = connectMessage1.getClientId();
        connectMessage1.setWill("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.message.QoS qoS17 = connectMessage1.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17681");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000<Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        unsubscribeMessage1.addTopic("\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        boolean boolean4 = unsubscribeMessage1.isRetained();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test17682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17682");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type10 = header1.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type10);
    }

    @Test
    public void test17683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17683");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\023\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\001d", true, (int) 'a');
    }

    @Test
    public void test17684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17684");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage("", byteArray8);
        java.lang.String str10 = publishMessage9.getDataAsString();
        byte[] byteArray11 = publishMessage9.getData();
        org.meqantt.message.PublishMessage publishMessage12 = new org.meqantt.message.PublishMessage("MQIsdp", byteArray11);
        byte[] byteArray13 = publishMessage12.toBytes();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000d\000\001\001d" + "'", str10, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[48, 14, 0, 6, 77, 81, 73, 115, 100, 112, 0, 100, 0, 1, 1, 100]");
    }

    @Test
    public void test17685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17685");
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
        java.lang.String str13 = header1.toString();
        java.lang.String str14 = header1.toString();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage16 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage17 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage18 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PublishMessage publishMessage19 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean21 = connectMessage20.hasWill();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str13, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str14, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test17686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17686");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header11 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type12 = header11.getType();
        org.meqantt.message.Message.Type type13 = header11.getType();
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage(header11);
        org.meqantt.message.PingReqMessage pingReqMessage15 = new org.meqantt.message.PingReqMessage(header11);
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage(header11);
        org.meqantt.message.PingReqMessage pingReqMessage17 = new org.meqantt.message.PingReqMessage(header11);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage18 = new org.meqantt.message.UnsubscribeMessage(header11);
        org.meqantt.message.SubAckMessage subAckMessage19 = new org.meqantt.message.SubAckMessage(header11);
        java.lang.String str20 = header11.toString();
        org.meqantt.message.SubAckMessage subAckMessage21 = new org.meqantt.message.SubAckMessage(header11);
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage("", true, 1);
        byte byte26 = connectMessage25.getProtocolVersion();
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList30 = subscribeMessage29.getTopics();
        org.meqantt.message.QoS qoS31 = subscribeMessage29.getQos();
        org.meqantt.message.QoS qoS33 = null;
        subscribeMessage29.addTopic("", qoS33);
        java.util.List<org.meqantt.message.QoS> qoSList35 = subscribeMessage29.getTopicQoSs();
        subscribeMessage29.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList38 = subscribeMessage29.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage43 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str44 = connectMessage43.getUsername();
        org.meqantt.message.QoS qoS48 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("", qoS48);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList52 = subscribeMessage51.getTopics();
        org.meqantt.message.QoS qoS53 = subscribeMessage51.getQos();
        subscribeMessage49.addTopic("", qoS53);
        connectMessage43.setWill("", "\000d\000\001\001d", qoS53, true);
        subscribeMessage29.addTopic("\000\000", qoS53);
        connectMessage25.setWill("", "\000\003hi!", qoS53, true);
        org.meqantt.message.Message.Header header62 = null;
        org.meqantt.message.ConnectMessage connectMessage63 = new org.meqantt.message.ConnectMessage(header62);
        boolean boolean64 = connectMessage63.isWillRetained();
        boolean boolean65 = connectMessage63.isWillRetained();
        java.lang.String str66 = connectMessage63.getUsername();
        org.meqantt.message.QoS qoS70 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage71 = new org.meqantt.message.SubscribeMessage("", qoS70);
        org.meqantt.message.SubscribeMessage subscribeMessage73 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList74 = subscribeMessage73.getTopics();
        org.meqantt.message.QoS qoS75 = subscribeMessage73.getQos();
        subscribeMessage71.addTopic("", qoS75);
        connectMessage63.setWill("hi!", "", qoS75, false);
        boolean boolean79 = connectMessage63.hasUsername();
        org.meqantt.message.QoS qoS80 = connectMessage63.getWillQoS();
        connectMessage25.setWill("hi!", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS80, true);
        subAckMessage21.addQoS(qoS80);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS80);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str20, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 3 + "'", byte26 == (byte) 3);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList35);
        org.junit.Assert.assertNotNull(qoSList38);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + qoS75 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS75.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + qoS80 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS80.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17687");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage9 = new org.meqantt.message.PingRespMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17688");
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
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type13 = header1.getType();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type13);
    }

    @Test
    public void test17689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17689");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage8 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage9 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str12 = header1.toString();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage13 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.Message.Header header17 = null;
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage(header17);
        int int19 = connectMessage18.getKeepAlive();
        connectMessage18.setWill("MQIsdp", "");
        java.lang.String str23 = connectMessage18.getWillTopic();
        org.meqantt.message.ConnectMessage connectMessage33 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str34 = connectMessage33.getUsername();
        org.meqantt.message.QoS qoS38 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.QoS qoS43 = subscribeMessage41.getQos();
        subscribeMessage39.addTopic("", qoS43);
        connectMessage33.setWill("", "\000d\000\001\001d", qoS43, true);
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage("hi!", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList53 = subscribeMessage52.getTopics();
        org.meqantt.message.ConnectMessage connectMessage58 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str59 = connectMessage58.getProtocolId();
        org.meqantt.message.QoS qoS60 = connectMessage58.getQos();
        subscribeMessage52.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS60);
        subscribeMessage50.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS60);
        org.meqantt.message.ConnectMessage connectMessage67 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str68 = connectMessage67.getProtocolId();
        org.meqantt.message.QoS qoS69 = connectMessage67.getQos();
        subscribeMessage50.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS69);
        connectMessage18.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS69, false);
        boolean boolean73 = connectMessage18.isWillRetained();
        org.meqantt.message.QoS qoS74 = connectMessage18.getWillQoS();
        java.lang.String str75 = connectMessage18.getUsername();
        org.meqantt.message.QoS qoS76 = connectMessage18.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage77 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 00000000 \000 0\n", qoS76);
        subscribeMessage14.addTopic("00: 01100100 d 100\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00000000 \000 0\n", qoS76);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str12, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MQIsdp" + "'", str23, "MQIsdp");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "MQIsdp" + "'", str59, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS60 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS60.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "MQIsdp" + "'", str68, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS69 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS69.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + qoS74 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS74.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + qoS76 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS76.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17690");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str4 = connectMessage3.getUsername();
        java.lang.String str5 = connectMessage3.getProtocolId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MQIsdp" + "'", str5, "MQIsdp");
    }

    @Test
    public void test17691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17691");
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
        org.meqantt.message.PubCompMessage pubCompMessage13 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage14 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus15 = connAckMessage14.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage14.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(connectionStatus15);
    }

    @Test
    public void test17692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17692");
        byte[] byteArray1 = org.meqantt.util.FormatUtil.toMQttString("00: 00010000 \020 16\n01: 00010100 \024 20\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000010 \002 2\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000110 \006 6\n16: 01001101 M 77\n17: 01010001 Q 81\n18: 01001001 I 73\n19: 01110011 s 115\n20: 01100100 d 100\n21: 01110000 p 112\n");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test17693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17693");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getClientId();
        connectMessage1.setCredentials("\000d\000\001\001d");
        byte byte12 = connectMessage1.getProtocolVersion();
        boolean boolean13 = connectMessage1.hasPassword();
        connectMessage1.setCredentials("00: 00010000 \020 16\n01: 00010100 \024 20\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000010 \002 2\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000110 \006 6\n16: 01001101 M 77\n17: 01010001 Q 81\n18: 01001001 I 73\n19: 01110011 s 115\n20: 01100100 d 100\n21: 01110000 p 112\n", "00: 01100100 d 100\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00000000 \000 0\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 3 + "'", byte12 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17694");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str10 = header1.toString();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage11 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17695");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdD00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", true, (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: ?N??G??????D00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17696");
        byte[] byteArray3 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str4 = org.meqantt.util.FormatUtil.toString(byteArray3);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage("hi!", byteArray3);
        publishMessage5.setMessageId((int) '\001');
        int int8 = publishMessage5.getMessageId();
        byte[] byteArray9 = publishMessage5.getData();
        java.lang.String str10 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray9);
        java.lang.String str11 = org.meqantt.util.FormatUtil.toString(byteArray9);
        org.meqantt.message.PublishMessage publishMessage12 = new org.meqantt.message.PublishMessage("\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", byteArray9);
        java.lang.String str13 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray9);
        java.lang.String str14 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray9);
        java.lang.String str15 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray9);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str10, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str13, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str14, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str15, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
    }

    @Test
    public void test17697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17697");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("\000\004\001\003\003\001");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
    }

    @Test
    public void test17698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17698");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean8 = connectMessage7.isCleanSession();
        java.lang.String str9 = connectMessage7.getClientId();
        connectMessage7.setCredentials("hi!", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        connectMessage7.setWill("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        java.lang.String str16 = connectMessage7.getPassword();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str16, "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test17699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17699");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage9 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage10 = new org.meqantt.message.PubRecMessage(header1);
    }

    @Test
    public void test17700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17700");
        org.meqantt.message.SubscribeMessage subscribeMessage1 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList2 = subscribeMessage1.getTopics();
        org.meqantt.message.QoS qoS3 = subscribeMessage1.getQos();
        org.meqantt.message.QoS qoS5 = null;
        subscribeMessage1.addTopic("", qoS5);
        java.util.List<org.meqantt.message.QoS> qoSList7 = subscribeMessage1.getTopicQoSs();
        subscribeMessage1.setDup(false);
        java.util.List<java.lang.String> strList10 = subscribeMessage1.getTopics();
        org.meqantt.message.Message.Header header13 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type14 = header13.getType();
        org.meqantt.message.Message.Type type15 = header13.getType();
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage(header13);
        org.meqantt.message.PingReqMessage pingReqMessage17 = new org.meqantt.message.PingReqMessage(header13);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage(header13);
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage(header13);
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
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS44);
        connectMessage19.setWill("hi!", "\000\000", qoS44, true);
        subscribeMessage1.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS44);
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 00000110 \006 6\n02: 01001101 M 77\n03: 01010001 Q 81\n04: 01001001 I 73\n05: 01110011 s 115\n06: 01100100 d 100\n07: 01110000 p 112\n", qoS44);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage54.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + qoS3 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS3.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17701");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage9 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage10 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage12 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage13 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test17702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17702");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void test17703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17703");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
    }

    @Test
    public void test17704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17704");
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
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage14 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage15 = new org.meqantt.message.PubCompMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17705");
        org.meqantt.message.Message.Header header2 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.Message.Type type3 = header2.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header2);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage("MQIsdp", "\000d\000\001\001d");
        java.lang.String str8 = publishMessage7.getDataAsString();
        byte[] byteArray9 = publishMessage7.getData();
        org.meqantt.message.QoS qoS10 = publishMessage7.getQos();
        subAckMessage4.addQoS(qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.Message.Header header14 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type15 = header14.getType();
        org.meqantt.message.Message.Type type16 = header14.getType();
        org.meqantt.message.SubAckMessage subAckMessage17 = new org.meqantt.message.SubAckMessage(header14);
        org.meqantt.message.PingReqMessage pingReqMessage18 = new org.meqantt.message.PingReqMessage(header14);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage(header14);
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage(header14);
        java.lang.String str21 = header14.toString();
        org.meqantt.message.PingReqMessage pingReqMessage22 = new org.meqantt.message.PingReqMessage(header14);
        org.meqantt.message.DisconnectMessage disconnectMessage23 = new org.meqantt.message.DisconnectMessage(header14);
        java.lang.String str24 = header14.toString();
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage(header14);
        connectMessage25.setCredentials("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        org.meqantt.message.Message.Header header32 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type33 = header32.getType();
        org.meqantt.message.SubAckMessage subAckMessage34 = new org.meqantt.message.SubAckMessage(header32);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type36 = subscribeMessage35.getType();
        subscribeMessage35.setDup(false);
        subscribeMessage35.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList41 = subscribeMessage35.getTopics();
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList43 = subscribeMessage42.getTopics();
        org.meqantt.message.QoS qoS44 = subscribeMessage42.getQos();
        org.meqantt.message.ConnectMessage connectMessage49 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str50 = connectMessage49.getProtocolId();
        org.meqantt.message.QoS qoS51 = connectMessage49.getQos();
        subscribeMessage42.addTopic("", qoS51);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage54 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList55 = unsubscribeMessage54.getTopics();
        org.meqantt.message.Message.Type type56 = unsubscribeMessage54.getType();
        java.util.List<java.lang.String> strList57 = unsubscribeMessage54.getTopics();
        org.meqantt.message.QoS qoS58 = unsubscribeMessage54.getQos();
        subscribeMessage42.setQos(qoS58);
        subscribeMessage35.setQos(qoS58);
        subAckMessage34.addQoS(qoS58);
        connectMessage25.setWill("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00000001 \001 1\n", "\020\ufffd\001\000\006MQIsdp\003\ufffd\000d\000\006MQIsdp\000\000\000\006MQIsdp\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]\000\ufffd\ufffd?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS58, false);
        subscribeMessage12.setQos(qoS58);
        org.junit.Assert.assertNull(type3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d" + "'", str8, "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str21, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str24, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type33.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type36.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "MQIsdp" + "'", str50, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS51 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS51.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type56.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + qoS58 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS58.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17706");
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str17 = connectMessage16.getProtocolId();
        org.meqantt.message.QoS qoS18 = connectMessage16.getQos();
        subscribeMessage9.addTopic("", qoS18);
        connectMessage6.setWill("MQIsdp", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", qoS18, true);
        byte[] byteArray22 = connectMessage6.toBytes();
        org.meqantt.message.PublishMessage publishMessage23 = new org.meqantt.message.PublishMessage("hi!", byteArray22);
        org.meqantt.message.PublishMessage publishMessage24 = new org.meqantt.message.PublishMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", byteArray22);
        byte[] byteArray25 = publishMessage24.getData();
        java.lang.String str26 = org.meqantt.util.FormatUtil.toString(byteArray25);
        org.meqantt.message.PublishMessage publishMessage27 = new org.meqantt.message.PublishMessage("\000=Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", byteArray25);
        java.lang.String str28 = org.meqantt.util.FormatUtil.toString(byteArray25);
        java.lang.String str29 = org.meqantt.util.FormatUtil.toString(byteArray25);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MQIsdp" + "'", str17, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[16, -38, 1, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 100, 0, 6, 77, 81, 73, 115, 100, 112, 0, 6, 77, 81, 73, 115, 100, 112, 0, -68, 48, 48, 58, 32, 49, 48, 49, 48, 48, 48, 49, 48, 32, -62, -94, 32, 49, 54, 50, 10, 48, 49, 58, 32, 48, 48, 48, 48, 49, 48, 48, 48, 32, 8, 32, 56, 10, 48, 50, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10, 48, 51, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10, 48, 52, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10, 48, 53, 58, 32, 48, 48, 48, 48, 48, 49, 48, 48, 32, 4, 32, 52, 10, 48, 54, 58, 32, 49, 49, 48, 48, 48, 48, 48, 48, 32, -61, -128, 32, 49, 57, 50, 10, 48, 55, 58, 32, 49, 48, 48, 48, 48, 48, 48, 48, 32, -62, -128, 32, 49, 50, 56, 10, 48, 56, 58, 32, 49, 49, 48, 48, 48, 48, 48, 48, 32, -61, -128, 32, 49, 57, 50, 10, 48, 57, 58, 32, 49, 48, 48, 48, 48, 48, 48, 48, 32, -62, -128, 32, 49, 50, 56, 10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[16, -38, 1, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 100, 0, 6, 77, 81, 73, 115, 100, 112, 0, 6, 77, 81, 73, 115, 100, 112, 0, -68, 48, 48, 58, 32, 49, 48, 49, 48, 48, 48, 49, 48, 32, -62, -94, 32, 49, 54, 50, 10, 48, 49, 58, 32, 48, 48, 48, 48, 49, 48, 48, 48, 32, 8, 32, 56, 10, 48, 50, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10, 48, 51, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10, 48, 52, 58, 32, 48, 48, 48, 48, 48, 48, 48, 48, 32, -64, -128, 32, 48, 10, 48, 53, 58, 32, 48, 48, 48, 48, 48, 49, 48, 48, 32, 4, 32, 52, 10, 48, 54, 58, 32, 49, 49, 48, 48, 48, 48, 48, 48, 32, -61, -128, 32, 49, 57, 50, 10, 48, 55, 58, 32, 49, 48, 48, 48, 48, 48, 48, 48, 32, -62, -128, 32, 49, 50, 56, 10, 48, 56, 58, 32, 49, 49, 48, 48, 48, 48, 48, 48, 32, -61, -128, 32, 49, 57, 50, 10, 48, 57, 58, 32, 49, 48, 48, 48, 48, 48, 48, 48, 32, -62, -128, 32, 49, 50, 56, 10]");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test17707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17707");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage8 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subscribeMessage9.getTopicQoSs();
        subscribeMessage9.setDup(false);
        java.util.List<java.lang.String> strList13 = subscribeMessage9.getTopics();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, 1);
        java.lang.String str18 = connectMessage17.getClientId();
        boolean boolean19 = connectMessage17.hasUsername();
        boolean boolean20 = connectMessage17.isWillRetained();
        org.meqantt.message.SubAckMessage subAckMessage23 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList24 = subAckMessage23.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList25 = subAckMessage23.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList26 = subAckMessage23.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS29 = subscribeMessage27.getQos();
        org.meqantt.message.ConnectMessage connectMessage34 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str35 = connectMessage34.getProtocolId();
        org.meqantt.message.QoS qoS36 = connectMessage34.getQos();
        subscribeMessage27.addTopic("", qoS36);
        subAckMessage23.addQoS(qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList42 = subscribeMessage41.getTopics();
        org.meqantt.message.QoS qoS43 = subscribeMessage41.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage("", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS43);
        subAckMessage23.addQoS(qoS43);
        connectMessage17.setWill("MQIsdp", "00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS43, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage9.setQos(qoS43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(qoSList24);
        org.junit.Assert.assertNull(qoSList25);
        org.junit.Assert.assertNull(qoSList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MQIsdp" + "'", str35, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17708");
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
        boolean boolean29 = connectMessage3.isCleanSession();
        java.lang.String str30 = connectMessage3.getWillTopic();
        int int31 = connectMessage3.getKeepAlive();
        connectMessage3.setWill("\001\03700: 00010000 \020 16\n01: 00001110 \016 14\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000010 \002 2\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n", "\000\ufffd\ufffd\ufffd 162\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 00000100 \004 4\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MQIsdp" + "'", str30, "MQIsdp");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test17709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17709");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", true, 1);
        boolean boolean4 = connectMessage3.hasUsername();
        boolean boolean5 = connectMessage3.isCleanSession();
        java.lang.String str6 = connectMessage3.getClientId();
        org.meqantt.message.QoS qoS7 = connectMessage3.getWillQoS();
        boolean boolean8 = connectMessage3.isCleanSession();
        boolean boolean9 = connectMessage3.hasWill();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d" + "'", str6, "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.junit.Assert.assertNull(qoS7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17710");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        boolean boolean6 = connectMessage3.hasUsername();
        connectMessage3.setWill("", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17711");
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
        java.util.List<java.lang.String> strList12 = unsubscribeMessage10.getTopics();
        org.meqantt.message.Message.Type type13 = unsubscribeMessage10.getType();
        unsubscribeMessage10.addTopic("\000<Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        int int16 = unsubscribeMessage10.getMessageId();
        unsubscribeMessage10.addTopic("\020\032\000\006MQIsdp\003&\000\001\000\000\000\000\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS23);
        org.meqantt.message.QoS qoS26 = subscribeMessage25.getQos();
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage("\000\000", false, (int) (short) -1);
        org.meqantt.message.ConnectMessage connectMessage42 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str43 = connectMessage42.getUsername();
        org.meqantt.message.QoS qoS47 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage48 = new org.meqantt.message.SubscribeMessage("", qoS47);
        org.meqantt.message.SubscribeMessage subscribeMessage50 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList51 = subscribeMessage50.getTopics();
        org.meqantt.message.QoS qoS52 = subscribeMessage50.getQos();
        subscribeMessage48.addTopic("", qoS52);
        connectMessage42.setWill("", "\000d\000\001\001d", qoS52, true);
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage("hi!", qoS52);
        org.meqantt.message.SubscribeMessage subscribeMessage57 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS52);
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage("", qoS52);
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS52);
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS52);
        connectMessage31.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS52, false);
        subscribeMessage25.addTopic("00: 01100100 d 100\n01: 00000000 \000 0\n", qoS52);
        org.meqantt.message.QoS qoS64 = subscribeMessage25.getQos();
        unsubscribeMessage10.setQos(qoS64);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS64 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS64.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17712");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", "00: 10100010 \242 162\n01: 00101000 ( 40\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00100100 $ 36\n06: 00110000 0 48\n07: 00110000 0 48\n08: 00111010 : 58\n09: 00100000   32\n10: 00110000 0 48\n11: 00110000 0 48\n12: 00110000 0 48\n13: 00110000 0 48\n14: 00110000 0 48\n15: 00110000 0 48\n16: 00110000 0 48\n17: 00110000 0 48\n18: 00100000   32\n19: 11000000 \300 192\n20: 10000000 \200 128\n21: 00100000   32\n22: 00110000 0 48\n23: 00001010 \n 10\n24: 00110000 0 48\n25: 00110001 1 49\n26: 00111010 : 58\n27: 00100000   32\n28: 00110000 0 48\n29: 00110000 0 48\n30: 00110000 0 48\n31: 00110000 0 48\n32: 00110000 0 48\n33: 00110000 0 48\n34: 00110000 0 48\n35: 00110000 0 48\n36: 00100000   32\n37: 11000000 \300 192\n38: 10000000 \200 128\n39: 00100000   32\n40: 00110000 0 48\n41: 00001010 \n 10\n");
        byte[] byteArray3 = publishMessage2.getData();
        java.lang.String str4 = publishMessage2.getTopic();
        java.lang.String str5 = publishMessage2.getTopic();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n" + "'", str4, "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n" + "'", str5, "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n");
    }

    @Test
    public void test17713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17713");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        boolean boolean2 = connAckMessage1.isDup();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage();
        int int4 = subAckMessage3.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage3.getGrantedQoSs();
        subAckMessage3.setMessageId((int) (byte) 10);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS10 = pubRelMessage9.getQos();
        subAckMessage3.addQoS(qoS10);
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
        java.lang.String str39 = connectMessage15.getWillTopic();
        boolean boolean40 = connectMessage15.hasUsername();
        org.meqantt.message.Message.Header header44 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage45 = new org.meqantt.message.ConnectMessage(header44);
        java.lang.String str46 = connectMessage45.getProtocolId();
        boolean boolean47 = connectMessage45.hasPassword();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage51 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS52 = unsubscribeMessage51.getQos();
        connectMessage45.setWill("", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS52, false);
        connectMessage15.setWill("\001\003\003\001", "00: 00000000 \000 0\n01: 00000000 \000 0\n", qoS52, true);
        subAckMessage3.addQoS(qoS52);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "MQIsdp" + "'", str39, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "MQIsdp" + "'", str46, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17714");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        boolean boolean4 = connectMessage1.hasPassword();
        byte byte5 = connectMessage1.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
    }

    @Test
    public void test17715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17715");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        int int10 = connectMessage9.getKeepAlive();
        java.lang.String str11 = connectMessage9.getPassword();
        java.lang.String str12 = connectMessage9.getPassword();
        int int13 = connectMessage9.getKeepAlive();
        boolean boolean14 = connectMessage9.isCleanSession();
        org.meqantt.message.QoS qoS15 = connectMessage9.getWillQoS();
        org.meqantt.message.PubRecMessage pubRecMessage19 = new org.meqantt.message.PubRecMessage((int) (short) 1);
        org.meqantt.message.QoS qoS20 = pubRecMessage19.getQos();
        connectMessage9.setWill("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdD00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "00: 00000000 \000 0\n01: 00000000 \000 0\n", qoS20, false);
        subscribeMessage6.addTopic("00: 00010000 \020 16\n01: 00010010 \022 18\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000000 \000 0\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000100 \004 4\n16: 00000001 \001 1\n17: 00000011 \003 3\n18: 00000011 \003 3\n19: 00000001 \001 1\n", qoS20);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(qoS15);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17716");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage10 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage11.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage11.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList14 = subAckMessage11.getGrantedQoSs();
        int int15 = subAckMessage11.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage11.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNull(qoSList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test17717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17717");
        byte[] byteArray2 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str3 = org.meqantt.util.FormatUtil.toString(byteArray2);
        org.meqantt.message.PublishMessage publishMessage4 = new org.meqantt.message.PublishMessage("hi!", byteArray2);
        publishMessage4.setMessageId((int) '\001');
        java.lang.String str7 = publishMessage4.getDataAsString();
        java.lang.String str8 = publishMessage4.getDataAsString();
        byte[] byteArray9 = publishMessage4.getData();
        byte[] byteArray10 = publishMessage4.getData();
        java.lang.String str11 = publishMessage4.getDataAsString();
        boolean boolean12 = publishMessage4.isRetained();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000" + "'", str7, "\000\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000" + "'", str8, "\000\000");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000" + "'", str11, "\000\000");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17718");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 00110000 0 48\n01: 00000111 \007 7\n02: 00000000 \000 0\n03: 00000011 \003 3\n04: 01101000 h 104\n05: 01101001 i 105\n06: 00100001 ! 33\n07: 00000000 \000 0\n08: 00000000 \000 0\n", true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 00110000 0 48?01: 00000111 ? 7?02: 00000000 ? 0?03: 00000011 ? 3?04: 01101000 h 104?05: 01101001 i 105?06: 00100001 ! 33?07: 00000000 ? 0?08: 00000000 ? 0?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17719");
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
        org.meqantt.message.QoS qoS19 = connectMessage3.getWillQoS();
        java.lang.String str20 = connectMessage3.getProtocolId();
        connectMessage3.setWill("", "\001\003\003\001");
        org.meqantt.message.SubAckMessage subAckMessage26 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList29 = subscribeMessage28.getTopics();
        org.meqantt.message.QoS qoS30 = subscribeMessage28.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("", qoS30);
        subAckMessage26.addQoS(qoS30);
        connectMessage3.setWill("", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", qoS30, false);
        boolean boolean35 = connectMessage3.hasWill();
        java.lang.String str36 = connectMessage3.getUsername();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test17720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17720");
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
        byte byte28 = connectMessage4.getProtocolVersion();
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
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS53);
        connectMessage4.setWill("", "MQIsdp", qoS53, false);
        org.meqantt.message.SubscribeMessage subscribeMessage62 = new org.meqantt.message.SubscribeMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS53);
        subscribeMessage62.setDup(false);
        java.util.List<java.lang.String> strList65 = subscribeMessage62.getTopics();
        byte[] byteArray68 = org.meqantt.util.FormatUtil.toMQttString("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        java.lang.String str69 = org.meqantt.util.FormatUtil.toString(byteArray68);
        org.meqantt.message.PublishMessage publishMessage70 = new org.meqantt.message.PublishMessage("\001\003\003\001", byteArray68);
        org.meqantt.message.Message.Type type71 = publishMessage70.getType();
        org.meqantt.message.QoS qoS72 = publishMessage70.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage62.setQos(qoS72);
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
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 3 + "'", byte28 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0, 61, 72, 101, 97, 100, 101, 114, 32, 91, 116, 121, 112, 101, 61, 110, 117, 108, 108, 44, 32, 114, 101, 116, 97, 105, 110, 61, 102, 97, 108, 115, 101, 44, 32, 113, 111, 115, 61, 65, 84, 95, 77, 79, 83, 84, 95, 79, 78, 67, 69, 44, 32, 100, 117, 112, 61, 102, 97, 108, 115, 101, 93]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str69, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + type71 + "' != '" + org.meqantt.message.Message.Type.PUBLISH + "'", type71.equals(org.meqantt.message.Message.Type.PUBLISH));
        org.junit.Assert.assertTrue("'" + qoS72 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS72.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17721");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header10 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header10);
        org.meqantt.message.PublishMessage publishMessage12 = new org.meqantt.message.PublishMessage(header10);
        java.lang.String str13 = header10.toString();
        org.meqantt.message.Message.Type type14 = header10.getType();
        org.meqantt.message.PubRelMessage pubRelMessage15 = new org.meqantt.message.PubRelMessage(header10);
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage(header10);
        org.meqantt.message.Message.Header header21 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage22 = new org.meqantt.message.PingReqMessage(header21);
        org.meqantt.message.PubCompMessage pubCompMessage23 = new org.meqantt.message.PubCompMessage(header21);
        org.meqantt.message.SubAckMessage subAckMessage24 = new org.meqantt.message.SubAckMessage(header21);
        org.meqantt.message.SubAckMessage subAckMessage25 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList26 = subAckMessage25.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList27 = subAckMessage25.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str32 = connectMessage31.getProtocolId();
        org.meqantt.message.QoS qoS33 = connectMessage31.getQos();
        subAckMessage25.addQoS(qoS33);
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
        org.meqantt.message.SubAckMessage subAckMessage64 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList65 = subAckMessage64.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList66 = subAckMessage64.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList67 = subAckMessage64.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage69 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList70 = subscribeMessage69.getTopics();
        org.meqantt.message.QoS qoS71 = subscribeMessage69.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage72 = new org.meqantt.message.SubscribeMessage("", qoS71);
        subAckMessage64.addQoS(qoS71);
        connectMessage38.setWill("hi!", "MQIsdp", qoS71, true);
        subAckMessage25.addQoS(qoS71);
        subAckMessage24.addQoS(qoS71);
        org.meqantt.message.SubscribeMessage subscribeMessage78 = new org.meqantt.message.SubscribeMessage("\000\003hi!", qoS71);
        org.meqantt.message.SubscribeMessage subscribeMessage79 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS71);
        org.meqantt.message.SubscribeMessage subscribeMessage80 = new org.meqantt.message.SubscribeMessage("00: 01100100 d 100\n01: 00000000 \000 0\n", qoS71);
        subAckMessage16.addQoS(qoS71);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage8.setQos(qoS71);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str13, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(qoSList26);
        org.junit.Assert.assertNull(qoSList27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MQIsdp" + "'", str32, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + qoS56 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS56.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList65);
        org.junit.Assert.assertNull(qoSList66);
        org.junit.Assert.assertNull(qoSList67);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + qoS71 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS71.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17722");
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
        int int13 = connectMessage1.getKeepAlive();
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage();
        int int17 = subAckMessage16.getMessageId();
        java.util.List<org.meqantt.message.QoS> qoSList18 = subAckMessage16.getGrantedQoSs();
        subAckMessage16.setMessageId((int) (byte) 10);
        org.meqantt.message.PubRelMessage pubRelMessage22 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS23 = pubRelMessage22.getQos();
        subAckMessage16.addQoS(qoS23);
        connectMessage1.setWill("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", "00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00000001 \001 1\n", qoS23, true);
        org.meqantt.message.QoS qoS27 = connectMessage1.getWillQoS();
        java.lang.Class<?> wildcardClass28 = connectMessage1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(qoS9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 3 + "'", byte11 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(qoSList18);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test17723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17723");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setWill("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        org.meqantt.message.Message.Header header12 = null;
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage(header12);
        java.lang.String str14 = connectMessage13.getClientId();
        connectMessage13.setWill("hi!", "");
        org.meqantt.message.QoS qoS18 = connectMessage13.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS18);
        connectMessage1.setWill("00: 00000000 \000 0\n01: 00000000 \000 0\n", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS18, false);
        boolean boolean22 = connectMessage1.isCleanSession();
        boolean boolean23 = connectMessage1.hasUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test17724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17724");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        java.lang.String str7 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header12 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage13 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.PubCompMessage pubCompMessage14 = new org.meqantt.message.PubCompMessage(header12);
        org.meqantt.message.PubAckMessage pubAckMessage15 = new org.meqantt.message.PubAckMessage(header12);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage16 = new org.meqantt.message.UnsubscribeMessage(header12);
        org.meqantt.message.PublishMessage publishMessage17 = new org.meqantt.message.PublishMessage(header12);
        org.meqantt.message.Message.Type type18 = header12.getType();
        org.meqantt.message.PingReqMessage pingReqMessage19 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.PingReqMessage pingReqMessage20 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.SubAckMessage subAckMessage21 = new org.meqantt.message.SubAckMessage(header12);
        org.meqantt.message.Message.Header header23 = null;
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage(header23);
        boolean boolean25 = connectMessage24.isWillRetained();
        boolean boolean26 = connectMessage24.isWillRetained();
        java.lang.String str27 = connectMessage24.getUsername();
        boolean boolean28 = connectMessage24.isCleanSession();
        java.lang.String str29 = connectMessage24.getWill();
        boolean boolean30 = connectMessage24.hasUsername();
        java.lang.String str31 = connectMessage24.getProtocolId();
        org.meqantt.message.Message.Header header34 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage(header34);
        org.meqantt.message.QoS qoS37 = null;
        subscribeMessage35.addTopic("hi!", qoS37);
        java.util.List<org.meqantt.message.QoS> qoSList39 = subscribeMessage35.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage45 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str46 = connectMessage45.getUsername();
        org.meqantt.message.QoS qoS50 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("", qoS50);
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList54 = subscribeMessage53.getTopics();
        org.meqantt.message.QoS qoS55 = subscribeMessage53.getQos();
        subscribeMessage51.addTopic("", qoS55);
        connectMessage45.setWill("", "\000d\000\001\001d", qoS55, true);
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("hi!", qoS55);
        subscribeMessage35.addTopic("\000d\000\001\001d", qoS55);
        connectMessage24.setWill("\000d\000\001\001d", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS55, false);
        org.meqantt.message.SubscribeMessage subscribeMessage63 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS55);
        subAckMessage21.addQoS(qoS55);
        org.meqantt.message.SubscribeMessage subscribeMessage65 = new org.meqantt.message.SubscribeMessage("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", qoS55);
        org.meqantt.message.SubscribeMessage subscribeMessage66 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS55);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage8.setQos(qoS55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str7, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MQIsdp" + "'", str31, "MQIsdp");
        org.junit.Assert.assertNotNull(qoSList39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17725");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\ufffd\ufffd\ufffd 162\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 00000100 \004 4\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n", false, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: ??00: 10100010 ?? 162?01: 00001000 ? 8?02: 00000000 ?? 0?03: 00000000 ?? 0?04: 00000000 ?? 0?05: 00000100 ? 4?06: 11000000 ?? 192?07: 10000000 ?? 128?08: 11000000 ?? 192?09: 10000000 ?? 128?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17726");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage5 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type6 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type6.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17727");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage9 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage10 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage12 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage12.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17728");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subscribeMessage0.getTopicQoSs();
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header5);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header5);
        org.meqantt.message.PubAckMessage pubAckMessage8 = new org.meqantt.message.PubAckMessage(header5);
        org.meqantt.message.PublishMessage publishMessage9 = new org.meqantt.message.PublishMessage(header5);
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header5);
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header5);
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
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage24 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList25 = unsubscribeMessage24.getTopics();
        org.meqantt.message.Message.Type type26 = unsubscribeMessage24.getType();
        java.util.List<java.lang.String> strList27 = unsubscribeMessage24.getTopics();
        org.meqantt.message.QoS qoS28 = unsubscribeMessage24.getQos();
        subscribeMessage21.setQos(qoS28);
        subAckMessage11.addQoS(qoS28);
        subscribeMessage0.setQos(qoS28);
        byte[] byteArray35 = org.meqantt.util.FormatUtil.toMQttString("");
        java.lang.String str36 = org.meqantt.util.FormatUtil.toString(byteArray35);
        org.meqantt.message.PublishMessage publishMessage37 = new org.meqantt.message.PublishMessage("hi!", byteArray35);
        publishMessage37.setMessageId((int) '\001');
        byte[] byteArray40 = publishMessage37.getData();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage42 = new org.meqantt.message.UnsubscribeMessage("\000\000");
        org.meqantt.message.Message.Header header44 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type45 = header44.getType();
        org.meqantt.message.Message.Type type46 = header44.getType();
        org.meqantt.message.SubAckMessage subAckMessage47 = new org.meqantt.message.SubAckMessage(header44);
        org.meqantt.message.PingReqMessage pingReqMessage48 = new org.meqantt.message.PingReqMessage(header44);
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage(header44);
        org.meqantt.message.ConnectMessage connectMessage50 = new org.meqantt.message.ConnectMessage(header44);
        org.meqantt.message.PingReqMessage pingReqMessage51 = new org.meqantt.message.PingReqMessage(header44);
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage(header44);
        java.util.List<java.lang.String> strList53 = subscribeMessage52.getTopics();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage55 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList56 = unsubscribeMessage55.getTopics();
        org.meqantt.message.Message.Type type57 = unsubscribeMessage55.getType();
        java.util.List<java.lang.String> strList58 = unsubscribeMessage55.getTopics();
        org.meqantt.message.QoS qoS59 = unsubscribeMessage55.getQos();
        subscribeMessage52.setQos(qoS59);
        unsubscribeMessage42.setQos(qoS59);
        publishMessage37.setQos(qoS59);
        subscribeMessage0.addTopic("\000\000", qoS59);
        java.util.List<java.lang.String> strList64 = subscribeMessage0.getTopics();
        subscribeMessage0.setDup(false);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList3);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type26.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0]");
        org.junit.Assert.assertNull(type45);
        org.junit.Assert.assertNull(type46);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + type57 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type57.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + qoS59 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS59.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList64);
    }

    @Test
    public void test17729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17729");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        java.lang.String str6 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str9 = publishMessage8.getTopic();
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17730");
        org.meqantt.message.SubAckMessage subAckMessage1 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList4 = subscribeMessage3.getTopics();
        org.meqantt.message.QoS qoS5 = subscribeMessage3.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("", qoS5);
        subAckMessage1.addQoS(qoS5);
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage1.getGrantedQoSs();
        boolean boolean9 = subAckMessage1.isRetained();
        org.meqantt.message.Message.Header header11 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage12 = new org.meqantt.message.PubAckMessage(header11);
        java.lang.String str13 = header11.toString();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage(header11);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage(header11);
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str26 = connectMessage25.getUsername();
        org.meqantt.message.QoS qoS30 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("", qoS30);
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList34 = subscribeMessage33.getTopics();
        org.meqantt.message.QoS qoS35 = subscribeMessage33.getQos();
        subscribeMessage31.addTopic("", qoS35);
        connectMessage25.setWill("", "\000d\000\001\001d", qoS35, true);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("hi!", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage("", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS35);
        subscribeMessage15.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS35);
        subAckMessage1.addQoS(qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage("", qoS35);
        java.util.List<org.meqantt.message.QoS> qoSList47 = subscribeMessage46.getTopicQoSs();
        subscribeMessage46.setDup(false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str13, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList47);
    }

    @Test
    public void test17731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17731");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\020\ufffd\001\000\006MQIsdp\003\ufffd\000d\000\006MQIsdp\000\000\000\006MQIsdp\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]\000\ufffd\ufffd?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "00: 00000000 \000 0\n01: 00000011 \003 3\n02: 01101000 h 104\n03: 01101001 i 105\n04: 00100001 ! 33\n");
        java.lang.String str3 = publishMessage2.getTopic();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\020\ufffd\001\000\006MQIsdp\003\ufffd\000d\000\006MQIsdp\000\000\000\006MQIsdp\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]\000\ufffd\ufffd?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str3, "\020\ufffd\001\000\006MQIsdp\003\ufffd\000d\000\006MQIsdp\000\000\000\006MQIsdp\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]\000\ufffd\ufffd?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test17732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17732");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        java.lang.String str3 = connectMessage1.getPassword();
        java.lang.String str4 = connectMessage1.getPassword();
        boolean boolean5 = connectMessage1.hasPassword();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17733");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage4 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header6 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type7 = header6.getType();
        org.meqantt.message.Message.Type type8 = header6.getType();
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header6);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header6);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header6);
        org.meqantt.message.DisconnectMessage disconnectMessage12 = new org.meqantt.message.DisconnectMessage(header6);
        org.meqantt.message.DisconnectMessage disconnectMessage13 = new org.meqantt.message.DisconnectMessage(header6);
        org.meqantt.message.PubAckMessage pubAckMessage14 = new org.meqantt.message.PubAckMessage(header6);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage15 = new org.meqantt.message.UnsubscribeMessage(header6);
        org.meqantt.message.UnsubAckMessage unsubAckMessage16 = new org.meqantt.message.UnsubAckMessage(header6);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage17 = new org.meqantt.message.UnsubscribeMessage(header6);
        unsubscribeMessage17.addTopic("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdD00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str25 = connectMessage24.getClientId();
        boolean boolean26 = connectMessage24.hasUsername();
        int int27 = connectMessage24.getKeepAlive();
        org.meqantt.message.Message.Header header32 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage33 = new org.meqantt.message.PingReqMessage(header32);
        org.meqantt.message.PubCompMessage pubCompMessage34 = new org.meqantt.message.PubCompMessage(header32);
        org.meqantt.message.SubAckMessage subAckMessage35 = new org.meqantt.message.SubAckMessage(header32);
        org.meqantt.message.SubAckMessage subAckMessage36 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList37 = subAckMessage36.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList38 = subAckMessage36.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage42 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str43 = connectMessage42.getProtocolId();
        org.meqantt.message.QoS qoS44 = connectMessage42.getQos();
        subAckMessage36.addQoS(qoS44);
        org.meqantt.message.ConnectMessage connectMessage49 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean50 = connectMessage49.hasWill();
        java.lang.String str51 = connectMessage49.getWill();
        org.meqantt.message.Message.Header header54 = null;
        org.meqantt.message.ConnectMessage connectMessage55 = new org.meqantt.message.ConnectMessage(header54);
        boolean boolean56 = connectMessage55.isWillRetained();
        boolean boolean57 = connectMessage55.isWillRetained();
        java.lang.String str58 = connectMessage55.getUsername();
        org.meqantt.message.QoS qoS62 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage63 = new org.meqantt.message.SubscribeMessage("", qoS62);
        org.meqantt.message.SubscribeMessage subscribeMessage65 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList66 = subscribeMessage65.getTopics();
        org.meqantt.message.QoS qoS67 = subscribeMessage65.getQos();
        subscribeMessage63.addTopic("", qoS67);
        connectMessage55.setWill("hi!", "", qoS67, false);
        connectMessage49.setWill("MQIsdp", "hi!", qoS67, false);
        org.meqantt.message.SubAckMessage subAckMessage75 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList76 = subAckMessage75.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList77 = subAckMessage75.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList78 = subAckMessage75.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage80 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList81 = subscribeMessage80.getTopics();
        org.meqantt.message.QoS qoS82 = subscribeMessage80.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage83 = new org.meqantt.message.SubscribeMessage("", qoS82);
        subAckMessage75.addQoS(qoS82);
        connectMessage49.setWill("hi!", "MQIsdp", qoS82, true);
        subAckMessage36.addQoS(qoS82);
        subAckMessage35.addQoS(qoS82);
        org.meqantt.message.SubscribeMessage subscribeMessage89 = new org.meqantt.message.SubscribeMessage("\000\003hi!", qoS82);
        connectMessage24.setWill("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", qoS82, true);
        org.meqantt.message.SubscribeMessage subscribeMessage92 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 00010011 \023 19\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 00001000 \b 8\n05: 11101111 \357 239\n06: 10111111 \277 191\n07: 10111101 \275 189\n08: 11101111 \357 239\n09: 10111111 \277 191\n10: 10111101 \275 189\n11: 01100100 d 100\n12: 11101111 \357 239\n13: 10111111 \277 191\n14: 10111101 \275 189\n15: 11101111 \357 239\n16: 10111111 \277 191\n17: 10111101 \275 189\n18: 00000001 \001 1\n19: 00000001 \001 1\n20: 01100100 d 100\n", qoS82);
        org.meqantt.message.QoS qoS93 = subscribeMessage92.getQos();
        unsubscribeMessage17.setQos(qoS93);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage4.setQos(qoS93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(qoSList37);
        org.junit.Assert.assertNull(qoSList38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "MQIsdp" + "'", str43, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS44 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS44.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + qoS67 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS67.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList76);
        org.junit.Assert.assertNull(qoSList77);
        org.junit.Assert.assertNull(qoSList78);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertTrue("'" + qoS82 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS82.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS93 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS93.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17734");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        java.lang.String str8 = header1.toString();
        java.lang.Class<?> wildcardClass9 = header1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17735");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_LEAST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_LEAST_ONCE, dup=false]");
    }

    @Test
    public void test17736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17736");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\ufffd\ufffd\ufffd 162\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 00000100 \004 4\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n", false, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: ??00: 10100010 ?? 162?01: 00001000 ? 8?02: 00000000 ?? 0?03: 00000000 ?? 0?04: 00000000 ?? 0?05: 00000100 ? 4?06: 11000000 ?? 192?07: 10000000 ?? 128?08: 11000000 ?? 192?09: 10000000 ?? 128?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17737");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        java.util.List<org.meqantt.message.QoS> qoSList11 = subscribeMessage0.getTopicQoSs();
        byte[] byteArray12 = subscribeMessage0.toBytes();
        subscribeMessage0.setDup(false);
        subscribeMessage0.setMessageId((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-128, 5, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test17738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17738");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17739");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", false, (-1));
        boolean boolean4 = connectMessage3.hasUsername();
        boolean boolean5 = connectMessage3.isRetained();
        java.lang.String str6 = connectMessage3.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
    }

    @Test
    public void test17740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17740");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.Message.Type type6 = header1.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test17741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17741");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        connectMessage1.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS6 = connectMessage1.getWillQoS();
        boolean boolean7 = connectMessage1.hasUsername();
        int int8 = connectMessage1.getKeepAlive();
        connectMessage1.setCredentials("\000\003hi!", "MQIsdp");
        byte byte12 = connectMessage1.getProtocolVersion();
        boolean boolean13 = connectMessage1.isCleanSession();
        connectMessage1.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "\001\ufffd00: 00010000 \020 16\n01: 00011010 \032 26\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n19: 00001000 \b 8\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n22: 01100100 d 100\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 3 + "'", byte12 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17742");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("", byteArray7);
        java.lang.String str9 = publishMessage8.getDataAsString();
        byte[] byteArray10 = publishMessage8.getData();
        byte[] byteArray11 = publishMessage8.getData();
        java.lang.String str12 = org.meqantt.util.FormatUtil.toString(byteArray11);
        java.lang.String str13 = org.meqantt.util.FormatUtil.toString(byteArray11);
        java.lang.String str14 = org.meqantt.util.FormatUtil.toString(byteArray11);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000d\000\001\001d" + "'", str9, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17743");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.UnsubAckMessage unsubAckMessage5 = new org.meqantt.message.UnsubAckMessage(header3);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header3);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17744");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        boolean boolean9 = connectMessage1.hasUsername();
        connectMessage1.setCredentials("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", "");
        boolean boolean13 = connectMessage1.hasWill();
        java.lang.String str14 = connectMessage1.getClientId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17745");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
    }

    @Test
    public void test17746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17746");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str11 = connectMessage10.getUsername();
        java.lang.String str12 = connectMessage10.getWill();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17747");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17748");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getProtocolId();
        java.lang.String str5 = connectMessage1.getWillTopic();
        java.lang.String str6 = connectMessage1.getPassword();
        boolean boolean7 = connectMessage1.isWillRetained();
        connectMessage1.setCredentials("00: 10100010 \242 162\n01: 00010111 \027 23\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00010011 \023 19\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 00001000 \b 8\n09: 11101111 \357 239\n10: 10111111 \277 191\n11: 10111101 \275 189\n12: 11101111 \357 239\n13: 10111111 \277 191\n14: 10111101 \275 189\n15: 01100100 d 100\n16: 11101111 \357 239\n17: 10111111 \277 191\n18: 10111101 \275 189\n19: 11101111 \357 239\n20: 10111111 \277 191\n21: 10111101 \275 189\n22: 00000001 \001 1\n23: 00000001 \001 1\n24: 01100100 d 100\n", "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        java.lang.String str11 = connectMessage1.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17749");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test17750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17750");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getProtocolId();
        java.lang.String str2 = connectMessage0.getClientId();
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
        connectMessage0.setWill("\000d\000\001\001d", "hi!", qoS51, true);
        boolean boolean59 = connectMessage0.isCleanSession();
        java.lang.String str60 = connectMessage0.getClientId();
        boolean boolean61 = connectMessage0.isDup();
        java.lang.String str62 = connectMessage0.getWillTopic();
        byte byte63 = connectMessage0.getProtocolVersion();
        connectMessage0.setWill("00: 00000000 \000 0\n01: 00000100 \004 4\n02: 00000001 \001 1\n03: 00000011 \003 3\n04: 00000011 \003 3\n05: 00000001 \001 1\n", "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MQIsdp" + "'", str1, "MQIsdp");
        org.junit.Assert.assertNull(str2);
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\000d\000\001\001d" + "'", str62, "\000d\000\001\001d");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 3 + "'", byte63 == (byte) 3);
    }

    @Test
    public void test17751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17751");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        org.meqantt.message.QoS qoS4 = connectMessage1.getWillQoS();
        java.lang.String str5 = connectMessage1.getClientId();
        boolean boolean6 = connectMessage1.hasUsername();
        boolean boolean7 = connectMessage1.hasPassword();
        boolean boolean8 = connectMessage1.hasWill();
        java.lang.String str9 = connectMessage1.getClientId();
        java.lang.String str10 = connectMessage1.getClientId();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS11 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(qoS4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test17752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17752");
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
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage12 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage12.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17753");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage8 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage9 = new org.meqantt.message.PubCompMessage(header1);
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
            pubCompMessage9.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17754");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        int int8 = pubRecMessage7.getMessageId();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getProtocolId();
        org.meqantt.message.QoS qoS14 = connectMessage12.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage7.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17755");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.ConnAckMessage connAckMessage10 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header1);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type9.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17756");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Header header12 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage13 = new org.meqantt.message.PubAckMessage(header12);
        java.lang.String str14 = header12.toString();
        org.meqantt.message.PubRelMessage pubRelMessage15 = new org.meqantt.message.PubRelMessage(header12);
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage(header12);
        java.util.List<org.meqantt.message.QoS> qoSList17 = subAckMessage16.getGrantedQoSs();
        org.meqantt.message.QoS qoS18 = subAckMessage16.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage10.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str14, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(qoSList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17757");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        java.lang.String str4 = connectMessage3.getPassword();
        boolean boolean5 = connectMessage3.hasWill();
        connectMessage3.setCredentials("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        connectMessage3.setCredentials("00: 01100000 ` 96\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 01100100 d 100\n", "00: 00000000 \000 0\n01: 00000011 \003 3\n02: 01101000 h 104\n03: 01101001 i 105\n04: 00100001 ! 33\n");
        java.lang.String str11 = connectMessage3.getWill();
        boolean boolean12 = connectMessage3.hasWill();
        java.lang.String str13 = connectMessage3.getClientId();
        int int14 = connectMessage3.getKeepAlive();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test17758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17758");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\004\001\003\003\001", true, (-1));
        java.lang.String str4 = connectMessage3.getWill();
        java.lang.String str5 = connectMessage3.getClientId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\004\001\003\003\001" + "'", str5, "\000\004\001\003\003\001");
    }

    @Test
    public void test17759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17759");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "\000\003hi!");
        publishMessage2.setMessageId((int) (short) 1);
    }

    @Test
    public void test17760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17760");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        java.lang.String str6 = header1.toString();
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type12 = subscribeMessage11.getType();
        org.meqantt.message.QoS qoS15 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList19 = subscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS20 = subscribeMessage18.getQos();
        subscribeMessage16.addTopic("", qoS20);
        subscribeMessage11.addTopic("MQIsdp", qoS20);
        subscribeMessage11.setDup(false);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage27 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS28 = unsubscribeMessage27.getQos();
        subscribeMessage11.addTopic("MQIsdp", qoS28);
        org.meqantt.message.ConnectMessage connectMessage34 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 0);
        java.lang.String str35 = connectMessage34.getProtocolId();
        org.meqantt.message.QoS qoS36 = connectMessage34.getQos();
        subscribeMessage11.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS36);
        java.util.List<org.meqantt.message.QoS> qoSList38 = subscribeMessage11.getTopicQoSs();
        subscribeMessage11.setDup(false);
        org.meqantt.message.Message.Header header42 = null;
        org.meqantt.message.ConnectMessage connectMessage43 = new org.meqantt.message.ConnectMessage(header42);
        boolean boolean44 = connectMessage43.isWillRetained();
        boolean boolean45 = connectMessage43.isWillRetained();
        connectMessage43.setWill("", "MQIsdp");
        boolean boolean49 = connectMessage43.isWillRetained();
        boolean boolean50 = connectMessage43.hasPassword();
        boolean boolean51 = connectMessage43.isCleanSession();
        org.meqantt.message.QoS qoS52 = connectMessage43.getWillQoS();
        subscribeMessage11.addTopic("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS52);
        connectMessage8.setWill("", "00: 00000000 \000 0\n01: 00000100 \004 4\n02: 00000001 \001 1\n03: 00000011 \003 3\n04: 00000011 \003 3\n05: 00000001 \001 1\n", qoS52, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type12.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MQIsdp" + "'", str35, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17761");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage4 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage5.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17762");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        byte byte3 = connectMessage2.getProtocolVersion();
        java.lang.String str4 = connectMessage2.getProtocolId();
        java.lang.String str5 = connectMessage2.getProtocolId();
        boolean boolean6 = connectMessage2.hasPassword();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MQIsdp" + "'", str5, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17763");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str8 = header1.toString();
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage10 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage11 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Header header14 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage15 = new org.meqantt.message.PingReqMessage(header14);
        org.meqantt.message.PubCompMessage pubCompMessage16 = new org.meqantt.message.PubCompMessage(header14);
        org.meqantt.message.PubAckMessage pubAckMessage17 = new org.meqantt.message.PubAckMessage(header14);
        java.lang.String str18 = header14.toString();
        org.meqantt.message.PublishMessage publishMessage19 = new org.meqantt.message.PublishMessage(header14);
        org.meqantt.message.UnsubAckMessage unsubAckMessage20 = new org.meqantt.message.UnsubAckMessage(header14);
        org.meqantt.message.QoS qoS21 = unsubAckMessage20.getQos();
        subAckMessage12.addQoS(qoS21);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str18, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17764");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        byte[] byteArray4 = pubAckMessage3.toBytes();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 2, 0, 0]");
    }

    @Test
    public void test17765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17765");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
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
        subAckMessage0.addQoS(qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        org.meqantt.message.QoS qoS25 = null;
        subscribeMessage21.addTopic("", qoS25);
        java.util.List<org.meqantt.message.QoS> qoSList27 = subscribeMessage21.getTopicQoSs();
        subscribeMessage21.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList30 = subscribeMessage21.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage38 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str39 = connectMessage38.getUsername();
        org.meqantt.message.QoS qoS43 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage("", qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList47 = subscribeMessage46.getTopics();
        org.meqantt.message.QoS qoS48 = subscribeMessage46.getQos();
        subscribeMessage44.addTopic("", qoS48);
        connectMessage38.setWill("", "\000d\000\001\001d", qoS48, true);
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage("hi!", qoS48);
        org.meqantt.message.SubscribeMessage subscribeMessage53 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS48);
        org.meqantt.message.SubscribeMessage subscribeMessage54 = new org.meqantt.message.SubscribeMessage("", qoS48);
        subscribeMessage21.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS48);
        subAckMessage0.addQoS(qoS48);
        java.util.List<org.meqantt.message.QoS> qoSList57 = subAckMessage0.getGrantedQoSs();
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type6.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList27);
        org.junit.Assert.assertNotNull(qoSList30);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList57);
    }

    @Test
    public void test17766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17766");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean6 = connectMessage5.hasPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17767");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        org.meqantt.message.QoS qoS4 = connectMessage1.getWillQoS();
        connectMessage1.setCredentials("00: 10100010 \242 162\n01: 00101000 ( 40\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00100100 $ 36\n06: 00110000 0 48\n07: 00110000 0 48\n08: 00111010 : 58\n09: 00100000   32\n10: 00110000 0 48\n11: 00110000 0 48\n12: 00110000 0 48\n13: 00110000 0 48\n14: 00110000 0 48\n15: 00110000 0 48\n16: 00110000 0 48\n17: 00110000 0 48\n18: 00100000   32\n19: 11000000 \300 192\n20: 10000000 \200 128\n21: 00100000   32\n22: 00110000 0 48\n23: 00001010 \n 10\n24: 00110000 0 48\n25: 00110001 1 49\n26: 00111010 : 58\n27: 00100000   32\n28: 00110000 0 48\n29: 00110000 0 48\n30: 00110000 0 48\n31: 00110000 0 48\n32: 00110000 0 48\n33: 00110000 0 48\n34: 00110000 0 48\n35: 00110000 0 48\n36: 00100000   32\n37: 11000000 \300 192\n38: 10000000 \200 128\n39: 00100000   32\n40: 00110000 0 48\n41: 00001010 \n 10\n");
        java.lang.String str7 = connectMessage1.getProtocolId();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoS4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
    }

    @Test
    public void test17768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17768");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        int int6 = unsubscribeMessage5.getMessageId();
        unsubscribeMessage5.addTopic("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        java.util.List<java.lang.String> strList9 = unsubscribeMessage5.getTopics();
        unsubscribeMessage5.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test17769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17769");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test17770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17770");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS2 = unsubscribeMessage1.getQos();
        boolean boolean3 = unsubscribeMessage1.isRetained();
        int int4 = unsubscribeMessage1.getMessageId();
        unsubscribeMessage1.setMessageId((int) (short) 1);
        org.meqantt.message.Message.Type type7 = unsubscribeMessage1.getType();
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type7.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
    }

    @Test
    public void test17771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17771");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage5 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage7 = new org.meqantt.message.PubRelMessage(header1);
    }

    @Test
    public void test17772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17772");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage2.getStatus();
        org.meqantt.message.QoS qoS5 = connAckMessage2.getQos();
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
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setQos(qoS58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus4 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus4.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
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
    public void test17773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17773");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        org.meqantt.message.QoS qoS4 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        subscribeMessage5.addTopic("", qoS9);
        subscribeMessage0.addTopic("MQIsdp", qoS9);
        subscribeMessage0.setDup(false);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage16 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS17 = unsubscribeMessage16.getQos();
        subscribeMessage0.addTopic("MQIsdp", qoS17);
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 0);
        java.lang.String str24 = connectMessage23.getProtocolId();
        org.meqantt.message.QoS qoS25 = connectMessage23.getQos();
        subscribeMessage0.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS25);
        java.util.List<org.meqantt.message.QoS> qoSList27 = subscribeMessage0.getTopicQoSs();
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
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MQIsdp" + "'", str24, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList27);
    }

    @Test
    public void test17774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17774");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str9 = connectMessage8.getProtocolId();
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
    }

    @Test
    public void test17775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17775");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 10);
        boolean boolean4 = connectMessage3.hasPassword();
        int int5 = connectMessage3.getKeepAlive();
        java.lang.String str6 = connectMessage3.getPassword();
        java.lang.String str7 = connectMessage3.getPassword();
        byte byte8 = connectMessage3.getProtocolVersion();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 3 + "'", byte8 == (byte) 3);
    }

    @Test
    public void test17776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17776");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage6 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type8 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage9 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage10 = new org.meqantt.message.PingReqMessage(header1);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type8.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17777");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage6 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type8 = header1.getType();
        org.meqantt.message.ConnAckMessage connAckMessage9 = new org.meqantt.message.ConnAckMessage(header1);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type8.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17778");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        int int5 = connectMessage3.getKeepAlive();
        java.lang.String str6 = connectMessage3.getWillTopic();
        java.lang.String str7 = connectMessage3.getClientId();
        connectMessage3.setCredentials("\ufffd(\000\000\000\ufffd\ufffd 0\n\ufffd\ufffd 0\n");
        int int10 = connectMessage3.getKeepAlive();
        java.lang.String str11 = connectMessage3.getUsername();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd(\000\000\000\ufffd\ufffd 0\n\ufffd\ufffd 0\n" + "'", str11, "\ufffd(\000\000\000\ufffd\ufffd 0\n\ufffd\ufffd 0\n");
    }

    @Test
    public void test17779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17779");
        byte[] byteArray2 = org.meqantt.util.FormatUtil.toMQttString("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        java.lang.String str3 = org.meqantt.util.FormatUtil.toString(byteArray2);
        org.meqantt.message.PublishMessage publishMessage4 = new org.meqantt.message.PublishMessage("\001\003\003\001", byteArray2);
        org.meqantt.message.Message.Type type5 = publishMessage4.getType();
        boolean boolean6 = publishMessage4.isDup();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 61, 72, 101, 97, 100, 101, 114, 32, 91, 116, 121, 112, 101, 61, 110, 117, 108, 108, 44, 32, 114, 101, 116, 97, 105, 110, 61, 102, 97, 108, 115, 101, 44, 32, 113, 111, 115, 61, 65, 84, 95, 77, 79, 83, 84, 95, 79, 78, 67, 69, 44, 32, 100, 117, 112, 61, 102, 97, 108, 115, 101, 93]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.PUBLISH + "'", type5.equals(org.meqantt.message.Message.Type.PUBLISH));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17780");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage8 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage10 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage11 = new org.meqantt.message.UnsubAckMessage(header1);
    }

    @Test
    public void test17781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17781");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        java.lang.String str4 = connectMessage2.getWillTopic();
        org.meqantt.message.QoS qoS5 = connectMessage2.getWillQoS();
        connectMessage2.setWill("\000d\000\001\001d", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(qoS5);
    }

    @Test
    public void test17782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17782");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        java.lang.String str7 = header1.toString();
        org.meqantt.message.PubRelMessage pubRelMessage8 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header11);
        boolean boolean13 = connectMessage12.isWillRetained();
        boolean boolean14 = connectMessage12.isWillRetained();
        connectMessage12.setWill("", "MQIsdp");
        boolean boolean18 = connectMessage12.isWillRetained();
        java.lang.String str19 = connectMessage12.getClientId();
        java.lang.String str20 = connectMessage12.getWill();
        boolean boolean21 = connectMessage12.hasUsername();
        java.lang.String str22 = connectMessage12.getWillTopic();
        org.meqantt.message.QoS qoS23 = connectMessage12.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("hi!", qoS23);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList27 = subscribeMessage26.getTopics();
        java.util.List<java.lang.String> strList28 = subscribeMessage26.getTopics();
        java.util.List<java.lang.String> strList29 = subscribeMessage26.getTopics();
        org.meqantt.message.Message.Header header32 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str33 = header32.toString();
        org.meqantt.message.SubAckMessage subAckMessage34 = new org.meqantt.message.SubAckMessage(header32);
        org.meqantt.message.PublishMessage publishMessage35 = new org.meqantt.message.PublishMessage(header32);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage38 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS39 = unsubscribeMessage38.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("", qoS39);
        publishMessage35.setQos(qoS39);
        subscribeMessage26.addTopic("", qoS39);
        subscribeMessage24.addTopic("\000\ufffd\ufffd\ufffd 162\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 00000100 \004 4\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n\ufffd\ufffd 192\n\ufffd\ufffd 128\n", qoS39);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str7, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str33, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17783");
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
        java.util.List<java.lang.String> strList19 = subscribeMessage6.getTopics();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type18.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test17784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17784");
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage();
        java.lang.String str2 = connectMessage1.getProtocolId();
        java.lang.String str3 = connectMessage1.getClientId();
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
        connectMessage1.setWill("\000d\000\001\001d", "hi!", qoS52, true);
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS52);
        int int61 = subscribeMessage60.getMessageId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MQIsdp" + "'", str2, "MQIsdp");
        org.junit.Assert.assertNull(str3);
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test17785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17785");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        boolean boolean4 = connectMessage2.hasWill();
        java.lang.String str5 = connectMessage2.getUsername();
        connectMessage2.setWill("00: 00000011 \003 3\n01: 00000000 \000 0\n", "\020\032\000\006MQIsdp\003&\000\001\000\000\000\000\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        boolean boolean9 = connectMessage2.isRetained();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test17786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17786");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.junit.Assert.assertNull(type4);
    }

    @Test
    public void test17787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17787");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        java.lang.String str6 = header1.toString();
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage8 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage9.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17788");
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
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage12 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage12.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17789");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        int int3 = subscribeMessage2.getMessageId();
        subscribeMessage2.setMessageId((int) (short) 10);
        subscribeMessage2.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList8 = subscribeMessage2.getTopicQoSs();
        subscribeMessage2.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(qoSList8);
    }

    @Test
    public void test17790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17790");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage9 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage9.addTopic("\000\006MQIsdp");
    }

    @Test
    public void test17791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17791");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("");
        connectMessage1.setCredentials("hi!", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.message.QoS qoS7 = connectMessage1.getWillQoS();
        java.lang.String str8 = connectMessage1.getWillTopic();
        boolean boolean9 = connectMessage1.hasUsername();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoS7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test17792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17792");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage10 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage12 = new org.meqantt.message.PingRespMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17793");
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
        org.meqantt.message.UnsubAckMessage unsubAckMessage11 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage12 = new org.meqantt.message.PubRecMessage(header1);
        int int13 = pubRecMessage12.getMessageId();
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
        byte byte41 = connectMessage17.getProtocolVersion();
        org.meqantt.message.ConnectMessage connectMessage48 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean49 = connectMessage48.hasWill();
        java.lang.String str50 = connectMessage48.getWill();
        org.meqantt.message.Message.Header header53 = null;
        org.meqantt.message.ConnectMessage connectMessage54 = new org.meqantt.message.ConnectMessage(header53);
        boolean boolean55 = connectMessage54.isWillRetained();
        boolean boolean56 = connectMessage54.isWillRetained();
        java.lang.String str57 = connectMessage54.getUsername();
        org.meqantt.message.QoS qoS61 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage62 = new org.meqantt.message.SubscribeMessage("", qoS61);
        org.meqantt.message.SubscribeMessage subscribeMessage64 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList65 = subscribeMessage64.getTopics();
        org.meqantt.message.QoS qoS66 = subscribeMessage64.getQos();
        subscribeMessage62.addTopic("", qoS66);
        connectMessage54.setWill("hi!", "", qoS66, false);
        connectMessage48.setWill("MQIsdp", "hi!", qoS66, false);
        org.meqantt.message.SubscribeMessage subscribeMessage72 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS66);
        connectMessage17.setWill("", "MQIsdp", qoS66, false);
        connectMessage17.setCredentials("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        boolean boolean78 = connectMessage17.isWillRetained();
        java.lang.String str79 = connectMessage17.getPassword();
        boolean boolean80 = connectMessage17.isDup();
        java.lang.String str81 = connectMessage17.getPassword();
        connectMessage17.setCredentials("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.QoS qoS84 = connectMessage17.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage12.setQos(qoS84);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 3 + "'", byte41 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + qoS66 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS66.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str79, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str81, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.junit.Assert.assertTrue("'" + qoS84 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS84.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17794");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean9 = connectMessage8.isCleanSession();
        java.lang.String str10 = connectMessage8.getClientId();
        java.lang.String str11 = connectMessage8.getClientId();
        java.lang.String str12 = connectMessage8.getWillTopic();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test17795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17795");
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
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage13 = new org.meqantt.message.DisconnectMessage(header1);
        java.lang.String str14 = header1.toString();
        org.meqantt.message.PubAckMessage pubAckMessage15 = new org.meqantt.message.PubAckMessage(header1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str14, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17796");
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
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList23 = subscribeMessage22.getTopics();
        org.meqantt.message.QoS qoS24 = subscribeMessage22.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage("", qoS24);
        org.meqantt.message.SubscribeMessage subscribeMessage26 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS24);
        org.meqantt.message.QoS qoS27 = subscribeMessage26.getQos();
        org.meqantt.message.ConnectMessage connectMessage32 = new org.meqantt.message.ConnectMessage("\000\000", false, (int) (short) -1);
        org.meqantt.message.ConnectMessage connectMessage43 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str44 = connectMessage43.getUsername();
        org.meqantt.message.QoS qoS48 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("", qoS48);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList52 = subscribeMessage51.getTopics();
        org.meqantt.message.QoS qoS53 = subscribeMessage51.getQos();
        subscribeMessage49.addTopic("", qoS53);
        connectMessage43.setWill("", "\000d\000\001\001d", qoS53, true);
        org.meqantt.message.SubscribeMessage subscribeMessage57 = new org.meqantt.message.SubscribeMessage("hi!", qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("", qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage60 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS53);
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS53);
        connectMessage32.setWill("00: 00000000 \000 0\n01: 00001000 \b 8\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 01100100 d 100\n05: 11000000 \300 192\n06: 10000000 \200 128\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS53, false);
        subscribeMessage26.addTopic("00: 01100100 d 100\n01: 00000000 \000 0\n", qoS53);
        subAckMessage0.addQoS(qoS53);
        java.util.List<org.meqantt.message.QoS> qoSList66 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList67 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList68 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.Message.Type type69 = subAckMessage0.getType();
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + qoS53 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS53.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList66);
        org.junit.Assert.assertNotNull(qoSList67);
        org.junit.Assert.assertNotNull(qoSList68);
        org.junit.Assert.assertTrue("'" + type69 + "' != '" + org.meqantt.message.Message.Type.SUBACK + "'", type69.equals(org.meqantt.message.Message.Type.SUBACK));
    }

    @Test
    public void test17797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17797");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage7 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage7.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test17798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17798");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
    }

    @Test
    public void test17799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17799");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        int int6 = unsubscribeMessage5.getMessageId();
        unsubscribeMessage5.setDup(false);
        org.meqantt.message.Message.Type type9 = unsubscribeMessage5.getType();
        unsubscribeMessage5.setMessageId((int) (byte) -1);
        java.util.List<java.lang.String> strList12 = unsubscribeMessage5.getTopics();
        unsubscribeMessage5.setDup(false);
        unsubscribeMessage5.addTopic("\001\03700: 00010000 \020 16\n01: 00001110 \016 14\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000010 \002 2\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test17800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17800");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\001\03700: 00010000 \020 16\n01: 00001110 \016 14\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000010 \002 2\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n", 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??00: 00010000 ? 16?01: 00001110 ? 14?02: 00000000 ?? 0?03: 00000110 ? 6?04: 01001101 M 77?05: 01010001 Q 81?06: 01001001 I 73?07: 01110011 s 115?08: 01100100 d 100?09: 01110000 p 112?10: 00000011 ? 3?11: 00000010 ? 2?12: 00000000 ?? 0?13: 00000001 ? 1?14: 00000000 ?? 0?15: 00000000 ?? 0?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17801");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) 100);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header3);
        byte byte5 = connectMessage4.getProtocolVersion();
        boolean boolean6 = connectMessage4.hasUsername();
        java.lang.String str7 = connectMessage4.getWill();
        boolean boolean8 = connectMessage4.isRetained();
        connectMessage4.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type14 = subscribeMessage13.getType();
        org.meqantt.message.QoS qoS17 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage18 = new org.meqantt.message.SubscribeMessage("", qoS17);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList21 = subscribeMessage20.getTopics();
        org.meqantt.message.QoS qoS22 = subscribeMessage20.getQos();
        subscribeMessage18.addTopic("", qoS22);
        subscribeMessage13.addTopic("MQIsdp", qoS22);
        org.meqantt.message.UnsubAckMessage unsubAckMessage26 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS27 = unsubAckMessage26.getQos();
        subscribeMessage13.addTopic("", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList32 = subscribeMessage31.getTopics();
        org.meqantt.message.QoS qoS33 = subscribeMessage31.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS33);
        org.meqantt.message.QoS qoS36 = subscribeMessage35.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList41 = subscribeMessage40.getTopics();
        org.meqantt.message.QoS qoS42 = subscribeMessage40.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("", qoS42);
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS42);
        org.meqantt.message.QoS qoS45 = subscribeMessage44.getQos();
        subscribeMessage35.addTopic("", qoS45);
        subscribeMessage13.setQos(qoS45);
        connectMessage4.setWill("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", "", qoS45, false);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type14.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + qoS42 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS42.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS45 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS45.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17802");
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
        org.meqantt.message.PublishMessage publishMessage11 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str13 = connectMessage12.getWillTopic();
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17803");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
    }

    @Test
    public void test17804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17804");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 00000000 \000 0\n01: 00010111 \027 23\n02: 11101111 \357 239\n03: 10111111 \277 191\n04: 10111101 \275 189\n05: 00001000 \b 8\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n10: 11000000 \300 192\n11: 10000000 \200 128\n12: 00000100 \004 4\n13: 11101111 \357 239\n14: 10111111 \277 191\n15: 10111101 \275 189\n16: 11101111 \357 239\n17: 10111111 \277 191\n18: 10111101 \275 189\n19: 11101111 \357 239\n20: 10111111 \277 191\n21: 10111101 \275 189\n22: 11101111 \357 239\n23: 10111111 \277 191\n24: 10111101 \275 189\n", "00: 10100010 \242 162\n01: 00001111 \017 15\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000011 \003 3\n06: 01101000 h 104\n07: 01101001 i 105\n08: 00100001 ! 33\n09: 00000000 \000 0\n10: 00000110 \006 6\n11: 01001101 M 77\n12: 01010001 Q 81\n13: 01001001 I 73\n14: 01110011 s 115\n15: 01100100 d 100\n16: 01110000 p 112\n");
    }

    @Test
    public void test17805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17805");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage2.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str9 = connectMessage8.getProtocolId();
        boolean boolean10 = connectMessage8.hasUsername();
        java.lang.String str11 = connectMessage8.getWillTopic();
        int int12 = connectMessage8.getKeepAlive();
        java.lang.String str13 = connectMessage8.getProtocolId();
        connectMessage8.setCredentials("\000\004\001\003\003\001", "");
        org.meqantt.message.Message.Header header21 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage22 = new org.meqantt.message.PingReqMessage(header21);
        org.meqantt.message.PubCompMessage pubCompMessage23 = new org.meqantt.message.PubCompMessage(header21);
        org.meqantt.message.SubAckMessage subAckMessage24 = new org.meqantt.message.SubAckMessage(header21);
        org.meqantt.message.SubAckMessage subAckMessage25 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList26 = subAckMessage25.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList27 = subAckMessage25.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str32 = connectMessage31.getProtocolId();
        org.meqantt.message.QoS qoS33 = connectMessage31.getQos();
        subAckMessage25.addQoS(qoS33);
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
        org.meqantt.message.SubAckMessage subAckMessage64 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList65 = subAckMessage64.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList66 = subAckMessage64.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList67 = subAckMessage64.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage69 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList70 = subscribeMessage69.getTopics();
        org.meqantt.message.QoS qoS71 = subscribeMessage69.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage72 = new org.meqantt.message.SubscribeMessage("", qoS71);
        subAckMessage64.addQoS(qoS71);
        connectMessage38.setWill("hi!", "MQIsdp", qoS71, true);
        subAckMessage25.addQoS(qoS71);
        subAckMessage24.addQoS(qoS71);
        org.meqantt.message.SubscribeMessage subscribeMessage78 = new org.meqantt.message.SubscribeMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS71);
        connectMessage8.setWill("00: 10000000 \200 128\n01: 00001011 \013 11\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000110 \006 6\n06: 01001101 M 77\n07: 01010001 Q 81\n08: 01001001 I 73\n09: 01110011 s 115\n10: 01100100 d 100\n11: 01110000 p 112\n12: 00000000 \000 0\n", "\000<Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS71, false);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage2.setQos(qoS71);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertNull(qoSList26);
        org.junit.Assert.assertNull(qoSList27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "MQIsdp" + "'", str32, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + qoS56 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS56.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList65);
        org.junit.Assert.assertNull(qoSList66);
        org.junit.Assert.assertNull(qoSList67);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + qoS71 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS71.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17806");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.Message.Type type9 = header1.getType();
        org.meqantt.message.PublishMessage publishMessage10 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage11 = new org.meqantt.message.PubRelMessage(header1);
        boolean boolean12 = pubRelMessage11.isRetained();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17807");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.Message.Header header10 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type11 = header10.getType();
        org.meqantt.message.Message.Type type12 = header10.getType();
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header10);
        org.meqantt.message.PingReqMessage pingReqMessage14 = new org.meqantt.message.PingReqMessage(header10);
        org.meqantt.message.PingReqMessage pingReqMessage15 = new org.meqantt.message.PingReqMessage(header10);
        org.meqantt.message.DisconnectMessage disconnectMessage16 = new org.meqantt.message.DisconnectMessage(header10);
        org.meqantt.message.DisconnectMessage disconnectMessage17 = new org.meqantt.message.DisconnectMessage(header10);
        org.meqantt.message.PubAckMessage pubAckMessage18 = new org.meqantt.message.PubAckMessage(header10);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage19 = new org.meqantt.message.UnsubscribeMessage(header10);
        java.util.List<java.lang.String> strList20 = unsubscribeMessage19.getTopics();
        java.util.List<java.lang.String> strList21 = unsubscribeMessage19.getTopics();
        org.meqantt.message.Message.Type type22 = unsubscribeMessage19.getType();
        org.meqantt.message.Message.Header header24 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage25 = new org.meqantt.message.SubAckMessage(header24);
        org.meqantt.message.ConnAckMessage connAckMessage26 = new org.meqantt.message.ConnAckMessage(header24);
        org.meqantt.message.PubAckMessage pubAckMessage27 = new org.meqantt.message.PubAckMessage(header24);
        org.meqantt.message.QoS qoS28 = pubAckMessage27.getQos();
        unsubscribeMessage19.setQos(qoS28);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage8.setQos(qoS28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(type22);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17808");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.lang.String str6 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage7.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17809");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header1);
    }

    @Test
    public void test17810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17810");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test17811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17811");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage10 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Header header11 = null;
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header11);
        boolean boolean13 = connectMessage12.isWillRetained();
        boolean boolean14 = connectMessage12.isWillRetained();
        connectMessage12.setWill("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        connectMessage12.setCredentials("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS27);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS27);
        org.meqantt.message.QoS qoS30 = subscribeMessage29.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList35 = subscribeMessage34.getTopics();
        org.meqantt.message.QoS qoS36 = subscribeMessage34.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS36);
        org.meqantt.message.QoS qoS39 = subscribeMessage38.getQos();
        subscribeMessage29.addTopic("", qoS39);
        org.meqantt.message.PublishMessage publishMessage44 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        org.meqantt.message.QoS qoS45 = publishMessage44.getQos();
        subscribeMessage29.addTopic("", qoS45);
        connectMessage12.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "hi!", qoS45, false);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage10.setQos(qoS45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS45 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS45.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17812");
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", "00: 10100010 \242 162\n01: 00101000 ( 40\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00100100 $ 36\n06: 00110000 0 48\n07: 00110000 0 48\n08: 00111010 : 58\n09: 00100000   32\n10: 00110000 0 48\n11: 00110000 0 48\n12: 00110000 0 48\n13: 00110000 0 48\n14: 00110000 0 48\n15: 00110000 0 48\n16: 00110000 0 48\n17: 00110000 0 48\n18: 00100000   32\n19: 11000000 \300 192\n20: 10000000 \200 128\n21: 00100000   32\n22: 00110000 0 48\n23: 00001010 \n 10\n24: 00110000 0 48\n25: 00110001 1 49\n26: 00111010 : 58\n27: 00100000   32\n28: 00110000 0 48\n29: 00110000 0 48\n30: 00110000 0 48\n31: 00110000 0 48\n32: 00110000 0 48\n33: 00110000 0 48\n34: 00110000 0 48\n35: 00110000 0 48\n36: 00100000   32\n37: 11000000 \300 192\n38: 10000000 \200 128\n39: 00100000   32\n40: 00110000 0 48\n41: 00001010 \n 10\n");
        byte[] byteArray4 = publishMessage3.getData();
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage("\000d\000\001\001d", byteArray4);
        java.lang.String str6 = publishMessage5.getTopic();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000d\000\001\001d" + "'", str6, "\000d\000\001\001d");
    }

    @Test
    public void test17813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17813");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        java.lang.String str6 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17814");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage5 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
    }

    @Test
    public void test17815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17815");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage11 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.QoS qoS13 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        int int15 = subscribeMessage14.getMessageId();
        subscribeMessage14.setMessageId((int) (short) 10);
        java.util.List<java.lang.String> strList18 = subscribeMessage14.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList19 = subscribeMessage14.getTopicQoSs();
        subscribeMessage14.setMessageId(32);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList24 = subscribeMessage23.getTopics();
        org.meqantt.message.QoS qoS25 = subscribeMessage23.getQos();
        org.meqantt.message.ConnectMessage connectMessage30 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str31 = connectMessage30.getProtocolId();
        org.meqantt.message.QoS qoS32 = connectMessage30.getQos();
        subscribeMessage23.addTopic("", qoS32);
        subscribeMessage14.addTopic("00: 00110000 0 48\n01: 00000111 \007 7\n02: 00000000 \000 0\n03: 00000011 \003 3\n04: 01101000 h 104\n05: 01101001 i 105\n06: 00100001 ! 33\n07: 00000000 \000 0\n08: 00000000 \000 0\n", qoS32);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage11.setQos(qoS32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(qoSList19);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MQIsdp" + "'", str31, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17816");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.QoS qoS5 = pubRecMessage4.getQos();
        boolean boolean6 = pubRecMessage4.isRetained();
        org.meqantt.message.Message.Header header7 = null;
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage(header7);
        int int9 = connectMessage8.getKeepAlive();
        java.lang.String str10 = connectMessage8.getWill();
        org.meqantt.message.QoS qoS11 = connectMessage8.getWillQoS();
        boolean boolean12 = connectMessage8.hasPassword();
        org.meqantt.message.Message.Header header17 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type18 = header17.getType();
        org.meqantt.message.Message.Type type19 = header17.getType();
        org.meqantt.message.SubAckMessage subAckMessage20 = new org.meqantt.message.SubAckMessage(header17);
        org.meqantt.message.PingReqMessage pingReqMessage21 = new org.meqantt.message.PingReqMessage(header17);
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage(header17);
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header17);
        org.meqantt.message.PingReqMessage pingReqMessage24 = new org.meqantt.message.PingReqMessage(header17);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage(header17);
        org.meqantt.message.SubAckMessage subAckMessage26 = new org.meqantt.message.SubAckMessage(header17);
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.QoS qoS29 = subscribeMessage27.getQos();
        org.meqantt.message.ConnectMessage connectMessage34 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str35 = connectMessage34.getProtocolId();
        org.meqantt.message.QoS qoS36 = connectMessage34.getQos();
        subscribeMessage27.addTopic("", qoS36);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage39 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList40 = unsubscribeMessage39.getTopics();
        org.meqantt.message.Message.Type type41 = unsubscribeMessage39.getType();
        java.util.List<java.lang.String> strList42 = unsubscribeMessage39.getTopics();
        org.meqantt.message.QoS qoS43 = unsubscribeMessage39.getQos();
        subscribeMessage27.setQos(qoS43);
        subAckMessage26.addQoS(qoS43);
        org.meqantt.message.SubscribeMessage subscribeMessage46 = new org.meqantt.message.SubscribeMessage("", qoS43);
        connectMessage8.setWill("", "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS43, false);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setQos(qoS43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(qoS11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(type19);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "MQIsdp" + "'", str35, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS36 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS36.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type41.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17817");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        unsubscribeMessage1.setMessageId((int) '4');
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header5);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage(header5);
        subscribeMessage8.setMessageId((int) (byte) 10);
        java.util.List<java.lang.String> strList11 = subscribeMessage8.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subscribeMessage8.getTopicQoSs();
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
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList41 = subscribeMessage40.getTopics();
        org.meqantt.message.ConnectMessage connectMessage46 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str47 = connectMessage46.getProtocolId();
        org.meqantt.message.QoS qoS48 = connectMessage46.getQos();
        subscribeMessage40.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS48);
        subscribeMessage38.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS48);
        org.meqantt.message.ConnectMessage connectMessage55 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean56 = connectMessage55.hasWill();
        java.lang.String str57 = connectMessage55.getWill();
        org.meqantt.message.Message.Header header60 = null;
        org.meqantt.message.ConnectMessage connectMessage61 = new org.meqantt.message.ConnectMessage(header60);
        boolean boolean62 = connectMessage61.isWillRetained();
        boolean boolean63 = connectMessage61.isWillRetained();
        java.lang.String str64 = connectMessage61.getUsername();
        org.meqantt.message.QoS qoS68 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage69 = new org.meqantt.message.SubscribeMessage("", qoS68);
        org.meqantt.message.SubscribeMessage subscribeMessage71 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList72 = subscribeMessage71.getTopics();
        org.meqantt.message.QoS qoS73 = subscribeMessage71.getQos();
        subscribeMessage69.addTopic("", qoS73);
        connectMessage61.setWill("hi!", "", qoS73, false);
        connectMessage55.setWill("MQIsdp", "hi!", qoS73, false);
        connectMessage55.setCredentials("\000d\000\001\001d");
        java.lang.String str81 = connectMessage55.getWill();
        boolean boolean82 = connectMessage55.isWillRetained();
        org.meqantt.message.QoS qoS83 = connectMessage55.getQos();
        subscribeMessage38.addTopic("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS83);
        subscribeMessage8.addTopic("\020\032\000\006MQIsdp\003&\000\001\000\000\000\000\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", qoS83);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type6.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(qoSList12);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MQIsdp" + "'", str47, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertTrue("'" + qoS73 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS73.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + qoS83 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS83.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17818");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setCredentials("\ufffd\003\000\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17819");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.QoS qoS4 = null;
        subscribeMessage0.addTopic("", qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subscribeMessage0.getTopicQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subscribeMessage0.getTopicQoSs();
        subscribeMessage0.setMessageId((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList6);
        org.junit.Assert.assertNotNull(qoSList7);
        org.junit.Assert.assertNotNull(qoSList8);
    }

    @Test
    public void test17820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17820");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        boolean boolean5 = connectMessage3.hasUsername();
        int int6 = connectMessage3.getKeepAlive();
        boolean boolean7 = connectMessage3.isCleanSession();
        java.lang.String str8 = connectMessage3.getClientId();
        connectMessage3.setCredentials("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", "\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.meqantt.message.QoS qoS12 = connectMessage3.getQos();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17821");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17822");
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
        org.meqantt.message.PublishMessage publishMessage23 = new org.meqantt.message.PublishMessage("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", byteArray22);
        boolean boolean24 = publishMessage23.isRetained();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000d\000\001\001d" + "'", str21, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17823");
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
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str14 = connectMessage13.getUsername();
        byte byte15 = connectMessage13.getProtocolVersion();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getUsername();
        int int21 = connectMessage19.getKeepAlive();
        java.lang.String str22 = connectMessage19.getWillTopic();
        boolean boolean23 = connectMessage19.isRetained();
        byte[] byteArray24 = connectMessage19.toBytes();
        org.meqantt.message.ConnectMessage connectMessage30 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean31 = connectMessage30.hasWill();
        java.lang.String str32 = connectMessage30.getUsername();
        org.meqantt.message.Message.Header header36 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type37 = header36.getType();
        org.meqantt.message.Message.Type type38 = header36.getType();
        org.meqantt.message.SubAckMessage subAckMessage39 = new org.meqantt.message.SubAckMessage(header36);
        org.meqantt.message.PingReqMessage pingReqMessage40 = new org.meqantt.message.PingReqMessage(header36);
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage(header36);
        org.meqantt.message.ConnectMessage connectMessage42 = new org.meqantt.message.ConnectMessage(header36);
        org.meqantt.message.PingReqMessage pingReqMessage43 = new org.meqantt.message.PingReqMessage(header36);
        org.meqantt.message.DisconnectMessage disconnectMessage44 = new org.meqantt.message.DisconnectMessage(header36);
        org.meqantt.message.PubCompMessage pubCompMessage45 = new org.meqantt.message.PubCompMessage(header36);
        org.meqantt.message.PublishMessage publishMessage46 = new org.meqantt.message.PublishMessage(header36);
        java.lang.String str47 = publishMessage46.getTopic();
        org.meqantt.message.ConnectMessage connectMessage51 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean52 = connectMessage51.hasWill();
        java.lang.String str53 = connectMessage51.getWill();
        org.meqantt.message.Message.Header header56 = null;
        org.meqantt.message.ConnectMessage connectMessage57 = new org.meqantt.message.ConnectMessage(header56);
        boolean boolean58 = connectMessage57.isWillRetained();
        boolean boolean59 = connectMessage57.isWillRetained();
        java.lang.String str60 = connectMessage57.getUsername();
        org.meqantt.message.QoS qoS64 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage65 = new org.meqantt.message.SubscribeMessage("", qoS64);
        org.meqantt.message.SubscribeMessage subscribeMessage67 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList68 = subscribeMessage67.getTopics();
        org.meqantt.message.QoS qoS69 = subscribeMessage67.getQos();
        subscribeMessage65.addTopic("", qoS69);
        connectMessage57.setWill("hi!", "", qoS69, false);
        connectMessage51.setWill("MQIsdp", "hi!", qoS69, false);
        org.meqantt.message.SubAckMessage subAckMessage77 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList78 = subAckMessage77.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList79 = subAckMessage77.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList80 = subAckMessage77.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage82 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList83 = subscribeMessage82.getTopics();
        org.meqantt.message.QoS qoS84 = subscribeMessage82.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage85 = new org.meqantt.message.SubscribeMessage("", qoS84);
        subAckMessage77.addQoS(qoS84);
        connectMessage51.setWill("hi!", "MQIsdp", qoS84, true);
        java.lang.String str89 = connectMessage51.getPassword();
        org.meqantt.message.QoS qoS90 = connectMessage51.getQos();
        publishMessage46.setQos(qoS90);
        connectMessage30.setWill("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", "hi!", qoS90, true);
        connectMessage19.setWill("\000=Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "\020\032\000\006MQIsdp\003&\000\001\000\000\000\000\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", qoS90, false);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage13.setQos(qoS90);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 3 + "'", byte15 == (byte) 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(type37);
        org.junit.Assert.assertNull(type38);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + qoS69 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS69.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList78);
        org.junit.Assert.assertNull(qoSList79);
        org.junit.Assert.assertNull(qoSList80);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + qoS84 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS84.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + qoS90 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS90.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test17824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17824");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 0);
        java.lang.String str4 = connectMessage3.getClientId();
        org.meqantt.message.Message.Type type5 = connectMessage3.getType();
        java.lang.String str6 = connectMessage3.getWill();
        java.lang.String str7 = connectMessage3.getWill();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS12);
        org.meqantt.message.QoS qoS15 = subscribeMessage14.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage22 = new org.meqantt.message.SubscribeMessage("", qoS21);
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS21);
        org.meqantt.message.QoS qoS24 = subscribeMessage23.getQos();
        subscribeMessage14.addTopic("", qoS24);
        org.meqantt.message.PublishMessage publishMessage29 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        org.meqantt.message.QoS qoS30 = publishMessage29.getQos();
        subscribeMessage14.addTopic("", qoS30);
        subscribeMessage14.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList34 = subscribeMessage14.getTopicQoSs();
        org.meqantt.message.Message.Header header37 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage38 = new org.meqantt.message.SubAckMessage(header37);
        org.meqantt.message.Message.Header header41 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str42 = header41.toString();
        org.meqantt.message.SubAckMessage subAckMessage43 = new org.meqantt.message.SubAckMessage(header41);
        org.meqantt.message.PublishMessage publishMessage44 = new org.meqantt.message.PublishMessage(header41);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage47 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS48 = unsubscribeMessage47.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("", qoS48);
        publishMessage44.setQos(qoS48);
        org.meqantt.message.SubscribeMessage subscribeMessage51 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS48);
        subAckMessage38.addQoS(qoS48);
        org.meqantt.message.SubAckMessage subAckMessage53 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList54 = subAckMessage53.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList55 = subAckMessage53.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList56 = subAckMessage53.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList59 = subscribeMessage58.getTopics();
        org.meqantt.message.QoS qoS60 = subscribeMessage58.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage("", qoS60);
        subAckMessage53.addQoS(qoS60);
        org.meqantt.message.QoS qoS63 = subAckMessage53.getQos();
        subAckMessage38.addQoS(qoS63);
        subscribeMessage14.addTopic("00: 01100100 d 100\n01: 00000000 \000 0\n", qoS63);
        org.meqantt.message.Message.Header header68 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type69 = header68.getType();
        org.meqantt.message.Message.Type type70 = header68.getType();
        org.meqantt.message.SubAckMessage subAckMessage71 = new org.meqantt.message.SubAckMessage(header68);
        org.meqantt.message.PingReqMessage pingReqMessage72 = new org.meqantt.message.PingReqMessage(header68);
        org.meqantt.message.SubscribeMessage subscribeMessage73 = new org.meqantt.message.SubscribeMessage(header68);
        org.meqantt.message.ConnectMessage connectMessage74 = new org.meqantt.message.ConnectMessage(header68);
        org.meqantt.message.PingReqMessage pingReqMessage75 = new org.meqantt.message.PingReqMessage(header68);
        org.meqantt.message.SubscribeMessage subscribeMessage76 = new org.meqantt.message.SubscribeMessage(header68);
        org.meqantt.message.SubAckMessage subAckMessage77 = new org.meqantt.message.SubAckMessage(header68);
        org.meqantt.message.SubscribeMessage subscribeMessage78 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList79 = subscribeMessage78.getTopics();
        org.meqantt.message.QoS qoS80 = subscribeMessage78.getQos();
        org.meqantt.message.ConnectMessage connectMessage85 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str86 = connectMessage85.getProtocolId();
        org.meqantt.message.QoS qoS87 = connectMessage85.getQos();
        subscribeMessage78.addTopic("", qoS87);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage90 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList91 = unsubscribeMessage90.getTopics();
        org.meqantt.message.Message.Type type92 = unsubscribeMessage90.getType();
        java.util.List<java.lang.String> strList93 = unsubscribeMessage90.getTopics();
        org.meqantt.message.QoS qoS94 = unsubscribeMessage90.getQos();
        subscribeMessage78.setQos(qoS94);
        subAckMessage77.addQoS(qoS94);
        org.meqantt.message.SubscribeMessage subscribeMessage97 = new org.meqantt.message.SubscribeMessage("\020\032\000\006MQIsdp\003&\000\001\000\000\000\000\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", qoS94);
        subscribeMessage14.setQos(qoS94);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS94);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.meqantt.message.Message.Type.CONNECT + "'", type5.equals(org.meqantt.message.Message.Type.CONNECT));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList34);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str42, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNull(qoSList54);
        org.junit.Assert.assertNull(qoSList55);
        org.junit.Assert.assertNull(qoSList56);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertTrue("'" + qoS60 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS60.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS63 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS63.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(type69);
        org.junit.Assert.assertNull(type70);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertTrue("'" + qoS80 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS80.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "MQIsdp" + "'", str86, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS87 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS87.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertTrue("'" + type92 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type92.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertTrue("'" + qoS94 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS94.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test17825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17825");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage7 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList9);
    }

    @Test
    public void test17826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17826");
        byte[] byteArray1 = org.meqantt.util.FormatUtil.toMQttString("\001\03700: 00010000 \020 16\n01: 00001110 \016 14\n\ufffd\ufffd 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00000010 \002 2\n\ufffd\ufffd 0\n13: 00000001 \001 1\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test17827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17827");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type6 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test17828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17828");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
    }

    @Test
    public void test17829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17829");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage9 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage(header1);
        boolean boolean11 = unsubscribeMessage10.isDup();
        java.util.List<java.lang.String> strList12 = unsubscribeMessage10.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage10.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test17830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17830");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 3, (byte) 3, (byte) 1 };
        java.lang.String str7 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray6);
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", byteArray6);
        java.lang.String str9 = publishMessage8.getDataAsString();
        org.meqantt.message.Message.Type type10 = publishMessage8.getType();
        publishMessage8.setDup(true);
        byte[] byteArray13 = publishMessage8.toBytes();
        org.meqantt.message.PublishMessage publishMessage14 = new org.meqantt.message.PublishMessage("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n\ufffd\ufffd", byteArray13);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 3, 3, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str7, "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\003\003\001" + "'", str9, "\001\003\003\001");
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.meqantt.message.Message.Type.PUBLISH + "'", type10.equals(org.meqantt.message.Message.Type.PUBLISH));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[56, 66, 0, 60, 72, 101, 97, 100, 101, 114, 32, 91, 116, 121, 112, 101, 61, 110, 117, 108, 108, 44, 32, 114, 101, 116, 97, 105, 110, 61, 116, 114, 117, 101, 44, 32, 113, 111, 115, 61, 65, 84, 95, 77, 79, 83, 84, 95, 79, 78, 67, 69, 44, 32, 100, 117, 112, 61, 102, 97, 108, 115, 101, 93, 1, 3, 3, 1]");
    }

    @Test
    public void test17831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17831");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage10 = new org.meqantt.message.PublishMessage("", byteArray9);
        java.lang.String str11 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray9);
        java.lang.String str12 = org.meqantt.util.FormatUtil.toString(byteArray9);
        java.lang.String str13 = org.meqantt.util.FormatUtil.toString(byteArray9);
        org.meqantt.message.PublishMessage publishMessage14 = new org.meqantt.message.PublishMessage("00: 01100100 d 100\n01: 00000000 \000 0\n", byteArray9);
        org.meqantt.message.PublishMessage publishMessage15 = new org.meqantt.message.PublishMessage("00: 11111111 \377 255\n01: 01100100 d 100\n02: 00000001 \001 1\n", byteArray9);
        java.lang.String str16 = publishMessage15.getDataAsString();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n" + "'", str11, "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000d\000\001\001d" + "'", str16, "\000d\000\001\001d");
    }

    @Test
    public void test17832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17832");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        byte[] byteArray7 = pubRecMessage6.toBytes();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 2, 0, 0]");
    }

    @Test
    public void test17833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17833");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Type type8 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage9 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.util.List<java.lang.String> strList11 = unsubscribeMessage10.getTopics();
        unsubscribeMessage10.addTopic("\000=Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        java.util.List<java.lang.String> strList14 = unsubscribeMessage10.getTopics();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test17834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17834");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PublishMessage publishMessage4 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test17835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17835");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage10 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.Message.Type type11 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage12 = new org.meqantt.message.PubRelMessage(header1);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type11);
    }

    @Test
    public void test17836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17836");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 11111111 \377 255\n01: 01100100 d 100\n02: 00000001 \001 1\n", "\000\023\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\001d");
    }

    @Test
    public void test17837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17837");
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
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus11 = connAckMessage10.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage10.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(connectionStatus11);
    }

    @Test
    public void test17838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17838");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17839");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage6 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage8 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage9 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage11 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage13 = new org.meqantt.message.ConnAckMessage(header1);
    }

    @Test
    public void test17840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17840");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage8.addTopic("00: 00000000 \000 0\n01: 00000110 \006 6\n02: 11000000 \300 192\n03: 10000000 \200 128\n04: 00000011 \003 3\n05: 01101000 h 104\n06: 01101001 i 105\n07: 00100001 ! 33\n");
        unsubscribeMessage8.addTopic("\000\ufffd\ufffdD00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test17841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17841");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        org.meqantt.message.QoS qoS11 = null;
        subscribeMessage7.addTopic("", qoS11);
        java.util.List<org.meqantt.message.QoS> qoSList13 = subscribeMessage7.getTopicQoSs();
        subscribeMessage7.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList16 = subscribeMessage7.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str22 = connectMessage21.getUsername();
        org.meqantt.message.QoS qoS26 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage("", qoS26);
        org.meqantt.message.SubscribeMessage subscribeMessage29 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList30 = subscribeMessage29.getTopics();
        org.meqantt.message.QoS qoS31 = subscribeMessage29.getQos();
        subscribeMessage27.addTopic("", qoS31);
        connectMessage21.setWill("", "\000d\000\001\001d", qoS31, true);
        subscribeMessage7.addTopic("\000\000", qoS31);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage6.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList13);
        org.junit.Assert.assertNotNull(qoSList16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }
}
