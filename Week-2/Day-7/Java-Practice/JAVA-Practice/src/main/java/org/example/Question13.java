package org.example;

//Nested try-catch
//Write a program where an inner try block may throw ArithmeticException,
//and an outer try block may throw ArrayIndexOutOfBoundsException.
//Handle both appropriately.


import java.util.Arrays;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = {16,27,33,42,55};
        try{
            try{
                System.out.println("Enter a number for division");
                int inputNum = sc.nextInt();

                int lastElement = arr[arr.length-1];
                int quotient = lastElement/inputNum;

                System.out.println("Last element of array is "+lastElement+" and when divided by "+inputNum+" it gives "+quotient);
            }catch (ArithmeticException e){
                System.out.println("Division by zero not possible");
            }

            //Out of bounds
            System.out.println("Enter the position/index at which you want to update the value");
            int position = sc.nextInt();
            arr[position] = 28;

            System.out.println(Arrays.toString(arr));

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Can't assign an element in out of bounds index \n"+e.toString());
        }
    }
}
