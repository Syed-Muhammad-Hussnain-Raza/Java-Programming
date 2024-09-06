package Lecture_17_Recursion.Part1;

import java.util.Scanner;

public class Q6_PowerUpdate {
    public static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calculatePower(x, n/2) * calculatePower(x, n/2);
        } else  {
            return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
    }

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
