package Lecture_16_Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 4, 5, 10, 6, 2, 9, 0, 3, 1, 7, 8 };

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            // loop started
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j-- ;
            }

            // placement
            array[j + 1] = current ;
        }
        for ( int num : array) {
            System.out.print(num + " ");
        }
    }
}
