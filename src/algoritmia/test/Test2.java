package algoritmia.test;

import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//@Controller
class Test2{


    public static void main(String[] args) {

        String cp = "72550";
    }

    public static void getDealersFromDB( String cp ){

        List<Dealer> list = new ArrayList<>();//dealers


        List<Dealer> ordered = list
                .stream()
                .sorted(Comparator.comparing(Dealer::getCp))
                .filter(n->n.getCp().equals(cp))
                .collect(Collectors.toList());

        /*Dealer match =

                list
                        .stream()
                        .sorted(Comparator.comparing(Dealer::getCp))
                        .filter(n->n.getCp().equals(cp))
                        .collect(Collectors.toList());*/


        int i = 0;


        for (int j = 0; j < ordered.size(); j++) {

            if(ordered.get(j).getCp().equals(cp) ){
                i = j;
            }

        }

        List<Dealer> menores = ordered.subList(i-2,i);
        List<Dealer> mayores = ordered.subList(i, i+2);










    }




}