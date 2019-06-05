package this_is_for_practises;

public class Car extends Vehicle {
	private double price;
	private boolean hasWindsheild;
	private String transmition;
	
	Car() {}

	public Car(String model, int wheels, String engine, int maxSpeed, double fuelCapacity, double price, boolean hasWindsheild) {
		super(model, wheels, engine, maxSpeed, fuelCapacity);
		setPrice(price);
		this.hasWindsheild = hasWindsheild;
	}

	
	public void turn(String direction) {
		System.out.println(getModel() + " turns " + direction);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTransmition() {
		return transmition;
	}
	
	public void setTransmition(String transmition) {
		this.transmition = transmition;
	}
}
