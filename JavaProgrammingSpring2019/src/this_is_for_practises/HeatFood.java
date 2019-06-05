package this_is_for_practises;

public class HeatFood {
	String brand;
	boolean isOn;
	
	 public void turnOn() {
		 if(isOn) {
			 System.out.println(brand+" is working and ready to heat food.");
		 }else {
			 System.out.println(brand+" is off for now . ");
		 }
	 }
	 public void turnOff() {
		 if(isOn) {
			 System.out.println(brand+" is not ON for now. ");
		 }else {
			 System.out.println("It is ready to heat food again.");
		 }
	 }
	 public void heat(String food) {
		 if(isOn) {
			 System.out.println(brand+" is gonna heat the "+food);
		 }
		 
	 }

}
