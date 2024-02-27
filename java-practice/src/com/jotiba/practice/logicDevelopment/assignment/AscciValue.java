package com.jotiba.practice.logicDevelopment.assignment;

public class AscciValue {
    //write a program to print ascii value of all character.

    public static void main(String[] args) {
        for (int i= 0; i <= 255; i++){
            System.out.println("Ascii value of " + (char)i + " = " + i);
        }
    }
}
