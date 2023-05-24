package algoritmia.files;

import java.io.*;
import java.io.FileWriter;

public class FileTestReadWrite {
	
	public static void main(String[] args) {
		
		char[] in = new char[50];
		int size =0;
		
		try {
			File f = new File("Filewrite.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("howdy\nfolks\n");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(f);
			size = fr.read(in);
			System.out.println(size + " ");
			for(char c : in) {
				System.out.print(c);
			}
			fr.close();
		}catch(IOException e) {
			
		}
	}

}
