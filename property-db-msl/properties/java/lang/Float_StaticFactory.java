package mop;

import mop.LoggerSpecification.SpecificationType;

/**
 * Suggests if the constructor of Float is used.
 *
 * According to the manual, using the constructor is not recommended 
 * for performance reasons. Rather, one should use the static factory.
 * http://docs.oracle.com/javase/6/docs/api/java/lang/Float.html#valueOf%28float%29
 *
 * @severity suggestion
 */

public class Float_StaticFactory {
	
	public void eventFloatStaticFactory() {
		LoggerSpecification.printLogging(SpecificationType.Float_StaticFactory);
	}

}
