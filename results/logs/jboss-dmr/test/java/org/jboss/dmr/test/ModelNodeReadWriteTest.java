/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2023 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.dmr.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.jboss.dmr.ModelNode;
import org.jboss.dmr.ModelType;
import org.jboss.dmr.ValueExpression;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests of outputting a {@code ModelNode} in various external formats and creating one from
 * various external formats.
 */
public class ModelNodeReadWriteTest {

    private ModelNode node;

    @Before
    public void setUp() {
        node = new ModelNode();
        node.get("description").set("A managable resource");
        node.get("type").set(ModelType.OBJECT);
        node.get("tail-comment-allowed").set(false);
        node.get("attributes").get("foo").set("some description of foo");
        node.get("attributes").get("bar").set("some description of bar");
        node.get("attributes").get("list").add("value1");
        node.get("attributes").get("list").add("value2");
        node.get("attributes").get("list").add("value3");
        node.get("value-type").get("size").set(ModelType.INT);
        node.get("value-type").get("color").set(ModelType.STRING);
        node.get("big-decimal-value").set(BigDecimal.valueOf(10.0));
        node.get("big-integer-value").set(BigInteger.TEN);
        node.get("bytes-value").set(new byte[] { (byte) 0, (byte) 55 });
        node.get("double-value").set(Double.valueOf("55"));
        node.get("max-double-value").set(Double.MAX_VALUE);
        node.get("int-value").set(Integer.valueOf("12"));
        node.get("max-int-value").set(Integer.MAX_VALUE);
        node.get("long-value").set(Long.valueOf("14"));
        node.get("max-long-value").set(Long.MAX_VALUE);
        node.get("property-value").set("property", ModelType.PROPERTY);
        node.get("expression-value").set(new ValueExpression("$expression"));
        node.get("true-value").set(true);
        node.get("false-value").set(false);
    }

    @Test
    public void testToString() {
        final String dmrString = node.toString();
        assertThat(dmrString, containsString("\"description\" => \"A managable resource\","));
        assertThat(dmrString, containsString("\"type\" => OBJECT,"));
        assertThat(dmrString, containsString("\"tail-comment-allowed\" => false,"));
        assertThat(
                dmrString,
                containsString("\"attributes\" => {\n        \"foo\" => \"some description of foo\",\n        \"bar\" => \"some description of bar\",\n"));
        assertThat(
                dmrString,
                containsString("\n        \"list\" => [\n            \"value1\",\n            \"value2\",\n            \"value3\"\n        ]\n    },"));
        assertThat(dmrString,
                containsString("\n    \"value-type\" => {\n        \"size\" => INT,\n        \"color\" => STRING\n    },"));
        assertThat(dmrString, containsString("\"big-decimal-value\" => big decimal 10.0,"));
        assertThat(dmrString, containsString("\"big-integer-value\" => big integer 10,"));
        assertThat(dmrString, containsString("\"bytes-value\" => bytes {\n        0x00, 0x37\n    },"));
        assertThat(dmrString, containsString("\"double-value\" => 55.0,"));
        assertThat(dmrString, containsString("\"max-double-value\" => 1.7976931348623157E308,"));
        assertThat(dmrString, containsString("\"int-value\" => 12,"));
        assertThat(dmrString, containsString("\"max-int-value\" => 2147483647,"));
        assertThat(dmrString, containsString("\"long-value\" => 14L,"));
        assertThat(dmrString, containsString("\"max-long-value\" => 9223372036854775807L,"));
        assertThat(dmrString, containsString("\"property-value\" => (\"property\" => PROPERTY),"));
        assertThat(dmrString, containsString("\"expression-value\" => expression \"$expression\","));
        assertThat(dmrString, containsString("\"true-value\" => true,"));
        assertThat(dmrString, containsString("\"false-value\" => false"));
    }

    @Test
    public void testOutputDMRString() {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter writer = new PrintWriter(stringWriter, true);
        node.writeString(writer, false);
        final String dmrString = stringWriter.toString();
        assertThat(dmrString, containsString("\"description\" => \"A managable resource\","));
        assertThat(dmrString, containsString("\"type\" => OBJECT,"));
        assertThat(dmrString, containsString("\"tail-comment-allowed\" => false,"));
        assertThat(
                dmrString,
                containsString("\"attributes\" => {\n        \"foo\" => \"some description of foo\",\n        \"bar\" => \"some description of bar\",\n"));
        assertThat(
                dmrString,
                containsString("\n        \"list\" => [\n            \"value1\",\n            \"value2\",\n            \"value3\"\n        ]\n    },"));
        assertThat(dmrString,
                containsString("\n    \"value-type\" => {\n        \"size\" => INT,\n        \"color\" => STRING\n    },"));
        assertThat(dmrString, containsString("\"big-decimal-value\" => big decimal 10.0,"));
        assertThat(dmrString, containsString("\"big-integer-value\" => big integer 10,"));
        assertThat(dmrString, containsString("\"bytes-value\" => bytes {\n        0x00, 0x37\n    },"));
        assertThat(dmrString, containsString("\"double-value\" => 55.0,"));
        assertThat(dmrString, containsString("\"max-double-value\" => 1.7976931348623157E308,"));
        assertThat(dmrString, containsString("\"int-value\" => 12,"));
        assertThat(dmrString, containsString("\"max-int-value\" => 2147483647,"));
        assertThat(dmrString, containsString("\"long-value\" => 14L,"));
        assertThat(dmrString, containsString("\"max-long-value\" => 9223372036854775807L,"));
        assertThat(dmrString, containsString("\"property-value\" => (\"property\" => PROPERTY),"));
        assertThat(dmrString, containsString("\"expression-value\" => expression \"$expression\","));
        assertThat(dmrString, containsString("\"true-value\" => true,"));
        assertThat(dmrString, containsString("\"false-value\" => false"));
    }

    @Test
    public void testFormatAsJSON() {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter writer = new PrintWriter(stringWriter, true);
        node.writeJSONString(writer, false);
        final String json = stringWriter.toString();
        assertNotNull(json);
        assertEquals(true, json.contains("\n"));
        assertEquals(true, json.contains("    "));
        assertThat(json, containsString("\"description\" : \"A managable resource\","));
        assertThat(json, containsString("\"type\" : {\n        \"TYPE_MODEL_VALUE\" : \"OBJECT\"\n    },"));
        assertThat(json, containsString("\"tail-comment-allowed\" : false,"));
        assertThat(json, containsString("\"attributes\" : {"));
        assertThat(json, containsString("\"foo\" : \"some description of foo\","));
        assertThat(json, containsString("\"bar\" : \"some description of bar\","));
        assertThat(json, containsString("\"list\" : ["));
        assertThat(json, containsString("\"value1\","));
        assertThat(json, containsString("\"value2\","));
        assertThat(json, containsString("\"value3\""));
        assertThat(json, containsString("\"value-type\" : {"));
        assertThat(json, containsString("\"size\" : {\n            \"TYPE_MODEL_VALUE\" : \"INT\"\n        },"));
        assertThat(json, containsString("\"color\" : {\n            \"TYPE_MODEL_VALUE\" : \"STRING\"\n        }"));
        assertThat(json, containsString("\"big-decimal-value\" : 10.0,"));
        assertThat(json, containsString("\"big-integer-value\" : 10,"));
        assertThat(json, containsString("\"bytes-value\" : {\n        \"BYTES_VALUE\" : \"ADc=\"\n    },"));
        assertThat(json, containsString("\"double-value\" : 55.0,"));
        assertThat(json, containsString("\"max-double-value\" : 1.7976931348623157E308,"));
        assertThat(json, containsString("\"int-value\" : 12,"));
        assertThat(json, containsString("\"max-int-value\" : 2147483647,"));
        assertThat(json, containsString("\"long-value\" : 14"));
        assertThat(json, containsString("\"max-long-value\" : 9223372036854775807"));
        assertThat(
                json,
                containsString("\n    \"property-value\" : {\n        \"property\" : {\n            \"TYPE_MODEL_VALUE\" : \"PROPERTY\"\n        }\n    },"));
        assertThat(json, containsString("\"expression-value\" : {\n        \"EXPRESSION_VALUE\" : \"$expression\"\n    }"));
        assertThat(json, containsString("\"true-value\" : true"));
        assertThat(json, containsString("\"false-value\" : false"));
        assertThat(json, containsString("\n}"));

        final String compressedJson = node.toJSONString(true);
        assertNotNull(compressedJson);
        assertEquals(false, compressedJson.contains("\n"));
        assertEquals(false, compressedJson.contains("    "));
    }

    @Test
    public void testOutputJSONString() {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter writer = new PrintWriter(stringWriter, true);
        node.writeJSONString(writer, false);
        final String json = stringWriter.toString();
        assertNotNull(json);
        assertEquals(true, json.contains("\n"));
        assertEquals(true, json.contains("    "));
        assertThat(json, containsString("\"description\" : \"A managable resource\","));
        assertThat(json, containsString("\"type\" : {\n        \"TYPE_MODEL_VALUE\" : \"OBJECT\"\n    },"));
        assertThat(json, containsString("\"tail-comment-allowed\" : false,"));
        assertThat(json, containsString("\"attributes\" : {"));
        assertThat(json, containsString("\"foo\" : \"some description of foo\","));
        assertThat(json, containsString("\"bar\" : \"some description of bar\","));
        assertThat(json, containsString("\"list\" : ["));
        assertThat(json, containsString("\"value1\","));
        assertThat(json, containsString("\"value2\","));
        assertThat(json, containsString("\"value3\""));
        assertThat(json, containsString("\"value-type\" : {"));
        assertThat(json, containsString("\"size\" : {\n            \"TYPE_MODEL_VALUE\" : \"INT\"\n        },"));
        assertThat(json, containsString("\"color\" : {\n            \"TYPE_MODEL_VALUE\" : \"STRING\"\n        }"));
        assertThat(json, containsString("\"big-decimal-value\" : 10.0,"));
        assertThat(json, containsString("\"big-integer-value\" : 10,"));
        assertThat(json, containsString("\"bytes-value\" : {\n        \"BYTES_VALUE\" : \"ADc=\"\n    },"));
        assertThat(json, containsString("\"double-value\" : 55.0,"));
        assertThat(json, containsString("\"max-double-value\" : 1.7976931348623157E308,"));
        assertThat(json, containsString("\"int-value\" : 12,"));
        assertThat(json, containsString("\"max-int-value\" : 2147483647,"));
        assertThat(json, containsString("\"long-value\" : 14"));
        assertThat(json, containsString("\"max-long-value\" : 9223372036854775807"));
        assertThat(
                json,
                containsString("\n    \"property-value\" : {\n        \"property\" : {\n            \"TYPE_MODEL_VALUE\" : \"PROPERTY\"\n        }\n    },"));
        assertThat(json, containsString("\"expression-value\" : {\n        \"EXPRESSION_VALUE\" : \"$expression\"\n    }"));
        assertThat(json, containsString("\"true-value\" : true"));
        assertThat(json, containsString("\"false-value\" : false"));
        assertThat(json, containsString("\n}"));

        final String compressedJson = node.toJSONString(true);
        assertNotNull(compressedJson);
        assertEquals(false, compressedJson.contains("\n"));
        assertEquals(false, compressedJson.contains("    "));
    }

    @Test
    public void testToJSONString() {
        final String json = node.toJSONString(false);
        assertNotNull(json);
        assertEquals(true, json.contains("\n"));
        assertEquals(true, json.contains("    "));
        assertThat(json, containsString("\"description\" : \"A managable resource\","));
        assertThat(json, containsString("\"type\" : {\n        \"TYPE_MODEL_VALUE\" : \"OBJECT\"\n    },"));
        assertThat(json, containsString("\"tail-comment-allowed\" : false,"));
        assertThat(json, containsString("\"attributes\" : {"));
        assertThat(json, containsString("\"foo\" : \"some description of foo\","));
        assertThat(json, containsString("\"bar\" : \"some description of bar\","));
        assertThat(json, containsString("\"list\" : ["));
        assertThat(json, containsString("\"value1\","));
        assertThat(json, containsString("\"value2\","));
        assertThat(json, containsString("\"value3\""));
        assertThat(json, containsString("\"value-type\" : {"));
        assertThat(json, containsString("\"size\" : {\n            \"TYPE_MODEL_VALUE\" : \"INT\"\n        },"));
        assertThat(json, containsString("\"color\" : {\n            \"TYPE_MODEL_VALUE\" : \"STRING\"\n        }"));
        assertThat(json, containsString("\"big-decimal-value\" : 10.0,"));
        assertThat(json, containsString("\"big-integer-value\" : 10,"));
        assertThat(json, containsString("\"bytes-value\" : {\n        \"BYTES_VALUE\" : \"ADc=\"\n    },"));
        assertThat(json, containsString("\"double-value\" : 55.0,"));
        assertThat(json, containsString("\"max-double-value\" : 1.7976931348623157E308,"));
        assertThat(json, containsString("\"int-value\" : 12,"));
        assertThat(json, containsString("\"max-int-value\" : 2147483647,"));
        assertThat(json, containsString("\"long-value\" : 14"));
        assertThat(json, containsString("\"max-long-value\" : 9223372036854775807"));
        assertThat(
                json,
                containsString("\n    \"property-value\" : {\n        \"property\" : {\n            \"TYPE_MODEL_VALUE\" : \"PROPERTY\"\n        }\n    },"));
        assertThat(json, containsString("\"expression-value\" : {\n        \"EXPRESSION_VALUE\" : \"$expression\"\n    }"));
        assertThat(json, containsString("\"true-value\" : true"));
        assertThat(json, containsString("\"false-value\" : false"));
        assertThat(json, containsString("\n}"));

        final String compressedJson = node.toJSONString(true);
        assertNotNull(compressedJson);
        assertEquals(false, compressedJson.contains("\n"));
        assertEquals(false, compressedJson.contains("    "));
    }

    @Test
    public void testFromJSONString() {
        final ModelNode parsedNode = ModelNode.fromJSONString(node.toJSONString(true));
        // TODO why not a simple equality check?
        assertThat(parsedNode.toString(), containsString("\"description\" => \"A managable resource\","));
        assertThat(parsedNode.toString(), containsString("\"type\" => OBJECT,"));
        assertThat(parsedNode.toString(), containsString("\"tail-comment-allowed\" => false,"));
        assertThat(
                parsedNode.toString(),
                containsString("\"attributes\" => {\n        \"foo\" => \"some description of foo\",\n        \"bar\" => \"some description of bar\",\n"));
        assertThat(
                parsedNode.toString(),
                containsString("\n        \"list\" => [\n            \"value1\",\n            \"value2\",\n            \"value3\"\n        ]\n    },"));
        assertThat(parsedNode.toString(),
                containsString("\n    \"value-type\" => {\n        \"size\" => INT,\n        \"color\" => STRING\n    },"));
        assertThat(parsedNode.toString(), containsString("\"big-decimal-value\" => big decimal 10.0,"));
        assertThat(parsedNode.toString(), containsString("\"big-integer-value\" => 10,"));
        assertThat(parsedNode.toString(), containsString("\"bytes-value\" => bytes {\n        0x00, 0x37\n    },"));
        assertThat(parsedNode.toString(), containsString("\"double-value\" => big decimal 55.0,"));
        assertThat(parsedNode.toString(), containsString("\"max-double-value\" => big decimal 1.7976931348623157E+308,"));
        assertThat(parsedNode.toString(), containsString("\"int-value\" => 12,"));
        assertThat(parsedNode.toString(), containsString("\"max-int-value\" => 2147483647,"));
        assertThat(parsedNode.toString(), containsString("\"long-value\" => 14,"));
        assertThat(parsedNode.toString(), containsString("\"max-long-value\" => 9223372036854775807L,"));
        assertThat(parsedNode.toString(), containsString("\"property-value\" => {\"property\" => PROPERTY},"));
        assertThat(parsedNode.toString(), containsString("\"expression-value\" => expression \"$expression\","));
        assertThat(parsedNode.toString(), containsString("\"true-value\" => true,"));
        assertThat(parsedNode.toString(), containsString("\"false-value\" => false"));
    }

    @Test
    public void testFromJSONStringUnicode() {
        final ModelNode unicodeNode = new ModelNode();
        unicodeNode.get("unicode-value").set("A string with unicode characters: \u0000\u0001\u001F\u0020\u007F\u0080\u009F\u2000\u2001\u20FF");
        final ModelNode parsedNode = ModelNode.fromJSONString(unicodeNode.toJSONString(true));
        assertEquals("A string with unicode characters: \u0000\u0001\u001F\u0020\u007F\u0080\u009F\u2000\u2001\u20FF", parsedNode.get("unicode-value").asString());
    }

    @Test
    public void unicodeDecodeProblemWhenBufferIsToSmall() throws IOException {
        ModelNode.fromJSONString(
            "{\"kind\":\"ImageStreamTag\",\"apiVersion\":\"v1\",\"metadata\":{\"name\":\"authorization:latest-lane\",\"namespace\":\"ebv\",\"selfLink\":\"/oapi/v1/namespaces/ebv/imagestreamtags/authorization%3Alatest-lane\",\"uid\":\"c1e1ec4e-f2b2-11e6-afa2-0050569539d0\",\"resourceVersion\":\"206323648\",\"creationTimestamp\":\"2018-09-28T12:36:43Z\"},\"tag\":{\"name\":\"latest-lane\",\"annotations\":null,\"from\":{\"kind\":\"ImageStreamImage\",\"namespace\":\"ebv\",\"name\":\"authorization@sha256:14d4461eabbae888cc71791a71a7082b7fc3d120ca29a2b1cfde7a764237f2eb\"},\"generation\":568,\"importPolicy\":{},\"referencePolicy\":{\"type\":\"Source\"}},\"generation\":568,\"image\":{\"metadata\":{\"name\":\"sha256:14d4461eabbae888cc71791a71a7082b7fc3d120ca29a2b1cfde7a764237f2eb\",\"uid\":\"212ec763-c31b-11e8-a250-0050569539d0\",\"resourceVersion\":\"204559232\",\"creationTimestamp\":\"2018-09-28T12:36:32Z\",\"annotations\":{\"openshift.io/image.managed\":\"true\"}},\"dockerImageReference\":\"172.27.220.86:5000/ebv/authorization@sha256:14d4461eabbae888cc71791a71a7082b7fc3d120ca29a2b1cfde7a764237f2eb\",\"dockerImageMetadata\":{\"kind\":\"DockerImage\",\"apiVersion\":\"1.0\",\"Id\":\"52ca353ec37254ffea32a5080bd8560d2acdbda5ab5855e361072e9ca13cca08\",\"Parent\":\"a59d9cf6837fac011cb881f16851cfce227c22e7a6bb6056bc537ebe43b4f945\",\"Created\":\"2018-09-28T12:36:06Z\",\"Container\":\"b7568d7180f5431f918d88f53e8bf208ef4533266bb2491946ea147e75a89a6c\",\"ContainerConfig\":{\"Hostname\":\"authorization-v1.19.0-snapshot-16-build\",\"User\":\"12345\",\"AttachStdout\":true,\"OpenStdin\":true,\"StdinOnce\":true,\"Env\":[\"OPENSHIFT_BUILD_NAME=authorization-v1.19.0-snapshot-16\",\"OPENSHIFT_BUILD_NAMESPACE=ebv\",\"OPENSHIFT_BUILD_SOURCE=ssh://git@gitlab.eb.lan.at:9418/cs-ebv/ebv-authorization-application.git\",\"OPENSHIFT_BUILD_REFERENCE=cs-version/v1.19.0-snapshot\",\"OPENSHIFT_BUILD_COMMIT=a37d6cfdfafaee143387658873bb12d0ce4ed4ce\",\"PATH=:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin\",\"container=oci\",\"HOME=/opt/app-root/src\",\"JAVA_HOME=/opt/java\",\"DT=/opt/dynatrace\",\"AGENT_LIB=/opt/dynatrace/agent/lib64/libdtagent.so\"],\"Cmd\":[\"/bin/sh\",\"-c\",\"tar -C /opt/s2i/destination -xf - \\u0026\\u0026 /opt/s2i/scripts/assemble\"]}}}}");
    }

    @Test
    public void backslashNR() throws IOException {
        final ModelNode node = ModelNode.fromJSONString("{\"key\":\"test\n it\"}");
    }


    @Test
    public void testFromString() {
        final ModelNode parsedNode = ModelNode.fromString(node.toString());
        assertEquals(node, parsedNode);
    }

    @Test
    public void testWriteBase64() {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            node.writeBase64(os);
            assertEquals(701, os.toByteArray().length);
        } catch (final IOException e) {
            fail("IOException not expected: " + e.getMessage());
        }
    }

    @Test
    public void testFromBase64() {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            node.writeBase64(os);
            ModelNode newNode = ModelNode.fromBase64(new ByteArrayInputStream(os.toByteArray()));
            assertNotNull(newNode);
            assertEquals(node, newNode);
        } catch (final IOException e) {
            fail("IOException not expected: " + e.getMessage());
        }
    }

    @Test
    public void testFromBase64String() {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            node.writeBase64(os);

            Reader reader = new InputStreamReader(new ByteArrayInputStream(os.toByteArray()));
            StringWriter sw = new StringWriter();
            char[] cbuf = new char[1024];
            int read;
            while ((read = reader.read(cbuf)) != -1) {
                sw.write(cbuf, 0, read);
            }
            ModelNode newNode = ModelNode.fromBase64String(sw.toString());
            assertNotNull(newNode);
            assertEquals(node, newNode);
        } catch (final IOException e) {
            fail("IOException not expected: " + e.getMessage());
        }
    }

    @Test
    public void testNonAscii() {
        ModelNode testee = ModelNode.fromString("{\"x\"=>\"jdbc:h2:file:${jboss.server.data.dir}/ô/h2/soa;mvcc=true\"}");
        assertEquals("jdbc:h2:file:${jboss.server.data.dir}/ô/h2/soa;mvcc=true", testee.get("x").asString());
        testee = ModelNode.fromString("\"jdbc:h2:file:${jboss.server.data.dir}/ô/h2/soa;mvcc=true\"");
        assertEquals("jdbc:h2:file:${jboss.server.data.dir}/ô/h2/soa;mvcc=true", testee.asString());
    }
}
