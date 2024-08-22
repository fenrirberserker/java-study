package algorithms.arrays.matrix;

/**
 * 
 * @author FENRIR
 *
 *Given a NxN matrix, rotate all it's elements 1 position
 *
 */

public class MatrixRotation {

	public static void main(String[] args) {
		
		int[][] matrix = {{3,5,8},
						  {7,8,2},
						  {9,1,6}};
		rotate(matrix);
		printMatrix(matrix);
	}
	
	public static void rotate(int[][] matrix){
		
		int carry =0;
		
		//x row/y column
//		int x,y;
		
//		System.out.println(matrix.length);
		
		int xlength =matrix.length;
		int ylength =matrix[0].length;
		
//		int[][] newmatrix = new int[xlength][ylength];
		
		System.out.println("xlength "+xlength+" ylength "+ylength);
		
		carry = matrix[0][0];
		System.out.println("Carry "+carry);
		
		printMatrix(matrix);
		
		//subroutine
		
		//left to right
		for(int x=0; x<xlength;x++) {
			int val = matrix[0][x];
			System.out.println("+Xaxis "+val);
		}
		
		//top bottom
		for(int y=0; y<(ylength);y++) {
			int val = matrix[y][ylength-1];
			System.out.println("+Yaxis "+val);
		}
		
		//right to left
		for(int x=(xlength-1);x>=0;x--){
			int val = matrix[ylength-1][x];
			System.out.println("-Xaxis "+val);
		}
		
		//bottom up
		for(int y=(ylength-1);y>=0;y--) {
			int val = matrix[y][0];
			System.out.println("-Yaxis "+val);
		}
		
	}
	
	public static void printMatrix(int[][] matrix) {
		
		for(int x=0;x<matrix.length;x++) {
			for(int y=0;y<matrix[x].length;y++) {
				System.out.print(matrix[x][y]+" ");
				
			}
			System.out.println();
			
		}
	}
	
	
	

}
