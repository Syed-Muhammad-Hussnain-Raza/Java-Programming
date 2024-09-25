public class CircularList<T> {
    CircularNode<T> head;

    // Constructor
    public CircularList() {
        head = null;
    }

    /**
     * Inserts a new node at the start of the list.
     * @param data the data of the new node to be inserted.
     */
    public void addFirst(T data) {
        CircularNode<T> newNode = new CircularNode<>(data);

        // If the list is empty
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        CircularNode<T> curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        newNode.next = head;
        curr.next = newNode;
        head = newNode;
    }

    /**
     * Inserts a new node at the end of the list.
     * @param data the data of the new node to be inserted.
     */
    public void addLast(T data) {
        CircularNode<T> newNode = new CircularNode<>(data);

        // If the list is empty
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        CircularNode<T> curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        newNode.next = head;
        curr.next = newNode;
    }

    /**
     * Inserts a new node after a specific node.
     * @param node the node after which to insert the new node.
     * @param data the data of the new node to be inserted.
     */
    public void insertAfter(CircularNode<T> node, T data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        CircularNode<T> current = head;
        do {
            if (current.data.equals(node.data)) {
                CircularNode<T> newNode = new CircularNode<>(data);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        } while (current != head);

        System.out.println("Node not found");
    }

    /**
     * Removes the first node (head) of the list.
     */
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        CircularNode<T> current = head;
        while (current.next != head) {
            current = current.next;
        }

        head = head.next;
        current.next = head;
    }

    /**
     * Removes the last node of the list.
     */
    public void removeLast() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        CircularNode<T> current = head;
        while (current.next.next != head) {
            current = current.next;
        }

        current.next = head;
    }

    /**
     * Deletes a specific node from the list.
     * @param node the node to be deleted.
     */
    public void deleteSpecific(CircularNode<T> node) {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        CircularNode<T> current = head;
        CircularNode<T> previous = null;

        if (node.data.equals(head.data)) {
            removeFirst();
            return;
        }

        do {
            previous = current;
            current = current.next;
            if (current.data.equals(node.data)) {
                previous.next = current.next;
                return;
            }
        } while (current != head);

        System.out.println("Node not found");
    }

    /**
     * Deletes the entire list.
     */
    public void deleteList() {
        if (head == null) {
            System.out.println("List is already empty");
        } else {
            head = null;
        }
    }

    /**
     * Displays the circular list.
     */
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        CircularNode<T> current = head;
        do {
            System.out.print(current.data + (current.next == head ? "" : " -> "));
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    /**
     * Returns the node number of a specific node in the list.
     * @param node the node for which to find the position.
     * @return the node number or -1 if the node is not found.
     */
    public int getNodeNumber(CircularNode<T> node) {
        if (head == null) {
            System.out.println("Node not found");
            return -1;
        }

        int nodeNumber = 1;
        CircularNode<T> current = head;
        if (node.data.equals(head.data)) {
            return nodeNumber;
        }

        do {
            nodeNumber++;
            current = current.next;
            if (current.data.equals(node.data)) {
                return nodeNumber;
            }
        } while (current != head);

        System.out.println("Node not found");
        return -1;
    }

    /**
     * Graded Task 1:
     * Deletes nodes with even or odd values from the list.
     * @param type "even" to delete even values, "odd" to delete odd values.
     */
    public void deleteNodeOfValues(String type) {
        // check: is list empty.
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // check: we have to delete even or odd data values.
        boolean isEven = type.equalsIgnoreCase("even");

        // check: only 'even' or 'odd' as parameters are allowed, not case-sensitive.
        if (!type.equalsIgnoreCase("even") && !type.equalsIgnoreCase("odd")) {
            System.out.println("Invalid input. Please enter 'even' or 'odd'.");
            return;
        }

        // Handle the case where head needs to be deleted
        while (head.data instanceof Integer && (( Integer ) head.data % 2 == 0) == isEven) {
            // call remove first
            removeFirst();

            // If the list becomes empty after removing the head
            if (head == null) {
                return;
            }
        }

        // Now handle non-head nodes
        CircularNode<T> current = head;
        CircularNode<T> previous = null;

        do {
            // Check if the current node's value matches the condition
            if ((current.data instanceof Integer) && ( (( (Integer) current.data) % 2 == 0) == isEven)) {
                // removing current node
                previous.next = current.next;

                // If current is the head, adjust the head pointer
                if (current == head) {
                    head = current.next;
                }
            } else {
                // Move to the next node, if we didn't want to delete the current node.
                previous = current;
            }

            current = current.next;
        } while (current != head);
    }

    /**
     * Implements Josephus's problem with a fixed step size of 3.
     * @return The last remaining node's data.
     */
    public T josephusProblem(int step) {
        // If the list is empty
        if (head == null) {
            return null;
        }

        // If the list has only one node
        if (head.next == head) {
            return head.data;
        }

        CircularNode<T> current = head;
        CircularNode<T> previous = null;

        // Eliminate nodes one by one until only one node is left
        while (current.next != current) {
            // inner loop will run till given step, in our case: 3
            for (int i = 1; i < step; i++) {
                previous = current;
                current = current.next;
            }

            // Remove the 'current' node
            System.out.println("Removing: " + current.data);
            previous.next = current.next;

            // Move current to the next node
            current = previous.next;
        }

        // only one node remaining, made it head.
        head = current;

        return current.data;
    }

    /**
     * This method will delete all even-positioned nodes from the circular list.
     */
    public void deleteEvenPositionedNodes() {
        // Check if the list is empty or has only one node
        if (head == null || head.next == head) {
            return;
        }

        CircularNode<T> current = head;
        CircularNode<T> prev = null;

        int position = 1; // initialize position to 1

        do {
            if (position % 2 == 0) {
                prev.next = current.next;
            } else {
                prev = current;
            }

            current = current.next;
            position++;
        } while (current != head);
    }
}
