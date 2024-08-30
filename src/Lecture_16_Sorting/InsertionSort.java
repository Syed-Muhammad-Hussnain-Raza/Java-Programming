package Lecture_16_Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 4, 5, 10, 6, 2, 9, 0, 3, 1, 7, 8 };

        insertionSort(array);
        System.out.print("Sorted array: [ ");
        for ( int num : array) {
            System.out.print(num + ", ");
        }
        System.out.print("]");
    }

    // Insertion Sort
    public static void insertionSort(int[] array) {
        // Outer loop started here
        for (int i = 1; i < array.length; i++) {
            int current = array[i]; // i = 5 | current = 9
            int j = i - 1;
            // inner loop started here
            while (j >= 0 && array[j] > current ) {
                array[j + 1] = array[j];
                j-- ;
            }

            // placement
            array[j + 1] = current ;
        }
    }
}
