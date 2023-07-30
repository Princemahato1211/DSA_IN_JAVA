package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Tree{
	public Node root;
	
	private class Node{                   //declaration of tree
		private int data;
		private Node left;
		private Node right;
		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public void createBinaryTree(){              // Creating a Binary tree
		root = new Node(7);
		Node first  = new Node(3);
		Node sec  = new Node(9);
		Node third = new Node(1);
		Node fourth  = new Node(5);
		Node sixth = new Node(2);
		
		root.left = first;
		root.right = sec;
		first.left = third;
		first.right = fourth;
		sec.right = sixth;
	}
	
	public void inorderRecursion(Node root){              // Recusrion approach in inorder traversal
		if(root == null) {
			return;
		}
		inorderRecursion(root.left);
		System.out.print(root.data+" ");
		inorderRecursion(root.right);
	}
	
	public void preorderRecursion(Node root){             // Recusrion approach in preorder traversal
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preorderRecursion(root.left);
		preorderRecursion(root.right);
	}
	
	public void postorderRecursion(Node root){            // Recusrion approach in postorder traversal
		if(root == null) {
			return;
		}
		postorderRecursion(root.left);
		postorderRecursion(root.right);
		System.out.print(root.data+" ");
	}
	
	public void inorderIterative(){                       // Iterative approach in inorder traversal 
		Node current = root,temp;
		Stack<Node> stack = new Stack<>();
		while(!stack.isEmpty() || current!=null){
			if(current != null) {
				stack.push(current);
				current = current.left;
			}else{
				temp = stack.pop();
				System.out.print(temp.data+" ");
				current = temp.right;
			}
		}
	}
	
	public void preorderIterative() {                     // Iterative approach in preorder traversal
		Node current = root;
		Stack<Node> stack =new Stack<Tree.Node>();
		while(!stack.isEmpty() || current != null) {
			if(current != null) {
				System.out.print(current.data+" ");
				stack.push(current);
				current = current.left;
			}else {
				current = stack.pop().right;
			}
		}
	}
	
	public void postorderIterative() {                    // Iterative approach in postorder traversal
		Node current = root,temp;
		Stack<Node> stack  = new Stack<Tree.Node>();
		while(!stack.isEmpty() || current!=null){
			if(current != null) {
				stack.push(current);
				current = current.left;
			}else{
				temp = stack.peek().right;
				if(temp == null) {
					temp = stack.pop();
					System.out.print(temp.data+" ");
					while(!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data+" ");
					}
				}else {
					current = temp;
				}
			}
		}
	}
	
	public void levelTraversal(){                         // Level traversal of binary tree
		Node current = null;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty() || queue.peek() != null) {
			current = queue.poll();
			System.out.print(current.data+" ");
			if(current.left != null) {
				queue.add(current.left);
			}
			if(current.right != null) {
				queue.add(current.right);
			}
		}
	}
	
	public int maximumValue(Node node){                   // To find the maximum In binary tree
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		
		int max = node.data;
		int left = maximumValue(node.left);
		if(left > max) {
			max = left;
		}
		int right = maximumValue(node.right);
		if(right > max) {
			max = right;
		}
		
		return max;
	}
	
}


public class BinaryTree {
	public static void main(String[] args) {
		Tree t1 = new Tree();
		t1.createBinaryTree();
		
		System.out.print("Inorder traversal using recursion:- ");
		t1.inorderRecursion(t1.root);
		System.out.println();
		
		System.out.print("Preorder traversal using recursion:- ");
		t1.preorderRecursion(t1.root);
		System.out.println();
		
		System.out.print("Postorder traversal using recursion:- ");
		t1.postorderRecursion(t1.root);
		System.out.println();
		System.out.println();
		
		System.out.print("Inorder traversal using Iterative:- ");
		t1.inorderIterative();
		System.out.println();
		
		System.out.print("Preorder traversal using Iterative:- ");
		t1.preorderIterative();
		System.out.println();
		
		System.out.print("Preorder traversal using Iterative:- ");
		t1.postorderIterative();
		System.out.println();
		System.out.println();
		
		System.out.print("Level order traversal:- ");
		t1.levelTraversal();
		System.out.println();
		
		System.out.println("Maximum value in binary tree: "+t1.maximumValue(t1.root));
		System.out.println();

	}
}
