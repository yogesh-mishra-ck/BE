package org.example;

//Static Utility Class
//Create a MathUtils class with static methods for max, min, and average.
//Call these without creating an object


class MathUtils{
    public static int max(int...numbers){
        int maximumNumber = Integer.MIN_VALUE;
        for(int currentNum: numbers){
            if(currentNum > maximumNumber)
                maximumNumber = currentNum;
        }
        return maximumNumber;
    }
    public static int min(int... numbers){
        int minimumNumber = Integer.MAX_VALUE;

        for(int currentNum: numbers){
            if(currentNum < minimumNumber)
                minimumNumber = currentNum;
        }
        return minimumNumber;
    }
    public static double average(int ...numbers){
        int count=0;
        int sum = 0;

        for(int currentNum: numbers){
            count++;
            sum+= currentNum;
        }
        return sum/(double)count;
    }
}
public class Question9 {
    public static void main(String[] args) {
        int maximumValue = MathUtils.max(3,1,2,-221,92382832,2121,-2434343);
        int minimumValue = MathUtils.min(3,1,2,-221,92382832,2121,-2434343);
        double average = MathUtils.average(232,2,12,9,78,67,48,59);

        System.out.println("Maximum element is: "+maximumValue);
        System.out.println("Minimum element is: "+minimumValue);
        System.out.println("Average of numbers is: "+average);
    }
}
