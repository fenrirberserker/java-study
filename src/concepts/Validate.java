package concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Validate {

    public static void main(String[] args) {
        int i=0;
        System.out.println(i++);


        ArrayList l = new ArrayList(2);
        l.add(1);
        l.add(1);
        l.add(1);
        System.out.println(l.size());
    }

    static int closestToZero(int[] ints) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<ints.length; i++){
            list.add(ints[i]);
        }

        List<Integer> sorted = list.stream().sorted().filter(n-> {return n >= 0;}).collect(Collectors.toList());

        return sorted.get(0);

    }
}


