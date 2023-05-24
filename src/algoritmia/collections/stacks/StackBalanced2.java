package algoritmia.collections.stacks;

import java.util.Stack;

public class StackBalanced2 {

    public static void main(String[] args) {

        String valid = "([]{}){}";
        String invalid = "([]{)}";
        String str3 = "()[]{}{[]}([]{}){}";
        String str4 = "{[]{{())}}";
        String s = "()[]{}";

        boolean test1 = validate(valid);
        System.out.println("test1 "+test1);
        boolean test2 = validate(invalid);
        System.out.println("test2 "+test2);
        boolean test3 = validate(str3);
        System.out.println("test3 "+test3);
        boolean test4 = validate(str4);
        System.out.println("test4 "+test4);

    }

    public static boolean validate(String str){

        Stack<Character> stack = new Stack<Character>();


        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                stack.push(str.charAt(i));
            }else{
                if(str.charAt(i)==')' && stack.pop()!='('){
                    return false;
                }
                if (str.charAt(i)==']' && stack.pop()!='['){
                    return false;
                }
                if (str.charAt(i)=='}' && stack.pop()!='{'){
                    return false;
                }

            }

        }

        return stack.isEmpty();



    }


}
