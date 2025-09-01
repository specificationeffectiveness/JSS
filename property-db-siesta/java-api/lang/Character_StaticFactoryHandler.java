package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Suggests if the constructor of Character is used.
 *
 * According to the manual, using the constructor is not recommended 
 * for performance reasons. Rather, one should use the static factory.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Character.html#valueOf%28char%29
 *
 * @severity suggestion
 */

public class Character_StaticFactoryHandler {

    @Before("java.lang.Character+.new(..)")
    public static void vioCharacter_StaticFactory(String name, boolean isStatic, Object[] args){
      LangSpecificationHandler.eventCharacter_StaticFactory();
    }
}
