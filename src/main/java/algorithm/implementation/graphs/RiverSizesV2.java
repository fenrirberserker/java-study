package algorithm.implementation.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * River Sizes V2 — finds sizes of all rivers in a binary matrix using iterative DFS.
 * 1 = water, 0 = land. Adjacent 1s (up/down/left/right) form a single river.
 * Uses a visited[][] boolean array instead of a HashMap for O(1) lookup per cell.
 */
public class RiverSizesV2 {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0, 1, 0},
            {1, 0, 1, 0, 0},
            {0, 0, 1, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 1, 1, 0}
        };
        System.out.println("Sizes " + riverSizes(matrix));
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

    // Iterative DFS — avoids stack overflow on large matrices
    private static int dfs(int[][] matrix, boolean[][] visited, int startRow, int startCol) {
        int size = 0;
        List<int[]> stack = new ArrayList<>();
        stack.add(new int[]{startRow, startCol});

        while (!stack.isEmpty()) {
            int[] cell = stack.remove(stack.size() - 1);
            int row = cell[0];
            int col = cell[1];

            if (visited[row][col]) continue;
            visited[row][col] = true;

            if (matrix[row][col] == 0) continue;
            size++;

            for (int[] neighbor : neighbors(matrix, row, col)) {
                if (!visited[neighbor[0]][neighbor[1]]) stack.add(neighbor);
            }
        }
        return size;
    }

    private static List<int[]> neighbors(int[][] matrix, int row, int col) {
        List<int[]> result = new ArrayList<>();
        if (row - 1 >= 0)                result.add(new int[]{row - 1, col});  // up
        if (row + 1 < matrix.length)     result.add(new int[]{row + 1, col});  // down
        if (col - 1 >= 0)                result.add(new int[]{row, col - 1});  // left
        if (col + 1 < matrix[0].length)  result.add(new int[]{row, col + 1});  // right
        return result;
    }
}
