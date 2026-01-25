package com410;

public class NumberUtils {

    // Returns true if the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Returns the sum of two integers
    public static int add(int a, int b) {
        return a + b;
    }

    public static Integer safeDivide(int a, int b) {
        if (b == 0) {
            return null;   // undefined mathematical operation
        }
        return a / b;
    }
}


