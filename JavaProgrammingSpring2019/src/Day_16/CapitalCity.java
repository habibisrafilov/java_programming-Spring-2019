package Day_16;

public class CapitalCity {
public static void main(String[] args) {
	
	String str = "Moscow is a capital city of Rusia";
	// Baku, Azerbaijan 
	// how you can replace Baku with Moscow and Rusia with Azerbaijan 
	
	str = str.replace("Moscow", "Baku");
	str = str.replace("Rusia", "Azerbaijan");
	System.out.println(str);
	
	String email = "israfilovhabib@gmail.com";
	String company = "deloitte";
	
	// lets say you get new email from deloitte 
	
	  email = email.replace("gmail", "deloitte");
	  System.out.println(email);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
