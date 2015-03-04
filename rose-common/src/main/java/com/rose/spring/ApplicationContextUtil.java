package com.rose.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * spring 容器工具类
 *
 * @author echo
 */
public class ApplicationContextUtil implements ApplicationContextAware {
	/**
	 * spring容器
	 */
	private static ApplicationContext context;
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String beanName){
		return (T) context.getBean(beanName);
	}
	
	public static <T> T getBean(Class<T> cls){
		return context.getBean(cls);
	}

	public static <T> T getBean(String beanName, Class<T> cls){
		return context.getBean(beanName, cls);
	}
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		ApplicationContextUtil.context = context;
	}

}
