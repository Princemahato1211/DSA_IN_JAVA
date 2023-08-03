package Sorting;

public class Merge {
	public static void main(String[] args) {
		int [] arr  = {45,32,14,78,97,43,2,14,21,11,8,9};
		System.out.print("Before sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		mergeShorting(arr,0,arr.length);
		System.out.print("\nAfter  sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void mergeShorting(int arr[],int low,int high) {
		
	}
	
}
