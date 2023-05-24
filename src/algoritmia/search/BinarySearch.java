package algoritmia.search;

import java.util.Arrays;

/**
 * Find an element in an array
 * by using binary search
 * return true if exists, return false if it doesn't
 */

public class BinarySearch {

    public static void main(String[] args) {

        int x = 5;
        int[] array = {7,9,6,3,4,5,8,2,1};
        Arrays.sort(array);//must always be sorted in order to work properly

        System.out.println("found "+x+"? "+binarySearchRecursive(array,x));

    }

    public static boolean binarySearchRecursive(int[] array, int x){
        return binarySearchRecursive(array, x, 0, array.length-1);
    }

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right){
        System.out.println("array "+array+" left "+left+" rigth "+right);
        if(left>right){
            return false;
        }
        int mid = left +((right-left)/2); //to prevent overflow
        if(array[mid]==x){
            System.out.println("mid "+array[mid]);
            return true;
        }else if(x<array[mid]){
            System.out.println("recurse left");
            return binarySearchRecursive(array, x, left, mid-1);
        }else{
            System.out.println("recurse right");
            return binarySearchRecursive(array, x, mid+1, right);
        }
    }

    public static boolean binarySearchIterative(int[] array, int x){
        int left =0;
        int right = array.length-1;
        while(left<=right){
            int mid = left +((right-left)/2);
            if(array[mid]==x){
                return true;
            }else if(x<array[mid]){
                right = mid -1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }
}
