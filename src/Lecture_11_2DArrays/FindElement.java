package Lecture_11_2DArrays;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        int [][] matrixOfNumbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // find indices in 2d-array
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find: ");
        int toFind = sc.nextInt();

        // print
        for (int i = 0; i < matrixOfNumbers.length ; i++) {
            for (int j = 0; j < matrixOfNumbers[i].length; j++) {
                if (toFind == matrixOfNumbers[i][j]) {
                    System.out.println("Element found at matrixOfNumbers["+i+"]"+"["+j+"]");
                }
            }
        }
    }
}
