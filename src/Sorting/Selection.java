package Sorting;

public class Selection {
	public static void main(String[] args) {
		int [] arr  = {45,32,14,78,97,43,2,14,21,11,8,9};
		System.out.print("Before sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		selectionShorting(arr);
		System.out.print("\nAfter selection sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void selectionShorting(int []arr){
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int min = i;
			for(int j=i+1; j<n; j++){
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
			// to print all the case "uncomment" below four lines
//			System.out.print("\n"+i+" :");
//			for(int k=0; k<arr.length; k++) {
//				System.out.print(arr[k]+" ");
//			}
		}
	}
	
}
