package Lecture_15_BitManipulation;

import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter position: ");
        int position = sc.nextInt();

        // Step 1 => Bit Mask
        int bitMask = 1 << position;

        // Step 2 => Set bit at given position
        int newNumber = (number | bitMask);

        System.out.println(number + " now become " + newNumber);
    }
}
