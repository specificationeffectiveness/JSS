package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if an input stream of a closed socket is used.
 *
 * Closing a socket will also close the socket's InputStream and OutputStream.
 * http://docs.oracle.com/javase/6/docs/api/java/net/Socket.html#close%28%29
 *
 * This property will see if any operation is performed on a closed socket's
 * input stream. A closed socket's output stream will be checked by the
 * companion property of this one.
 *
 * @severity error
 */

public class Socket_CloseInputHandler {

	@Before("* java.net.Socket+.close(..)")
	public static void vioSocket_CloseInputSocket(String name, boolean isStatic, Object[] args, String[] history){
		NetSpecificationHandler.EventSocket_CloseInput(args, history);
	}

}

