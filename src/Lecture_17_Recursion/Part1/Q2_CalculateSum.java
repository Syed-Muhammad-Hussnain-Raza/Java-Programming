package Lecture_17_Recursion.Part1;

public class Q2_CalculateSum {

    int sum = 0;

    /**
     * This function will calculate the sum between two integer numbers
     * @param value is the value to be added in sum until end reach.
     * @param end is the value on which our function will terminate.
     */
    public void printSum(int value, int end ) {
        if (value > end) {
            System.out.println("Sum: " + sum);
            return;
        }
        sum += value;
        printSum(value + 1, end );
    }

    /**
     * Main/Test function, This function will run first when run button is presses.
     * @param args is the of String type pass to main by default
     */
    public static void main(String[] args) {
        Q2_CalculateSum calc = new Q2_CalculateSum();

        calc.printSum(1, 4);
    }

}
