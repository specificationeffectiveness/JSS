package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class MulticastSocket_TTLHandler {

    @Before("* java.net.MulticastSocket+.setTimeToLive(..)")
    public static void vioMulticastSocket_TTLSetTimeToLive(String name, boolean isStatic, Object[] args){
       NetSpecificationHandler.EventMulticastSocket_setTimeToLive(args);
    }
    @Before("* java.net.MulticastSocket+.setTTL(..)")
    public static void vioMulticastSocket_TTL(String name, boolean isStatic, Object[] args){
        NetSpecificationHandler.EventMulticastSocket_TTL(args);
    }

}
