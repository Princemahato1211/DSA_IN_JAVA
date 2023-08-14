package Pattern;

import java.util.Scanner;

//abstract class vehicle{
//	
//}
//
//interface hero{
//	int s=10;
//	public void main();
//}

//class hero1{
//	int s = 11;
//	static {
//		System.out.println("gjhkjjkljhgj");
//	}
//	public void main1(){
//		System.out.println("Parent world !!");
//	}
//}
//
//class hero2 extends hero1{
//	public void main1() {
//		System.out.println("hello world !!" );
//	}
//	
//	int hii() {
//		return 2;
//	}
//}

public class StarPattern {	
//	public static void main(String[] args) {
//		hero1 h1 = new hero2();
//		h1.main1();
//		System.out.println(Math.floor(3.6));
//	} 
	
	static void primeNumber(int n) {
		if(n<=1) {
			System.out.println("The given number is not prime number");
			return;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				System.out.println("The given number is not prime number");
				return;
			}
		}
		System.out.println("The given number is a prime number");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
//		System.out.println(Math.sqrt(a));
		primeNumber(a);
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			boolean check = false;
//			for(int j=n-i;j>0;j--){
//				System.out.print("  ");
//			}
//			for(int j=i;j<=i;j--){
//				System.out.print(j+" ");
//				if(j==1){
//					check = true;
//				}
//				if(check){
//					j = j+2;
//				}
//			}
//			System.out.println();
//		}
//	}
}
