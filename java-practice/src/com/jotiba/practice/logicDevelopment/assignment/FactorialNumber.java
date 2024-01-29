package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class FactorialNumber {
    //Write a program to calculate the factorial of a given number.

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int number = Integer.valueOf(input);

        int fact = 1;
        for(int i=1; i<=number; i++){
            fact =fact* i;
        }
        System.out.println("Factorial of " + number + " is: "+fact);
    }
    }
