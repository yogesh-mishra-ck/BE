package org.example;

//Constructor Overloading
//Create a Car class with overloaded constructors — one that sets only the model name and another that sets model and price.


class Car{
    public String modelName;
    public int price;

    public Car(String modelName){
        this.modelName = modelName;
    }

    public Car(String modelName, int price){
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Car model: "+modelName+"\n"+
                "Price: Rs."+price;
    }
}

public class Question11 {
    public static void main(String[] args) {
        Car car = new Car("Mercedes Benz");
        Car car2 = new Car("Bugatti Chiron", 284000000);

        System.out.println(car);
        System.out.println(car2);
    }
}
