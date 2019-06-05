package day_11;
import java.util.Scanner;
public class LogInTests {
	public static void main(String[] args) {
		
//		Create a class LogInTests
//
//		Using scanner ask for 
//		String username
//		String password

//		String validUsername = "cybertek@mail.com"
//		String validPassword = "WoodenSpoon123"
//
//		CONDITIONS:
//		1) username = validUsername
//		password = password
//		print "Login Successful, Welcome!"
//
//		2) username != validUsername
//		password != password
//		print "Invalid Username and Invalid Password"
//
//		3) username == validUsername
//		password != password
//		print "Invalid Password"
//
//		4) username != validUsername
//		password == password
//		print "Invalid Username"
//
//		username is not case sensitive
//		password is case sensitive
//	
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter username :");
	  String username = scan.next();
	  System.out.println("Enter password: ");
	
	  String password = scan.next();
	  
	  String validUsername = "cybertek@mail.com";
      String validPassword = "WoodenSpoon123";
	  
	  if(username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
		  System.out.println("Login Scuccessful ! , Welcome");
		  
	  }else if(!username.equalsIgnoreCase(validUsername) && !password.equalsIgnoreCase(validPassword)) {
		  System.out.println("Invalid username and Invalid password");
	  }else if(username.equalsIgnoreCase(validUsername) && !password.equalsIgnoreCase(validPassword)) {
		  System.out.println("Invalid Password");
	  }else if(!username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
		  System.out.println("Invalid username");
	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	         
	         
	         
	}
	
	
	
	
}
