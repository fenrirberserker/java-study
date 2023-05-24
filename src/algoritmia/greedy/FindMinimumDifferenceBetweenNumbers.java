package algoritmia.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Find the minimum difference between two numbers in an array
 */

public class FindMinimumDifferenceBetweenNumbers {

    public static void main(String[] args) {

        int[] array = {1, -3, 71, 68, 17};
        find(array);

    }


    public static int find(int[] array){

        int i=0;
        int j=i+1;

        List<Integer> mins = new ArrayList<>();

        while(i< array.length-1){
            System.out.println("i "+i+" = "+array[i]);
            System.out.println("j "+j+" = "+array[j]);
            int mini=array[i];//<0?array[i]*(-1):array[i];
            int minj=array[j];//<0?array[j]*(-1):array[j];


            if(mini-minj<minj-mini){
                System.out.println(mini+"-"+minj+"<"+minj+"-"+mini+" add"+(mini-minj));
                mins.add(mini-minj);
            } else if(mini-minj>minj-mini){
                System.out.println(mini+"-"+minj+">"+minj+"-"+mini+" add "+(minj-mini));
                mins.add(minj-mini);
            }
            if(j== array.length-1){
                j=i+1;
                i++;
            }
            if(j<array.length-1){
                j++;
            }


        }
        mins.forEach(System.out::println);
        Optional<Integer> res = mins
                .stream()
                .map(e->{return e*(-1);})
                .min(Comparator.comparing(Integer::intValue));

        System.out.println("min "+res.get());
        return res.get();

    }
}
