package Lecture_17_Recursion;

import java.util.Scanner;

public class Q4_Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }
}
