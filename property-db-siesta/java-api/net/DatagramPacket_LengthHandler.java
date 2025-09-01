package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a DatagramPacket object is constructed with a wrong length.
 *
 * According to the reference of DatagramPacket's constructors, the length
 * parameter, which specifies the number of bytes to read, must be less than
 * or equal to the length of buffer, another parameter of the constructors.
 * http://docs.oracle.com/javase/6/docs/api/java/net/DatagramPacket.html#DatagramPacket%28byte[],%20int%29
 *
 * It is considered that the explanation of the length parameter is incorrect
 * when a constructor takes an offset as another parameter. Unlike the
 * reference, specifying length < buffer.length, this property warns if
 * (offset + length) < buffer.length is violated, when offset is available.
 *
 * @severity error
 */

public class DatagramPacket_LengthHandler {

    @Before("java.net.DatagramPacket.new(..)")
    public static void vioDatagramPacket_Length(String name, boolean isStatic, Object[] args){
       NetSpecificationHandler.EventDatagramPacket_Length(args);
    }
}
