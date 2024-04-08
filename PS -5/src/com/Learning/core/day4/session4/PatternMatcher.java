package com.Learning.core.day4.session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PatternMatcher {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dictionary strings separated by space: ");
        String[] dictionary = scanner.nextLine().split(" ");
        
        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        List<String> matchedStrings = findMatchingStrings(dictionary, pattern);

        System.out.println("Matched strings:");
        for (String str : matchedStrings) {
            System.out.print(str + " ");
        }
    }

    // Method to find all strings in the dictionary that match the pattern
    public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
        List<String> matchedStrings = new ArrayList<>();
        String patternCode = generatePatternCode(pattern);

        for (String str : dictionary) {
            if (generatePatternCode(str).equals(patternCode)) {
                matchedStrings.add(str);
            }
        }

        return matchedStrings;
    }

    // Method to generate a pattern code for a given string
    public static String generatePatternCode(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        StringBuilder patternCode = new StringBuilder();
        int count = 1;

        for (char ch : str.toCharArray()) {
            if (!charMap.containsKey(ch)) {
                charMap.put(ch, count++);
            }
            patternCode.append(charMap.get(ch));
        }

        return patternCode.toString();
    }
}