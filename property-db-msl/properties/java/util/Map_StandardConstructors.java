package mop;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import mop.LoggerSpecification.SpecificationType;

public class Map_StandardConstructors {
	
	public void eventMap_StandardConstructors(Class klass) throws NoSuchFieldException, InvocationTargetException {
		try {
			
			Constructor ctor1 = klass.getDeclaredConstructor((Class[]) null);
			Constructor ctor2 = klass.getDeclaredConstructor(Map.class);
			
		} catch (NoSuchMethodException e) {
//			System.out.println("[Siesta] Specification Map_StandardConstructors has been violated on line  does not define the 'standard' constructors.");
			LoggerSpecification.printLogging(SpecificationType.Map_StandardConstructors);
		}
		
	}
	public void eventMapNoSuchField() {
		LoggerSpecification.printLogging(SpecificationType.Map_StandardConstructors);
	}

}
