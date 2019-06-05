package day_38;
import java.util.*;
public class ContainsAll {
	public static void main(String[] args) {
		
		
		List<Integer>nums1 = new ArrayList<>();
		
		nums1.add(10); nums1.add(20); nums1.add(30); nums1.add(40);
		List<Integer> nums2 = new ArrayList<>();
		
		 nums2.add(20); nums2.add(10);nums2.add(40);nums2.add(30);
		 
		 System.out.println(nums1.containsAll(nums2));
		 
		 
		 System.out.println(nums2.containsAll(nums1));
		 
		 
		 boolean b = nums1.containsAll(nums2) &&  nums2.containsAll(nums1);
		 System.out.println(b);
		 
		 
		 List<String> planA = new ArrayList<>();
		 planA.add("Java");
		 planA.add("replit");
		 planA.add("ping pong");
		 planA.add("food");
		 planA.add("run");
		 planA.add("sleep");
		 
		 List<String> planB = new ArrayList<>();
		 
		 planB.add("food");
		 planB.add("run");
		 planB.add("sleep");
		 planB.add("Java");
		 planB.add("ping pong");
		 planB.add("replit");
		 
		 
		 if(planB.containsAll(planA) && planA.containsAll(planB)) {
			 System.out.println("Plan A and B match");
		 }else {
			 System.out.println("Plan A and B do not match");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
