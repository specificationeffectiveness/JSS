package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a comparable object is compared to null.
 *
 * According to the manual, null is not an instance of any class; it cannot be compared to any object.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Comparable.html#compareTo%28T%29
 *
 * @severity error
 */

public class Comparable_CompareToNullHandler {

    @Before("* java.lang.Comparable+.compareTo(..)")
    public static void vioComparable_CompareToNull(String name, boolean isStatic, Object[] args){
         Object object = (Object) args[1];
         if(object == null){
            System.out.println("xxxx");
         }
    }
}
