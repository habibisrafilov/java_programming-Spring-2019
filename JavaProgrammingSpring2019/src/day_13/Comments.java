package day_13;

public class Comments {
	public static void main(String[] args) {
		
//		Warm up task:
//
//			package day13_ternary_strings_intro
//
//			Class CarSelector
//
//			1) American: Ford, Dodge, Tesla, Chevrolet, Lincoln
//			AveragePrice: 33000
//
//			2) Japanese: Toyota, Mitsubisi, Honda, Subaru, Mazda
//			AveragePrice: 32000
//
//			3) German: Bmw, VW, Audi, Mercedes, Porsche
//			AveragePrice: 55000
//
//			4) Italian: Alfa Romeo, Ferrari, Lamborghini, Fiat
//			AveragePrice: 85000
//
//			5) Korean: Kia, Hyundai, Daewoo
//			AveragePrice: 25000
//			========================================================
//
//			Scanner:
//			Which type of car you are interested in?
//
//			int carType => 1,2,3,4,5
//			double averagePrice
//			String carOptions
//
//			case 1:
//			averagePrice = 33000;
//			carOptions = Ford, Dodge, Tesla, Chevrolet, Lincoln;
//			break;
//			......
//
//			Do not print within cases, just a value assignment:
//
//			After switch statement print result:
//
//			"You selected American car and your options are Ford, Dodge, Tesla, Chevrolet, Lincoln."
//			"Average Price: 33000"
//
//			For invalid selection:
//			"Car type not available"
//
//			TERNARY CONDITIONAL OPERATOR.
//			TERNARY CONDITIONAL STATEMENT.
//			CONDITIONAL OPERATOR.
//
//
//			int max;
//			int num1 = 1000;
//			int num2 = 500;
//
//			if(num1 > num2) {
//			max = num1;
//			}else{
//			max = num2;
//			}
//
//			print max; //500
//
//
//			int max;
//			int num1 = 1000;
//			int num2 = 5000;
//			max = num1 > num2 ? num1 : num2;
		
		
		
		//A program will always execute from top to bottom order in main method unless stated otherwise by programmer
		
		int max;
		int num1 = 100;
		int num2 = 50;
		
		
		if(num1>num2) {
			max=num1;
		}else {
			max=num2;
		}
		
		System.out.println(max);
		
		
		max = num1>num2 ? num1:num2;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
