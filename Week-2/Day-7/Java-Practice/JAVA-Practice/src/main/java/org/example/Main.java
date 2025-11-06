package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void greet(int no){
        System.out.println("S. No "+no);
    }


    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            greet(i);
        }
    }
}