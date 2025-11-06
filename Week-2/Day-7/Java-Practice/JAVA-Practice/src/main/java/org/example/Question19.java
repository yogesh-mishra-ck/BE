package org.example;

//Product Catalog (with Encapsulation & Exceptions)
//Create a Product class with private fields for id, name, and price.
//Throw a custom exception if price is negative
//Create 3–5 product objects and display their details.

import java.util.ArrayList;
import java.util.Scanner;

class NegativePriceException extends Exception{
    public NegativePriceException(String message){
        super(message);
    }
}

class Product{
    private int id;
    private String name;
    private double price;

    Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice (double price) throws  NegativePriceException {
        if(price < 0)
            throw new NegativePriceException("Price cannot be negative");
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product Name: "+name+"\n"+
                "Product ID: "+id+"\n"+
                "Product Price: "+price+"\n";
    }
}

public class Question19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        for(int i=0; i<2; i++){

            System.out.println("Enter Product Name");
            String productName = sc.next();

            System.out.println("Enter Product ID");
            int pid = sc.nextInt();

            boolean isPricePositive = false;
            Double price;
            while (isPricePositive == false){

                System.out.println("Enter Product Price");
                price = sc.nextDouble();

                try{
                    Product newProduct = new Product();
                    newProduct.setId(pid);
                    newProduct.setName(productName);
                    newProduct.setPrice(price);
                    products.add(newProduct);

                    isPricePositive = true;
                }catch (NegativePriceException e){
                    System.out.println(e.getMessage());
                    System.out.println("Please enter a valid price meaning price must always be greater than or equal to zero");
                }
            }

        }

        for(Product product: products){
            System.out.println(product);
        }
    }
}
