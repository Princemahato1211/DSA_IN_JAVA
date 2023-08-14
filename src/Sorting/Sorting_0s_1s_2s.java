package Sorting;

public class Sorting_0s_1s_2s {
	public static void main(String[] args) {
		int [] arr  = {2,1,0,2,1,1,2,0,0,};
		System.out.print("Before sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sorting(arr);
		System.out.print("\nAfter Quick sorting : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
    public static void sorting(int []arr) {
    	int i=0;
    	int j=0;
    	int k = arr.length-1;
    	while(i<k) {
    		if(arr[i] == 0) {
    			swap(arr,i,j);
    			j++;
    			i++;
    		}else if(arr[i] == 1) {
    			i++;
    		}else {	
    			swap(arr,i,k);
    			k--;
    		}
    		
    		
//    		System.out.println("\n");
//    		for(int b=0; b<arr.length; b++) {
//    			System.out.print(arr[b]+" ");
//    		}
    	}
    }
	
    public static void swap(int []arr,int i,int k) {
		int temp = arr[k];
		arr[k] = arr[i];
		arr[i] = temp;
	}
    
}
