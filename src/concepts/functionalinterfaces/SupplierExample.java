package concepts.functionalinterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = LocalDate::now;
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		
		Supplier<StringBuilder> sb1 = StringBuilder::new;
		Supplier<StringBuilder> sb2 = ()-> new StringBuilder();
		
		System.out.println(sb1.get());
		System.out.println(sb2.get());
		
//		Supplier<ArrayList<String>> s1 = ArrayList<String>::new;//declare supplier type
//		ArrayList<String> a1 = s1.get();//creates a new instance of arraylist
//		System.out.println(s1);//ref to supplier
//		System.out.println(a1);//ref to arraylist
	}

}
