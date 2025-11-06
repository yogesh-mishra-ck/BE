package org.example;

import java.util.Scanner;

//Factorial Calculator
//Calculate the factorial of a number using a for loop.


public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact=1;
        for(int i=num; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
    }
}
