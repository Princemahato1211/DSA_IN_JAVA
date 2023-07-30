package Array;

public class TwoDimensionalSortedMatrix {
	
	public static void searchElement(int[][] matrix,int n,int data) {
		int i=0;
		int j=n-1;
		while(i<n && j>=0) {
			if(matrix[i][j] == data) {
				System.out.println("Element found at index: "+i+","+j);
				return;
			}
			if(data < matrix[i][j]) {
				j--;
			}else {
				i++;
			}
			
		}
		System.out.println("Element not found: ");
	}
	
	public static void main(String[] args) {
		int arr[][] = { {10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,51}};
		searchElement(arr, 4, 32);
	}
	
}
