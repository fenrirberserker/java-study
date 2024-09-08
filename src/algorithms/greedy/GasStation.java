package algorithms.greedy;


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

        /*int[] gas =  {1,5,3,3,5,3,1,3,4,5};
        int[] cost = {5,2,2,8,2,4,2,5,1,2};*/
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int index = findIndex2(gas,cost);
        System.out.println("Index "+index);

    }

    public static int findIndex2(int[] gas, int[] cost) {

        //if(totalCost>totalGas){exit condition return -1}
        for (int i = 0; i < gas.length; i++) {//test all the elements
            if(canTraverse2(gas, cost, i)){
                return i;
            }else{
                //i = i+next
            }
        }
        return -1;
    }

    //cyclically traverse all elements starting at the nth position
    public static boolean canTraverse2(int[] gas, int[] cost, int start) {
        int i=start;
        int n = gas.length;
        int currentgas = 0;
        while(!(i == start-1)){

            System.out.println("index "+i+" gas: "+gas[i]+" cost: "+cost[i]);
            currentgas += (gas[i] - cost[i]);
            System.out.println("Current gas is "+currentgas);
            if(currentgas < 0){
                System.out.println("not possible");
                return false;//return next index
            }
            i = (i+1)%n;
        }
        return true;
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
        int n = gas.length;
        boolean started = false;

        while (i != start || !started) {
            started = true;
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                System.out.println("not possible");
                return false;
            }
            System.out.println("i "+i+" gas[i] "+gas[i]+" cost[i] "+cost[i]);
            i = (i + 1) % n;
        }
        return true;
    }


}
