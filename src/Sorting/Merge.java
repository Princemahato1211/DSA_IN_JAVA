package Sorting;

public class Merge {
	public static void main(String[] args) {
		int [] arr  = {45,32,14,78,97,43,2,14,21,11,8,9};
//		int []arr = {2,10,5,3,6,4,11};
		System.out.print("Before sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		mergeShorting(arr,0,arr.length-1);
		System.out.print("\nAfter  sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void mergeShorting(int arr[],int low,int high) {
		if(low>=high) {
			return;
		}
		int mid = (low+high)/2;
		mergeShorting(arr, low, mid);
		mergeShorting(arr, mid+1, high);
		merge(arr,low,mid,high);
		
		// to print all the case "uncomment" below four lines
//		System.out.print("\n");
//		for(int k=0; k<arr.length; k++) {
//			System.out.print(arr[k]+" ");
//		}
	}
	
	public static void merge(int []a,int low,int mid,int high) {
		int i=low;
		int j=mid+1;
		int k=low;
		int temp[] = new int[a.length];
		while(i<=mid && j<=high) {
			if(a[i] > a[j]) {
				temp[k] = a[j];
				j++;
				k++;
			}else {
				temp[k] = a[i];
				i++;
				k++;
			}
		}
		
		if(i <= mid) {
			while(i<=mid){
				temp[k] = a[i];
				i++;
				k++;
			}
		}else {
			while(j<=high) {
				temp[k] = a[j];
				j++;
				k++;
			}
		}
		
		for(int m=low; m<=high; m++) {
			a[m] = temp[m];
		}
	}
}
