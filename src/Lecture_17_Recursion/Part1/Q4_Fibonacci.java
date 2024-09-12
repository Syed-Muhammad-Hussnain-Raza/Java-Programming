package Lecture_17_Recursion.Part1;

import java.util.Scanner;

public class Q4_Fibonacci {

    /**
     * This function will print the fibonacci series for given number.
     * @param firstTerm is the first term of series that will be 0 at start.
     * @param secondTerm is the second term of series that will be 1 at start.
     * @param n is the number whose fibonacci series we have to print.
     */
    public static void printFibonacci(int firstTerm, int secondTerm, int n) {
        // base case
        if (n <= 0) {
            return;
        }

        int c = firstTerm + secondTerm;
        System.out.print(c + " ");

        // recursive call to function.
        printFibonacci(secondTerm, c, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " ");
        System.out.print(secondTerm + " ");

        printFibonacci(firstTerm, secondTerm, n - 2);
    }
}
