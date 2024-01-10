package algoritmia.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array order first the odd numbers and then the odd numbers
 */

public class OrderFirstOddEven {

    public static void main(String[] args) {
        int[] array = {1,5,3,6,8,7,9,2,4};

        order(array);

    }

    public static int[] order(int[] array){

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if(array[i]%2!=0){//odd
               odd.add(array[i]);
            }else{//even
                even.add(array[i]);
            }
        }

        List<Integer> list = new ArrayList<>();
        list.addAll(odd);
        list.addAll(even);


        int[] newarray = list.stream().mapToInt(Integer::intValue).toArray();

        return newarray;
    }


}
