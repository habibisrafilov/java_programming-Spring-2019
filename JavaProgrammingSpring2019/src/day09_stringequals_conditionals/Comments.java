package day09_stringequals_conditionals;

import java.util.function.Function;

public class Comments {
	public static void main(String[] args) {
		

//STRING EQUALITY.
//
//How to test if 2 strings are equal.
//
//== operator.
//
//When testing strings if they are equal, 
//depending on how String was created
//there are 2 different ways to test.
//
//1) == operator. Not advised.
//
//String str1 = "hello";
//String str2 = "hello";
//
//System.out.println(str1 == str2); //true
//
//2) using equals() method/function. Preferred!!
//
//String str1 = "hello";
//String str2 = "hello";
//System.out.println(str1.equals(str2));//true
//===============
//
//2 WAYS TO CREATE STRINGS.
//
//1) The way we have been using,
//just assigning the value in double quotes
//
//String today = "Tuesday";
//
//2) Using new keyword:
//
//String today = new String("Java");
//String str = new String("Hello");
//
//=====>
//
//String month = new String("March");
//String month2 = new String("March");
//
//System.out.println(month == month2);
//
//In the above line, Java is not doing values comparison.
//It is just checking if month and month2 are pointing to same location in memory.
//
//System.out.println(month.equals(month2));
//System.out.println(month.equals("March"));
//
//In the above examples, by using equals method,
//java is checking if values are same.
//Which is proper way of comparing strings.
//==========================================
//
//Create a class Canada
//Ask user "What is the capital of Canada?"
//using scanner assign the value to capital variable.
//
//Ottawa
//
//Check if the answer is correct.
//=> Your answer is correct!
//false
//=> Your answer is incorrect! value is not capital of Canada
//
// 
//
// 
//
// 
//
// 
//
//
//capital.equalsIgnoreCase("Ottawa")
//
//equalsIgnoreCase method of String, will not worry about uppercase or lowercase differences when checking for equality.
//
//String str = "java";
//
//str.equalsIgnoreCase("JAVA") => true
//str.equals("JAVA") => false
//=======================
//
//== => usage example.
//
//== with objects (String) always checks for memory location.
//Not values.
//
//== to check if 2 independent objects are come from same instatiation.
//====================================
//
//IF ELSE STATEMENT.
//
//if(condition) {
//
//}else{
//
//}
//===============
//
//SKIP CURLY BRACES USING IF ELSE.
//
//if(condition)
////DO THIS SINGLE STEP;
//else
////DO THIS SINGLE STEP;
//
//I advice everyone to use Curly braces ALL THE TIME.
//
//it will make your code easier to read/maintain, debug etc.
//================================
//
//
//MUTLI-BRANCH/WAY IF STATEMENTS:
//
//When you have conditions that are related, we can merge them together into MULTI-BRANCH if statement.
//
//if(condition1) {
////steps
//}else if(condition2) {
////steps
//}else if(condition3) {
////steps
//}else if(condition4) {
////steps
//}else{
////steps to do when all condition were false
//}
//
//SUMMARY:
//
//- strategy how to solve problems
//- comparing Strings
//- code practice
//- Muti-Way Branch if statements intro
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
