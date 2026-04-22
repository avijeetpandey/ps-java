package data_structures.stack;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // check
                if (c == ']' && top != '[')
                    return false;
                if (c == '}' && top != '{')
                    return false;
                if (c == ')' && top != '(')
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
