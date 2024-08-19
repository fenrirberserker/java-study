package algoritmia.arrays.matrix;

import java.util.LinkedList;

/**
 * You are given a 2D matrix of dimension  and a positive integer . You have to rotate the matrix  times and print the resultant matrix. Rotation should be in anti-clockwise direction.
 *
 * Rotation of a  matrix is represented by the following figure. Note that in one rotation, you have to shift elements by one step only.
 * It is guaranteed that the minimum of m and n will be even.

 *
 */
public class RotateMatrix {
    public static void aiRotate(int[][] matrix) {
        // The matrix's dimension is captured to handle the square matrix uniformly.
        int n = matrix.length;

        // The rotation is performed layer by layer, starting from the outermost layer and moving inward.
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer; // This identifies the starting index of the layer.
            int last = n - 1 - layer; // This identifies the ending index of the layer.
            int length = 2 * (last - first + last - first); // Calculates the total number of elements in the current layer.

            // A temporary array is created to hold the elements of the current layer so they can be manipulated without affecting the original matrix.
            int[] temp = new int[length];

            // The following loops extract elements from the matrix and store them in the temporary array in a sequential manner to preserve their order.
            int tIndex = 0;
            for (int i = first; i <= last; i++) {
                temp[tIndex++] = matrix[first][i]; // Extracting top edge
            }
            for (int i = first + 1; i <= last; i++) {
                temp[tIndex++] = matrix[i][last]; // Extracting right edge
            }
            for (int i = last - 1; i >= first; i--) {
                temp[tIndex++] = matrix[last][i]; // Extracting bottom edge
            }
            for (int i = last - 1; i > first; i--) {
                temp[tIndex++] = matrix[i][first]; // Extracting left edge
            }

            // The temporary array is then shifted by two positions counterclockwise.
            // This is achieved by first copying most of the array, then handling the wrap-around of the first two elements.
            int[] shifted = new int[length];
            System.arraycopy(temp, 2, shifted, 0, length - 2); // Main shifting excluding the first two elements
            System.arraycopy(temp, 0, shifted, length - 2, 2); // Wrapping the first two elements to the end

            // The shifted elements are then placed back into the matrix, updating the layer from which they were originally taken.
            tIndex = 0;
            for (int i = first; i <= last; i++) {
                matrix[first][i] = shifted[tIndex++]; // Placing shifted values back to the top edge
            }
            for (int i = first + 1; i <= last; i++) {
                matrix[i][last] = shifted[tIndex++]; // Placing shifted values back to the right edge
            }
            for (int i = last - 1; i >= first; i--) {
                matrix[last][i] = shifted[tIndex++]; // Placing shifted values back to the bottom edge
            }
            for (int i = last - 1; i > first; i--) {
                matrix[i][first] = shifted[tIndex++]; // Placing shifted values back to the left edge
            }
        }
    }

    // This method simply prints the matrix in a readable format to visualize the rotation effect.
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example matrix to demonstrate the rotation effect.
        int[][] matrix = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

//        aiRotate(matrix);
        rotate(matrix,2);
        printMatrix(matrix);
    }

    public static void rotate(int[][] matrix, int rotate){

        int x = 0;
        int y = 0+rotate;
        boolean start = false;
        LinkedList<Integer> queue = new LinkedList<>();

        while((true)){
            int current = matrix[x][y];
            System.out.println("x = " + x + ", y = " + y+" "+current);
            queue.add(current);

            y++;
        }
    }
}
















