package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Suggests if the constructor of Float is used.
 *
 * According to the manual, using the constructor is not recommended
 * for performance reasons. Rather, one should use the static factory.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Float.html#valueOf%28float%29
 *
 * @severity suggestion
 */

public class Float_StaticFactoryHandler {

    @Before("java.lang.Float+.new(..)")
    public static void vioFloat_StaticFactory(String name, boolean isStatic, Object[] args){
       LangSpecificationHandler.eventFloat_StaticFactory();
    }
}
