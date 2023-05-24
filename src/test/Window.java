package test;
import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.*;


public class Window {
	
	public static void main(String[] args) {
		
		//1. Create the frame.
		JFrame frame = new JFrame("GUI");
		JLabel label = new JLabel("Hola");
		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//3. Create components and put them in the frame.
		//...create emptyLabel...
		frame.getContentPane().add(label, BorderLayout.CENTER);

		//4. Size the frame.
		frame.pack();

		//5. Show it.
		frame.setVisible(true);
		try {
//			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "shutdown -s -t 36000");
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "hola %username%");
			Process p = builder.start();
			} catch (IOException e) {
			e.printStackTrace();
			}

		
	}

}
