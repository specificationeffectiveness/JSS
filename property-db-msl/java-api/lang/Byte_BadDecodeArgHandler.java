package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns when the argument to decode is wrong
 *
 * According to the manual, the argument cannot contain any whitespace.
 * Also, there is a format to follow.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Byte.html#decode%28java.lang.String%29
 *
 * @severity error
 */

public class Byte_BadDecodeArgHandler {

    @Before("* java.lang.Byte.decode(..)")
    public static void vioByte_BadDecodeArg(String name, boolean isStatic, Object[] args){
		
		LangSpecificationHandler.eventByte_BadDecodeArg(args);
    }
}
