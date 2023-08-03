package Array;

public class Searching {
	public static int linearSearch(int a[],int x) {
		int ans = -1;
		for(int i=0; i<a.length-1; i++) {
			if(a[i] == x) {
				ans = i;
				break;
			}
		}
		 return ans;
	}
	
	public static int binarySearch(int a[], int x){
		int low = 0;
		int high = a.length -1;
		while(low <= high) {
			int mid = (low +high)/2;
			if(a[mid] == x)return mid;
			
			if(x >a[mid]){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		
		return low;
	}
	
	public static void main(String[] args) {
		int arr[] = {23,5,78,21,3,99,18,15,0,4};
		System.out.println(linearSearch(arr, 21));
		
		int arr2[] = {2,5,6,9,10,24,36,57,89,99,134};
		System.out.println(binarySearch(arr2, 99));
		
	}
}
