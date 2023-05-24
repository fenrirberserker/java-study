package algoritmia.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {3,9,5,4,7,6,5,1};
        sort(array);
        System.out.println("sorted ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sort(int[] array){
        boolean isSorted = false;
        int lastIndex=array.length-1;
        while(!isSorted){
            isSorted=true;
            for(int i = 0; i<lastIndex;i++){//last element will always be in place
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                    isSorted=false;
                }
            }
            lastIndex--;
        }
    }

    public static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
