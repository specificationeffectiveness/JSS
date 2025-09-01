package mop;

import mop.LoggerSpecification.SpecificationType;

public class MulticastSocket_TTL {

	
	public void eventMulticastSocket_TTL(byte ttl) {
		ttl = (byte) (ttl & 255);
		if (0 > ttl || ttl > 255) {
			LoggerSpecification.printLogging(SpecificationType.MulticastSocket_TTL, String.valueOf(ttl) );
		}
	}
	public void eventMulticastSocket_TTLSetTimeToLive(int ttl) {
		 if (0 > ttl || ttl > 255) {
			LoggerSpecification.printLogging(SpecificationType.MulticastSocket_TTL, String.valueOf(ttl) );
		}
	}
}
