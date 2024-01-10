package algoritmia.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * Solve the fibonacci (with 3 previous numbers) sequence by using memoization
 */
public class Tribonacci {

    public static void main(String[] args) {
        int result = trib(5);
        System.out.println("result "+result);
    }


    public static int trib(int n){
        return trib(n, new HashMap<Integer,Integer>());
    }

    public static int trib(int n, Map<Integer,Integer> memo){
        if(n==0 || n==1){
            return n;
        }
        if(n==2){
            return 1;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = trib(n-1,memo) + trib(n-2,memo) + trib(n-3,memo);
        memo.put(n,result);

        return result;
    }
}
