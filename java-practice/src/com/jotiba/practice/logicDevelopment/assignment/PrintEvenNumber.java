package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class PrintEvenNumber {
    //write a program to print all even numbers between the given range.
    int number = 0;

    public void EvenNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.print("Please enter a range: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PrintEvenNumber evenOrOdd = new PrintEvenNumber();
        int number = Integer.valueOf(input);
        evenOrOdd.EvenNumber(number);
    }
}