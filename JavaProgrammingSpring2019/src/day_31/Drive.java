package day_31;

public class Drive {
	public static void main(String[] args) {
		
		drive("Audi",60);
		home("appartment", 120.45);
		
		
	}
	// audi is driving 60 mph
	public static void drive(String car, int speed) {
		
		System.out.println(car+" is driving "+speed+" mph");
	}

	// My appartment  is 120.45 dollars. 
	    public static void home(String house , double price) {
	    	System.out.println("My "+house+" is "+price+" dollars");
	    }
}
