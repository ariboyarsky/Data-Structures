
public class test {
	public static void main(String[] args){
		MaxHeap heap = new MaxHeap(12);
		
		heap.insert(90);
		heap.insert(67);
		heap.insert(11);
		heap.insert(30);
		heap.insert(57);
		heap.insert(8);
		heap.insert(20);
		heap.insert(2);
		heap.insert(32);
		heap.insert(24);
		heap.insert(25);
		heap.insert(85);
		
		heap.printHeap();
		System.out.println();
		heap.getMaxHeap();
		heap.deleteMax();
		System.out.println();
		heap.printHeap();
		System.out.println();
		heap.getMaxHeap();
		System.out.println();
		heap.deleteMax();
		System.out.println();
		heap.printHeap();
	}

}
