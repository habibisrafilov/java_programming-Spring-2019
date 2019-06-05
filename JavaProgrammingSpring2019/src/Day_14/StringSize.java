package Day_14;

public class StringSize {
	public static void main(String[] args) {
		
		String str1 = "Good morning";
		
		//  1) check if it matches "Good Morning" and print match or not match
		
		// 2) Convert to All uppercase and print
		
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
	
	
	if(str1.equalsIgnoreCase("good morning")) {
		System.out.println("match again");
	}else {
		System.out.println("does not match again ");
	}
	
	// Convert to All uppercase and print
	
   System.out.println(str1.toUpperCase());
   System.out.println(str1);// Good Morning  ==>  it stays as old value . 
	
	
	// combine the above methods together : 
   //  convert to all lowercase first then check if it equals("good morning")
   
     if(str1.toLowerCase().equals("good morning")) {
    	 System.out.println("match");
     }else {
    	 System.out.println("not match");
     }
	
	// find out how many characters in the String
     
      String myName = "Habib";
      System.out.println(myName.length());
	
      int length = myName.length();
      System.out.println("My name's length: "+length);
	
      
      //  usernames must be excatly 8 caracters.
      //  set some value and using a if statement check it is 
      // 8 characters :  if true  == > valid usernme, if false ==> invalid ussername 
      
  
	
      String userName = "password";
      if(userName.length()==8) {
    	 System.out.println("Valid username");
      }else {
    	  System.out.println("Invalid username");
      }
    		  
    		 
      // password must be at least 6 characters
    		  
      String password = "woodenSpoon";
      
      // 1)
      if(password.length()>=6) {
    	  System.out.println("Valid password");
      }else {
    	  System.out.println("Invalid password");
      }
      
      int passwordLength = password.length();
      System.out.println(passwordLength);
      
      if(passwordLength<6) {
    	  System.out.println("Invalid password");
      }else {
    	  System.out.println("valid password");
      }
      
      
      
      
      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
}
