package Dynamic_Programming;

import java.util.Scanner;


public class Fibonnaci_series {
	
	static int []fibo;
	
	// Using Bottom Up approach
	public static void fiboBottomUp(int n) {
		int a[] = new int[n+1];
		a[0] = 0;
		a[1] = 1;
		for(int i=2;i<=n;i++){
			 a[i] = a[i-1]+a[i-2];
		}
		
		for(int i=0;i<=n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	// using Top down approach
	public static int fiboTopDown(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		return fiboTopDown(n-1)+fiboTopDown(n-2);
	}
	
	// using Top Down with Memonization
	public static int fiboTopDown_Memonization(int a[],int n){
		if(a[n] == 0) {
			if(n==0) {
				return 0;
			}
			if(n==1) {
				return 1;
			}
			a[n] = fiboTopDown_Memonization(a,n-1)+fiboTopDown_Memonization(a,n-2);
		}
		return a[n];
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		fibo = new int[n+1];
		
		fiboBottomUp(n);
		System.out.println();
		System.out.println(fiboTopDown(n));
		
		System.out.println();
		System.out.println(fiboTopDown_Memonization(fibo, n));
		
	}
}
