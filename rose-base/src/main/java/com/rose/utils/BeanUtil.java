package com.rose.utils;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Bean工具类
 * 
 * @author echo
 */
public final class BeanUtil {
	/**
	 * 解析缓存
	 */
	private static final Map<Class<?>, Object> classCache = Collections
			.synchronizedMap(new WeakHashMap<Class<?>, Object>());

	/**
	 * 将Bean转换为Map
	 * 
	 * @param obj
	 * @param ignoredProps
	 * @return
	 */
	public static Map<String, Object> asMap(Object obj, String... ignoredProps) {
		if (obj == null) {
			return null;
		}

		Map<String, PropertyDescriptor> propDescMap = getPropDescMap(obj.getClass());

		Map<String, Object> propMap = new HashMap<String, Object>();
		for (Map.Entry<String, PropertyDescriptor> propDescEntry : propDescMap.entrySet()) {
			try {
				if (ArrayUtil.contains(ignoredProps, propDescEntry.getKey())) {
					continue;
				}

				Method readMethod = propDescEntry.getValue().getReadMethod();
				if (readMethod != null) {
					propMap.put(propDescEntry.getKey(), readMethod.invoke(obj));
				}
			} catch (Exception e) {
				throw new RuntimeException("Read property value error, propName=" + propDescEntry.getKey(), e);
			}
		}

		return propMap;
	}

	/**
	 * 将source对象的属性值拷贝至target对象的同名属性中
	 * 
	 * @param source
	 * @param target
	 * @param ignoredProps
	 * @return
	 */
	public static <T> T copyProperties(Object source, T target, String... ignoredProps) {
		return copyProperties(CopyPropModes.STANDARD, source, target, ignoredProps);
	}

	/**
	 * 将source对象的属性值拷贝至target对象的同名属性中
	 * 
	 * @param mode
	 *            模式: 1-source对象属性值不为null，2-target对象属性值未设置，其他-所有均拷贝
	 * @param source
	 * @param target
	 * @param ignoredProps
	 * @return
	 * @see me.andpay.ti.util.BeanUtil.CopyPropModes
	 */
	public static <T> T copyProperties(int mode, Object source, T target, String... ignoredProps) {
		if (source == null || target == null) {
			return target;
		}

		Map<String, PropertyDescriptor> srcPropDescMap = getPropDescMap(source.getClass());
		Map<String, PropertyDescriptor> targetPropDescMap = getPropDescMap(target.getClass());
		for (Map.Entry<String, PropertyDescriptor> srcPropDescEntry : srcPropDescMap.entrySet()) {
			if (ArrayUtil.contains(ignoredProps, srcPropDescEntry.getKey())) {
				continue;
			}

			Method readMethod = srcPropDescEntry.getValue().getReadMethod();
			if (readMethod == null) {
				continue;
			}

			PropertyDescriptor targetPropDesc = targetPropDescMap.get(srcPropDescEntry.getKey());
			if (targetPropDesc == null || targetPropDesc.getWriteMethod() == null) {
				continue;
			}

			try {
				boolean doSet = true;
				Object srcValue = readMethod.invoke(source);

				switch (mode) {
				case CopyPropModes.SOURCE_VALUE_NOT_NULL:
					doSet = (srcValue != null);
					break;

				case CopyPropModes.TARGET_VALUE_NOT_SET:
					Method targetReadMethod = targetPropDesc.getReadMethod();
					if (targetReadMethod != null) {
						Object targetValue = targetReadMethod.invoke(target);
						doSet = (targetValue == null || targetValue.equals(ObjectUtil.defaultValue(targetPropDesc
								.getPropertyType())));
					}
					break;
				}

				if (doSet) {
					targetPropDesc.getWriteMethod().invoke(target, srcValue);
				}
			} catch (Exception e) {
				throw new RuntimeException("Write property value error, propName=" + srcPropDescEntry.getKey(), e);
			}
		}

		return target;
	}

	/**
	 * 将Map的属性值拷贝至target对象的同名属性中
	 * 
	 * @param source
	 * @param target
	 * @param ignoredProps
	 * @return
	 */
	public static <T> T copyProperties(Map<String, Object> source, T target, String... ignoredProps) {
		return copyProperties(CopyPropModes.STANDARD, source, target, ignoredProps);
	}

	/**
	 * 将Map的属性值拷贝至target对象的同名属性中
	 * 
	 * @param mode
	 *            模式: 1-source对象属性值不为null，2-target对象属性值未设置，其他-所有均拷贝
	 * @param source
	 * @param target
	 * @param ignoredProps
	 * @return
	 * @see me.andpay.ti.util.BeanUtil.CopyPropModes
	 */
	public static <T> T copyProperties(int mode, Map<String, Object> source, T target, String... ignoredProps) {
		if (MapUtil.isEmpty(source) || target == null) {
			return target;
		}

		Map<String, PropertyDescriptor> propDescMap = getPropDescMap(target.getClass());
		for (Map.Entry<String, Object> dataEntry : source.entrySet()) {
			if (ArrayUtil.contains(ignoredProps, dataEntry.getKey())) {
				continue;
			}

			PropertyDescriptor propDesc = propDescMap.get(dataEntry.getKey());
			if (propDesc == null || propDesc.getWriteMethod() == null) {
				continue;
			}

			try {
				boolean doSet = true;
				Object srcValue = dataEntry.getValue();

				switch (mode) {
				case CopyPropModes.SOURCE_VALUE_NOT_NULL:
					doSet = (srcValue != null);
					break;

				case CopyPropModes.TARGET_VALUE_NOT_SET:
					Method targetReadMethod = propDesc.getReadMethod();
					if (targetReadMethod != null) {
						Object targetValue = targetReadMethod.invoke(target);
						doSet = (targetValue == null || targetValue.equals(ObjectUtil.defaultValue(propDesc
								.getPropertyType())));
					}

					break;
				}

				if (doSet) {
					propDesc.getWriteMethod().invoke(target, srcValue);
				}
			} catch (Exception e) {
				throw new RuntimeException("Write property value error, propName=" + dataEntry.getKey(), e);
			}
		}

		return target;
	}

	/**
	 * 获得class的propName对应的属性Get方法
	 * 
	 * @param clazz
	 * @param propName
	 * @return
	 */
	public static Method getReadMethod(Class<?> clazz, String propName) {
		if (clazz == null || propName == null) {
			return null;
		}

		PropertyDescriptor propDesc = getPropDescMap(clazz).get(propName);
		return (propDesc != null ? propDesc.getReadMethod() : null);
	}

	/**
	 * 获得class的propName对应的属性Set方法
	 * 
	 * @param clazz
	 * @param propName
	 * @return
	 */
	public static Method getWriteMethod(Class<?> clazz, String propName) {
		if (clazz == null || propName == null) {
			return null;
		}

		PropertyDescriptor propDesc = getPropDescMap(clazz).get(propName);
		return (propDesc != null ? propDesc.getWriteMethod() : null);
	}

	/**
	 * 获取属性描述集(class属性默认忽略)
	 * 
	 * @param clazz
	 * @param ignoredProps
	 *            忽略的字段名
	 * @return
	 */
	public static Map<String, PropertyDescriptor> getPropertyDescriptors(Class<?> clazz, String... ignoredProps) {
		if (clazz == null) {
			return null;
		}

		Map<String, PropertyDescriptor> propDescMap = new HashMap<String, PropertyDescriptor>(getPropDescMap(clazz));
		if (ArrayUtil.isNotEmpty(ignoredProps)) {
			for (String ignoredProp : ignoredProps) {
				propDescMap.remove(ignoredProp);
			}
		}

		return propDescMap;
	}

	/**
	 * 获取属性名称集
	 * 
	 * @param clazz
	 * @param ignoredProps
	 *            忽略的字段名
	 * @return
	 */
	public static List<String> getPropertyNames(Class<?> clazz, String... ignoredProps) {
		if (clazz == null) {
			return null;
		}

		Map<String, PropertyDescriptor> propDescMap = getPropDescMap(clazz);

		List<String> propNames = new ArrayList<String>(propDescMap.size());
		for (Map.Entry<String, PropertyDescriptor> entry : propDescMap.entrySet()) {
			if (ArrayUtil.contains(ignoredProps, entry.getKey()) == false) {
				propNames.add(entry.getKey());
			}
		}

		return propNames;
	}

	/**
	 * 获取Class的属性定义
	 * 
	 * @param clazz
	 * @return
	 */
	private static Map<String, PropertyDescriptor> getPropDescMap(Class<?> clazz) {
		Map<String, PropertyDescriptor> propDescMap = getPropDescMapFromCache(clazz);
		if (propDescMap != null) {
			return propDescMap;
		}

		propDescMap = new HashMap<String, PropertyDescriptor>();
		try {
			for (PropertyDescriptor pd : Introspector.getBeanInfo(clazz).getPropertyDescriptors()) {
				if ("class".equals(pd.getName()) == false) {
					propDescMap.put(pd.getName(), pd);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Analyse property desc error, class=" + clazz, e);
		}
		classCache.put(clazz, new WeakReference<Map<String, PropertyDescriptor>>(propDescMap));

		return propDescMap;
	}

	/**
	 * 从缓存中获取属性描述
	 * 
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static Map<String, PropertyDescriptor> getPropDescMapFromCache(Class<?> clazz) {
		WeakReference<Map<String, PropertyDescriptor>> propDescRef = (WeakReference<Map<String, PropertyDescriptor>>) classCache
				.get(clazz);

		return (propDescRef != null ? propDescRef.get() : null);
	}

	private BeanUtil() {
	}

	/**
	 * 属性拷贝模式类
	 * 
	 * @author alex
	 */
	public static final class CopyPropModes {
		/**
		 * 拷贝模式 - 标准全部拷贝
		 */
		public static final int STANDARD = 0;

		/**
		 * 拷贝模式 - source对象属性值不为null
		 */
		public static final int SOURCE_VALUE_NOT_NULL = 1;

		/**
		 * 拷贝模式 - target对象属性值未设置(为对应类型的默认值)
		 */
		public static final int TARGET_VALUE_NOT_SET = 2;

		private CopyPropModes() {
		}
	}
}
