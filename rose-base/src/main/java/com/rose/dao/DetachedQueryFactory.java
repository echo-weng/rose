package com.rose.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public abstract class DetachedQueryFactory {

	public static DetachedQuery create(String queryString) {
		DetachedQueryInvocationHandler detachedQueryInvocationHandler = new DetachedQueryInvocationHandler(queryString);
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		return (DetachedQuery) Proxy.newProxyInstance(contextClassLoader, new Class[] { DetachedQuery.class }, detachedQueryInvocationHandler);
	}

	private static class DetachedQueryInvocationHandler implements InvocationHandler {

		private String queryString;

		public DetachedQueryInvocationHandler(String queryString) {
			this.queryString = queryString;
		}

		private List<MethodInvocation> methodInvocations = new ArrayList<MethodInvocation>();

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if (method.getName().equals("equals")) {
				return (proxy == args[0] ? Boolean.TRUE : Boolean.FALSE);
			} else if (method.getName().equals("hashCode")) {
				return new Integer(System.identityHashCode(proxy));
			} else if (method.getName().equals("getExecutableQuery")) {
				Session session = (Session) args[0];
				if (session == null) {
					throw new IllegalArgumentException("The argument 'session' cannot be null");
				}
				Query query = session.createQuery(queryString);
				for (MethodInvocation methodInvocation : methodInvocations) {
					methodInvocation.invoke(query);
				}
				return query;
			} else {
				methodInvocations.add(new MethodInvocation(method, args));
				return proxy;
			}
		}
	}

	private static class MethodInvocation {

		private Method method;

		private Object[] args;

		public MethodInvocation(Method method, Object[] args) {
			super();
			this.method = method;
			this.args = args;
		}

		public void invoke(Query query) throws Throwable {
			Method methodOfQuery = Query.class.getMethod(method.getName(), method.getParameterTypes());
			methodOfQuery.invoke(query, args);
		}

	}

}