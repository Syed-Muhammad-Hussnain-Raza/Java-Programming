package Activity_2;

public class StackDynamic<T> {
    Node<T> head;

    // constructor
    public StackDynamic() {
        head = null;
    }

    // push element to stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;
    }

    // remove last entered element
    public T pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return null;
        }

        T data = head.data;
        head = head.next;

        return data;
    }

    // return last entered element
    public T peek() {
        if (head == null) {
            return null;
        }

        return head.data;
    }

    // delete whole stack
    public void deleteStack() {
        if (head == null) {
            System.out.println("Stack is already empty");
            return;
        }

        head = null;
    }

    // Helper method: print stack
    public void printStack() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        printStackRecursively(head);
        System.out.println();  // Print a new line after printing the stack
    }

    // Private helper method for recursion
    private void printStackRecursively(Node<T> node) {
        if (node == null) {
            return;
        }
        printStackRecursively(node.next); // Recursive Call
        System.out.print(node.data + " ");
    }

}
