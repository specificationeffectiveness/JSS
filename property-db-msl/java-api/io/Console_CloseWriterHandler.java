package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if close() is invoked on the object returned by Console.writer().
 *
 * Invoking close() on the objects returned by Console.writer() does not close
 * the underlying streams.
 * http://download.oracle.com/javase/6/docs/api/java/io/Console.html
 *
 * This specification warns if such useless invocation is detected.
 *
 * @severity suggestion
 */

public class Console_CloseWriterHandler {

    @Before("java.io.Reader+ java.io.Console+.writer(..)")
    public static void vioConsole_CloseWriter(String name, boolean isStatic, Object[] args, String[] history){ 
        IOSpecificationHandler.EventConsole_CloseWriter(history);
     }
}
