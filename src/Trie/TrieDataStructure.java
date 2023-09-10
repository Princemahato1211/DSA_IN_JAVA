package Trie;

class Trie{
	TrieNode root;
	
	public Trie(){
		root = new TrieNode();
	}
	
	public static class TrieNode{
		TrieNode [] children;
		boolean isWord;
		
		public TrieNode() {
			children = new TrieNode[26];
			isWord = false;
		}
	}
	
	public void insert(String Word){
		if(Word == null || Word.isEmpty()) {
			System.out.println("Please enter a valid word");
		}
		Word = Word.toLowerCase();
		TrieNode current = root;
		for(int i=0; i<Word.length(); i++) {
			int index = Word.charAt(i)-'a';
			if(current.children[index] == null) {
				TrieNode node = new TrieNode();
				node.children[index] = node;
				current = node;
			}else {
				current = current.children[index];
			}
		}
		
		current.isWord = true;
	}
}



public class TrieDataStructure {
	public static void main(String[] args) {
		Trie t1 = new Trie();
		t1.insert("cat");
		t1.insert("cab");
		t1.insert("song");
		t1.insert("son");
		t1.insert("so");
		System.out.println("Inserted succesfully");
	}
}
