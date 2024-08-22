package algorithms.search.recursive;

public class RecursiveSearch {

    public static void main(String[] args) {

        int[] array = {5,9,3,6,4,8,7,2};
        int index =0;

        search(index, array);
    }

    public static void search(int index, int[] array){



        if(index>=0 && index<array.length){
            System.out.println("index: "+index+" item: "+array[index]);
            search(index+1,array);
        }


    }
}
