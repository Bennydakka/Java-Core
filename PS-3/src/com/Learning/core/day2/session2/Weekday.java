package com.Learning.core.day2.session2;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7 representing the day of the week: ");
        int dayOfWeek = scanner.nextInt();

        String weekday;
        if (dayOfWeek == 1) {
            weekday = "Sunday";
        } else if (dayOfWeek == 2) {
            weekday = "Monday";
        } else if (dayOfWeek == 3) {
            weekday = "Tuesday";
        } else if (dayOfWeek == 4) {
            weekday = "Wednesday";
        } else if (dayOfWeek == 5) {
            weekday = "Thursday";
        } else if (dayOfWeek == 6) {
            weekday = "Friday";
        } else if (dayOfWeek == 7) {
            weekday = "Saturday";
        } else {
            weekday = "Invalid Input";
        }

        System.out.println(weekday);
    }
}