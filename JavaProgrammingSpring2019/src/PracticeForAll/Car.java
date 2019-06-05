package PracticeForAll;

public class Car {
	String type;
	String color;
	String model;
	double price;
	
	public Car(String type, String color, String model, double price) {
		System.out.println("4 args constructor");
		this.type = type;
		this.color = color;
		this.model = model;
		this.price = price;
		
		
	}
	
	
	
	
	

	
	public String toString() {
		return "Car [type=" + type + ", color=" + color + ", model=" + model + ", price=" + price + "]";
	}






	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
