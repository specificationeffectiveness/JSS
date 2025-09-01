package mop;

import mop.LoggerSpecification.SpecificationType;

public class ListIterator_RemoveOnce {
	
	public void eventListIterator_RemoveOnce(String[] history) {
		String[] interesting = new String[] {"next", "previous"};
		if(validate(history)) {
			if(!filter(history, interesting)) {
				LoggerSpecification.printLogging(SpecificationType.ListIterator_RemoveOnce);
			}
		}
	}
	
	private boolean validate(String[] history) {
		for (int i = 0; i < history.length; i++) {

			if(history[i] !=null && equalshere(history[i], "listIterator")) {
				return true;
			}
		}
		return false;
	}
    
	private boolean filter(String[] history, String[] interesting) {

	    for (int i = 0; i < history.length; i++) {
	        if (equalshere("remove", history[i])) {

	            boolean foundNextOrPrevious = false;
	            
	            // Verifica se há um "next" ou "previous" antes do "remove"
	            for (int j = i - 1; j >= 0; j--) {
	                if (equalshere("next" ,history[j]) || equalshere("previous", history[j])) {
	                    foundNextOrPrevious = true;
	                    break;
	                } else if (equalshere("remove",history[j])) {
	                    return false; // Se encontrar uma sequência de dois "remove" consecutivos, retorna falso
	                }
	            }
	            
	            if (!foundNextOrPrevious) {
	                return true; // Se não encontrar um "next" ou "previous" antes do "remove", retorna falso
	            }
	        } 

	    }

	    return true; // Se não encontrar nenhum método interessante ou se não houver um "remove" no histórico, retorna falso
	}

	private boolean equalshere(String str1, String str2) {
	    if (str1 == null || str2 == null) {
	        return false;
	    }
	    int n = str1.length();
	    if (n != str2.length()) {
	        return false;
	    }
	    char v1[] = str1.toCharArray();
	    char v2[] = str2.toCharArray();
	    for (int i = 0; i < n; i++) {
	        if (v1[i] != v2[i]) {
	            return false;
	        }
	    }
	    return true;
	}




}
