package Lecture_11_2DArrays;

import java.util.Scanner;

public class InitializeAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        System.out.println(); // for a new line

        int [][] numbers = new int [rows][cols];

        // initializing 2-d array from user
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Enter a number: ");
                numbers[i][j] = sc.nextInt();
            }
        }

        // printing 2d-array
        for (int [] numArray: numbers ) {
            for (int num : numArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
