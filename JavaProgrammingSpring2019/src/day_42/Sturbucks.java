package day_42;

public class Sturbucks {
public static void main(String[] args) {
	
	Coffee coff1 = new Coffee();
	
	coff1.name = "ICED CARAMEL MACCHIATO";
	coff1.size = "GRANDE";
	coff1.price = 4.75;
	coff1.calories = 250;
	
	coff1.getCoffeeInfo();
	
	 
	Coffee coff2 = new Coffee();
	coff2.setName("Frappicino");
	coff2.size = "Venti";
	coff2.price = 5.95;
	coff2.calories = 600;
	
	coff2.getCoffeeInfo();
	
	Coffee coff3 = new Coffee();
	
	coff3.setName("Ice coffee");
	coff3.setSize("tall");
	coff3.setPrice(2.45);
	coff3.setCalories(60);
	coff3.getCoffeeInfo();
	
	System.out.println("coff3 name: "+coff3.name);
	System.out.println("coff1 name: "+coff1.name);
	
	Coffee coff4 = new Coffee();
	coff4.setCoffeeInfo("Frappicino Caramel", "TALL", 20.99, 85);
	coff4.getCoffeeInfo();
	
	
	
	
	
	
	
	
	
	
	
	
}

}
