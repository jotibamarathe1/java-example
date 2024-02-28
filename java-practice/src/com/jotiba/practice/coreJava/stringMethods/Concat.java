package com.jotiba.practice.coreJava.strings.stringMethods;

public class Concat {
    public static void main(String[] args) {
        var message = "Hello ";
        System.out.println("message.concat(\"* double message*\"): " + message.concat("*double blah*"));
        System.out.println("message after concat: " + message);
    }
}
