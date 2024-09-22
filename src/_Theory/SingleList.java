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

    /**
     * This method will add new node before a specific node.
     * @param node the node before which we have to insert a new node.
     * @param data this will be new node that we want to insert.
     */
    public void insertBefore(SingleNode node, Object data) {
        // Case 1: check is list empty?
        if (head == null) {
            System.out.println("Node not found in Linked List");
            return;
        }

        // Case 2: check whole list, if node present in list or not?
        SingleNode curr = head;
        SingleNode prev = null;
        while (curr != null && curr.data != node.data) {
            prev = curr;
            curr = curr.next;
        }
        // if node not found, return here.
        if (curr == null) {
            System.out.println("Node not found in list");
            return;
        }

        // Case 3: if node found in list then insert new node before it.
        SingleNode newNode = new SingleNode(data);
        // if node is head before we have to insert new node
        if (curr == head) {
            newNode.next = head;
            head = newNode;
        } else {
            prev.next = newNode;
            newNode.next = curr;
        }
    }

    /**
     * This method will add new node after a specific node.
     * @param node the node after which we have to insert a new node.
     * @param data this will be new node that we want to insert.
     */
    public void insertAfter(SingleNode node, Object data) {
        // Case 1: list is empty
        if (head == null) {
            System.out.println("Node not found in Linked List");
            return;
        }

        // Case 2: check whole list to check if node present in list or not.
        SingleNode curr = head;
        while (curr != null && curr.data != node.data) {
            curr = curr.next;
        }
        // if node not found, return here.
        if (curr == null) {
            System.out.println("Node not found in list");
            return;
        }

        // Case 3: if node found in list then insert new node before it.
        SingleNode newNode = new SingleNode(data);
        // if is last node of linked list
        if (curr.next != null) {
            newNode.next = curr.next;
        }
        curr.next = newNode;
    }

    /**
     * This method will delete first node of linked list.
     */
    public void deleteStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }
}
