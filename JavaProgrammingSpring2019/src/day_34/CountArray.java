package day_34;

import java.util.Arrays;

public class CountArray {
	public static void main(String[] args) {
		
		int [] nums = {20,10,20,45,30,45,10,60,55,80,45,90};
		
		   System.out.println(findNumberInArray(nums,45));
		   System.out.println(findNumberInArray(nums,20));
		   int tens = findNumberInArray(new int[] {20,10,20,45,30,45,10,60,80,10,45,90,10}, 10);
		   
		    System.out.println(tens);
		    
		    
		    System.out.println(Arrays.toString(getArray()));
		    
		    int [] nums1 = getArray();
		    for(int n12:nums1) {
		    	System.out.println(n12);
		    }
		    
		    System.out.println(Arrays.toString(nums1));
		    
		    
	}
	
	public static int findNumberInArray(int[] array , int value) {
		   int counter=0;
		   for(int n:array) {
			   
			   if(n==value) {
				   counter++;
				   
			   }
		   }
		
		return counter;
	}
	
	
	
	public static int[] getArray() {
		int[] number = {7, 5,12,67,9};
		return number;
	}
	
	public static void 
	
	

}
