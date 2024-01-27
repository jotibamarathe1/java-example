package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class PrintOddNumber {
    //write a program to print all odd numbers between the given range.
    int number = 0;
    public void oddNumber(int number){
        for(int i=1;i<=number;i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.print("Please enter a range: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PrintOddNumber evenOrOdd = new PrintOddNumber();
        int number = Integer.valueOf(input);
        evenOrOdd.oddNumber(number);
    }
}
    /*Scanner input = new Scanner(System.in);
            System.out.print("Enter The Number of Limit : ");
                    int l =input.nextInt();
                    for(int s=1;s<=l;s++)
                    {
                    if(s%2==0)
                    System.out.println(s);
                    }
                    }*/