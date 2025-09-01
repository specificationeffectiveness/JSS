package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class RuntimePermission_PermNameHandler {


    @Before("java.lang.RuntimePermission.new(String)")
    public static void vioRuntimePermission_PermName(String name, boolean isStatic, Object[] args){
          LangSpecificationHandler.eventRuntimePermission_PermName(args); 
    }
}
