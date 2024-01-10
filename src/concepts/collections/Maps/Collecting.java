package concepts.collections.Maps;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Collecting {
	
	public static void main(String[] args) {

		List<String> list = Arrays.asList("lions", "tigers", "bears");

		//joining strings
		String result = list.stream().collect(Collectors.joining(","));
		System.out.println("joining "+result);

		//averaging
		Double avg = list.stream().collect(Collectors.averagingInt(String::length));
		System.out.println("averaging "+avg);

		//to collection
		TreeSet<String> map3 = list.stream().filter(s->s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
		System.out.println("collect to tree "+map3);

		//collect toMap
		Map<String, Integer> map4 = list.stream().collect(Collectors.toMap(s -> s, String::length));
		System.out.println("toMap "+map4);

		Map<Integer, String> map5 = list.stream().collect(Collectors.toMap(String::length,s->s,(a,b)->a+","+b));
		System.out.println("collisions "+map5);

		Map<Integer, String> map6 = list.stream().collect(Collectors.toMap(String::length,s->s,(a,b)->a+","+b, TreeMap::new));
		System.out.println("collisions with collection "+map6);

		//grouping
		Map<Integer, List<String>> map7 = list.stream().collect(groupingBy(String::length));
		System.out.println("grouping "+map7);
		
		Map<Integer, Set<String>> map8 = list.stream().collect(groupingBy(String::length, Collectors.toSet()) );
		System.out.println("grouping toSet "+map8);
		
		Map<Boolean, List<String>> part1 = list.stream().collect(Collectors.partitioningBy(s->s.length() <=5));
		System.out.println("partitioning "+part1);

		Map<?, ?> map9 = list.stream().collect(groupingBy(String::length,Collectors.counting()));//? for any type
		System.out.println("groupingBy String length "+map9);


	}
	



}
