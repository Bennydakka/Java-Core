package com.Learning.core.day3.session3;

import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers in the range from 1 to 40:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] array = {7, 25, 5, 19, 30};

        boolean foundNum1 = false;
        boolean foundNum2 = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                foundNum1 = true;
            }
            if (array[i] == num2) {
                foundNum2 = true;
            }
        }

        if (foundNum1 && foundNum2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Not Found Its Bingo");
        }
    }
}
