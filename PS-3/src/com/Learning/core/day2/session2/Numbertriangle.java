package com.Learning.core.day2.session2;

import java.util.Scanner;

public class Numbertriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= numRows; i++) {
            // Loop to print the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}