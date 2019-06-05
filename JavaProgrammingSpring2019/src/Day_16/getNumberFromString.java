package Day_16;

public class getNumberFromString {
public static void main(String[] args) {
	
	String sentence = "I wrote [1236] lines of code today";
	// print the number between [and]
	
	System.out.println(sentence.substring(9,12));
	
	    int start = sentence.indexOf("[")+1;
	    int end = sentence.indexOf(']');
	    System.out.println(start);
	    System.out.println(end);
	   System.out.println( sentence.substring(start, end));
	    
	   int start1 = sentence.indexOf("of");
	  int end1 = sentence.indexOf("today");
	  
	  System.out.println(sentence.substring(start1, end1));
	  int start2 = sentence.indexOf("I wrote");
	  int end2 = sentence.indexOf("day");
	  System.out.println(sentence.substring(start2, end2));
	  
	  int start3 = sentence.indexOf("wrote")+3;
	  int end3 = sentence.indexOf("of")+1;
	  System.out.println(sentence.substring(start3, end3));
	  
	  
	  System.out.println(sentence.indexOf("wrote"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	    
	    

}


}
