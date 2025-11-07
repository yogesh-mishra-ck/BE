package org.example;

//Exception Propagation (Method Chain)
//Write three methods (m1(), m2(), m3()):
//m1() calls m2(), and m2() calls m3().
//m3() divides by zero.
//Observe how the exception propagates up the chain and catch it in m1().
//Re-throw Exception
//Catch an exception inside a try-catch block, print a message,
//then re-throw it to be handled by another catch block at a higher level.

public class Question14 {

    public static void m3(int dividend, int divisor){
        System.out.println("Inside m3");
        int ans = dividend/divisor;
        System.out.println(dividend+" divided by "+divisor+" gives "+ans);
    }
    public static void m2(int dividend, int divisor){
        System.out.println("Inside m2");
        try{
            m3(dividend, divisor);
        }catch (ArithmeticException e){
            System.out.println("Something went wrong");
            throw new ArithmeticException(e.getMessage());
        }
    }
    public static void m1(int dividend, int divisor){
        try{
            m2(dividend, divisor);
        }catch (ArithmeticException e){
            System.out.println("Error Occurred "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        m1(5,0);
    }
}
