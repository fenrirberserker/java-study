package algoritmia.graphs;

import java.util.*;

/**
 * You're given a two-dimensional array (a matrix) of potentially unequal height and width containing only 0s and 1s.
 * Each 0 represents land, and each 1 represents part of a river.
 * A river consists of any number of 1s that are either horizontally or vertically adjacent (but not diagonally adjacent).
 * The number of adjacent 1s forming a river determine its size.
 *
 * Note that a river can twist. In other words, it doesn't have to be a straight vertical line or a straight horizontal line;
 * it can be L-shaped, for example.
 *
 * Write a function that returns an array of the sizes of all rivers represented in the input matrix.
 * The sizes don't need to be in any particular order.
 */

public class RiverSizesV2 {

    static Map<Integer[], Boolean> elems = new HashMap<Integer[], Boolean>();



    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}
            };

        List<Integer> sizes = riverSizes(matrix);
        System.out.println("Sizes "+sizes);
        //int size = checkNode(matrix,0,0);
        //System.out.println("size "+size);
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.
        List<Integer> sizes = new ArrayList<>();

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y]+ " ");
                Integer[] position = new Integer[]{x,y};
                elems.put(position,false);
            }
            System.out.println();
        }

        for (Map.Entry<Integer[], Boolean> elem :elems.entrySet()) {
            Integer[] position = new Integer[]{elem.getKey()[0],elem.getKey()[1]};
            if(!elem.getValue())
                checkNode(matrix,position);
        }



        return sizes;
    }

    public static int checkNode(int[][] matrix, Integer[] position){

        int size = 0;
        int x = position[0];
        int y = position[1];

        if(matrix[x][y] == 1){
            size++;
        }
        elems.replace(position,true);



        //up
        if(x-1 >= 0 && matrix[x-1][y] == 1){
            position=new Integer[]{x-1,y};
            elems.replace(position,true);
            if(elems.get(position))
            size += checkNode(matrix, position);
        }
        //down
        if(x+1 < matrix.length && matrix[x+1][y] == 1){
            position = new Integer[]{x+1,y};
            elems.replace(position,true);
            if(elems.get(position))
            size += checkNode(matrix, position);
        }
        //left
        if(y-1 >= 0 && matrix[x].length == 1){
            position = new Integer[]{x,y-1};
            elems.replace(position,true);
            if(elems.get(position))
            size += checkNode(matrix, position);

        }
        //right
        if(y+1 < matrix[x].length && matrix[x][y+1] == 1){
            position = new Integer[]{x,y+1};
            elems.replace(position,true);
            if(elems.get(position))
            size += checkNode(matrix, position);
        }

        return size;
    }


}
