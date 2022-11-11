import pt.pa.adts.graph.Graph;
import pt.pa.adts.graph.GraphAdjacencyList;

public class Main {
    public static void main(String[] args) {

        Graph<String, Integer> graph = new GraphAdjacencyList<>();

        System.out.println(graph.numVertices());
    }
}