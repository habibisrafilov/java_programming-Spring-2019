package day_26;

import java.util.Arrays;

public class split {
	public static void main(String[] args) {
		
		String words = "hi,bye,hey";
		String[] myWords=words.split(",");
		System.out.println(myWords[0]);
		System.out.println(myWords[1]);
		
		
		  String words1 = "java,kava,html,selenium";
		  
		  String[] wordsArray = words1.split(",");
	      System.out.println(wordsArray.length);
	
	System.out.println(Arrays.toString(wordsArray));
	
	
	   for(String word: wordsArray) {
		   System.out.print(word+" ");
		   
		   
		   
		   String diceResult = "1-20 of 1461 position";
		   
		   String[] words3 = diceResult.split(" ");
		   System.out.println(words3.length);
		   
		   System.out.println(Arrays.toString(words3));
		   
		   for(String s: words3) {
			   System.out.println(words3[2]);
			   
			   
			   String[] diceArray2 = diceResult.split("of");
			   		System.out.println(diceArray2[0]);
			   		System.out.println(diceArray2[1]);
			   		
			   		
			   		
			   		String sentence =  "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
			   		
			   		String [] allWords = sentence.split(" ");
			   		String[] happySplit =sentence.split("happy");
			   		String[] ISplit =sentence.split("I");
			   		
			   		
		for(String w : allWords) {
			System.out.println(w);
		}
			   
		  System.out.println("AFTER HAPPY SPLIT");
		  
		  for(String w: happySplit) {
			  System.out.println(w);
		  }
			   		
			   		
			for(String w: ISplit) {
				System.out.println(w);
			}
			   		
			   		
			
			String word6 = "java";
			
			char[] charsArray=word.toCharArray();
			
			for(char chbb : charsArray)
				System.out.println(chbb);
			
			
			
			
			
			
			
			
			
			
			
			   		
			   		
			   		
			   		
			   		
			   		
			   		
			   		
			   		
			   		
			   		
			   		
			   
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }
	
	
	
	
	}

}
