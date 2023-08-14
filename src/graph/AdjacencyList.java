package graph;

import java.util.LinkedList;

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
   }
}
