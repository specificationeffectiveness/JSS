package mop;

import java.util.Arrays;
import java.util.Collections;

import mop.LoggerSpecification.SpecificationType;

public class Closeable_MultipleClose {
	
	public void Closeable_MultipleCloseEvent(String[] history) {
	    if (history == null || history.length == 0) {
	        return;
	    }

	    String[] interesting = new String[] {"close"};
	    if (filter(history, interesting) >= 2) {
	        LoggerSpecification.printLogging(SpecificationType.Closeable_MultipleClose);
	    }
	}


//	private int filter(String[] history, String[] interesting) {
//	    int count = 0;
//	    for (String strInteresting : interesting) {
//	        for (String strHistory : history) {
//	            if (strHistory !=null && strHistory.contains(strInteresting)) {
//	                count++;
//	            }
//	        }
//	    }
//	    return count;
//	}

	private int filter(String[] history,String[] interesting) {
	    int count = 0; 
	    int closeItem = 0;
	    
	    String[] closeCount = new String[history.length]; // Array para contar as ocorrências de close() por classe

	    for (String strHistory : history) {
	        // Verifica se a linha contém uma chamada para close()
	        if (strHistory != null && strHistory.contains(".close()")) {
	            // Extrai o nome da classe e o método close()
	            String[] parts = strHistory.split("\\.");
	            if (parts.length >= 2) {
	                String className = parts[2];
	                // Incrementa o contador de close() para a classe correspondente
	                closeCount[closeItem] = className;
	                closeItem++;
	            }
	        }
	    }

	    // Conta quantos fechamentos têm mais de uma ocorrência
	    for (String className : closeCount) {
	        if (className != null && Collections.frequency(Arrays.asList(closeCount), className) > 1) {
	            count++;
	        }
	    }

	    return count;
	}


}
