package mop;

import mop.LoggerSpecification.SpecificationType;

public class ObjectInput_Close {

	public void eventObjectInput_Close(String[] history) {
		 String[] interesting = new String[] {"close"};
	        if (filter(history, interesting)) {
	            LoggerSpecification.printLogging(SpecificationType.ObjectInput_Close);
	        }
	}
	
	 private boolean filter(String[] history, String[] interesting) {
	        boolean foundClose = true;
	        for (int i = 0; i < history.length; i++) {
	            if ("close".equals(history[i])) {
	            	foundClose = false;
	            }
	        }
	        return foundClose;
	 }
}
