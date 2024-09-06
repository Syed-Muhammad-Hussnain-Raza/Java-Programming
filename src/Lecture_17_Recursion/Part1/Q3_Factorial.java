package Lecture_17_Recursion.Part1;

import java.util.Scanner;

public class Q3_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if ( num < 0 ) {
            System.out.println("Factorial of negative number is not possible");
            return;
        }
        System.out.println("Factorial of " + num +" is: "+ + factorial(num));
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
