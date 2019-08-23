package com.rakesh.arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {33,-11,-22,77,-66,55,-88};

        quickSort(intArray, 0, intArray.length);

        for (int i: intArray) {
            System.out.print(i + " ");
        }

    }

    public static void quickSort(int[] arr, int start, int end){
        if(end - start < 2)
            return;
        int pivot = arr[start];
        int i = start;
        int j = end;

        while(i<j){
            while(i<j){
                if(arr[--j]<pivot){
                    arr[i++] = arr[j];
                    break;
                }
            }

            while(i<j) {
                if (arr[++i] > pivot) {
                    arr[j--] = arr[i];
                    break;
                }
            }
        }

        arr[i] = pivot;

        quickSort(arr, start, i);
        quickSort(arr, i+1, end);
    }
}
