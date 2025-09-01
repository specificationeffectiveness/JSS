package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class StringBuilderThreadSafeHandler {

    @Before("* java.lang.StringBuilder.*(..)")
    public static void vioSBThreadSafe(String name, boolean isStatic, Object[] args) {

    }
}
