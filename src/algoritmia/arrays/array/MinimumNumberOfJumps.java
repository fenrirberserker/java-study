package algoritmia.arrays.array;

/**
 * Find the minimum number of jumps in an array from start to end
 * 1 represents no position
 * 0 represents available position
 * You can jump 1 or 2 times at once
 */

public class MinimumNumberOfJumps {

    public static void main(String[] args) {

        int[] array = {0, 0, 1, 0, 0, 1, 0};
        getJumps(array);

    }

    public static int getJumps(int[] array){

        int jumps =0;
        int i=0;
        while(i< array.length) {
            System.out.println("i "+i+" = "+array[i]);
            if((i+2)< array.length && array[i+2]==0){
                i+=2;
                jumps++;
            } else if ((i+1)< array.length && array[i+1]==0) {
                i+=1;
                jumps++;
            }
            if (i>=6){
                break;
            }
        }

        System.out.println("jumps "+jumps);
        return jumps;

    }
}
