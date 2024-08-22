package algorithms.recursion;

/**
 * 
 * @author FENRIR
 *
 *
 *sum ints from an array from a range of indexes
 *taken from another array
 *
 */

public class SumRanges {

	public static void main(String[] args) {
		
		int[] nums = {2,6,7,8,9,1,3};
		int[][] ranges = {{0,2},{2,5},{3,6}};
		
		int length = ranges.length;
		System.out.println("length "+length);
		int index=0;
		
		int sum=0;
		
		sum += getSum(nums, ranges, index, length, sum);
		
	}
	
	public static int getSum(int[] nums, int[][] ranges, int index, int length, int sum) {
		
		System.out.println("iter "+index+" length "+length+" start "+ranges[index][0]+" end "+ranges[index][1]);
		
		int ini = ranges[index][0];
		int fin = ranges[index][1];
		
		System.out.println("ini "+ini+" fin "+fin);
		if(index<length) {
			
			for(int i=ini;i<=fin;i++) {
				System.out.print(i+" ");
				sum+=nums[i];
			}
			
			System.out.println("\npartial sum "+sum);
			if(index<length-1) {
				index++;
				sum+=getSum(nums, ranges, index, length, sum);
			}
			
			
			return sum;
			
		}
		
		
		return sum;
	}

}
