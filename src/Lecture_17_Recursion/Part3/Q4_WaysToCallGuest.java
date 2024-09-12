package Lecture_17_Recursion.Part3;

public class Q4_WaysToCallGuest {
    public static int calculateGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int way1 = calculateGuests(n-1);

        // pair
        int way2 = (n-1) * calculateGuests(n-2);
        return way1 + way2;
    }

    public static void main(String[] args) {
        System.out.println(calculateGuests(4));
    }
}
