import java.util.Arrays;

public class TestSearching {
    public static void main(String[] args) {
        Searching test = new Searching(5);

        // Initialize array
        for (int i = 0; i < test.array.length; i++) {
            test.array[i] = i+1;
        }

        System.out.println(Arrays.toString(test.array));

        // search in array
        System.out.println(test.binaryRecursiveSearch(1));
    }

}
