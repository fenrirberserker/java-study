package concepts.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SplitListElements {

    public static void main(String[] args) {


        List<Integer> list = IntStream.rangeClosed(0, 11)
                .boxed().collect(Collectors.toCollection(ArrayList::new));

        split(list);


    }

    public static void split(List<Integer> list){

        int size = list.size();
        System.out.println("Size of list is: " + size);
        int incr = 10;


        for(int i=0; i<size; i+=incr){
            int end = Math.min(i+incr, size);
//            System.out.println("range "+i+" - "+(end));
            List<Integer> subList = list.subList(i, end);
            System.out.println("subList "+subList);

        }



    }
}
