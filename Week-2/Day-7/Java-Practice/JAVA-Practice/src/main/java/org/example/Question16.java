package org.example;

//Customer POJO
//Create a Customer class with id, name, email.
//Create 3 objects and print their details using a list.

import java.util.ArrayList;

class Customer{
    private int id;
    private String name;
    private String email;

    public Customer() {}

    public Customer(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Id: "+id+"\n"+
                "Name: "+name+"\n"+
                "Email: "+email+"\n";
    }
}

public class Question16 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Yogesh", "yogesh12@gmail.com");
        Customer c2 = new Customer(2, "Bhavesh","bhavesh87@gmail.com");
        Customer c3 = new Customer(3, "Kushagra","kushagra4@gmail.com");

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        for(Customer customer: customers){
            System.out.println(customer);
        }
    }
}
