package challenges.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array of n elements
 * where n represents a set of boxes
 * calculate the number of trips required to deliver all the packages.
 *
 * You can only remove the same number of boxes for all the slots
 */
public class DeliverPackages {

    public static void main(String[] args) {

        int[] array = {3,2,4,3,5,7,9};

        int trips = calculateTrips(array);
        System.out.println("trips "+trips);

    }

    public static int calculateTrips(int[] array) {

        int trips =0;

        List<Integer> list = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        System.out.println(list);



        for (int i = 0; i < list.size()-1; i++) {
            int current = list.get(i);
            int next = list.get(i+1);
            System.out.println("current "+current+" next "+next);
            if(current==next){
                continue;
            }

            List<Integer> ints = new ArrayList<>();
            for (int j = i+1; j < list.size(); j++) {
                int p = list.get(j);
                int newval = p-current;
                System.out.println("curr "+p+" - "+current+" = "+newval);
                ints.add(p-current);

            }
            System.out.println("newlist "+ints);
            trips++;
            System.out.println("tripno "+trips);

        }

        return trips+1;//count for the last

    }
}
