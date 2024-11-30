import java.util.Arrays;

public class LinearHash {
    User[] hashTable;

    public LinearHash(int size) {
        hashTable = new User[size];
        Arrays.fill(hashTable, null);
    }

    public void put(int key, String value) {
        int index = key % hashTable.length;
        int temp = index;

        while (hashTable[index] != null) {
            // update only value if key is same - taught in lecture
            if (hashTable[index].id == key) {
                hashTable[index].name = value;
                System.out.println("Key " + key + " updated at index " + index);
                return;
            }

            index = (index + 1) % hashTable.length;
            if (index == temp) {
                System.out.println("Hash full");
                return;
            }
        }

        hashTable[index] = new User(key, value);
        System.out.println("Key " + key + " inserted at index " + index);
    }

    // Method to search in a hash table
    public void search(int key) {
        int index = (key % hashTable.length);
        int temp = index;

        while (hashTable[index] != null) {
            if (hashTable[index].id == key) {
                System.out.println(key + " found at index " + index);
                System.out.println(hashTable[index]);
                return;
            }

            index = (index + 1) % hashTable.length;
            if (index == temp) {
                System.out.println(key + " not found!");
                return;
            }
        }

        System.out.println(key + " not found.");
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null) {
                System.out.println("Index " + i + ": Empty");
            } else {
                System.out.println("Index " + i + ": " + hashTable[i]);
            }
        }
    }
}
