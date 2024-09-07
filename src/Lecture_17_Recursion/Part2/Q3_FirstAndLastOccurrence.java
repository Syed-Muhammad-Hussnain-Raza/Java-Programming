package Lecture_17_Recursion.Part2;

import java.util.Scanner;

public class Q3_FirstAndLastOccurrence {
    public static int first = -1;
    public static int last  = -1;

    public static void findFirstAndLastOccurrence(char charToFind, int index, String str) {
        // Check
        if (str.isEmpty()) {
            System.out.println("Empty String");
            return;
        }
        // Base Case
        if (index == str.length()) {
            if (first == -1) {
                System.out.println(charToFind + " not found in the given string.");
                return;
            }

            if (last == -1) {
                System.out.println("First occurrence of "+ charToFind +" is at index: " + first);
                System.out.println("There is only one occurrence of "+charToFind+" at: "+ first);
                return;
            }
            System.out.println("First occurrence of "+ charToFind +" is at index: " + first);
            System.out.println("Last  occurrence of "+ charToFind +" is at index: " + last );
            return;
        }

        char currChar = str.charAt(index);

         if (currChar == charToFind) {
             if (first == -1) {
                 first = index;
             } else {
                 last = index;
             }
         }
         // Recursive Call
         findFirstAndLastOccurrence(charToFind, index + 1, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character you want to find: ");
        char charToFind = sc.next().charAt(0); sc.nextLine();

        System.out.print("String in which you want to find: ");
        String str = sc.nextLine();

        System.out.println(); // New Line
        findFirstAndLastOccurrence(charToFind, 0, str);
    }
}
