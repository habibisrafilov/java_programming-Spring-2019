package day_13;

import java.util.Scanner;

public class CarSelector {
	public static void main(String[] args) {
		
		
	     Scanner scan = new Scanner(System.in);
	     
	     System.out.println("Which type of car are you interested in ?");
	     System.out.println(" 1)American\n 2)Japanese\n 3)German\n 4)Italian\n 5)Korean");
	     
	     int carType = scan.nextInt();
	     double averagePrice =0.0;
	     String carOptions = "";
	     String carOrigin ="";
	     
	     switch(carType) {
	     
	     case 1:
	    	 averagePrice=33000;
	    	 carOptions = "Ford,Dodge,tesla,Chevi , Lincoln";
	    	 carOrigin = "American";
	    	 break;
	    	 
	     case 2 : 
	    	 averagePrice = 32000;
	    	 carOptions = "Toyota,Mitsubisi,Honda , Subaru,Mazda";
	    	 carOrigin = "Japanese";
	          break;
	          
	     case 3:
	    	
	    	 averagePrice = 55000;
	    	 carOptions = "BMW,Audi,Mercedes,Porche";
	    	 carOrigin = "German";
	    	 break;
	    	 default:
	    		 System.out.println("Car type not aviable");
	    	 
	     }
	    	 System.out.println("You selected "+carOrigin+" car and your options are "+carOptions);
	    	 System.out.println("Average price: "+averagePrice);
	    	 
	    	 
	    	 
	
	     
	     
	     
	     
	     
	}

}
