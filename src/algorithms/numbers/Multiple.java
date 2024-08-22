/**
 * Given number n
 * print all the numbers inclusive
 * for numbers multiple of 3 print Fizz
 * for numbers multiple of 5 print Buzz
 * for numbers multple of both, print FizzBuzz
 */

package algorithms.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Find if a number is multiploe of 3, 5 or both
 */
public class Multiple {

    public static void main(String[] args) {

        int number = readInput();
        evaluate(number);
    }

    public static int readInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = null;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }

    public static void evaluate(int n){

        Stream<Integer> s = Stream.iterate(1, x -> x+1).limit(n);

        Predicate<Integer> m3 = x->x%3==0;
        Predicate<Integer> m5 = x->x%5==0;

        s.forEach(num->{
            StringBuilder sb = new StringBuilder();

            if(m3.test(num)){
                sb.append("Multiple of 3");
            }
            if (m5.test(num)){
                sb.append("Multiple of 5");
            }
            if(!(sb.toString().contains("Multiple of 3") || (sb.toString().contains("Multiple of 5")))){
                sb.append(String.valueOf(num));
            }
            System.out.println(sb);
        });
    }
}
