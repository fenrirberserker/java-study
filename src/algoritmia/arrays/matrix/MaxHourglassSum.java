package algoritmia.arrays.matrix;

/**
 * Return the max hourglass sum of the array
 *
 * 1 1 1
 * 0 1 0
 * 1 1 1
 *
 * 2 4 4
 * 0 4 0
 * 2 2 2
 *
 *
 */
public class MaxHourglassSum {

    public static void main(String[] args) {

        int[][] matrix =
                       {{1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}};

        int result = maxSum(matrix);
        System.out.println(result);

    }

    public static int maxSum(int[][] matrix){

        int maxSum = -63;//lowest possible value (7*-9)

        for (int i = 0; i <=3; i++) {
            for (int j = 0; j <=3 ; j++) {
                int current_sum=
                        matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+
                                   matrix[i+1][j+1]+
                        matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                if(current_sum>maxSum){
                    maxSum=current_sum;
                }
            }

        }

        return maxSum;


    }
}
