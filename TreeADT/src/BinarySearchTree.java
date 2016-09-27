public class BinarySearchTree { 

	private BinaryTreeNode root; 
	int count = 0;

	public BinarySearchTree(){ 
		this.root = null; 
		} 
	public BinaryTreeNode getRoot(){ 
		return(root); 
	} 

	private void findPosition(BinaryTreeNode node, BinaryTreeNode start){ 
		int sKey = start.getKey(); 
		if (sKey>node.getKey()){

			if (start.getLeftChild() == null){ 
				start.setLeftChild(node); 
			} 
			else{ 
				findPosition(node, start.getLeftChild()); 
			} 
		} 
		else{ 
			if (start.getRightChild() == null){ 
				start.setRightChild(node); 
			} 
			else{ 
				findPosition(node, start.getRightChild()); 
			} 
		} 
	} 

	public void insertNode(BinaryTreeNode node){ 
		if (root == null){ 
			root = node; 
		} 
		else{ 
			findPosition(node, this.root); 
		} 
	} 

	private boolean findElement(BinaryTreeNode node, int x){ 
		if (node == null) 
			return(false); 
		if (x == node.getKey()) 
			return(true); 
		else if (x < node.getKey()) 
			return(findElement(node.getLeftChild(), x)); 
		else 
			return(findElement(node.getRightChild(), x)); 
	} 


	public int countLeaves(BinaryTreeNode node) { 
		if (node == null) 
			return 0; 
		else if (node.getLeftChild() == null && node.getRightChild() == null) 
			return 1; 
		else 
			return countLeaves(node.getLeftChild()) + 
					countLeaves(node.getRightChild()); 
	} 
	public int computeDepth(BinaryTreeNode node){ 
		if (node == null) 
			return 0;

		return (1+ Math.min(computeDepth(node.getLeftChild()), 
				computeDepth(node.getRightChild()))); 
	} 
	public void inorderPrint(BinaryTreeNode node){
		if(node == null){
			System.out.print("");
		}else{
		inorderPrint(node.getLeftChild());
		System.out.print(node.getKey() + " ");
		inorderPrint(node.getRightChild());
		}
	} 

	public void preorderPrint(BinaryTreeNode node){ 
		if(node == null){
			System.out.print("");
		}else{
		System.out.print(node.getKey() + " ");
		preorderPrint(node.getLeftChild());
		preorderPrint(node.getRightChild());
		}
	} 
	
	public int countNodes(BinaryTreeNode node){ 
		if(node == null){
			return count;
		} else {
			if(node.getLeftChild() == null && node.getRightChild() == null){
				return 1;
			} else{
				return 1 + (countNodes(node.getLeftChild())) + (countNodes(node.getRightChild()));
			}
		}
	} 

	public static BinaryTreeNode findMin(BinaryTreeNode node){ 
		if(node == null){
			System.out.println("Null root");
		} else {
			if(node.getLeftChild() == null){
				//System.out.println(node.getKey());
				return node;
			} else {
				findMin(node.getLeftChild());
			}
		}
		return null;

	} 
	public void findMax(BinaryTreeNode node){ 
		if(node == null){
			System.out.println("Null root");
		} else {
			if(node.getRightChild() == null){
				System.out.println(node.getKey());
			} else {
				findMax(node.getRightChild());
			}
		}
	}
	
	public void delete(int k) {
	    root = delete(root, k);
	}
	
	private static BinaryTreeNode delete(BinaryTreeNode T, int k) {
	    if (T == null) return null;
	    if (k == T.getKey()) {
	       // T is the node to be removed
	       if (T.getLeftChild() == null && T.getRightChild() == null) return null;
	       if (T.getLeftChild() == null) return T.getRightChild();
	       if (T.getRightChild() == null) return T.getLeftChild();
	       
	       // here if T has 2 children
	       BinaryTreeNode tmp = findMin(T.getRightChild());
	       // copy key field from tmp to T
	       T.key =  tmp.getKey();

	       // now delete tmp from T's right subtree and return
	       T.setRightChild( delete(T.getRightChild(), tmp.getKey()) );
	       return T;
	       
	    }
	    //find the node to delete
	    else if (Integer.compare(k, T.getKey()) < 0) {
	        T.setLeftChild( delete(T.getLeftChild(), k));
		return T;
	    }
	    else {
	        T.setRightChild(delete(T.getRightChild(), k));
		return T;
	    }
	}
	
}

