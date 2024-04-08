package com.Learning.core.day4.session4;

import java.util.Scanner;

public class SubsequencePrinter {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Subsequences of the string:");
        printAllSubsequences(inputString);
    }

    // Method to print all subsequences of a string
    public static void printAllSubsequences(String str) {
        int n = str.length();
        // Total possible subsequences are 2^n
        int total = (int) Math.pow(2, n);

        // Iterate through all subsequences
        for (int i = 1; i < total; i++) {
            StringBuilder subsequence = new StringBuilder();
            // Check each bit of the binary representation of i
            for (int j = 0; j < n; j++) {
                // If the j-the bit of i is set, append the j-the character of the input string
                if ((i & (1 << j)) > 0) {
                    subsequence.append(str.charAt(j));
                }
            }
            System.out.print(subsequence + ", ");
        }
        System.out.println(); // Move to the next line
    }
}