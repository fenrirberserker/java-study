package algoritmia.arrays.array;

/**
 * Find the first and last index of a target
 */
public class FindFirstLastIndex {

    public static void main(String[] args) {
        int target  = 5;
        int[] arr = {3,5,6,7,9,3,9,0,5,7,6,8,6,5,8,5,2,1};

        int[] result = findIndexes(target,arr);
        for (int i:result) {
            System.out.print(i+",");
        }
    }

    public static int[] findIndexes(int target, int[] arr){

        int start = 0;
        boolean first = false;
        int end = arr.length-1;
        boolean last = false;
        int[] result = {-1,-1};

        for (int i = 0; i < arr.length; i++) {
            if(arr[start]==target && !first){
                first = true;
                result[0] = start;
            }
            if(arr[end]==target && !last){
                last = true;
                result[1] = end;
            }
            start++;
            end--;
        }

        return result;
    }
}
