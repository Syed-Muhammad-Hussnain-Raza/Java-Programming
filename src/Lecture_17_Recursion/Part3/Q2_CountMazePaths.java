package Lecture_17_Recursion.Part3;

public class Q2_CountMazePaths {
    public static int calculatePaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n-1 && j == m-1) {
            return 1;
        }

        // Move downwards
        int downPaths = calculatePaths(i+1, j, n, m);

        // Move rightwards
        int rightPath = calculatePaths(i, j+1, n, m);

        return downPaths + rightPath;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = calculatePaths(0, 0, n, m);

        System.out.println(totalPaths);
    }
}
