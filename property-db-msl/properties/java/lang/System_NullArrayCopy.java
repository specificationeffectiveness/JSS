package mop;

import mop.LoggerSpecification.SpecificationType;

public class System_NullArrayCopy {
	
	public void eventSystem_NullArrayCopy(Object src, Object dest) {
		if((src == null || dest == null) ) {
			LoggerSpecification.printLogging(SpecificationType.System_NullArrayCopy); 
		}
	}

}
