package Lecture_17_Recursion.Part2;

public class Q6_RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    public static String newString = "";

    public static void removeDuplicates(String str, int index) {
        // Base Case
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (map [currChar - 'a']) {
            removeDuplicates(str, index + 1);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1);
        }
    }

    public static void main(String[] args) {
        removeDuplicates("aaaabbbbcxcccd", 0);
    }
}
