package algorithms.arrays.array;

/**
 * Given an array, return the product of the multiplication of every other element
 * without including the current evaluating index
 *
 */
public class ArrayOfProducts {

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 4, 2};
        product(arr1);


    }

    public static int[] product(int[] array){
        //set
        int[] result = new int[array.length];

        //iterate
        for (int i = 0; i < array.length; i++) {
            System.out.println("Eval "+array[i]);

            int sum =0;
            int right =1;
            int left =1;

            if(i+1 < array.length){

                right = multiply(array,i,true);
                System.out.println("Right "+right);
            }
            if(i-1 >= 0){
                left = multiply(array,i,false);
                System.out.println("Left "+left);


            }
            sum = right*left;
            System.out.println("Result is "+sum);

            result[i] = sum;

        }

        //return
        return result;
    }

    public static int multiply(int[] array,int i,boolean direction){
        int result =1;

        if (direction){//true=right
            for (int j = i+1; j < array.length; j++) {
                result = result*array[j];
            }
        }else{//false=left
            for (int j = i-1; j >= 0 ; j--) {
                result = result*array[j];
            }
        }
        return result;
    }

}
