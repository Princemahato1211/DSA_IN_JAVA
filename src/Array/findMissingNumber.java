package Array;

import java.util.Scanner;

// Given an array n-1 distinct numbers in the range of 1 to n .Find the missing number
public class findMissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k=1;
		k= sc.nextInt();
		int arr[] = new int [k];
		for(int i=0; i<k; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum= 0;
		for(int i=0; i<k; i++) {
			sum+=arr[i];
		}
		
		int total  = ((k)*(k+1))/2;
		System.out.println("the Missing number is: "+(total-sum));
	}
}
