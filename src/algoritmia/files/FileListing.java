package algoritmia.files;

import java.io.*;

public class FileListing {

	public static void main(String[] args) {
		 
//		List<File> filelist = new ArrayList<File>();
		String[] filelist = new String[100];
		File dir = new File("C:\\Windows");
		filelist = dir.list();
		
		for (String string : filelist) {
			System.out.println(string);
		}

	}

}
