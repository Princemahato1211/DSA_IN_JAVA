package Tree;

class SearchTree{
	private Node1 root;
	
	private static class Node1{
		private int data;
		private Node1 left;
		private Node1 right;
		public Node1(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void insertValue(int data){
		root= insertValue1(root,data);
	}
	
	public Node1 insertValue1(Node1 node,int data){
		Node1 temp = new Node1(data);
		if(node == null){
			return temp;
		}
		if(data > node.data) {
			node.right = insertValue1(node.right, data);
		}else {
			node.left = insertValue1(node.left, data);
		}
	    return node;
	}
	
	public void inorderRecursion() {
		inorderRecursion(root);
	}
	public void inorderRecursion(Node1 node) {
		if(node == null) {
			return ;
		}
		inorderRecursion(node.left);
		System.out.print(node.data+"--");
		inorderRecursion(node.right);
	}
	
}

public class BinarySearchTree {
	public static void main(String[] args) {
		SearchTree s1 = new SearchTree();
		s1.insertValue(14);
		s1.insertValue(12);
		s1.insertValue(30);
		s1.insertValue(10);
		s1.insertValue(13);
		
		System.out.println("Inorder recursion:");
		s1.inorderRecursion();
		
	}
}
