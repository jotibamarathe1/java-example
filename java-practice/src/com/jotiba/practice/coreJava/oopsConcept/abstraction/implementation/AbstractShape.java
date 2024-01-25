package com.jotiba.practice.coreJava.oopsConcept.abstraction.implementation;

import com.jotiba.practice.coreJava.oopsConcept.abstraction.contract.Shape;

public abstract class AbstractShape implements Shape {
    public void draw(){
        System.out.println("Base shape drawn.");
    }
}
