package Array;

public class moveZeroesToEnd {
	
	public static void display(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int [] moveZeroes(int arr[]) {
		int j=0,temp;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0 && arr[j] ==0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j] != 0){
				j++;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,7,0,2,0,5,7};
		display(arr);
		
		arr = moveZeroes(arr);
		display(arr);
	}
}
