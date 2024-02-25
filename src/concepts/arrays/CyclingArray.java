package concepts.arrays;

public class CyclingArray {

    public static void main(String[] args) {
        int[] elems = {1,5,3,3,5,3,1,3,4,5};

        int start = 3;
        int i = start;
        int n = elems.length;
        boolean started = false;
        while (i != start || !started ) {
            started = true;
            System.out.println("i "+i+" (i+1) "+(i + 1)+" % "+n+" ( (i + 1) % n ) "+((i + 1) % n));
            i = (i + 1) % n;
        }
    }
}
