package Lecture_8_Exercise;

import java.util.Scanner;

public class Question_5 {
    // Write a function that takes in age as input and returns if that person is eligible to vote or not.
    // A person of age > 18 is eligible to vote.

    public static boolean eligibilityChecker ( int age ) {
        if (age < 1 ) {
            System.out.println("Invalid Age Entered!");
        }
        return age > 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        boolean condition =  eligibilityChecker(age);

        if (condition) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
