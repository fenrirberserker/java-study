package concepts.search;

import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Data
public class Node {

    private Integer data;
    private boolean isVisited;

    public Node(Integer data){
        this.data = data;
    }

    @ToString.Exclude
    private List<Node> neighbours = new LinkedList<>();
}
