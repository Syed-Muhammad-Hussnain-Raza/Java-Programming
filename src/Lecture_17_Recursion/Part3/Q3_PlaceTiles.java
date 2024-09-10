package Lecture_17_Recursion.Part3;

public class Q3_PlaceTiles {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically place
        int verticalPlacement = placeTiles(n-m, m);
        // horizontal place
        int horizontalPlacement = placeTiles(n-1, m);

        return verticalPlacement + horizontalPlacement;
    }

    public static void main(String[] args) {
        System.out.println(placeTiles(4, 2));
    }
}
