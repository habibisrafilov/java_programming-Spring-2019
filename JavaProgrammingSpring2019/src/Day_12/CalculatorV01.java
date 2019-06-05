package Day_12;

import java.util.Scanner;

public class CalculatorV01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second ");
		int num2 = scan.nextInt();
		
		System.out.println("Operator Character: ");
		String operator = scan.next();
		
		
		int result = 0;
		
		if(operator.equals("+")) {
			result = num1+num2;
		}else if(operator.equals("-")) {
		  result = num1+num2;
		}else if(operator.equals("*")) {
			result = num1*num2;
		}else if(operator.equals("/")) {
			result = num1/num2;
		}else if(operator.equals("%")) {
			result = num1%num2;
		}
		
		System.out.println("Result:" +result);
		
		
		
		
		
		
			
			
			
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
