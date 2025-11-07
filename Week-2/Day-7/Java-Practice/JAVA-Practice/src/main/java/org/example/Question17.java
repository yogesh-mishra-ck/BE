package org.example;

//Mini Banking Application
//Create a BankAccount class with deposit(), withdraw(), and getBalance() methods.
//Add exception handling for invalid amounts and overdrafts.
//Keep track of total accounts using a static variable

class MyBankAccount{

    public int currentBalance;

    public static int count;
    MyBankAccount(){
        count++;
    }

    public void deposit(int amount){
        if(amount <= 0)
            throw new IllegalArgumentException("Amount to be deposit must atleast be greater than 0");
        this.currentBalance = this.currentBalance + amount;
    }

    public int withdraw(int amount){

        //amount to be withdrawn is more than tha available balance in account
        if(amount > this.currentBalance)
            throw new IllegalArgumentException("Insufficient Balance");

        this.currentBalance = this.currentBalance - amount;
        return this.currentBalance;
    }

    public int getBalance(){
        return this.currentBalance;
    }
}

public class Question17 {
    public static void main(String[] args) {
        MyBankAccount bankAccount  = new MyBankAccount();
        MyBankAccount bankAccount2 = new MyBankAccount();
        MyBankAccount bankAccount3 = new MyBankAccount();
        try{
            bankAccount.deposit(500);
            System.out.println("Current Available balance after deposit "+bankAccount.getBalance());

            bankAccount.withdraw(400);
//            bankAccount.withdraw(800);
            System.out.println("After withdrawal, New Available Balance "+bankAccount.getBalance());

//            bankAccount.deposit(0);
            bankAccount.deposit(121);
            System.out.println("Balance after latest deposit "+bankAccount.getBalance());

            bankAccount2.deposit(300);
            bankAccount3.deposit(2200);
        }catch (IllegalArgumentException e){
            System.out.println("Something went wrong!! "+e.getMessage());
        }finally {
            System.out.println("Total no of bank accounts created: "+MyBankAccount.count);
        }

    }
}
