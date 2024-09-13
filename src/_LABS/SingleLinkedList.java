package _LABS;

public class SingleLinkedList {
    Node head ;

    public void insertStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        Node current = head;

        while(current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertBefore(int beforeValue, int data) {
        if (head == null) return ;

        if (head.data == data) {
            insertStart(beforeValue);
            return;
        }

        Node current = head;
        while(current.next != null && current.next.data == data) {
            current = current.next;
        }

        if (current.next != null) {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Node with value " + beforeValue + " not found.");
        }
    }

    public void insertAfter(int afterValue, int data) {
        if (head == null) return ;

        Node current = head;
        while(current.next != null && current.next.data == afterValue) {
            current = current.next;
        }

        if (current.next != null) {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Node with value " + afterValue + " not found.");
        }
    }
}
