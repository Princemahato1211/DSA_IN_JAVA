package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Matrix1{
	private int V;
	private int E;
	private LinkedList<Integer> [] list;
	
	Matrix1(int n){
		this.V = n;
		this.E = 0;
		list = new LinkedList[n];
		for(int i=0; i<V;i++){
			list[i] = new LinkedList<Integer>();
		}
	}
	
	public void add(int u,int v) {
		this.list[u].add(v);
		this.list[v].add(u);
		E++;
	}
	
	public void bfs(int s) {                            // Breadth first search
		boolean visited[] = new boolean[V];
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		visited[s] = true;
		while(!q.isEmpty()){
			int u = q.poll();
			System.out.print(u+" ");
			for(int v: list[u]) {
				if(!visited[v]) {
					q.add(v);
					visited[v] = true;
				}
			}
		}
		System.out.println();
	}
	
	public void dfsIterative(int s) {                  // Depth first search Recursive
		boolean []visited = new boolean[V];
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(s);
		visited[s] = true;
		while(!stk.isEmpty()){
			int u = stk.pop();
			System.out.print(u+" ");
			for(int v : list[u]) {
				if(!visited[v]) {
					stk.push(v);
					visited[v] = true;
				}
			}
		}
		System.out.println();
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V+": Vertices "+E+": Edges\n");
		for(int i=0;i<V;i++) {
			sb.append(i+": ");
			for(int w:list[i]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}

public class AdjacencyList {
	public static void main(String[] args) {
		Matrix1 m1 = new Matrix1(4);
		m1.add(0, 1);
		m1.add(1, 2);
		m1.add(2, 3);
		m1.add(3, 0);
		
		System.out.println(m1.toString());
		
		System.out.print("BFS: ");
		m1.bfs(0);
		
		System.out.print("DFS Iterative: ");
		m1.dfsIterative(0);
   }
}
