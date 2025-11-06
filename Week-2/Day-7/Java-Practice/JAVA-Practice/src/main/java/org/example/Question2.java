package org.example;

import java.util.Scanner;

//Multiplication Table
//Print the multiplication table for any number entered by the user.


public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            int currentAnswer = num*i;
            System.out.println(num+" X "+i+" = "+currentAnswer);
        }
    }
}
