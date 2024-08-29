package Lecture_15_BitManipulation;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter position: ");
        int position = sc.nextInt();

        // Step 1 => Bit Mask
        int bitMask = 1 << position;

        // Step 2 => Getting bit at given position
        if ((bitMask & number) == 0) {
            System.out.println("Bit is 0 at position " + position + " for number " + number);
        } else {
            System.out.println("Bit is 1 at position " + position + " for number " + number);
        }
    }
}
