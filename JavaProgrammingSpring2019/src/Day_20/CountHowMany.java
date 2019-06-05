package Day_20;

public class CountHowMany {
public static void main(String[] args) {
	
	// word
	// char to count the number of occurrences
	
	String word = "computer programming";
	char myChar = 'm';
	
	int count = 0;
	
	for(int i=0; i<word.length(); i++) {
		
	if(word.charAt(i)==myChar) {
		count++;
	  }
	
	}
	
	    System.out.println(count);
	  
	
	
	
	
	
     }

}
