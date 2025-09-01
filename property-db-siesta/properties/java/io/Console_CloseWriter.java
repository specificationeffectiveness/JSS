package mop;

import mop.LoggerSpecification.SpecificationType;

public class Console_CloseWriter {

	public void eventConsole_CloseWriter(String[] history) {

		String[] interesting = new String[] {"close"};
		if(filter(history,interesting)) {
			LoggerSpecification.printLogging(SpecificationType.Console_CloseWriter);
		}
	}

	private boolean filter(String[] history , String[] interesting) {

		for (int i = 0; i < interesting.length; i++) {
			String string = interesting[i];
			for (int j = 0; j < history.length; j++) {
				String strHistory = history[j];
				if(strHistory.equals(string)) {
					return true;
				}

			}
		}
		return false;
	}
}