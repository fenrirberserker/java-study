package algoritmia.arrays.array;

import java.util.*;
import java.util.stream.*;

public class OverlappingArrays {

    public static void main(String[] args) {

        int[][] intervals = {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};

        mergeOverlappingIntervals(intervals);

    }

    public static int[][] mergeOverlappingIntervals2(int[][] intervals){


        String s = "";
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                s+=intervals[i][j];
            }
        }
        System.out.println(s);


        int i=0;
        int j=1;
        while(true){
            System.out.println("i "+i+" j "+j);
            if((j+1)<s.length()){
                if((j+1)<=j){
                    System.out.println(i);
                    System.out.println(j);
                    j+=2;
                }else {

                }
            }
        }

    }

    public static int[][] mergeOverlappingIntervals(int[][] intervals){



        List<List<Integer>> list = new ArrayList<>();

        int i=0;
        int start = intervals[i][0];
        int end = intervals[i][1];

        while (i<intervals.length){

            System.out.println("i "+intervals[i][0]+" "+intervals[i][1]);
            List<Integer> set = new ArrayList<>();



            if(i< intervals.length-1){

                if(intervals[i+1][0] <= intervals[i][1]){
                    set.add(start);
                    set.add(end);
                    end = intervals[i+1][1];

                }else {
                    set.add(start);
                    set.add(end);
                    start = intervals[i+1][0];
                    end = intervals[i+1][1];

                }

            }else if(i==intervals.length-1){

                if(intervals[i][0]<=intervals[i-1][1]){
                    end = intervals[i][1];
                    set.add(start);
                    set.add(end);
                }else{
                    set.add(start);
                    set.add(end);
                    start = intervals[i][0];
                    end = intervals[i][1];

                }
            }


            System.out.println(set);

            list.add(set);
            i++;


        }
        System.out.println(list);
        Map<Integer,List<Integer>> map = new HashMap<>();
        list.forEach(e->{

            map.put(e.get(0),e );
        } );
        System.out.println(map);
        int[][] result = new int[map.size()][2];

        List<List<Integer>> newl = map.values().stream().collect(Collectors.toList());
        System.out.println("newl "+newl);

        for (int x=0; x< newl.size(); x++){
            result[x][0] = newl.get(x).get(0);
            result[x][1] = newl.get(x).get(1);
        }

        for (int[] ints : result) {
            System.out.println(ints[0]+" "+ints[1]);
        }

        return result;
    }
}
