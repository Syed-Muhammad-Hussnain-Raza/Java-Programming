package Lecture_17_Recursion.Part2;

public class Q9_PrintKeypad {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz", " "};

    public static void printKeypad(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printKeypad(str, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        printKeypad("8", 0, "");
    }
}
