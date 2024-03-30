package com.kishore;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 6, 2, 8, 9, 1, 0, 3};

        // {4, 6, 2, 8, 9, 1, 0, 3}
        //  i>
        //     j>----------------- select the smallest
        // swap i with the smallest

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
