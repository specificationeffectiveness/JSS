package mop;

import mop.LoggerSpecification.SpecificationType;

public class ServerSocket_Backlog {
	
	public void eventServerSocket_Backlog(int backlog) {
		if(backlog <= 0) {
			LoggerSpecification.printLogging(SpecificationType.ServerSocket_Port, null);
		}
	}

}
