package algorithm.implementation.arrays.array;

import java.util.Arrays;

/**
 * Array of Products — return array where each element is the product of all
 * other elements. No division allowed. O(n) using prefix and suffix products.
 */
public class ArrayOfProducts {

    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2};
        System.out.println(Arrays.toString(products(array))); // [8, 40, 10, 20]
    }

    // Build prefix products left-to-right, then multiply by suffix products right-to-left.
    public static int[] products(int[] array) {
        int[] result = new int[array.length];

        int prefixProduct = 1;
        for (int i = 0; i < array.length; i++) {
            result[i]     = prefixProduct;
            prefixProduct *= array[i];
        }

        int suffixProduct = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            result[i]     *= suffixProduct;
            suffixProduct *= array[i];
        }

        return result;
    }
}
