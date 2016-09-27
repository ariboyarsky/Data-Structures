
public class Node { 
	private int data;
	//protected boolean visited = false;
	protected Node next; 
	public Node(){ 
		next = null;
	} 
	public Node(int d, Node l){ 
		data = d;
		next = l; 
	} 
	public int getData(){ 
		return(data); 
	}
	public Node getNext(){ 
		return(next); 
	} 
	/*  public boolean getVisited(){
		return(visited);
	} */
	public void setNext(Node n){
		next = n; 
	}
	public void setData(int e){
		data = e;
	}
	/* public void setVisited(boolean e){
		visited = e;
	} */
} 