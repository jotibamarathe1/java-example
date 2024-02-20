package com.jotiba.practice.logicDevelopment.assignment;

import java.util.Scanner;

public class SumOfDigits {
    //write a program to print sum of its digit.

    public static void main(String[] args) {
        System.out.println("Please enter a digit");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int digit = number;
        int sum = 0;
        int remainder = 0;

        while (number > 0) {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println("Sum of a digit is: " + sum);
    }
}



