package day_34;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class getArray {
	public static void main(String[] args) {
	
		int[] nums1 = {10,20,5,3,6};
		int[] nums2 = {5,1,1,4,3};
		
		System.out.println(nums1[0]+nums2[0]);
		
		int[] nums3 = new int [nums1.length];
		
		for(int i=0; i<nums1.length; i++) {
			nums3[i]=nums1[i]+nums2[i];
			
		
			
		}
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.toString(nums3));
		
		int [] newArray = add2Arrays(nums1,nums2);
		System.out.println(Arrays.toString(newArray));
	}

	public static int[] add2Arrays(int[] nums1 , int[] nums2) {
		int [] nums3 =new int[nums1.length];
		for(int i=0; i<nums1.length; i++) {
			nums3[i]=nums1[i]+nums2[i];
			
			
	}
	
	return nums3;
	
	   String [] first = {"cybertek","java","student","mentor"};
	   String []second = {"100","001","five","best"};
	   add2Arrays(first , second);
	   System.out.println(Arrays.toString(add2Arrays));

	}
	
	public static String[] add2Arrays(String[] str1, String[] str2) {
		
//		String [] str1 = {"abc","hi"};
//		String [] str2 = {"bye","hi"};
		
		String[] newOne = new String [str1.length];
		for(int i=0; i<str1.length; i++) {
			newOne[i] = str1[i]+"-"+str2[i];
		}
		     return newOne;
	}
	
//	["abc", "hi"]
//	["bye", "sql"]
//	["abc-bye", "hi-sql"]
	   
	
	
	
	
	
	
	
	
	
	
	
}
