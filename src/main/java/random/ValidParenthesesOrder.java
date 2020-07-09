package random;

import java.util.Stack;

public class ValidParenthesesOrder {

    public static void main(String[] args) {

        System.out.println(isValid("([)]"));

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[]c = s.toCharArray();
        for (char value : c) {

            if (value == '(' || value == '[' || value == '{') {
                stack.push(value);
            } else {
                if (!stack.isEmpty()) {
                    char c1 = stack.pop();
                    if (!((c1 == '[' && value == ']') || (c1 == '{' && value == '}') || c1 == '(' && value == ')')) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();

    }
}
