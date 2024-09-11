public class LinkedList {
    Node head;
    Node tail;

    /**
     * Constructor will initialize the head and tail to null
     */
    public LinkedList() {
        head = null;
        tail = null;
    }

    /**
     * This function will insert given node to start of the list.
     * @param data is the value of node which is to be inserted.
     */
    public void insertFirst(Object data) {
        Node newNode = new Node(data);
        // first check Is list empty or not
        if (head == null) {
            head = tail =  newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * This function will insert given node to last of the list.
     * @param data is the value of node which is to be inserted.
     */
    public void insertLast(Object data) {
        Node newNode = new Node(data);
        // check if list is empty
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * This function will delete first node from list.
     */
    public void deleteFirst() {
        // check if list is empty or not.
        if (head == null) {
            System.out.println("Deletion is not possible | List is empty");
            return;
        }
        // If list is not empty
        if (head == tail) {
            head = tail = null;
        }
         else {
            head = head.next;
        }
    }

    /**
     * If the list is empty, deletion is not possible.
     * If there's only one node, set head and tail to null.
     * Traverse the list to find the second-to-last node, update its next to null, and
     * update tail to point to this node.
     */
    public void deleteLast() {
        // check if list is empty or not
        if (head == null) {
            System.out.println("Deletion is not possible | List is empty");
            return;
        }
        // If list is not empty
        if (head == tail) { // If there is only one node in linked list
            head = tail = null;
        } else { // traverse the linked list for value
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
    }

    public void insertAfter(Object data, Object newData) {
        Node newNode = new Node(newData);
        // check if list is empty
        if (head == null) {
            System.out.println("There is no node to insert after | List is empty");
            return;
        }

        // if linked list is not empty
        Node current = head;
        // traverse linked list
        while (current != null && !current.data.equals(data)) {
            current = current.next;
        }

        // if value not found
        if (current == null) {
            System.out.println("Insertion is not possible | Value not found");
        } else { // if value found in linked list
            newNode.next = current.next;
            current.next = newNode;

            if (current == tail) {
                tail = newNode;
            }
        }

    }

    public void deleteNode(Object data) {
        // Is list empty ?
        if (head == null) {
            System.out.println("Deletion is not possible | List is empty");
            return;
        }

        // Traverse through list
        Node current = head;
        Node previous = null;

        while (current != null && !current.data.equals(data)) {
            previous = current;
            current = current.next;
        }

        // If value not found in list
        if (current == null) {
            System.out.println("Value not found in the list.");
            return;
        }

        // If value found in the list
        if (current == head) {
            head = head.next;  // Directly move head to the next node
            if (head == null) {
                tail = null;  // If the list becomes empty, update the tail to null as well
            }
        } else if (current == tail) {
            deleteLast();
        } else {
            previous.next = current.next;
        }
    }

    /**
     * If the list is already empty, no action is required.
     * Set both head and tail to null, effectively removing all nodes.
     */
    public void deleteWholeList() {
        if (head == null) {
            System.out.println("List is already empty");
        } else {
            head = tail = null;
            System.out.println("List deleted successfully");
        }
    }

    /**
     * Display whole linked list
     */
    public void display() {
        Node current = head;

        while (current != null) {
            if (current.next == null) {
                System.out.print(current.data);
            } else {
                System.out.print(current.data + " -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    
}
