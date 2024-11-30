public class TestChainHash {
    public static void main(String[] args) {
        ChainHash test = new ChainHash(5);

        test.put(11, "B");
        test.put(12, "C");
        test.put(10, "A");
        test.put(14, "D");
        test.put(13, "E");
        test.printHashTable();
    }
}
