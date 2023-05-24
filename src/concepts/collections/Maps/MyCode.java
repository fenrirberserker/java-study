package concepts.collections.Maps;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class MyCode {
    public static void main (String[] args) {

        List<String> input = Arrays.asList("cats", "redraw", "tap", "dog", "pat",
                "acts", "drawer", "remote", "reward", "god");

        Map<Object, String> map = new HashMap<>();

        map = input.stream().collect(Collectors.toMap( k ->{
            char[] chars = k.toCharArray();
            Arrays.sort(chars);
            String str = "";
            for (Character c:chars) {
                str += c;
            }
            return str;
        }
        , Function.identity(), (a,b) -> a+","+b ) );

        System.out.println(map);

        List<List<String>> result = new ArrayList<>();
        map.entrySet().forEach(
                e -> {
                    List<String> list =
                            Arrays.stream(e.getValue().split(",")).collect(Collectors.toList());
                    result.add(list);
                }
        );

        System.out.println("result "+result);

    }

}