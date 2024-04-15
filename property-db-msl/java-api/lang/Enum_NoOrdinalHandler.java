package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.lang.*;

/**
 * Suggests not to use ordinal() method.
 *
 * According to the manual, most programmers will have no use for ordinal() method.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Enum.html#ordinal%28%29
 *
 * @severity suggestion
 */
public class Enum_NoOrdinalHandler {

    @Before("* java.lang.Enum+.ordinal()")
    public static void vioEnum_NoOrdinal(Enum eenum){
//        LangSpecificationHandler.eventEnum_NoOrdinal();
    }
}
