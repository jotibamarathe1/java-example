package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class ReverseString {
    //write a program to reverse a string.

    public static void main(String[] args) {
        System.out.println("Please enter a string to check");
        Scanner sc = new Scanner(System.in);
        String enteredString = sc.nextLine();

        String reverseString = "";

        for(int i = enteredString.length() - 1; i >= 0; i--){
            reverseString = reverseString + enteredString.charAt(i);
        }
        System.out.println("Reverse of a string is: " + reverseString);
    }
}

