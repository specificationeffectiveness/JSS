package mop;

import mop.LoggerSpecification.SpecificationType;

public class RuntimePermission_PermName {

	public void eventRuntimePermission_PermName(String name) {
		int index = name.indexOf("*");
		if (index != -1 && name.length() > 1) {
		    if (index != name.length() - 1 || (index > 0 && name.charAt(index - 1) != '.')) {
		        LoggerSpecification.printLogging(SpecificationType.RuntimePermission_PermName);
		    }
		}

	}
}
