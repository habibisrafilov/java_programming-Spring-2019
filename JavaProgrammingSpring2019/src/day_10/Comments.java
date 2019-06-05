package day_10;

public class Comments {
	public static void main(String[] args) {
		
//		Recap:
//			- multi way if statements
//
//			if(condition1) { //true
//			//code
//			}
//
//			if(condition2) {
//			//code
//			}
//
//			if(condition3) {
//			//code
//			}
//
//			=================
//
//			if(condition1) { //true
//			//code
//			} else if(condition2) {//will not test
//			//code
//			} else if(condition3) { //will not test
//			//code
//			}
//
//			if(condition1) { //false
//			//code
//			} else if(condition2) {//true
//			//code
//			} else if(condition3) { //will not check
//			//code
//			}
//
//
//			if(condition1) { //false
//			//code A
//			} else if(condition2) {//false
//			//code B
//			} else if(condition3) { //true
//			//code C
//			}
//
//			if(condition1) { //true
//			//code A
//			} else if(condition2) {//true but will not be tested
//			//code B
//			} else if(condition3) { //false-will not be tested
//			//code C
//			}
//
//			if(condition1) { //false
//			//code A
//			} else if(condition2) {//false 
//			//code B
//			} else if(condition3) { //false
//			//code C
//			}
//
//			nothing will execute in above scenario.
//
//			if(condition1) { //false
//			//code A
//			} else if(condition2) {//false 
//			//code B
//			} else if(condition3) { //false
//			//code C
//			} else{
//			//code D => when all conditions are false
//			}
//
//			Code D will run, since all conditions are false.
//
//			PACKAGE: day10_logicaloperators_conditionals
//			=====================================
//
//			LOGICAL OPERATORS:
//
//			3 OF THEM:
//			1) AND (&&) (ampersand)
//			2) OR (||) (pipe)
//			3) NOT (!) (Exclamation mark)
//
//
//			AND ( && ) operator:
//			is used with 2 conditions and returns/gives true ONLY
//			when both conditions are TRUE.
//
//			computer is MacBook
//			&&
//			phone is iPhone
//
//
//			CONDITION1 && CONDITION2
//
//			true and true ==> true
//
//			true and false ==> false
//
//			false and true ==> false
//
//			false and false ==> false
//
//			Onsale and FreeShipping
//			true and false =>> NO - false
//
//
//			2) OR (||) returns/gives TRUE when ANY of conditions is true.
//			raise your hand if your laptop is APPLE OR your car is AMERICAN
//
//			CONDITION1 || CONDITION2
//			true OR true ==> true
//			false OR true ==> true
//			true OR false ==> true
//			false OR false ==> false
//			================
//
//
//			3) NOT (!) OPERATOR:
//			REVERSES THE BOOLEAN VALUE.
//			If condition is false , it will return true
//			if condition is true, it will return false
//
//			true ==> false
//			false ==> true
//
//			--------------------
//			!= is not equal => comparison operator
//			int a = 10;
//			int b = 12;
//
//			a != b ==> true
//			--------------------
//
//			int hourlyRate = 50;
//
//			if(!hourlyRate > 40) {
//			System.out.println("too low");
//			}else{
//			System.out.println("rate is good");
//			}
//
//			boolean isNiceWeather = false;
//
//			if(!isNiceWeather){ 
//			System.out.println("Dont go out for runnning");
//			}else{
//			System.out.println("Lets go out for runnning");
//			}
//
//
//			if(isNiceWeather){ 
//			System.out.println("Lets go out for runnning");
//			}else{
//			System.out.println("Dont go out for runnning");
//			}
//
//			==========================
//
//			lets say you have a collection of people.
//
//
//			boolean found = false;
//
//			CODE{
//			Go to each page and look for that name:
//			if it finds the name
//			set found to true
//			}
//
//			if(!found) {
//			System.out.println("ERROR: The person not found");
//			}
//
//
//			double price = 100.0;
//
//			boolean b = price > 200.0;//false
//
//			boolean b2 = !(price > 200.0); //true
//
//			======================================
		
		
		
		int hourlyRate = 50;
		if(hourlyRate>40) {
			System.out.println("nice weather");
		}else {
			System.out.println("weather is bad");
		}
		
		
		boolean isNiceWeather = true;
		
		if(!isNiceWeather) {
			System.out.println("weather is nice");
		}else {
			System.out.println("weather is bad");
		}
		
		 
		
		
		
		
		
		
		
		
		
		
	}

}
