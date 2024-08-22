package algorithms.combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsVar {

    public static void main(String[] args) {

        generateCombinations("234");

    }

    public static List<String> generateCombinations(String input){

        Character[] characters = new Character[input.length()];
        Integer[] indexes = new Integer[characters.length];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i]=0;
            characters[i] = input.charAt(i);
            System.out.print(/*indexes[i]+" "+*/characters[i]+" ");
        }
        System.out.println();

        int nval = 3;//max length character list //should validate with "" for outofindex


        combine(characters,indexes,nval);

        return new ArrayList<String>();

    }

    public static void combine(Character[] chars, Integer[] array, int nval){

        int n = array.length;
        System.out.println("elemenths "+n);

        int loops = (int)Math.pow(nval,n);
        System.out.println("loops "+loops);


        int[] factors = new int[n];
        int findex = n-1;
        for (int i = 0; i<factors.length; i++) {
            int mul = (int)Math.pow(nval,i);
            factors[findex]=mul;
            findex--;
        }

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < loops; i++) {

            for (int j = 0; j < array.length; j++) {

                Character c = chars[j];

                Character s = evalColumn(c, array, nval, factors, i, j);

                //System.out.print(s);

            }
            System.out.println();

            //System.out.println(String.format("%0"+n+"d",i));

        }


    }

    private static Character evalColumn(Character c, Integer[] array, int nval, int[] factors, int i, int j) {
        if(i % factors[j] == 0 && i > 0){
            array[j]++;
            if(array[j]==nval){
                array[j]=0;
            }
        }

//        System.out.print(array[j]);
        //String s = isChar ? getCharsForDigit(c).get(j)+" ": array[j]+" ";
        Character n = getCharsForDigit(c).get(array[j]);
        System.out.print(n);

        //System.out.print(s);
        return n;
    }

    public static List<Character> getCharsForDigit(char i){

        switch (i) {

            case '2':
                return Arrays.asList('A', 'B', 'C');

            case '3':
                return Arrays.asList('D', 'E', 'F');

            case '4':
                return Arrays.asList('G', 'H', 'I');

            case '5':
                return Arrays.asList('J', 'K', 'L');

            case '6':
                return Arrays.asList('M', 'N', 'O');

            case '7':
                return Arrays.asList('P', 'Q', 'R', 'S');
            case '8':
                return Arrays.asList('T', 'U', 'V');

            case '9':
                return Arrays.asList('W', 'X', 'Y', 'Z');

            default:
                return Arrays.asList('-');

        }

    }
}
