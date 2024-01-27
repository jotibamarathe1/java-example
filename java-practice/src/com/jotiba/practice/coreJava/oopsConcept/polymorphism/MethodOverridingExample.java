package com.jotiba.practice.coreJava.oopsConcept.polymorphism;

import com.jotiba.practice.coreJava.oopsConcept.polymorphism.service.CompoundInterest;
import com.jotiba.practice.coreJava.oopsConcept.polymorphism.service.SimpleInterest;

public class MethodOverridingExample {
    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest();
        System.out.println("Compound Interest for one year: " + compoundInterest.calculate(7.5, 5700));
        System.out.println("Compound Interest for five year: " + compoundInterest.calculate(7.5, 5700, 3.5));
    }
}
