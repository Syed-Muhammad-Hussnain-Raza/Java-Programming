package Lecture_5_Patterns;

public class FloydTriangle {
    public static void main(String[] args) {
        // Floyd's Triangle
        int n = 5;
        int number = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (number < 10){
                    System.out.print(number++ + "  ");
                } else {
                    System.out.print(number++ + " ");
                }
            }
            System.out.println();
        }
    }
}
