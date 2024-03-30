package com.kishore;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 9, 3};

        // {8, 7, 2, 9, 3}
        //  s  us
        //     i>
        // <j
        //     current
        // shift j as long as current is smaller
        // insert current

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >=0 && current < arr[j]) {
                // shift
                arr[j + 1] = arr[j];
                j--;
            }
            // insert
            arr[j + 1] = current;
        }

        System.out.println(Arrays.toString(arr));
    }
}
