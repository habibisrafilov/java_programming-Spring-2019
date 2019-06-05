package Day_41;
import java.util.*;
public class WarpUpWithList {
	public static void main(String[] args) {
		List<Integer>myList = new ArrayList<>();
		myList.add(5);
		myList.add(4);
		myList.add(10);
		
		System.out.println(doubleList(myList));
		
		List<Integer>newList = doubleList(myList1);
		System.out.println(newList);
		myList1.add(50);
		myList1.add(40);
		myList1.add(100);
	}
	
	
	public static List<Integer>doubleList(List<Integer>nums){
		for(int i=0; i<nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
			
		}
		return nums;
	}
}
