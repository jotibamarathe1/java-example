package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;
public class SumOfNumber {
    //write a program to print sum of beginning N numbers.

    public static void main(String[] args) {
        System.out.print("Please enter the range: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of beginning " + number + " numbers are : " + sum);
    }
}








