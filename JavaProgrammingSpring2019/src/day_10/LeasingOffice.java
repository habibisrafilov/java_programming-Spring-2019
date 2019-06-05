package day_10;
import java.util.Scanner;
public class LeasingOffice {
	public static void main(String[] args) {
	
	   
		 Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Welcome to Cybertek Apartments!");
		    System.out.println("Number of bedrooms you are interested:");
		    int numberOfBedrooms = scan.nextInt();
		    int startingPrice=0;
		    //WRITE YOUR CODE HERE
		    
		    if(numberOfBedrooms==1) {
		    	System.out.println("1 bedroom selected");
		    	startingPrice = 1100;
		    }else if(numberOfBedrooms==2) {
		    	System.out.println("Two bedroom selected");
		    	startingPrice = 1850;
		    }else if(numberOfBedrooms==3) {
		    	System.out.println("Three bedroom selected");
		    	startingPrice = 2250;
		    }else {
		    	System.out.println("No such bedrooms aviable");
		    }
		    
		    
		    System.out.println("Starting price value: "+startingPrice);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		
	}

}
