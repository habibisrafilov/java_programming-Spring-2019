package day_33;

public class PayCalculator {
	public static void main(String[] args) {
		
		int result= getHourlyPay(10,-2);
		System.out.println(result);
	
		  double  netice = doubleNumber(-4,7.25);
		  System.out.println(netice);
		  int netice3 = deGelsin(2,5000);
		  System.out.println(netice3);
		
	}

	
	  public static int getHourlyPay(int hours , int rate) {
		  if(hours<0) {
			  System.out.println("negative");
			  return 0 ;
		  }
		  
		  if(rate<0) {
			  System.out.println("invalid");
			  return 0 ;
		  }
		  int totalPay = hours*rate;
		  return totalPay;
	  }
	  
	  
	  public static double doubleNumber(double saat , double mebleg) {
		  if(saat<-2) {
			  System.out.println("yalnis qerar");
		  }else {
			  System.out.println("dogru qerar");
		  }
		  double umumiMebleg = saat*mebleg;
		  return umumiMebleg;
	  }
	  
	    public static int deGelsin(int kubok , int pul) {
	    	int sonuc = kubok*pul;
	    	return sonuc;
	    }
}
