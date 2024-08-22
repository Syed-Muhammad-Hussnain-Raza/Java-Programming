package Lecture_5_Patterns;

public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        // Inverted Half Pyramid 180-deg
        int n = 4;

        for (int i = 0; i < n; i++) {
            // inner loop -> spaces
            for (int j = 0; j < (n - 1) - i; j++) {
                System.out.print("  ");
            }
            // inner loop -> stars
            for (int j = 0; j <= i; j++) {
                    System.out.print("* ")   ;
            }
            System.out.println();
        }

    }
}
