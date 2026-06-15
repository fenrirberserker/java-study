package algorithm.implementation.collections.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Alternate balanced-brackets solution — same problem as IsBalanced, different
 * test cases and slightly more compact matching logic.
 */
public class StackBalanced2 {

    public static void main(String[] args) {
        System.out.println(validate("([]{}){}"));       // true
        System.out.println(validate("([]{)}"));         // false
        System.out.println(validate("()[]{}{[]}([]{}){}"));  // true
        System.out.println(validate("{[]{{())}}"));     // false
        System.out.println(validate("()[]{}"));         // true
    }

    public static boolean validate(String s) {
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
