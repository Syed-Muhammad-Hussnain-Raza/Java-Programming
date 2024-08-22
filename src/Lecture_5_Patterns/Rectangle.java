package Lecture_5_Patterns;

public class Rectangle {
    public static void main(String[] args) {
       // Rectangle
        int rows = 4;
        int cols = 5;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
