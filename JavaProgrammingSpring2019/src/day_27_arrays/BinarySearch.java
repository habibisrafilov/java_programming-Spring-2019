package day_27_arrays;
import java.util.*;
public class BinarySearch {
public static void main(String[] args) {
	
	int[] nums = {4,6,7,10,55};
	
	System.out.println(Arrays.binarySearch(nums, 7));
	System.out.println(Arrays.binarySearch(nums,55));
	
	
	int i = Arrays.binarySearch(nums, 10);
	
	System.out.println(i);
	
	int[] nums2 = {40,6,17,10,55};
	Arrays.sort(nums2);
	System.out.println(Arrays.toString(nums2));
	System.out.println(Arrays.binarySearch(nums2, 40));
	
	
int[] num1 = {4,5,6,10,100};
int[] num2 = {4,5,6,10,100};

 System.out.println( Arrays.equals(num1, num2));
	
	if(Arrays.equals(num1, num2)) {
		System.out.println("same");
	}else {
		System.out.println("not same");
	}
	
	String[] strArr1 = {"one","two","three"};
	String[] strArr2 = {"one","Two","Three"};
	
	System.out.println(Arrays.equals(strArr1, strArr2));
	
	boolean match = Arrays.equals(strArr1, strArr2);
	System.out.println(match);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
