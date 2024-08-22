package algorithms.arrays.matrix;

/**
 * Calculate the difference between two diagonals in the matrix
 * first diag left to right
 * second diag right to left
 */

public class DiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int sum1 = getSum(matrix);

        System.out.println("sum is "+sum1);

    }


    public static int getSum(int[][] matrix){

        int sumfirst = 0;
        int sumsecond = 0;
        int ii = matrix.length-1;
        int ij = 2;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
                if(i==j){//first diag
                    System.out.println("matrix "+matrix[i][j]);
                    sumfirst+=matrix[i][j];
                    System.out.println("inverse "+matrix[i][ij]);
                    sumsecond+=matrix[i][ij];
                }
            }
            System.out.println();
            ij --;
        }

        System.out.println("sumfirst "+sumfirst);
        System.out.println("sumsecond "+sumsecond);

        int sum = sumfirst-sumsecond;
        return sum;

    }
}
