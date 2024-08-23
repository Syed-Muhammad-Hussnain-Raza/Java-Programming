package Lecture_8_Exercise;

import java.util.Scanner;

public class Question_1 {
    // Enter 3 numbers from the user & make a function to print their average
    public static void calculateAverage(double num1, double num2, double num3) {
        System.out.println("Average: " + ( num1 + num2 + num3 ) / 3) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter 3rd number: ");
        double num3 = sc.nextDouble();

        // call the function
        calculateAverage(num1, num2, num3);
    }
}
