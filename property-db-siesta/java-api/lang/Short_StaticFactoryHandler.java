package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Suggests if the constructor of Short is used.
 *
 * According to the manual, using the constructor is not recommended 
 * for performance reasons. Rather, one should use the static factory.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Short.html#valueOf%28short%29
 *
 * @severity suggestion
 */

public class Short_StaticFactoryHandler {

    @Before("java.lang.Short+.new(..)")
    public static void vioShort_StaticFactory(String name, boolean isStatic, Object[] args){
       LangSpecificationHandler.eventShort_StaticFactory();
    }
}
