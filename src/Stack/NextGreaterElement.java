/*
 
 Given an array of integers.for Each element in the array,find its next greater element in array.
 the next greater element is the first element towards right,
 which is greater than curent element.
 Example-
      INPUT: arr={4,7,3,4,8,1}
      OUTPUT: arr={7,8,4,8,-1,-1}
      
 */


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
	
	public static int[] nextGreaterElement(int a[]) {	
		int result[] = new int [a.length];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=a.length-1; i>=0; i--) {
			if(!stack.isEmpty()) {
				while(!stack.isEmpty() && stack.peek() <= a[i]) {
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				result[i] = -1;
			}else {
				result[i] = stack.peek();
			}
			stack.push(a[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] =new int[6];
		System.out.println("Enter the array element: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr = nextGreaterElement(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
