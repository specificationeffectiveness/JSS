package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class System_NullArrayCopyHandler {

    @Before("* java.lang.System.arraycopy(..)")
    public static void vioSystem_NullArrayCopy(String name, boolean isStatic, Object[] args){
//       LangSpecificationHandler.eventSystem_NullArrayCopy(args);
    }
}
