package org.example;

//Bank Account Class
//Create a BankAccount class with accountNumber, holderName, and balance.
//Add a constructor to initialize these fields.

class  BankAccount{
    public int accountNumber;
    public String holderName;
    public int balance;

    public BankAccount(int accountNumber, String holderName, int balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "The customer "+holderName+"'s account number is "+accountNumber+" and current balance is: INR "+balance ;
    }
}

public class Question7 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(982376, "Vishu", 70000);
        System.out.println(bankAccount);
    }
}
