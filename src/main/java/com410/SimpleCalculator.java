package com410;

import java.util.Scanner;

public class SimpleCalculator {
    // Method to read two integers from the user
    public static int[] readNumbers(Scanner input) {
        int[] numbers = new int[2];
        System.out.print("Enter first number: ");
        numbers[0] = input.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = input.nextInt();
        return numbers;
    }

    // Method to calculate sum
    public static int add(int a, int b) {return a + b;}
    // Method to calculate subtraction
    public static int subtract(int a, int b) {return a - b;}
    // Method to calculate multiplication
    public static int multiply(int a, int b) {return a * b;}
    // Method to calculate division; assume b != 0 for this simple scenario
    public static int divide(int a, int b) {return a / b;}
    // Method to calculate modulus (remainder after division)
    public static int modulus(int a, int b) {return a % b;}

    // main method placed last for readability
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1) Read numbers from user
        int[] numbers = readNumbers(input);
        int x = numbers[0];
        int y = numbers[1];

        // 2) Call calculation methods
        int sum = add(x, y);
        int difference = subtract(x, y);
        int product = multiply(x, y);
        int quotient = divide(x, y);
        int mod = modulus(x, y);

        // 3) Print results (kept in main)
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Modulus = " + mod);
    }
}

