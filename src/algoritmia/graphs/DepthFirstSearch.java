package algoritmia.graphs;

import java.util.*;

/**
 * DFS uses a stack to iterate
 */

public class DepthFirstSearch {

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a',List.of('c','b'));
        graph.put('b',List.of('d'));
        graph.put('c',List.of('e'));
        graph.put('d',List.of('f'));
        graph.put('e',new ArrayList<>());//basic case is null
        graph.put('f',new ArrayList<>());
        LinkedList<Character> stack = new LinkedList<>();

        DFS(graph, 'a');

    }

    //plain solution
    public static void DFS (Map<Character,List<Character>> graph, Character source){

        LinkedList<Character> stack = new LinkedList<>();
        stack.push(source);

        while(!stack.isEmpty()){
            Character pop = stack.pop();
            System.out.println(pop);

            for (Character c: graph.get(pop) ) {
                stack.push(c);
            }
        }
    }

    //recursive
    /*public static void DFS (Map<Character,List<Character>> graph, Character source){

        System.out.println(source);

        for(Character n: graph.get(source)){
            DFS(graph, n);
        }
    }*/


}
