package Lecture_5_Patterns;

public class Triangle_01 {
    public static void main(String[] args) {
        // 0-1 Triangle
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ( (i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
