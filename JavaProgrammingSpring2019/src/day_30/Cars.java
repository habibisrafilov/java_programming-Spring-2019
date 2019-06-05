package day_30;
import java .util.*;
public class Cars {
	public static void main(String[] args) {
		
		add(5,3);
		substract(5,6);
		multibly(2,5);
		devided(4,2);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		double n1=scan.nextDouble();
		double n2=scan.nextDouble();
		System.out.println("Select operator: +,-,/,%,*");
		String operator = scan.next();
		
		
		switch(operator) {
		
		case "+":
			add(n1,n2);
			break;
			
		case "-":
			substract(n1,n2);
			break;
			
		case "*":
			multibly(n1,n2);
			break;
			
		case "/":
			devided(n1,n2);
			break;
			
	       default:
	    	   System.out.println("Invalid operator ");
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		}
	
	public static void add(double num1 , double num2) {
		double result = num1+num2;
		System.out.println("Result: "+result);
		
	}
	
	public static void substract(double num1,double num2) {
		double  result = num1*num2;
		System.out.println(result);
	}
	
	
	public static void multibly (double num1 , double num2) {
		double result = num1-num2;
		System.out.println(result );
	}
	
	
	public static void devided(double num1, double num2) {
		double result = num1/num2;
		System.out.println(result );
	}
	
	
	
	
	
	
}
