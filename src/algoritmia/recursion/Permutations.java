package algoritmia.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Write a function that takes in an array of unique integers and returns an array of all permutations of those integers in no particular order.
 *
 * If the input array is empty, the function should return an empty array.
 */

/**
 *
 * 12 2
 * 21
 *
 * 123 6
 * 132
 * 213
 * 231
 * 312
 * 321
 *
 *
 * 1234 24
 * 1243
 * 1324
 * 1342
 * 1423
 * 1432
 *
 * 2134
 * 2143
 * 2314
 * 2341
 * 2413
 * 2431
 *
 * 3124
 * 3142
 * 3214
 * 3241
 * 3412
 * 3421
 *
 * 4123
 * 4132
 * 4213
 * 4231
 * 4312
 * 4321
 */
public class Permutations {

    public static void main(String[] args) {


        List<Integer> array = List.of(1,2,3,4);
        List<List<Integer>> result = getPermutations(array);
        System.out.println("final result "+result);
        System.out.println("size "+result.size());
        result.stream().forEach(l-> System.out.println(l));

    }

    public static List<List<Integer>> getPermutations(List<Integer> array){

        /**
         * 1 234
         *   2 34
         *   2 43
         *
         */


        //System.out.println("call on "+array);
        List<List<Integer>> finalList = new ArrayList<>();

        permute(new ArrayList<>(), array,finalList);


        return finalList;
    }

    public static List<List<Integer>> permute (List<Integer> previous, List<Integer> array, List<List<Integer>> finalList){
        if(array.size()>1){

            for (int i = 0; i <array.size() ; i++) {
                List<Integer> newlist = new LinkedList<>(array);
                int removed = newlist.remove(i);
                System.out.println(" previous "+previous+" r "+removed+" new "+newlist);
                List<Integer> temp = new ArrayList<>();
                temp.addAll(previous);
                temp.add(removed);
//                temp.addAll(newlist);
//                System.out.println("temp "+temp);
                List<Integer> insert = new ArrayList<>();
                insert.addAll(temp);
                insert.addAll(newlist);
                if(!finalList.contains(insert))
                    finalList.add(insert);

                permute(temp, newlist,finalList);
            }



        }else {//add swaps

            finalList.add(new ArrayList<>(array));

        }

        return finalList;
    }



    public static List<List<Integer>> getPermutations2(List<Integer> array) {
        // Write your code here.

        List<List<Integer>> list = new ArrayList<>();

        int iters = getIter(array.size());
        int length = array.size();
        System.out.println("iters "+iters);

        for (int i = 0; i < iters; i++) {
            System.out.println("i "+i);
            int count =1;
            for (int j = length-1; j >=0 ; j--) {
                int fib = fibonacci(count);
                System.out.println("fib "+fib);

                System.out.println(array.get(j)+" ");
                System.out.println("count "+count);


                count++;
            }
            System.out.println();

        }




        System.out.println("final list  "+list);





        return array.size()>0?list: new ArrayList<>();
    }

    public static int getIter(int length){

        if(length>0){
            System.out.println("length "+length);
            return  length * getIter( (length-1));
        }else return 1;

    }

    public static int rate(int pos, int length){
        if(pos <= (length -1) && pos >= length -3){
            return 1;
        }else {

        }
        return 0;
    }

    public static int fibonacci(int n){

        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            return 1;
        }
        else if (n==0){  // caso base
            return 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }

    }


}
