package Day_50;

public class App {
	
	private String name;
	private double price;
	private String model;
	
	public static int count;
	
	public static void build(String language) {
		System.out.println("Building an app using "+language);
	}
	
	public App() {
		
	}
	
	public App(String name) {
		System.out.println("one args Constructor");
		this.name =name;	
	}
	
	public App(String name,double price,String model) {
		this.name = name;
		this.price = price;
		this.model = model;
		
		
	}
	
	
	
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		App.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
