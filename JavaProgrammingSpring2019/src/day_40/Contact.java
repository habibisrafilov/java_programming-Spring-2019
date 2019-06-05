package day_40;


public class Contact {
	// class Contact
//	instance variable: Name 
//	                   phoneNumber
//	                   email
//	                  
//	behaviour | instance methods :
//		call
//		sendMessage
//		sendMail
//		
	    
	String name;
	String phoneNumber;
	String email;
	
public void call() {
	System.out.println("Calling "+name+"....");
}
	
	public void sendMessage() {
		System.out.println("Sending message to "+phoneNumber+" who is  "+name);
	}
	
	public void sendEmail() {
		System.out.println("Sending email to "+email+"....");
	}
	     
	       
	
}


