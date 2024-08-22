package algorithms.arrays.array;


/**
 * Given an array of numbers arr and a target
 * find the pair of numbers that add up to the target
 * return the indexes of those numbers
 *
 */
public class TwoNumberSum {

    public static void main(String[] args) {

        int[] arr = {5,11,7,2};
        int target = 9;
        int[] indexes = findIndexes(arr, target);
        System.out.println("Indexes: " + indexes[0] + ", " + indexes[1]);
    }


    public static int[] findIndexes(int[] arr, int target){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1,-1};
    }


}
