package algorithms.files;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		 
		try{
			File f = new File("File.txt");
			boolean newfile = false;
			System.out.println(f.exists());
			newfile = f.createNewFile();
			System.out.println(newfile);
			System.out.println(f.exists());
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
