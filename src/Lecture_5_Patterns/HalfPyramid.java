package Lecture_5_Patterns;

public class HalfPyramid {
    public static void main(String[] args) {
        // Half Pyramid
        int rows = 4;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
