package Activity_2;

public class Main {
    public static void main(String[] args) {
        StackDynamic<Integer> stack = new StackDynamic<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.printStack();
    }
}
