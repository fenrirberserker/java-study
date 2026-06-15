package algorithm.implementation.greedy;

/**
 * Gas Station — find the single starting station from which you can complete
 * a circular route without running out of gas. Returns -1 if impossible.
 * Strategy: try each station as starting point; stop if tank drops below 0.
 * O(n²) brute force. For O(n) see GasStation2.
 */
public class GasStation {

    public static void main(String[] args) {
        int[] gas  = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println("Starting index: " + findStartingStation(gas, cost)); // 3
    }

    public static int findStartingStation(int[] gas, int[] cost) {
        for (int startStation = 0; startStation < gas.length; startStation++) {
            if (canCompleteCircuit(gas, cost, startStation)) return startStation;
        }
        return -1;
    }

    private static boolean canCompleteCircuit(int[] gas, int[] cost, int startStation) {
        int tank    = 0;
        int station = startStation;
        boolean started = false;

        while (station != startStation || !started) {
            started = true;
            tank += gas[station] - cost[station];
            if (tank < 0) return false;
            station = (station + 1) % gas.length;
        }
        return true;
    }
}
