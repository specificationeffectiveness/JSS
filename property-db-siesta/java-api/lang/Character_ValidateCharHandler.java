package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class Character_ValidateCharHandler {

    @Before("* java.lang.Character.toCodePoint(..)")
    public static void vioCharacter_ValidateCharToCodePoint(String name, boolean isStatic, Object[] args){
        LangSpecificationHandler.eventCharacter_ValidateCharToCodePoint(args);
    }

    @Before("* java.lang.Character.charCount(..)")
    public static void vioCharacter_ValidateCharCount(String name, boolean isStatic, Object[] args){
    	 LangSpecificationHandler.eventCharacter_ValidateCharCount(args);
    }
}
