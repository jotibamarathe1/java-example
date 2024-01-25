package com.jotiba.practice.coreJava.oopsConcept.abstraction;

import com.jotiba.practice.coreJava.oopsConcept.abstraction.contract.Shape;
import com.jotiba.practice.coreJava.oopsConcept.abstraction.implementation.AbstractShape;
import com.jotiba.practice.coreJava.oopsConcept.abstraction.implementation.Circle;
import com.jotiba.practice.coreJava.oopsConcept.abstraction.implementation.Rectangle;
import com.jotiba.practice.coreJava.oopsConcept.abstraction.implementation.Square;

public class AbstractionDemo {
    public static void main(String[] args) {
        //we can achieve data hiding with
        //1. interface
        System.out.println("Data hiding with interface");
         Shape shape = new Circle();
         shape.draw();

         shape = new Square();
         shape.draw();

         shape = new Rectangle();
         shape.draw();
        System.out.println("--------------------------------");
         //2. abstract class
        System.out.println("Data hiding with abstract class");
        AbstractShape abstractShape = new Circle();
        abstractShape.draw();

        abstractShape = new  Square();
        abstractShape.draw();

        abstractShape = new Rectangle();
        abstractShape.draw();


    }
}
