package com.rakesh.arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {11,-22,33,-44,55,-66,77};

        int newElement;
        for(int unsortedArray = 1; unsortedArray<intArray.length ; unsortedArray++){

            newElement = intArray[unsortedArray];
            int i;
            for(i = unsortedArray; i>0 && intArray[i-1]>newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;

        }

        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");

    }
}
