package Lecture_17_Recursion.Part3;

import java.util.ArrayList;

public class Q5_SubsetsOfFirstNaturalNumbers {
    // print an array list
    private static void printSubset(ArrayList<Integer> arrayList) {
        System.out.print("( ");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println(")");
    }

    /**
     * This function will print subset of first n natural numbers using recursion.
     * @param n is the natural number and subsets will be from 1 to that number.
     * @param subset is an arraylist used to store subsets of given natural numbers.
     */
    public static void findSubsets(int n, ArrayList<Integer> subset) {
        // base case
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // will be added
        subset.add(n);
        findSubsets(n - 1, subset);

        // willing to not added
        subset.removeLast();
        findSubsets(n - 1, subset);
    }


    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();

        findSubsets(n, subset);
    }
}
