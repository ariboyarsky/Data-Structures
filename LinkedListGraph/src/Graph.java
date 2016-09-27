import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;


public class Graph {
	
	public linkedList[] array = null;
	public ArrayList<Integer> marked = new ArrayList<Integer>();
	public ArrayList<Integer> marked2 = new ArrayList<Integer>();
	public ArrayList<Integer> marked3 = new ArrayList<Integer>();
	public boolean[] visited;
	public int size;
	public static int count;
	public linkedList list = new linkedList();
	public Stack<Integer> stack = new Stack<Integer>();
	public Stack<Integer> stack2 = new Stack<Integer>();

	public Graph(int i) {
		size = i;
		array = new linkedList[i];
		visited = new boolean[size];
		for(int j = 0; j < i; j++){
			array[j] = new linkedList();
			
		}
		System.out.println("Graph created");
	}

	public boolean isVisited(Node n){
		int i = n.getData();
		
		for(int j = 0; j < marked.size(); j++){
			if(marked.get(j) == i){
				return true;
			}
		}
		return false;
	}
	public boolean isVisited2(Node n){
		int i = n.getData();
		
		for(int j = 0; j < marked2.size(); j++){
			if(marked2.get(j) == i){
				return true;
			}
		}
		return false;
	}
	public boolean isVisited3(Node n){
		int i = n.getData();
		
		for(int j = 0; j < marked3.size(); j++){
			if(marked3.get(j) == i){
				return true;
			}
		}
		return false;
	}
	
	public void DFS(int i) {
		marked.add(i);
		System.out.print(" " + i);
		int head = -1;
		for(int k = 0; k < array.length; k++){
			if(array[k] != null){
				if(k == i){
					head = k;
					//marked.add(i);
					break;
				}
			}else{
				System.out.println("array[k] is null");
			}
		}
		
		if(head != -1){
		Node move = array[head].getStart();
		 
		while(move != null){
			if(!isVisited(move)){
				DFS(move.getData());
			}
			move = move.next;
		}
		}
		 
	}

	public void addEdge(int i, int j) {
		array[i].add(j);
	}
	public void printAdj(){
		for(int k = 0; k < array.length; k++){
			if(array[k] != null){
			array[k].printList();
			}
		}
	}

	public boolean isConnected() {
		System.out.println(marked.size()+  " "+ size);
		if(marked.size() == size){
			return true;
		}
		return false;
	}
	public void BFS(int v){
	    Queue<Integer> queue = new java.util.LinkedList<Integer>();
	    
	    marked2.add(v);
	    
	    queue.clear();
	    System.out.print(" "+v);
	    queue.add(v);
	    
	    while(!queue.isEmpty()){
	    	queue.remove();
	    	for(int k = v; k < array.length; k++){
	    		Node temp = array[k].getStart();
	    		while(temp != null){
	    			if(!isVisited2(temp)){
	    				System.out.print(" " + temp.getData());
	    				queue.add(temp.getData());
	    				marked2.add(temp.getData());
	    			}
	    			temp = temp.next;
	    		}
	    	}
	    }
	    
	}
	
	public void sourceDest(int s, int d){
		DFS2(s, d);
		System.out.println(marked3.toString());
	
		}
		
	public boolean DFS2(int i, int d) {
		if(!marked3.contains(d)){
		marked3.add(i);
		}
		if(i == d){
			return false;
		}
		//System.out.print(" " + i);
		int head = -1;
		for(int k = i; k < array.length; k++){
			if(array[k] != null){
				if(k == i){
					head = k;
					//marked.add(i);
					break;
				}
			}else{
				System.out.println("array[k] is null");
			}
		}

		if(head != -1){
			Node move = array[head].getStart();

			while(move != null){
				if(!isVisited3(move)){
					if(move.getData() != d){
						DFS2(move.getData(), d);
					}else{
						marked3.add(d);
						return false;
					}
					
				}
				move = move.next;
			}
		}
		return true;
	}
}
