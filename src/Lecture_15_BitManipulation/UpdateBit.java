package Lecture_15_BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter position: ");
        int position = sc.nextInt();

        System.out.print("Enter operation, 0 or 1 only: ");
        int choice = sc.nextInt();

        // Step 1 => Bit Mask
        int bitMask = 1 << position;

        // Step 2 => Updating bit value for given position and state
        int newNumber;

        while (true) {
            if (choice == 1) {
                newNumber = (number | bitMask);
                break;
            } else if (choice == 0) {
                newNumber = (number) & ~(bitMask);
                break;
            }
            System.out.print("Enter operation, 0 or 1 only: ");
            choice = sc.nextInt();
        }

        System.out.println("New number is: " + newNumber);
    }
}
