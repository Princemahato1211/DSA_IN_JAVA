package LinkedList;

class Circularlist{
	public static LinkedList3 Tail=null;
	
	public static class LinkedList3{                    //Circuler linkedList declaration
		int data;
		LinkedList3 next;
		LinkedList3(int data) {
			this.data = data;
		}
	}
	
	public void display(){                               // displaying the data of linkedlist
		if(Tail == null) {
			return ;
		}
		LinkedList3 current = Tail.next;
		while(current != Tail) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println(current.data+"-->");
	}
	
	public void insertAtBeg(int data){                  // Insert data at the beginiing
		LinkedList3 node = new LinkedList3(data);
		if(Tail == null) {
			Tail =node;
			node.next = Tail;
		}else {
			node.next = Tail.next;
			Tail.next = node;
		}
	}
	
	public void insertAtEnd(int data) {                 // Insert data at the ending
		LinkedList3 node = new LinkedList3(data);
		if(Tail == null) {
			Tail =node;
			node.next = Tail;
		}else {
			node.next = Tail.next;
			Tail.next = node;
			Tail = node;
		}
	}
	
	public int removeFirstNode() {                      // Remove element at the begining
		if(Tail == null) {
			System.out.println("Linkedlist is empty");
			return -1;
		}else{
			LinkedList3 node = Tail.next;
			Tail.next = node.next;
			node.next =null;
			return node.data;
		}
	}
	
}

public class CircularSingularLinkedList {
	public static void main(String[] args) {
		Circularlist c1 = new Circularlist();
		c1.insertAtBeg(45);
		c1.insertAtBeg(33);
		c1.insertAtBeg(66);
		c1.insertAtEnd(22);
		c1.insertAtEnd(33);
		c1.insertAtBeg(11);
		
		c1.display();
		
		c1.removeFirstNode();
		c1.removeFirstNode();
		c1.display();
	}
}
