package day_11;

import java.util.Scanner;

public class HappyValleySchool {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age :");
		int age = scan.nextInt();
		
		if(age<2 || age>18) {
			System.out.println("ineligible");
		}else if(age==2) {
			System.out.println("todler");
		}else if(age>=3 && age<=5) {
			System.out.println("early childhood");
		}else if(age==6 && age==7) {
			System.out.println("young reader");
		}else if(age>=8 && age<=10) {
			System.out.println("elementary");
		}else if(age>=10 && age<=12) {
			System.out.println("middle");
		}else if(age ==13) {
			System.out.println("impossible");
		}else if(age>=14 && age<=16) {
			System.out.println("high school");
		}else if(age == 17 && age == 18) {
			System.out.println("scholar");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
