package mop;

import java.util.HashMap;
import java.util.Map;

public class StringBuilderThreadSafe {
	
	private static Map<StringBuilder,Thread> map = new HashMap<>();
	
	public void eventStringBuilderThreadSafe(boolean isStatic, Object[] args) {
		if(isStatic) return;
		Object sb = args[0];
		Thread own = map.get(sb);
		Thread cur = Thread.currentThread();
		if (own == null) map.put((StringBuilder)sb, cur); // first access
		else if (cur != own) 
			throw new RuntimeException("Vio: StringBuilder Single Thread.");
	}

}
