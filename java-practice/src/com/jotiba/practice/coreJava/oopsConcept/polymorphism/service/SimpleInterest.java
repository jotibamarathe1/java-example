package com.jotiba.practice.coreJava.oopsConcept.polymorphism.service;

import com.jotiba.practice.coreJava.oopsConcept.polymorphism.contract.Interest;

public class SimpleInterest implements Interest {
    public double calculate(double interestRate, int principleAmount, double years) {
        return principleAmount * (interestRate / 100) * years;
    }
        public double calculate(double interestRate, int principleAmount){
            return principleAmount * (interestRate / 100);
        }
}