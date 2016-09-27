
public class BinaryTreeNode { 

	public int key; 
	public BinaryTreeNode leftChild; 
	public BinaryTreeNode rightChild; 

	public BinaryTreeNode(){ 
		key = 0; 
		leftChild = null; 
		rightChild = null; 
	} 
	public BinaryTreeNode(int d, BinaryTreeNode left, BinaryTreeNode 
			right){ 
		key = d; 
		leftChild = left; 
		rightChild = right; 
	} 
	public int getKey(){ 
		return(key); 
	} 
	public BinaryTreeNode getLeftChild(){ 
		return(leftChild); 
	} 
	public BinaryTreeNode getRightChild(){ 
		return(rightChild); 
	} 
	public void setLeftChild(BinaryTreeNode node){ 
		leftChild = node; 
	} 
	public void setRightChild(BinaryTreeNode node){ 
		rightChild = node; 
	} 
} 
