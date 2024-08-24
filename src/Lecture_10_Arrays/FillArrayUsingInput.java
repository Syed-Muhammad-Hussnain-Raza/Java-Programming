package Lecture_10_Arrays;

import java.util.Scanner;

public class FillArrayUsingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int [] marksArray = new int[size];

        for (int i = 0; i < marksArray.length; i++) {
            System.out.print("Enter marks for student " + (i+1) + ": ");
            marksArray[i] = sc.nextInt();
        }

        System.out.println("\nMarks for students");
        for (int i = 0; i < marksArray.length; i++) {
            System.out.println("Student " + (i + 1) +": " + marksArray[i]);
        }
    }
}
