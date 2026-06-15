package algorithm.implementation.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * River Sizes — finds all river sizes in a binary matrix using recursive DFS.
 * 1 = water, 0 = land. Adjacent 1s (up/down/left/right) form one river.
 * See RiverSizesV2 for the iterative version with a stack.
 */
public class RiverSizes {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {1, 0, 1, 0, 0},
            {1, 0, 1, 0, 1},
            {1, 0, 1, 1, 1}
        };
        System.out.println("Sizes: " + riverSizes(matrix));
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> sizes = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (!visited[row][col] && matrix[row][col] == 1) {
                    sizes.add(dfs(matrix, visited, row, col));
                }
            }
        }
        return sizes;
    }

    private static int dfs(int[][] matrix, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= matrix.length
                || col < 0 || col >= matrix[0].length
                || visited[row][col]
                || matrix[row][col] == 0) return 0;

        visited[row][col] = true;
        return 1
            + dfs(matrix, visited, row - 1, col)  // up
            + dfs(matrix, visited, row + 1, col)  // down
            + dfs(matrix, visited, row, col - 1)  // left
            + dfs(matrix, visited, row, col + 1); // right
    }
}
