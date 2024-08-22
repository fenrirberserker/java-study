package algorithms.arrays.array;

public class IsSubArray {

    public static void main(String[] args) {
        Integer[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        Integer[] sequence = {1, 6, -1, 10};
        boolean isValid = isValidSub(array,sequence);

        System.out.println("Sequence is sub array? = "+isValid);
    }

    public static boolean isValidSub(Integer[] array, Integer[] sequence){
        int index=0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[i] = "+array[i]);
            if(array[i]==sequence[index]){
                System.out.println("match array[i] = sequence[index] = "+sequence[index]);
                index++;
            }
            if(index==sequence.length){
                System.out.println("end of sequence");
                return true;
            }

        }
        return false;

    }
}
