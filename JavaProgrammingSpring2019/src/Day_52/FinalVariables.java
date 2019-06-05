package Day_52;

public class FinalVariables {
	
    public final  int ROADSTER_MAX_RANGE;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";
	}
	
	public FinalVariables() {
		ROADSTER_MAX_RANGE =610;
		MODEL_3_MAX_SPEED = 180;
		
	}
	
//	public FinalVariables(int num) {
//		ROADSTER_MAX_RANGE =num;           as long as you enter variable in the constructor that is fine 
//		
//	}
	
	{
		MODEL_X_PASSENGERS = 7;
	}
	
	
	
	public static void main(String[] args) {
		
	
	
	final int MAX_PASSENGERS_COUNT = 5;
	 // MAX_PASSENGERS_COUNT = 10;
	 final double PI = 3.19834623;
	   //  PI = 4.2863258;
	  System.out.println(MAX_PASSENGERS_COUNT);
	 
	  final int SSN;
	  SSN = 321446335;
	 // SSN = 334555884;// The final local variable SSN may already have been assigned
	
	      FinalVariables fv = new FinalVariables();
	      
	      
	System.out.println(fv.ROADSTER_MAX_RANGE);
	System.out.println(fv.MODEL_3_MAX_SPEED);
	System.out.println(fv.MODEL_X_PASSENGERS);
	System.out.println("Company name: "+COMPANY_NAME);
	System.out.println("Company name:"+ADMIN_USERNAME);
	System.out.println("Company name: "+FinalVariables.COMPANY_NAME);
	System.out.println("User name: "+FinalVariables.ADMIN_USERNAME);
	
	
	
	
	
	
	
	
	    } 

}