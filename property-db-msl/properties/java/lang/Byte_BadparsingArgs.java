package mop;

import mop.LoggerSpecification.SpecificationType;

public class Byte_BadparsingArgs {
	
	 public void byteBadParsing(String string ){
	        if (string != null && string.length() != 0) {
	            for(int str = 0; str < string.length(); ++str) {
	                if (verifyDigit(str, string)) {
	                    LoggerSpecification.printLogging(SpecificationType.Byte_BadParsingArgs);
	                    break;
	                }
	            }
	        } else {
	            LoggerSpecification.printLogging(SpecificationType.Byte_BadParsingArgs);
	        }
	    }
	 
	  private boolean verifyDigit(int str, String string) {
		  return (Character.digit(string.charAt(str), 10) == -1 && 
				  (str != 0 || string.length() <= 1 || string.charAt(0) != '-'));		     
	  }
	  
	  public void byteBadParsingRadix(String string , int radix){
	        if (string != null && string.length() != 0) {
	            if (radix >= 2 && radix <= 36) {
	                for(int number = 0; number < string.length(); ++number) {
	                    if (verifyDigitRadix(string, radix, number)) {
	                        LoggerSpecification.printLogging(SpecificationType.Byte_BadParsingArgsRadix);
	                        break;
	                    }
	                }
	            } else {
	                LoggerSpecification.printLogging(SpecificationType.Byte_BadParsingArgsRadix);
	            }
	        } else {
	            LoggerSpecification.printLogging(SpecificationType.Byte_BadParsingArgsRadix);
	        }
	    }

	  private boolean verifyDigitRadix(String string,int radix ,int number) {
		  return (Character.digit(string.charAt(number), radix) == -1 && 
				  (number != 0 || string.length() <= 1 || string.charAt(0) != '-'));
	  }
}
