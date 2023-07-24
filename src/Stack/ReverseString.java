package Stack;

import java.util.Stack;

public class ReverseString {
	
	public static String Reverse(String s) {
		char arr[] = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			stack.push(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=stack.pop();
		}
		
		return new String(arr);
		
	}
	
	public static void main(String[] args) {
		String  s="prince";
		System.out.println("The Reverse String: "+Reverse(s));
	}
}
