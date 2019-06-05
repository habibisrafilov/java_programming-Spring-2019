package day_42;
import java.util.*;
public class Burger7 {
	public static void main(String[] args) {
	
			
		Burger burger1 = new Burger();
		burger1.name = "Cowboy";
		String [] ing = {"onion","american cheese", "pickles","lettuce","b7sauce"};
		burger1.ingredients = ing;
		
		System.out.println(burger1.name);
		System.out.println(Arrays.toString(burger1.ingredients));
		// print first ingredient
		System.out.println(burger1.ingredients[0]);
		System.out.println(burger1.ingredients[4]);
		
		// print all ingredients using loop
		
		for(String  bg:burger1.ingredients) {
			System.out.print(bg+" ");
		}
		
		
		
		
		
		
		
	}

}
