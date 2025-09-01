package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a closed socket is about to be reused for binding or connecting.
 *
 * Once a socket has been closed, it is not available for further networking
 * use (i.e. can't be reconnected or rebound). A new socket needs to be
 * created.
 * http://docs.oracle.com/javase/6/docs/api/java/net/Socket.html#close%28%29
 *
 * @severity error
 */

public class Socket_ReuseSocketHandler {

    @Before("* java.net.Socket+.close(..)")
    public static void vioSocket_ReuseSocket(String name, boolean isStatic, Object[] args, String[] history){

       NetSpecificationHandler.EventSocket_ReuseSockete(history);
    }
}
