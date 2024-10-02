package Activity_2;

public class Node<T> {
    T data;
    Node<T> next;

    // constructor
    public Node(T data) {
        this.data = data;
        next = null;
    }
}
