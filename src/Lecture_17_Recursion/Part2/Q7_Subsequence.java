package Lecture_17_Recursion.Part2;

public class Q7_Subsequence {
    public static void subsequence(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        // To Be Included
        subsequence(str, index + 1, newString + currChar);
        // Not included
        subsequence(str, index + 1, newString);
    }

    public static void main(String[] args) {
        subsequence("aaa", 0, "");
    }
}
