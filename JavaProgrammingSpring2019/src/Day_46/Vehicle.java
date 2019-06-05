package Day_46;

public class Vehicle {
 String type; // instance variable , every object has its own type
 static int numberOfVechiles;// shared,one central value
 
 
  public static void vehicleType() {
	 // System.out.println("type: "+type);  will not compile . type is non static
	  System.out.println("Number of veachles: "+numberOfVechiles);
	  int count = getNumberOfVechiles();
	  String make = "Kia";
	  make = make.toUpperCase();
	  
	  
  }
 
   public static int getNumberOfVechiles() {
	   return numberOfVechiles;
   }
 
      public String toString() {
    	  return "Vechile type:"+type+" | "+numberOfVechiles;
      }
 
     
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 
 
}
