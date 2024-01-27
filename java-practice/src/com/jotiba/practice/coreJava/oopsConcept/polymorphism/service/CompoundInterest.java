package com.jotiba.practice.coreJava.oopsConcept.polymorphism.service;

public class CompoundInterest extends SimpleInterest{
    public double calculate(double interestRate, int principalAmount, double years) {
        return principalAmount * Math.pow(1.0 + interestRate/100.0,years) - principalAmount;
    }
    public double calculate(double interestRate, int principalAmount){
        return principalAmount * Math.pow(1.0 + interestRate/100.0,1) - principalAmount;
    }
}
