package Day_41;

public class Microwave {
	String brand;
	boolean isOn;
	
	
	public void turnOn() {
		if(isOn==true) {
			System.out.println(brand+" microwave is already ON");
		}else {
			System.out.println("Turning on "+brand+" microwave.");
			isOn = true;
		}
	}
	   public void turnOff() {
		   if(isOn==false) {
			   System.out.println(brand+" microwave is already OFF.");
		   }else {
			   System.out.println("Turning off "+brand+" microwave");
			   isOn = false;
		   }
	   }
	   public void heat(String food) {
		if(isOn) {
			System.out.println("Heating : "+food);
		}else {
			System.out.println("Microwave is Off.I can not heat "+food);
		}
		
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
