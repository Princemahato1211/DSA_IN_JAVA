package algorithm;

public class Kadanes_Algorithm {
	
	public static int Kadane(int a[]){
		int current_max = a[0];
		int max_so_far = a[0];
		for(int i=1; i<a.length;i++) {
			current_max = current_max + a[i];
			
			current_max = Math.max(current_max, a[i]);
			
			max_so_far = Math.max(max_so_far, current_max);
		}
		return max_so_far;
	}
	
	public static void main(String[] args) {
		int a[] = {4,3,-2,6,-12,7,-1,6};
		System.out.println(Kadane(a));
	}
}
