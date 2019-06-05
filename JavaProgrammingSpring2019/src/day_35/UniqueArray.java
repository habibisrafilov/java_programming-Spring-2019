package day_35;

import java.util.Arrays;

public class UniqueArray {
public static void main(String[] args) {
	
	int [] nums = {10,4,4};
	System.out.println(Arrays.toString(nums));
	
	findUnique(nums);
	
	for(int i=0; i<nums.length; i++) {
		int temp = nums[i];
		int counter = 0 ; 
		for(int j=0; j<nums.length; j++) {
			if(nums[j]==temp && i!=j) {
				counter++;
				break;
				
			}
		}
		
		
		if(counter==0) {
			System.out.println(temp);
		}
		
	}
	
	
     }

          public static void findUnique(int[] nums) {
        	  
        	  System.out.println(Arrays.toString(nums));
        		
        		for(int i=0; i<nums.length; i++) {
        			int temp = nums[i];
        			int counter = 0 ; 
        			for(int j=0; j<nums.length; j++) {
        				if(nums[j]==temp && i!=j) {
        					counter++;
        					break;
        					
        				}
        			}
        			
        			
        			if(counter==0) {
        				System.out.println(temp);
        			}
        			
        		}
        		
        		
          }
          
          public static int[] getUniqueArray(int[] nums) {
        	  int uniqueCount = 0;
        	  for(int i=0; i<nums.length; i++) {
      			int temp = nums[i];
      			int counter = 0 ; 
      			for(int j=0; j<nums.length; j++) {
      				if(nums[j]==temp && i!=j) {
      					counter++;
      					break;
      					
      				}
      			}
      			
      			
      			if(counter==0) {
      				uniqueCount++;
      			}
      			
      		}
      		int [] uniqueArray = new int[uniqueCount];
      		
      		
      		for(int i=0; i<nums.length; i++) {
      			int temp = nums[i];
      			int counter = 0 ; 
      			for(int j=0; j<nums.length; j++) {
      				if(nums[j]==temp && i!=j) {
      					counter++;
      					break;
      					
      				}
      			}
      			
      			
      			if(counter==0) {
      				uniqueCount++;
      			}
      			
        	  
          }
          
      		 
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          }     
          
          
          
          


}
