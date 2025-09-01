package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import org.objectweb.asm.ClassReader;

import java.io.Closeable;
import java.io.*;


/**
 * Warns if meaningless close() is invoked.
 *
 * In several classes, close(), specified in Closeable interface, has no
 * effect and other methods in those classes can be called after close()
 * without IOException. In OpenJDK 6's java.io package, the following classes
 * have such meaningless close():
 *  ByteArrayInputSteram
 *   http://download.oracle.com/javase/6/docs/api/java/io/ByteArrayInputStream.html#close()
 *  ByteArrayOutputStream
 *   http://download.oracle.com/javase/6/docs/api/java/io/ByteArrayOutputStream.html#close()
 *  CharArrayWriter
 *   http://download.oracle.com/javase/6/docs/api/java/io/CharArrayWriter.html#close%28%29
 *  StringWriter
 *   http://download.oracle.com/javase/6/docs/api/java/io/StringWriter.html#close%28%29
 *
 * This specification warns when such meaningless close() is invoked, in the
 * hope that it helps the user to understand the actual behavior.
 *
 * @severity suggestion
 */

public class Closeable_MeaninglessCloseHandler {

    @Before("* java.io.Closeable+.close()")
    public static void vioCloseable_MeaninglessClose(Closeable closeable){

        if((closeable instanceof ByteArrayInputStream) || (closeable instanceof ByteArrayOutputStream)
                || (closeable instanceof CharArrayWriter) || (closeable instanceof StringWriter)) {
        	
              IOSpecificationHandler.EventCloseable_MeaninglessClose();
        	
        }
        
    }
}
