package day_11;

public class Coments {
	
	
		public static void main(String[] args) {		
//			
//			Laptop liquid: 
//				- turn off
//				- turn upside down
//				- wipe off liquid
//				- wait
//				=======================
//
//				OPERATORS:
//				LOGICAL OPERATORS:
//				- && - and
//				- || - or
//				- ! - not
//
//				TRUTH Table for logical operators
//				=======================================
//				package day11_logical_nestedif
//
//				Create a class TruthTables
//
//				int age = 40;
//
//				if(age >= 3 && age <= 5) {
//
//
//				age = 3;
//				if(age == 3 && age == 4 )
//
//				===============
//				Create a class LogInTests
//
//				Using scanner ask for 
//				String username
//				String password
//
//				String validUsername = "cybertek@mail.com"
//				String validPassword = "WoodenSpoon123"
//
//				CONDITIONS:
//				1) username = validUsername
//				password = password
//				print "Login Successful, Welcome!"
//
//				2) username != validUsername
//				password != password
//				print "Invalid Username and Invalid Password"
//
//				3) username == validUsername
//				password != password
//				print "Invalid Password"
//
//				4) username != validUsername
//				password == password
//				print "Invalid Username"
//
//				username is not case sensitive
//				password is case sensitive
//
//				 
//
//				String str1 = "abc";
//				String str2 = "ABC";
//
//				str1.equals(str2) => false, because equals checks for uppercase lowercase differences too.
//
//
//				str1.equalsIgnoreCase(str2) => true. this will ignore case differences.
//				===========================================
//
//				PRESEDENCE OF LOGICAL OPERATORS:
//
//				&& with || in same condition,
//				&& will be evaluated first
//				|| will be evaluated after that.
//				FALSE || TRUE
//				boolean b5 = false || true && 10==10;
//				System.out.println("B5: " + b5);
//
//				=========================================
//
//				& vs &&
//				| vs ||
//
//				&&, || => short circuit logical operators
//
//				10 < 5 && 5 == 5; => false: 
//				in this example, since first condition is false, there is no need to check the second condition.
//				When we use && (double), it will not check second condition.
//
//				10 < 5 & 5 == 5; In this example, java will test both conditions, since we are using single &.
//
//				500 == 500 && 400 < 200; => false.
//				500 == 500 & 400 < 200; => false
//				in this example java will test both conditons, because when first condition returns true, it must check the second condition to find out end result.
//
//				500 >= 5000 && 400 < 200;
//				First condition is false and java will ignore testing the second condition.
//
//				500 >= 5000 & 400 < 200; both are tested
//
//				false true
//				method1() & method2()
//				=======================================
//
//				40 > 5 || 8 < 3; => true. Only first condition is tested. Since java already knows when using || operator, either one of conditons is true, end result will be true.
//
//
//				40 > 50 || 8 > 3 => true. both conditions will be tested. As we do not know end result until we check second condition too.
//
//				400 > 50 | 8 > 3 => it will test both conditions since we are using | (single) pipe.
//				=====================
//
//				500 > 1400 && 5 > 3 || 3 == 3 =>
//
//				 
//
//				500 < 1400 && 5 > 3 || 3 == 3 => 
//				========================
//
//				&, | always checks all conditions.
//
//				&&, || checks first condition and if it is enough to know end result it will not test second condition.
//
//				false && true => when using && if first condition is false, second one will not be tested.
//
//
//				true && true => it will test both sides, since first true does not mean end result is true.
//
//
//				true || false => only first condition is checked and it is true, java will skip second one.
//
//				false || true => will test both, since if first condition is false , it needs to goto second one for end result.
//				==============================
//
//				Create a class TollCalculator
//
//				carType : 1,2
//				isRushHour : true or false
//
//				IN this example, we will use logical operator.
//
//				AND NESTED IF STATEMENTS
//
//				if(condition1) {
//				if(condition2) {
//				//CODE A
//				}else{
//				//CODE B
//				}
//				} else {
//				//CODE C
//				}
//
//				1) condition1 = true
//				condition2 = true
//				CODE A
//				2) condition1 = false
//				condition2 = true
//				CODE C
//
//				2) condition1 = true
//				condition2 = false
//				CODE B
//				=================
//
//				if(condition1) {
//				if(condition2) {
//				//CODE A
//				}else{
//				//CODE B
//				}
//				} else {
//				if(condition3) {
//				//CODE C
//				}else{
//				//CODE D
//				}
//				}
//
//				1) condition1 = true
//				condition2 = true
//				condition3 = true
//				CODE A
//				2) condition1 = true
//				condition2 = false
//				condition3 = false
//				CODE B
//				3) condition1 = false
//				condition2 = true
//				condition3 = true
//				CODE C
//				4) condition1 = false
//				condition2 = true
//				condition3 = false
//				CODE D
//				===================
//
//
//				OUTER IF STATEMENT, AND INNER/NESTED IF STATEMENT.
//
//				 
//
//				 
//
//				 
//
//				 
//
//				==============================
//				if(condition1) {
//				//CODE A
//				if(condition2) {
//				//CODE B
//				}else{
//				//CODE C
//				}
//				} else {
//				//CODE D
//				if(condition3) {
//				//CODE E
//				}else{
//				//CODE F
//				}
//				}
//
//				 
//
//
//				"yes"
//				String answer = keyboard.next();//yes or no
//
//				//check if answer string is "yes" => assign true to isRushHour
//				// if it is "no" , assign false to isRushHour
//
//				boolean isRushHour;
//				if(answer.equalsIgnoreCase("yes")) {
//				isRushHour = true;
//				}else {
//				isRushHour = false;
//				}
//
//				================
//
//				if(condition1) {
//				if(condition2) {
//				//CODE A
//				}else{
//				//CODE B
//				}
//				} else if(condition3) {
//				if(condition4) {
//				//CODE C
//				}else{
//				//CODE D
//				}
//				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
