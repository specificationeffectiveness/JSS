package mop;

import java.lang.reflect.*;

public class Serializable_UID {

	public void eventSerializable_UID(Class klass) {
	    if (klass != null) {
	        checkStaticModifier(klass);
	        checkFinalModifier(klass);
	        checkFieldType(klass);
	    }
	}

	private void checkStaticModifier(Class klass) {
	    try {
	        Field field = klass.getDeclaredField("serialVersionUID");
	        if (!Modifier.isStatic(field.getModifiers())) {
	            LoggerSpecification.printLoggingSerializable_UID(1, klass.getName());
	        }
	    } catch (NoSuchFieldException e) {
	        LoggerSpecification.printLoggingSerializable_UID(4, klass.getName());
	    }
	}

	private void checkFinalModifier(Class klass) {
	    try {
	        Field field = klass.getDeclaredField("serialVersionUID");
	        if (!Modifier.isFinal(field.getModifiers())) {
	            LoggerSpecification.printLoggingSerializable_UID(2, klass.getName());
	        }
	    } catch (NoSuchFieldException e) {
	        LoggerSpecification.printLoggingSerializable_UID(4, klass.getName());
	    }
	}

	private void checkFieldType(Class klass) {
	    try {
	        Field field = klass.getDeclaredField("serialVersionUID");
	        Class fieldType = field.getType();
	        if (!fieldType.equals(long.class)) {
	            LoggerSpecification.printLoggingSerializable_UID(3, klass.getName());
	        }
	    } catch (NoSuchFieldException e) {
	        LoggerSpecification.printLoggingSerializable_UID(4, klass.getName());
	    }
	}

}
