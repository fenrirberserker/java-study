package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
		 list.add("Gamma");
		 list.add("Beta");
		 list.add("Delta");
		 list.add("Alpha");
		 
		 
		 Collections.sort(list);
		 System.out.println("Simple sort");
//		 for(String s: list) {
//			 System.out.println("element "+s);
//		 }
		 list.forEach((s)->{System.out.println(s);});
		 
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.compareTo(s2);
//			}
//
//		});
		 
		 Comparator<String> comp =(s1,s2)->{
			 return s1.compareTo(s2);
		 };
		 Collections.sort(list, comp);
		 
		 System.out.println("Comparator sort");
//		 for(String s: list) {
//			 System.out.println("element "+s);
//		 }
		 list.forEach((s)->{System.out.println(s);});
		 
//		 Iterator<String> i = list.iterator();
//		 while(i.hasNext()) {
//			 System.out.println("elem "+i.next());
//		 }
		 list.forEach((s)->{System.out.println(s);});

	}

}
