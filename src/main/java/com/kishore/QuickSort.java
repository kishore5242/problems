package com.kishore;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 8, 3, 5};
        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // {6, 3, 7, 2, 4}
        //              p
        //  4, 3, 7, 2, 6
        //
        int pivot = high;
        for(int j=low; j<high; j++) {
            if(arr[j] > arr[pivot]) {
                if(j < pivot) {
                    int temp = arr[j];
                    arr[j] = arr[pivot];
                    arr[pivot] = temp;
                    pivot = j;
                }
            } else {
                if(j > pivot) {
                    int temp = arr[j];
                    arr[j] = arr[pivot];
                    arr[pivot] = temp;
                    pivot = j;
                }
            }
        }
        return pivot;
    }

}
