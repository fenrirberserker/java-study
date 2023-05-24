package algoritmia.sorting;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {2,3,6,8,4,5,7,9,6,1};
        merge(array, new int[array.length], 0, array.length-1);
        System.out.println("sorted ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void merge(int[] array, int[] temp, int leftStart, int rigthEnd){

        if(leftStart >= rigthEnd){
            return;
        }
        int middle = (leftStart + rigthEnd)/2;
        merge(array, temp, leftStart, middle);
        merge(array, temp, middle+1, rigthEnd);
        mergeHalves(array, temp, leftStart, rigthEnd);
    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
        int leftEnd =(rightEnd+leftStart)/2;
        int rigthStart = leftEnd+1;
        int size = rightEnd - leftStart+1;

        int left = leftStart;
        int rigth = rigthStart;
        int index = leftStart;

        while(left<=leftEnd && rigth<= rightEnd){
            if(array[left] <= array[rigth]){
                temp[index] = array[left];
                left++;
            }else{
                temp[index] = array[rigth];
                rigth++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd-left+1);
        System.arraycopy(array, rigth, temp, index, rightEnd-rigth+1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }
}
