package com.hibernate.learn.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ashu936 on 7/12/2015.
 */
@Entity
@Table(name = "Employee")
public class Employee implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_age")
    private Integer age;

    public Employee(){}

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
