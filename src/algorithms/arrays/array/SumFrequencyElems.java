package algorithms.arrays.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 *   Given an array of pairs representing the teams that have competed against each
 *   other and an array containing the results of each competition, write a
 *   function that returns the winner of the tournament. The input arrays are named
 *
 *
 *   It's guaranteed that exactly one team will win the tournament and that each
 *   team will compete against all other teams exactly once. It's also guaranteed
 *   that the tournament will always have at least two teams.*
 */
public class SumFrequencyElems {

    public static void main(String[] args) {

        String[][] competitions = {{"HTML","C#"},{"C#","Python"},{"Python","HTML"}};
        Integer[] results = {0,0,1};

        tournamentWinner(competitions,results);
    }

    //does not include losers
    public static String tournamentWinner(String[][] competitions, Integer[] results){

        AtomicReference<String> winner = new AtomicReference<>("");
        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i< competitions.length;i++){
            String winnerkey = "";

            for (int j = 0; j < competitions[i].length; j++) {
                String key = competitions[i][j];
                //map.put(key,0);
                System.out.print(key+" ");
            }

            if(results[i]==0){
                winnerkey = competitions[i][0];
            }
            if(results[i]==1){
                winnerkey = competitions[i][1];
            }

            System.out.println();
            System.out.println("Winner "+winnerkey);

            if(map.get(winnerkey)==null){
                map.put(winnerkey, 1);
            }else{
                int freq = map.get(winnerkey)+1;
                map.put(winnerkey, freq);
            }

            System.out.println();


        }

        System.out.println("Map "+map);
        AtomicInteger max= new AtomicInteger();
        map.entrySet().forEach((Map.Entry<String,Integer> n)->{
            if(n.getValue()> max.get()){
                max.set(n.getValue());
                winner.set(n.getKey());
            }

        });

        System.out.println("Winner is "+winner.get());

        return winner.get();

    }


    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Map<String,Integer> map = new HashMap<>();

        competitions.stream().forEach((e)->{
            e.stream().forEach((n)->{
                System.out.println(n);

            });

        });



        return "";
    }
}
