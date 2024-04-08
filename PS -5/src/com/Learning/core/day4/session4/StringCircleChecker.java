package com.Learning.core.day4.session4;

import java.util.*;

public class StringCircleChecker {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        @SuppressWarnings("unused")
		int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter the strings separated by space: ");
        String[] strings = scanner.nextLine().split(" ");

        if (canFormCircle(strings)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Method to check if the given strings can be chained to form a circle
    public static boolean canFormCircle(String[] strings) {
        Map<Character, List<String>> map = new HashMap<>();
        
        // Populate map with characters as keys and list of strings starting with that character as values
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            map.putIfAbsent(firstChar, new ArrayList<>());
            map.get(firstChar).add(str);
            // If first and last character are different, add the string to the map with last character as key
            if (firstChar != lastChar) {
                map.putIfAbsent(lastChar, new ArrayList<>());
                map.get(lastChar).add(str);
            }
        }

        // Initialize visited set to keep track of visited strings
        Set<String> visited = new HashSet<>();
        // Start with the first string in the array
        String start = strings[0];
        return canFormCircleUtil(start, map, visited);
    }

    // Utility method for DFS traversal to check if the strings can be chained to form a circle
    private static boolean canFormCircleUtil(String curr, Map<Character, List<String>> map, Set<String> visited) {
        char lastChar = curr.charAt(curr.length() - 1);
        visited.add(curr);
        List<String> nextStrings = map.get(lastChar);
        
        // If nextStrings is null or empty, return false
        if (nextStrings == null || nextStrings.isEmpty()) {
            return false;
        }
        
        // Iterate through nextStrings
        for (String next : nextStrings) {
            // If next string is not visited, recursively call canFormCircleUtil with next string
            if (!visited.contains(next)) {
                if (canFormCircleUtil(next, map, visited)) {
                    return true;
                }
            } else if (visited.size() == map.size()) {
                // If all strings are visited and next string is the same as the start string, return true
                return next.charAt(0) == curr.charAt(0);
            }
        }
        visited.remove(curr);
        return false;
    }
}