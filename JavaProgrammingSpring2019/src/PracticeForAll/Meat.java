package PracticeForAll;

public class Meat {
	private String animalType;
	private int kilogram;
	private double price;
	
	public Meat() {
		System.out.println("No args constructor");
		this.animalType = "nothing";
		this.kilogram = 0;
		this.price = 0.0;
	}
	
	public Meat(String animalType) {
		System.out.println("one args constructor");
		this.animalType = animalType;
		this.kilogram = 0;
		this.price = 0.0;
	}
	
	
	public Meat(String animalType,int kilogram,double price) {
	  System.out.println("3 args constructor");
	  this.animalType = animalType;
	  this.kilogram = kilogram;
	  this.price = price;
	  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		return "Meat [animalType=" + animalType + ", kilogram=" + kilogram + ", price=" + price + "]";
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public int getKilogram() {
		return kilogram;
	}
	public void setKilogram(int kilogram) {
		this.kilogram = kilogram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	 
}
