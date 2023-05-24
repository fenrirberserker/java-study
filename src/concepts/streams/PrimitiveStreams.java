package concepts.streams;

import java.util.OptionalDouble;
import java.util.stream.*;

public class PrimitiveStreams {

	public static void main(String[] args) {

		IntStream intstream = IntStream.of(1,2,3);
		//LongStream
		//DoubleStream
		OptionalDouble avg = intstream.average();
		System.out.println(avg.getAsDouble());
		
		DoubleStream random = DoubleStream.generate(Math::random);
		random.limit(3).forEach(System.out::println);
		DoubleStream fractions = DoubleStream.iterate(.5, d->d/2);
		fractions.limit(3).forEach(System.out::println);
		
		IntStream count = IntStream.iterate(1, n->n+1);
		count.limit(5).forEach(System.out::println);
		
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		IntStream rangec = IntStream.rangeClosed(1, 5);
		rangec.forEach(System.out::println);
		
		IntStream stream = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = stream.average();
		optional.ifPresent(System.out::println);
		System.out.println(optional.getAsDouble());
		System.out.println(optional.orElseGet(()->Double.NaN));
		
		LongStream longs = LongStream.of(5,10);
		long sum = longs.sum();
		System.out.println(sum);
		
		DoubleStream doubles = DoubleStream.generate(()-> Math.PI);
//		OptionalDouble min = doubles.min(); //infinite run
		
		
		
	}

}
