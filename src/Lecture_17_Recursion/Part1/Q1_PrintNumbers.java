package Lecture_17_Recursion.Part1;

public class Q1_PrintNumbers {
    public static void main(String[] args) {
        printAscendingNumbers(1);
        printDescendingNumbers(5);
    }

    public static void printAscendingNumbers(int num) {
        if (num > 5) {
            return;
        }
        System.out.println(num);
        printAscendingNumbers(num + 1);
    }

    public static void printDescendingNumbers(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        printDescendingNumbers(num - 1);
    }
}
