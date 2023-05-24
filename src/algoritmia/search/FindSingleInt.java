/**
 * Given a list of numbers with pairs
 * find the single integer
 */
package algoritmia.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * Find from an input the number that is single
 */

public class FindSingleInt {

    public static void main(String[] args) {

        //System.out.println("Single is "+readInput());
        System.out.println(readInput());


    }

    public static int readInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        Stream<String> stream = null;
        List<Integer> ints = new ArrayList<Integer>();
        int single = 0;


        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stream = Stream.of(s.split(" "));
        stream.sorted().forEach(e->{
            System.out.println("elem "+e);
            //e.replace(",","");
            ints.add(Integer.parseInt(e.replace(",","")));
        });
        //.collect(Collectors.toCollection(ints))

        for (int i = 0; i < ints.size(); i++) {
            if(i==0 && (ints.get(i+1)!=null) && (ints.get(i+1)!=ints.get(i)) ){
                single = ints.get(i);
                System.out.println("single is "+single);
                return single;
            }
            else if(i==ints.size()-1 && (ints.get(i-1)!=ints.get(i))){
                single = ints.get(i);
                System.out.println("single is "+single);
                return single;
            }else if(i>=1 && i<ints.size()-2 && ints.get(i-1)!=ints.get(i) && ints.get(i+1)!=ints.get(i)){
                single = ints.get(i);
                System.out.println("single is "+single);
                return single;
            }
        }
        return single;
    }
}
