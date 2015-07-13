package com.hibernate.learn.dao;

import com.hibernate.learn.entity.Employee;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by ashu936 on 7/13/2015.
 */
public class EmployeeDaoImplTest {
    @Test
    public void testSaveEmployee() throws Exception{
        Employee employee = new Employee();
        employee.setAge(12);
        employee.setName("Nimesh");
        new EmployeeDaoImpl().save(employee);
    }

    @Test
    public void testFindAllEmployees() throws Exception{
        List<Employee> employees = new EmployeeDaoImpl().findAll();
        for(Employee emp : employees){
            System.out.println("emp = " + emp.getName());
        }
        assertNotNull(employees);
    }
}
