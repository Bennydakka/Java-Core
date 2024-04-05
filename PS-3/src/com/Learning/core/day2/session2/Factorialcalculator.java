package com.Learning.core.day2.session2;

import java.util.Scanner;

public class Factorialcalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        int factorial = 1;
        
        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Print the result
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}