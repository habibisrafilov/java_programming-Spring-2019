package day_39;
import java.util.*;
public class CustomListMethod {
	public static void main(String[] args) {
	
		List<String> strNums = new ArrayList<>();
		strNums.add("113");
		strNums.add("123");
		strNums.add("1233");
		strNums.add("1238");
		
		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
	}
	    	   
	     
	  public static List<Integer> convertToIntList(List<String> strList){
		  List<Integer> newList = new ArrayList<>();
		  for(String str: strList) {
			  newList.add(Integer.parseInt(str));
			  
			  
		  }
		  return newList;
	  }
	  
	  
	  
	  
	  
	  

}
