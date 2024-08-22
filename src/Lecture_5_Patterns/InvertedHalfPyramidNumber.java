package Lecture_5_Patterns;

public class InvertedHalfPyramidNumber {
    public static void main(String[] args) {
        // Inverted half pyramid with numbers
        int n = 5;

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
