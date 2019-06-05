package day06_operators2;

import java.util.Scanner;

public class ScannerYourname {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your name ");
		
		String str =scan.next();  // accept String input
		
		System.out.println("Nice to meet you "+ str);
		
		
	}

}
