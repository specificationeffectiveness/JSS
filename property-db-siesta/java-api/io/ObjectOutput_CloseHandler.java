package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if an ObjectOutput instance does not close.
 *
 * An ObjectOutput instance must be closed.
 * http://download.oracle.com/javase/6/docs/api/java/io/ObjectOutput.html#close%28%29
 *
 * @severity error
 */

public class ObjectOutput_CloseHandler {

    @Before("java.io.ObjectOutput+.new(..)")
    public static void vioObjectOutput_Close(String name, boolean isStatic, Object[] args, String[] history){
       IOSpecificationHandler.EventObjectOutput_Close(history);
    }
}
