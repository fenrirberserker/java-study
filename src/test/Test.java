package test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

	public void m1(){
		throw new IllegalArgumentException();
	}



	public static void main(String[] args) {


		Stream<Test> s = Stream.of(new Test(),new Test());
		s.forEach( x ->
				{
					try{x.m1();}
					catch (Exception e){
						System.out.println();
					}
					finally {
						System.out.println();
					}
				}

		);


	}
	
	

}
