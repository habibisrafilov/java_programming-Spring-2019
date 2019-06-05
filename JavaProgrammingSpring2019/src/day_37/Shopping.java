package day_37;
import java.util.*;
public class Shopping {

	public static void main(String[] args) {
		
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("kiwi");
		shoppingList.add("apple");
		shoppingList.add("banana");
		shoppingList.add("grape");
		shoppingList.add("orange");
		shoppingList.add("staberry");
		
		
		// print number of items
		 System.out.println(shoppingList.size());
		 
		 // print all items in single line
		 System.out.println(shoppingList.toString());
		
		           // OR
		 
		 System.out.println(shoppingList );
		 
		 
		 // print first and last item 
		 
		 System.out.println(shoppingList.get(0));
		 System.out.println(shoppingList.get(shoppingList.size()-1));
		 
		 System.out.print(shoppingList.remove(2));
		 System.out.println();
		 System.out.println(shoppingList.toString());
		 System.out.println(shoppingList.remove("orange"));
		 System.out.println(shoppingList );
		 
		 for(String shop:shoppingList) {
			 System.out.println(shop);
		 }
		 
		 shoppingList.clear();
		 
		 System.out.println(shoppingList );
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	  
}
