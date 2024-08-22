package algorithms.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Use comparable to sort players according to score decreasing
 */

public class SortPlayersByScoreDecreasing {

    public static void main(String[] args) {

        Player p1 = new Player("John", 7.5);
        Player p2 = new Player("Micke", 8.5);
        Player p3 = new Player("Tom", 9.5);
        Player p4 = new Player("Jerry", 8.0);
        Player p5 = new Player("Maria", 9.0);

        List<Player> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        sort(list);

    }

    static List<Player> sort(List<Player> players){

        List<Player> sorted = players
                .stream()
                .sorted(Comparator.comparing(Player::getScore).reversed())
                .limit(3)//top 3
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        return null;

    }


}
