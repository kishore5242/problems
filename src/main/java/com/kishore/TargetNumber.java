package com.kishore;

public class TargetNumber {
    public static void main(String[] args) {
        // [12, 1, 15, 3, 5, 9, 4]
        // targetNumber = 20
        // add any two numbers to get 20?
        int[] arr = {12, 1, 15, 3, 5, 9, 4};
        System.out.println("Can two number add up to give the target number?");
        System.out.println(canGetTargetNumber(arr, 20));

    }

    public static boolean canGetTargetNumber(int[] arr, int targetNumber) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (targetNumber == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                    return true;
                }
            }
        }
        return false;
    }
}

