package com.kishore;

public class Factorial {
    public static void main(String[] args) {

        // 5 * 4 * 3 * 2 * 1

        System.out.println("Factorial:");
        System.out.println(factorial(4));
        System.out.println(factorialRecursive(4));
    }

    public static int factorial(int num) {
        int result = num;
        for (int i = num - 1; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static int factorialRecursive(int num) {
        // exit condition
        if(num == 0) {
            return 1;
        }
        // recursion
        return num * factorialRecursive(num - 1);
    }
}