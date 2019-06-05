package Day_41;

public class Car2 {
	public static void main(String[] args) {
	
		Car car1 = new Car();
		
		car1.make = "Toyota";
		car1.model = "Corolla";
		car1.color = "White";
		car1.currentSpeed = 50;
		car1.model = "Camery";
		
		car1.drive();
		
		car1.printCarInfo();
		car1.showCurrentSpeed(30);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Car car2 = new Car();
		
		car2.make = "Cadillac";
		car2.model = "any";
		car2.color = "Black";
		car2.currentSpeed = 55;
		
		car2.printCarInfo();
		car2.showCurrentSpeed(90);
		car2.accelerate(10);
		
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		
		bmw.model = "m3";
		bmw.showPrice();
		
		bmw.model = "330i";
		bmw.showPrice();
		System.out.println("Car Price: "+bmw.price);
		
		BMW bmw2=new BMW();
		bmw2.model = "X3";
		bmw2.showPrice();
		
		
		
		
		
		
		
		
		
	}

	
	
}
