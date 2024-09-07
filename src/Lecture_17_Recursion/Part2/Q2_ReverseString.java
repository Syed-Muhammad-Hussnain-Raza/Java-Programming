package Lecture_17_Recursion.Part2;

import java.util.Scanner;

public class Q2_ReverseString {
    public static void reverseString(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Reversed string is: ");
        reverseString(str, str.length() - 1);
    }
}
