package validparenthesis;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || stack.pop() != matchingOpeningBracket(ch)) {
                    return false;
                }
            } else {

                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    private char matchingOpeningBracket(char closingBracket) {
        return switch (closingBracket) {
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> '-';
        };
    }
}
