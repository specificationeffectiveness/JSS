package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if mark() is invoked after close().
 *
 * According to the InputStream.mark() documentation, mark() after close()
 * does nothing. This property warns if such useless mark() is invoked.
 *
 * @severity warning
 */
public class InputStream_MarkAfterCloseHandler {

    @Before("* java.io.InputStream+.mark(..)")
    public static void vioInputStream_MarkAfterClose(String name, boolean isStatic, Object[] args, String[] history){
        IOSpecificationHandler.EventInputStream_MarkAfterClose(history);

    }

}
	