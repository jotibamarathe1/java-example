package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;
public class PalindromeString {
    //write a program to check whether the given string is palindrome or not.

    public static void main(String[] args) {
        System.out.println("Please enter a string to check");
        Scanner sc = new Scanner(System.in);
        String enteredString = sc.nextLine();

        String reverseString = "";

        for(int i = enteredString.length() - 1; i >= 0; i--){
            reverseString = reverseString + enteredString.charAt(i);
        }

        System.out.println("Reverse of a string is: " + reverseString);

        if(enteredString.equalsIgnoreCase(reverseString) == true){
            System.out.println("Given String " + enteredString + " is palindrome");
        }else{
            System.out.println("Given String " + enteredString + " is not a palindrome");
        }
    }
}
