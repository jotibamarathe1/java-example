package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;
public class SwapTwoNumbers {
    int no1 = 0;
    int no2 = 0;
    int temp = 0;

    public void SwapWithTemp(int no1, int no2){
        System.out.println("Numbers before swapping: " + "\nno1 = " + no1 + "\nno2 = " + no2);
        temp = no1;
        no1 = no2;
        no2 = temp;
        System.out.println("\nNumbers after swapping: " + "\nno1 = " + no1 + "\nno2 = " + no2);
    }

    public void SwapWithoutTemp(int no1, int no2){
        System.out.println("Numbers before swapping: " + "\nno1 = " + no1 + "\nno2 = " + no2);
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;

        System.out.println("\nNumbers after swapping: " + "\nno1 = " + no1 + "\nno2 = " + no2);
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();

        SwapTwoNumbers SwapTwoNumbers = new SwapTwoNumbers();
        int no1 = Integer.valueOf(number1);
        int no2 = Integer.valueOf(number2);
        System.out.println("swapping with temporary variable");
        SwapTwoNumbers.SwapWithTemp(no1,no2);
        System.out.println("\nswapping without temporary variable");
        SwapTwoNumbers.SwapWithoutTemp(no1,no2);
    }
}
