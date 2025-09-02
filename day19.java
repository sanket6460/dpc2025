import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperation(a, b, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/");
    }

    private static int applyOperation(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;  // integer division
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }

    public static void main(String[] args) {
        String expression = "2 1 + 3 *";
        System.out.println("Result: " + evaluatePostfix(expression)); // Output: 9
    }
}


Problem : Evaluate a Postfix Expression
Given a postfix expression (also known as Reverse Polish Notation), your task is to evaluate the expression and return the result. The expression can contain integers and the four basic arithmetic operators +, -, *, and /. Assume that the input is always valid and the division operator performs integer division, truncating towards zero.

Input :
- A string representing a postfix expression where operands and operators are separated by spaces.
- The string contains only integers (both positive and negative) and the operators +, -, *, and /.
- Input: "2 1 + 3 *"

Output :
An integer representing the result of evaluating the postfix expression.
Output: 9
