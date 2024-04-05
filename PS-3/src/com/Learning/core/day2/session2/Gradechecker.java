package com.Learning.core.day2.session2;

import java.util.Scanner;

public class Gradechecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage obtained by the student: ");
        double percentage = scanner.nextDouble();

        String grade;
        if (percentage >= 60) {
            grade = "A Grade";
        } else if (percentage >= 45) {
            grade = "B Grade";
        } else if (percentage >= 35) {
            grade = "C Grade";
        } else {
            grade = "Fail";
        }

        System.out.println(grade);
    }
}