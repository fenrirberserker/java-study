package algoritmia.arrays.matrix;

/**
 * sum elements vertically
 */
public class MatrixIteration {

    public static void main(String[] args) {
        int[][] matrix = {
                {2,5,6},
                {3,5,9},
                {7,5,3}
        };

        iterate(matrix);

    }

    public static void iterate(int[][] matrix){

        for(int y=0;y<matrix.length;y++){
            for (int x=0;x<matrix[0].length;x++){
                System.out.print(matrix[y][x]+" ");
            }
            System.out.println();
        }


    }
}
