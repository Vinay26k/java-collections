import java.util.LinkedList;
import java.util.Stack;
class Graph{
	private static Integer V;
	private static LinkedList<Integer> adjacency_list[];
	Graph(Integer V){
		this.V = V;
		adjacency_list = new LinkedList[V];
		for (int i=0; i<V; i++) {
			this.adjacency_list[i] = new LinkedList<>();
		}
	}
	public void addEdge(Integer src, Integer dest){
		this.adjacency_list[src].add(dest);
		//this.adjacency_list[dest].add(src);
	}
	public void printGraph(){
		for (int i=0; i<this.V; i++) {
			System.out.println("Adjacency list of vertex : "+i);
			this.adjacency_list[i].forEach(e->System.out.println(e+" "));
		}
	}
	public void BFS(Integer src){
		//search along adjacents, queue should be used
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(src);
		boolean visited[] = new boolean[this.V];
		visited[src] = true;
		while(queue.size()!=0){
			//remove element from queue
			src = queue.poll();
			System.out.print(src+" ");
			this.adjacency_list[src].forEach(v-> {
				if(!visited[v]){ visited[v] = true; queue.add(v); }
			});
		}
	}

	// void DFSUtil(Integer vertex, boolean visited[]){
	// 	visited[vertex] = true;
	// 	System.out.print(vertex+" ");
	// 	this.adjacency_list[vertex]
	// }

	public void DFS(Integer src){
		//stack is used
		Stack <Integer> st = new Stack<>();
		boolean visited[] = new boolean[this.V];
		visited[src] = true;
		st.push(src);
		while(!st.empty()){
			src = st.pop();
			System.out.print(src+" ");
			this.adjacency_list[src].forEach(v->{
				if(!visited[v]) {st.push(v); visited[v]=true;}
			});
		}
		
	}
}
public class BreadthFirstSearchDemo{
	/* code by Vinay26k */
	public static void main(String [] args){
		System.out.println("Code by github: Vinay26k");
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.printGraph();
        System.out.println("BFS for the graph :");
        graph.BFS(2);
        System.out.println();
        System.out.println("DFS for the graph :");
        graph.DFS(2);
        System.out.println();
	}
}