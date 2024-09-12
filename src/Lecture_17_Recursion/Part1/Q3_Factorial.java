package Lecture_17_Recursion.Part1;

import java.util.Scanner;

public class Q3_Factorial {

    /**
     * Recursive function to calculate factorial of given positive integer number.
     * @param n is the number whose factorial is to be calculated.
     * @return will be calculated factorial of given number.
     */
    public static int factorial(int n) {
        // base case
        if (n == 1 || n == 0) {
            return 1;
        }

        // recursive call to function
        return n * factorial(n - 1);
    }

    // Main Function to test our methods and functions.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if ( num < 0 ) {
            System.out.println("Factorial of negative number is not possible");
            return;
        }
        System.out.println("Factorial of " + num +" is: "+ + factorial(num));
    }

}
