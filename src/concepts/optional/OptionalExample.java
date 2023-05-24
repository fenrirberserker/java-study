package concepts.optional;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) throws Exception {
		Optional<Double> res = average(5,7,9,5,2,3,5,5);


		if(res.isPresent())
			System.out.println(res.get());

		String str = "string";
		String s = Optional.of(str).orElseGet(()->"else");
		System.out.println(s);

		Optional<Double> opt2 = average();
		System.out.println(opt2.orElse(Double.NaN));
		System.out.println(opt2.orElseGet(()->Math.random()));
		System.out.println(opt2.orElseThrow(()->new Exception()));



	}

	public static Optional<Double> average(int... scores){

		if(scores.length==0){
			return Optional.empty();
		}
		int sum=0;
		for(int score: scores) {
			sum += score;
		}
		return Optional.of((double) sum/scores.length);
	}
	
	
	

}
