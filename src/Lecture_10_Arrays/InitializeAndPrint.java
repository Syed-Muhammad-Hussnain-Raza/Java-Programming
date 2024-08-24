package Lecture_10_Arrays;

public class InitializeAndPrint {
    // Arrays in Java
    public static void main(String[] args) {
    // Initializing array
        // Method# 1
        int size = 5;
        int [] marksArr1 = new int[size]; // new int[size]

        for (int i = 0; i < marksArr1.length; i++) {
            marksArr1[i] = (i + 1) * 2;
        }

        // Method# 2
        int [] marksArr2 = {1, 2, 3, 4, 5};

    // Printing array
        // 1 - for loop
        for (int i = 0; i < marksArr1.length; i++) {
            System.out.println("marksArr1[" + i + "]" + " = " + marksArr1[i]);
        }
        // 2 - for each loop
        for (int num : marksArr2) {
            System.out.println(num);
        }
    }
}
