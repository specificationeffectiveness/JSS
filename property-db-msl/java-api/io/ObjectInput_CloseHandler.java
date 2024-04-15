package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if an ObjectInput instance does not close.
 *
 * An ObjectInput instance must be closed.
 * http://download.oracle.com/javase/6/docs/api/java/io/ObjectInput.html#close%28%29
 *
 * @severity error
 */

public class ObjectInput_CloseHandler {

    @Before("java.io.ObjectInput+.new(..)")
    public static void vioObjectInput_Close(String name, boolean isStatic, Object[] args, String[] history){
        IOSpecificationHandler.EventObjectInput_Close(history);
    }
}
