package Day_50;

public class Contractor extends Employee {

	    @Override
	   public void calculatePay(int hours , double rate) {
		   double total = hours*rate+200;
		   System.out.println("Contractor total pay "+total);
	   }
}

