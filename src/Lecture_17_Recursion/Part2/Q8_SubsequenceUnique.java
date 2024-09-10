package Lecture_17_Recursion.Part2;

import java.util.HashSet;

public class Q8_SubsequenceUnique {
    public static void uniqueSubsequence(String str, int index, String newString, HashSet<String> hashSet) {
        if (index == str.length()) {
            if (hashSet.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                hashSet.add(newString);
                return;
            }
        }

        char currChar = str.charAt(index);

        // To Be Included
        uniqueSubsequence(str, index + 1, newString + currChar, hashSet);
        // Not included
        uniqueSubsequence(str, index + 1, newString, hashSet);
    }

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        uniqueSubsequence("aaa", 0, "", hashSet);
    }
}
