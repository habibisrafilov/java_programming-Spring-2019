package this_is_for_practises;

public class Computer {
	String model = "i5";
	String amd;
	double screen;
	int price;
	
	public void showMePrice() {
		
		// if model is i3, price 400 dollar , if model is i5 ,price 600, if model i7 price 800 dollar
		if(model.equals("i3")) {
		     price = 400;
		}else if(model.equals("i5")) {
			price = 600;
		}else if(model.equals("i7")) {
			price = 800;
		}else {
			System.out.println("Not that computer at the store ");
		}
	}

}
