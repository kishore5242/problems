package com.kishore;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 1, 4, 9, 0, 7};

        int si = 0;
        int ei = arr.length - 1;
        divide(arr, si, ei);

        System.out.println(Arrays.toString(arr));
    }

    private static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mi = si + (ei - si) / 2;
        divide(arr, si, mi);
        divide(arr, mi + 1, ei);
        conquer(arr, si, mi, ei);
    }

    private static void conquer(int[] arr, int si, int mi, int ei) {
        int[] merged = new int[ei - si + 1];
        int ax = si;
        int bx = mi + 1;
        int mx = 0;
        while (ax <= mi && bx <= ei) {
            if (arr[ax] < arr[bx]) {
                merged[mx++] = arr[ax++];
            } else {
                merged[mx++] = arr[bx++];
            }
        }
        while (ax <= mi) {
            merged[mx++] = arr[ax++];
        }
        while (bx <= ei) {
            merged[mx++] = arr[bx++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }


}
