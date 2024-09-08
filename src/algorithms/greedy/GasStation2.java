package algorithms.greedy;

public class GasStation2 {

    public static void main(String[] args) {
        /*int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};*/
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int startPosition = 2;

        int result = canCompleteCircuit(gas, cost, startPosition);

        if (result != -1) {
            System.out.println("Start at gas station: " + result);
        } else {
            System.out.println("It is impossible to complete the circuit.");
        }
    }

    public static int canCompleteCircuit(int[] gas, int[] cost, int start) {
        int n = gas.length;
        int totalGas = 0;   // Total gas available across the circuit
        int totalCost = 0;  // Total cost required to travel the circuit
        int currentGas = 0; // Current gas in the tank during traversal

        // Check feasibility: sum of all gas and costs
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // If the total gas is less than the total cost, the circuit cannot be completed
        if (totalGas < totalCost) {
            return -1;
        }

        int startStation = start; // Start from the given position
        int stationsVisited = 0;  // Count of visited stations

        while (stationsVisited < n) {
            int i = (startStation + stationsVisited) % n; // Cyclic traversal of the array
            currentGas += gas[i] - cost[i];

            // If at any point, currentGas is less than 0, reset the startStation
            if (currentGas < 0) {
                // This means starting from the original startStation wasn't viable, so move to the next one
                startStation = (i + 1) % n;
                currentGas = 0; // Reset currentGas
                stationsVisited = 0; // Reset the count of visited stations
            } else {
                stationsVisited++; // Successfully visited another station
            }
        }

        // If we successfully visit all stations, return the start position
        return startStation;
    }





}
