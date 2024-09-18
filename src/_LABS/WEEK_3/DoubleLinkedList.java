package Pre_Tasks;

public class DoubleLinkedList {
    Node head;
    Node tail;

    // Constructor
    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    // Display double linked list
    public void display() {
        Node curr = head;

        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void insertStart(int data) {
        Node curr = head;

    }
}
