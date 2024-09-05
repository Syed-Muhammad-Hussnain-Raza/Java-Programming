package _LABS.WEEK_1.UsingArray.Task_2;

public class MyArrayList {
    int[] array;

    public MyArrayList(int[] array) {
        this.array = array;
    }

    /**
     * Check if array is empty or not
     * @return true if non-empty otherwise false
     */
    private boolean isEmpty() {
        return array.length == 0;
    }

    /**
     * This method will return index of given value array
     * @param specificVal is the value whose index we want to find
     * @return will return index of specific value if found otherwise it will return -1
     */
    private int indexOf(int specificVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == specificVal) {
                return i;
            }
        }
        return -1;
    }

    /**
     * It is a supportive function here that increase size of array by 1.
     * @return array with size increase by 1.
     */
    private int[] arraySizeIncrease() {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    /**
     * This method insert the given value at end of array
     * @param value is the given value to be inserted
     */
    public void insertAtEnd(int value) {
        if (isEmpty()) {
            array = arraySizeIncrease();
        }
        array[array.length - 1] = value;
    }

    /**
     * This method insert given value at start of array
     * @param value is the given value to be inserted
     */
    public void insertAtStart(int value) {
        if (isEmpty()) {
            array = arraySizeIncrease();
        }
        array[0] = value;
    }

    /**
     * This method insert given valueToBeInserted after a specific value in array
     * @param valueToBeInserted is the value to be inserted
     * @param specificVal is the valueToBeInserted after the given valueToBeInserted is inserted
     */
    public void insertAfterValue(int valueToBeInserted, int specificVal) {
        if (isEmpty()) {
            array = arraySizeIncrease();
        }

        int index = indexOf(specificVal);
        if (index == -1) {
            System.out.println(specificVal + " not found in array");
            return;
        }
        if (index == array.length - 1) {
            array = arraySizeIncrease();
        }
        array[index + 1] = valueToBeInserted;
    }

    /**
     * This method will insert a given value before a specific given value in array
     * @param valueToBeInserted is the given value to insert in array
     * @param specificVal is the value before we have to insert the value
     */
    public void insertBeforeValue(int valueToBeInserted, int specificVal) {
        if (isEmpty()) {
            array = arraySizeIncrease();
        }

        int index = indexOf(specificVal);
        if (index == -1) {
            System.out.println(specificVal + " not found in array");
            return;
        }
        int[] tempArray = new int[array.length];
        System.arraycopy(array, 0, tempArray, 0, array.length);

        array = arraySizeIncrease();

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = valueToBeInserted;
                for (int j = i + 1; j < array.length; j++) {
                    array[j] = tempArray[j - 1];
                }
                return;
            }
        }
    }

    /**
     * This method will display the members of array
     */
    public void displayArray() {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    /**
     * This method will delete the last value of array
     */
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Array is empty");
        }
        array[array.length - 1] = -1;
        int[] temp = new int[array.length - 1];
        System.arraycopy(array, 0, temp, 0, temp.length);
        array = temp;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Array is empty");
        }

        int[] temp = new int[array.length - 1];
        System.arraycopy(array, 1, temp, 0, temp.length);
        array = temp;
    }

    /**
     * Remove given value from array if found otherwise print message value not found.
     * @param value is the element in array that will be deleted on found.
     */
    public void removeValue(int value) {
        int index = indexOf(value);

        if (index == -1) {
            System.out.println(value + " not found in array");
            return;
        }

        int[] tempArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            tempArray[j] = array[i];
            j++;
        }
        array = tempArray;
    }

}
