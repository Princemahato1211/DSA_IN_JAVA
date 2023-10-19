package algorithm;

import java.util.*;
public class MaxProductSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = maxProduct(arr);
		System.out.println(result);
	}
	public static int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(prefix == 0) prefix=1;
            if(suffix == 0) suffix=1;

            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];
            ans = Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
}
