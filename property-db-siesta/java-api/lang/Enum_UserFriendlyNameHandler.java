package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Suggests to use toString() instead of name() in Enum.
 *
 * According to the manual, toString() is more recommended for its more user-friendly name.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Enum.html#name%28%29
 *
 * @severity suggestion
 */

public class Enum_UserFriendlyNameHandler {

    @Before("* java.lang.Enum+.name()")
    public static void vioEnum_UserFriendlyName (Enum eenum){
        LangSpecificationHandler.eventEnum_UserFriendlyName();
    }
}
