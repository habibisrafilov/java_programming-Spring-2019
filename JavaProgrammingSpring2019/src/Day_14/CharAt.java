package Day_14;

public class CharAt {

	public static void main(String[] args) {
		
		String word = "Computer";
		
		// print all characters one by one 
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));	
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		// String sentence and check if first character is 'J'
		
		String sentence = "Java is fun";
		
		System.out.println(sentence.charAt(0));
		
		String word2 = "Java";
		
		System.out.println(word2.charAt(0));
		
		
		// String word3 consists of 5 characters
		// check if first and last characters are same
		// true ==> "first and last match"
		// false " first and last are different 
		String word3 = "habib";
		
		if(word3.charAt(0)==word3.charAt(word3.length()-1)) {
			System.out.println("First and last match");
		}else {
			System.out.println("first and last are different ");
		}
		
		
		// String word4 ==> always print the last caracter no matter the length
		String word4 = "uwhgfwfiwfni";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println(lastChar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
