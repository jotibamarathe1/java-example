package com.jotiba.practice.coreJava.oopsConcept.model;

public class Employee extends Person{
    public int employeeId;
    public String employeeDepartment;
    public int employeeSalary;


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", name='" + getName() + '\'' +
                ", city='" + getAddress().city + '\'' +
                '}';
    }
}

