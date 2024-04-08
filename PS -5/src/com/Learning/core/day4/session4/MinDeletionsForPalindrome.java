package com.Learning.core.day4.session4;

import java.util.Scanner;

public class MinDeletionsForPalindrome {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int minDeletions = findMinDeletionsForPalindrome(inputString);
        System.out.println("Minimum number of deletions to make the string palindrome: " + minDeletions);
    }

    // Method to find the minimum number of deletions to make a string palindrome
    public static int findMinDeletionsForPalindrome(String str) {
        // Length of the longest palindromic subsequence
        int longestPalindromeLength = findLongestPalindromicSubsequenceLength(str);
        // Minimum number of deletions = length of string - length of longest palindromic subsequence
        return str.length() - longestPalindromeLength;
    }

    // Method to find the length of the longest palindromic subsequence
    public static int findLongestPalindromicSubsequenceLength(String str) {
        // Reversing the input string
        String reversedStr = new StringBuilder(str).reverse().toString();
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        // Computing longest common subsequence using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == reversedStr.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][n];
    }
}