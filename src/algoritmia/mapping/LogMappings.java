package algoritmia.mapping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;


	
	// A job has a name and one or more instances. Each instance has a globally unique ID number.
	//Given this list of input lines:
	//
	//Started name=dump_logs jobid=f863
	//Started name=dump_logs jobid=g301gas
	//…
	//Ended jobid=f863 time=1021
	//Started name=grep_logs jobid=ac3de
	//Ended jobid=g301gas time=1343
	//Started name=read_logs jobid=r0eas
	//
	//Started name=write_logs jobid=dg2dz
	//Ended jobid=r0eas time=103
	//Ended jobid=ac3de time=52
	//
	//Print out the names of distinct jobs (not job instance IDs, so de-dupe on job name) with the longest running individual job instances (no totaling). Note they can be out of order.
	//So the output for the above would be:
	//
	//Name Time
	//dump_logs 1343
	//read_logs 103


	class LogMappings {
	  public static void main(String[] args) {
	    String[] lines = new String[] {
	      "Started name=dump_logs jobid=f863",
	      "Ended jobid=g301gas time=1343",
	      "Started name=dump_logs jobid=g301gas",
	      // ...
	      "Ended jobid=f863 time=1021",
	      "Started name=grep_logs jobid=ac3de",
	      "Ended jobid=g301gas time=1343",
	      "Started name=read_logs jobid=r0eas",
	      // ...
	      "Started name=write_logs jobid=dg2dz",
	      "Ended jobid=r0eas time=103",
	      "Ended jobid=ac3de time=52"
	    };

	    for (String string : lines) {
	      System.out.println(string);
	    }
	    
	    Set<String> set = getJobNames(lines);
	    addJobIds(set, lines);
	  }
	  
	  //get Job Names
	  public static Set<String> getJobNames(String[] lines){
	   
	    //use concepts.streams
	    Stream<String> str = Stream.of(lines);
	    
	    //System.out.println("Stream content");
	    
	    //str.forEach(System.out::println);
	    
	    //structure for containing job_names
	    Set<String> set = new HashSet<String>();
	    
	    
	    str.filter((s)->s.contains("_logs")).forEach((s)->{
	      s = s.substring(s.indexOf("=")+1,s.indexOf("j")-1 );
	      set.add(s);
	    });
	    
	    System.out.println("Unique job names"); 
	    for(String s : set){
	      System.out.println(s); 
	    }
	    
	    return set;
	  }
	  
	  public static void addJobIds(Set<String> set, String[] lines){
	   
	    Stream<String> str = Stream.of(lines);
	    
	    //saving job ids and time
	    Map<String,String> map = new HashMap<String,String>();
	    
	    
	    //get the job id & get time
	    str.filter((s)->s.contains("time")).forEach((s)->{
	      String id = s.substring(s.indexOf("=")+1,s.indexOf("t")-1); 
	      String time = s.substring(s.lastIndexOf("="), s.length()-1 );
	      
	      map.put(id,time);
	    
	    });
	    System.out.println("Unique process");
	    for(Map.Entry<String, String> entry : map.entrySet()){
	      System.out.println("key "+entry.getKey()+" value "+entry.getValue() );
	    }
	    
	    
	  }
	  
	  
	}



