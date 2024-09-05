package _LABS.WEEK_1.UsingArray.Task_3;

import _LABS.WEEK_1.UsingArray.Task_2.MyArrayList;

import java.util.Scanner;

public class Main {
    int[] array = {1, 2, 3, 4, 5};
    MyArrayList list = new MyArrayList(array);

    /**
     * This program have to find value in array and return its index, -1 in case of not found.
     * @param value to find.
     * @return index of value if found or -1 if not found.
     */
    private int linearSearch(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to search in array: ");
        int value = sc.nextInt();

        int index = main.linearSearch(value);
        if (index != -1) {
            System.out.println(value + " found at index " + index);
        } else {
            System.out.println("Value not found in array");
        }

    }
}
