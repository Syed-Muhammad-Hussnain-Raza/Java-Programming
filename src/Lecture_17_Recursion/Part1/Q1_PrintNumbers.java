package Lecture_17_Recursion.Part1;

public class Q1_PrintNumbers {
    /**
     * Recursive function will print numbers in ascending order from n to 10.
     * @param num is the number from which the order start to meet 10.
     */
    public static void printAscendingNumbers(int num) {
        if (num > 10) {
            System.out.println();
            return;
        }
        System.out.print(num + " ");
        printAscendingNumbers(num + 1);
    }

    /**
     * Recursive function will print numbers in descending order from n to 1.
     * @param num is the number from which the order start to meet 1.
     */
    public static void printDescendingNumbers(int num) {
        if (num <= 0) {
            System.out.println();
            return;
        }

        System.out.print(num + " ");
        printDescendingNumbers(num - 1);
    }

    public static void main(String[] args) {
        printAscendingNumbers(1);
        printDescendingNumbers(10);
    }
}
