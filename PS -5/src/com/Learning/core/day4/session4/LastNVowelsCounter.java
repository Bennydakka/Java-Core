package com.Learning.core.day4.session4;

import java.util.Scanner;

public class LastNVowelsCounter {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();

        String lastNVowels = getLastNVowels(inputString, n);

        if (lastNVowels != null) {
            System.out.println(lastNVowels);
        } else {
            System.out.println("Mismatch in Vowel Count");
        }
    }

    // Method to count last 'n' vowels in a string
    public static String getLastNVowels(String str, int n) {
        int count = 0;
        StringBuilder lastNVowels = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (isVowel(ch)) {
                lastNVowels.insert(0, ch);
                count++;
                if (count == n) {
                    break;
                }
            }
        }

        if (count == n) {
            return lastNVowels.toString();
        } else {
            return null;
        }
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}