package Lecture_8_Exercise;

import java.util.Scanner;

public class Question_8 {
    // Two numbers are entered by the user, x and n. Write a function to find the value of one number
    // raised to the power of another i.e. x^n.

    public static double power (double base, int exponent) {
        double output = 1;

        for (int i = 1; i <= exponent; i++) {
            output *= base;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        System.out.printf("%.2f", power(base, exponent));
    }
}
