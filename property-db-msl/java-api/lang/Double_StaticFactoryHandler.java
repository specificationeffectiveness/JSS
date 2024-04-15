package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Suggests if the constructor of Double is used.
 *
 * According to the manual, using the constructor is not recommended 
 * for performance reasons. Rather, one should use the static factory.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Double.html#valueOf%28double%29
 *
 * @severity suggestion
 */

public class Double_StaticFactoryHandler {

    @Before("java.lang.Double+.new(..)")
    public static void vioDouble_StaticFactory(String name, boolean isStatic, Object[] args){
       LangSpecificationHandler.eventDouble_StaticFactory();
    }
}
