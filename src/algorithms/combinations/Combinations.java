package algorithms.combinations;

import java.util.HashMap;
import java.util.Map;

/**
 * Generate combinations of numbers in a progressive fashion
 */

public class Combinations {

    public static void main(String[] args) {


        Integer[] array = {0,0,0};
        int nval = 4;//number of possible values

        combine(array,nval,false);
        //combineFormat(array,nval);

    }

    public static void combine(Integer[] array, int nval, boolean isChar){

        int n = array.length;
        System.out.println("elemenths "+n);

        int loops = (int)Math.pow(nval,n);
        System.out.println("loops "+loops);

        //Add factors to every column
        int[] factors = new int[n];
        int findex = n-1;
        for (int i = 0; i<factors.length; i++) {
            int mul = (int)Math.pow(nval,i);
            factors[findex]=mul;
            findex--;
        }

        //factor of change
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < loops; i++) {

            for (int j = 0; j < array.length; j++) {

                 String s = evalColumn(array, nval, isChar, factors, i, j);
            }
            System.out.println();

            //System.out.println(String.format("%0"+n+"d",i));

        }


    }

    private static String evalColumn(Integer[] array, int nval, boolean isChar, int[] factors, int i, int j) {
        if(i % factors[j] == 0 && i > 0){
            array[j]++;
            if(array[j]==nval){
                array[j]=0;
            }
        }

        String s = isChar ?intToChar(array[j])+"": array[j]+" ";
        System.out.print(s);
        return s;
    }

    public static void combineFormat(Integer[] array, int nval){

        int n = array.length;
        System.out.println("elemenths "+n);

        System.out.println("loops "+Math.pow(nval,n));

        int loops = (int)Math.pow(nval,n);

        for (int i = 0; i < loops ; i++) {
            String s = String.format("%0"+n+"d",i);
            //System.out.println(s);
            int[] intarr = new int[n];
            System.out.println();
            for (int j = 0; j <s.length() ; j++) {
//                System.out.print(s.charAt(j)+" ");
                intarr[j] = Integer.parseInt(String.valueOf(s.charAt(j))) ;
                System.out.print(intarr[j]+" ");
            }
        }

    }

    public static char intToChar(int i){

        Map<Integer, Character> map = new HashMap<>();
        map.put(0,'A');
        map.put(1,'B');
        map.put(2,'C');
        map.put(3,'D');
        map.put(4,'E');
        map.put(5,'F');
        map.put(6,'G');
        map.put(7,'H');
        map.put(8,'I');
        map.put(9,'K');
        map.put(10,'L');
        map.put(11,'M');
        map.put(12,'N');
        map.put(13,'O');
        map.put(14,'P');
        map.put(15,'Q');
        map.put(16,'R');
        map.put(17,'S');
        map.put(18,'T');
        map.put(19,'U');
        map.put(20,'V');
        map.put(21,'W');
        map.put(22,'X');
        map.put(23,'Y');
        map.put(24,'Z');



        return map.get(i);
    }
}
