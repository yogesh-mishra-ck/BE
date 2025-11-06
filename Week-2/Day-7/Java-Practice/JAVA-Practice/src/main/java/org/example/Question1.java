package org.example;

import java.util.Scanner;

//Sum of Digits
//Accept a number and find the sum of all its digits. E.g. 1234 → 10 (1+2+3+4)


public class Question1 {

    public static int approach1(String numString){
        int numInt = Integer.parseInt(numString);
        int sum=0;
        while(numInt!=0){
            int remainder = numInt%10;
            sum = sum+remainder;
            numInt/=10;
        }
        return sum;
    }

    public static int approach2(String numString){
        int sum=0;
        for(int i=0; i<numString.length(); i++){
            int currentVal = numString.charAt(i)-'0';
            sum = sum+currentVal;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numString = sc.next();

        int sumUsingApproach1 = approach1(numString);
        int sumUsingApproach2 = approach2(numString);
        System.out.println("Approach 1 \n The sum of all the digits in "+numString+" is: "+sumUsingApproach1);
        System.out.println("Approach 2 \n The sum of all the digits in "+numString+" is: "+sumUsingApproach2);
    }
}
