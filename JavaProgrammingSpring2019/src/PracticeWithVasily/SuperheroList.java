package PracticeWithVasily;

import java.util.ArrayList;

public class SuperheroList {
public static void main(String[] args) {
	
	ArrayList<String>superheroes =new  ArrayList<>();
	
	superheroes.add("Iron man");
	superheroes.add("Hulk");
	superheroes.add("Wonder Woman");
	superheroes.add("Thor");
	superheroes.add("Batman");
	superheroes.add("Hellboy");
	superheroes.add("Superman");
	superheroes.add("Flash");
	superheroes.add("Captain America");
	superheroes.add("Ant-Man");
	superheroes.add("Aquaman");
	
	System.out.println(superheroes);
	
	// lets create an array list that will store superheroes that have space in the name
	
	ArrayList<String>superHeroesWithSpace = new ArrayList<>();
	String name ="";
	for(String hero:superheroes) {
		if(hero.contains(" ")) {
			superHeroesWithSpace.add(hero);
		}
		  if(hero.length()>name.length()) {
			  name=hero;
		  }
	}
	
	System.out.println(superHeroesWithSpace);
	System.out.println(name);
	// how to find second longest word
	String secondLongest = "";
	for(String hero:superheroes) {
		if(hero.contains(" ")) {
			superHeroesWithSpace.add(hero);
		}
		  if(hero.length()>secondLongest.length() && !secondLongest.equals(name)) {
			  secondLongest=hero;
		  }
	
	}
	System.out.println("Second longest name: "+secondLongest );
}
}
