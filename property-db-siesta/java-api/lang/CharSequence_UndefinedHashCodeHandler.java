package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.nio.CharBuffer;

/**
 * Warns if one tries to use equals or hashCode method of a CharSequence instance.
 *
 * According to the manual, this inferface does not refine the general contracts of the
 * equals and hashCode methods.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/CharSequence.html
 * User should check whether the instance of CharSequence that he/she tries to use supports
 * those methods.
 *
 * @severity warning
 */
public class CharSequence_UndefinedHashCodeHandler {

    @Before("* java.lang.CharSequence+.hashCode(..)")
    public static void vioCharSequence_UndefinedHashCode(String name, boolean isStatic, Object[] args){
         Object object= null;
         if((object instanceof String) && (object instanceof CharBuffer)){
        	 LangSpecificationHandler.eventCharSequence_UndefinedHashCode();
        }
    }

    @Before("* java.lang.CharSequence+.equals(..)")
    public static void vioCharSequence_UndefinedHashCode_equals(String name, boolean isStatic, Object[] args){
        Object object= null;
        if((object instanceof String) && (object instanceof CharBuffer)){
            LangSpecificationHandler.eventCharSequence_UndefinedHashCode();
        }
    }
}
