package algoritmia.lists;

/**
 * Given a circular list of gas stations, where we can go from a station i to the station i + 1,
 * and the last one goes back to the first one,
 * find the index of the station from where we start to be able to traverse all the stations
 * and go back to the initial one without running out of gas.
 *
 * It can't be negatibe values
 */
public class GasStation {

    public static void main(String[] args) {

        int[] gas = {1,5,3,3,5,3,1,3,4,5};
        int[] cost = {5,2,2,8,2,4,2,5,1,2};

        int index = findIndex(gas,cost);
        System.out.println("Index "+index);

    }

    public static int findIndex(int[] gas, int[] cost){
        for (int i = 0; i < gas.length; i++) {
            if (canTraverse(gas, cost, i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean canTraverse(int[] gas, int[] cost, int start){

        int currentGas = 0;
        int i = start;
        int last = start-1;
        int n = gas.length;
        boolean started = false;

        while (i != start || !started) {
            started = true;
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                return false;
            }
            System.out.println("i "+i+" gas[i] "+gas[i]+" cost[i] "+cost[i]);
            i = (i + 1) % n;
        }
        return true;
    }


}
