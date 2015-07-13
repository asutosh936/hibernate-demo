package com.hibernate.learn.dao;

import com.hibernate.learn.entity.Employee;
import org.hibernate.Session;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ashu936 on 7/13/2015.
 */
public class GenericDaoImpl<T, Id extends Serializable> implements GenericDao<T, Id> {

    private Class<T> type;
    private Session session;

    public T save(T entity) {
        return (T) session.save(entity);
    }

    public List<T> findAll() {
        return null;
    }

    public T findById(Id id) {
        return null;
    }
}
