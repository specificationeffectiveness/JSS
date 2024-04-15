package mop;

public class ByteArrayOutputStream_FlushBeforeRetrieve {

	public void ByteArrayOutputStream_FlushBeforeRetrieveEvent(String[] history) {
		
		String[] interesting = new String[] {"flush", "close"};
		if(filter(history,interesting) < 1) {
			LoggerSpecification.printLogging_ByteArrayOutputStream_FlushBeforeRetrieve();
		}
		
	}
//	private int filter(String[] history , String[] interesting) {
//		int count =0;
//		for (int i = 0; i < interesting.length; i++) {
//			String string = interesting[i];
//			for (int j = 0; j < history.length; j++) {
//				String strHistory = history[j];
//				if (strHistory != null && string != null && strHistory.equals(string)) {
//				    count++;
//				}			
//			}
//		}
//		return count;
//	}
	private int filter(String[] history, String[] interesting) {
	    int count = 0;
	    for (int i = 0; i < interesting.length; i++) {
	        String string = interesting[i];
	        for (int j = 0; j < history.length; j++) {
	            String strHistory = history[j];
	            if (strHistory != null && string != null && strHistory.contains("toByteArray")) {
	                // Procura ocorrência de "toByteArray" no histórico
	                //int indexToByteArray = strHistory.indexOf("toByteArray");
	                // Verifica o histórico anterior a partir do ponto onde "toByteArray" foi encontrado
	                for (int k = j - 1; k >= 0; k--) {
	                    String previousHistory = history[k];
	                    // Verifica se há um "close" ou "flush" antes de "toByteArray"
	                    if (previousHistory != null && (previousHistory.contains("close") || previousHistory.contains("flush"))) {
	                        count++;
	                        break; // Sai do loop interno se um "close" ou "flush" for encontrado
	                    }
	                }
	                break; // Sai do loop externo se "toByteArray" for encontrado
	            }
	        }
	    }
	    return count;
	}

}
