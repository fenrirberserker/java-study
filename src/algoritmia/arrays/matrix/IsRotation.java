package algoritmia.arrays.matrix;

/**
 * 
 * @author FENRIR
 *
 *
 *Given two arrays, tell if one is rotation of another
 *
 */
public class IsRotation {

	public static void main(String[] args) {
		
		int[] a = {6,8,9,5,2,4,7};
		int[] b = {2,4,7,6,8,9,5};
		
		isRotation(a, b);
		
	}
	
	public static boolean isRotation(int[] a, int[] b) {
		
		int ia = 0;
		int ib = 0;
		
		
		while(true ) {
			
			System.out.println("a "+a[ia]+" b "+b[ib]);
			if(b[ib]==a[ia]){
				//start iterating b
				
				
				
				if(ia==a.length-1) {
					ia=0;
				}else if(ib==b.length-1) {
					ib=0;
				}else {
					ia++;
					ib++;
				}
				
				
			}
			else {
				if(ib==b.length-1) {
					ib=0;
				}
				ib++;
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
