package Day8Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//3. Find the First Non-Repeating Character

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList( 1,2,2,4,7,6,1,4,6,9 ));
        //first non-repeating => freq = 1 but the first element with that frequency
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int num: arr){
            frequency.put(num ,frequency.getOrDefault(num, 0)+1);
        }
        int ans=-1;
        for(int num: arr){
           if(frequency.get(num)==1){
               ans=num;
               break;
           }
        }

        System.out.println("The first non repeating element is "+ans);
    }
}
