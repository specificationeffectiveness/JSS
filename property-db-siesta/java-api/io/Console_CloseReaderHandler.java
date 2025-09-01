package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if close() is invoked on the object returned by Console.reader().
 *
 * Invoking close() on the objects returned by Console.reader() does not close
 * the underlying streams.
 * http://download.oracle.com/javase/6/docs/api/java/io/Console.html
 *
 * This specification warns if such useless invocation is detected.
 *
 * @severity suggestion
 */

public class Console_CloseReaderHandler {

    @Before("java.io.Reader+ java.io.Console+.reader(..)")
    public static void vioConsole_CloseReader(String name, boolean isStatic, Object[] args, String[] history){
       IOSpecificationHandler.EventConsole_CloseReader(history);
    }
}
