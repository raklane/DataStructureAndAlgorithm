package com.rakesh.arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {11,-22,33,-44,55,-66,77};

        quickSort(intArray, 0, intArray.length);

        for (int i: intArray) {
            System.out.print(i + " ");
        }

    }

    public static void quickSort(int[] arr, int start, int end){
        if(start == end)
            return;
        int pivot = arr[0];
        int i = start;
        int j = end;
//{11,-22,33,-44,55,-66,77};
        while(i<j){
            for(int k=j; k>i;){
                System.out.println("firstloop: " + i + " " + k);
                if(arr[--k]<pivot){
                    System.out.println("firstloop: " + arr[k] + " " + pivot);
                    arr[i] = arr[k];
                    j=k;
                    i++;
                    break;
                }
            }
            System.out.println("out of loop: " + i + " " + j);
            for (int l: arr) {
                System.out.print(l + " ");
            }System.out.println();
            for(int k=i; k<j;) {
                System.out.println("firstloop: " + k + " " + j);
                if (arr[++k] > pivot) {
                    System.out.println("second loop: " + arr[k] + " " + pivot);
                    arr[j] = arr[k];
                    i=k;
                    j--;
                    break;
                }
            }
            System.out.println("out of loop: " + i + " " + j);
            for (int l: arr) {
                System.out.print(l + " ");
            }System.out.println();
        }

        arr[i] = pivot;

        for (int l: arr) {
            System.out.print(l + " ");
        }System.out.println();
        System.out.println("iteration ends");
        quickSort(arr, 0, i);
        quickSort(arr, i+1, end);
    }
}
