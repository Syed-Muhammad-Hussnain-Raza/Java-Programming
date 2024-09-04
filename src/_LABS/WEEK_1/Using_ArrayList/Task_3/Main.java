package _LABS.WEEK_1.Using_ArrayList.Task_3;

import _LABS.WEEK_1.Using_ArrayList.Task_2.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    MyArrayList myArrayList = new MyArrayList(newList);

    // Linear search method
    public int linearSearch(int value) {
        for (int i = 0; i < myArrayList.list.size(); i++) {
            if (value == myArrayList.list.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find in array list: ");
        int value = sc.nextInt();

        int index = m.linearSearch(value);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}
