package day_30;

import java.util.Scanner;

public class rangePrint {
	public static void main(String[] args) {
		rangePrint();
		
		
		
	}

	public static void rangePrint() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 2 nums: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(num1<num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.println(i+" ");
			}
		}else if (num1>num2){
			for(int j=num1; j>=num2;j--) {
				System.out.println(j+" ");
			}
		}else {
			System.out.println(num1);
		}
		
	}
	
	
	
	
}
