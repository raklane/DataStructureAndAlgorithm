package com.rakesh.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[7];

        intArray[0] = 11;
        intArray[1] = -22;
        intArray[2] = 33;
        intArray[3] = -44;
        intArray[4] = 55;
        intArray[5] = -66;
        intArray[6] = 77;

        int index = -1;
        for (int i=0; i<intArray.length; i++){
            if(intArray[i] == 55){
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}
