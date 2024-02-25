package com.jotiba.practice.logicDevelopment.assignment;
import java.util.Scanner;

public class ReverseArray{
        //write a program to reverse an array.

        public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        double[]a = new double[size];
        double[]b = new double[size];

        System.out.println("Enter " + size + " elements");
        for(int i =0; i < size; i++){
            a[i] = sc.nextDouble();
        }
        for(int i=size-1, j=0; i>=0; i--,j++){
            b[j]=a[i];
        }
            System.out.println("Reverse of an array is");
        for (int i = 0; i < size; i++){
            System.out.println(b[i]);
        }
    }
}
