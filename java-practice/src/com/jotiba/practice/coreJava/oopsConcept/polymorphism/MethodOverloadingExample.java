package com.jotiba.practice.coreJava.oopsConcept.polymorphism;

import com.jotiba.practice.coreJava.oopsConcept.polymorphism.service.SimpleInterest;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        SimpleInterest simpleInterest = new SimpleInterest();
        System.out.println("Simple Interest for one year: " + simpleInterest.calculate(7.5, 5700));
        System.out.println("Simple Interest for five year: " + simpleInterest.calculate(7.5, 5700, 3.5));
    }
}
