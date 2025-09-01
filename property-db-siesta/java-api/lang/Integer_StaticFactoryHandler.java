package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Suggests if the constructor of Integer is used.
 *
 * According to the manual, using the constructor is not recommended
 * for performance reasons. Rather, one should use the static factory.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html#valueOf%28int%29
 *
 * @severity suggestion
 */

public class Integer_StaticFactoryHandler {

    @Before("java.lang.Integer+.new(..)")
    public static void vioInteger_StaticFactory(String name, boolean isStatic, Object[] args){
//      LangSpecificationHandler.eventInteger_StaticFactory();
    }
}
