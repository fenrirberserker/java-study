package algorithms.recursion;

/**
 *
 * Combine a number sequence
 * adding the next number
 * combined with all the previous
 */
public class Combinations {

    public static void main(String[] args) {

        int n = 5;
        int[] array = {1,2,3,4,5};

        generate(new StringBuilder(), 0,array);


    }


    public static void generate(StringBuilder str, int index, int[] array){

        StringBuilder sb = new StringBuilder();
        int[] temp = new int[array.length];

        if(index<array.length){
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];

                System.out.println(temp[i]);
                generate(sb.append(temp[i]), index+1,array);
            }
            //sb.append(temp[i]);


        }else{

        }


        //return "";

    }
}
