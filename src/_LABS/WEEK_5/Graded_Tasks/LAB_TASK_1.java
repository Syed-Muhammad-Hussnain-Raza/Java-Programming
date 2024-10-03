package Graded_Tasks;

import Activity_1.StackArray;

public class LAB_TASK_1 {
    public static String isBalanced(String str) {
        // Character stack of size equal to input string
        StackArray<Character> stack = new StackArray<>(str.length());

        for (char ch : str.toCharArray()) {
            // If the character is an opening bracket, push it in stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If character is a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty
                if (stack.isEmpty()) {
                    return "Not Balanced, Unmatched closing bracket: " + ch;
                }
                char top = stack.pop();
                // Check for matching pairs
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return "Not Balanced - Mismatched pair: " + top + " and " + ch;
                }
            }
        }

        return stack.isEmpty() ? "Balanced" : "Not Balanced  - Unmatched opening brackets remaining";
    }

    public static void main(String[] args) {
        String exp1 = "[{()}]";
        String exp2 = "[{()}";
        String exp3 = "[{(a+b) * (a-b)}]";

        System.out.println("Input: " + exp1 + " -> Output: " + isBalanced(exp1));
        System.out.println("Input: " + exp2 + " -> Output: " + isBalanced(exp2));
        System.out.println("Input: " + exp3 + " -> Output: " + isBalanced(exp3));
    }
}
