package Day_49;

public class Leopard extends Animal {
	
	
	public Leopard() {
		super(); // call parent class no -args constructor
		System.out.println("Leopard Constructor");
		setType("Leopard");
		
		
	}
	
	
	public Leopard(String type) {
		super(type); //  call Animal (String type) construcotr
		System.out.println("Leopard one arg constructor");
	}
	
	
}
