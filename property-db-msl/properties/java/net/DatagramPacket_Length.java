package mop;

import mop.LoggerSpecification.SpecificationType;

public class DatagramPacket_Length {
	
	public void eventDatagramPacket_LengthOffset(byte[] buffer, int offset, int length) {
		int opeSum = offset + length;
		if(opeSum > buffer.length ) {
			LoggerSpecification.printLogging(SpecificationType.DatagramPacket_Length);
		}
	}
	
	public void eventDatagramPacket_Length(byte[] buffer, int length) {
        if(length > buffer.length ) {
        	LoggerSpecification.printLogging(SpecificationType.DatagramPacket_Length);
		}
	}

}
