package org.example;

//Static Counter
//Create a class where every time an object is created, a static counter increases.
//Print how many objects have been created.

class MyProduct{
    public String productName;
    public int productPrice;
    public String productType;

    public static int counter;
    public MyProduct(String productName, int productPrice, String productType){
        counter++;

        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    @Override
    public String toString(){
        return  "Product Name: "+productName+"\n"+
                "Product Price: " +productPrice+"\n"+
                "Product Type: "+productType+"\n";
    }
}
public class Question8 {
    public static void main(String[] args) {
        MyProduct p1 = new MyProduct("Laptop", 80000, "Electronics");
        MyProduct p2 = new MyProduct("Sofa", 15000, "Home Appliances");
        MyProduct p3 = new MyProduct("Shoes", 3500, "Footwear");

        System.out.println("Total no of products: "+MyProduct.counter);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
