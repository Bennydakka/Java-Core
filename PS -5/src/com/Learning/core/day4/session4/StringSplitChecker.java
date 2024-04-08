package com.Learning.core.day4.session4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSplitChecker {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (canSplitIntoFourDistinctStrings(inputString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Method to check if the given string can be split into four distinct strings
    public static boolean canSplitIntoFourDistinctStrings(String str) {
        // Check if the length of the string is divisible by 4
        if (str.length() % 4 != 0) {
            return false;
        }

        // Create a set to store unique substrings
        Set<String> substrings = new HashSet<>();

        // Calculate the length of each substring
        int substringLength = str.length() / 4;

        // Split the string into four distinct substrings
        for (int i = 0; i < str.length(); i += substringLength) {
            String substring = str.substring(i, i + substringLength);
            substrings.add(substring);
        }

        // Check if the number of unique substrings is 4
        return substrings.size() == 4;
    }
}