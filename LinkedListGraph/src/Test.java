public class Test {

	/**
	 * @author:Ari Boyarsky
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Graph myGraph1 = new Graph(8);
		myGraph1.addEdge(1, 2);
		myGraph1.addEdge(1, 7);
		myGraph1.addEdge(1, 4);
		myGraph1.addEdge(2, 5);
		myGraph1.addEdge(2, 6);
		myGraph1.addEdge(6, 3);
		myGraph1.addEdge(3, 8);
		myGraph1.addEdge(5, 7);	
		//Test DFS(1)
		//Test Connected
		
		Graph myGraph2 = new Graph(8);
		myGraph2.addEdge(1, 2);
		myGraph2.addEdge(1, 3);
		myGraph2.addEdge(2, 4);
		myGraph2.addEdge(1, 5);
		myGraph2.addEdge(5, 6);
		myGraph2.addEdge(6, 7);
		myGraph2.addEdge(2, 8);		
		//Test DFS(1)
		//Test Connected
		
		Graph myGraph3 = new Graph(5);
		myGraph3.addEdge(1, 2);
		myGraph3.addEdge(1, 3);
		myGraph3.addEdge(1, 4);		
		//Test DFS(1)
		//Test Connected
		
		Graph myGraph4 = new Graph(5);
		myGraph4.addEdge(1,2);
		myGraph4.addEdge(2,3);
		myGraph4.addEdge(3,4);
		myGraph4.addEdge(4,1);
		//*******IMPORTANT*********** for this test provide an example of a graph that is cyclic but not connected.
		
		Graph myGraph5 = new Graph(1);
		//this is a special case!!! 
		System.out.print("Graph 1 DFS: ");
		myGraph1.DFS(1);
		System.out.println();
		System.out.print("Graph 2 DFS: ");
		myGraph2.DFS(1);
		System.out.println();
		System.out.print("Graph 3 DFS: ");
		myGraph3.DFS(1);
		myGraph4.DFS(1);
		myGraph5.DFS(1);
		System.out.println();
		System.out.println("Graph 1 ------ Connected: " + myGraph1.isConnected());
		System.out.println("Graph 2 ------ Connected: " + myGraph2.isConnected());
		System.out.println("Graph 3 ------ Connected: " + myGraph3.isConnected());
		System.out.println("Graph 4 ------ Connected: " + myGraph4.isConnected());
		System.out.println("Graph 5 ------ Connected: " + myGraph5.isConnected());
		
		System.out.print("Graph 1 BFS: ");
		myGraph1.BFS(1);
		System.out.println();
		System.out.print("Graph 2 BFS: ");
		myGraph2.BFS(1);
		System.out.println();
		System.out.print("Graph 3 BFS: ");
		myGraph3.BFS(1);
		System.out.println();
		System.out.print("Graph 4 BFS: ");
		myGraph4.BFS(1);
		System.out.println();
		System.out.print("Graph 5 BFS: ");
		myGraph5.BFS(1);
		System.out.println();
		
		System.out.print("Dest from 1 to 8 (graph1): ");
		myGraph1.sourceDest(1, 8);
		

		//Test Connected
	}

}