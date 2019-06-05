package day_31;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		add(5,15);
		subtract(15,5);
		multiply(5,15);
		divide(15,5);
		remainder(16,5);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 nums");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation : '+' ,'-','*','/','%'");
		String operator  = scan.next();
		
		
		switch (operator) {
		case "+":
			add(n1, n2);
			break;
		case "-":
			subtract(n1,n2);
			break;
			
		case "*":
			multiply(n1,n2);
			break;
		
		case "/":
			divide(n1,n2);
			break;
			
		case "%" :
			remainder(n1,n2);
		}
		
	}
	
	public static void  add(double num1 , double num2) {
		double result1 = num1+num2;
		System.out.println(result1);
	}

	    public static void subtract (double n1,double n2) {
	    	double result2 = n1-n2;
	    	System.out.println(result2);
	    }
	    
	    public static void multiply(double n1 , double n2) {
	    	double result3 = n1*n2;
	    	System.out.println(result3);
	    }
	    
	    public static void divide(double n1 , double n2) {
	    	double result4 = n1/n2;
	    	System.out.println(result4);
	    }
	    
	    public static void remainder (double num1, double num2) {
	    	double result5 = num1%num2;
	    	System.out.println(result5);
	    }
	    
	    
	    
	    
	    
	    
}
