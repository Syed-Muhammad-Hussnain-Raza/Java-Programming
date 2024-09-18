package Pre_Tasks;

public class Node {
    Object data;
    Node next;
    Node previous = null;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
