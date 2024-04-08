package com.Learning.core.day4.session4;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display length of the string
        System.out.println("Length of the string: " + inputString.length());

        // Display string in uppercase
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // Check if it's a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}