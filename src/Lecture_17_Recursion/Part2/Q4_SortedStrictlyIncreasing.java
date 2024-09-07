package Lecture_17_Recursion.Part2;

public class Q4_SortedStrictlyIncreasing {
    public static boolean isStrictlyIncreasing(int[] array, int index){
        // Base Case
        if (index == array.length - 1) {
            return true;
        }

        if (array[index] >= array[index + 1]) {
            // array is un-sorted
            return false;
        }

        return isStrictlyIncreasing(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        boolean result = isStrictlyIncreasing(array, 0);
        System.out.println("Is array strictly sorted? " + result);
    }
}
