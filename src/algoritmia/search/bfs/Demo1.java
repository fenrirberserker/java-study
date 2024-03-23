package algoritmia.search.bfs;

/**
 * Uses a queue to find the element
 *
 * Find all 1s adjacent elements
 */
public class Demo1 {

    public static void main(String[] args) {
        int[][] array ={{1,1,1,1},
                        {1,0,0,1},
                        {0,0,1,1},
                        {1,1,0,0}};

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
//        findAdjacent(2,2,array, false);
        findAdjacent(2,2,array);
    }

    public static void findAdjacent(int x, int y, int[][] array){
        System.out.println("position: "+x+","+y);


        if(x-1>=0 && x-1<array.length && y>=0 && y<array[x].length && array[x-1][y]==1){//up
            findAdjacent(x-1,y,array);

        }if(x+1>=0 && x+1<array.length && y>=0 && y<array[x].length && array[x+1][y]==1){//down
            findAdjacent(x+1,y,array);

        }if(x>=0 && x<array.length && y+1>=0 && y+1<array[x].length && array[x][y+1]==1 ){//right
            findAdjacent(x,y+1,array);

        }if(x>=0 && x<array.length && y-1>=0 && y-1<array[x].length && array[x][y-1]==1){//left
            findAdjacent(x,y-1,array);

        }



    }

    public static void printPositions(int x, int y){
        System.out.println("Visited position "+x+","+y);
    }
}
