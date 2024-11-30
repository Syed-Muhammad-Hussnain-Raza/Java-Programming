public class Searching {
    int[] array;

    public Searching(int size) {
        array = new int[size];
    }

    public int linearSearch(int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println(key + " found at index " + i);
                return i;
            }
        }

        System.out.println(key + " not found");
        return -1;
    }

    public int linearRecursiveSearch(int key) {
        return linearRecHelper(key, 0);
    }

    private int linearRecHelper(int key, int index) {
        if (index == array.length) {
            System.out.println(key + " not found");
            return -1;
        }

        if (array[index] == key) {
            System.out.println("Found at index " + index);
            return index;
        }

        return linearRecHelper(key, index + 1);
    }

    public int binarySearch(int key) {
        if (!isSorted()) {
            System.out.println("Array is not sorted. Please sort the array first.");
            return -1;
        }

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == key) {
                System.out.println(key + " found at index " + mid);
                return mid;
            }

            if (key > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(key + " not found.");
        return -1;
    }

    public int binaryRecursiveSearch(int key) {
        if (!isSorted()) {
            System.out.println("Array is not sorted. Please sort the array first.");
            return -1;
        }

        int start = 0;
        int end = array.length - 1;
        return binaryRecHelper(key, start, end);
    }

    private int binaryRecHelper(int key, int start, int end) {
        if (start > end) {
            System.out.println(key + " not found.");
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (array[mid] == key) {
            System.out.println(key + " found at index " + mid);
            return mid;
        }

        if (key > array[mid]) {
            return binaryRecHelper(key, mid + 1, end);
        } else {
            return binaryRecHelper(key, start, mid - 1);
        }
    }

    // Method to check if the array is sorted
    private boolean isSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
