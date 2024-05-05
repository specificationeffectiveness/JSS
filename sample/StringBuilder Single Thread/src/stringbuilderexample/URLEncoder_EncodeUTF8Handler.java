package stringbuilderexample;

import org.aspectjml.lang.annotation.siesta.Before;

public class URLEncoder_EncodeUTF8Handler {

    @Before("* java.net.URLEncoder.encode(..)")
    public static void vioURLEncoder_EncodeUTF8(String name, boolean isStatic, Object[] args){

    }
}
