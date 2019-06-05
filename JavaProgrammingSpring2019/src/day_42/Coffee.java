package day_42;

public class Coffee { 
	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
	
		  String b = name+" "+size+" "+price+" "+calories;
		  System.out.println(b);
	
	}
	
	 public void setName(String newName) {
		 
		 name = newName;
	 }
	
	   public void setSize(String newSize) {
		   
		   if(newSize.equals("tall") ||
			  newSize.equals("grande") ||
			  newSize.equals("venti")) {
		          size=newSize;
		        	  
	     } else {
	    	 System.out.println("Error: Invalid size "+newSize);
	    	 size= "unknown";
	     }
		          
	   }
	 
	    public void setPrice(double newPrice) {
	    	price = newPrice;
	    }
	 
	     public void setCalories(int newCalories) {
	    	 calories = newCalories;
	     }
	 
	 
	      public void setCoffeeInfo(String newName,String newSize , double newPrice, int newCalories) {
	    	  name = newName;
	    	  setSize(newSize);
	    	  price = newPrice;
	    	  calories = newCalories;
	    	  
	      }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
