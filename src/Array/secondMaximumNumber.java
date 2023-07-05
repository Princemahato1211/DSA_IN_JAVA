package Array;

public class secondMaximumNumber {
	
	public static void display(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int secondmax(int []arr) {
		int secmax=Integer.MIN_VALUE;
        int max =arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max){
				secmax = max;
				max = arr[i];
			}else if(arr[i] >secmax && arr[i] != max) {
				secmax = arr[i];
			}
			System.out.println(secmax);
		}
		return secmax;
	}
	
	public static void main(String[] args) {
		int arr[] = {4,6,7,6,4,8,2,8,9,9};
		display(arr);
		int secmax = secondmax(arr);
		System.out.println("Second max is : "+secmax);
		
	}
}
