package Lecture_8_Exercise;

import java.util.Scanner;

public class Question_7 {
    // Write a program to enter the numbers till the user wants and at the end it should display
    // the count of positive, negative and zeros entered.
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zeroes   = 0;

        Scanner scanner = new Scanner(System.in);
        int input ;

        do {
            System.out.print("Enter any number but -197 to exit: ");
            input = scanner.nextInt();

            if (input > 0) {
                positive++;
            } else if (input == 0) {
                zeroes++;
            } else {
                if (input != -197) {
                    negative++;
                }
            }
        } while (input != -197);

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeroes  : " + zeroes);
    }
}
