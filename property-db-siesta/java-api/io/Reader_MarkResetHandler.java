package mop;


import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PipedReader;
import java.io.PushbackReader;
import java.io.Reader;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Prevents invocations of mark() if the Reader does not support.
 *
 * Some subclasses of Reader do not support mark() and reset().
 * http://download.oracle.com/javase/6/docs/api/java/io/Reader.html#mark%28int%29
 *
 * PushbackReader, InputStreamReader, FileReader and PipedReader do not
 * support mark() and reset(). This specification warns if mark() or reset()
 * is invoked.
 *
 * @severity error
 */

public class Reader_MarkResetHandler {

    @Before("* java.io.Reader+.reset(..)")
    public static void vioReader_MarkReset(String name, boolean isStatic, Object[] args){
    	Reader r = (Reader) args[0];
    	if(( r instanceof PushbackReader) || (r instanceof InputStreamReader) || (r instanceof FileReader) || (r instanceof PipedReader)) {
    		IOSpecificationHandler.EventReader_MarkReset();
    	}

    }

    @Before("* java.io.Reader+.mark(..)")
    public static void vioReader_ResetMark(String name, boolean isStatic, Object[] args){
    	Reader r = (Reader) args[0];
    	if(( r instanceof PushbackReader) || (r instanceof InputStreamReader) || (r instanceof FileReader) || (r instanceof PipedReader)) {
    		IOSpecificationHandler.EventReader_MarkReset();
    	}
    }
}
