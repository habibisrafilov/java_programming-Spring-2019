package this_is_for_practises;

public class Vehicle {

	private String model;
	private int wheels;
	private String engine;
	private int currentSpeed;
	private int maxSpeed;
	private double fuelCapacity;
	
	Vehicle(){}
	
	
	
	public Vehicle(String model, int wheels, String engine, int maxSpeed, double fuelCapacity) {
		this.model = model;
		this.wheels = wheels;
		this.engine = engine;
		this.maxSpeed = maxSpeed;
		this.fuelCapacity = fuelCapacity;
	}



	public void drive(int hours) {
		System.out.println(model+" drives for "+ hours + " hours");
	}

	public void printModel(String color) {
		System.out.println(model + " is " + color + " color");
	}

	public void printSeat(int seats) {
		System.out.println(model + " has " + seats + " seats");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	
}
