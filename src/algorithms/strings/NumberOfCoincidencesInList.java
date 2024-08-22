package algorithms.strings;

import java.util.ArrayList;
import java.util.List;

public class NumberOfCoincidencesInList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("jackson");
        list.add("jacques");
        list.add("jack");
        list.add("jackma");

        String sufix = "jack";

        int result1 = getNumber(list,sufix);
        //System.out.println(result1);

    }

    public static int getNumber(List<String> list, String sample){

        int matches =0;

        matches = (int)list.stream().filter(s->s.contains(sample)).count();
        System.out.println(matches);

        return matches;

    }
}
