package day_42;
import java.util.*;
public class Sturbucks2 {
public static void main(String[] args) {
	
	// declare an array that can store 2 Coffee objects
	// int[] nums = new int[2];
	// declare coffeeArray that can store 2 coffee objects
	
	Coffee[] coffeeArray = new Coffee[2];
	 // create coffee object and assign to index 0 . 
	coffeeArray[0] = new Coffee();
	//  access coffee object in index 0 and set data 
	coffeeArray[0].setCoffeeInfo("Expresso", "tall", 20.99, 7);
	// access coffee object in index 0 and call method getCaffeeInfo
	coffeeArray[0].getCoffeeInfo();
	// create object first 
	Coffee latte = new Coffee();
	// assign data
	latte.setCoffeeInfo("cafe latte", "grande", 3.85, 190);
	// assign the latte object to index 1 of the array
	 coffeeArray[1] = latte;
	//  print data from object in index 1.
	 coffeeArray[1].getCoffeeInfo();
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    }
}
