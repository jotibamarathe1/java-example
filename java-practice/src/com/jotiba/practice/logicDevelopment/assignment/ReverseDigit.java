package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;
public class ReverseDigit {
    //Write a program to reverse a given digit.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Digits to be reverse: ");
        String num = sc.nextLine();
        int digit = Integer.valueOf(num);
        int givenNumber = digit;
        int reverseDigit = 0;
        int remainder = 0;
        while (digit > 0) {
            remainder = digit % 10;
            reverseDigit = reverseDigit * 10 + remainder;
            digit /= 10;
        }
        System.out.println("Given Digit is: " + givenNumber);
        System.out.println("Reverse of Digit " + givenNumber + " is: "  + reverseDigit);
    }
}

