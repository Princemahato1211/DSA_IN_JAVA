package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
	
	public static boolean valid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char a = s.charAt(i);
			if(a=='(' || a=='[' || a=='{') {
				stack.push(a);
			}else {
				if(stack.isEmpty()){
					return false;
				}else {
					if(a == ')' && (stack.peek() != '(')) {
						return false;
					}else if(a == '}' && (stack.peek() != '{')) {
						return false;
					}else if(a == ']' && (stack.peek() != '[')) {
						return false;
					}else {
						stack.pop();
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		System.out.println(valid(s));
	}
}
