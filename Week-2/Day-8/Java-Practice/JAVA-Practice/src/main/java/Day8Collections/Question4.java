package Day8Collections;

import java.util.*;

//4. Given an array of integers and a target sum, return the indices of the two numbers that add up to the target

public class Question4 {
    public static void targetSumIndices(ArrayList<Integer> arr, int targetSum){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int index=0; index < arr.size(); index++){
            mp.put(arr.get(index), index);
        }

        for(int index=0; index < arr.size(); index++){
            if(mp.containsKey(targetSum-arr.get(index))){
                int ans1 = index;
                int ans2 = mp.getOrDefault(targetSum-arr.get(index), -1);
                System.out.println("The number "+targetSum+" is a sum of the numbers "+arr.get(ans1)+" with index "+ans1+" and number "+arr.get(ans2)+" with index "+ans2);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,4,57,7,9,23,78));
        int targetSum = 12;

        targetSumIndices(arr, targetSum);
    }
}
