package graph;

class Matrix{
	private int e;  // edges
	private int v;  // vertices
	private int[][] arr;
	
	Matrix(int n){
		this.v = n;
		this.e = 0;
		arr = new int[n][n];
	}
	
	public void add(int u,int v) {
		this.arr[u][v] = 1;
		this.arr[v][u] = 1;
		e++;
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
		Matrix m1 = new Matrix(4);
		m1.add(0, 1);
		m1.add(1, 2);
		m1.add(2, 3);
		m1.add(3, 0);
		
		System.out.println(m1.toString());
	}
}
