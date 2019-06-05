package day_31;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		
		
	countUp(5);
	countDown(10);
	drive("Audi",60);
	drive ("Mazda ", 50);
	
	

	}
	
	public static void  countUp(int num) {
		if(num<1) {
			System.out.println("Invalid");
		}
		for(int i=1; i<=num; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void  countDown(int num1) {
		for(int j=num1; j>=0; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	public static void drive(String car,int speed) {
		System.out.println(car+" is driving "+speed+" mph");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
