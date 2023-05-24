package algoritmia.strings;

import java.util.*;

public class AnagramaInList {
	static String word = "AMOR";
	static String[] data = {"ROMA", "OMAR", "MORA", "RAMO"};
	static List<String> datalist = Arrays.asList(data);
	static int size = word.length();


	public static void main(String[] args) {
		List<String> wordblacklist = new ArrayList<String>();
		for(String s: datalist){
			
			boolean ismatch = false;
			String newstring = "";
			
			while(!ismatch){
				
				newstring = generateWord(wordblacklist);
				wordblacklist.add(newstring);
				
				System.out.println(newstring);
				if(datalist.contains(newstring)){
					System.out.println("Found "+newstring);
					ismatch = true;
				}
			}
			wordblacklist.add(newstring);
			
		}
//		wordblacklist.add(newstring);
	}
	
	public static int generateNum(List<Integer> blacklist){
		
		Random rand = new Random();
		int num = rand.nextInt(size);
		if(blacklist.contains(num)){
			num = generateNum(blacklist);
		}
		return num;
		
	}
	
	public static String generateWord(List<String> wordblacklist){
				
		String newstring = "";
		char[] array = word.toCharArray();
		char[] newarray = new char[size];
		List<Integer> numblacklist = new ArrayList<Integer>();
								
		for(int i =0; i<size; i++){
			int n = generateNum(numblacklist);
			char c = array[n];
			newarray[i] = c;
			newstring += c;
			numblacklist.add(n);
		}
		
		if(wordblacklist.contains(newstring)){
			generateWord(wordblacklist);
		}
//		wordblacklist.add(newstring);
		return newstring;
		
	}

}
