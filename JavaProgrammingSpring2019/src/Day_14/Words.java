package Day_14;

import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word1 : ");
		String word1 = scan.next();
		
		System.out.println("Enter word2: ");
		String word2 = scan.next();
		
		if(word1.length()>word2.length()) {
			System.out.println("Word1 value is longer");
		}else if(word1.length()<word2.length()) {
			System.out.println("Word2 value is longer");
		}else {
			System.out.println("Word1 and Word2  are same ");
		}
	
		
		
	}
	

}
