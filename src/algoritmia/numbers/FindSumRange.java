package algoritmia.numbers;

/**
 * Find the sequence numbers in an array that summed are equal to the target num
 */

public class FindSumRange {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,10,11};
        int target =6;
        getResult(array1,target);
    }

    public static int[] getResult(int[] array, int target){

        int i =0;
        int j =i+1;

        while (i< array.length-1) {
            System.out.println("array i ["+i+"] "+array[i]);
            int temp =array[i];

            while(temp<target){
                System.out.println("array j ["+j+"] "+array[j]);
                temp+=array[j];

                if(temp==target){
                    System.out.println("temp "+temp);
                    break;
                }
                j++;
            }
            i++;

        }

        return null;

    }
}
