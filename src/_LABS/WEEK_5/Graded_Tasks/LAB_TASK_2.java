package Graded_Tasks;

import Activity_2.StackDynamic;

import static Graded_Tasks.LAB_TASK_1.isBalanced;

public class LAB_TASK_2 {
    // method to convert infix expression to postfix expression
    public static String infixToPostfix(String expression) {
        if(isBalanced(expression).contains("Not Balanced")) {
            throw new IllegalArgumentException("Given infix expression is not balanced");
        }

        StackDynamic<Character> stack = new StackDynamic<>();
        StringBuilder result = new StringBuilder();

        // traverse the given infix expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is an operand, add it to output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the character is ')', pop and output until '(' is found
            else if (c == ')') {
                while (!stack.peek().equals('(') && stack.peek() != null) {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '(' from the stack
            }
            // If the character is an operator
            else if (isOperator(c)) {
                // Pop from stack while the precedence of the top of the stack is greater than or equal to current operator
                while (stack.peek() != null && isOperator(stack.peek()) && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c); // Push the current operator
            }
        }

        // Pop all the remaining operators from the stack
        while (stack.peek() != null) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Helper function: check if the character is operator
    protected static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    // Helper function: return precedence of operators
    public static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        String exp1 = "a+b*(c^d-e)^(f+g*h)-i";
        String exp2 = "A+B*(C+D)^2";

        System.out.println("Infix:   " + exp1 + "\nPostfix: " + infixToPostfix(exp1));
        System.out.println("Infix:   " + exp2 + "\nPostfix: " + infixToPostfix(exp2));
    }
}
