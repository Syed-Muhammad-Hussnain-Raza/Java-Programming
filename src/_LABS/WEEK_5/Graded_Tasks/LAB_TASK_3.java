package Graded_Tasks;

import Activity_2.StackDynamic;

import static Graded_Tasks.LAB_TASK_2.isOperator;

public class LAB_TASK_3 {
    StackDynamic<Integer> stack;

    // constructor
    public LAB_TASK_3() {
        stack = new StackDynamic<>();
    }

    // Method to evaluate a postfix expression
    public int evaluate(String postfix) {
        if (!isValidPostfix(postfix)) {
            throw new InvalidPostfixException("Invalid Postfix Expression");
        }
        // for loop till length of postfix string
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // If the character is a digit, push it onto the stack
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));  // Convert char to int and push to stack
            }
            // If it's an operator, pop two operands and perform the operation
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;

                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '^':
                        result = (int) Math.pow(operand1, operand2);
                        break;
                    case '/':
                        if (operand2 != 0) {
                            result = operand1 / operand2;
                        } else {
                            throw new ArithmeticException("Division by zero error.");
                        }
                        break;
                }
                // Push the result back to the stack
                stack.push(result);
            }
        }

        // The final result is at the top of the stack
        return stack.pop();
    }

    // Helper method: check that given expression is valid postfix or not.
    private boolean isValidPostfix(String postfix) {
        int operandCount = 0;

        for (char ch : postfix.toCharArray()) {
            if (Character.isDigit(ch)) {
                operandCount++; // Count operands
            } else if (isOperator(ch)) {
                operandCount--; // An operator consumes two operands
                if (operandCount < 1) {
                    return false; // Invalid if there are no operands to operate on
                }
            }
        }

        // For a valid postfix, there should be exactly one operand left
        return operandCount == 1;
    }

    public static void main(String[] args) {
        // Define postfix expression (without needing a map)
        String postfix = "(99)";

        LAB_TASK_3 evaluator = new LAB_TASK_3();
        int result = evaluator.evaluate(postfix);
        System.out.println("Result of postfix evaluation: " + result);
    }
}
