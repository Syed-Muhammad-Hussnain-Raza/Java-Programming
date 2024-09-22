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

    /**
     * This method will delete last node of linked list.
     */
    public void removeLast() {
        // case 1: if list is empty
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        // case 2: if there is only one node
        if (head.next == null) {
            head = null;
            return;
        }

        // case 3: more than 1 node
        SingleNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    /**
     * This method will delete given node from list.
     * @param node node to be deleted from list.
     */
    public void deleteNode(SingleNode node) {
        // case 1: if list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // find required node in list
        SingleNode curr = head;
        SingleNode prev = null;
        while (curr != null && curr.data != node.data) {
            prev = curr;
            curr = curr.next;
        }

        // if node not found in list
        if (curr == null) {
            System.out.println("Node not found in list");
            return;
        }

        // if node to be deleted is head
        if (curr == head) {
            head = head.next;
        } else {
            prev.next = curr.next;
        }
    }

    /**
     * This method will remove node from list after given node as parameter.
     * @param node is reference and next node will be deleted.
     */
    public void removeAfter(SingleNode node) {
        // case 1: if list is empty
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        // find required node in list
        SingleNode curr = head;
        while (curr != null && curr.data != node.data) {
            curr = curr.next;
        }

        // if node not found in list
        if (curr == null) {
            System.out.println("Node not found in list");
            return;
        }

        // if given node is last node of list
        if (curr.next == null) {
            System.out.println("No node next to given node.");
            return;
        }
        // delete node
        curr.next = curr.next.next;
    }

    /**
     * This method will reverse the single linked list.
     */
    public void reverseList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        SingleNode prev = null;
        SingleNode curr = head;
        SingleNode next ;

        while (curr != null){
            // first store next node
            next = curr.next;
            // changing next pointer of current to previous node
            curr.next = prev;

            // updating references of previous and current nodes
            prev = curr;
            curr = next;
        }

        // updating the head of linked list
        head = prev;
    }

    /**
     * Calculate size of linked list.
     * @return size in int form.
     */
    public int sizeOf() {
        // if list is empty, size: 0
        if (head == null) {
            return 0;
        }

        int size = 0;

        SingleNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++ ;
        }

        return size;
    }

    /**
     * This method will remove duplicate nodes in list.
     */
    public void removeDuplicate() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            System.out.println("There is only one node in list");
            return;
        }

        boolean duplicates = false;

        SingleNode curr = head;
        while (curr != null) {
            SingleNode node = curr;
            while (node.next != null) {
                if (node.next.data == curr.data) {
                    node.next = node.next.next;
                    duplicates = true;
                } else {
                    node = node.next;
                }
            }
            curr = curr.next;
        }

        if (duplicates) {
            System.out.println("Duplicates removed successfully");
        } else {
            System.out.println("No duplicates found in list.");
        }
    }
}
