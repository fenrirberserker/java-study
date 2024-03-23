package algoritmia.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Checks if a String matches a pattern
 *
 */
public class PatternsMatchers {
	
	
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\w+");
		String sample = "hola";
		
		Matcher matcher = pattern.matcher(sample);
		
		if( matcher.matches()) {
			System.out.println("found");
		}

		String s1 = "Eva, Can I Stab Bats In A Cave?";
		System.out.println(removeNonAlpha(s1));

	}

	public static String removeNonAlpha(String s){

		return s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
	}
	

}
