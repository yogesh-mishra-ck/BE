package org.example;

//Simple Calculator
//Create a Calculator class with methods add, subtract, multiply, and divide.

import java.util.Scanner;

class MyCalculator{
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }
    public double divide(int num1, int num2){
        if(num2 == 0)
            return 0;
        return num1/(double)num2;
    }
}

public class Question5 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int addition = calculator.add(num1, num2);
        int subtraction = calculator.subtract(num1,num2);
        int multiplication = calculator.multiply(num1,num2);
        double division = calculator.divide(num1,num2);

        System.out.println("Addition of "+num1+" and "+num2+" is: "+addition);
        System.out.println("Subtraction of "+num1+" and "+num2+" is: "+subtraction);
        System.out.println("Multiplication of "+num1+" and "+num2+" is: "+multiplication);
        System.out.println("Division of "+num1+" and "+num2+" is: "+division);
    }
}
