package com.Learning.core.day4.session4;

import java.util.Scanner;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int longestPrefixSuffixLength = findLongestPrefixSuffix(inputString);
        System.out.println("Length of the longest prefix which is also a suffix: " + longestPrefixSuffixLength);
    }

    // Method to find the length of the longest prefix which is also a suffix
    public static int findLongestPrefixSuffix(String str) {
        int n = str.length();
        int[] lps = computeLPSArray(str);

        // Length of the longest prefix which is also a suffix
        return lps[n - 1];
    }

    // Method to compute the Longest Prefix Suffix (LPS) array
    public static int[] computeLPSArray(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}