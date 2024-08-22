package algorithms.sorting;

/**
 * 
 * @author Miguel Alba
 *@mail mlex.alba@gmail.com
 *
 *
 *Given an array sort it by different methods
 *
 */

public class SortNumbers {

	public static void main(String[] args) {
	
		int[] arr = {3,9,6,4,7,8,5,2,1};
		new SortNumbers().sort(arr);
	}
	
	
	public int[] sort(int[] arr) {
		
		
		int min = 0;
		int minindex=0;
		int leftindex=0;
		int temp = 0;
		boolean unordered = true;
		
		while(leftindex<arr.length) {
//			leftindex=0;
			System.out.println("\nsmallest "+arr[leftindex]+" index "+leftindex+" vs: ");
			for(int i=leftindex+1;i<arr.length;i++) {
				System.out.printf("%d ",arr[i]);
//				min=arr[i];
				//search the minimum
				if(arr[leftindex]>arr[i]) {
					
					//set the minimum
//					min=arr[i];
					
					//swap
					temp=arr[i];
					arr[i]=arr[leftindex];
					System.out.println("\nswap "+temp+" for "+arr[leftindex]+" leftindex "+leftindex);
					arr[leftindex]=temp;
					
//					temp=arr[leftindex];
//					arr[leftindex]=arr[i];
//					System.out.println("\nswap "+temp+" for "+arr[leftindex]+" leftindex "+leftindex);
//					arr[i]=temp;
					for (int n : arr) {
						System.out.printf("%d ",n);
					}
					System.out.println();
					
				}
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			leftindex++;
			System.out.println("leftindex "+leftindex);
			for (int i : arr) {
				System.out.printf("%d ",i);
			}
		}
		
		
		return arr;
		
		
		
	}

}
