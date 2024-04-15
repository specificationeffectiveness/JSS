package mop;

import mop.LoggerSpecification.SpecificationType;

/**
 * Suggests if the constructor of Byte is used.
 *
 * According to the manual, using the constructor is not recommended 
 * for performance reasons. Rather, one should use the static factory.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Byte.html#valueOf%28byte%29
 *
 * @severity suggestion
 */

public class Byte_StaticFactory {
	
	public void eventByte_StaticFactory() {
		LoggerSpecification.printLogging(SpecificationType.Byte_StaticFactory);
	}

}
