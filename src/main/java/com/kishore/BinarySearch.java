package com.kishore;

import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 8, 10, 33, 56, 78, 88, 99};
        int num = 88;

        // first and last index
        // take the mid
        // num > mid ------ take the second half of the array
        // num < mid ------ take the first half of the array
        // num == mid ------ found it

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        binarySearch(arr, num, firstIndex, lastIndex);
    }

    private static void binarySearch(int[] arr, int num, int firstIndex, int lastIndex) {
        int mid = (firstIndex + lastIndex) / 2;
        if(num > arr[mid]) {
            firstIndex = mid + 1;
            binarySearch(arr, num, firstIndex, lastIndex);
        } else if (num < arr[mid]) {
            lastIndex = mid - 1;
            binarySearch(arr, num, firstIndex, lastIndex);
        } else {
            System.out.println("Found the number at " + mid);
            // exit
            return;
        }
    }
}
