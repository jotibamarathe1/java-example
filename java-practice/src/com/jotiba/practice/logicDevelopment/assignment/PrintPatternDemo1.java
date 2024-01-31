package com.jotiba.practice.logicDevelopment.assignment;

public class PrintPatternDemo1 {
//    write a program to print following star pattern using while loop

//      *   *   *   *   *
//      *   *   *   *
//      *   *   *
//      *   *
//      *

    public static void main(String[] args) {
            int row=5;
            while(row>=1) {
                int col=1;
                while(col<=row){
                    System.out.print("*\t");
                    col++;
                }
                System.out.println();
                row--;
            }
        }
    }
