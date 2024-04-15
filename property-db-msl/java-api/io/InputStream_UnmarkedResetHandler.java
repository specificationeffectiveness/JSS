package mop;

import org.aspectjml.lang.annotation.siesta.Before;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.LineNumberInputStream;

/**
 * Prevents premature invocations of reset().
 *
 * Some subclasses of InputStream allows reset() only after mark() is called.
 * http://download.oracle.com/javase/6/docs/api/java/io/InputStream.html#reset%28%29
 *
 * BufferedInputStream, DataInputStream and LineNumberInputStream allow reset()
 * only after mark() has been invoked. This specification catches the
 * violation of this.
 *
 * @severity error
 */

public class InputStream_UnmarkedResetHandler {

    @Before("* java.io.InputStream+.reset()")
    public static void vioInputStream_UnmarkedReset(InputStream inputStream, String[] history){
         if((inputStream instanceof BufferedInputStream) || (inputStream instanceof DataInputStream) || (inputStream instanceof LineNumberInputStream)) {
        	 IOSpecificationHandler.EventInputStream_UnmarkedReset(history);
         }
    }
}
