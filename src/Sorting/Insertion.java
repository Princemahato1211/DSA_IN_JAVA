package Sorting;

public class Insertion {
	public static void main(String[] args) {
		int [] arr  = {45,32,14,78,97,43,2,14,21,11,8,9};
		System.out.print("Before sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		insertionShorting(arr);
		System.out.print("\nAfter Insertion sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertionShorting(int []arr){
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j=i;
			while(j>0 && temp <arr[j-1]) {
				//swap(j,j-1)
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
			
			// to print all the case "uncomment" below four lines
//			System.out.print("\n"+i+" :");
//			for(int k=0; k<arr.length; k++) {
//				System.out.print(arr[k]+" ");
//			}
		}
	}
}
