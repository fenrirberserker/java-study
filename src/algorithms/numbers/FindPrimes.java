package algorithms.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Find al the prime numbers less than n
 */

public class FindPrimes {

    public static void main(String[] args) {
        int number1 = 8;

        getPrimes(number1);
    }
    
    public static List<Integer> getPrimes(int num){

        List<Integer> primes = new ArrayList<>();
        

        while(num>0){
            System.out.println("number "+num);
            boolean isPrime = true;

            for (int i = num-1; i > 1; i--) {
                System.out.println(num+" % "+i+" = "+num%i);

                if(num%i==0){
                    isPrime=false;
                    System.out.println("not Prime");
                }

            }
            if(isPrime){
                System.out.println(num+ " is Prime number");
                primes.add(num);
            }
            num--;
        }primes.forEach(x->{
            System.out.println(x);
        });

        return primes;
    }
    
    
    
}
