package algorithms.numbers;

/**
 * If divisible by 3 print fizz
 * If divisible by 5 print buzz
 * If divisible by both print FizzBuzz
 */

public class DivisibleBy35 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30 };
        printDiv(arr);

    }

    public static void printDiv(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
            if(array[i]%15==0){
                System.out.println("FizzBuzz");
            }else if(array[i]%3==0){
                System.out.println("Fizz");
            }else if(array[i]%5==0){
                System.out.println("Buzz");
            }
//            System.out.println();
        }
    }


}
