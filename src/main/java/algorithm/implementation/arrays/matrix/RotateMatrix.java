package algorithm.implementation.arrays.matrix;

/**
 * Rotate Matrix — rotate a square matrix 90° counterclockwise in place,
 * layer by layer. Extracts each ring into a flat array, shifts it, puts it back.
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9,  8,  7}
        };
        rotateCounterClockwise(matrix);
        print(matrix);
    }

    public static void rotateCounterClockwise(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first  = layer;
            int last   = n - 1 - layer;
            int perimeter = 2 * ((last - first) + (last - first));

            int[] ring = new int[perimeter];
            int idx = 0;

            // Extract ring elements clockwise
            for (int i = first; i <= last;     i++) ring[idx++] = matrix[first][i];
            for (int i = first + 1; i <= last; i++) ring[idx++] = matrix[i][last];
            for (int i = last - 1; i >= first; i--) ring[idx++] = matrix[last][i];
            for (int i = last - 1; i > first;  i--) ring[idx++] = matrix[i][first];

            // Shift 2 positions forward (counterclockwise by one step = 2 positions in the ring)
            int[] shifted = new int[perimeter];
            System.arraycopy(ring, 2, shifted, 0, perimeter - 2);
            System.arraycopy(ring, 0, shifted, perimeter - 2, 2);

            // Place shifted ring back
            idx = 0;
            for (int i = first; i <= last;     i++) matrix[first][i]  = shifted[idx++];
            for (int i = first + 1; i <= last; i++) matrix[i][last]   = shifted[idx++];
            for (int i = last - 1; i >= first; i--) matrix[last][i]   = shifted[idx++];
            for (int i = last - 1; i > first;  i--) matrix[i][first]  = shifted[idx++];
        }
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.printf("%3d", val);
            System.out.println();
        }
    }
}
