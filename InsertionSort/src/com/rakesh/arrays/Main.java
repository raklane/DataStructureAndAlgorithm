package com.rakesh.arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,45,-22,233,-444};

        int newElement, newPosition;
        for(int unSortedIndex = 1; unSortedIndex<intArray.length; unSortedIndex++){
            newElement = intArray[unSortedIndex];
            newPosition = 0;
            for(int i=unSortedIndex-1; i>=0 ; i--){
                if(intArray[i] < newElement){
                    newPosition = i+1;
                    break;
                }//End if
            }//End for i
            shiftAndReplace(intArray, newPosition, unSortedIndex, newElement);
        }//End for unsortedIndex

        for(int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");

    }//End main

    public static void shiftAndReplace(int[] array, int i, int j, int newElement){
        if(i==j)
            return;
        for(int x = j; x>i; x--){
            array[x] = array[x-1];
        }
        array[i] = newElement;
    }
}
