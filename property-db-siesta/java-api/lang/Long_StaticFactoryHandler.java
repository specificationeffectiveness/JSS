package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Suggests if the constructor of Long is used.
 *
 * According to the manual, using the constructor is not recommended 
 * for performance reasons. Rather, one should use the static factory.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Long.html#valueOf%28long%29
 *
 * @severity suggestion
 */

public class Long_StaticFactoryHandler {

    @Before("java.lang.Long+.new(..)")
    public static void vioLong_StaticFactory(String name, boolean isStatic, Object[] args){
//          LangSpecificationHandler.eventLong_StaticFactory();
    }
}
