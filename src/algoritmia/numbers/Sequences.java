package algoritmia.numbers;

import java.util.Arrays;
import java.util.List;

public class Sequences {

    public static void main(String[] args) {

        Integer[] arr = {5, 1, 22, 25, 6, -1, 8, 10};
        Integer[] seq = {1, 6, -1, 10};
        List<Integer> array = Arrays.asList(arr);
        List<Integer> sequence = Arrays.asList(seq);

        isValidSubsequence(array, sequence);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.



        boolean isEqual = false;
        String strarray = "";
        String strseq = "";
        if(sequence.size()>array.size()){
            return false;
        }
        for(int i=0; i<sequence.size(); i++){
            strseq += String.valueOf(sequence.get(i));

            for(int j=0; j<array.size(); j++){

                if(sequence.get(i)==array.get(j)){
                    strarray += String.valueOf(array.get(j));
                }

            }

        }
        if(strseq.equals(strarray)){
            isEqual = true;
        }else{
            isEqual = false;
        }

        System.out.println("Value is "+isEqual);


        return isEqual;
    }



}
