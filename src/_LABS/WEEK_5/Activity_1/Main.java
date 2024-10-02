package Activity_1;

public class Main {
    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<>(10);

        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.printStack();

        stack.deleteStack(); // after that line stack is empty until we not push new values
    }
}
