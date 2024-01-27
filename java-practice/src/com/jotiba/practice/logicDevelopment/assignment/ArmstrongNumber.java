package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;
public class ArmstrongNumber {
    //write a program to print Armstrong numbers between the given range.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a range");
        int number = sc.nextInt();

        System.out.println("armstrong number are: ");
        for (int i = 0; i <= number; i++) {
            int sum = 0;
            int c = 0;
            int temp = i;
            int remainder = 0;
            while (temp != 0) {
                remainder = temp % 10;
                c = (int) (Math.pow(remainder, 3));
                sum = sum + c;
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}