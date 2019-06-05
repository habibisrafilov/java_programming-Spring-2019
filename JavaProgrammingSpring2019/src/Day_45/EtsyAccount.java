package Day_45;

import java.util.Random;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;
	
	
	
	
	// constructor 1.no args . sets all as empty string
	public EtsyAccount() {
		System.out.println("No args constructor");
		this.email = email;
		this.firstName = firstName;
		this.password = password;
	
	}
	
	// constructor 2.
	// takes 3 args and sets them to instance variables
	// using setters
	
	public EtsyAccount(String email,String firstName,String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		// if it contains @ somewhere in the middle and assign it
		// if not print "Please enter valid email adress."
		if(email.indexOf("@")>0 && email.indexOf("@") <email.length()-1) {
			this.email = email;	
		}else {
			System.out.println("Please enter valid e mail adress");
		}
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		// can not be blank
		// needs to be only Alphabetic/ letters
		
		this.firstName = firstName;
	}
	private boolean isValidFirstName(String firstName) {
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
