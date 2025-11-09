package Day8Collections;

//5. You are given two sorted ArrayLists<Integer>. Merge them into a single sorted list.

import java.util.ArrayList;
import java.util.Arrays;

public class Question5 {
    public static ArrayList<Integer> mergeList(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> ansList = new ArrayList<>();
        int array1Index = 0;
        int array2Index = 0;

        int array1Length = arr1.size();
        int array2Length = arr2.size();

        while(array1Index < array1Length && array2Index<array2Length){
            if(arr1.get(array1Index) < arr2.get(array2Index)){
                ansList.add(arr1.get(array1Index));
                array1Index++;
            }else{
                ansList.add(arr2.get(array2Index));
                array2Index++;
            }
        }

        while(array1Index < array1Length){
            ansList.add(arr1.get(array1Index));
            array1Index++;
        }

        while(array2Index < array2Length){
            ansList.add(arr2.get(array2Index));
            array2Index++;
        }
        return ansList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,3,5,7,9,11,13));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2,4,6,8,10,12,13,14,32,45));

        ArrayList<Integer> listMerged = mergeList(arr1, arr2);
        for(int num: listMerged){
            System.out.print(num+" ");
        }
    }
}
