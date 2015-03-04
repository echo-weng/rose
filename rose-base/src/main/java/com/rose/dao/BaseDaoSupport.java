package com.rose.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

@SuppressWarnings("unchecked")
public class BaseDaoSupport<T> extends BaseDao implements CrudDao<T> {

	public DetachedCriteria createDetachedCriteria() {
		return DetachedCriteria.forClass(getEntityClass());
	}

	public DetachedCriteria createDetachedCriteria(String alias) {
		return DetachedCriteria.forClass(getEntityClass(), alias);
	}

	@Override
	public List<T> queryAll() {
		DetachedCriteria criteria = createDetachedCriteria();
		return findByCriteria(criteria);
	}

	@Override
	public void delete(T t) {
		getHibernateTemplate().delete(t);
	}

	@Override
	public T getById(Long id) {
		return (T) getHibernateTemplate().get(getEntityClass(), id);
	}

	@Override
	public T loadById(Long id) {
		return (T) getHibernateTemplate().load(getEntityClass(), id);
	}

	@Override
	public void save(T t) {
		getHibernateTemplate().save(t);
	}

	@Override
	public void saveOrUpdate(T t) {
		getHibernateTemplate().saveOrUpdate(t);
	}

	@Override
	public void update(T t) {
		getHibernateTemplate().update(t);
	}

	public Class<T> getEntityClass() {
		return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

}