package com.rakesh.arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {11,-22,33,-44,55,-66,77};
        int largestIndex;

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0;
                lastUnsortedIndex--){
            largestIndex = 0;
            for(int i=0; i<lastUnsortedIndex; i++){
                if(intArray[largestIndex] < intArray[i+1])
                    largestIndex = i+1;
            }
            swap(intArray, largestIndex, lastUnsortedIndex);
        }

        for(int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");
    }

    public static void swap(int[] array, int i, int j){
        if(array[i] == array[j])
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
