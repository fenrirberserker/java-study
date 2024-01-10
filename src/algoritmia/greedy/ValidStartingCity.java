package algoritmia.greedy;

/**
 * Imagine you have a set of cities that are laid out in a circle, connected by a circular road that runs clockwise. Each city has a gas station that provides gallons of fuel, and each city is some distance away from the next city.
 *
 * You have a car that can drive some number of miles per gallon of fuel, and your goal is to pick a starting city such that you can fill up your car with that city's fuel, drive to the next city, refill up your car with that city's fuel, drive to the next city, and so on and so forth until you return back to the starting city with 0 or more gallons of fuel left.
 *
 * This city is called a valid starting city, and it's guaranteed that there will always be exactly one valid starting city.
 *
 * For the actual problem, you'll be given an array of distances such that city i is distances[i] away from city i + 1. Since the cities are connected via a circular road, the last city is connected to the first city. In other words, the last distance in the distances array is equal to the distance from the last city to the first city. You'll also be given an array of fuel available at each city, where fuel[i] is equal to the fuel available at city i. The total amount of fuel available (from all cities combined) is exactly enough to travel to all cities. Your fuel tank always starts out empty, and you're given a positive integer value for the number of miles that your car can travel per gallon of fuel (miles per gallon, or MPG). You can assume that you will always be given at least two cities.
 *
 * Write a function that returns the index of the valid starting city.
 */
public class ValidStartingCity {

    public static void main(String[] args) throws InterruptedException {

        int[] distances = {10, 20, 10, 15, 5, 15, 25};
        int[] fuel =      { 0,  2,  1,  0, 0,  1,  1};
        int mpg = 20;

        int start = validStartingCity(distances,fuel,mpg);
        System.out.println("Starting city "+start);

    }

    public static int validStartingCity(int[] distances, int[] fuel, int mpg) {
        // Write your code here.

        int startingcity=0;

        for (int i = 0; i < distances.length; i++) {
            System.out.println("i "+i);
            int totalfuel = 0;
            int j=i;
            int cycles =0;
            int limit = distances.length;
            int count = 0;

            while (j< distances.length && cycles<2 && count < limit) {


                System.out.println("j "+j);
                System.out.println("count "+count);


                int currentFuel = fuel[j]*mpg;
                totalfuel+=currentFuel;
                System.out.println(" recharge "+currentFuel+" currentfuel "+totalfuel);
                int fuelRequired = distances[j];
                totalfuel-=fuelRequired;
                System.out.println(" fuelrequired "+fuelRequired+" fuelleft "+totalfuel);
//                if(currentFuel<fuelRequired){
//                    break;
//                }
                if(totalfuel<0){
                    break;
                }

                int nextIndex = j== distances.length-1?0:j+1;
                //System.out.println(" next city requires "+distances[nextIndex]);

                j = j==distances.length-1?0:j+1;
                count++;
                if(j==limit)
                    cycles++;
                if(count==limit && totalfuel==0){
                    return i;
                }

            }
            startingcity = i;

        }



        return startingcity;
    }


}
