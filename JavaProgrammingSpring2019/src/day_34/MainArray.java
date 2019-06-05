package day_34;
import java.util.*;
public class MainArray {
	public static void main(String[] args) {
		
		
		
		System.out.println(Arrays.toString(getArray.getArray()));
		// store return value into array
		int[] nums = getArray.getArray();
		System.out.println(Arrays.toString(nums));
		
		System.out.println(Arrays.toString(getArray.getRandomArray(20)));
		
		System.out.println(Arrays.toString(randomNums));
	}
	
//	 method name: getRandomArray
//	 return int[]
//			 params int size 
//	 in the method  create an array with value of size and assign random values from 0-100 and return it.
	
	
	public static int[] getRandomArray(int size ) {
			Random r = new Random();
			int [] myArray = new int [size];
			for(int i=0; i<size; i++) {
				myArray[i]=r.nextInt(101);
				
				
				
			}
		
			    return myArray;
			    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
