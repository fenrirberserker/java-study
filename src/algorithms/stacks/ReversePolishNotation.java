package algorithms.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a String
 * perform a reverse polish notation
 * and return the result
 */

public class ReversePolishNotation {

    public static void main(String[] args) {

        String[][] inputs = {
                {"2", "1", "+", "3", "*"},
                {"4", "13", "5", "/", "+"}
        };
        for (int i = 0; i < inputs.length; i++) {
            Double result = reversePolishNotation(inputs[i]);
            System.out.println(result);
        }


    }

    public static double reversePolishNotation(String[] charr) {

        double result;


        Deque<String> stack = new ArrayDeque<>();
        for (int i=0; i<charr.length; i++) {
            String s = charr[i];
            System.out.println("Stack: " + stack);
            System.out.println("char = "+s);
            double val = 0;
            switch (s) {
                case "+":
                    val = add(stack);
                    stack.push(String.valueOf(val));
                    break;
                case "-":
                    val = sub(stack);
                    stack.push(String.valueOf(val));
                    break;
                case "*":
                    val = mul(stack);
                    stack.push(String.valueOf(val));
                    break;
                case "/":
                    val = div(stack);
                    stack.push(String.valueOf(val));
                    break;
                default:
                    stack.push(charr[i]);
                    break;

            }

        }

        result = Double.parseDouble(stack.pop());

        return result;

    }

    public static double add(Deque<String> stack) {

        double second = Double.parseDouble(stack.pop());
        double first = Double.parseDouble(stack.pop());

        return first + second;

    }

    public static double sub(Deque<String> stack) {

        double second = Double.parseDouble(stack.pop());
        double first = Double.parseDouble(stack.pop());

        return first - second;

    }

    public static double mul(Deque<String> stack) {

        double second = Double.parseDouble(stack.pop());
        double first = Double.parseDouble(stack.pop());

        return first * second;

    }

    public static double div(Deque<String> stack) {

        double second = Double.parseDouble(stack.pop());
        double first = Double.parseDouble(stack.pop());

        return first / second;

    }


}
