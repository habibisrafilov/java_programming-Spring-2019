package day_42;
import java.util.*;
public class DSW {

	 public static void main(String[] args) {
		
   
	  Shoes shoes1 = new Shoes();
	  shoes1.setShoesData("Aldo", 6.5);
	  System.out.println(shoes1.getShoesData());
	  
	  Shoes shoes2 = new Shoes();
	  shoes2.setShoesData("Allen Edmons", 7.5);
	  
	  
	  Shoes shoes3 = new Shoes();
	  shoes3.setShoesData("Boss hugo boss", 9.0);
	  
	  
	  
	  Shoes[] shoesArray = new Shoes[3];
	  
	  shoesArray[0] = shoes1;
	  shoesArray[1] = shoes2;
	  shoesArray[2] = shoes3;
	  
	  
	  System.out.println(shoesArray[0].getShoesData());
	  System.out.println(shoesArray[1].getShoesData());
	  System.out.println(shoesArray[2].getShoesData());
	  
	  
	  
	  // ArrayList of Shoes
	  
	  ArrayList<Shoes>myShoes = new ArrayList<>();
	  
	  myShoes.add(shoes1);
	  myShoes.add(shoes2);
	  myShoes.add(shoes3);
	  
	  System.out.println(myShoes.get(0).getShoesData());
	  System.out.println(myShoes.get(1).getShoesData());
	  System.out.println(myShoes.get(2).getShoesData());
	  
	  
	  System.out.println(myShoes.get(0).size);
	  System.out.println(myShoes.get(1).size);
	  System.out.println(myShoes.get(2).size);
	  
	  
	  Shoes redShoes = myShoes.get(1);
	  System.out.println(redShoes.getShoesData());
	  
	  // lets use for each loop and print data for each shoe
	  
	  for(Shoes sh:myShoes) {
		  System.out.println(sh.getShoesData());
	  }
	  
	  // print name of Shoes in the list that size is more than 7
	  for(Shoes shoes: myShoes) {
	  if(shoes.size >7) {
		  System.out.println(shoes.brand);
	  }
	  }
	  
	  
	  
	  
	  
	  
	  
	 
	 }
}
