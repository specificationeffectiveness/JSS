package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if an output stream of a closed socket is used.
 *
 * Closing a socket will also close the socket's InputStream and OutputStream.
 * http://docs.oracle.com/javase/6/docs/api/java/net/Socket.html#close%28%29
 *
 * This property will see if any operation is performed on a closed socket's
 * output stream. A closed socket's input stream will be checked by the
 * companion property of this one.
 *
 * @severity error
 */

public class Socket_CloseOutputHandler {

    @Before("* java.net.Socket+.close(..)")
    public static void vioSocket_CloseOutputSocketClose(String name, boolean isStatic, Object[] args, String[] history){
    	 NetSpecificationHandler.EventSocket_CloseOutput(args, history);

    }
    @Before("* java.net.Socket+.shutdownOutput(..)")
    public static void vioSocket_CloseOutputSocketShutdownOutput(String name, boolean isStatic, Object[] args, String[] history){
        NetSpecificationHandler.EventSocket_CloseOutput(args, history);

    }
}
