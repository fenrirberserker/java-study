package algoritmia.collections.lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindNthElement {

    public static void main(String[] args) {



    }





    private static void extracted() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new LinkedList<String>();
        try {
            Integer n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            list = Arrays.asList(line.split(" "));
            System.out.println("number " +n);
            System.out.println("list "+list);

            int reverseindex = list.size();
            if(n>reverseindex){
                System.out.println("NIL");

            }else{
                System.out.println("size "+list.size());
                for(int i =list.size() ; i>(list.size()-n); i--){
                    System.out.println("iter "+i);
                    reverseindex-=i;

                }
                //int reverseindex = list.size()-index;
                //int index = list.size()-sum;
                System.out.println("reverse index = "+reverseindex);
                System.out.println("value = "+list.get(list.size()-n));
                //System.out.println("value reverse index= "+list.get(reverseindex));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
