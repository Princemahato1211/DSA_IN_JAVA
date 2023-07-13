package LinkedList;

public class singlyLinkedList {
	private linkedList head;                           //Head pointer of LinkedList
	
	private static class linkedList{                   // Linked List Class Declaration
		private int data;
		private linkedList next;
		
		public linkedList(int data) {                 // constructor for initializing data
			this.data = data;
			this.next = null;
		}
	}
	
	public void displayLinkedList() {                  // for displaying Linkedlist data
		linkedList current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.print("Null");
		System.out.println("\n");
	}
	
	public void displayLinkedList(linkedList head1) {                  // for displaying Linkedlist data by passing head parameter
		linkedList current = head1;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.print("Null");
		System.out.println("\n");
	}
	
	public int count() {                              // counting the number node in linked list   
		if(head == null) {
			return 0;
		}
		linkedList current = head;
		int count =0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertAtStart(int data) {              // inserting data at the begining of linkedlist
		linkedList node = new linkedList(data);
		node.next = head;
		head = node;
	}
	
	public void insertAtEnd(int data) {                // inserting data at the ending of linkedlist
		linkedList node = new linkedList(data);
		if(head == null) {
			head =node;
		}else {
			linkedList current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}
	
	public void insertAtPosition(int data,int pos) {   // inserting data A position n in linkedlist
		linkedList node = new linkedList(data);
		if(head ==  null) {
			head = node;
		}else {
			linkedList current = head;
			int count = 1;
			while(count < pos-1 && current.next!=null) {
				current = current.next;
				count++;
			}
			node.next = current.next;
			current.next = node;
		}
	}
	
	public int deleteAtStart() {                // Deleting the starting node of linkedlist
		if(head == null) {
			return -1;
		}
		linkedList temp = head;
		head = temp.next;
		temp.next=null;
		return temp.data;
	}
	
	public int deleteAtEnd() {                  //deleting the ending node of linkedList
		linkedList current = head;
		linkedList previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next =null;
		return current.data;
	}
	
	public int deleteAtPosition(int pos) {     // deleting node at position n in linkdelist
		if(head == null) {
			return -1;
		}else if(pos == 1){
			linkedList temp = head;
			head = temp.next;
			return temp.data;
		}
		else {
			linkedList current = head;
			linkedList previous = null;
			int count =1;
			while(count < pos) {
				previous = current;
				current  = current.next;
				count++;
			}
			previous.next=current.next;
			current.next=null;
			return current.data;
		}
	}
	
	public boolean searchnode(int data) {                // searching an element in linkedlist
		linkedList current  = head;
		while(current != null) {
			if(current.data == data) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	public void reverseLinkedList() {                   // Reverse a linkedlist
		linkedList current = head;
		linkedList previous = null;
		linkedList temp = null;
		while(current != null) {
			temp = current.next;
			current.next= previous;
			previous = current;
			current = temp;
		}
		head = previous;
	}
	
	public linkedList middlenode() {                    // Find the middle node of linkedlist
		linkedList slow = head;
		linkedList fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	

	//for sorted linked list
	public linkedList nth_node_from_endlist(int n) {    // Nth node from the end of linkedlist
		linkedList mainptr = head;
		linkedList refptr = head;
		int count = 0;
		while(count<n) {
			refptr = refptr.next;
			count++;
		}
		while(refptr != null) {
			refptr = refptr.next;
			mainptr = mainptr.next;
		}
		return mainptr;
	}
	
	public void Duplicate_node() {                      // Remove Duplicate node from the sorted list
		linkedList current = head;
		while(current!=null && current.next!=null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
	}
	
	public void insertIntoSortedList(int data) {        // Insert data into sorted singly linkedlist
		linkedList node = new linkedList(data);
		linkedList current =head;
		linkedList previous = null;
		while(current.data <= data) {
			previous = current;
			current = current.next;
		}
		node.next = current;
		previous.next = node;
	}
	
    public int RemoveKey(int data) {                    // Remove data into sorted singly linkedlist
    	linkedList current = head;
    	linkedList previous = null;
    	while(current.data != data && current!=null) {
    		previous = current;
    		current = current.next;
    	}
    	if(current!= null) {
    		previous.next= current.next;
    		current.next = null;
    	}
    	return current.data;
    }
	
    public boolean detectLoop(){                        //Detect Loop in singly LInkedlist
    	linkedList slowptr = head;
    	linkedList fastptr = head;
    	while(fastptr!=null && fastptr.next!=null) {
    		slowptr = slowptr.next;
    		fastptr = fastptr.next.next;
    		if(slowptr==fastptr) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public linkedList StartingnodeOFLoop() {            // Finding A starting node of linkedlist
    	linkedList slowptr = head;
    	linkedList fastptr = head;
    	boolean bool = false;
    	while(fastptr!=null && fastptr.next!=null) {
    		slowptr = slowptr.next;
    		fastptr = fastptr.next.next;
    		if(slowptr==fastptr) {
    			bool= true;
    			break;
    		}
    	}
    	fastptr = head;
    	if(bool) {
    		while(fastptr != slowptr) {
    			fastptr = fastptr.next;
    			slowptr = slowptr.next;
    		}
    		return slowptr;
    	}
    	return null;
    }

    public void RemoveLoop() {                    //Removing Loop from singly linkedlist
    	linkedList slowptr = head;
    	linkedList fastptr = head;
    	boolean bool = false;
    	while(fastptr!=null && fastptr.next!=null) {
    		slowptr = slowptr.next;
    		fastptr = fastptr.next.next;
    		if(slowptr==fastptr) {
    			bool= true;
    			break;
    		}
    	}
    	fastptr = head;
    	if(bool) {
    		while(fastptr.next != slowptr.next) {
    			fastptr = fastptr.next;
    			slowptr = slowptr.next;
    		}
    		slowptr.next = null;
    	}
    }
    
    public linkedList mergeTwoSortedList(linkedList head1,linkedList head2) {
    	linkedList node = null;
    	linkedList temp = null;
    	if(head1.data >= head2.data) {
    		node=head2;
    		temp=head2;
    		head2 = head2.next;
    	}else if(head2.data>head1.data){
    		node = head1;
    		temp = head1;
    		head1 = head1.next;
    	}
    	
    	while(head1!=null && head2!=null) {
    		if(head1.data < head2.data) {
    			temp.next=head1;
    			temp = head1;
    			head1 = head1.next;
    		}else if(head2.data < head1.data) {
    			temp.next=head2;
    			temp = head2;
    			head2 = head2.next;
    		}else {
    			temp.next=head1;
    			temp=head1;
    			head1 = head1.next;
    			temp.next=head2;
    			temp=head2;
    			head2 = head2.next;
    		}
    	}
    	
    	if(head1 == null) {
    		temp.next = head2;
    	}else {
    		temp.next = head1;
    	}
    	return node;
    }
    
	public static void main(String[] args) {
//		singlyLinkedList s1 = new singlyLinkedList();
//		
//		//Initializing data
//		s1.head =new linkedList(10);
//		linkedList second = new linkedList(11);
//		linkedList third = new linkedList(9);
//		linkedList fourth = new linkedList(1);
//		linkedList fifth = new linkedList(20);
//		linkedList sixth = new linkedList(22);
//		
//		//Combining LinkedList
//		s1.head.next = second;
//		second.next = third;
//		third.next = fourth;
//		fourth.next = fifth;
//		fifth.next = sixth;
//		
//		s1.displayLinkedList();
//		System.out.println("The number element in linkedlist are: "+s1.count());
//		
		//Inserting data in linkedlist
//		s1.insertAtStart(100);
//		s1.insertAtEnd(98);
//		s1.displayLinkedList();
//		
//		s1.insertAtPosition(44, 5);
//		s1.displayLinkedList();
//		
//		System.out.println("deleting element "+s1.deleteAtStart());
//		s1.displayLinkedList();
//		System.out.println("deleting element "+s1.deleteAtStart());
//		s1.displayLinkedList();
//		System.out.println("deleting element "+s1.deleteAtEnd());
//		s1.displayLinkedList();
//		System.out.println("deleting element "+s1.deleteAtEnd());
//		s1.displayLinkedList();
//		System.out.println("deleting element "+s1.deleteAtPosition(1));
//		s1.displayLinkedList();
		
//		System.out.println(s1.searchnode(1));
//		s1.displayLinkedList();
//		s1.reverseLinkedList();
//		s1.displayLinkedList();
		
		// middle node in linkedlist
//		System.out.println(s1.middlenode().data);
//		System.out.println(s1.nth_node_from_endlist(2).data);
		
		
		// Sorted list
//		singlyLinkedList s2 = new singlyLinkedList();
//		s2.head = new linkedList(2);
//		linkedList second = new linkedList(5);
//		linkedList third = new linkedList(6);
//		linkedList fourth = new linkedList(6);
//		linkedList fifth = new linkedList(9);
//		linkedList sixth = new linkedList(9);
//		
//		s2.head.next = second;
//		second.next = third;
//		third.next = fourth;
//		fourth.next = fifth;
//		fifth.next = sixth;
//		sixth.next=third;
//		
//		s2.displayLinkedList();
//		s2.Duplicate_node();
//		s2.displayLinkedList();
//		s2.insertIntoSortedList(7);
//		s2.displayLinkedList();
//		System.out.println(s2.RemoveKey(6));
//		s2.displayLinkedList();
//		System.out.println(s2.detectLoop());
//		linkedList node =s2.StartingnodeOFLoop();
//		System.out.println(node.data);
//		s2.RemoveLoop();
//		System.out.println(s2.detectLoop());
//		s2.displayLinkedList();
		
		
		//merging A linked list
		singlyLinkedList s3 = new singlyLinkedList();
		s3.head = new linkedList(2);
		linkedList second = new linkedList(5);
		linkedList third = new linkedList(6);
		linkedList fourth = new linkedList(8);
		linkedList fifth = new linkedList(11);
		linkedList sixth = new linkedList(12);
		s3.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		s3.displayLinkedList();
		
		
		singlyLinkedList s4 = new singlyLinkedList();
		s4.head = new linkedList(2);
		linkedList seco = new linkedList(3);
		linkedList thi = new linkedList(4);
		linkedList fou = new linkedList(8);
		linkedList fif = new linkedList(9);
		linkedList six = new linkedList(13);
		s4.head.next = seco;
		seco.next = thi;
		thi.next = fou;
		fou.next = fif;
		fif.next = six;
		s4.displayLinkedList();
		
		linkedList node = s3.mergeTwoSortedList(s3.head,s4.head);
		s3.displayLinkedList(node);
	}
}
