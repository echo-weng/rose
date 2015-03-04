package com.rose.dao;

import java.util.List;

/**
 * @author echo
 */
public interface CrudDao<T> {

	void save(T t);

	void update(T t);

	void saveOrUpdate(T t);

	void delete(T t);

	T getById(Long id);

	T loadById(Long id);

	List<T> queryAll();

}