package _LABS.WEEK_1.Using_ArrayList.Task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    ArrayList list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));

    // Linear search to find element in array list
    public void linearSearch(int val) {
        int index = list.indexOf(val);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.linearSearch(1);
    }
}
