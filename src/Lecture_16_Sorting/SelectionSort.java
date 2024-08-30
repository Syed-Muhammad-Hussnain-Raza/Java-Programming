package Lecture_16_Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        // an array with random numbers
        int[] array = {4, 5, 10, 6, 2, 9, 0, 3, 1, 7, 8};

        // Selection Sort
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j] ) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
