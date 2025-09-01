package mop;

public class Character_ValidateChar {

	public void envetCharacter_ValidateCharToCodePoint(int codePoint) {
		if (!Character.isValidCodePoint(codePoint)) {
			LoggerSpecification.printLoggingCharacter_ValidateChar(1);
		}
	}
	
	public void envetCharacter_ValidateCharCount(char high, char low){
		if (!Character.isSurrogatePair(high, low)) {
			LoggerSpecification.printLoggingCharacter_ValidateChar(2);
		}
	}
}
