package Lecture_17_Recursion.Part1;

import java.util.Scanner;

public class Q4_Fibonacci {

    public static void printFibonacci(int a, int b, int n) {
        if (n <= 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        printFibonacci(b, c, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        printFibonacci(a, b, n - 2);
    }
}
