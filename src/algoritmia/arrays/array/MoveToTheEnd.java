package algoritmia.arrays.array;

import java.util.*;

/**
 * Given an array and a target
 * Move the given target to the end of the array
 */

public class MoveToTheEnd {

    public static void main(String[] args) {

        Integer[] array = {2,1,2,2,2,3,4,2};
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(array);
        //list.stream().forEach(System.out::println);
        int toMove = 2;

        List<Integer> convert = move(list,toMove);
        convert.forEach(System.out::println);


    }

    public static List<Integer> move(List<Integer> array, int toMove){

        int nmoves = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {

            if (array.get(i)==toMove){
                nmoves++;
            }else {
                list.add(array.get(i));
            }
        }

        //System.out.println("moves "+nmoves);
        for (int i = 0; i < nmoves; i++) {
            list.add(toMove);
        }

        //list.forEach(System.out::println);

        //Integer[] newar = list.toArray(Integer[]::new);
        //int[] newint = Arrays.stream(newar).mapToInt(Integer::intValue).toArray();

        return list;



    }
}
