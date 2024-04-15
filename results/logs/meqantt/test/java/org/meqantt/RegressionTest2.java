package org.meqantt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        java.lang.String str4 = publishMessage1.getTopic();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = publishMessage1.getDataAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        subAckMessage2.addQoS(qoS6);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
        java.util.List<java.lang.String> strList7 = unsubscribeMessage1.getTopics();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage8.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage("", qoS15);
        subAckMessage8.addQoS(qoS15);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        subAckMessage0.setMessageId((int) '#');
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
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header5 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header5);
        org.meqantt.message.QoS qoS8 = null;
        subscribeMessage6.addTopic("hi!", qoS8);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subscribeMessage6.getTopicQoSs();
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
        subscribeMessage6.addTopic("\000d\000\001\001d", qoS26);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setQos(qoS26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        boolean boolean1 = connectMessage0.hasWill();
        java.lang.String str2 = connectMessage0.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MQIsdp" + "'", str2, "MQIsdp");
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        unsubscribeMessage1.setDup(false);
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
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
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
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage12.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header3);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header3);
        org.meqantt.message.Message.Type type7 = header3.getType();
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header3);
        org.meqantt.message.PubCompMessage pubCompMessage9 = new org.meqantt.message.PubCompMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pubCompMessage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 0);
        connectMessage3.setCredentials("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
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
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str29 = connectMessage28.getUsername();
        org.meqantt.message.QoS qoS33 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList37 = subscribeMessage36.getTopics();
        org.meqantt.message.QoS qoS38 = subscribeMessage36.getQos();
        subscribeMessage34.addTopic("", qoS38);
        connectMessage28.setWill("", "\000d\000\001\001d", qoS38, true);
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("hi!", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage43 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage44 = new org.meqantt.message.SubscribeMessage("", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage45 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS38);
        org.meqantt.message.SubscribeMessage subscribeMessage47 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList48 = subscribeMessage47.getTopics();
        org.meqantt.message.ConnectMessage connectMessage53 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str54 = connectMessage53.getProtocolId();
        org.meqantt.message.QoS qoS55 = connectMessage53.getQos();
        subscribeMessage47.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS55);
        subscribeMessage45.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS55);
        org.meqantt.message.ConnectMessage connectMessage62 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str63 = connectMessage62.getProtocolId();
        org.meqantt.message.QoS qoS64 = connectMessage62.getQos();
        subscribeMessage45.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS64);
        org.meqantt.message.ConnectMessage connectMessage74 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str75 = connectMessage74.getUsername();
        org.meqantt.message.QoS qoS79 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage80 = new org.meqantt.message.SubscribeMessage("", qoS79);
        org.meqantt.message.SubscribeMessage subscribeMessage82 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList83 = subscribeMessage82.getTopics();
        org.meqantt.message.QoS qoS84 = subscribeMessage82.getQos();
        subscribeMessage80.addTopic("", qoS84);
        connectMessage74.setWill("", "\000d\000\001\001d", qoS84, true);
        org.meqantt.message.SubscribeMessage subscribeMessage88 = new org.meqantt.message.SubscribeMessage("hi!", qoS84);
        org.meqantt.message.SubscribeMessage subscribeMessage89 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS84);
        org.meqantt.message.SubscribeMessage subscribeMessage90 = new org.meqantt.message.SubscribeMessage("", qoS84);
        org.meqantt.message.SubscribeMessage subscribeMessage91 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS84);
        subscribeMessage45.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS84);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage18.setQos(qoS84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "MQIsdp" + "'", str54, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS55 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS55.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "MQIsdp" + "'", str63, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS64 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS64.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + qoS84 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS84.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.lang.Class<?> wildcardClass6 = unsubscribeMessage5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage("", qoS6);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS6);
        org.meqantt.message.QoS qoS9 = subscribeMessage8.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
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
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage25 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList26 = unsubscribeMessage25.getTopics();
        org.meqantt.message.Message.Type type27 = unsubscribeMessage25.getType();
        java.util.List<java.lang.String> strList28 = unsubscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS29 = unsubscribeMessage25.getQos();
        subscribeMessage22.addTopic("\001\003\003\001", qoS29);
        java.util.List<java.lang.String> strList31 = subscribeMessage22.getTopics();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type27.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '\001');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage7 = new org.meqantt.message.PubRelMessage(header1);
        java.lang.Class<?> wildcardClass8 = pubRelMessage7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header7 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type8 = header7.getType();
        org.meqantt.message.Message.Type type9 = header7.getType();
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header7);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header7);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header7);
        org.meqantt.message.DisconnectMessage disconnectMessage13 = new org.meqantt.message.DisconnectMessage(header7);
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage(header7);
        org.meqantt.message.UnsubAckMessage unsubAckMessage15 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS16 = unsubAckMessage15.getQos();
        subAckMessage14.addQoS(qoS16);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
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
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage31 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList32 = unsubscribeMessage31.getTopics();
        org.meqantt.message.Message.Type type33 = unsubscribeMessage31.getType();
        java.util.List<java.lang.String> strList34 = unsubscribeMessage31.getTopics();
        org.meqantt.message.QoS qoS35 = unsubscribeMessage31.getQos();
        subscribeMessage28.addTopic("\001\003\003\001", qoS35);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type33.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str6 = connectMessage5.getUsername();
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        connectMessage5.setWill("", "\000d\000\001\001d", qoS15, true);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("hi!", qoS15);
        org.meqantt.message.SubscribeMessage subscribeMessage20 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS15);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage20.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        int int1 = subAckMessage0.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
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
            pubAckMessage5.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "MQIsdp" + "'", str28, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        byte[] byteArray6 = publishMessage5.getData();
        org.meqantt.message.Message.Type type7 = publishMessage5.getType();
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Header header9 = null;
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header9);
        int int11 = connectMessage10.getKeepAlive();
        connectMessage10.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS15 = connectMessage10.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        unsubscribeMessage1.setDup(false);
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
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "MQIsdp" + "'", str37, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        int int5 = connectMessage3.getKeepAlive();
        java.lang.String str6 = connectMessage3.getWillTopic();
        boolean boolean7 = connectMessage3.hasPassword();
        connectMessage3.setWill("", "MQIsdp");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
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
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
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
            mqttMessageHandler0.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        byte byte9 = connectMessage1.getProtocolVersion();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 3 + "'", byte9 == (byte) 3);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) 1);
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
            pubRecMessage1.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
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
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
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
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header9 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type10 = header9.getType();
        org.meqantt.message.Message.Type type11 = header9.getType();
        org.meqantt.message.SubAckMessage subAckMessage12 = new org.meqantt.message.SubAckMessage(header9);
        org.meqantt.message.PingReqMessage pingReqMessage13 = new org.meqantt.message.PingReqMessage(header9);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage(header9);
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS18 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage("", qoS18);
        int int20 = subscribeMessage19.getMessageId();
        subscribeMessage19.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header24 = null;
        org.meqantt.message.ConnectMessage connectMessage25 = new org.meqantt.message.ConnectMessage(header24);
        int int26 = connectMessage25.getKeepAlive();
        connectMessage25.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS30 = connectMessage25.getWillQoS();
        subscribeMessage19.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS30);
        subscribeMessage14.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS30);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setQos(qoS30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        int int4 = pubCompMessage3.getMessageId();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS9);
        org.meqantt.message.QoS qoS12 = subscribeMessage11.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage3.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
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
            subscribeMessage24.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
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
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
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
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
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
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage12.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS10);
        org.meqantt.message.QoS qoS13 = subscribeMessage12.getQos();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage6 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList5 = subscribeMessage4.getTopics();
        org.meqantt.message.QoS qoS6 = subscribeMessage4.getQos();
        subscribeMessage2.addTopic("", qoS6);
        java.util.List<java.lang.String> strList8 = subscribeMessage2.getTopics();
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
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS26);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList36 = subscribeMessage35.getTopics();
        org.meqantt.message.ConnectMessage connectMessage41 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str42 = connectMessage41.getProtocolId();
        org.meqantt.message.QoS qoS43 = connectMessage41.getQos();
        subscribeMessage35.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS43);
        subscribeMessage33.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS43);
        org.meqantt.message.ConnectMessage connectMessage50 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str51 = connectMessage50.getProtocolId();
        org.meqantt.message.QoS qoS52 = connectMessage50.getQos();
        subscribeMessage33.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS52);
        org.meqantt.message.ConnectMessage connectMessage62 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str63 = connectMessage62.getUsername();
        org.meqantt.message.QoS qoS67 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage68 = new org.meqantt.message.SubscribeMessage("", qoS67);
        org.meqantt.message.SubscribeMessage subscribeMessage70 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList71 = subscribeMessage70.getTopics();
        org.meqantt.message.QoS qoS72 = subscribeMessage70.getQos();
        subscribeMessage68.addTopic("", qoS72);
        connectMessage62.setWill("", "\000d\000\001\001d", qoS72, true);
        org.meqantt.message.SubscribeMessage subscribeMessage76 = new org.meqantt.message.SubscribeMessage("hi!", qoS72);
        org.meqantt.message.SubscribeMessage subscribeMessage77 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS72);
        org.meqantt.message.SubscribeMessage subscribeMessage78 = new org.meqantt.message.SubscribeMessage("", qoS72);
        org.meqantt.message.SubscribeMessage subscribeMessage79 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS72);
        subscribeMessage33.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS72);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setQos(qoS72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "MQIsdp" + "'", str42, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MQIsdp" + "'", str51, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + qoS72 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS72.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
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
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleDownstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
        java.util.List<java.lang.String> strList7 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.setDup(false);
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
        byte byte38 = connectMessage14.getProtocolVersion();
        org.meqantt.message.ConnectMessage connectMessage45 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean46 = connectMessage45.hasWill();
        java.lang.String str47 = connectMessage45.getWill();
        org.meqantt.message.Message.Header header50 = null;
        org.meqantt.message.ConnectMessage connectMessage51 = new org.meqantt.message.ConnectMessage(header50);
        boolean boolean52 = connectMessage51.isWillRetained();
        boolean boolean53 = connectMessage51.isWillRetained();
        java.lang.String str54 = connectMessage51.getUsername();
        org.meqantt.message.QoS qoS58 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage("", qoS58);
        org.meqantt.message.SubscribeMessage subscribeMessage61 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList62 = subscribeMessage61.getTopics();
        org.meqantt.message.QoS qoS63 = subscribeMessage61.getQos();
        subscribeMessage59.addTopic("", qoS63);
        connectMessage51.setWill("hi!", "", qoS63, false);
        connectMessage45.setWill("MQIsdp", "hi!", qoS63, false);
        org.meqantt.message.SubscribeMessage subscribeMessage69 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS63);
        connectMessage14.setWill("", "MQIsdp", qoS63, false);
        org.meqantt.message.SubscribeMessage subscribeMessage72 = new org.meqantt.message.SubscribeMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS63);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 3 + "'", byte38 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + qoS63 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS63.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
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
            mqttMessageHandler0.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage3 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
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
            connAckMessage7.setQos(qoS36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
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
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
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
            mqttMessageHandler0.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
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
            mqttMessageHandler0.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
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
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
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
            mqttMessageHandler0.bindRequested(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
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
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
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
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
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
        boolean boolean37 = connectMessage13.isCleanSession();
        boolean boolean38 = connectMessage13.hasPassword();
        connectMessage13.setWill("hi!", "\000\000");
        org.meqantt.message.QoS qoS42 = connectMessage13.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage9.setQos(qoS42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + qoS42 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS42.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
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
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
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
            disconnectMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
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
        int int63 = subAckMessage0.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header3);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pingRespMessage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subscribeMessage0.addTopic("", qoS9);
        java.lang.Class<?> wildcardClass11 = qoS9.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
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
            disconnectMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "");
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
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
        org.jboss.netty.channel.ExceptionEvent exceptionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.exceptionCaught(channelHandlerContext11, exceptionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
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
        boolean boolean29 = connectMessage5.isCleanSession();
        boolean boolean30 = connectMessage5.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
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
            mqttMessageHandler0.channelBound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage8 = new org.meqantt.message.PublishMessage("MQIsdp", "\000d\000\001\001d");
        java.lang.String str9 = publishMessage8.getDataAsString();
        byte[] byteArray10 = publishMessage8.getData();
        org.meqantt.message.QoS qoS11 = publishMessage8.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d" + "'", str9, "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.Class<?> wildcardClass3 = pubAckMessage2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
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
            mqttMessageHandler0.connectRequested(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
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
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type53 = subscribeMessage52.getType();
        subscribeMessage52.setDup(false);
        subscribeMessage52.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList58 = subscribeMessage52.getTopics();
        org.meqantt.message.SubscribeMessage subscribeMessage59 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList60 = subscribeMessage59.getTopics();
        org.meqantt.message.QoS qoS61 = subscribeMessage59.getQos();
        org.meqantt.message.ConnectMessage connectMessage66 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str67 = connectMessage66.getProtocolId();
        org.meqantt.message.QoS qoS68 = connectMessage66.getQos();
        subscribeMessage59.addTopic("", qoS68);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage71 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList72 = unsubscribeMessage71.getTopics();
        org.meqantt.message.Message.Type type73 = unsubscribeMessage71.getType();
        java.util.List<java.lang.String> strList74 = unsubscribeMessage71.getTopics();
        org.meqantt.message.QoS qoS75 = unsubscribeMessage71.getQos();
        subscribeMessage59.setQos(qoS75);
        subscribeMessage52.setQos(qoS75);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS75);
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
        org.junit.Assert.assertTrue("'" + type53 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type53.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + qoS61 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS61.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "MQIsdp" + "'", str67, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS68 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS68.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertTrue("'" + type73 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type73.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + qoS75 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS75.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
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
            mqttMessageHandler0.handleDownstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.Message.Header header7 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type8 = header7.getType();
        org.meqantt.message.Message.Type type9 = header7.getType();
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header7);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header7);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header7);
        org.meqantt.message.DisconnectMessage disconnectMessage13 = new org.meqantt.message.DisconnectMessage(header7);
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage(header7);
        java.util.List<org.meqantt.message.QoS> qoSList15 = subAckMessage14.getGrantedQoSs();
        org.meqantt.message.SubAckMessage subAckMessage16 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList17 = subAckMessage16.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList18 = subAckMessage16.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList19 = subAckMessage16.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage21 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList22 = subscribeMessage21.getTopics();
        org.meqantt.message.QoS qoS23 = subscribeMessage21.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage24 = new org.meqantt.message.SubscribeMessage("", qoS23);
        subAckMessage16.addQoS(qoS23);
        subAckMessage14.addQoS(qoS23);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage5.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertNull(qoSList15);
        org.junit.Assert.assertNull(qoSList17);
        org.junit.Assert.assertNull(qoSList18);
        org.junit.Assert.assertNull(qoSList19);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subscribeMessage0.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS8);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        unsubscribeMessage1.setDup(false);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus5 = connAckMessage4.getStatus();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        subAckMessage6.addQoS(qoS10);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus5);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        java.lang.String str6 = connectMessage3.getWill();
        java.lang.String str7 = connectMessage3.getProtocolId();
        java.lang.String str8 = connectMessage3.getProtocolId();
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage11.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList13 = subAckMessage11.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getProtocolId();
        org.meqantt.message.QoS qoS19 = connectMessage17.getQos();
        subAckMessage11.addQoS(qoS19);
        connectMessage3.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", qoS19, false);
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
            connectMessage3.setQos(qoS38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MQIsdp" + "'", str18, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(type33);
        org.junit.Assert.assertNull(type34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.SubAckMessage subAckMessage1 = new org.meqantt.message.SubAckMessage(header0);
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage1.getGrantedQoSs();
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        org.meqantt.message.QoS qoS6 = publishMessage5.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage1.setQos(qoS6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage();
        java.lang.String str4 = connectMessage3.getProtocolId();
        java.lang.String str5 = connectMessage3.getClientId();
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage8.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage8.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getProtocolId();
        org.meqantt.message.QoS qoS16 = connectMessage14.getQos();
        subAckMessage8.addQoS(qoS16);
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
        org.meqantt.message.SubAckMessage subAckMessage47 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList48 = subAckMessage47.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList49 = subAckMessage47.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList50 = subAckMessage47.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage52 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList53 = subscribeMessage52.getTopics();
        org.meqantt.message.QoS qoS54 = subscribeMessage52.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage55 = new org.meqantt.message.SubscribeMessage("", qoS54);
        subAckMessage47.addQoS(qoS54);
        connectMessage21.setWill("hi!", "MQIsdp", qoS54, true);
        subAckMessage8.addQoS(qoS54);
        connectMessage3.setWill("\000d\000\001\001d", "hi!", qoS54, true);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setQos(qoS54);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList48);
        org.junit.Assert.assertNull(qoSList49);
        org.junit.Assert.assertNull(qoSList50);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + qoS54 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS54.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
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
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        subscribeMessage0.setMessageId((int) (short) 0);
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
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
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
            mqttMessageHandler0.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage(10);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, 1);
        byte byte13 = connectMessage12.getProtocolVersion();
        org.meqantt.message.SubscribeMessage subscribeMessage16 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList17 = subscribeMessage16.getTopics();
        org.meqantt.message.QoS qoS18 = subscribeMessage16.getQos();
        org.meqantt.message.QoS qoS20 = null;
        subscribeMessage16.addTopic("", qoS20);
        java.util.List<org.meqantt.message.QoS> qoSList22 = subscribeMessage16.getTopicQoSs();
        subscribeMessage16.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList25 = subscribeMessage16.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage30 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str31 = connectMessage30.getUsername();
        org.meqantt.message.QoS qoS35 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage("", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList39 = subscribeMessage38.getTopics();
        org.meqantt.message.QoS qoS40 = subscribeMessage38.getQos();
        subscribeMessage36.addTopic("", qoS40);
        connectMessage30.setWill("", "\000d\000\001\001d", qoS40, true);
        subscribeMessage16.addTopic("\000\000", qoS40);
        connectMessage12.setWill("", "\000\003hi!", qoS40, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage8.setQos(qoS40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 3 + "'", byte13 == (byte) 3);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList22);
        org.junit.Assert.assertNotNull(qoSList25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        connectMessage1.setWill("MQIsdp", "");
        java.lang.String str6 = connectMessage1.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
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
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList3 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd");
        unsubscribeMessage1.setDup(false);
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
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage9.getGrantedQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(qoSList10);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
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
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        connectMessage1.setWill("MQIsdp", "");
        java.lang.String str6 = connectMessage1.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
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
            mqttMessageHandler0.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(false);
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
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
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
            pubCompMessage10.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        int int6 = unsubscribeMessage5.getMessageId();
        unsubscribeMessage5.addTopic("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
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
            disconnectMessage10.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isWillRetained();
        int int4 = connectMessage1.getKeepAlive();
        byte byte5 = connectMessage1.getProtocolVersion();
        byte byte6 = connectMessage1.getProtocolVersion();
        boolean boolean7 = connectMessage1.hasWill();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage4.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
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
            mqttMessageHandler0.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        java.lang.Class<?> wildcardClass6 = header1.getClass();
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getUsername();
        java.lang.String str5 = connectMessage3.getWill();
        boolean boolean6 = connectMessage3.isWillRetained();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        unsubscribeMessage1.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
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
            mqttMessageHandler0.channelConnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage3.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus4);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.QoS qoS3 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage("", qoS3);
        int int5 = subscribeMessage4.getMessageId();
        subscribeMessage4.setMessageId((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) subscribeMessage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getUsername();
        org.meqantt.message.QoS qoS14 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        subscribeMessage15.addTopic("", qoS19);
        connectMessage9.setWill("", "\000d\000\001\001d", qoS19, true);
        java.lang.String str23 = connectMessage9.getPassword();
        boolean boolean24 = connectMessage9.isWillRetained();
        org.meqantt.message.QoS qoS25 = connectMessage9.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        java.lang.String str6 = connectMessage3.getWill();
        connectMessage3.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setCredentials("", "\000\ufffd00: 00110000 0 48\n01: 00001000 \b 8\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n\ufffd\ufffd 0\n05: 01100100 d 100\n\ufffd\ufffd 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: It is not valid to supply a password without supplying a username.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage14 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str15 = connectMessage14.getProtocolId();
        org.meqantt.message.QoS qoS16 = connectMessage14.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str3 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str3, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        byte[] byteArray4 = publishMessage1.getData();
        byte[] byteArray5 = publishMessage1.getData();
        byte[] byteArray6 = publishMessage1.getData();
        java.lang.String str7 = publishMessage1.getTopic();
        int int8 = publishMessage1.getMessageId();
        byte[] byteArray9 = publishMessage1.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = publishMessage1.getDataAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(byteArray9);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus5 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = connAckMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
        org.junit.Assert.assertNull(connectionStatus5);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage(header6);
        org.meqantt.message.QoS qoS9 = null;
        subscribeMessage7.addTopic("hi!", qoS9);
        org.meqantt.message.PubRelMessage pubRelMessage13 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS14 = pubRelMessage13.getQos();
        subscribeMessage7.addTopic("\000d\000\001\001d", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
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
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
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
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage12.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        subAckMessage0.setMessageId((int) '#');
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage7 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS8 = unsubscribeMessage7.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage(2);
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
        boolean boolean29 = connectMessage5.isCleanSession();
        org.meqantt.message.UnsubAckMessage unsubAckMessage32 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS33 = unsubAckMessage32.getQos();
        connectMessage5.setWill("\000\003hi!", "hi!", qoS33, false);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + qoS33 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS33.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("MQIsdp", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: MQIsdp");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
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
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setWill("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = connectMessage1.isDup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
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
            subscribeMessage18.setRetained(false);
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
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList6 = subscribeMessage5.getTopics();
        org.meqantt.message.QoS qoS7 = subscribeMessage5.getQos();
        org.meqantt.message.ConnectMessage connectMessage12 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str13 = connectMessage12.getProtocolId();
        org.meqantt.message.QoS qoS14 = connectMessage12.getQos();
        subscribeMessage5.addTopic("", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MQIsdp" + "'", str13, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
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
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        connectMessage2.setWill("\000\000", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        int int8 = connectMessage7.getKeepAlive();
        boolean boolean9 = connectMessage7.isCleanSession();
        org.meqantt.message.PubRelMessage pubRelMessage13 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS14 = pubRelMessage13.getQos();
        connectMessage7.setWill("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp", qoS14, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS8 = unsubAckMessage7.getQos();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.hasWill();
        connectMessage1.setCredentials("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.Message.Type type9 = connectMessage1.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
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
            subAckMessage0.setRetained(false);
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
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage6 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage9 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        org.meqantt.message.QoS qoS10 = unsubscribeMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MQIsdp" + "'", str1, "MQIsdp");
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        boolean boolean6 = subAckMessage5.isDup();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        org.meqantt.message.PublishMessage publishMessage2 = new org.meqantt.message.PublishMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        java.lang.String str3 = publishMessage2.getDataAsString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str3, "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
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
            unsubAckMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
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
            pubRecMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header7 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type8 = header7.getType();
        org.meqantt.message.Message.Type type9 = header7.getType();
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header7);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header7);
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header7);
        org.meqantt.message.DisconnectMessage disconnectMessage13 = new org.meqantt.message.DisconnectMessage(header7);
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage(header7);
        org.meqantt.message.UnsubAckMessage unsubAckMessage15 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS16 = unsubAckMessage15.getQos();
        subAckMessage14.addQoS(qoS16);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
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
        org.jboss.netty.channel.MessageEvent messageEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeRequested(channelHandlerContext15, messageEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
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
        org.meqantt.message.SubAckMessage subAckMessage33 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList34 = subAckMessage33.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList35 = subAckMessage33.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList36 = subAckMessage33.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList39 = subscribeMessage38.getTopics();
        org.meqantt.message.QoS qoS40 = subscribeMessage38.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage("", qoS40);
        subAckMessage33.addQoS(qoS40);
        connectMessage7.setWill("hi!", "MQIsdp", qoS40, true);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage3.setQos(qoS40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList34);
        org.junit.Assert.assertNull(qoSList35);
        org.junit.Assert.assertNull(qoSList36);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.write(outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(10);
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getProtocolId();
        org.meqantt.message.QoS qoS11 = connectMessage9.getQos();
        subscribeMessage2.addTopic("", qoS11);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage14 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList15 = unsubscribeMessage14.getTopics();
        org.meqantt.message.Message.Type type16 = unsubscribeMessage14.getType();
        java.util.List<java.lang.String> strList17 = unsubscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS18 = unsubscribeMessage14.getQos();
        subscribeMessage2.setQos(qoS18);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type16.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
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
        boolean boolean64 = connectMessage3.isWillRetained();
        java.lang.String str65 = connectMessage3.getPassword();
        boolean boolean66 = connectMessage3.isDup();
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
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 3 + "'", byte27 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "00: 00000000 \000 0\n01: 00000000 \000 0\n" + "'", str65, "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage0.getGrantedQoSs();
        boolean boolean4 = subAckMessage0.isDup();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 0);
        java.lang.String str9 = connectMessage8.getProtocolId();
        org.meqantt.message.QoS qoS13 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("", qoS13);
        int int15 = subscribeMessage14.getMessageId();
        subscribeMessage14.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header19 = null;
        org.meqantt.message.ConnectMessage connectMessage20 = new org.meqantt.message.ConnectMessage(header19);
        int int21 = connectMessage20.getKeepAlive();
        connectMessage20.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS25 = connectMessage20.getWillQoS();
        subscribeMessage14.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS25);
        connectMessage8.setWill("00: 00000000 \000 0\n01: 00000110 \006 6\n02: 01001101 M 77\n03: 01010001 Q 81\n04: 01001001 I 73\n05: 01110011 s 115\n06: 01100100 d 100\n07: 01110000 p 112\n", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS25, true);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
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
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        connectMessage1.setWill("MQIsdp", "");
        java.lang.String str6 = connectMessage1.getWillTopic();
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
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS26);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList36 = subscribeMessage35.getTopics();
        org.meqantt.message.ConnectMessage connectMessage41 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str42 = connectMessage41.getProtocolId();
        org.meqantt.message.QoS qoS43 = connectMessage41.getQos();
        subscribeMessage35.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS43);
        subscribeMessage33.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS43);
        org.meqantt.message.ConnectMessage connectMessage50 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str51 = connectMessage50.getProtocolId();
        org.meqantt.message.QoS qoS52 = connectMessage50.getQos();
        subscribeMessage33.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS52);
        connectMessage1.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS52, false);
        boolean boolean56 = connectMessage1.isWillRetained();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray57 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "MQIsdp" + "'", str42, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MQIsdp" + "'", str51, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isCleanSession();
        java.lang.String str4 = connectMessage1.getPassword();
        org.meqantt.message.QoS qoS5 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
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
            mqttMessageHandler0.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("hi!");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        org.meqantt.MqttListener mqttListener4 = null;
        nettyClient1.setListener(mqttListener4);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.connect("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header4 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type5 = header4.getType();
        org.meqantt.message.Message.Type type6 = header4.getType();
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header4);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header4);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage(header4);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage(header4);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header4);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage(header4);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header4);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        org.meqantt.message.ConnectMessage connectMessage21 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str22 = connectMessage21.getProtocolId();
        org.meqantt.message.QoS qoS23 = connectMessage21.getQos();
        subscribeMessage14.addTopic("", qoS23);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage26 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList27 = unsubscribeMessage26.getTopics();
        org.meqantt.message.Message.Type type28 = unsubscribeMessage26.getType();
        java.util.List<java.lang.String> strList29 = unsubscribeMessage26.getTopics();
        org.meqantt.message.QoS qoS30 = unsubscribeMessage26.getQos();
        subscribeMessage14.setQos(qoS30);
        subAckMessage13.addQoS(qoS30);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setQos(qoS30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type28.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
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
            subAckMessage10.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
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
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, 1);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
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
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage10.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.setMessageId(100);
        unsubscribeMessage1.addTopic("MQIsdp");
        boolean boolean9 = unsubscribeMessage1.isDup();
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage("", true, 1);
        byte byte14 = connectMessage13.getProtocolVersion();
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.QoS qoS19 = subscribeMessage17.getQos();
        org.meqantt.message.QoS qoS21 = null;
        subscribeMessage17.addTopic("", qoS21);
        java.util.List<org.meqantt.message.QoS> qoSList23 = subscribeMessage17.getTopicQoSs();
        subscribeMessage17.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList26 = subscribeMessage17.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage31 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str32 = connectMessage31.getUsername();
        org.meqantt.message.QoS qoS36 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage37 = new org.meqantt.message.SubscribeMessage("", qoS36);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList40 = subscribeMessage39.getTopics();
        org.meqantt.message.QoS qoS41 = subscribeMessage39.getQos();
        subscribeMessage37.addTopic("", qoS41);
        connectMessage31.setWill("", "\000d\000\001\001d", qoS41, true);
        subscribeMessage17.addTopic("\000\000", qoS41);
        connectMessage13.setWill("", "\000\003hi!", qoS41, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 3 + "'", byte14 == (byte) 3);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList23);
        org.junit.Assert.assertNotNull(qoSList26);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + qoS41 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS41.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage5 = new org.meqantt.message.PingRespMessage(header1);
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
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        org.meqantt.message.SubAckMessage subAckMessage1 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage1.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage1.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getProtocolId();
        org.meqantt.message.QoS qoS9 = connectMessage7.getQos();
        subAckMessage1.addQoS(qoS9);
        byte[] byteArray11 = subAckMessage1.toBytes();
        org.meqantt.message.PublishMessage publishMessage12 = new org.meqantt.message.PublishMessage("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", byteArray11);
        java.lang.Class<?> wildcardClass13 = publishMessage12.getClass();
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-112, 3, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000d\000\001\001d");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 01100100 d 100\n01: 00000000 \000 0\n", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 01100100 d 100?01: 00000000 ? 0?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingRespMessage pingRespMessage2 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n", true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 01110000 p 112?01: 00000010 ? 2?02: 00000000 ? 0?03: 00001010 ? 10?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
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
            unsubAckMessage8.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        java.lang.String str6 = connectMessage3.getWill();
        java.lang.String str7 = connectMessage3.getProtocolId();
        byte byte8 = connectMessage3.getProtocolVersion();
        boolean boolean9 = connectMessage3.isWillRetained();
        byte byte10 = connectMessage3.getProtocolVersion();
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
            connectMessage3.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 3 + "'", byte8 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 3 + "'", byte10 == (byte) 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        connectMessage1.setWill("\000\000", "\000\000");
        java.lang.String str10 = connectMessage1.getWillTopic();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000" + "'", str10, "\000\000");
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        org.meqantt.netty.MqttMessageHandler mqttMessageHandler0 = new org.meqantt.netty.MqttMessageHandler();
        org.meqantt.MqttListener mqttListener1 = null;
        mqttMessageHandler0.setListener(mqttListener1);
        org.meqantt.MqttListener mqttListener3 = null;
        mqttMessageHandler0.setListener(mqttListener3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
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
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setQos(qoS30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList1);
        org.junit.Assert.assertNull(qoSList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 10010000 ? 144?01: 00000011 ? 3?02: 00000000 ? 0?03: 00000000 ? 0?04: 00000000 ? 0?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
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
            mqttMessageHandler0.bindRequested(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        unsubscribeMessage1.addTopic("");
        java.util.List<java.lang.String> strList6 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage4.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.ConnectMessage connectMessage19 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str20 = connectMessage19.getProtocolId();
        org.meqantt.message.QoS qoS21 = connectMessage19.getQos();
        subscribeMessage12.addTopic("", qoS21);
        connectMessage9.setWill("MQIsdp", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", qoS21, true);
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
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        boolean boolean8 = connAckMessage7.isDup();
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage9.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList11 = subAckMessage9.getGrantedQoSs();
        org.meqantt.message.PubRelMessage pubRelMessage13 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS14 = pubRelMessage13.getQos();
        subAckMessage9.addQoS(qoS14);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
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
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        org.meqantt.MqttListener mqttListener5 = null;
        nettyClient1.setListener(mqttListener5);
        nettyClient1.ping();
        nettyClient1.ping();
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
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
            mqttMessageHandler0.unbindRequested(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
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
        org.meqantt.message.SubscribeMessage subscribeMessage42 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS39);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setQos(qoS39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "MQIsdp" + "'", str38, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS39 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS39.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
        java.util.List<java.lang.String> strList7 = unsubscribeMessage1.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean6 = connectMessage5.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        byte[] byteArray2 = pubCompMessage1.toBytes();
        boolean boolean3 = pubCompMessage1.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[112, 2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        int int3 = subscribeMessage2.getMessageId();
        subscribeMessage2.setMessageId((int) (short) 10);
        java.util.List<java.lang.String> strList6 = subscribeMessage2.getTopics();
        int int7 = subscribeMessage2.getMessageId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        subscribeMessage0.setMessageId((int) (short) 0);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        org.meqantt.message.QoS qoS11 = null;
        subscribeMessage7.addTopic("", qoS11);
        java.util.List<org.meqantt.message.QoS> qoSList13 = subscribeMessage7.getTopicQoSs();
        subscribeMessage7.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList16 = subscribeMessage7.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str25 = connectMessage24.getUsername();
        org.meqantt.message.QoS qoS29 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList33 = subscribeMessage32.getTopics();
        org.meqantt.message.QoS qoS34 = subscribeMessage32.getQos();
        subscribeMessage30.addTopic("", qoS34);
        connectMessage24.setWill("", "\000d\000\001\001d", qoS34, true);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("hi!", qoS34);
        org.meqantt.message.SubscribeMessage subscribeMessage39 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS34);
        org.meqantt.message.SubscribeMessage subscribeMessage40 = new org.meqantt.message.SubscribeMessage("", qoS34);
        subscribeMessage7.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS34);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(qoSList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList13);
        org.junit.Assert.assertNotNull(qoSList16);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage3.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.Message.Type type6 = header1.getType();
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.write(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.QoS qoS12 = subscribeMessage10.getQos();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getProtocolId();
        org.meqantt.message.QoS qoS19 = connectMessage17.getQos();
        subscribeMessage10.addTopic("", qoS19);
        connectMessage7.setWill("MQIsdp", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", qoS19, true);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MQIsdp" + "'", str18, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.BAD_USERNAME_OR_PASSWORD));
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
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
            mqttMessageHandler0.unbindRequested(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
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
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
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
        boolean boolean29 = connectMessage3.hasUsername();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
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
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage(10);
        boolean boolean2 = pubCompMessage1.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus3);
        org.meqantt.message.Message.Header header6 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        int int8 = connectMessage7.getKeepAlive();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        connectMessage7.setWill("hi!", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", qoS14, true);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        java.lang.String str4 = connectMessage3.getPassword();
        java.lang.String str5 = connectMessage3.getWillTopic();
        boolean boolean6 = connectMessage3.isCleanSession();
        boolean boolean7 = connectMessage3.hasPassword();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connectMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
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
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList3 = subAckMessage2.getGrantedQoSs();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage4.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList6 = subAckMessage4.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList7 = subAckMessage4.getGrantedQoSs();
        subAckMessage4.setMessageId((int) '#');
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList11 = subscribeMessage10.getTopics();
        org.meqantt.message.ConnectMessage connectMessage16 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str17 = connectMessage16.getProtocolId();
        org.meqantt.message.QoS qoS18 = connectMessage16.getQos();
        subscribeMessage10.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS18);
        subAckMessage4.addQoS(qoS18);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage2.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList3);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNull(qoSList6);
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MQIsdp" + "'", str17, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getClientId();
        boolean boolean11 = connectMessage9.hasUsername();
        boolean boolean12 = connectMessage9.isCleanSession();
        boolean boolean13 = connectMessage9.hasPassword();
        org.meqantt.message.Message.Header header16 = null;
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage(header16);
        int int18 = connectMessage17.getKeepAlive();
        connectMessage17.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS22 = connectMessage17.getWillQoS();
        connectMessage9.setWill("", "MQIsdp", qoS22, true);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("");
        connectMessage1.setCredentials("hi!", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.message.QoS qoS7 = connectMessage1.getWillQoS();
        java.lang.String str8 = connectMessage1.getWillTopic();
        boolean boolean9 = connectMessage1.hasUsername();
        org.meqantt.message.Message.Header header10 = null;
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage(header10);
        java.lang.String str12 = connectMessage11.getClientId();
        connectMessage11.setWill("hi!", "");
        boolean boolean16 = connectMessage11.isCleanSession();
        boolean boolean17 = connectMessage11.isCleanSession();
        java.lang.String str18 = connectMessage11.getWillTopic();
        byte byte19 = connectMessage11.getProtocolVersion();
        org.meqantt.message.Message.Header header23 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type24 = header23.getType();
        org.meqantt.message.Message.Type type25 = header23.getType();
        org.meqantt.message.PubRelMessage pubRelMessage26 = new org.meqantt.message.PubRelMessage(header23);
        org.meqantt.message.SubAckMessage subAckMessage27 = new org.meqantt.message.SubAckMessage(header23);
        boolean boolean28 = subAckMessage27.isRetained();
        org.meqantt.message.QoS qoS29 = subAckMessage27.getQos();
        connectMessage11.setWill("\000\003hi!", "\000d\000\001\001d", qoS29, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoS7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 3 + "'", byte19 == (byte) 3);
        org.junit.Assert.assertNull(type24);
        org.junit.Assert.assertNull(type25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        org.meqantt.MqttListener mqttListener7 = null;
        nettyClient1.setListener(mqttListener7);
        nettyClient1.subscribe("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.meqantt.MqttListener mqttListener11 = null;
        nettyClient1.setListener(mqttListener11);
        nettyClient1.unsubscribe("\000\000");
        nettyClient1.disconnect();
        nettyClient1.publish("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.MqttListener mqttListener19 = null;
        nettyClient1.setListener(mqttListener19);
        nettyClient1.connect("hi!", 10);
        nettyClient1.disconnect();
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        boolean boolean1 = connectMessage0.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS7 = unsubAckMessage6.getQos();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage5.setQos(qoS7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "MQIsdp" + "'", str20, "MQIsdp");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.Message.Type type7 = header1.getType();
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header11 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type12 = header11.getType();
        org.meqantt.message.Message.Type type13 = header11.getType();
        org.meqantt.message.SubAckMessage subAckMessage14 = new org.meqantt.message.SubAckMessage(header11);
        org.meqantt.message.PingReqMessage pingReqMessage15 = new org.meqantt.message.PingReqMessage(header11);
        org.meqantt.message.PingReqMessage pingReqMessage16 = new org.meqantt.message.PingReqMessage(header11);
        org.meqantt.message.DisconnectMessage disconnectMessage17 = new org.meqantt.message.DisconnectMessage(header11);
        org.meqantt.message.SubAckMessage subAckMessage18 = new org.meqantt.message.SubAckMessage(header11);
        java.util.List<org.meqantt.message.QoS> qoSList19 = subAckMessage18.getGrantedQoSs();
        org.meqantt.message.SubAckMessage subAckMessage20 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList21 = subAckMessage20.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList22 = subAckMessage20.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList23 = subAckMessage20.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage28 = new org.meqantt.message.SubscribeMessage("", qoS27);
        subAckMessage20.addQoS(qoS27);
        subAckMessage18.addQoS(qoS27);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(qoSList19);
        org.junit.Assert.assertNull(qoSList21);
        org.junit.Assert.assertNull(qoSList22);
        org.junit.Assert.assertNull(qoSList23);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage(header6);
        org.meqantt.message.QoS qoS9 = null;
        subscribeMessage7.addTopic("hi!", qoS9);
        org.meqantt.message.PubRelMessage pubRelMessage13 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS14 = pubRelMessage13.getQos();
        subscribeMessage7.addTopic("\000d\000\001\001d", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        java.lang.Class<?> wildcardClass3 = connectMessage1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.Message.Type type6 = header1.getType();
        org.meqantt.message.PubAckMessage pubAckMessage7 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PubAckMessage pubAckMessage2 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str8 = connectMessage7.getUsername();
        org.meqantt.message.QoS qoS12 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("", qoS12);
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        subscribeMessage13.addTopic("", qoS17);
        connectMessage7.setWill("", "\000d\000\001\001d", qoS17, true);
        boolean boolean21 = connectMessage7.isCleanSession();
        java.lang.String str22 = connectMessage7.getClientId();
        java.lang.String str23 = connectMessage7.getPassword();
        java.lang.String str24 = connectMessage7.getWill();
        byte[] byteArray25 = connectMessage7.toBytes();
        org.meqantt.message.PublishMessage publishMessage26 = new org.meqantt.message.PublishMessage("\000\003hi!", byteArray25);
        org.meqantt.message.QoS qoS27 = publishMessage26.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage2.setQos(qoS27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000d\000\001\001d" + "'", str24, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 01110000 p 112\n01: 00000010 \002 2\n02: 00000000 \000 0\n03: 00001010 \n 10\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??????????");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage8 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS9 = unsubscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("", qoS9);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setQos(qoS9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type4 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type4.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        connectMessage1.setWill("00: 01100100 d 100\n01: 00000000 \000 0\n", "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) 'a');
        boolean boolean4 = connectMessage3.hasPassword();
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
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage3 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        int int4 = connectMessage1.getKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
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
            mqttMessageHandler0.channelOpen(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: 00: 00010000 ? 16?01: 00011010 ? 26?02: 00000000 ? 0?03: 00000110 ? 6?04: 01001101 M 77?05: 01010001 Q 81?06: 01001001 I 73?07: 01110011 s 115?08: 01100100 d 100?09: 01110000 p 112?10: 00000011 ? 3?11: 00100110 & 38?12: 00000000 ? 0?13: 00000001 ? 1?14: 00000000 ? 0?15: 00000000 ? 0?16: 00000000 ? 0?17: 00000000 ? 0?18: 00000000 ? 0?19: 00001000 ? 8?20: 11000000 A? 192?21: 10000000 ? 128?22: 01100100 d 100?23: 11000000 A? 192?24: 10000000 ? 128?25: 00000001 ? 1?26: 00000001 ? 1?27: 01100100 d 100?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        java.lang.String str3 = connectMessage1.getWill();
        boolean boolean4 = connectMessage1.isCleanSession();
        org.meqantt.message.ConnectMessage connectMessage8 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList12 = subscribeMessage11.getTopics();
        org.meqantt.message.QoS qoS13 = subscribeMessage11.getQos();
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str19 = connectMessage18.getProtocolId();
        org.meqantt.message.QoS qoS20 = connectMessage18.getQos();
        subscribeMessage11.addTopic("", qoS20);
        connectMessage8.setWill("MQIsdp", "00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", qoS20, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
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
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage13.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        java.util.List<java.lang.String> strList3 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd");
        unsubscribeMessage1.setDup(false);
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 0);
        java.lang.String str12 = connectMessage11.getProtocolId();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        int int18 = subscribeMessage17.getMessageId();
        subscribeMessage17.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header22 = null;
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header22);
        int int24 = connectMessage23.getKeepAlive();
        connectMessage23.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS28 = connectMessage23.getWillQoS();
        subscribeMessage17.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS28);
        connectMessage11.setWill("00: 00000000 \000 0\n01: 00000110 \006 6\n02: 01001101 M 77\n03: 01010001 Q 81\n04: 01001001 I 73\n05: 01110011 s 115\n06: 01100100 d 100\n07: 01110000 p 112\n", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS28, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MQIsdp" + "'", str12, "MQIsdp");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
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
            disconnectMessage9.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
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
            mqttMessageHandler0.disconnectRequested(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
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
            mqttMessageHandler0.connectRequested(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("MQIsdp");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Type type3 = unsubscribeMessage1.getType();
        unsubscribeMessage1.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
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
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        java.lang.String str6 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str6, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
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
            disconnectMessage5.setQos(qoS69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
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
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList2 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.addTopic("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("MQIsdp");
        java.util.List<java.lang.String> strList7 = unsubscribeMessage1.getTopics();
        unsubscribeMessage1.setDup(false);
        unsubscribeMessage1.setDup(false);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        byte[] byteArray5 = connectMessage3.toBytes();
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        org.meqantt.message.ConnectMessage connectMessage13 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str14 = connectMessage13.getProtocolId();
        org.meqantt.message.QoS qoS15 = connectMessage13.getQos();
        subscribeMessage6.addTopic("", qoS15);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage18 = new org.meqantt.message.UnsubscribeMessage("hi!");
        java.util.List<java.lang.String> strList19 = unsubscribeMessage18.getTopics();
        org.meqantt.message.Message.Type type20 = unsubscribeMessage18.getType();
        java.util.List<java.lang.String> strList21 = unsubscribeMessage18.getTopics();
        org.meqantt.message.QoS qoS22 = unsubscribeMessage18.getQos();
        subscribeMessage6.setQos(qoS22);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[16, 14, 0, 6, 77, 81, 73, 115, 100, 112, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MQIsdp" + "'", str14, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.meqantt.message.Message.Type.UNSUBSCRIBE + "'", type20.equals(org.meqantt.message.Message.Type.UNSUBSCRIBE));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
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
            mqttMessageHandler0.bindRequested(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header2);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage3.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus5 = connAckMessage3.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus6 = connAckMessage3.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus7 = connAckMessage3.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus8 = connAckMessage3.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connAckMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus4);
        org.junit.Assert.assertNull(connectionStatus5);
        org.junit.Assert.assertNull(connectionStatus6);
        org.junit.Assert.assertNull(connectionStatus7);
        org.junit.Assert.assertNull(connectionStatus8);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        subAckMessage0.addQoS(qoS4);
        subAckMessage0.setMessageId((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ?D00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
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
            subscribeMessage59.setRetained(false);
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
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
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
            mqttMessageHandler0.closeRequested(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
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
            disconnectMessage9.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
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
        org.jboss.netty.channel.MessageEvent messageEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.messageReceived(channelHandlerContext15, messageEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("hi!");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        org.meqantt.MqttListener mqttListener4 = null;
        nettyClient1.setListener(mqttListener4);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.disconnect();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
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
        boolean boolean20 = connectMessage3.hasUsername();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
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
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage10.write(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        org.meqantt.message.QoS qoS4 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage7 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList8 = subscribeMessage7.getTopics();
        org.meqantt.message.QoS qoS9 = subscribeMessage7.getQos();
        subscribeMessage5.addTopic("", qoS9);
        subscribeMessage0.addTopic("MQIsdp", qoS9);
        java.util.List<org.meqantt.message.QoS> qoSList12 = subscribeMessage0.getTopicQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList12);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        connectMessage1.setWill("\000\000", "\000\000");
        java.lang.String str10 = connectMessage1.getWill();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000" + "'", str10, "\000\000");
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        java.lang.Class<?> wildcardClass4 = header1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.Message.Header header5 = null;
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage(header5);
        java.lang.String str7 = connectMessage6.getClientId();
        connectMessage6.setWill("hi!", "");
        boolean boolean11 = connectMessage6.hasWill();
        org.meqantt.message.QoS qoS12 = connectMessage6.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setQos(qoS12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.meqantt.util.FormatUtil.toString(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage3.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage3.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str10 = connectMessage9.getProtocolId();
        org.meqantt.message.QoS qoS11 = connectMessage9.getQos();
        subAckMessage3.addQoS(qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subAckMessage3.addQoS(qoS15);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage2.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 100);
        pubAckMessage1.setMessageId(2);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
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
            mqttMessageHandler0.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
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
            mqttMessageHandler0.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage6 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
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
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage9 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage10 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS11 = unsubAckMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage9.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
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
        org.meqantt.message.PubRecMessage pubRecMessage13 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage13.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (short) 10);
        int int2 = pubAckMessage1.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
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
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelClosed(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS4);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
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
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeComplete(channelHandlerContext15, writeCompletionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage8 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage9 = new org.meqantt.message.SubAckMessage(header1);
        subAckMessage9.setMessageId((int) (byte) 1);
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
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        connectMessage1.setCredentials("");
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS10 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, (int) (short) 1);
        byte byte4 = connectMessage3.getProtocolVersion();
        org.meqantt.message.QoS qoS5 = connectMessage3.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 3 + "'", byte4 == (byte) 3);
        org.junit.Assert.assertNull(qoS5);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.unsubscribe("\000d\000\001\001d");
        nettyClient1.connect("\000d\000\001\001d", (int) (short) 1);
        org.meqantt.MqttListener mqttListener10 = null;
        nettyClient1.setListener(mqttListener10);
        nettyClient1.subscribe("MQIsdp");
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.hasPassword();
        boolean boolean7 = connectMessage1.isCleanSession();
        boolean boolean8 = connectMessage1.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
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
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getUsername();
        int int24 = connectMessage22.getKeepAlive();
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
        connectMessage22.setWill("\000\000", "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS48, false);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + qoS13 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS13.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 3 + "'", byte18 == (byte) 3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        boolean boolean3 = connectMessage1.hasUsername();
        java.lang.String str4 = connectMessage1.getProtocolId();
        connectMessage1.setCredentials("hi!", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        java.lang.Class<?> wildcardClass8 = connectMessage1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        connectMessage1.setCredentials("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
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
            connAckMessage11.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
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
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage12.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList1 = subAckMessage0.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList2 = subAckMessage0.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage6 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str7 = connectMessage6.getProtocolId();
        org.meqantt.message.QoS qoS8 = connectMessage6.getQos();
        subAckMessage0.addQoS(qoS8);
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage0.getGrantedQoSs();
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
        org.junit.Assert.assertNotNull(qoSList10);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setQos(qoS30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + qoS12 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS12.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS30 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS30.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.Message.Header header3 = null;
        org.meqantt.message.ConnectMessage connectMessage4 = new org.meqantt.message.ConnectMessage(header3);
        java.lang.String str5 = connectMessage4.getClientId();
        connectMessage4.setWill("hi!", "");
        org.meqantt.message.QoS qoS9 = connectMessage4.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage10 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS9);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setQos(qoS9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + qoS9 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS9.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header3 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header3);
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header3);
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header3);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header3);
        org.meqantt.message.ConnAckMessage connAckMessage8 = new org.meqantt.message.ConnAckMessage(header3);
        org.meqantt.message.PubAckMessage pubAckMessage9 = new org.meqantt.message.PubAckMessage(header3);
        org.meqantt.message.PubCompMessage pubCompMessage10 = new org.meqantt.message.PubCompMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pubCompMessage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS4);
        org.meqantt.message.QoS qoS7 = subscribeMessage6.getQos();
        java.util.List<java.lang.String> strList8 = subscribeMessage6.getTopics();
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
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        org.meqantt.MqttListener mqttListener5 = null;
        nettyClient1.setListener(mqttListener5);
        nettyClient1.disconnect();
        org.meqantt.MqttListener mqttListener8 = null;
        nettyClient1.setListener(mqttListener8);
        nettyClient1.connect("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", (int) ' ');
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (byte) -1);
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
            pubCompMessage1.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("MQIsdp");
        org.meqantt.message.QoS qoS2 = unsubscribeMessage1.getQos();
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
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage3 = new org.meqantt.message.SubscribeMessage(header1);
        java.util.List<org.meqantt.message.QoS> qoSList4 = subscribeMessage3.getTopicQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qoSList4);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        org.meqantt.message.ConnectMessage connectMessage0 = new org.meqantt.message.ConnectMessage();
        java.lang.String str1 = connectMessage0.getUsername();
        boolean boolean2 = connectMessage0.hasWill();
        connectMessage0.setCredentials("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        java.lang.String str6 = connectMessage0.getPassword();
        java.lang.String str7 = connectMessage0.getProtocolId();
        int int8 = connectMessage0.getKeepAlive();
        org.meqantt.message.Message.Header header10 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header10);
        org.meqantt.message.PubCompMessage pubCompMessage12 = new org.meqantt.message.PubCompMessage(header10);
        org.meqantt.message.PubAckMessage pubAckMessage13 = new org.meqantt.message.PubAckMessage(header10);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage14 = new org.meqantt.message.UnsubscribeMessage(header10);
        org.meqantt.message.PublishMessage publishMessage15 = new org.meqantt.message.PublishMessage(header10);
        org.meqantt.message.Message.Type type16 = header10.getType();
        org.meqantt.message.PingReqMessage pingReqMessage17 = new org.meqantt.message.PingReqMessage(header10);
        org.meqantt.message.PingReqMessage pingReqMessage18 = new org.meqantt.message.PingReqMessage(header10);
        org.meqantt.message.SubAckMessage subAckMessage19 = new org.meqantt.message.SubAckMessage(header10);
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
        subAckMessage19.addQoS(qoS35);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage0.setQos(qoS35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n" + "'", str6, "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MQIsdp" + "'", str7, "MQIsdp");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
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
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", true, (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: ??Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        boolean boolean6 = subAckMessage5.isRetained();
        org.meqantt.message.QoS qoS7 = subAckMessage5.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("hi!", qoS1);
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
        org.meqantt.message.SubscribeMessage subscribeMessage63 = new org.meqantt.message.SubscribeMessage("\000\003hi!", qoS56);
        org.meqantt.message.SubscribeMessage subscribeMessage64 = new org.meqantt.message.SubscribeMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS56);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setQos(qoS56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        subscribeMessage0.setMessageId((int) (short) 0);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage11 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str12 = connectMessage11.getUsername();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        org.meqantt.message.SubscribeMessage subscribeMessage19 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList20 = subscribeMessage19.getTopics();
        org.meqantt.message.QoS qoS21 = subscribeMessage19.getQos();
        subscribeMessage17.addTopic("", qoS21);
        connectMessage11.setWill("", "\000d\000\001\001d", qoS21, true);
        boolean boolean25 = connectMessage11.isCleanSession();
        java.lang.String str26 = connectMessage11.getClientId();
        java.lang.String str27 = connectMessage11.getPassword();
        java.lang.String str28 = connectMessage11.getWill();
        byte[] byteArray29 = connectMessage11.toBytes();
        org.meqantt.message.PublishMessage publishMessage30 = new org.meqantt.message.PublishMessage("\000\003hi!", byteArray29);
        org.meqantt.message.QoS qoS31 = publishMessage30.getQos();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(qoSList6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000d\000\001\001d" + "'", str28, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[16, 26, 0, 6, 77, 81, 73, 115, 100, 112, 3, 38, 0, 1, 0, 0, 0, 0, 0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
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
            mqttMessageHandler0.disconnectRequested(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        connectMessage1.setWill("\000\000", "\000\000");
        int int10 = connectMessage1.getKeepAlive();
        boolean boolean11 = connectMessage1.hasUsername();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000\003hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) (byte) 0);
        org.meqantt.message.Message.Type type2 = pubRelMessage1.getType();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getWill();
        boolean boolean7 = connectMessage1.hasUsername();
        java.lang.String str8 = connectMessage1.getProtocolId();
        int int9 = connectMessage1.getKeepAlive();
        connectMessage1.setWill("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "\000d\000\001\001d");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage8 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage8.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
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
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage10 = new org.meqantt.message.PublishMessage("", byteArray9);
        java.lang.String str11 = publishMessage10.getDataAsString();
        byte[] byteArray12 = publishMessage10.getData();
        org.meqantt.message.PublishMessage publishMessage13 = new org.meqantt.message.PublishMessage("MQIsdp", byteArray12);
        org.meqantt.message.PublishMessage publishMessage14 = new org.meqantt.message.PublishMessage("hi!", byteArray12);
        java.lang.Class<?> wildcardClass15 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000d\000\001\001d" + "'", str11, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("\000\003hi!");
        org.meqantt.MqttListener mqttListener2 = null;
        nettyClient1.setListener(mqttListener2);
        // The following exception was thrown during execution in test generation
        try {
            nettyClient1.publish("00: 10100010 \242 162\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 00000100 \004 4\n06: 11000000 \300 192\n07: 10000000 \200 128\n08: 11000000 \300 192\n09: 10000000 \200 128\n", "00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(2);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage(3);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage((int) ' ');
        org.meqantt.message.QoS qoS2 = pubRelMessage1.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage();
        org.meqantt.message.QoS qoS8 = unsubAckMessage7.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
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
            mqttMessageHandler0.setInterestOpsRequested(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage7.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 3);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage3 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
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
        org.meqantt.message.SubAckMessage subAckMessage20 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList21 = subAckMessage20.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList22 = subAckMessage20.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage26 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str27 = connectMessage26.getProtocolId();
        org.meqantt.message.QoS qoS28 = connectMessage26.getQos();
        subAckMessage20.addQoS(qoS28);
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
        org.meqantt.message.SubAckMessage subAckMessage59 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList60 = subAckMessage59.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList61 = subAckMessage59.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList62 = subAckMessage59.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage64 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList65 = subscribeMessage64.getTopics();
        org.meqantt.message.QoS qoS66 = subscribeMessage64.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage67 = new org.meqantt.message.SubscribeMessage("", qoS66);
        subAckMessage59.addQoS(qoS66);
        connectMessage33.setWill("hi!", "MQIsdp", qoS66, true);
        subAckMessage20.addQoS(qoS66);
        org.meqantt.message.SubAckMessage subAckMessage72 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList73 = subAckMessage72.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList74 = subAckMessage72.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage78 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str79 = connectMessage78.getProtocolId();
        org.meqantt.message.QoS qoS80 = connectMessage78.getQos();
        subAckMessage72.addQoS(qoS80);
        subAckMessage20.addQoS(qoS80);
        subscribeMessage6.addTopic("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS80);
        org.meqantt.message.SubscribeMessage subscribeMessage86 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList87 = subscribeMessage86.getTopics();
        org.meqantt.message.QoS qoS88 = subscribeMessage86.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage89 = new org.meqantt.message.SubscribeMessage("", qoS88);
        org.meqantt.message.SubscribeMessage subscribeMessage90 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS88);
        org.meqantt.message.QoS qoS91 = subscribeMessage90.getQos();
        subscribeMessage6.setQos(qoS91);
        unsubscribeMessage3.setQos(qoS91);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS91);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList21);
        org.junit.Assert.assertNull(qoSList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MQIsdp" + "'", str27, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + qoS51 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS51.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList60);
        org.junit.Assert.assertNull(qoSList61);
        org.junit.Assert.assertNull(qoSList62);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + qoS66 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS66.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(qoSList73);
        org.junit.Assert.assertNull(qoSList74);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "MQIsdp" + "'", str79, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS80 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS80.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertTrue("'" + qoS88 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS88.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS91 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS91.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage4 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage4.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
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
        org.meqantt.message.PingReqMessage pingReqMessage12 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage12.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        byte[] byteArray5 = new byte[] { (byte) 3, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        java.lang.String str6 = org.meqantt.util.FormatUtil.toString(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[3, -1, -1, 1, 0]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Header header6 = null;
        org.meqantt.message.ConnectMessage connectMessage7 = new org.meqantt.message.ConnectMessage(header6);
        boolean boolean8 = connectMessage7.isWillRetained();
        boolean boolean9 = connectMessage7.isWillRetained();
        connectMessage7.setWill("", "MQIsdp");
        boolean boolean13 = connectMessage7.isWillRetained();
        java.lang.String str14 = connectMessage7.getClientId();
        java.lang.String str15 = connectMessage7.getWill();
        byte byte16 = connectMessage7.getProtocolVersion();
        java.lang.String str17 = connectMessage7.getPassword();
        boolean boolean18 = connectMessage7.hasPassword();
        org.meqantt.message.QoS qoS19 = connectMessage7.getWillQoS();
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MQIsdp" + "'", str15, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 3 + "'", byte16 == (byte) 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        java.lang.String str4 = connectMessage1.getUsername();
        connectMessage1.setCredentials("\000d\000\001\001d", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
        int int8 = connectMessage1.getKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = connectMessage1.toBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) ' ');
        org.meqantt.message.QoS qoS3 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage4 = new org.meqantt.message.SubscribeMessage("", qoS3);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        org.meqantt.message.QoS qoS8 = subscribeMessage6.getQos();
        subscribeMessage4.addTopic("", qoS8);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
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
            pingReqMessage10.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        boolean boolean3 = connectMessage2.isWillRetained();
        java.lang.String str4 = connectMessage2.getWillTopic();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage2.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header2);
        java.lang.String str4 = publishMessage3.getTopic();
        int int5 = publishMessage3.getMessageId();
        java.lang.String str6 = publishMessage3.getTopic();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) publishMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        int int3 = subscribeMessage2.getMessageId();
        subscribeMessage2.setMessageId((int) (short) 10);
        subscribeMessage2.setDup(false);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.write(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage3 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage4 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage6 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage7.setQos(qoS29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + qoS29 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS29.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
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
            mqttMessageHandler0.closeRequested(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
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
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type3.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertNull(qoS9);
        org.junit.Assert.assertNull(qoS10);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage6.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        unsubscribeMessage4.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.message.Message.Header header8 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type9 = header8.getType();
        org.meqantt.message.Message.Type type10 = header8.getType();
        org.meqantt.message.SubAckMessage subAckMessage11 = new org.meqantt.message.SubAckMessage(header8);
        java.util.List<org.meqantt.message.QoS> qoSList12 = subAckMessage11.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage17 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str18 = connectMessage17.getUsername();
        org.meqantt.message.QoS qoS22 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage23 = new org.meqantt.message.SubscribeMessage("", qoS22);
        org.meqantt.message.SubscribeMessage subscribeMessage25 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList26 = subscribeMessage25.getTopics();
        org.meqantt.message.QoS qoS27 = subscribeMessage25.getQos();
        subscribeMessage23.addTopic("", qoS27);
        connectMessage17.setWill("", "\000d\000\001\001d", qoS27, true);
        org.meqantt.message.SubscribeMessage subscribeMessage31 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS27);
        subAckMessage11.addQoS(qoS27);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setQos(qoS27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
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
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
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
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 3, (byte) 3, (byte) 1 };
        java.lang.String str6 = org.meqantt.util.FormatUtil.dumpByteArray(byteArray5);
        org.meqantt.message.PublishMessage publishMessage7 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", byteArray5);
        java.lang.String str8 = publishMessage7.getTopic();
        org.meqantt.message.Message.Type type9 = publishMessage7.getType();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 3, 3, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n" + "'", str6, "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str8, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.meqantt.message.Message.Type.PUBLISH + "'", type9.equals(org.meqantt.message.Message.Type.PUBLISH));
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.QoS qoS10 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList14 = subscribeMessage13.getTopics();
        org.meqantt.message.QoS qoS15 = subscribeMessage13.getQos();
        subscribeMessage11.addTopic("", qoS15);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setQos(qoS15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + qoS15 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS15.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage7 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("\001\003\003\001");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", (int) '\001');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ????d????d");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
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
        org.meqantt.message.PubCompMessage pubCompMessage12 = new org.meqantt.message.PubCompMessage(header3);
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) pubCompMessage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        org.meqantt.message.SubscribeMessage subscribeMessage6 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS4);
        java.util.List<java.lang.String> strList7 = subscribeMessage6.getTopics();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subscribeMessage6.getTopicQoSs();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(qoSList8);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 00110000 0 48?01: 00001000 ? 8?02: 00000000 ? 0?03: 00000000 ? 0?04: 00000000 ? 0?05: 01100100 d 100?06: 00000000 ? 0?07: 00000001 ? 1?08: 00000001 ? 1?09: 01100100 d 100?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage9 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage9.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        boolean boolean3 = connectMessage1.isCleanSession();
        java.lang.String str4 = connectMessage1.getPassword();
        connectMessage1.setCredentials("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n");
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.PubCompMessage pubCompMessage5 = new org.meqantt.message.PubCompMessage(header1);
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
            pubCompMessage5.setQos(qoS57);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
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
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        java.lang.String str5 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage7 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage8.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str5, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header10 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header10);
        org.meqantt.message.PubCompMessage pubCompMessage12 = new org.meqantt.message.PubCompMessage(header10);
        org.meqantt.message.SubAckMessage subAckMessage13 = new org.meqantt.message.SubAckMessage(header10);
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
        subAckMessage13.addQoS(qoS60);
        org.meqantt.message.SubscribeMessage subscribeMessage67 = new org.meqantt.message.SubscribeMessage("00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS60);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage7.setQos(qoS60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
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
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage3 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
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
            pubCompMessage4.setQos(qoS56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
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
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", 32);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ?D00: 00000001 ? 1?01: 00000011 ? 3?02: 00000011 ? 3?03: 00000001 ? 1?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
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
        java.util.List<org.meqantt.message.QoS> qoSList20 = subscribeMessage19.getTopicQoSs();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + qoS5 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS5.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS8 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS8.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_LEAST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_LEAST_ONCE));
        org.junit.Assert.assertNotNull(qoSList20);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        boolean boolean2 = connAckMessage1.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage5 = new org.meqantt.message.PubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage5.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage7 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000d\000\001\001d");
        unsubscribeMessage1.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        unsubscribeMessage1.addTopic("");
        java.util.List<java.lang.String> strList6 = unsubscribeMessage1.getTopics();
        org.meqantt.message.Message.Header header8 = null;
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        java.lang.String str10 = connectMessage9.getClientId();
        connectMessage9.setWill("hi!", "");
        org.meqantt.message.QoS qoS14 = connectMessage9.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS14);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setQos(qoS14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        org.meqantt.message.PubAckMessage pubAckMessage1 = new org.meqantt.message.PubAckMessage((int) (byte) 1);
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
        java.lang.String str22 = connectMessage5.getProtocolId();
        connectMessage5.setWill("", "\001\003\003\001");
        org.meqantt.message.SubAckMessage subAckMessage28 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList31 = subscribeMessage30.getTopics();
        org.meqantt.message.QoS qoS32 = subscribeMessage30.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("", qoS32);
        subAckMessage28.addQoS(qoS32);
        connectMessage5.setWill("", "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", qoS32, false);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage1.setQos(qoS32);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + qoS32 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS32.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
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
        org.meqantt.message.Message.Header header65 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type66 = header65.getType();
        org.meqantt.message.Message.Type type67 = header65.getType();
        org.meqantt.message.SubAckMessage subAckMessage68 = new org.meqantt.message.SubAckMessage(header65);
        org.meqantt.message.PingReqMessage pingReqMessage69 = new org.meqantt.message.PingReqMessage(header65);
        org.meqantt.message.SubscribeMessage subscribeMessage70 = new org.meqantt.message.SubscribeMessage(header65);
        java.util.List<java.lang.String> strList71 = subscribeMessage70.getTopics();
        org.meqantt.message.QoS qoS74 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage75 = new org.meqantt.message.SubscribeMessage("", qoS74);
        int int76 = subscribeMessage75.getMessageId();
        subscribeMessage75.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header80 = null;
        org.meqantt.message.ConnectMessage connectMessage81 = new org.meqantt.message.ConnectMessage(header80);
        int int82 = connectMessage81.getKeepAlive();
        connectMessage81.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS86 = connectMessage81.getWillQoS();
        subscribeMessage75.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS86);
        subscribeMessage70.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS86);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS86);
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
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 3 + "'", byte27 == (byte) 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(type66);
        org.junit.Assert.assertNull(type67);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + qoS86 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS86.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
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
            mqttMessageHandler0.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        org.meqantt.message.PublishMessage publishMessage10 = new org.meqantt.message.PublishMessage("", byteArray9);
        java.lang.String str11 = publishMessage10.getDataAsString();
        byte[] byteArray12 = publishMessage10.getData();
        org.meqantt.message.PublishMessage publishMessage13 = new org.meqantt.message.PublishMessage("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]", byteArray12);
        org.meqantt.message.PublishMessage publishMessage14 = new org.meqantt.message.PublishMessage("Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", byteArray12);
        java.lang.String str15 = org.meqantt.util.FormatUtil.toString(byteArray12);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000d\000\001\001d" + "'", str11, "\000d\000\001\001d");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 100, 0, 1, 1, 100]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        java.util.List<java.lang.String> strList6 = unsubscribeMessage5.getTopics();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage5.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList8 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList9 = subAckMessage7.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList10 = subAckMessage7.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS14 = subscribeMessage12.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage("", qoS14);
        subAckMessage7.addQoS(qoS14);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList18 = subscribeMessage17.getTopics();
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str24 = connectMessage23.getProtocolId();
        org.meqantt.message.QoS qoS25 = connectMessage23.getQos();
        subscribeMessage17.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS25);
        subAckMessage7.addQoS(qoS25);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage6.setQos(qoS25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNull(qoSList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MQIsdp" + "'", str24, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS25 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS25.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("\000\b\ufffd\ufffd\ufffd\ufffd\001\001d", true, 1);
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
        org.meqantt.message.SubAckMessage subAckMessage33 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList34 = subAckMessage33.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList35 = subAckMessage33.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList36 = subAckMessage33.getGrantedQoSs();
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList39 = subscribeMessage38.getTopics();
        org.meqantt.message.QoS qoS40 = subscribeMessage38.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage41 = new org.meqantt.message.SubscribeMessage("", qoS40);
        subAckMessage33.addQoS(qoS40);
        connectMessage7.setWill("hi!", "MQIsdp", qoS40, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
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
        org.junit.Assert.assertNull(qoSList34);
        org.junit.Assert.assertNull(qoSList35);
        org.junit.Assert.assertNull(qoSList36);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + qoS40 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS40.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
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
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.childChannelOpen(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getPassword();
        java.lang.String str3 = connectMessage1.getWillTopic();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
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
            pingReqMessage5.setQos(qoS19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + qoS19 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS19.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
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
        org.meqantt.message.QoS qoS27 = connectMessage3.getQos();
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
        org.junit.Assert.assertTrue("'" + qoS27 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS27.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.DisconnectMessage disconnectMessage5 = new org.meqantt.message.DisconnectMessage(header1);
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
            disconnectMessage5.setQos(qoS20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type2.equals(org.meqantt.message.Message.Type.PUBREL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]" + "'", str4, "Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]");
        org.junit.Assert.assertNull(qoSList7);
        org.junit.Assert.assertNull(qoSList8);
        org.junit.Assert.assertNull(qoSList9);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MQIsdp" + "'", str19, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS20 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS20.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        java.lang.String str2 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]" + "'", str2, "Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.PublishMessage publishMessage1 = new org.meqantt.message.PublishMessage(header0);
        publishMessage1.setMessageId((-1));
        byte[] byteArray4 = publishMessage1.getData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = publishMessage1.getDataAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        boolean boolean4 = connectMessage3.hasWill();
        java.lang.String str5 = connectMessage3.getWill();
        java.lang.String str6 = connectMessage3.getWill();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.write(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        org.meqantt.message.DisconnectMessage disconnectMessage0 = new org.meqantt.message.DisconnectMessage();
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
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
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", true, (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client id cannot be null and must be at most 23 characters long: Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage5 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage8 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage9 = new org.meqantt.message.ConnAckMessage(header1);
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
            connAckMessage9.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList11);
        org.junit.Assert.assertNull(qoSList12);
        org.junit.Assert.assertNull(qoSList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "MQIsdp" + "'", str22, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.isCleanSession();
        java.lang.String str6 = connectMessage1.getProtocolId();
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
        org.meqantt.message.QoS qoS34 = connectMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage5.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        boolean boolean8 = connAckMessage7.isDup();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage7.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        subscribeMessage0.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList6 = subscribeMessage0.getTopics();
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str11 = connectMessage10.getUsername();
        java.lang.String str12 = connectMessage10.getWill();
        org.meqantt.message.Message.Header header16 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type17 = header16.getType();
        org.meqantt.message.Message.Type type18 = header16.getType();
        org.meqantt.message.PubRelMessage pubRelMessage19 = new org.meqantt.message.PubRelMessage(header16);
        org.meqantt.message.SubAckMessage subAckMessage20 = new org.meqantt.message.SubAckMessage(header16);
        boolean boolean21 = subAckMessage20.isRetained();
        org.meqantt.message.QoS qoS22 = subAckMessage20.getQos();
        connectMessage10.setWill("\000\003hi!", "Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", qoS22, false);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setQos(qoS22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(type17);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + qoS22 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS22.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        java.io.OutputStream outputStream0 = null;
        org.meqantt.message.MessageOutputStream messageOutputStream1 = new org.meqantt.message.MessageOutputStream(outputStream0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE;
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(connectionStatus2);
        boolean boolean4 = connAckMessage3.isRetained();
        // The following exception was thrown during execution in test generation
        try {
            messageOutputStream1.writeMessage((org.meqantt.message.Message) connAckMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus2 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE + "'", connectionStatus2.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.SERVER_UNAVAILABLE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) '4');
        org.meqantt.message.Message.Header header2 = null;
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage(header2);
        boolean boolean4 = connectMessage3.isWillRetained();
        boolean boolean5 = connectMessage3.isWillRetained();
        java.lang.String str6 = connectMessage3.getUsername();
        boolean boolean7 = connectMessage3.isCleanSession();
        java.lang.String str8 = connectMessage3.getWill();
        boolean boolean9 = connectMessage3.hasUsername();
        java.lang.String str10 = connectMessage3.getProtocolId();
        org.meqantt.message.Message.Header header13 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage(header13);
        org.meqantt.message.QoS qoS16 = null;
        subscribeMessage14.addTopic("hi!", qoS16);
        java.util.List<org.meqantt.message.QoS> qoSList18 = subscribeMessage14.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage24 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str25 = connectMessage24.getUsername();
        org.meqantt.message.QoS qoS29 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage30 = new org.meqantt.message.SubscribeMessage("", qoS29);
        org.meqantt.message.SubscribeMessage subscribeMessage32 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList33 = subscribeMessage32.getTopics();
        org.meqantt.message.QoS qoS34 = subscribeMessage32.getQos();
        subscribeMessage30.addTopic("", qoS34);
        connectMessage24.setWill("", "\000d\000\001\001d", qoS34, true);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("hi!", qoS34);
        subscribeMessage14.addTopic("\000d\000\001\001d", qoS34);
        connectMessage3.setWill("\000d\000\001\001d", "00: 00010000 \020 16\n01: 00011010 \032 26\n02: 00000000 \000 0\n03: 00000110 \006 6\n04: 01001101 M 77\n05: 01010001 Q 81\n06: 01001001 I 73\n07: 01110011 s 115\n08: 01100100 d 100\n09: 01110000 p 112\n10: 00000011 \003 3\n11: 00100110 & 38\n12: 00000000 \000 0\n13: 00000001 \001 1\n14: 00000000 \000 0\n15: 00000000 \000 0\n16: 00000000 \000 0\n17: 00000000 \000 0\n18: 00000000 \000 0\n19: 00001000 \b 8\n20: 11000000 \300 192\n21: 10000000 \200 128\n22: 01100100 d 100\n23: 11000000 \300 192\n24: 10000000 \200 128\n25: 00000001 \001 1\n26: 00000001 \001 1\n27: 01100100 d 100\n", qoS34, false);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setQos(qoS34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MQIsdp" + "'", str10, "MQIsdp");
        org.junit.Assert.assertNotNull(qoSList18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + qoS34 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS34.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
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
        java.lang.Class<?> wildcardClass21 = subscribeMessage18.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + qoS14 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS14.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getWill();
        byte byte10 = connectMessage1.getProtocolVersion();
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
            connectMessage1.setQos(qoS42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MQIsdp" + "'", str9, "MQIsdp");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 3 + "'", byte10 == (byte) 3);
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
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("\000d\000\001\001d", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ?d???d");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
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
        java.lang.String str11 = connectMessage1.getClientId();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        connectMessage1.setCredentials("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        connectMessage1.setCredentials("MQIsdp");
        // The following exception was thrown during execution in test generation
        try {
            org.meqantt.message.QoS qoS12 = connectMessage1.getQos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
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
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage10 = new org.meqantt.message.ConnectMessage("", true, 1);
        byte byte11 = connectMessage10.getProtocolVersion();
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList15 = subscribeMessage14.getTopics();
        org.meqantt.message.QoS qoS16 = subscribeMessage14.getQos();
        org.meqantt.message.QoS qoS18 = null;
        subscribeMessage14.addTopic("", qoS18);
        java.util.List<org.meqantt.message.QoS> qoSList20 = subscribeMessage14.getTopicQoSs();
        subscribeMessage14.setDup(false);
        java.util.List<org.meqantt.message.QoS> qoSList23 = subscribeMessage14.getTopicQoSs();
        org.meqantt.message.ConnectMessage connectMessage28 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str29 = connectMessage28.getUsername();
        org.meqantt.message.QoS qoS33 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage34 = new org.meqantt.message.SubscribeMessage("", qoS33);
        org.meqantt.message.SubscribeMessage subscribeMessage36 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList37 = subscribeMessage36.getTopics();
        org.meqantt.message.QoS qoS38 = subscribeMessage36.getQos();
        subscribeMessage34.addTopic("", qoS38);
        connectMessage28.setWill("", "\000d\000\001\001d", qoS38, true);
        subscribeMessage14.addTopic("\000\000", qoS38);
        connectMessage10.setWill("", "\000\003hi!", qoS38, true);
        org.meqantt.message.Message.Header header47 = null;
        org.meqantt.message.ConnectMessage connectMessage48 = new org.meqantt.message.ConnectMessage(header47);
        boolean boolean49 = connectMessage48.isWillRetained();
        boolean boolean50 = connectMessage48.isWillRetained();
        java.lang.String str51 = connectMessage48.getUsername();
        org.meqantt.message.QoS qoS55 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage56 = new org.meqantt.message.SubscribeMessage("", qoS55);
        org.meqantt.message.SubscribeMessage subscribeMessage58 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList59 = subscribeMessage58.getTopics();
        org.meqantt.message.QoS qoS60 = subscribeMessage58.getQos();
        subscribeMessage56.addTopic("", qoS60);
        connectMessage48.setWill("hi!", "", qoS60, false);
        boolean boolean64 = connectMessage48.hasUsername();
        org.meqantt.message.QoS qoS65 = connectMessage48.getWillQoS();
        connectMessage10.setWill("hi!", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS65, true);
        org.meqantt.message.QoS qoS68 = connectMessage10.getQos();
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setQos(qoS68);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 3 + "'", byte11 == (byte) 3);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + qoS16 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS16.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList20);
        org.junit.Assert.assertNotNull(qoSList23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + qoS38 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS38.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertTrue("'" + qoS60 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS60.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + qoS65 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS65.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS68 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS68.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.UnsubAckMessage unsubAckMessage3 = new org.meqantt.message.UnsubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage3.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(header0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus2 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage1.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage1.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = connAckMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(connectionStatus2);
        org.junit.Assert.assertNull(connectionStatus3);
        org.junit.Assert.assertNull(connectionStatus4);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
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
            pubAckMessage7.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        int int2 = connectMessage1.getKeepAlive();
        connectMessage1.setWill("MQIsdp", "");
        java.lang.String str6 = connectMessage1.getWillTopic();
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
        org.meqantt.message.SubscribeMessage subscribeMessage33 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS26);
        org.meqantt.message.SubscribeMessage subscribeMessage35 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList36 = subscribeMessage35.getTopics();
        org.meqantt.message.ConnectMessage connectMessage41 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str42 = connectMessage41.getProtocolId();
        org.meqantt.message.QoS qoS43 = connectMessage41.getQos();
        subscribeMessage35.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS43);
        subscribeMessage33.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS43);
        org.meqantt.message.ConnectMessage connectMessage50 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str51 = connectMessage50.getProtocolId();
        org.meqantt.message.QoS qoS52 = connectMessage50.getQos();
        subscribeMessage33.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS52);
        connectMessage1.setWill("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", "\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS52, false);
        org.meqantt.message.ConnectMessage connectMessage59 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str60 = connectMessage59.getClientId();
        boolean boolean61 = connectMessage59.hasUsername();
        boolean boolean62 = connectMessage59.isCleanSession();
        boolean boolean63 = connectMessage59.hasPassword();
        org.meqantt.message.Message.Header header66 = null;
        org.meqantt.message.ConnectMessage connectMessage67 = new org.meqantt.message.ConnectMessage(header66);
        int int68 = connectMessage67.getKeepAlive();
        connectMessage67.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS72 = connectMessage67.getWillQoS();
        connectMessage59.setWill("", "MQIsdp", qoS72, true);
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setQos(qoS72);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MQIsdp" + "'", str6, "MQIsdp");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + qoS26 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS26.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "MQIsdp" + "'", str42, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "MQIsdp" + "'", str51, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS52 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS52.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + qoS72 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS72.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage4 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList9 = subscribeMessage8.getTopics();
        org.meqantt.message.QoS qoS10 = subscribeMessage8.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage11 = new org.meqantt.message.SubscribeMessage("", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS10);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("\000\000", qoS10);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage4.setQos(qoS10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage5.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        org.meqantt.message.PubCompMessage pubCompMessage1 = new org.meqantt.message.PubCompMessage((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage4.setQos(qoS18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage6 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header8 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage9 = new org.meqantt.message.ConnectMessage(header8);
        connectMessage9.setWill("\000\000", "00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        org.meqantt.message.SubscribeMessage subscribeMessage15 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList16 = subscribeMessage15.getTopics();
        org.meqantt.message.QoS qoS17 = subscribeMessage15.getQos();
        org.meqantt.message.ConnectMessage connectMessage22 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str23 = connectMessage22.getProtocolId();
        org.meqantt.message.QoS qoS24 = connectMessage22.getQos();
        subscribeMessage15.addTopic("", qoS24);
        connectMessage9.setWill("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]", "00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS24, true);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage6.setQos(qoS24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "MQIsdp" + "'", str23, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        connectMessage1.setCredentials("\000d\000\001\001d");
        java.lang.String str4 = connectMessage1.getProtocolId();
        boolean boolean5 = connectMessage1.hasWill();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PingRespMessage pingRespMessage8 = new org.meqantt.message.PingRespMessage(header1);
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage9 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.Message.Header header11 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type12 = header11.getType();
        org.meqantt.message.Message.Type type13 = header11.getType();
        org.meqantt.message.PubRelMessage pubRelMessage14 = new org.meqantt.message.PubRelMessage(header11);
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage(header11);
        boolean boolean16 = subAckMessage15.isRetained();
        org.meqantt.message.QoS qoS17 = subAckMessage15.getQos();
        org.meqantt.message.PublishMessage publishMessage20 = new org.meqantt.message.PublishMessage("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "MQIsdp");
        org.meqantt.message.QoS qoS21 = publishMessage20.getQos();
        subAckMessage15.addQoS(qoS21);
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage9.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE is always using QoS-level AT LEAST ONCE. Requested level: AT_MOST_ONCE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + qoS17 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS17.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", true, 100);
        java.lang.String str4 = connectMessage3.getPassword();
        boolean boolean5 = connectMessage3.hasUsername();
        int int6 = connectMessage3.getKeepAlive();
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
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setQos(qoS21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + qoS21 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS21.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("00: 10010000 \220 144\n01: 00000011 \003 3\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n", 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: 00: 10010000 ? 144?01: 00000011 ? 3?02: 00000000 ? 0?03: 00000000 ? 0?04: 00000000 ? 0?");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
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
            mqttMessageHandler0.channelConnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 3);
        org.meqantt.message.SubAckMessage subAckMessage2 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage3 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList4 = subAckMessage3.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList5 = subAckMessage3.getGrantedQoSs();
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
        subAckMessage3.addQoS(qoS23);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage2.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(qoSList4);
        org.junit.Assert.assertNull(qoSList5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        org.meqantt.message.SubAckMessage subAckMessage0 = new org.meqantt.message.SubAckMessage();
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList3 = subscribeMessage2.getTopics();
        org.meqantt.message.QoS qoS4 = subscribeMessage2.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage("", qoS4);
        subAckMessage0.addQoS(qoS4);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + qoS4 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS4.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage7 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage(1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage1.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        org.meqantt.message.Message.Header header1 = null;
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        java.lang.String str3 = connectMessage2.getClientId();
        connectMessage2.setWill("hi!", "");
        org.meqantt.message.QoS qoS7 = connectMessage2.getWillQoS();
        org.meqantt.message.SubscribeMessage subscribeMessage8 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS7);
        java.lang.Class<?> wildcardClass9 = subscribeMessage8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + qoS7 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS7.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        org.meqantt.message.QoS qoS1 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage2 = new org.meqantt.message.SubscribeMessage("", qoS1);
        int int3 = subscribeMessage2.getMessageId();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage2.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage6 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage7 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage8 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage8.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str4 = connectMessage3.getProtocolId();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MQIsdp" + "'", str4, "MQIsdp");
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        java.lang.String str9 = connectMessage1.getUsername();
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
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
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
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
        java.lang.Class<?> wildcardClass41 = qoS36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getClientId();
        byte byte9 = connectMessage1.getProtocolVersion();
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
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 3 + "'", byte9 == (byte) 3);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        org.meqantt.message.PingReqMessage pingReqMessage0 = new org.meqantt.message.PingReqMessage();
        boolean boolean1 = pingReqMessage0.isDup();
        // The following exception was thrown during execution in test generation
        try {
            pingReqMessage0.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PINGREQ message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        boolean boolean6 = connectMessage1.isCleanSession();
        boolean boolean7 = connectMessage1.isCleanSession();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getClientId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
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
        connectMessage3.setCredentials("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", "");
        boolean boolean22 = connectMessage3.hasUsername();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage4 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.Message.Type type5 = pubAckMessage4.getType();
        org.meqantt.message.SubscribeMessage subscribeMessage9 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList10 = subscribeMessage9.getTopics();
        org.meqantt.message.QoS qoS11 = subscribeMessage9.getQos();
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage("", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage13 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS11);
        org.meqantt.message.SubscribeMessage subscribeMessage14 = new org.meqantt.message.SubscribeMessage("\000\000", qoS11);
        // The following exception was thrown during execution in test generation
        try {
            pubAckMessage4.setQos(qoS11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + qoS11 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS11.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        org.meqantt.message.PubRecMessage pubRecMessage1 = new org.meqantt.message.PubRecMessage((int) (short) -1);
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
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
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
            mqttMessageHandler0.connectRequested(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
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
            unsubAckMessage9.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        java.lang.String str2 = connectMessage1.getClientId();
        connectMessage1.setWill("hi!", "");
        org.meqantt.message.QoS qoS6 = connectMessage1.getWillQoS();
        connectMessage1.setWill("\000d\000\001\001d", "00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            connectMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + qoS6 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS6.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
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
            mqttMessageHandler0.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
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
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        org.meqantt.message.Message.Type type1 = subscribeMessage0.getType();
        subscribeMessage0.setDup(false);
        subscribeMessage0.setMessageId((int) (short) 0);
        java.util.List<java.lang.String> strList6 = subscribeMessage0.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.meqantt.message.Message.Type.SUBSCRIBE + "'", type1.equals(org.meqantt.message.Message.Type.SUBSCRIBE));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.SubAckMessage subAckMessage4 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PingReqMessage pingReqMessage5 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage6 = new org.meqantt.message.PubRelMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
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
            mqttMessageHandler0.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.QoS qoS4 = null;
        subscribeMessage0.addTopic("", qoS4);
        java.util.List<org.meqantt.message.QoS> qoSList6 = subscribeMessage0.getTopicQoSs();
        subscribeMessage0.setDup(false);
        java.util.List<java.lang.String> strList9 = subscribeMessage0.getTopics();
        org.meqantt.message.Message.Header header12 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type13 = header12.getType();
        org.meqantt.message.Message.Type type14 = header12.getType();
        org.meqantt.message.SubAckMessage subAckMessage15 = new org.meqantt.message.SubAckMessage(header12);
        org.meqantt.message.PingReqMessage pingReqMessage16 = new org.meqantt.message.PingReqMessage(header12);
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage(header12);
        org.meqantt.message.ConnectMessage connectMessage18 = new org.meqantt.message.ConnectMessage(header12);
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
        org.meqantt.message.SubscribeMessage subscribeMessage49 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS43);
        connectMessage18.setWill("hi!", "\000\000", qoS43, true);
        subscribeMessage0.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS43);
        java.util.List<java.lang.String> strList53 = subscribeMessage0.getTopics();
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(qoSList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + qoS43 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS43.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList53);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage4 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.SubscribeMessage subscribeMessage5 = new org.meqantt.message.SubscribeMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
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
        org.meqantt.message.SubAckMessage subAckMessage59 = new org.meqantt.message.SubAckMessage();
        java.util.List<org.meqantt.message.QoS> qoSList60 = subAckMessage59.getGrantedQoSs();
        java.util.List<org.meqantt.message.QoS> qoSList61 = subAckMessage59.getGrantedQoSs();
        org.meqantt.message.ConnectMessage connectMessage65 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str66 = connectMessage65.getProtocolId();
        org.meqantt.message.QoS qoS67 = connectMessage65.getQos();
        subAckMessage59.addQoS(qoS67);
        subAckMessage7.addQoS(qoS67);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setQos(qoS67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type3);
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
        org.junit.Assert.assertNull(qoSList60);
        org.junit.Assert.assertNull(qoSList61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "MQIsdp" + "'", str66, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS67 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS67.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage2.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(connectionStatus4);
        org.meqantt.message.Message.Header header7 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type8 = header7.getType();
        org.meqantt.message.Message.Type type9 = header7.getType();
        org.meqantt.message.SubAckMessage subAckMessage10 = new org.meqantt.message.SubAckMessage(header7);
        org.meqantt.message.PingReqMessage pingReqMessage11 = new org.meqantt.message.PingReqMessage(header7);
        org.meqantt.message.SubscribeMessage subscribeMessage12 = new org.meqantt.message.SubscribeMessage(header7);
        java.util.List<java.lang.String> strList13 = subscribeMessage12.getTopics();
        org.meqantt.message.QoS qoS16 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage17 = new org.meqantt.message.SubscribeMessage("", qoS16);
        int int18 = subscribeMessage17.getMessageId();
        subscribeMessage17.setMessageId((int) (short) 10);
        org.meqantt.message.Message.Header header22 = null;
        org.meqantt.message.ConnectMessage connectMessage23 = new org.meqantt.message.ConnectMessage(header22);
        int int24 = connectMessage23.getKeepAlive();
        connectMessage23.setWill("MQIsdp", "");
        org.meqantt.message.QoS qoS28 = connectMessage23.getWillQoS();
        subscribeMessage17.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS28);
        subscribeMessage12.addTopic("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS28);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage5.setQos(qoS28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus4 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus4.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + qoS28 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS28.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage3 = new org.meqantt.message.DisconnectMessage(header1);
        org.meqantt.message.Message.Header header5 = new org.meqantt.message.Message.Header((byte) 100);
        org.meqantt.message.Message.Type type6 = header5.getType();
        org.meqantt.message.SubAckMessage subAckMessage7 = new org.meqantt.message.SubAckMessage(header5);
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
        subAckMessage7.addQoS(qoS31);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage3.setQos(qoS31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.meqantt.message.Message.Type.PUBREL + "'", type6.equals(org.meqantt.message.Message.Type.PUBREL));
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
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.PubRecMessage pubRecMessage6 = new org.meqantt.message.PubRecMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubRecMessage6.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRec messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        java.lang.String str8 = connectMessage1.getProtocolId();
        connectMessage1.setCredentials("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = connectMessage1.isRetained();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MQIsdp" + "'", str8, "MQIsdp");
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
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
            subAckMessage4.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d" + "'", str8, "\000\b\ufffd\ufffd\ufffd\ufffd\001\001d");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 8, -64, -128, 100, -64, -128, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + qoS10 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS10.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus0 = org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED;
        org.meqantt.message.ConnAckMessage connAckMessage1 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage connAckMessage2 = new org.meqantt.message.ConnAckMessage(connectionStatus0);
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus3 = connAckMessage2.getStatus();
        org.meqantt.message.ConnAckMessage.ConnectionStatus connectionStatus4 = connAckMessage2.getStatus();
        org.meqantt.message.ConnAckMessage connAckMessage5 = new org.meqantt.message.ConnAckMessage(connectionStatus4);
        org.meqantt.message.ConnAckMessage connAckMessage6 = new org.meqantt.message.ConnAckMessage(connectionStatus4);
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage6.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + connectionStatus0 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus0.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus3 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus3.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
        org.junit.Assert.assertTrue("'" + connectionStatus4 + "' != '" + org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED + "'", connectionStatus4.equals(org.meqantt.message.ConnAckMessage.ConnectionStatus.IDENTIFIER_REJECTED));
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
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
            unsubAckMessage8.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.ConnectMessage connectMessage2 = new org.meqantt.message.ConnectMessage(header1);
        org.meqantt.message.PubAckMessage pubAckMessage3 = new org.meqantt.message.PubAckMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage4 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.PubRecMessage pubRecMessage5 = new org.meqantt.message.PubRecMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage6 = new org.meqantt.message.SubAckMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            subAckMessage6.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SubAck messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage3 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
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
            pubCompMessage4.setQos(qoS58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
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
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
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
            byte[] byteArray13 = connectMessage1.toBytes();
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
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
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
        // The following exception was thrown during execution in test generation
        try {
            connAckMessage13.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNACK messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str10, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage3 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage4 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header1);
        connectMessage5.setCredentials("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", "\000D00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
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
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.writeRequested(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.ConnAckMessage connAckMessage3 = new org.meqantt.message.ConnAckMessage(header1);
        org.meqantt.message.PubCompMessage pubCompMessage4 = new org.meqantt.message.PubCompMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage4.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        org.meqantt.message.PubRelMessage pubRelMessage1 = new org.meqantt.message.PubRelMessage(32);
        // The following exception was thrown during execution in test generation
        try {
            pubRelMessage1.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubRel messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("");
        nettyClient1.connect("", (int) (short) 0);
        nettyClient1.disconnect();
        nettyClient1.ping();
        nettyClient1.subscribe("Header [type=null, retain=false, qos=AT_MOST_ONCE, dup=false]");
        org.meqantt.MqttListener mqttListener9 = null;
        nettyClient1.setListener(mqttListener9);
        org.meqantt.MqttListener mqttListener11 = null;
        nettyClient1.setListener(mqttListener11);
        nettyClient1.subscribe("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n");
        nettyClient1.connect("\001\003\003\001", (int) (short) 10);
        nettyClient1.subscribe("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        nettyClient1.connect("00: 00000000 \000 0\n01: 00000000 \000 0\n", (int) (byte) 10);
        nettyClient1.disconnect();
        nettyClient1.disconnect();
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        org.meqantt.SocketClient socketClient1 = new org.meqantt.SocketClient("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        // The following exception was thrown during execution in test generation
        try {
            socketClient1.connect("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
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
            mqttMessageHandler0.channelOpen(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.PingReqMessage pingReqMessage2 = new org.meqantt.message.PingReqMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        java.lang.String str4 = header1.toString();
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage5 = new org.meqantt.message.UnsubscribeMessage(header1);
        org.meqantt.message.Message.Type type6 = header1.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]" + "'", str4, "Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]");
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        org.meqantt.message.ConnectMessage connectMessage3 = new org.meqantt.message.ConnectMessage("MQIsdp", false, (int) (short) 10);
        boolean boolean4 = connectMessage3.hasPassword();
        int int5 = connectMessage3.getKeepAlive();
        byte byte6 = connectMessage3.getProtocolVersion();
        // The following exception was thrown during execution in test generation
        try {
            connectMessage3.setRetained(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CONNECT messages don't use the RETAIN flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 10);
        org.meqantt.message.UnsubAckMessage unsubAckMessage2 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.Message.Header header4 = null;
        org.meqantt.message.ConnectMessage connectMessage5 = new org.meqantt.message.ConnectMessage(header4);
        boolean boolean6 = connectMessage5.isWillRetained();
        boolean boolean7 = connectMessage5.isWillRetained();
        java.lang.String str8 = connectMessage5.getUsername();
        connectMessage5.setCredentials("\000d\000\001\001d", "00: 00000000 \000 0\n01: 00000000 \000 0\n");
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
        org.meqantt.message.ConnectMessage connectMessage55 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str56 = connectMessage55.getProtocolId();
        org.meqantt.message.QoS qoS57 = connectMessage55.getQos();
        subscribeMessage38.addTopic("Header [type=null, retain=true, qos=AT_MOST_ONCE, dup=false]", qoS57);
        org.meqantt.message.ConnectMessage connectMessage67 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str68 = connectMessage67.getUsername();
        org.meqantt.message.QoS qoS72 = null;
        org.meqantt.message.SubscribeMessage subscribeMessage73 = new org.meqantt.message.SubscribeMessage("", qoS72);
        org.meqantt.message.SubscribeMessage subscribeMessage75 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList76 = subscribeMessage75.getTopics();
        org.meqantt.message.QoS qoS77 = subscribeMessage75.getQos();
        subscribeMessage73.addTopic("", qoS77);
        connectMessage67.setWill("", "\000d\000\001\001d", qoS77, true);
        org.meqantt.message.SubscribeMessage subscribeMessage81 = new org.meqantt.message.SubscribeMessage("hi!", qoS77);
        org.meqantt.message.SubscribeMessage subscribeMessage82 = new org.meqantt.message.SubscribeMessage("\000d\000\001\001d", qoS77);
        org.meqantt.message.SubscribeMessage subscribeMessage83 = new org.meqantt.message.SubscribeMessage("", qoS77);
        org.meqantt.message.SubscribeMessage subscribeMessage84 = new org.meqantt.message.SubscribeMessage("MQIsdp", qoS77);
        subscribeMessage38.addTopic("\ufffd\b\000\000\000\004\ufffd\ufffd\ufffd\ufffd", qoS77);
        connectMessage5.setWill("\000d\000\001\001d", "\001\003\003\001", qoS77, false);
        org.meqantt.message.SubscribeMessage subscribeMessage88 = new org.meqantt.message.SubscribeMessage("\000?Header [type=PUBREL, retain=false, qos=EXACTLY_ONCE, dup=false]", qoS77);
        // The following exception was thrown during execution in test generation
        try {
            unsubAckMessage2.setQos(qoS77);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: UnsubAck messages don't use the QoS flags.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + qoS31 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS31.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "MQIsdp" + "'", str47, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS48 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS48.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "MQIsdp" + "'", str56, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS57 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS57.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertTrue("'" + qoS77 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS77.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        org.meqantt.message.SubscribeMessage subscribeMessage0 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList1 = subscribeMessage0.getTopics();
        org.meqantt.message.QoS qoS2 = subscribeMessage0.getQos();
        org.meqantt.message.QoS qoS4 = null;
        subscribeMessage0.addTopic("", qoS4);
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
        subscribeMessage0.addTopic("00: 00000000 \000 0\n01: 01100100 d 100\n02: 00000000 \000 0\n03: 00000001 \001 1\n04: 00000001 \001 1\n05: 01100100 d 100\n", qoS24);
        // The following exception was thrown during execution in test generation
        try {
            subscribeMessage0.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUBSCRIBE can't set the DUP flag.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + qoS2 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS2.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + qoS24 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS24.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        org.meqantt.NettyClient nettyClient1 = new org.meqantt.NettyClient("Header [type=null, retain=false, qos=AT_LEAST_ONCE, dup=true]");
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 1);
        org.meqantt.message.Message.Type type2 = header1.getType();
        org.meqantt.message.Message.Type type3 = header1.getType();
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.SubAckMessage subAckMessage5 = new org.meqantt.message.SubAckMessage(header1);
        org.meqantt.message.PublishMessage publishMessage6 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.UnsubAckMessage unsubAckMessage7 = new org.meqantt.message.UnsubAckMessage(header1);
        org.meqantt.message.DisconnectMessage disconnectMessage8 = new org.meqantt.message.DisconnectMessage(header1);
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
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage8.setQos(qoS23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the QoS flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + qoS23 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS23.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        org.meqantt.message.UnsubscribeMessage unsubscribeMessage1 = new org.meqantt.message.UnsubscribeMessage("\000\003hi!");
        // The following exception was thrown during execution in test generation
        try {
            unsubscribeMessage1.setRetained(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SUBSCRIBE messages don't use the RETAIN flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
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
        org.meqantt.message.SubscribeMessage subscribeMessage27 = new org.meqantt.message.SubscribeMessage();
        java.util.List<java.lang.String> strList28 = subscribeMessage27.getTopics();
        org.meqantt.message.ConnectMessage connectMessage33 = new org.meqantt.message.ConnectMessage("", true, (int) (short) 1);
        java.lang.String str34 = connectMessage33.getProtocolId();
        org.meqantt.message.QoS qoS35 = connectMessage33.getQos();
        subscribeMessage27.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS35);
        subscribeMessage25.addTopic("00: 00000001 \001 1\n01: 00000011 \003 3\n02: 00000011 \003 3\n03: 00000001 \001 1\n", qoS35);
        org.meqantt.message.SubscribeMessage subscribeMessage38 = new org.meqantt.message.SubscribeMessage("00: 00110000 0 48\n01: 00001000 \b 8\n02: 00000000 \000 0\n03: 00000000 \000 0\n04: 00000000 \000 0\n05: 01100100 d 100\n06: 00000000 \000 0\n07: 00000001 \001 1\n08: 00000001 \001 1\n09: 01100100 d 100\n", qoS35);
        java.lang.Class<?> wildcardClass39 = subscribeMessage38.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + qoS18 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS18.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "MQIsdp" + "'", str34, "MQIsdp");
        org.junit.Assert.assertTrue("'" + qoS35 + "' != '" + org.meqantt.message.QoS.AT_MOST_ONCE + "'", qoS35.equals(org.meqantt.message.QoS.AT_MOST_ONCE));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
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
        // The following exception was thrown during execution in test generation
        try {
            pubCompMessage12.setDup(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PubComp messages don't use the DUP flag.");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        org.meqantt.message.Message.Header header0 = null;
        org.meqantt.message.ConnectMessage connectMessage1 = new org.meqantt.message.ConnectMessage(header0);
        boolean boolean2 = connectMessage1.isWillRetained();
        boolean boolean3 = connectMessage1.isWillRetained();
        connectMessage1.setWill("", "MQIsdp");
        boolean boolean7 = connectMessage1.isWillRetained();
        boolean boolean8 = connectMessage1.hasPassword();
        java.lang.String str9 = connectMessage1.getClientId();
        connectMessage1.setCredentials("\000d\000\001\001d");
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
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
        org.jboss.netty.channel.ExceptionEvent exceptionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mqttMessageHandler0.exceptionCaught(channelHandlerContext15, exceptionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        org.meqantt.message.Message.Header header1 = new org.meqantt.message.Message.Header((byte) 0);
        org.meqantt.message.PubCompMessage pubCompMessage2 = new org.meqantt.message.PubCompMessage(header1);
        org.meqantt.message.PublishMessage publishMessage3 = new org.meqantt.message.PublishMessage(header1);
        org.meqantt.message.PubRelMessage pubRelMessage4 = new org.meqantt.message.PubRelMessage(header1);
        org.meqantt.message.Message.Type type5 = header1.getType();
        org.meqantt.message.DisconnectMessage disconnectMessage6 = new org.meqantt.message.DisconnectMessage(header1);
        // The following exception was thrown during execution in test generation
        try {
            disconnectMessage6.setDup(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: DISCONNECT message does not support the DUP flag");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(type5);
    }
}
