package com.kishore;

public class Fibonacci {

    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13 21

        System.out.println("Fibonacci:");
        fibonacci(10);
        System.out.println();
        System.out.print(0 + " " + 1 + " ");
        fibonacciRecursive(0, 1, 10);

    }

    public static void fibonacci(int count) {
        int num1 = 0, num2 = 1, fib;

        System.out.print(num1 + " " + num2);
        // count times
        for(int i = 0; i < count; i++) {
            fib = num1 + num2;
            System.out.print(" " + fib);
            num1 = num2;
            num2 = fib;
        }
    }

    public static void fibonacciRecursive(int num1, int num2, int count) {
        // exit condition
        if(count <= 0) {
            return;
        }

        // recursion
        int result = num1 + num2;
        count = count - 1;
        System.out.print(result + " ");
        fibonacciRecursive(num2, result, count);
    }

}
