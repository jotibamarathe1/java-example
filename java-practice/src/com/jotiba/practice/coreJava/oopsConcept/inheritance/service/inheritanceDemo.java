package com.jotiba.practice.coreJava.oopsConcept.inheritance.service;
import com.jotiba.practice.coreJava.oopsConcept.inheritance.model.Address;
import com.jotiba.practice.coreJava.oopsConcept.inheritance.model.Programmer;


import java.util.Scanner;
public class inheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Employee name");
        String name = scanner.nextLine();

        System.out.println("Please Enter Employee city");
        String city = scanner.nextLine();

        System.out.println("Please Enter Employee Id");
        String employeeId = scanner.nextLine();

        System.out.println("Please Enter Employee department");
        String employeeDepartment = scanner.nextLine();

        System.out.println("Please Enter Employee Salary");
        String employeeSalary = scanner.nextLine();

        System.out.println("Please Enter Employee working language");
        String workingLanguage = scanner.nextLine();

        Programmer programmer = new Programmer();
        programmer.setName(name);
        Address address = new  Address();
        address.city = city;
        programmer.setAddress(address);
        programmer.employeeId = Integer.parseInt(employeeId);
        programmer.employeeDepartment = employeeDepartment;
        programmer.employeeSalary = Integer.parseInt(employeeSalary);
        programmer.workingLanguage = workingLanguage;

        System.out.println(programmer);
    }
}
