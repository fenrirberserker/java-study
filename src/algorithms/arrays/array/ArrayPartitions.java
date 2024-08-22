/**
 * Partitioning a list of elements into a list of lists
 */
package algorithms.arrays.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Find all the different partitions of groups of 1,2,.3...n numbers in an array
 */

public class ArrayPartitions {

    public static void main(String[] args) {

        int n = 3;
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");

        System.out.println("result "+ partition(1,list));
        System.out.println("result "+ partition(2,list));
        System.out.println("result "+ partition(3,list));
        System.out.println("result "+ partition(4,list));
        System.out.println("result "+ partition(5,list));

    }

    public static List<List<String>> partition(int size, List<String> list){

        List<List<String>> newlist = new ArrayList<List<String>>();


        int length = list.size();
        int mod = length%size;
        int groups = 0;

        if(mod==0){
            groups=length/size;
        }else{
            groups=(length/size)+1;
        }
        for(int i=0;i<groups;i++){
            int start = i*size;//get start index
            int end = (i*size +size < length)?(i*size+size):length;//get end index
            List<String> sub = list.subList(start, end);
            newlist.add(sub);
        }

        return newlist;

    }




}
