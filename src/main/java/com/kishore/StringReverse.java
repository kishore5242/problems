package com.kishore;

public class StringReverse {

    public static void main(String[] args) {

        System.out.println("Reversed string:");
        System.out.println(reverse("Kishore"));


    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

}
