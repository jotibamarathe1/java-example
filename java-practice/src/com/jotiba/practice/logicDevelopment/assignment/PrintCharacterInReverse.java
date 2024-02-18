package com.jotiba.practice.logicDevelopment.assignment;

public class PrintCharacterInReverse {

    public static void main(String[] args) {
        //write a program to print alphabets from Z to A.

        System.out.println("Alphabets from Z to A");
           for(char ch = 'Z'; ch >= 'A'; ch--){
               System.out.println(ch);
           }
    }
}
