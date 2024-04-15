package mop;

import mop.LoggerSpecification.SpecificationType;

public class InputStream_UnmarkedReset {

	public void eventInputStream_UnmarkedReset(String[] history) {
		boolean markCalledBeforeReset = false;
		boolean markCalledAfterReset = false;
		boolean resetCalled = false;

		// Percorre o histórico para verificar se mark foi chamado antes ou depois de reset
		for (String method : history) {
			if(method !=null && !method.isEmpty()) {
				if (customEquals("mark",method) ){
					if (!resetCalled) {
						markCalledBeforeReset = true;
					} else {
						markCalledAfterReset = true;
					}
				} else  if (customEquals("reset",method) ){
					resetCalled = true;
				}
			}
		}

		// Se reset foi chamado sem mark antes ou depois, há uma violação
		if (resetCalled && (!markCalledBeforeReset &&  !markCalledAfterReset)) {
			LoggerSpecification.printLogging(SpecificationType.InputStream_UnmarkedReset);
		}
		// Se reset foi chamado, mas não há mark antes e depois mark, ainda há uma violação
		if (resetCalled && (!markCalledBeforeReset && markCalledAfterReset)) {
			LoggerSpecification.printLogging(SpecificationType.InputStream_UnmarkedReset);
		}
	}



	private boolean customEquals(String str1, String str2) {
		// Verifica se as duas strings são iguais
		if (str1 == str2) {
			return true;
		}

		// Verifica se ambas as strings têm o mesmo comprimento
		if (str1.length() == str2.length()) {
			// Itera pelos caracteres de cada string e compara-os
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					return false;
				}
			}
			// Se todos os caracteres forem iguais, retorna true
			return true;
		}
		// Retorna false se as strings tiverem comprimentos diferentes
		return false;
	}

}
