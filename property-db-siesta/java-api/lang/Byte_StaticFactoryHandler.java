package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class Byte_StaticFactoryHandler {

    @Before("java.lang.Byte+.new(..)")
    public static void vioByte_StaticFactory(String name, boolean isStatic, Object[] args){
       LangSpecificationHandler.eventByte_StaticFactory();
    }
}
