package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class RuntimePermission_NullActionHandler {


    @Before("java.lang.RuntimePermission.new(String, String)")
    public static void vioRuntimePermission_NullAction(String name, boolean isStatic, Object[] args){
        LangSpecificationHandler.eventRuntimePermission_NullAction(args);
    }
}
