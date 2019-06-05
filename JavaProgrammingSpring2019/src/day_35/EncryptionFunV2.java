package day_35;

public class EncryptionFunV2 {
	public static void main(String[] args) {
		
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		
		String normal = "saturday";
		String encrypted = encryptWord(normal);
		System.out.println("normal : "+normal+"\n"+"encrypted: "+encrypted);
	}
	
	    public static char  encryptChar(char ch) {
	    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
			String encrypted ="zyxwvutsrqponmlkjihgfedcba";
			//encrypted.charAt(alphabet.indexOf(ch));
			int i = alphabet.indexOf(ch);
			char ret = encrypted.charAt(i);
			return ret ; 
			
			
	    	
	    }
	    
	    public static String encryptWord(String word) {
	    	String cyphered = "";
	    	for(int i=0; i<word.length(); i++) {
	    		cyphered+=encryptChar(word.charAt(i));
	    		
	    	}
	    	
	    	   return cyphered;
	    	   
	    }

	    
	           public static String  encryptSentence(String sentence ) {
	        	   
	        	   String [] wordsArr = sentence.split(" ");
	        	   String retValue = "";
	        	   
	        	   for(String word:wordsArr) {
	        		  retValue+= encryptWord(word)+" ";
	        	   }
	        	   
	        	   return retValue.trim();
	        	   
	        	   
	           }
	     
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
