package algoritmia.numbers;

/**
 * 
 * @author FENRIR
 *
 *
 *Generate 100 progressive numbers from a sample array
 */

public class GenerateCodes {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		new GenerateCodes().generateCodes(arr, 1000);

	}
	
	public void generateCodes(int[] arr, int numbercodes) {
		
		int codelength = 1;
		int arraypos =1;
		
		int[] counter = {0};
		
		
		for(int i=1;i<numbercodes-1;i++) {//for codes
			System.out.println("iteration "+(i)+" arraypos "+arraypos+" codelength "+codelength);
			
			String code ="";
			
			
			
			

			
			if( (i)== Math.pow(6, codelength) ) {
				codelength++;
				counter = new int[codelength];
				
				System.out.println("switch counter length "+codelength);
				
			}
			
			int multiplier = 1;
			for (int c=counter.length-1;c>=0;c--) {
				
				System.out.println("pos "+c+" multiplier "+multiplier);
				if(multiplier==1) {
					if(counter[c]<5) {
						counter[c]++;
					}else {
						counter[c]=0;
					}
				}else if((i)== Math.pow(6, multiplier)) {
					
					if(counter[c]<5) {
						counter[c]++;
					}else {
						counter[c]=0;
					}
				}
				
				multiplier++;
				delay();
			}
			
			
			System.out.println("code " );
			for (int j : counter) {
				System.out.print(j+" ");
			}
			System.out.println();
			if((i)%6==0 ) {
				arraypos=0;
			}
			arraypos++;
		}
		
		
	}
	
	
	
	public Integer[] evalCounter(int count, int arraylength, Integer[] counter) {
		
		for (int i = counter.length - 1; i >= 0; i--) {
			
			if(count==arraylength-1) {
				counter[i]=0;
				
			}
		}

		return counter;
		
	}
	
	public String getCode(Integer[] counter, String[] arr) {
		
		String code="";
		
		
		for(int i=0;i<counter.length;i++) {
			code+=counter[i];
		}
		
		return code;
		
	}
	
	public void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
