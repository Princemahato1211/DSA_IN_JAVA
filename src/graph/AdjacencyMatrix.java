package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Matrix{
	private int e;  // edges
	private int v;  // vertices
	private int[][] arr;
	
	Matrix(int n){
		this.v = n;
		this.e = 0;
		arr = new int[n][n];
	}
	
	public void add(int u,int v) {                      // to add "1" between the vertices having edges
		this.arr[u][v] = 1;
		this.arr[v][u] = 1;
		e++;
	}
	
	public void bfs(int s) {                            // Breadth first search
		boolean visited[] = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		visited[s] = true;
		while(!q.isEmpty()){
			int u = q.poll();
			System.out.print(u+" ");
			for(int i=0; i<v; i++) {
				if(arr[u][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
		System.out.println();
	}

	public void dfsIterative(int s) {
		boolean []visited = new boolean[v];
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(s);
		visited[s] = true;
		while(!stk.isEmpty()){
			int u = stk.pop();
			System.out.print(u+" ");
			for(int i=0; i<v; i++) {
				if(arr[u][i] == 1 && !visited[i]){
					stk.push(i);
					visited[i] = true;
				}
			}
		}
		System.out.println();
	}
	
	
	public void dfs(){
		boolean visited[] = new boolean[v];
		for(int i=0;i<v; i++) {
			if(!visited[i]) {
				dfsRecusrive(i,visited);
			}
		}
	}
	
	public void dfsRecusrive(int s, boolean []visited) {
		System.out.print(s+" ");
		visited[s] = true;
		for(int i=0; i<v; i++) {
			if(arr[s][i] ==1 && !visited[i]) {
					dfsRecusrive(s, visited);
			}
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(v+": Vertices "+e+": Edges\n");
		for(int i=0;i<v;i++) {
			sb.append(i+": ");
			for(int w:arr[i]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
}

public class AdjacencyMatrix {
	public static void main(String[] args) {
		Matrix m1 = new Matrix(5);
		m1.add(0, 1);
		m1.add(1, 2);
		m1.add(2, 3);
		m1.add(3, 0);
		
		System.out.println(m1.toString());
		
		System.out.print("BFS: ");
		m1.bfs(0);
		
		System.out.print("DFS Iterative: ");
		m1.dfsIterative(0);
		
		System.out.print("DFS Recursive: ");
		m1.dfs();
	}
}
