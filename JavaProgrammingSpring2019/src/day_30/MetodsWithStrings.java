package day_30;

import java.util.Arrays;

public class MetodsWithStrings {
	public static void main(String[] args) {
		
		countWords("java is fun");
		countWords("how are you ?");
		googleSearchResults("About 121,000,000 results (0.74 seconds)");
		
	}

	
          public static void countWords(String sentence) {
        	  String[] name = sentence.split(" ");
        	  
        	  
        	  System.out.println(Arrays.toString(name));
        	  System.out.println(name.length);
        	  
          }
	   
          // About 121,000,000 results (0.74 seconds) 
          
       
            public static void googleSearchResults(String sentence2) {
            	String[] words2 = sentence2.split(" ");
            	
            	String nam1 = words2[1].replace(",", "");
            	String nam2 = words2[3].replace("(", "");
            	System.out.println(nam1+" .  "+nam2);
            	
            	
            }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
}
