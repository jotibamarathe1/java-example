package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class PrimeNumber {
    //Write a program to check whether a given number is prime or not.
    //Prime numbers are unique natural numbers greater than 1, divisible only by 1 and themselves.


    public static void main(String[] args) {
        System.out.print("Please enter the Number :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int number = Integer.valueOf(input);

        int count = 0;
        for(int i = 2; i < number /2 ; i++)
        {
            if(number % i == 0){
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println(number + " is a Prime Number.");
        else
            System.out.println(number + " is not a Prime Number.");
    }
}
