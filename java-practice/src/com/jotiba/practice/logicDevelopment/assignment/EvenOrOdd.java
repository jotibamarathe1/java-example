package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class EvenOrOdd {
    //write a program to check given number is Even or Odd.

    int number = 0;
    public void checkNumber(int number){
        if (number % 2 == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        EvenOrOdd evenOrodd = new EvenOrOdd();
        int number = Integer.valueOf(input);
        evenOrodd.checkNumber(number);
    }
}
