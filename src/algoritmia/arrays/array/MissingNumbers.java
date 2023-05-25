package algoritmia.arrays.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MissingNumbers {

    public static void main(String[] args) {

        int[] nums = {1, 4, 3};
        int[] news = missingNumbers(nums);
    }

    public static int[] missingNumbers(int[] nums) {
        // Write your code here.


        List<Integer> list = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        System.out.println("list "+list);
        int length = nums.length;
        List<Integer> l = Stream.iterate(list.get(0),n->n+1).limit(length+2).collect(Collectors.toList());
        for (int i = 0; i < nums.length; i++) {
            if(l.contains(nums[i])){
                l.remove(Integer.valueOf(nums[i]));
            }
        }
        System.out.println("gen list "+l);
        int[] numbers = l.stream().mapToInt(Integer::intValue).toArray();





        return numbers;
    }
}
