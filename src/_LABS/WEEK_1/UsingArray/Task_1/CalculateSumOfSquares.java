package _LABS.WEEK_1.UsingArray.Task_1;

import java.util.Scanner;

public class CalculateSumOfSquares {

    // Write down a program that find ∑(X^2), where input for X and starting and stopping value is entered by the user
    public static void calculateSumOfSquares(int value, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += calculateSquare(value);
        }

        System.out.println("Calculated Sum: " + sum);
    }

    // Calculate square for given value
    public static int calculateSquare(int val) {
        return val * val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value whose square want to added: ");
        int value = sc.nextInt();
        System.out.print("Enter start value: ");
        int start = sc.nextInt();
        System.out.print("Enter end value: ");
        int end = sc.nextInt();

        calculateSumOfSquares(value, start, end);
    }
}
