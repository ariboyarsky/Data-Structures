
public class TreeADT {
	public static BinarySearchTree c2 = new BinarySearchTree();
	
	public static void main(String[] args){
		BinarySearchTree tree = new BinarySearchTree();
		BinaryTreeNode node = new BinaryTreeNode(4, null, null);
		BinaryTreeNode node2 = new BinaryTreeNode(3, null, null);
		BinaryTreeNode node3 = new BinaryTreeNode(6, null, null);
		BinaryTreeNode node4 = new BinaryTreeNode(2, null, null);
		BinaryTreeNode node5 = new BinaryTreeNode(1, null, null);
		BinaryTreeNode node6 = new BinaryTreeNode(5, null, null);
		BinaryTreeNode node7 = new BinaryTreeNode(8, null, null);
		BinaryTreeNode node8 = new BinaryTreeNode(7, null, null);
		BinaryTreeNode node9 = new BinaryTreeNode(9, null, null);
		tree.insertNode(node);
		tree.insertNode(node2);
		tree.insertNode(node3);
		tree.insertNode(node4);
		tree.insertNode(node5);
		tree.insertNode(node6);
		tree.insertNode(node7);
		tree.insertNode(node8);
		tree.insertNode(node9);
		
		
		System.out.println("Before  Print: ");
		tree.inorderPrint(node);
		
		tree.delete(3);
		tree.delete(1);
		tree.delete(10);
		tree.delete(5);
		tree.delete(5);
		tree.delete(8);
		tree.delete(4);
		tree.delete(25);
		
		System.out.println("");
		
		//System.out.println("Min: ");
		//tree.findMin(node);
		
		//System.out.println("Inorder Print: ");
		//tree.inorderPrint(node);
		
		//System.out.println("Max: ");
		//tree.findMax(node);
		
		System.out.println("inorder Print: ");
		tree.inorderPrint(node);
		
		
		System.out.println(" ");
		System.out.println("Copy Print: ");
		copy(node5, tree).inorderPrint(node);
	}
	public static BinarySearchTree copy(BinaryTreeNode root, BinarySearchTree tree){
		if(root != null){
			c2.insertNode(root);
			copy(root.leftChild, c2);
			copy(root.rightChild, c2);
		}
		return c2;
	}
}
