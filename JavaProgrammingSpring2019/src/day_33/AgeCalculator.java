package day_33;

public class AgeCalculator {
	public static void main(String[] args) {
		
		int result  = calculateAge(2019,1957);
		System.out.println(result);
		
		int result1  = calculateAge(2019,1961);
		System.out.println(result1);
		
		int result2  = calculateAge(2019,2015);
	    	 System.out.println(result2);
	     }
	
	public static int calculateAge(int currentYear, int bornYear) {
		int age = 0;
		if(age>=1 && age<=14) {
			System.out.println("child");
		}else if(age>=15 && age<=25) {
			System.out.println("youngster");
		}else if(age>=26 && age<=64) {
			System.out.println("adult");
		}else {
			System.out.println("seniour");
		}
		
		 int currentAge = currentYear-bornYear;
		 return currentAge;
	}
	
}
