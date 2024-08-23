package Lecture_8_Exercise;

import java.util.Scanner;

public class Question_4 {
    // Write a function that takes in the radius as input and returns the circumference of a circle
    public static double calculateCircumference ( double radius ) {
        return (2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("%.2f", calculateCircumference(radius));
    }
}
