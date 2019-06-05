package day_32;

public class MetodsReturn {
	public static void main(String[] args) {
	
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println(i);
		
		String word = giveMeYourName();
		System.out.println(word);
		System.out.println(giveMeYourName());
		
		
	
	}
	
	public static int giveMe10$() {
		System.out.println("returning 10 from metod ");
		return 10;
	}
	
	public static  String giveMeYourName () {
		String name = "Habib";
		return name;
	}
}
		
		
		
		
		