package LinkedList;

import LinkedList.LinkedList.doublylinkedlist;

class LinkedList{
	private doublylinkedlist head ;
	private doublylinkedlist tail ;
	
	public static class doublylinkedlist{                      // class for doublyLinkedlist
		int data;
		doublylinkedlist previous =null; 
		doublylinkedlist next =null; 
		
		doublylinkedlist(int data) {
			this.data = data;
		}
	}
	
	public void insertAtBeginning(int data){                     //insert at the beginiing of doubly linked list
		doublylinkedlist node = new doublylinkedlist(data);
		doublylinkedlist temp = head;
		if(head == null) {
			tail = node;
			head=node;
		}else {
			head.previous = node;
			node.next = head;
			head =node;
		}
	}
	
	public void insertAtEnding(int data){                        //insert at the ending of doubly linked list
		doublylinkedlist node = new doublylinkedlist(data);
		if(tail == null) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			node.previous = tail;
			tail = node;
		}
	}
	
	public void displayLinkedlist(){                            //Display node of linkedlist
		doublylinkedlist node = head;
		while(node != null) {
			System.out.print(node.data+" <---> ");
			node = node.next;
		}
		System.out.print("null \n");
	}
	
	public void deleteAtBeginning() {                           // Delete at the beginning of linkedlist
		if(head != null) {
			doublylinkedlist node=head.next;
			node.previous = null;
			head.next = null;
			head = node;
		}
	}
	
	public void deleteAtEnding() {
        if(tail != null) {
        	doublylinkedlist node=tail.previous;
			node.next = null;
			tail.previous = null;
			tail = node;
		}
	}
}


public class DoublyLinkedList {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.insertAtEnding(45);
//		l1.insertAtBeginning(5);
		l1.insertAtBeginning(6);
		l1.insertAtEnding(1);
		l1.insertAtBeginning(50);
		
		l1.displayLinkedlist();
		l1.deleteAtBeginning();
		l1.displayLinkedlist();
		l1.deleteAtEnding();
		l1.displayLinkedlist();
		
	}
}
