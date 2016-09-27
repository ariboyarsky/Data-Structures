public class MaxHeap { 

	private Element[] heapArray; 
	private int maxSize; 
	private int currentSize; 
	public MaxHeap(int max){ 
		maxSize = max; 
		currentSize = 0; 
		heapArray = new Element[maxSize]; // create the heap 
	} 
	public boolean isEmpty(){ 
		return currentSize==0; 
	} 
	// Move an element up in the heap tree. 
	public void adjustHeap(int index){ 
		int parent = (index-1) / 2; 
		Element bottom = heapArray[index]; 

		while( index > 0 && 
				heapArray[parent].getData() < bottom.getData() ){ 
			heapArray[index] = heapArray[parent]; // move it down 
			index = parent; 
			parent = (parent-1) / 2; 
		} 
		heapArray[index] = bottom; 
	} 
	public void deleteAdjustHeap(int index){ 
		int j = index / 2; 
		Element bottom = heapArray[j+1]; 

		while( index > 0 && heapArray[j].getData() < bottom.getData() ){ 
			heapArray[j] = heapArray[j]; // move it down 
			j = (j-1) / 2; 
		} 
		heapArray[j] = bottom; 
	} 

	public boolean insert(int key) { 
		if(currentSize==maxSize) 
			return false; 
		Element newElement = new Element(key); 
		heapArray[currentSize] = newElement; 
		adjustHeap(currentSize++); 
		return true; 
	} 
	public void getMaxHeap() {
		System.out.print("Max Heap: " + heapArray[0].getData());
	}

	public void printHeap() { 
		for(int i = 0; i < currentSize; i++){
			System.out.print(heapArray[i].getData() + " ");
		}


	} 
	public void deleteMax(){
		heapArray[0] = null;
		currentSize--;
		heapArray[0] = heapArray[currentSize];
		heapArray[currentSize] = null;
		for(int j =0; j < 2; j++){
			for(int i = currentSize-1; i >= 0; i--){
				adjustHeap(i);
			}
		}
	} 

}