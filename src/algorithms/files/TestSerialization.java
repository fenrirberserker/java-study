package algorithms.files;

import java.io.*;

public class TestSerialization {

	public static void main(String[] args) {
		 Cat c = new Cat();
		 c.setSize(5);
		 
		 try {
			 FileOutputStream fos = new FileOutputStream("Catfile.ser");
			 ObjectOutputStream ous = new ObjectOutputStream(fos);
			 ous.writeObject(c);
			 ous.close();
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 
		 try {
			 FileInputStream fis = new FileInputStream("Catfile.ser");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 Cat gato = (Cat) ois.readObject();
			 ois.close();
			 System.out.println("gato size "+gato.getSize());
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 

	}

}
