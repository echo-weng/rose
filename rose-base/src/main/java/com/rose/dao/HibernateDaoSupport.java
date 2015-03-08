package com.rose.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.dao.support.DaoSupport;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

/**
 * @author echo
 */
public abstract class HibernateDaoSupport extends DaoSupport {

	private HibernateTemplate hibernateTemplate;

	@Autowired
	public final void setSessionFactory(SessionFactory sessionFactory) {
		if (this.hibernateTemplate == null || sessionFactory != this.hibernateTemplate.getSessionFactory()) {
			this.hibernateTemplate = createHibernateTemplate(sessionFactory);
		}
	}

	protected HibernateTemplate createHibernateTemplate(SessionFactory sessionFactory) {
		return new HibernateTemplate(sessionFactory);
	}

	public final SessionFactory getSessionFactory() {
		return (this.hibernateTemplate != null ? this.hibernateTemplate.getSessionFactory() : null);
	}

	public final HibernateTemplate getHibernateTemplate() {
	  return this.hibernateTemplate;
	}

	@Override
	protected final void checkDaoConfig() {
		if (this.hibernateTemplate == null) {
			throw new IllegalArgumentException("'sessionFactory' or 'hibernateTemplate' is required");
		}
	}

	@Deprecated
	protected final Session getSession() throws DataAccessResourceFailureException, IllegalStateException {
		return getSession(this.hibernateTemplate.isAllowCreate());
	}
	
	@Deprecated
	protected final Session getSession(boolean allowCreate)
			throws DataAccessResourceFailureException, IllegalStateException {

		return (!allowCreate ?
			SessionFactoryUtils.getSession(getSessionFactory(), false) :
				SessionFactoryUtils.getSession(
						getSessionFactory(),
						this.hibernateTemplate.getEntityInterceptor(),
						this.hibernateTemplate.getJdbcExceptionTranslator()));
	}
	
	@Deprecated
	protected final DataAccessException convertHibernateAccessException(HibernateException ex) {
		return this.hibernateTemplate.convertHibernateAccessException(ex);
	}

	@Deprecated
	protected final void releaseSession(Session session) {
		SessionFactoryUtils.releaseSession(session, getSessionFactory());
	}
}
