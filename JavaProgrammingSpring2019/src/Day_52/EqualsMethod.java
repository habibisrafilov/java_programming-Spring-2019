package Day_52;

public class EqualsMethod {
	public static void main(String[] args) {
		
		  Computer comp1 = new Computer("Imac" , "silver");
		  Computer comp2 = new Computer("Imac" , "silver");
		  Computer comp3 = comp2;
		  Computer comp4 = comp1;
		  
		  System.out.println(comp1 == comp2);
		  System.out.println(comp1.equals(comp2));
		  System.out.println(comp3.equals(comp2));
		  System.out.println(comp3 == comp2);
		  System.out.println(comp4.equals(comp1));
		  System.out.println(comp4 == comp1);
		
		
	}

}
