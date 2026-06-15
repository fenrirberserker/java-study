package algorithm.implementation.collections.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Balanced brackets: given a string of (, ), [, ], {, }, return true if every
 * opening bracket is closed in the correct order.
 * Strategy: push opening brackets onto a stack; on each closing bracket, pop
 * and verify the match.
 */
public class IsBalanced {

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));       // true
        System.out.println(isBalanced("{[(])}"));       // false
        System.out.println(isBalanced("{{[[(())]]}}"));  // true
        System.out.println(isBalanced("(()) ()"));      // true
    }

    public static boolean isBalanced(String s) {
        s = s.replaceAll(" ", "");
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}
