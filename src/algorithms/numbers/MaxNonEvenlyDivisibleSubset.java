package algorithms.numbers;

import java.util.*;

public class MaxNonEvenlyDivisibleSubset {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,7,2,4);
        int k = 3;
        int result = nonDivisibleSubset(k,list);
        System.out.println("result: " + result);
        assert result == 3;

        List<Integer> list2 = Arrays.asList(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436);
        int k2 = 7;
        int result2 = nonDivisibleSubset(k2,list2);
        System.out.println("result: " + result2);
        assert result2 == 7;




    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {

        Set<Set<Integer>> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < s.size()-1; i++) {
            for (int j = i+1; j < s.size(); j++) {

                int first = s.get(i);
                int second = s.get(j);
                int sum = first + second;
                int remainder = sum % k;

                System.out.println("pair "+first+" "+second+" sum: "+sum
                        +" % "+k+" = "+(first+second)%k+" ? "+((first+second)%k>0)
                        +" add? "+(((first+second)%k>0)?first+" "+second:"")
                );
                map.merge(remainder,1,Integer::sum);
                Set<Integer> current = new HashSet<>();
                current.add(first);
                current.add(second);
                if(remainder>0 && !set.contains(current)){
                    set.add(current);
                }

            }
        }

        System.out.println("Set "+set);
        System.out.println("MAP "+map);


        return set.size();


   }


}
