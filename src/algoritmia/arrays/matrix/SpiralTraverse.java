package algoritmia.arrays.matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpiralTraverse {

    static int sizeX=0;
    static int sizeY=0;
    public static void main(String[] args) {

        int[][] array = {
  {1,   2,  3, 4},
  {12, 13, 14, 5},
  {11, 16, 15, 6},
  {10,  9,  8, 7},
};


        spiralTraverse(array);

    }

    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.


        sizeX = array.length;
        sizeY = array[0].length;
        int niter = sizeX * sizeY;
        int iter = 1;
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int x =0;
        int y =0;
        int direction =1;

        findNext(0,0,direction,array,map,list, iter, niter);



        return new ArrayList<Integer>();
    }

    static void findNext(int x, int y, int direction, int[][] array, Map<String, Integer> map, List<Integer> list, int iter, int niter){

        System.out.println("index "+x+" "+y+" = "+array[x][y]+" loop "+iter);

        if(x >= 0 && x <sizeX && y>=0 && y<sizeY && iter!=niter){

            int value = 0;
            String key = "";


            if(direction==1 && !map.containsKey(String.valueOf(x+(y+1)))){//right
                value = array[x][y+1];
                key = String.valueOf(x+(y+1));

            } else if (direction==2 && !map.containsKey(String.valueOf((x-1)+y))) {//down
                value = array[x-1][y];
                key = String.valueOf((x-1)+y);

            } else if (direction == 3 && !map.containsKey(String.valueOf(x+(y-1)))) {//left
                value = array[x][y-1];
                key = String.valueOf(x+(y-1));

            } else if (direction == 4 && !map.containsKey(String.valueOf((x+1)+y))) {
                value = array[x+1][y];
                key = String.valueOf((x+1)+y);
            }

            map.put(key,value);
            System.out.println(key+" "+value);
            list.add(value);

            iter++;
            findNext(x,y,direction,array,map,list,iter,niter);

        }

    }
}
