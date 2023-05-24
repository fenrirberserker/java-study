package algoritmia.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\w+");
		String sample = "hola";
		
		Matcher matcher = pattern.matcher(sample);
		
		if( matcher.matches()) {
			System.out.println("found");
		}
	}
	

}
