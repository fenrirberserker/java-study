package test;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TryTest {
	
	public static void main(String[] args)  {

		int[] arr = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		int start = 4;
		int i=start;

		while(true){

			if(i == start-1){
				break;
			}
			System.out.println(i+" "+arr[i]);

			i = (i+1)%n;
		}



	}

}
