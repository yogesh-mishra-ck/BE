package org.example;

import java.util.Scanner;

//Division with Exception
//Accept two integers from user and divide them.
//Handle division by zero using try-catch.
//Print “Division completed” in a finally block

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try{
            if(num2 == 0)
                throw new ArithmeticException();

            double quotient = (double) num1/num2;
            System.out.println(num1+" divided by "+num2+" is: "+quotient);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        }
        finally {
            System.out.println("Division Completed");
        }
    }
}
