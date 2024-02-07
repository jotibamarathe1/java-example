package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;
public class PowerOfNumber {
    //Write a java program to calculate the power of a given number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter base number");
        int baseNumber = sc.nextInt();

        System.out.println("Please enter power number");
        int powerNumber = sc.nextInt();

        int result = 1;
        for(int i = 1; i <= powerNumber; i++){
            result = result * baseNumber;
        }
        System.out.println("power of " + baseNumber + " raised " + powerNumber + " is: " + result);
    }
}




