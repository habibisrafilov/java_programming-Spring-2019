package day_33;

public class Calculator {
	public static void main(String[] args) {
		addValue(5,10);
		int result = add(30,10);
		System.out.println(result);
		System.out.println(add(2,12));
		 double result1 = multiply(3.2,6.4);
		 System.out.println(result1);
		 int result2 = minus(20,5);
		 System.out.println(result2);
		 int result3 =devided(32,8);
		 System.out.println(result3);
		
	}

	   public static void addValue(int num1,int num2) {
		   int result =num1+num2;
		   System.out.println(result);
	   }
	   
	   public static int add(int num1 ,int  num2) {
		   int result = num1+num2;
		   return result;
	   }
	   
	   
	   public static double  multiply(double num1,double num2) {
		   double result =num1*num2;
		  return result;
	   }
	   
	   
	   public static double minus(double a,double b) {
		   double result2 = a-b;
		   return result2;
	   }
	   
	   public static int devided(int num1 , int num2) {
		   int result3 = num1/num2;
		  
		return result3;
	   }
	   
	   
	    
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
