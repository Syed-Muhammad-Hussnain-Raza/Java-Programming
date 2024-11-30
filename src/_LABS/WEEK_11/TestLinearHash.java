public class TestLinearHash {
    public static void main(String[] args) {
        LinearHash test = new LinearHash(5);

        test.put(11, "B");
        test.put(12, "C");
        test.put(10, "A");
        test.put(14, "D");
        test.put(13, "E");
        test.put(10, "F");
        test.printHashTable();

        test.search(10);
    }
}
