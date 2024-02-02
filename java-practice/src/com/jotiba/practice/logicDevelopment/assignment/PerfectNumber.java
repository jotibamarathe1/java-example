package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;
public class PerfectNumber {
    //write a program to check whether the given number is perfect or not.
    //A Perfect Number N is defined as any positive integer where the sum of its divisors minus the number itself equals the number.
    //The first few of these, already known to the ancient Greeks, are 6, 28, 496, and 8128.
    //Ex. n = 6
    //Proper Divisors of 6 are 1, 2 and 3.
    //Sum = 1+2+3 = 6 = 6
    //⇒ 6 is a perfect number
    
        static boolean isPerfectNumber(int number){
            if(number==1)
                return false;
            int sum=1;
            for (int i=2;i<number;i++)
                if (number % i == 0)
                    sum += i;

            if (sum==number)
                return true;
            return false;
        }
        public static void main(String []args){
            System.out.println("Please enter a number :");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            if (isPerfectNumber(number)){
                System.out.println(number + " is a perfect number");
            }
            else
                System.out.println(number + " not a perfect number");
        }
}


