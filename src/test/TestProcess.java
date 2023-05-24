package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class TestProcess {

	public static void main(String[] args) {
		try {
//			Process proc = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//			Process proc = Runtime.getRuntime().exec("C:\\Windows\\regedit.exe");
//			System.out.println(Runtime.getRuntime().exec("cmd"));
//			Process proc = Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe");
			
			 // Execute command
//		    String command = "cmd /c start cmd.exe echo %username%";
//		    Process child = Runtime.getRuntime().exec(command);
		    

		    // Get output stream to write from it
//		    OutputStream out = child.getOutputStream();
//
//		    out.write("cd C:/ /r/n".getBytes());
//		    out.write("echo hola".getBytes());
//		    out.flush();
//		    out.write("dir /r/n".getBytes());
//		    out.close();
			
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "echo hola %username%");
//			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "shutdown -s -t 36000");
//		        builder.redirectErrorStream(true);
		        Process p = builder.start();
		        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		        String line;
		        while (true) {
		            line = r.readLine();
		            if (line == null) { break; }
		            System.out.println(line);
		        }
		        
		        

			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
