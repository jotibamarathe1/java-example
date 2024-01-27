package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;
public class PositiveOrNegative {
    //write a program to check given number is Positive, Negative or Zero.

    int number = 0;
    public void checkNumber(int number){
        if (number > 0){
            System.out.println("Number is positive");
        }
        else if (number < 0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PositiveOrNegative positiveOrnegative = new PositiveOrNegative();
        int number = Integer.valueOf(input);
        positiveOrnegative.checkNumber(number);
    }
}
