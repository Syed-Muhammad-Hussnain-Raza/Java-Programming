package Lecture_17_Recursion.Part3;

public class Q1_PrintAllPermutations {
    public static void printPermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newString = str.substring(0, i) + str.substring(i+1);

            printPermutations(newString, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        printPermutations("abc", "");
    }
}
