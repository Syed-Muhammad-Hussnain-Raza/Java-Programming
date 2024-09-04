package _LABS.WEEK_1.Using_ArrayList.Task_1;

import java.util.Scanner;

public class SumOfSquares {
    // Write down a program that find ∑X2, where input for X and starting and stopping value is entered by
    // the user

    public static void calculateSum(int value, int start, int end) {
        int sum = 0;
        // Calculate Sum
        for (int i = start; i < end; i++) {
            sum += value * value;
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        System.out.print("Enter starting value: ");
        int start = sc.nextInt();
        System.out.print("Enter starting value: ");
        int end = sc.nextInt();

        calculateSum(value, start, end);
    }
}
