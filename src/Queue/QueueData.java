package Queue;

class queue{
	private Linkedlist front;
	private Linkedlist rear;
	private int length;
	
	private class Linkedlist{
		int data;
		Linkedlist next;
		public Linkedlist(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public int length() {                               // length of queue
		return length;
	}
	
	public boolean isEmpty() {                          // to find out wheather queue is empty or not
		return length==0;
	}
	
	public void enqueue(int data) {                     // To add data in queue
		Linkedlist node = new Linkedlist(data);
		if(isEmpty()) {
			front = node;
		}else {
			rear.next = node;
		}
		rear = node;
		length++;
	}
	
	public int dequeue() {                             // to retrieve or delete data from queue
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		Linkedlist node = front;
		if(front.next == null) {
			rear = null;
		}
		front = front.next;
		length--;
		return node.data;
	}
	
}

public class QueueData {
	public static void main(String[] args) {
		queue q1 = new queue();
		System.out.println(q1.dequeue());
		q1.enqueue(4);
		q1.enqueue(6);
		q1.enqueue(1);
		q1.enqueue(89);
		q1.enqueue(90);
		
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println("length: "+q1.length());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
	}
}
