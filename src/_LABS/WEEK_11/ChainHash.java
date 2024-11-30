import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChainHash {
    List<User>[] hashTable;

    @SuppressWarnings("unchecked")
    public ChainHash(int size) {
        hashTable = new List[size];

        // initialize each index with an array list
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new ArrayList<>();
        }
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.print(hashTable[i] + " -> ");
        }
        System.out.println();
    }

    public void put(int key, String value) {
        int index = (key % hashTable.length);

        hashTable[index].add(new User(key, value));
        System.out.println("Key " + key + " added at index " + index);
    }

    public void search(int key) {
        int index = key % hashTable.length;

        for (User user : hashTable[index]) {
            if (user.id == key) {
                System.out.println("Key " + key + " found at index " + index);
                System.out.println(user);
                return;
            }
        }
        System.out.println("Key " + key + " not found.");
    }
}
