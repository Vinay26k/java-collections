import java.util.LinkedList;
class Graph{
	private Integer V;
	LinkedList <Integer> adjacency_list []; // = new LinkedList[Size] initialized after knowing size
	Graph(Integer V){
		this.V = V;
		adjacency_list = new LinkedList[V];
		for (int i=0; i<V; i++) {
			// initialize each element as another list
			adjacency_list[i] = new LinkedList<>();
		}
	}
	public static void addEdge(Graph graph, int src, int dest){
		graph.adjacency_list[src].add(dest);
		graph.adjacency_list[dest].add(src);
		//coz undirected graph
	}
	public static void printGraph(Graph graph){
		for (int i=0; i<graph.V; i++) {
			System.out.println("Adjacency list of Vertex : "+i);
			graph.adjacency_list[i].forEach(System.out::println);
		}
	}
}

public class GraphRepresentationFinal{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		Graph graph = new Graph(5);
		Graph.addEdge(graph, 0, 1);
        Graph.addEdge(graph, 0, 4);
        Graph.addEdge(graph, 1, 2);
        Graph.addEdge(graph, 1, 3);
        Graph.addEdge(graph, 1, 4);
        Graph.addEdge(graph, 2, 3);
        Graph.addEdge(graph, 3, 4);
        Graph.printGraph(graph);
	}
}