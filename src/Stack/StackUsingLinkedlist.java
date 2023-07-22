package Stack;

class Stack{
	private LinkedList top;
	private int length ;
	
	public Stack() {
		top=null;
		length=0;
	}
	
	private class LinkedList{
		private int data;
		private LinkedList next;
		public LinkedList(int data){
			this.data = data;
		}
	}
	
	public int length() {
		return length;
	}
	
	public void push(int data) {
		LinkedList node = new LinkedList(data);
		node.next = top;
		top=node;
		length++;
	}
	
	public boolean isEmpty() {
		if(length != 0) {
			return false;
		}
		return true;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		top = top.next;
		length--;
	}
	
	public int peak() {
		return top.data;
	}
}

public class StackUsingLinkedlist {
	public static void main(String[] args) {
		System.out.println("hello world");
		Stack s1 = new Stack();
		s1.push(34);
		System.out.println(s1.peak());
		s1.push(22);
		System.out.println(s1.peak());
		s1.push(11);
		System.out.println(s1.peak());
		s1.pop();
		System.out.println(s1.peak());
		s1.pop();
		System.out.println(s1.peak());
		
		System.out.println(s1.length());
	}
}
