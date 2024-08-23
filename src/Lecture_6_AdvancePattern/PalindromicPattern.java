package Lecture_6_AdvancePattern;

public class PalindromicPattern {
    public static void main(String[] args) {
        // Palindrome Pyramid
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Palindrome 1st Part
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }

            // Palindrome 2nd Part
            for (int j = 2; j <= i ; j++) {
                System.out.print(j  + " ");
            }

            System.out.println();
        }
    }
}
