package algoritmia.combinations;

/**
 * Given an array of ints representing denominations and an integer representing target change
 * return the number of ways to make that change with the given denominations
 *
 * *unlimited coins*
 */
public class ChangeCombinations {

    public static void main(String[] args) {

        int n = 6;
        int[] denoms = {1,2,5};

        numberOfWaysToMakeChange(n,denoms);
    }

    public static int numberOfWaysToMakeChange(int n, int[] denoms) {

        int ncombinations =0;


        for (int i = 0; i < denoms.length; i++) {

            int current = denoms[i];

            if(n%current==0){
                System.out.println("combination "+n+"*"+current);
                ncombinations++;
            }

            for (int j = 0; j < denoms.length ; j++) {

                int second = denoms[j];

                if(n>=current+second){

                }
            }
        }

        return -1;
    }
}
