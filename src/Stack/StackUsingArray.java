package Stack;

class Stack1{
	int top;
	int arr[];
	
	public Stack1(int capacity){
		top=-1;
		arr = new int[capacity];
	}
	
	public Stack1() {
		this(10);
	}
	
	public boolean isEmpty() {                       // Return value wheather a stack is empty or not
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {                        // return value wheather stack is full or not
		if(top == (arr.length-1)) {
			return true;
		}
		return false;
	}
	
	public void push(int data) {                      // Adding data at the top of stack
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		arr[top] = data;
	}
	
	public void pop() {                               // deleting element at the top
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		arr[top] =0;
		top--;;
	}
	
	public int peak() {                               // Retrieving top element of the  stack
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[top];
	}
	
}

public class StackUsingArray {
	public static void main(String[] args) {
		Stack1 s1 = new Stack1(7);
		s1.push(23);
		s1.push(27);
		s1.push(19);
		s1.push(44);
		s1.push(98);
		s1.push(32);
		s1.push(63);
		s1.push(29);
		
		s1.pop();
		s1.pop();
		System.out.println("top element: "+s1.peak());
		s1.pop();
		s1.pop();
		System.out.println("top element: "+s1.peak());
		s1.pop();
		System.out.println("top element: "+s1.peak());
	}
}
