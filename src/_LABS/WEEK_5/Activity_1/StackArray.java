package Activity_1;

public class StackArray<T> {

    private final T[] stack;
    private int top;

    // constructor
    @SuppressWarnings("unchecked")
    public StackArray(int size) {
        this.stack = (T[]) new Object[size];
        top = -1;
    }

    // Push element in stack
    public void push(T x) {
        if (isFull()) {
            throw new StackOverflowException("Stack Overflow: The stack is full");
        }
        stack[++top] = x;
    }

    // Pop element from stack
    public T pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack Underflow: The stack is empty.");
        }
        return stack[top--];
    }

    // Return top element of stack
    public T peek() {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack Underflow: The stack is empty.");
        }
        return stack[top];
    }

    // delete full stack
    public void deleteStack() {
        if (isEmpty()) {
            throw new StackUnderflowException("Deletion not possible: Stack is already empty.");
        }
        // this loop will help garbage collector
        for (int i = 0; i <= top; i++) {
            stack[i] = null;
        }
        top = -1;
    }

    // Helper function: To check is stack empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Helper function: To check is stack full
    public boolean isFull() {
        return top == stack.length - 1;
    }

    // Helper function: Print Stack
    public void printStack() {
        if (isEmpty()) {
            throw new StackUnderflowException("No values to print: stack is empty.");
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}
