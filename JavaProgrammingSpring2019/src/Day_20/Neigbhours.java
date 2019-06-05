package Day_20;
import java.util.*;
public class Neigbhours {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter word: ");
	String word = scan.next();
	
	// aabcdd  
	// if character and next one are same print
	// Beep - a
	// Beep - d
	
	for(int i=0; i<word.length()-1; i++) {
		if(word.charAt(i)==word.charAt(i+1)) {
			System.out.println("Beep");
		}else {
			System.out.println("silent");
		}
	}
	
	   
	
	
	
}
}
