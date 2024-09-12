package Lecture_17_Recursion.Part1;

import java.util.Scanner;

public class Q5_Power {
    /**
     * This function will calculate power for given exponent to the base.
     * @param x is base here.
     * @param n is exponent of base here
     * @return calculation of base to the power exponent will be return.
     */
    public static int calculatePower(int x, int n) {
        // base case 1:
        if (n == 0) {
            return 1;
        }
        // base case 2:
        if (x == 0) {
            return 0;
        }

        // recursive call to function
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
