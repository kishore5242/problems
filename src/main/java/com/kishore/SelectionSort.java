package com.kishore;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {3, 7, 8, 2, 9};

        // {3, 7, 8, 2, 9}
        //  i>--------
        //     j>--------  select the smallest
        // swap i with smallest

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
