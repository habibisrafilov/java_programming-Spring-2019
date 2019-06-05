package day_42;

import java.util.Scanner;

public class StringShoesToObject {
public static void main(String[] args) {
	
	// create Shoes object and assign the data from the  String data 
	String data = "Bruno Magli,9.5";
	// split using , and store into array
	String [] arrData = data.split(",");
	// Create Shoes object 
	Shoes shoes = new Shoes();
	// first way 
	shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
	System.out.println(shoes.getShoesData());
	
	//  second way 
	
	 shoes.brand = arrData[0];
	 shoes.size = Double.parseDouble(arrData[1]);
	  System.out.println(shoes.getShoesData());
	 
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("What shoes brand?");
	 String brand = scan.next();
	 System.out.println("What is your size");
	 double size = scan.nextDouble();
	 
	 // create object using data from scanner 
	 Shoes shoes1 = new Shoes();
	 
	shoes1.setShoesData(brand, size);
	 System.out.println(shoes1.getShoesData());
	 
	 
	
	
	
	
	
	
   }
}


