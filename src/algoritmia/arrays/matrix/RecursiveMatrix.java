package algoritmia.arrays.matrix;

public class RecursiveMatrix {

	public static void main(String[] args) {
		
		int[][] gridInt = new int[][] {{1,1,1,0,1}, 
									   {1,1,0,1,0},
									   {0,1,0,0,1},
									   {1,0,0,0,1}};
									   
		getNumIslandsRec(gridInt);
		
	}
	
	
	//solucion recursiva
	public static int getNumIslandsRec(int[][] sample) {
		//initialize
		int islands =0;
		int xlength = sample[0].length;//elems in array
		int ylength = sample.length;//num arrays
		
		System.out.println("xlength "+xlength);
		System.out.println("ylength "+ylength);
		
		
		
		//iterate array
		for (int y = 0; y < ylength; y++) {
			sample = markX(sample, y, 0);
		}
		
		for (int x = 0; x < xlength; x++) {
			sample = markY(sample, 0, x);
		}
		
		for (int y = 0; y < ylength; y++) {
			for (int x = 0; x < xlength; x++) {
				System.out.print(/*"["+y+"]["+x+"]: "+*/sample[y][x]+" ");
				if(sample[y][x]==1) {
					islands++;
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println("Num islands "+islands);
		return islands;
		
	}
	
	public static int[][] markX(int[][] sample,int y,int x) {
		
		if((x + 1 < sample[0].length)) {
			if ((sample[y][x]==1 || sample[y][x]==8) && (sample[y][x+1]==1 || sample[y][x+1]==8)) {
				sample[y][x + 1] = 8;
			}
			System.out.println("+x "+sample[y][x+1]);
			return markX(sample, y, x+1);
		}
		else {
			return sample;
		}
				    
	}
	
	public static int[][] markY(int[][] sample,int y,int x){
		
		if(y + 1 < sample.length) {
			if ((sample[y][x]==1|| sample[y][x]==8) && (sample[y+1][x]==1 || sample[y+1][x]==8)) {
				sample[y + 1][x] = 8;
			}
			
			System.out.println("+y " + sample[y + 1][x]);
			return markY(sample, y + 1, x);
		}
		else {
			return sample;
		}
	}
	
	
	
	
	//brute force approach
	/*public static int getNumIslands(int[][] sample) {
		//initialize
		int islands =0;
		int xlength = sample.length;
		int ylength = sample[0].length;
		
		//iterate array
		for(int i=0;i<xlength;i++) {
			boolean island = false;
			
			
			for(int j=0;j<ylength;j++) {
				
				if(sample[i][j]==1) {
					//sostiene valor 1 hasta que encuentre un 0
					
					island=true;
					
				}else {
					island = false;
				}
				
				//do some other validations
				if(!island) {
					islands++;
				}
				
				
			}
		}
		
		
		
		return islands;
		
	}
	
	//create a function that searches for all adjacent numbers in search of zero (after locating 1)
	public static int getNumIslands(int[][] sample) {
		
		int 
	}*/
	
	

}
