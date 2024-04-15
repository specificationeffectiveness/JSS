package mop;

import mop.LoggerSpecification.SpecificationType;

public class Reader_UnmarkedReset {
	
	public void eventReader_UnmarkedReset(String[] history) {
		
        String[] interesting = new String[] {"reset"};
        if (!filter(history, interesting)) {
            LoggerSpecification.printLogging(SpecificationType.Reader_UnmarkedReset);
        }

    }

    private boolean filter(String[] history, String[] interesting) {
        boolean foundMark = false;
        for (int i = 0; i < history.length; i++) {
            if ("mark".equals(history[i])) {
                foundMark = true;
                // Verifica se há algum método interessante após o "close"
                for (int j = i + 1; j < history.length; j++) {
                    for (String interestingMethod : interesting) {
                        if (history[j] !=null && interestingMethod.equals(history[j])) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
