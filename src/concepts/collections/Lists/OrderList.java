package concepts.collections.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderList {
    public static void main(String[] args) {

        List<Integer> list = List.of(2,5,6,9,8,7,4,5);
        list = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        System.out.println(list);


    }


}
