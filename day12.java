import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(isValid(s));  // Output: true
    }
}



Problem : Valid Parentheses with Multiple Types
You are given a string s consisting of different types of parentheses: (), {}, and []. Your task is to determine whether the given string is valid.
A string is considered valid if:
1. Every opening bracket has a corresponding closing bracket of the same type.
2. The brackets are closed in the correct order. This means that a closing bracket must close the most recent unmatched opening bracket.

Input :
A string s consisting of characters (, ), {, }, [, and ].
Input: s = "[{()}]"

Output :
- Return true if the string is valid.
- Return false if the string is invalid.
Output: true
