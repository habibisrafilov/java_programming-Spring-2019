package day_30;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class Counter {
	public static void main(String[] args) {

		
		int n=55;
		
		int nums[] = {22,33,44,55,66,11,22,90};
		boolean present = false;
		
		for(int num:nums) {
			System.out.println(num);
			if(num==n) {
				present=true;
				break;
			}
		}
		System.out.println(present);
		
	}
		  
}
