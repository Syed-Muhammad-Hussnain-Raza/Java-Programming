package Lecture_17_Recursion.Part1;

import java.util.Scanner;

public class Q6_PowerUpdate {
    /**
     * This function will calculate power but in less numbers of steps the previous code.
     * @param x is the base here.
     * @param n is the exponent here.
     * @return exponent to the power of base will be calculated and return.
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

        // modification made in previous class code here to decrease number of steps.
        if (n % 2 == 0) {
            return calculatePower(x, n/2) * calculatePower(x, n/2);
        } else  {
            return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
    }

    // Main function used to test our functions.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter a positive exponent: ");
        int exponent = sc.nextInt();

        if (exponent < 0) {
            System.out.println("We not support negative number in exponent yet");
            return;
        }

        System.out.println(calculatePower(base, exponent));
    }
}
