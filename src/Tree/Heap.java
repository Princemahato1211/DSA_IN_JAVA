package Tree;

class MaxHeap{
	private int heap[];
	int n=0;
	int capacity;
	
	public MaxHeap(int capacity) {
		heap = new int[capacity+1];	
		this.capacity = capacity;
	}
	
	public boolean IsEmpty() {                   // return boolean wheather the heap is empty or not
		return (n == 0);
	}
	
	public int size() {                          // return the size of heap
		return n;
	}
	
	public void resize(int n){                   // it resize the capacity of heap
		int temp[] = new int[n];
		for(int i=1;i<heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}
	 
	public void printheap() {                    // it will print the value of heap
		for(int i=1; i<=n; i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}
	
	public void swap(int a,int b) {             // to swap to element
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public void swim(int k) {                    // to perform BOTTOM-UP Rehepify (Swim)
		while((k>1) && (heap[k] > heap[k/2])) {
			swap(k,k/2);
			k = k/2;
		}
	}
	
	public void insert(int x){                   // To insert data into heap
		if(n == (heap.length-1)) {
			resize(2*capacity);
		}
		n++;
		heap[n] = x;
		swim(n);
	}
	
	
}

public class Heap {
	public static void main(String[] args) {
		MaxHeap m1 = new MaxHeap(8);
		m1.insert(8);
		m1.insert(4);
		m1.insert(2);
		m1.insert(6);
		m1.insert(12);
		m1.insert(13);
		m1.insert(9);
		m1.insert(8);
		
		m1.printheap();
		
		
	}
}
