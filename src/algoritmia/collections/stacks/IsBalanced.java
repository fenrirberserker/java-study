package algoritmia.collections.stacks;

import java.util.Stack;

/**
 * A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
 *
 * Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().
 *
 * A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].
 *
 * By this logic, we say a sequence of brackets is balanced if the following conditions are met:
 *
 * It contains no unmatched brackets.
 * The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
 * Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.
 *
 * Balance brackets using stack
 */
public class IsBalanced {

    public static void main(String[] args) {

        boolean test1 = isBalanaced("{[()]}");
        System.out.println(test1);
        boolean test2 = isBalanaced("{[(])}");
        System.out.println(test2);
        boolean test3 = isBalanaced("{{[[(())]]}}");
        System.out.println(test3);
        boolean test4 = isBalanaced("(()) ()");
        System.out.println(test4);

    }

    public static boolean isBalanaced(String string){
        string = string.replaceAll(" ","");

        System.out.println("For string "+string);

//        boolean result = false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {

            char ichar = string.charAt(i);
            //System.out.print(ichar+" ");
            
            if(ichar == '(' || ichar == '[' || ichar == '{'){
                stack.push(ichar);
                System.out.print("push "+ichar+" ");
            } else {
                if(stack.isEmpty()){//if stack = ))]}
                    return false;
                }
                char pop = stack.pop();
                System.out.print("pop "+pop+" ");
                if(ichar==')' && pop!='('){
                    return false;
                }else if(ichar==']' && pop!='['){
                    return false;
                }else if(ichar=='}' && pop!='{'){
                    return false;
                }

            }

        }


        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
