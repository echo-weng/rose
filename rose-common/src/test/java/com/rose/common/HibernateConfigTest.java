package com.rose.common;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author echo
 */
public class HibernateConfigTest {
	
	@Test
	public void testGetSessionFactory(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("rose-common-config.xml");
		System.out.println(ctx.getBean("sessionFactory"));
	}
	
}
