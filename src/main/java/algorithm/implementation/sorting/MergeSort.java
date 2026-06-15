package algorithm.implementation.sorting;

/**
 * Merge Sort — divide-and-conquer O(n log n) stable sort.
 * Split array in half recursively, sort each half, then merge the two sorted halves.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {2, 3, 6, 8, 4, 5, 7, 9, 6, 1};
        sort(array, new int[array.length], 0, array.length - 1);
        for (int n : array) System.out.print(n + " ");
    }

    public static void sort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) return;
        int mid = (leftStart + rightEnd) / 2;
        sort(array, temp, leftStart, mid);
        sort(array, temp, mid + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd   = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size       = rightEnd - leftStart + 1;

        int left  = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) temp[index++] = array[left++];
            else                             temp[index++] = array[right++];
        }

        System.arraycopy(array, left,  temp, index, leftEnd   - left  + 1);
        System.arraycopy(array, right, temp, index, rightEnd  - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }
}
