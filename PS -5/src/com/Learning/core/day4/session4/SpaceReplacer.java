package com.Learning.core.day4.session4;

import java.util.Scanner;

public class SpaceReplacer {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String replacedString = replaceSpaces(inputString);
        System.out.println("Replaced string: " + replacedString);
    }

    // Method to replace all spaces in a string with '%20'
    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}