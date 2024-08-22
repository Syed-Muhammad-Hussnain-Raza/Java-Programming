package Lecture_5_Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        // Hollow Rectangle
        int rows = 4;
        int cols = 5;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == 0 || col == 0 || row == rows - 1 || col == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
