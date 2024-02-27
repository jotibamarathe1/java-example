package com.jotiba.practice.coreJava.strings.stringMethods;

public class ByteExample {
    public static void main(String[] args) {
        var message = "Hello ";
        byte[] messageBytes = message.getBytes();
        for (byte messagebyte : messageBytes) {
            System.out.println("messagebyte: " + messagebyte);
        }
    }
}