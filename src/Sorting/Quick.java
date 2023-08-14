package Sorting;

public class Quick {
	public static void main(String[] args) {
		int [] arr  = {45,32,14,78,97,43,2,14,21,11,8,9};
		System.out.print("Before sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		quickShorting(arr,0,arr.length-1);
		System.out.print("\nAfter Quick sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void quickShorting(int []arr,int low,int high) {
		if(low<high) {
			int mid = partition(arr, low, high);
			quickShorting(arr, low, mid-1);
			quickShorting(arr, mid+1, high);
			
//			System.out.print("\n ");
//			for(int k=0; k<arr.length; k++) {
//				System.out.print(arr[k]+" ");
//			}
			
		}
	}
	
	public static int partition(int []arr,int low,int high) {
		int k =low;
		int pivot = arr[high];
		for(int i=low;i<high; i++) {
			if(arr[i] <=pivot) {
				swap(arr,i,k);
				k++;
			}
		}
		swap(arr,k,high);
		return k;
	}
	
	public static void swap(int []arr,int i,int k) {
		int temp = arr[k];
		arr[k] = arr[i];
		arr[i] = temp;
	}
	
}
