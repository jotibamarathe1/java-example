package com.jotiba.practice.coreJava.oopsConcept.service;
import com.jotiba.practice.coreJava.oopsConcept.model.Employee;
import com.jotiba.practice.coreJava.oopsConcept.model.Programmer;
import com.jotiba.practice.coreJava.oopsConcept.model.Address;


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
        int employeeSalary = scanner.nextInt();

        System.out.println("Please enter Employee working language");
        String workingLanguage = scanner.nextLine();

        Programmer programmer = new Programmer();
        programmer.setName(name);
        Address address = new  Address();
        address.city = city;
        programmer.setAddress(address);
        programmer.employeeId = Integer.parseInt(employeeId);
        programmer.employeeDepartment = employeeDepartment;
        programmer.employeeSalary = employeeSalary;
        programmer.workingLanguage = workingLanguage;

        System.out.println(programmer);
    }
}
