package Lecture_17_Recursion.Part1;

public class Q2_CalculateSum {
    public static void main(String[] args) {
        printSum(1, 4, 0);
    }

    public static void printSum(int value, int end, int sum ) {
        if (value > end) {
            System.out.println("Sum: " + sum);
            return;
        }
        sum += value;
        printSum(value + 1, end, sum );
    }
}
