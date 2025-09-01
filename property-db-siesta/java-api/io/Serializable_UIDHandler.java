package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a Serializable class does not declare a serialVersionUID.
 *
 * The serialization runtime associates with each serializable class a version
 * number, called a serialVersionUID, which is used during deserialization to
 * verify that the sender and receiver of a serialized object have loaded
 * classes for that object that are compatible with respect to serialization.
 *
 * If a serializable class does not declare a serialVersionUID, then the
 * serialization runtime calculates a default serialVersionUID. However, it is
 * strongly recommended that all serializable classes explicitly declare
 * serialVersionUID values, since the default serialVersionUID computation is
 * highly sensitive to class details that may vary depending on compiler
 * implementations, and can thus result in unexpected InvalidClassExceptions
 * during deserialization.
 * http://download.oracle.com/javase/6/docs/api/java/io/Serializable.html
 *
 * This property warns if a serializable class does not explicitly declare a
 * serialVersionUID.
 *
 * @severity warning
 */

public class Serializable_UIDHandler {

    @After("staticinitialization(java.io.Serializable+)")
    public static void vioSerializable_UID(JoinPoint joinPoint) {
    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
//    	IOSpecificationHandler.EventSerializable_UID(objClasse);
    }
}
