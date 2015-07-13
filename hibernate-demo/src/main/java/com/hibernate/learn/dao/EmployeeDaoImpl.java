package com.hibernate.learn.dao;

import com.hibernate.learn.HibernateUtil;
import com.hibernate.learn.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by ashu936 on 7/13/2015.
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private Session session;
    public void save(Employee employee) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }

    public Employee findById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Employee employee = (Employee)session.load(Employee.class, id);
        HibernateUtil.shutdown();
        return employee;
    }

    public List<Employee> findAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Employee> employees = session.createQuery("from Employee").list();
        return employees;
    }
}
