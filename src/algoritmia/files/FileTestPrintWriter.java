package algoritmia.files;

import java.io.*;

public class FileTestPrintWriter {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			File dir = new File("Directory");
			dir.mkdir();
			System.out.println("directory exists "+dir.exists());
			File f = new File(dir,"FileWriter2.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("howdy");
			pw.println("folks");
			fw.flush();
			fw.close();
			
			f = new File(dir, "FileWriter2.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
//			String data = br.readLine();
//			System.out.println(data);
//			data = br.readLine();
//			System.out.println(data);
			String data="";
			
			while((data=br.readLine()) != null) {
				System.out.println(data);
//				br.readLine();
			}
			
			File del = new File("delete.txt");
			del.createNewFile();
			System.out.println("file exists "+del.exists());
			del.delete();
			System.out.println("file exists "+del.exists());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		 
		

	}

}
