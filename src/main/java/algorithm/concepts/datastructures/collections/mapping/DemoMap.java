package algorithm.concepts.datastructures.collections.mapping;

import java.util.HashMap;
import java.util.Map;

/**
 *  Map<K, V> — minimal API tour.
 *    put / get / remove          — basic access
 *    putIfAbsent / replace       — conditional write
 *    computeIfAbsent             — runs only when key missing
 *    computeIfPresent            — runs only when key present
 *    compute                     — runs in both cases (v == null if absent)
 *    merge                       — combine old + new (classic counter)
 */
public class DemoMap {

    public static void main(String[] args) {

        // put — insert or overwrite (returns previous value).
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);                              // {1=3}
        map.put(2, 5);                              // {1=3, 2=5}
        System.out.println(map);

        // computeIfPresent — runs only if key present; replaces value.
        map.computeIfPresent(2, (k, v) -> k * v);   // 2*5 = 10
        System.out.println(map);

        // computeIfAbsent — runs only if key missing; inserts value.
        map.computeIfAbsent(7, k -> k * k);         // 7*7 = 49
        System.out.println(map);

        // compute — runs always; v is null when key absent.
        map.compute(1, (k, v) -> v + 100);          // 3+100 = 103
        System.out.println(map);


        // merge — insert value if absent, else combine(old, value).
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : "aaabbc".toCharArray()) {
            counts.merge(c, 1, Integer::sum);       // start at 1, +1 on repeat
        }
        System.out.println(counts);                 // {a=3, b=2, c=1}
    }
}
