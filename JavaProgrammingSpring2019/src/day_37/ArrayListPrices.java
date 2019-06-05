package day_37;
import java.util.*;
public class ArrayListPrices {
public static void main(String[] args) {
	
	List<Double> price = Arrays.asList(2.1,2.2,2.3,2.4,2.5,2.6,2.7,2.8,2.9,3.1);
	
	
	System.out.println(price);
	
	
	double sum = 0;
	
	 for(double nums:price) {
		 System.out.print(nums+" ");
		 sum+=nums;
	 }
	
	   System.out.println(sum);
	   
	   double sum2 = 0 ;
	   
	   for(int i=0; i<price.size(); i++) {
		   sum2+=price.get(i);
		   System.out.print(price.get(i)+" ");
		   
	   }
	
	      System.out.println();
	      System.out.println(sum2);
	      
	      System.out.println();
	      
	     List<Integer> expensive = Arrays.asList(234,12,55445,32,78,4353,33);
	     
	     for(int exp:expensive) {
	    	 System.out.print(exp+" ");
	     }if(expensive>100) {
	    	 System.out.println(expensive);
	     }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	
	
	
	
	
	
	
	
	
}

}