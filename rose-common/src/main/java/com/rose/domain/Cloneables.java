package com.rose.domain;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

abstract class Cloneables {

	public static <E extends Number, L extends List<E>> L cloneNumbers(L list) {
		if (list == null) {
			return null;
		}
		L clone = cloneWithoutElements(list);
		for (E each : list) {
			clone.add(each);
		}
		return clone;
	}
	
	@SuppressWarnings("unchecked")
	public static <E extends Cloneable, L extends List<E>> L clone(L list) {
		if (list == null) {
			return null;
		}
		L clone = cloneWithoutElements(list);
		for (Cloneable each : list) {
			clone.add((E) clone(each));
		}
		return clone;
	}

	private static <L extends List<?>> L cloneWithoutElements(L list) {
		try {
			L clone = tryClone(list);
			clone.clear();
			return clone;
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException("Cannot clone " + list.getClass(), e);
		}
	}
	
	public static <T extends Cloneable> T clone(T object) {
		try {
			return tryClone(object);
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since the argument is Cloneable
			throw new InternalError("Clone an cloneable error, cause " + e.getMessage());
		}
	}

	public static <T> T tryClone(T object) throws CloneNotSupportedException {
		if (object == null) {
			return null;
		}
		Method cloneMethod = getCloneMethod(object);
		return (T) clone(object, cloneMethod);
	}

	@SuppressWarnings("unchecked")
	private static <T> T clone(T object, Method cloneMethod) throws CloneNotSupportedException {
		try {
			return (T) cloneMethod.invoke(object);
		} catch (IllegalAccessException e) {
			throw new CloneNotSupportedException(e.getMessage());
		} catch (InvocationTargetException e) {
			throw new CloneNotSupportedException(e.getCause().getMessage());
		}
	}

	private static <T> Method getCloneMethod(T object) throws CloneNotSupportedException {
		try {
			return object.getClass().getMethod("clone");
		} catch (NoSuchMethodException e) {
			throw new CloneNotSupportedException(e.getMessage());
		}
	}

}