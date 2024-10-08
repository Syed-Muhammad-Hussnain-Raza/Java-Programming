package Lecture_16_Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        // an array with random numbers
        int[] array = {4, 5, 10, 6, 2, 9, 0, 3, 1, 7, 8};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int num : array) {
            System.out.print( num + " " );
        }
    }
}
