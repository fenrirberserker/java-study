package concepts.convert;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysAndLists {

    public static void main(String[] args) {

        int[] array = {5,9,6,7,3,6,1,2,8,4};
        List<Integer> list = convertArrayToList(array);
        System.out.println("List "+list);
        int[] arrayInt = convertListToArray(list);
        System.out.print("Array ");
        for (int i : arrayInt) {
            System.out.print(i+" ");
        }
    }

    public static List<Integer> convertArrayToList(int[] array){

        List<Integer> list = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());



        return list;
    }

    public static int[] convertListToArray(List<Integer> list){

        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }

    public static List<Integer> convertArrayToListInt(Integer[] array){

        List<Integer> list = Arrays.asList(array);

        return list;
    }

    public static Integer[] convertListIntToArrayInt(List<Integer> list){

        Integer[] array = (Integer[]) list.toArray();
        return array;
    }

    public static Integer[] convertPrimitiveIntToArrayInt(int[] a){
        Integer[] inta = IntStream.of(a).boxed().toArray(Integer[]::new);
//        inta = a;
        return inta;
    }
}
