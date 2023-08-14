package Sorting;

public class Bubble {
	public static void main(String[] args) {
		int [] arr  = {45,32,14,78,97,43,2,14,21,11,8,9};
		System.out.print("Before sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		bubbleshorting(arr);
		System.out.print("\nAfter bubble sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void bubbleshorting(int [] arr) {
		boolean isChanged = true;
		int n = arr.length;
		while(isChanged == true) {
			isChanged = false;
			for(int i=0; i<n-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					isChanged = true;
				}
			}
			n--;
			// to print all the case "uncomment" below four lines
//			System.out.println();
//			for(int i=0; i<arr.length; i++) {
//				System.out.print(arr[i]+" ");
//			}
		}
	}
}
