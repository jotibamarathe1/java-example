package com.jotiba.practice.basicJava.operator;
import java.util.Scanner;

public class LessThanOperatorDemo {
    /*write a program to identify given no if less than 100 or not
        Psuedo code:
        if(no is less than 100 or not)
            ? print good number
            : print bad number*/

    public static void main(String[] args) {
        System.out.println("Please enter value");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (Integer.valueOf(input) < 100) {
            System.out.println("Good Number");
        } else {
            System.out.println("Bad Number");
        }


    }
}

