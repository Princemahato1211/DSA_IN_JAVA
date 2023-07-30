package Tree;

class SearchTree{
	public Node1 root;
	
	private class Node1{
		private int data;
		private Node1 left;
		private Node1 right;
		public Node1(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public void insertValue(int data){
		insertValue(root,data);
		
		root= insertValue(root,data);
	}
	
	public Node1 insertValue(Node1 node,int data){
		Node1 temp = new Node1(data);
		if(node == root && node == null){
			node = temp;
			System.out.println("--");
			return node;
		}
		if(data > node.data) {
			System.out.println("**");
			node.right = insertValue(node.right, data);
		}else {
			System.out.println("^^");
			node.left = insertValue(node.left, data);
		}
	    return node;
	}
	
	public void insertValue(Node1 node,Node1 temp){
		if(node == null){
			node = temp;
			System.out.println("--");
			return;
		}
		if(temp.data > node.data) {
			System.out.println("**");
			insertValue(node.right, temp);
		}else {
			System.out.println("^^");
			insertValue(node.left, temp);
		}
	    return;
	}
	
//	public void inorderRecursion() {
//		inorderRecursion(root);
//	}
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
//		s1.createBinaryTree();
//		s1.insertValue(s1.root,4);
//		s1.insertValue(s1.root,3);
//		s1.insertValue(s1.root,45);
//		s1.insertValue(s1.root,12);
//		s1.insertValue(s1.root,8);
//		s1.insertValue(s1.root,4);
		s1.insertValue(0);
		s1.insertValue(22);
		s1.insertValue(30);
		
		System.out.println("Inorder recursion:");
		s1.inorderRecursion(s1.root);
		
	}
}
