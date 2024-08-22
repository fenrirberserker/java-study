/**
 * Find the common elements between two arrays
 */
package algorithms.arrays.array;

import java.util.*;

public class CommonElement {

    public static void main(String[] args) {
        Integer[] a = {1,5,8,6,7};
        Integer[] b = {4,7,5,3,2,9};

        //use hashtables

        System.out.println("Common elements:");
        System.out.println("By O(n)2");
        getCommonsByN2(a,b).stream().forEach(System.out::println);
        System.out.println("By O(n)");
        getCommonsByHashTable(a,b).forEach(System.out::println);

    }

    public static List<Integer> getCommonsByN2(Integer[] a, Integer[] b){

        List<Integer> commons = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    commons.add(b[j]);
                }
            }
        }


        return commons;
    }

    public static List<Integer> getCommonsByHashTable(Integer[] a, Integer[] b){

        Map<Integer, Integer> ht = new Hashtable<>();

        List<Integer> elems = new ArrayList<>();
        //elems.forEach(System.out::println);


        Arrays.asList(a).stream().forEach(n->{
            ht.put(n,n);
        });

        Arrays.asList(b).stream().forEach(n->{
            if(ht.containsKey(n)){
                elems.add(n);
            }else{
                ht.put(n,n);
            }

        });

        return elems;
    }


}
