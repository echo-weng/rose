package com.rose.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;

@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class BaseDao {
	
	@Autowired
	protected SessionFactory sessionFactory;

	public int executeUpdate(final DetachedQuery detachedQuery) {
		return (Integer) execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = detachedQuery.getExecutableQuery(session);
				return query.executeUpdate();
			}
		});
	}

	public Object findUniqueResultByQuery(final DetachedQuery detachedQuery) {
		return execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = detachedQuery.getExecutableQuery(session);
				return query.uniqueResult();
			}
		});
	}

	public List findByQuery(final DetachedQuery detachedQuery) {
		return (List) execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = detachedQuery.getExecutableQuery(session);
				return query.list();
			}
		});
	}

	public Object findUniqueResultByCriteria(DetachedCriteria criteria) {
		return uniqueElement(findByCriteria(criteria));
	}

	public List findByCriteria(DetachedCriteria criteria) {
		return criteria.getExecutableCriteria(getSession()).list();
	}

	public Object execute(HibernateCallback action) {
		try {
			return action.doInHibernate(getSession());
		} catch (HibernateException e) {
		} catch (SQLException e) {
		}
		return null;
	}
	
	protected Session getSession(){
		try {
			return sessionFactory.getCurrentSession();
		} catch (Throwable e) {
			return sessionFactory.openSession();
		}
	}

	public static <T> T uniqueElement(List<T> list) throws NonUniqueResultException {
		int size = list.size();
		if (size == 0)
			return null;
		T first = list.get(0);
		for (int i = 1; i < size; i++) {
			if (list.get(i) != first) {
				throw new NonUniqueResultException(list.size());
			}
		}
		return first;
	}

}