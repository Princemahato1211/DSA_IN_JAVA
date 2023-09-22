package hashing;

class Hash{
	HashNode Bucket[];
	int size = 0;
	int no_of_Buckets=10;
	
	Hash(){
		this(10);
	}
	
	Hash(int capacity){
		Bucket = new HashNode[capacity];
		no_of_Buckets = capacity;
	}
	
	public static class HashNode{                  // static class to store the value
		int key;
		String Value;
		HashNode next;
		HashNode(int Key,String value) {
			this.key = Key;
			this.Value = value;
		}
	}
	
	public int getIndex(int key){                 // function to store get the index
		return key%no_of_Buckets;
	}
	
	public void put(int key,String value){        // function to store the data in HashTable
		int index = getIndex(key);
		HashNode head = Bucket[index];
		
		while(head != null) {
			if(key == head.key) {
				head.Value = value;
				return;
			}
			head = head.next;
		}
		size++;
		HashNode node = new HashNode(key, value);
		node.next = Bucket[index];
		Bucket[index] = node;
	}
	
	public String get(int key){                     // function to get the value from HashTable using key
		int index = getIndex(key);
		HashNode head =Bucket[index];
		
		while(head != null) {
			if(head.key == key) {
				return head.Value;
			}
			head = head.next;
		}
		return null;
	}
	
	public String remove(int key){                 // function to remove data from the hashTable
		int index = getIndex(key);
		HashNode head = Bucket[index];
		HashNode Previous = null;
		
		while(head != null){
			if(head.key == key) {
				break;
			}
			Previous = head;
			head = head.next;
		}
		if(head == null) {
			return null;
		}
		
		size--;
		if(Previous != null) {
			Previous.next = head.next; 
		}else {
			Bucket[index] = head.next;
		}
		return head.Value;
	}
	
}


public class Hashing{
	public static void main(String[] args) {
		Hash h1 = new Hash();
		h1.put(23, "prince");
		h1.put(555, "pankaj");
		System.out.println(h1.size);
		System.out.println(h1.get(555));
		
		h1.put(555, "hero");
		System.out.println(h1.size);
		System.out.println(h1.get(555));
		
		h1.put(333, "dhage");
		System.out.println(h1.size);
		System.out.println(h1.get(333));
		System.out.println(h1.get(23));
		
		System.out.println(h1.remove(333));
		System.out.println(h1.get(333));
	}
}
