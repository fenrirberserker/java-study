package algoritmia.challenges.coderbyte;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class VLA2 implements Comparator<VLA2> {

    int dishSize;

    VLA2(int d){
        dishSize = d;
    }

    public static void main(String[] args) {
        VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60)};
        Arrays.sort(va, va[0]);
        int index = Arrays.binarySearch(va, new VLA2(40), va[0]);
        System.out.println(index + " ");
        index = Arrays.binarySearch(va, new VLA2(80), va[0]);
        System.out.println(index);
    }

    public int compare(VLA2 a, VLA2 b){
        return b.dishSize - a.dishSize;
    }


}
