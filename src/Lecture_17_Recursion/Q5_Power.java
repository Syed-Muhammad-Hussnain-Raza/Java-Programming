package Lecture_17_Recursion;

import java.util.Scanner;

public class Q5_Power {
    // Recursive function
    public static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        return x * calculatePower(x, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int x = sc.nextInt();

        System.out.print("Enter a positive exponent: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("We not support negative number in exponent yet");
            return;
        }

        int data = calculatePower(x, n);

        System.out.println(x + " raised to power " + n + " is " + data);
    }
}