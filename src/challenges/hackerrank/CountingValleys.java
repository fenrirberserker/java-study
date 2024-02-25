package challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 *An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill, , or a downhill,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:
 *
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
 * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 *
 * Example
 *
 *
 *
 * The hiker first enters a valley  units deep. Then they climb out and up onto a mountain  units high. Finally, the hiker returns to sea level and ends the hike.
 *
 * Function Description
 *
 * Complete the countingValleys function in the editor below.
 *
 * countingValleys has the following parameter(s):
 *
 * int steps: the number of steps on the hike
 * string path: a string describing the path
 * Returns
 *
 * int: the number of valleys traversed
 * Input Format
 *
 * The first line contains an integer , the number of steps in the hike.
 * The second line contains a single string , of  characters that describe the path.
 *
 */

public class CountingValleys {

    public static void main(String[] args) {

        int steps = 8;
        String path = "UDDDUDUU";

        int result = countingValleys(steps, path);
        System.out.println(result);
    }


    public static int countingValleys(int steps, String path) {

        List<Integer> list = new ArrayList<>();
        int state = 0;
        int valleys = 0;

        for(char c: path.toCharArray()){
            if(c == 'U'){
                state++;
                list.add(state);
            }
            if(c == 'D'){
                state--;
                list.add(state);
            }
        }

        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)==(-1) && list.get(i+1)==0){
                valleys++;
            }
        }

        return valleys;

    }
}
