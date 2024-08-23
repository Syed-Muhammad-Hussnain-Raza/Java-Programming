package Lecture_8_Exercise;

import java.util.Scanner;

public class Question_2 {
    // Write a function to print the sum of all odd numbers from 1 to n.
    public static void calculateSumForOddNumbers ( int num ) {
        if (num < 1) {
            System.out.println("Invalid! - Number should be greater than 1");
            return;
        }
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i%2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all the odd number from 1 to " + num + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        calculateSumForOddNumbers(num);

        sc.close();
    }
}
