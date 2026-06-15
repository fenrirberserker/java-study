package challenges.interviews;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**Open any Java or JavaScript compiler and write code to solve this problem. Show your screen.

 If a=1, b=2, c=3, …………. z= 26, and 1=1, 2=2, 3=3, etc.; input an alphanumeric string and calculate the sum of that string.

 Input: hello123

 Output: 58

 (Where h=8, e=5, l=12, l=12, o=15, 1=1, 2=2, 3=3)*/
public class ParseStringValue {

    static Map<Character,Integer> map = new HashMap<>();

    public static void main(String[] args) {

        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        map.put('f',6);
        map.put('g',7);
        map.put('h',8);
        map.put('i',9);
        map.put('j',10);
        map.put('k',11);
        map.put('l',12);
        map.put('m',13);
        map.put('n',14);
        map.put('o',15);
        map.put('p',16);
        map.put('q',17);
        map.put('r',18);
        map.put('s',19);
        map.put('t',20);
        map.put('u',21);
        map.put('v',22);
        map.put('w',23);
        map.put('x',24);
        map.put('y',25);
        map.put('z',26);



        int result = convert("hello123");
        System.out.println(result);



    }

    public static int convert(String str){

        int sum = 0;

        String regex = "[a-z]";
        Pattern p = Pattern.compile(regex);


        for(Character c :str.toCharArray()){

            if(p.matcher(String.valueOf(c)).matches()){
                sum += map.get(c);
            }else{
                sum += Integer.parseInt(String.valueOf(c));
            }


        }

        return sum;

    }




}
