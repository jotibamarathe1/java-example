package com.jotiba.practice.coreJava.oopsConcept.abstraction.implementation;

import com.jotiba.practice.coreJava.oopsConcept.abstraction.contract.Shape;

public class Square extends AbstractShape {
    @Override
    public void draw() {
        System.out.println("Square drawn");
    }
}
