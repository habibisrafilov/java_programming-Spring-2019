package Day_50;

public class Google extends SearchEngine {
	
	
	 public  int  search(String item) {
		  System.out.println("Searching for : "+item);
		  int resultsCount = item.length();
		  return resultsCount;
		  
	  }
	 
	      protected int search(String item,String item2) {
		  System.out.println("Searching for 2 items : "+item+",");
		  int resultsCount = item.length()+item2.length();
		  System.out.println("Total count : "+resultsCount);
		  return resultsCount;
	  }
	 
}
