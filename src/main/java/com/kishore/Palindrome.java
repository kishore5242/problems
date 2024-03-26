package com.kishore;

public class Palindrome {

    public static void main(String[] args) {
        // Malayalam <-> malayalaM
        System.out.println("Is a palindrome?");
        System.out.println(isPalindrome("Malayalam"));
    }

    public static boolean isPalindrome(String str) {
        if(str.isBlank()) {
            return false;
        }
        String reversedString = new StringBuilder(str).reverse().toString();
        return reversedString.equalsIgnoreCase(str);
    }
}
