package com.jotiba.practice.coreJava.strings.stringMethods;

public class EqualExample {
    public static void main(String[] args) {
        var message = "Hello ";
        String message1 = new String("Hello ");
        System.out.println("message.equals(message1): " + message.equals(message1));
        System.out.println("message == message1: " + (message == message1));
    }
}
