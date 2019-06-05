package PracticeWithVasily;

import java.util.Arrays;

public class SuperHero {
	public static void main(String[] args) {
		
		String [] arr1 = {"word"};
		String [] arr2 = new String[1];
		String [] arr3 = new String[] {"apple","kiwi"};
		arr2[0] = "word";
		
		System.out.println(Arrays.toString(arr2));
	
		 String[] superheroes = { "Spiderman", "Iron man", "Hulk", 
                 "Wonder Woman", "Thor", "Batman", "Hellboy",
                 "Superman", "Flash", "Captain America", "Ant-Man", "Aquaman" };
		 
		 // how many superheroes we have with a space in the name
		 // lets print all of them, and their count
		 
		 int count = 0;
		 String heroesWithSpace = "";
		 for(String s:superheroes) {
			 if(s.contains(" ")) {
				 System.out.println(s);
				 heroesWithSpace+=s+",";
				 count++;
			 }
		 }
		
		    System.out.println("Count of superheros with space: "+count);
		    System.out.println(heroesWithSpace);
	}

}
