package Lecture_17_Recursion;

import java.util.Scanner;

public class Q5_ReverseString {
    public static String reverseString(String str) {
        if (str.isEmpty()) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println("Reversed string is " + reversed);
    }
}
