package com.hibernate.learn.dao;

import com.hibernate.learn.entity.Employee;

import java.util.List;

/**
 * Created by ashu936 on 7/13/2015.
 */
public interface EmployeeDao{
    public void save(Employee employee);
    public Employee findById(Integer id);
    public List<Employee> findAll();
}
