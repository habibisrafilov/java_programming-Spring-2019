package day_43;

public class TeslaDealer {
	public static void main(String[] args) {
		
		
		
		
		Tesla tesla = new Tesla();
		tesla.setModel("Model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51.50);
		tesla.setSelfDriving(true);
		
		System.out.println(tesla.getPrice());
		System.out.println(tesla.getModel());
		System.out.println(tesla.getRange());
		System.out.println(tesla.getSelfDriving());
		
		System.out.println(tesla);
		
		System.out.println(tesla.isValidModel("model 3"));
		
		Tesla myTesla = new Tesla();
		
		
		myTesla.setTeslaInfo("roadster", 620, 1.9, 250000, true);
		
		System.out.println(myTesla.toString());
		
		// which is faster ? tesla or myTesla?
		
		 if(tesla.getZeroTo60()>myTesla.getZeroTo60()) {
			 System.out.println("fasler model : "+myTesla.getModel());
		 }else {
			 System.out.println("Faster model: "+tesla.getModel());
		 }
		
		
		buy(myTesla);
		buy(tesla);
		testDrive("Model S");
		testDrive("roadster");
	
	}
	
	public static Tesla testDrive(String model) {
	    System.out.println("Hi,I would like to test drive "+model);
	    System.out.println("Sure");
	    
	    Tesla car = new Tesla();
	    car.setTeslaInfo(model, 310, 2.5, 95000, false);
	    return car;
	    
	}
	
	public static void buy(Tesla car) {
		System.out.println("Purchasing: "+car.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
