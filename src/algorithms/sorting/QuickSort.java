package algorithms.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {2,3,6,8,4,5,7,9,6,1};

        sort(array, 0, array.length-1);
        System.out.println("sorted ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sort(int[] array, int left, int rigth){

        if(left>=rigth){
            return;
        }
        int pivot = array[(left+rigth)/2];
        int index = partition(array, left, rigth, pivot);
        sort(array, left, index-1);
        sort(array, index, rigth);
    }

    public static int partition(int[] array, int left, int rigth, int pivot){

        while(left<=rigth){
            while(array[left]<pivot){
                left++;
            }
            while(array[rigth]>pivot){
                rigth--;
            }
            if(left<=rigth){
                swap(array, left, rigth);
                left++;
                rigth--;
            }
        }
        return left;
    }

    public static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
