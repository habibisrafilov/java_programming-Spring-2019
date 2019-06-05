package day_37;
import java.util.*;
public class myCities {
	public static void main(String[] args) {
		
	
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		// print each city using for each loop separated by space 
		// print each city using for loop separated by space 
		
		
		for(String city:cities) {
			System.out.print(city+" ");
		}
		System.out.println("\n");
		
		for(int i=0; i<cities.size(); i++) {
			System.out.print(cities.get(i)+" ");
		}
		
		System.out.println();
		cities.remove("Baku");
		System.out.println(cities);
		
		cities.remove("New York");
		
		System.out.println(cities);
		
		
		System.out.println(cities.isEmpty());
		
		cities.add(0,"Sumqayit");
		System.out.println(cities);
		cities.add(2, "Lerik");
		System.out.println(cities);
		
		cities.set(2, "Seul");
		
		System.out.println(cities);
		
		cities.clear();
		System.out.println(cities);
		
		// ArrayList Methods
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
