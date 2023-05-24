package algoritmia.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author FENRIR
 *
 *Given a String, count number of each letter incidences
 */

public class CountLetters {

	public static void main(String[] args) {
		
		String sample =  "elperromeestamordiendo";
		map(sample);
	}
	
	
	public static void map(String sample) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i=0;i<sample.length();i++) {
			
			Character c = sample.charAt(i);
			
			if(map.containsKey(c)) {
				map.replace(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}

//		map.entrySet().forEach(System.out::println);
		System.out.println(map);

		
	}

}
