package com.hibernate.learn.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ashu936 on 7/12/2015.
 */
public interface GenericDao<T, Id extends Serializable> {

    T save(T entity);
    List<T> findAll();
    T findById(Id id);
}
