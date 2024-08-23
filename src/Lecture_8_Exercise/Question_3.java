package Lecture_8_Exercise;

public class Question_3 {
    // Write a function which takes in 2 numbers and returns the greater of those two
    public static double greaterNumber(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // Our main function
    public static void main(String[] args) {
        System.out.println(greaterNumber(12, 12));
    }
}
