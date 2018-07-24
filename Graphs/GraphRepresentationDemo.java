import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class GraphRepresentationDemo{
	static class Graph{
		int V;
		LinkedList <Integer> adjacency_list[];
		//Graph parametric constructor
		Graph(int V){
			this.V = V;
			adjacency_list = new LinkedList[V];
			for (int i=0; i<V; i++) {
				adjacency_list[i] = new LinkedList<>();
			}
		}
	}
	static void addEdge(Graph graph, int src, int dest){
		graph.adjacency_list[src].add(dest);
		// Since graph is undirected, add an edge from dest
        // to src also
        graph.adjacency_list[dest].add(src);
	}
	static void printGraph(Graph graph){
		for (int v=0; v<graph.V; v++) {
			System.out.println("Adjacency list of vertex : "+v);
			graph.adjacency_list[v].forEach(System.out::println);
		}
	}
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		 // create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
      
        // print the adjacency list representation of 
        // the above graph
        printGraph(graph);
	}
}