package Lecture_10_Arrays;

import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 2, 2, 9, 10 };
        System.out.print("Enter number to find its index in array: ");
        int toFind = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (toFind == array[i]) {
                System.out.println("Element found at index " + i);
            }
        }
    }
}
