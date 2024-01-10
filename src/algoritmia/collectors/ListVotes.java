package algoritmia.collectors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Lista con nombres
 * -cada nombre es un voto
 * -buscar los más votados
 * -el más votado es el ganador
 * -si hay empate, ordenar alfabeticamente y tomar el último
 * -imprimir
 * */
public class ListVotes {

	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("Juan", "Pepe", "Luis", "Jessica", "Jessica", "Maria", "Maria", "Luis");

//		names.collect(Collectors.groupingBy(e->sortByName(e)))
		
		Map<String, List<String>> map =  groupByVotes(names);
		System.out.println("grouped "+map);
		
		Map<String, Integer> votesmap = countVotes(map);
		System.out.println("counted "+votesmap);
		
		Map<String, Integer> sortedmap = sortByName(votesmap);
		System.out.println("sorted "+sortedmap);
		
		sortedmap.forEach( (k,v)->{ System.out.println("Candidate "+k+" has "+v+" votes"); } );
		
		int max = getMax(sortedmap);
		
		System.out.println("The max vote is "+max);
		
		Map<String, Integer> winnersmap = getWinners(sortedmap, max);
		
		System.out.println("The winners are "+winnersmap);

	}
	
	public static Map<String, List<String>> groupByVotes(Stream<String> names) {
		Map<String, List<String>> map = names.collect( Collectors.groupingBy( s->s, Collectors.toList() ) ) ;
		
		return map;
	}
	
	public static Map<String, Integer> countVotes(Map<String, List<String>> map){
		
		Map<String, Integer> mapr = new HashMap<String, Integer>();
		
		map.forEach( (k,v)->{mapr.put(k, v.size()); } );
		return mapr;
	}
	
	public static Map<String, Integer> sortByName(Map<String, Integer> votesmap){
		
		Map<String, Integer> sortedmap = new TreeMap<String, Integer>(votesmap);
		return sortedmap;
		
	}
	
	public static int getMax(Map<String, Integer> sortedmap) {
		int max =0;
		for (Map.Entry<String, Integer> entry : sortedmap.entrySet() ) {
			max=(entry.getValue()>max)?entry.getValue():max;
		}
		return max;
	}
	
	public static Map<String, Integer> getWinners(Map<String, Integer> sortedmap, int max){
		Map<String, Integer> winnersmap = new HashMap<String, Integer>(); 
		for (Map.Entry<String, Integer> entry : sortedmap.entrySet()) {
			if(entry.getValue()==max) {
				winnersmap.put(entry.getKey(), entry.getValue());
			}
		}
		return winnersmap;
	}

}
