package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class FibonacciSeries {
    //write a program to display first n terms of fibonacci series.

    int number = 0;
    public void EvenNumber(int number) {

        int n1=0;
        int n2=1;
        int n3=0;
        int i;
        System.out.println("Fibonacci Numbers are");
        for(i=1; i<=number; i++){
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of terms to display: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        FibonacciSeries evenOrOdd = new FibonacciSeries();
        int number = Integer.valueOf(input);
        evenOrOdd.EvenNumber(number);
    }
}