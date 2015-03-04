package org.rose.webservice.util;

import java.lang.reflect.Array;

/**
 * @author YangYang
 * @version 0.1, 2008-5-23 12:50:57
 */
public final class ClassUtils {

	@SuppressWarnings("unchecked")
	public static Class getClass(String className) throws ClassNotFoundException {
		String baseType = className;
		boolean indexed = false;
		if (baseType.endsWith("[]")) {
			baseType = baseType.substring(0, baseType.length() - 2);
			indexed = true;
		}

		// Construct an appropriate Class instance for the base class
		Class baseClass = null;
		if ("boolean".equals(baseType)) {
			baseClass = Boolean.TYPE;
		} else if ("byte".equals(baseType)) {
			baseClass = Byte.TYPE;
		} else if ("char".equals(baseType)) {
			baseClass = Character.TYPE;
		} else if ("double".equals(baseType)) {
			baseClass = Double.TYPE;
		} else if ("float".equals(baseType)) {
			baseClass = Float.TYPE;
		} else if ("int".equals(baseType)) {
			baseClass = Integer.TYPE;
		} else if ("long".equals(baseType)) {
			baseClass = Long.TYPE;
		} else if ("short".equals(baseType)) {
			baseClass = Short.TYPE;
		} else {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			if (classLoader == null) {
				classLoader = ClassUtils.class.getClassLoader();
			}
			try {
				baseClass = classLoader.loadClass(baseType);
			} catch (Throwable t) {
				baseClass = null;
			}
		}

		// Return the base class or an array appropriately
		if (indexed) {
			return (Array.newInstance(baseClass, 0).getClass());
		} else {
			return (baseClass);
		}
	}


}
