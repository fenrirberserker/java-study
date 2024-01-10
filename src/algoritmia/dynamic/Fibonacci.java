package algoritmia.dynamic;

import java.util.HashMap;
import java.util.Map;


/**
 * Solve the fibonacci sequence by using memoization
 */
public class Fibonacci {



    public static void main(String[] args) {


        int six = fib(6);
        System.out.println("fib 6: "+six);

    }

    public static Integer fib(int n){
        return fib(n, new HashMap<>());
    }

    public static Integer fib(int n, Map<Integer, Integer> memo){
        if(n==0 || n==1){
            return n;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = fib(n-1, memo) + fib(n-2, memo);
        memo.put(n,result);

        return result;
    }
}
