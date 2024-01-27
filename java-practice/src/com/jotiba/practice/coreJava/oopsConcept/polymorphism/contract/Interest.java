package com.jotiba.practice.coreJava.oopsConcept.polymorphism.contract;

public interface Interest {
     double calculate(double interestRate, int principleAmount, double years);
     double calculate(double interestRate, int principleAmount);
}
