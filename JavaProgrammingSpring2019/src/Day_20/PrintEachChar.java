package Day_20;

public class PrintEachChar {
public static void main(String[] args) {
	
	String word = "Wooden Spoon";
	// using for loop , print each char one by one
	
	for(int i=0; i<word.length(); i++) {
		System.out.println(word.charAt(i));
	}
	
	// using for loop , print only consonants
	for(int i=0; i<word.length(); i++) {
	if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='o' || word.charAt(i)=='i' || word.charAt(i)=='u') {
		System.out.println("these are vowels");
	}else {
		System.out.println("these are consonants");
	}
	
	}
	
	// using for loop , print only vowel(a,e,o,i,u)
	
	
	
	
	
}
}
