public class linkedList {

	private Node Start = null;

	public linkedList(){ 
		Start = null; 
	} 
	public boolean add(int c){
		 Node nNode = new Node(c, null);
		 Node temp = Start;
		 
		if(Start == null){
			Start = nNode;
			return true;
		} else {
			while (temp.next != null) {
	           temp = temp.next;
				}

	       temp.next = new Node(c, null);
	       return true;
		}
	}
	public void printList(){ 
		if (Start == null) 
			System.out.println("Your list is empty"); 
		else { 
			Node move = Start; 
			
			while (move != null) {
				System.out.print(" " + move.getData() + " ");
				move = move.getNext(); 
			} 
		System.out.print("\n");
		}
	}
	
	public Node getStart(){
		Node temp = Start;
		return temp;
	}
	
	public Node find(int e){
		Node temp = Start;
		while(temp != null){
			if(e == temp.getData()){
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

}
