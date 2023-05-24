package algoritmia.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Find three numbers in an array that summed equals the target number
 */
public class FindThreeNumbersSum {

    public static void main(String[] args) {

//        int[] array = {12,3,1,2,-6,-5,-8,6};
        int[] array = {4,-6,2,1,-6,-5,-8,6};
        int target = 0;

        //findSum(target, array);
//        findSumBruteForce(target, array);
        try {
            findSum(target, array);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Integer[]> findSumBruteForce(int target, int[] array){

        for (int i = 0; i < array.length-2; i++) {
            System.out.println("i"+i+" "+array[i]);
            for (int j = i+1; j < array.length-1; j++) {
                System.out.println("j"+j+" "+array[j]);
                for (int k = i+2; k < array.length; k++) {
                    System.out.println("k"+k+" "+array[j]);
                    if(array[i]+array[j]+array[k]==target){
                        System.out.println("found "+array[i]+" "+array[j]+" "+array[k]);
                    }
                }


            }
        }

        return new ArrayList<>();

    }



    public static int[][] findSum(int target, int[] array) throws InterruptedException {

        int first = 0;
        int second = 1;
        int third = 2;
//        int[][] result = new int[][];
        List<List<Integer>> result = new ArrayList<>();

        do{

            System.out.println("arr "+first+"["+array[first]+"]"+" "+second+"["+array[second]+"] "+third+"["+array[third]+"]");

            if(array[first]+array[second]+array[third]==target){
                System.out.println("found "+array[first]+" "+array[second]+" "+array[third]);
            }

            if(third!=array.length-1){
                third++;
                System.out.println("third "+third);
            }else if(second!=array.length-2 ){
                second++;
                System.out.println("second "+second);
            }else /*if(first!=array.length-3)*/{
                first++;
                System.out.println("first "+first);
            }



            Thread.sleep(1000);
        }while(first!=6);

        return new int[1][1];

    }




}
