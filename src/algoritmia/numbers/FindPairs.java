package algoritmia.numbers;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of elements
 * calculate how many pairs are there for every number
 */

public class FindPairs {

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        getPairs(array);

    }

    public static int getPairs(int[] array){

        Map<Integer, Integer> map = new HashMap<>();
        int pairs=0;

        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                map.replace(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Integer,Integer> e: map.entrySet()) {


            if(e.getValue()>1){
                if(e.getValue()%2==0){
                    pairs+=e.getValue()/2;
                } else if ((e.getValue()-1)%2==0) {
                    pairs+=(e.getValue()-1)/2;
                }

            }

        }

        System.out.println("pairs "+pairs);
        return pairs;
    }
}
