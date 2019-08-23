package com.rakesh.arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {11,-22,33,-44,55,-66,77};
        mergeSort(intArray, 0, intArray.length);

        for (int i:intArray) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end){

        if(end-start < 2)
            return;

        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        if(arr[mid-1] < arr[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArr = new int[end-start];

        while(i<mid && j<end){
            tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start+tempIndex ,mid-i);
        System.arraycopy(tempArr, 0, arr, start, tempIndex);

    }
}
