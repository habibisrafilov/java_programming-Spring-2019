package day_35;

public class PracticeString {
	public static void main(String[] args) {
		
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word="habib";
		
//		"e"-->"v"
//		"a"-->"z"
//		"s"-->"h"
//		"t"-->"g"
//		"e"-->"v"
//		"r"-->"j"
		
		char first = word.charAt(0);
		int position = alphabet.indexOf(first);
		System.out.println("position "+position);
		char enChar = encrypted.charAt(position);
		System.out.println(first+"--> "+enChar);
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			int index = alphabet.indexOf(ch);
			System.out.println(encrypted.charAt(index));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
