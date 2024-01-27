package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class PalindromeNumber {
    //write a program to print Palindrome number.

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int rem;
        int sum=0;
        int temp;

        temp=n;
        while(n!=0) {
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum) {
            System.out.println(temp + " is palindrome number");
        }
        else {
            System.out.println(temp + " is not palindrome number");
        }
    }
        }