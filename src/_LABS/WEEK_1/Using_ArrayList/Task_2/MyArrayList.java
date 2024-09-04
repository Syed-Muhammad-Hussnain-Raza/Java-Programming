package _LABS.WEEK_1.Using_ArrayList.Task_2;

import java.util.ArrayList;

public class MyArrayList {
    public ArrayList<Integer> list;

    public MyArrayList(ArrayList<Integer> list) {
        this.list = list;
    }

    // Insert the value at end of the list
    public void addAtEnd(int value) {
        list.add(value);
        System.out.println(value + " added successfully at end of given list");
    }

    // Insert the value at start of the list
    public static void addAtStart(ArrayList<Integer> list, int value) {
        list.addFirst(value);
        System.out.println(value + " added successfully at start of given list");
    }

    // Insert the value after specific value
    public static void insertAfterSpecificValue(ArrayList<Integer> list, int specificVal, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == specificVal) {
                list.set(i, value + 1);
                System.out.println(value + " added successfully after "+ specificVal);
                return;
            }
        }
        System.out.println("Specific value not found in given list");
    }

    // Insert the value before specific value
    public static void insertBeforeSpecificValue(ArrayList<Integer> list, int specificVal, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == specificVal) {
                list.add(i, value);
                System.out.println(value + " added successfully before "+ specificVal);
                return;
            }
        }
        System.out.println("Specific value not found in given list");
    }

    // Display the ArrayList
    public static void displayArrayList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    // Delete value from end of list
    public static void deleteFromEnd(ArrayList<Integer> list, int value) {
        list.remove(list.size() - 1);
        System.out.println(value + " removed successfully from end of list");
    }

    // Delete starting value in a list
    public static void deleteAtStart(ArrayList<Integer> list, int value) {
        list.remove(0);
        System.out.println(value + " removed successfully from start of list");
    }

    // Delete specific value in a list
    public static void deleteSpecificValue(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == value) {
                list.remove(i);
                return;
            }
        }
    }
}
