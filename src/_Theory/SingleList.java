package _Theory;

public class SingleList {
    SingleNode head;

    // Constructor
    public SingleList() {
        head = null;
    }

    /**
     * This function add node of given value at start of linked list.
     * @param data is the value of node that is to be inserted at start of linked list.
     */
    public void addStart(Object data) {
        SingleNode newNode = new SingleNode(data);

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;

        System.out.println("Node successfully added at start of the list");
    }

    /**
     * This function add node of given value at end of linked list.
     * @param data is the value of node that is to be inserted at end of linked list.
     */
    public void addEnd(Object data) {
        SingleNode newNode = new SingleNode(data);

        // If list empty; Insert at start of linked list.
        if (head == null) {
            head = newNode;
        }

        SingleNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

        System.out.println("Node successfully added at end of the list");
    }
}
