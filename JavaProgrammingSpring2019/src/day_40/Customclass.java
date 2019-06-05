package day_40;

import java.util.ArrayList;

public class Customclass {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Sun");
		myList.add("Pluto");
		myList.add("Mercury");
		myList.add("Neptune");
		myList.add("Sun");
		
		
		String targetWord = "Sun";
		int count = countOccurances(myList , targetWord);
		   if(count == 3) {
			   System.out.println("Unit test PASS : Count is 3");
		   }else {
	            System.out.println("Unit Test FAIL: Count is " + count);
	        }
		
		   
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	  public static int  countOccurances(ArrayList<String> list ,String word) {
		  
		  int count = 0; 
		  for(String str:list) {
			  if(str.equalsIgnoreCase(word)) {
				  count++;
				 
				  
				  
			  }
		  }
		  return count; 
	  }

}
