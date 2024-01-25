package com.jotiba.practice.coreJava.oopsConcept.abstraction.implementation;

import com.jotiba.practice.coreJava.oopsConcept.abstraction.contract.Shape;

public class Rectangle extends AbstractShape {
    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
