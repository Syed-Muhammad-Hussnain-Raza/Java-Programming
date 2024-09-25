public class CircularNode<T> {
    T data;
    CircularNode<T> next;

    // Constructor
    public CircularNode(T data) {
        this.data = data;
        this.next = null;
    }
}
