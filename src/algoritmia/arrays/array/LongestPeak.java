package algoritmia.arrays.array;



/**
 * Find the longest group of arrays that together form the highest peak in the entire array
 * return length the group that forms the longest peak
 */

public class LongestPeak {




    public static void main(String[] args) {

        int[] array1 =  {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int[] array2 =  {1, 3, 2};
        int[][] arrays = {array1,array2};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Result is "+longest(arrays[i]));

        }

    }

    static public int longest(int[] array){

        int highest = 0;
        int index = 0;


        if(array.length==0){
            return 0;
        }



        for(int i=1;i< array.length-1;i++){
            System.out.print(array[i]+" ");
            if(array[i]>=array[i-1] && array[i]>=array[i+1]){
                System.out.println("high peak "+array[i]);
                if(array[i]>highest){

                    highest=array[i];
                    index = i;
                    System.out.println("replace highest "+highest);
                }
            }
        }
        System.out.println("Index is "+index);
        int left = index;
        int right = index;

        int size = getSize(array,left,right,1);

        return size;
    }

    static public int getSize(int[] array, int left, int right, int size){
        
        if(right+1<array.length && array[right+1]<array[right]){
            size++;
            right++;
            return getSize(array, left, right, size);
        } else if (left-1>=0 && array[left-1]<array[left]) {
            size++;
            left--;
            return getSize(array, left, right,size);
        } else {
            return size;
        }
    }


}
