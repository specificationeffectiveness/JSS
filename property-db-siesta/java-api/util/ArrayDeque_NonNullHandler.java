package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a subclass of ArrayDeque is about to have a null element.
 *
 * ArrayDeque does not permit null elements.
 * http://download.oracle.com/javase/6/docs/api/java/util/ArrayDeque.html
 *
 * This property warns if null is about to be inserted.
 *
 * @severity error
 */

public class ArrayDeque_NonNullHandler {

    @Before("* java.util.ArrayDeque.add*(..)")
    @Before("* java.util.ArrayDeque.offer*(..)")
    @Before("* java.util.ArrayDeque.push(..)")
    public static void vioArrayDeque_NonNull(String name, boolean isStatic, Object[] args){
         UtilSpecificationHandler.EventArrayDeque_NonNull(args);
    }

}
