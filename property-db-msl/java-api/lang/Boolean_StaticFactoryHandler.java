package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class Boolean_StaticFactoryHandler {

    @Before("java.lang.Boolean+.new(..)")
    public static void vioBoolean_StaticFactory(String name, boolean isStatic, Object[] args){
        LangSpecificationHandler.eventBoolean_StaticFactory();
    }
}
