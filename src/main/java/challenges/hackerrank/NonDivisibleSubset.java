package challenges.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,7,2,4,8);
        int k = 3;

        int result = nonDivisibleSubset(k,list);
        System.out.println("result "+result);


    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here

        int maxSubset = 0;

        System.out.println("list "+s);
        //System.out.println("pointers "+pointers);

        for (int i = s.size()-1; i > 1; i--) {
            System.out.println("it "+i);
            List<Integer> pointers = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                pointers.add(s.get(j));
            }
            System.out.println("pointers init "+pointers);
            for (int j = i-1; j >=0 ; j--) {

                int iter = s.size()-pointers.size();
                for (int l = 0; l <= iter; l++) {
                    System.out.println(pointers);
                    pointers.set(j,s.get(j));
                }
            }
        }

        return maxSubset;
    }

    static List<Integer> permute(List<Integer> pointers){

        List<Integer> subP = new ArrayList<>(2);
        subP.set(0, pointers.get(0));
        subP.set(1, pointers.get(1));


        for (int i = subP.size()-1; i >=0 ; i--) {
            for (int j = 0; j < pointers.size()-2; j++) {

            }
        }

        return null;

    }


}
