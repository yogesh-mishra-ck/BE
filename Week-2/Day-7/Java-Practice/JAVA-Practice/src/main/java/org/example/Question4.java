package org.example;

import java.util.Scanner;

//Reverse a Number
//Reverse the digits of an integer using a while loop.


public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int reverseNumber=0;
        while(temp != 0){
            int remainder = temp%10;
            reverseNumber = reverseNumber*10 + remainder;
            temp = temp/10;
        }
        System.out.println("The reverse of number "+num+" is: " +reverseNumber);
    }
}
