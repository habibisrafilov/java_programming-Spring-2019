package day_32;

public class Cooking {
	public static void main(String[] args) {
		
		makePancekes();
		makePasta();
		cook("Omlet,","Eggs,salt");
	}
	
	
	     public static void cook(String dish, String ingredients) {
	    	 System.out.println(dish.toUpperCase()+" recipe");
	    	 add(ingredients);
	    	 System.out.println("cook it");
	    	 System.out.println("--"+dish.toUpperCase()+" is ready");
	     }
	
	   public static void makePasta() {
		   System.out.println("ITALIAN PASTA");
		   add("Water,Salt,Olive Oil");
		   boil(2);
		   add("Spagetti Pasta");
		   boil(2);
		   mix(60);
		   System.out.println("delicious pasta");
		   System.out.println("********************");
		   
	   }
	   
	
	   public static void makePancekes() {
		   System.out.println("--PANCEKES RECIPTE--");
		   add("Milk,Eggs,Flour,Suger,Salt");
		   mix(120);
		   fry(3);
		   System.out.println("--ENJOY IT");
	   }

	     public static void add(String ing) {
	    	 System.out.println("Add "+ing);    	  
	     }
	     
	     public static void mix(int seconds) {
	    	 System.out.println("Mix for "+seconds+"seconds");
	     }
	     
	     public static void fry(int minutes) {
	    	 System.out.println("Fry for "+minutes+"minutes");
	     }
	     public static void boil(int minutes) {
	    	 System.out.println("Boil it for "+minutes+"minutes");
	     }
	     
	     
	     
	     
	     
	     
	     
	     
}
