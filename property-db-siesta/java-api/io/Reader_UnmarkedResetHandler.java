package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.io.*;
import java.io.Reader;


/**
 * Prevents premature invocations of reset().
 *
 * Some subclasses of Reader allows reset() only after mark() is called.
 * http://download.oracle.com/javase/6/docs/api/java/io/Reader.html#reset%28%29
 *
 * BufferedReader and LineNumberReader allow reset() only after mark() has
 * been invoked. This specification catches the violation of this.
 *
 * @severity error
 */

public class Reader_UnmarkedResetHandler {

    @Before("* java.io.Reader+.reset()")
    public static void vioReader_UnmarkedReset(Reader reader, String[] history){
         if((reader instanceof  BufferedReader ) || (reader instanceof LineNumberReader)){
              IOSpecificationHandler.EventReader_UnmarkedReset(history);
         }
    }
}
