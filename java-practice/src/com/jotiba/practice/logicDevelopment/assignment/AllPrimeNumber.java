package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class AllPrimeNumber {
    //Write a program to print all prime numbers from the given range.


    public static void main(String[] args) {
        System.out.print("Please enter the range :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int number = Integer.valueOf(input);

        int count = 0;
        for (int i = 1; i <= number; i++) {
            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}